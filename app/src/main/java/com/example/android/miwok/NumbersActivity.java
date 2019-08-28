package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        Log.v("NumbersActivity", "Words at 1: " + words.get(0));
        Log.v("NumbersActivity", "Words at 2: " + words.get(1));
        Log.v("NumbersActivity", "Words at 3: " + words.get(2));
        Log.v("NumbersActivity", "Words at 4: " + words.get(3));
        Log.v("NumbersActivity", "Words at 5: " + words.get(4));
    }
}
