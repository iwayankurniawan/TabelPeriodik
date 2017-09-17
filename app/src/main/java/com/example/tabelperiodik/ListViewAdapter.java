package com.example.tabelperiodik;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by acer on 09/09/2017.
 */
public class ListViewAdapter extends BaseAdapter {

    // Declare Variables
    Context mContext;
    LayoutInflater inflater;
    private List<DaftarNamaUnsur> DaftarNamaUnsurList = null;
    private ArrayList<DaftarNamaUnsur> arraylist;

    public ListViewAdapter(Context context, List<DaftarNamaUnsur> DaftarNamaUnsurList) {
        mContext = context;
        this.DaftarNamaUnsurList = DaftarNamaUnsurList;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<DaftarNamaUnsur>();
        this.arraylist.addAll(DaftarNamaUnsurList);
    }

    public class ViewHolder {
        ImageView GambarUnsur;
        TextView NamaUnsur;
    }

    @Override
    public int getCount() {
        return DaftarNamaUnsurList.size();
    }

    @Override
    public DaftarNamaUnsur getItem(int position) {
        return DaftarNamaUnsurList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.listview_item, null);
            // Locate the TextViews in listview_item.xml
            holder.GambarUnsur = view.findViewById(R.id.imageView);
            holder.NamaUnsur = view.findViewById(R.id.NamaUnsurDitampilkan);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews
        holder.GambarUnsur.setImageResource(DaftarNamaUnsurList.get(position).getGambarUnsur());
        holder.NamaUnsur.setText(DaftarNamaUnsurList.get(position).getNamaUnsur());

        // Listen for ListView Item Click
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Send single item click data to SingleItemView Class
                Intent intent = new Intent(mContext, SingleItemView.class);
                // Pass all data rank
                intent.putExtra("GambarUnsur",(DaftarNamaUnsurList.get(position).getGambarUnsur()));
                // Pass all data country
                intent.putExtra("NamaUnsur",(DaftarNamaUnsurList.get(position).getNamaUnsur()));
                // Pass all data flag
                // Start SingleItemView Class
                mContext.startActivity(intent);
            }
        });

        return view;
    }

    // Filter Class
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        DaftarNamaUnsurList.clear();
        if (charText.length() == 0) {
            DaftarNamaUnsurList.addAll(arraylist);
        }
        else
        {
            for (DaftarNamaUnsur wp : arraylist)
            {
                if (wp.getNamaUnsur().toLowerCase(Locale.getDefault()).contains(charText))
                {
                    DaftarNamaUnsurList.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }

    //clean filter checkboxes
    public void clearfiltercheckbox(){
        DaftarNamaUnsurList.clear();
    }

}