package com.example.dmytro.some_food_to_be_good;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.content.SharedPreferences;

public class MainActivity extends AppCompatActivity {
    //public static final String EXTRA_MESSAGE = "com.example.dmytro.some_food_to_be_good.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Product nnn = new Product();
    nnn.setName("name   ");
    nnn.setQ("Lb/pc ");
    nnn.setPrice("Price   ");
    nnn.setAmount("Amount");
    Basket.basket.add(nnn);
    }

    public void enterMenuPage (View view) {

        Intent intent = new Intent(this, MenuPage.class);
        startActivity(intent);

    }

}
