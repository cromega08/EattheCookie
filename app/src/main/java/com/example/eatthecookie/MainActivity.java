package com.example.eatthecookie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg = findViewById(R.id.bg);
    }

    public void food(View view) {
        String state = ((Button) view).getText().toString(),
                newString = state.equals(getString(R.string.eat))? getString(R.string.serve):getString(R.string.eat);
        int newBg = state.equals(getString(R.string.eat))? R.drawable.after_cookie:R.drawable.before_cookie,
                newColor = state.equals(getString(R.string.eat))? getColor(R.color.white):getColor(R.color.teal_200);
        ((Button) view).setText(newString);
        ((Button) view).setTextColor(newColor);
        bg.setImageResource(newBg);
    }
}