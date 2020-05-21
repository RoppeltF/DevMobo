package com.example.colors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;
    private LinearLayout tela;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = findViewById(R.id.tvText);

        tela = findViewById(R.id.tela);

        tela.setOnTouchListener( new OnSwipeTouchListener(this){

            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
                tvText.setText( "VERMELHO" );
                tela.setBackgroundColor(Color.rgb(0xff,0x00,0x00));
            }

            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                tvText.setText( "AZUL" );
                tela.setBackgroundColor(Color.rgb(0x00,0x00,0xff));
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                tvText.setText( "VERDE" );
                tela.setBackgroundColor(Color.rgb(0x00,0xff,0x00));
            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                tvText.setText( "Essa Cor ai" );
                tela.setBackgroundColor(Color.rgb(0xB3,0xA2,0xCC));
            }
        });



    }
}
