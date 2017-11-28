package com.example.fadlan.eatcookie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookie(View v){
        ImageView imageView = (ImageView) findViewById(R.id.img);
        imageView.setImageResource(R.drawable.after_cookie);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        TextView textView = (TextView) findViewById(R.id.eattext);
        textView.setText("I'm so full!");
    }


}
