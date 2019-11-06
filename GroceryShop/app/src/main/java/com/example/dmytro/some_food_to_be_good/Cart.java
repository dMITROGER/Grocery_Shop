package com.example.dmytro.some_food_to_be_good;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class Cart extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.dmytro.some_food_to_be_good.MESSAGE";


    double amount;
    int choice=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);


        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroupP);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {public void onCheckedChanged(RadioGroup group, int checkedId)
        {

            RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1);
            RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
            RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);
            if(rb1.isChecked()) {
                DisplayToast(getResources().getString(R.string.creditCh));
                choice =1;
            }
            if (rb2.isChecked()){
                DisplayToast(getResources().getString(R.string.debitCh));
                choice =2;
            }
            if (rb3.isChecked()){
                DisplayToast(getResources().getString(R.string.paypalCh));
                choice =3;
            }
        }
        });

       TextView textView = findViewById(R.id.tvCart);
        textView.setText("");

        TextView textAm = findViewById(R.id.textA);
        textAm.setText("");

        TextView textQuant = findViewById(R.id.textQ);
        textQuant.setText("");

        TextView textPrice = findViewById(R.id.textP);
        textPrice.setText("");


        for (Product x : Basket.basket) {

            textView.append(x.name + "\n");
        }

        for (Product x : Basket.basket) {

            textAm.append("$"+x.Amount +"\n");
            try {
                amount = amount + Double.parseDouble(x.getAmount());
                amount = round2(amount);
            }
            catch(NumberFormatException e){}
        }

        for (Product x : Basket.basket) {

            textQuant.append(x.q+"\n");
        }

        for (Product x : Basket.basket) {

            textPrice.append("$"+x.price+"\n");
        }


        TextView textAmount = findViewById(R.id.textAm);
        textAmount.setText("Total amount "+amount+" CAD");

    }
    public void proceedBtnClicked (View view)
    {
        Intent intent1 = new Intent(this, Chekout.class);

        switch (choice)
        {
            case 1 :
                String credit = getResources().getString(R.string.paymentOption_1);
                intent1.putExtra(EXTRA_MESSAGE, credit);

                startActivity(intent1);

            break;
            case 2 :
                String debit = getResources().getString(R.string.paymentOption_2);
                intent1.putExtra(EXTRA_MESSAGE, debit);

                startActivity(intent1);

                break;
            case 3 :
                String payPal = getResources().getString(R.string.paymentOption_3);
                intent1.putExtra(EXTRA_MESSAGE, payPal);

                startActivity(intent1);

                break;
        }




    }

    public void emptyCart (View view)
    {
        Basket.basket.clear();
        TextView textView = findViewById(R.id.tvCart);
        textView.setText("");

        TextView textAm = findViewById(R.id.textA);
        textAm.setText("");

        TextView textQuant = findViewById(R.id.textQ);
        textQuant.setText("");

        TextView textPrice = findViewById(R.id.textP);
        textPrice.setText("");

        TextView textAmount = findViewById(R.id.textAm);
        textAmount.setText("");


    }


    private void DisplayToast(String msg)
    {
        Toast.makeText(getBaseContext(), msg,
                Toast.LENGTH_SHORT).show();
    }
    public static double round2 (double d)
    {
        d = d * 100;
        int i = (int) Math.round(d);
        return  (double) i / 100;
    }

}
