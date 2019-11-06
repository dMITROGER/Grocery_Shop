package com.example.dmytro.some_food_to_be_good;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Final extends AppCompatActivity {
    double amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        for (Product x : Basket.basket) {

            try {
                amount = amount + Double.parseDouble(x.getAmount());
                amount = round2(amount);
            }
            catch(NumberFormatException e){}
        }



        TextView textAmount = findViewById(R.id.textAmount);
        textAmount.append(Double.toString(amount));


        Intent intent1 = getIntent();
        String fn = intent1.getStringExtra(Chekout.EXTRA_MESSAGE);
        TextView fname = findViewById(R.id.textName);
        fname.append(": "+fn);


        String pm = intent1.getStringExtra(Chekout.EXTRA_MESSAGE1);
        TextView paymet = findViewById(R.id.textPMethod);
        paymet.append(": "+pm);


    }
    public static double round2 (double d)
    {
        d = d * 100;
        int i = (int) Math.round(d);
        return  (double) i / 100;
    }
}
