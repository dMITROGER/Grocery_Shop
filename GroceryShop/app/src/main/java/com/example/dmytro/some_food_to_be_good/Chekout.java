package com.example.dmytro.some_food_to_be_good;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

public class Chekout extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.dmytro.some_food_to_be_good.MESSAGE";
    public static final String EXTRA_MESSAGE1 = "com.example.dmytro.some_food_to_be_good.MESSAGE1";
    String cardPaypal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chekout);

        String f1 = getResources().getString(R.string.F_Apple);
        String f2 = getResources().getString(R.string.F_Pear);
        String f3 = getResources().getString(R.string.F_Lemon);
        String f4 = getResources().getString(R.string.F_Grape);
        String f5 = getResources().getString(R.string.F_Banana);
        String[] fruit = {f1,f2,f3,f4,f5};

        String v1 = getResources().getString(R.string.V_Carrot);
        String v2 = getResources().getString(R.string.V_Potato);
        String v3 = getResources().getString(R.string.V_Cucumber);
        String v4 = getResources().getString(R.string.V_Pepper);
        String v5 = getResources().getString(R.string.V_Tomato);
        String[] veg = {v1,v2,v3,v4,v5};

        Intent intent1 = getIntent();
        cardPaypal= intent1.getStringExtra(Cart.EXTRA_MESSAGE);
        TextView textView1 = findViewById(R.id.txCardEmail);
         textView1.setText(cardPaypal);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, fruit);

        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)
                findViewById(R.id.PrFruit);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
               android.R.layout.simple_dropdown_item_1line, veg);

        AutoCompleteTextView autoCompleteTextView1 = (AutoCompleteTextView)
                findViewById(R.id.PrVeg);
        autoCompleteTextView1.setThreshold(1);
        autoCompleteTextView1.setAdapter(adapter1);


    }
    public void btnCompleteClicked (View view)
    {
        Intent intent = new Intent(this, Final.class);
        EditText editText = (EditText)findViewById(R.id.txName);
        String fn = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,fn);
        intent.putExtra(EXTRA_MESSAGE1,cardPaypal);

        startActivity(intent);
        finish();
    }

}
