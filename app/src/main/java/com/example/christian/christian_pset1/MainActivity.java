package com.example.christian.christian_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView nose, ears, eyes, mouth, mustache, hat, shoes, arms, glasses, eyebrows;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nose = findViewById(R.id.nose);
        ears = findViewById(R.id.ears);
        eyes = findViewById(R.id.eyes);
        mouth = findViewById(R.id.mouth);
        mustache = findViewById(R.id.mustache);
        hat = findViewById(R.id.hat);
        shoes = findViewById(R.id.shoes);
        arms = findViewById(R.id.arms);
        glasses = findViewById(R.id.glasses);
        eyebrows = findViewById(R.id.eyebrows);
        nose.setVisibility(View.INVISIBLE);
        ears.setVisibility(View.INVISIBLE);
        eyes.setVisibility(View.INVISIBLE);
        mouth.setVisibility(View.INVISIBLE);
        mustache.setVisibility(View.INVISIBLE);
        hat.setVisibility(View.INVISIBLE);
        shoes.setVisibility(View.INVISIBLE);
        arms.setVisibility(View.INVISIBLE);
        glasses.setVisibility(View.INVISIBLE);
        eyebrows.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("eyesImg", eyes.getVisibility());
        outState.putInt("earsImg", ears.getVisibility());
        outState.putInt("hatImg", hat.getVisibility());
        outState.putInt("shoesImg", shoes.getVisibility());
        outState.putInt("glassesImg", glasses.getVisibility());
        outState.putInt("mouthImg", mouth.getVisibility());
        outState.putInt("mustacheImg", mustache.getVisibility());
        outState.putInt("armsImg", arms.getVisibility());
        outState.putInt("noseImg", nose.getVisibility());
        outState.putInt("eyebrowsImg", eyebrows.getVisibility());

    }

    @Override
    protected void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);
        eyes.setVisibility(inState.getInt("eyesImg"));
        ears.setVisibility(inState.getInt("earsImg"));
        shoes.setVisibility(inState.getInt("shoesImg"));
        mouth.setVisibility(inState.getInt("mouthImg"));
        mustache.setVisibility(inState.getInt("mustacheImg"));
        hat.setVisibility(inState.getInt("hatImg"));
        glasses.setVisibility(inState.getInt("glassesImg"));
        eyebrows.setVisibility(inState.getInt("eyebrowsImg"));
        nose.setVisibility(inState.getInt("noseImg"));
        arms.setVisibility(inState.getInt("armsImg"));
    }

    public void somethingChecked(View view) {
        boolean state = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.eyesCheck:
                if(state) {
                    eyes.setVisibility(View.VISIBLE);
                } else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.earsCheck:
                if(state) {
                    ears.setVisibility(View.VISIBLE);
                } else {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.shoesCheck:
                if(state) {
                    shoes.setVisibility(View.VISIBLE);
                } else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.mustacheCheck:
                if(state) {
                    mustache.setVisibility(View.VISIBLE);
                } else {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.glassesCheck:
                if(state) {
                    glasses.setVisibility(View.VISIBLE);
                } else {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.mouthCheck:
                if(state) {
                    mouth.setVisibility(View.VISIBLE);
                } else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.noseCheck:
                if(state) {
                    nose.setVisibility(View.VISIBLE);
                } else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.hatCheck:
                if(state) {
                    hat.setVisibility(View.VISIBLE);
                } else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.eyebrowsCheck:
                if(state) {
                    eyebrows.setVisibility(View.VISIBLE);
                } else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.armsCheck:
                if(state) {
                    arms.setVisibility(View.VISIBLE);
                } else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}
