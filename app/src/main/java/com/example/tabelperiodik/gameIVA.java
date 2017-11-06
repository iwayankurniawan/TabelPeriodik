package com.example.tabelperiodik;

import android.content.ClipData;
import android.content.Intent;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class gameIVA extends Activity {

    private questionArray getQuestionLibrary = new questionArray();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_iv);

        findViewById(getQuestionLibrary.getChoices(0,0)).setOnTouchListener(new gameIVA.MyTouchListener());
        findViewById(getQuestionLibrary.getChoices(1,0)).setOnTouchListener(new gameIVA.MyTouchListener());
        findViewById(getQuestionLibrary.getChoices(2,0)).setOnTouchListener(new gameIVA.MyTouchListener());
        findViewById(getQuestionLibrary.getChoices(3,0)).setOnTouchListener(new gameIVA.MyTouchListener());
        findViewById(getQuestionLibrary.getChoices(4,0)).setOnTouchListener(new gameIVA.MyTouchListener());

        findViewById(getQuestionLibrary.getChoices(0,1)).setOnDragListener(new gameIVA.MyDragListener());
        findViewById(getQuestionLibrary.getChoices(1,1)).setOnDragListener(new gameIVA.MyDragListener());
        findViewById(getQuestionLibrary.getChoices(2,1)).setOnDragListener(new gameIVA.MyDragListener());
        findViewById(getQuestionLibrary.getChoices(3,1)).setOnDragListener(new gameIVA.MyDragListener());
        findViewById(getQuestionLibrary.getChoices(4,1)).setOnDragListener(new gameIVA.MyDragListener());
        findViewById(R.id.position_all).setOnDragListener(new gameIVA.MyDragListener());

        Button GoToIA = findViewById(R.id.IA);
        GoToIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(gameIVA.this, game.class);
                startActivity(intent);
            }
        });

        Button GoToIIA = findViewById(R.id.IIA);
        GoToIIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(gameIVA.this, gameIIA.class);
                startActivity(intent);
            }
        });

        Button GoToIIIA = findViewById(R.id.IIIA);
        GoToIIIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(gameIVA.this, gameIIIA.class);
                startActivity(intent);
            }
        });

        Button GoToIVA = findViewById(R.id.IVA);
        GoToIVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(gameIVA.this, gameIVA.class);
                startActivity(intent);
            }
        });

        Button GoToVA = findViewById(R.id.VA);
        GoToVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(gameIVA.this, gameVA.class);
                startActivity(intent);
            }
        });

        Button GoToVIA = findViewById(R.id.VIA);
        GoToVIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(gameIVA.this, gameVIA.class);
                startActivity(intent);
            }
        });

        Button GoToVIIA = findViewById(R.id.VIIA);
        GoToVIIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(gameIVA.this, gameVIIA.class);
                startActivity(intent);
            }
        });

        Button GoToVIIIA = findViewById(R.id.VIIIA);
        GoToVIIIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(gameIVA.this, gameVIIIA.class);
                startActivity(intent);
            }
        });

    }


    private final class MyTouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent){

            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN){

                ClipData data = ClipData.newPlainText("","");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.INVISIBLE);
                return true;
            }else {
                return false;
            }
        }
    }

    class MyDragListener implements View.OnDragListener {
        Drawable enterShape = getResources().getDrawable(R.drawable.shape_droptarget);
        Drawable normalShape = getResources().getDrawable(R.drawable.shape);

        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    // do nothing
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    v.setBackgroundDrawable(enterShape);
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    v.setBackgroundDrawable(normalShape);
                    break;
                case DragEvent.ACTION_DROP:
                    // Dropped, reassign View to ViewGroup

                    View view = (View) event.getLocalState();

                    if(view.getId()==getQuestionLibrary.getChoices(0,0) && v.getId()==getQuestionLibrary.getChoices(0,1))
                    {
                        ViewGroup owner = (ViewGroup) view.getParent();
                        owner.removeView(view);
                        LinearLayout container = (LinearLayout) v;
                        container.addView(view);
                        view.setVisibility(View.VISIBLE);
                        //return true;
                    }
                    else if(view.getId()==getQuestionLibrary.getChoices(1,0) && v.getId()==getQuestionLibrary.getChoices(1,1))
                    {
                        ViewGroup owner = (ViewGroup) view.getParent();
                        owner.removeView(view);
                        LinearLayout container = (LinearLayout) v;
                        container.addView(view);
                        view.setVisibility(View.VISIBLE);
                        //return true;
                    }
                    else if(view.getId()==getQuestionLibrary.getChoices(2,0) && v.getId()==getQuestionLibrary.getChoices(2,1))
                    {
                        ViewGroup owner = (ViewGroup) view.getParent();
                        owner.removeView(view);
                        LinearLayout container = (LinearLayout) v;
                        container.addView(view);
                        view.setVisibility(View.VISIBLE);
                        //return true;
                    }
                    else if(view.getId()==getQuestionLibrary.getChoices(3,0) && v.getId()==getQuestionLibrary.getChoices(3,1))
                    {
                        ViewGroup owner = (ViewGroup) view.getParent();
                        owner.removeView(view);
                        LinearLayout container = (LinearLayout) v;
                        container.addView(view);
                        view.setVisibility(View.VISIBLE);
                        //return true;
                    }
                    else if(view.getId()==getQuestionLibrary.getChoices(4,0) && v.getId()==getQuestionLibrary.getChoices(4,1))
                    {
                        ViewGroup owner = (ViewGroup) view.getParent();
                        owner.removeView(view);
                        LinearLayout container = (LinearLayout) v;
                        container.addView(view);
                        view.setVisibility(View.VISIBLE);
                        //return true;
                    }

                    else {
                        ViewGroup owner = (ViewGroup) view.getParent();
                        owner.removeView(view);

                        RelativeLayout container = findViewById(R.id.position_all);
                        container.addView(view);
                        view.setVisibility(View.VISIBLE);
                        //return false;
                    }

                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    v.setBackgroundDrawable(normalShape);
                default:
                    break;
            }
            return true;
        }
    }
}

