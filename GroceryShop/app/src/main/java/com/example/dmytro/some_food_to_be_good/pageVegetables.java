package com.example.dmytro.some_food_to_be_good;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;



public class pageVegetables extends AppCompatActivity {
    Product tomato = new Product ();
    Product cucumber = new Product ();
    Product pepper = new Product ();
    Product potato = new Product ();
    Product carrot = new Product ();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_vegetables);

        Basket.basket.remove(tomato);
        Basket.basket.remove(cucumber);
        Basket.basket.remove(pepper);
        Basket.basket.remove(potato);
        Basket.basket.remove(carrot);

//       final CheckBox tomatoBox = (CheckBox) findViewById(R.id.chTomato);
//        tomatoBox.setOnClickListener(new View.OnClickListener()
//        {
//            public void onClick(View v) {
//
//                EditText editText = (EditText) findViewById(R.id.TomatoQ);
//                String q1 = editText.getText().toString();
//
//                if (((CheckBox) v).isChecked() && !q1.isEmpty()) {
//
//                    DisplayToast(getResources().getString(R.string.MessageAdd));
//
//                }
//                else {
//                    tomatoBox.setChecked(false);
//                    tomatoBox.setSelected(false);
//
//
//                }
//
//            }
//        });
//
//        final CheckBox cucumberBox = (CheckBox) findViewById(R.id.chCucumber);
//        cucumberBox.setOnClickListener(new View.OnClickListener()
//        {
//            public void onClick(View v) {
//
//                EditText editText = (EditText) findViewById(R.id.CucumberQ);
//                String q2 = editText.getText().toString();
//
//                if (((CheckBox) v).isChecked() && !q2.isEmpty()) {
//
//                    DisplayToast(getResources().getString(R.string.MessageAdd));
//
//                } else {
//                    cucumberBox.setChecked(false);
//                    cucumberBox.setSelected(false);
//
//                }
//            }
//        });
//
//        final CheckBox pepperBox = (CheckBox) findViewById(R.id.chPepper);
//        pepperBox.setOnClickListener(new View.OnClickListener()
//        {
//            public void onClick(View v) {
//
//                EditText editText = (EditText) findViewById(R.id.PepperQ);
//                String q3 = editText.getText().toString();
//
//                if (((CheckBox) v).isChecked() && !q3.isEmpty()) {
//
//                    DisplayToast(getResources().getString(R.string.MessageAdd));
//
//                } else {
//                    pepperBox.setChecked(false);
//                    pepperBox.setSelected(false);
//
//                }
//            }
//        });
//
//        final CheckBox potatoBox = (CheckBox) findViewById(R.id.chPotato);
//        potatoBox.setOnClickListener(new View.OnClickListener()
//        {
//            public void onClick(View v) {
//
//                EditText editText = (EditText) findViewById(R.id.PotatoQ);
//                String q4 = editText.getText().toString();
//
//                if (((CheckBox) v).isChecked() && !q4.isEmpty()) {
//
//                    DisplayToast(getResources().getString(R.string.MessageAdd));
//
//                } else {
//                    potatoBox.setChecked(false);
//                    potatoBox.setSelected(false);
//
//                }
//            }
//        });
//        final CheckBox carrotBox = (CheckBox) findViewById(R.id.chCarrot);
//        carrotBox.setOnClickListener(new View.OnClickListener()
//        {
//            public void onClick(View v) {
//
//                EditText editText = (EditText) findViewById(R.id.CarrotQ);
//                String q5 = editText.getText().toString();
//
//                if (((CheckBox) v).isChecked() && !q5.isEmpty()) {
//
//                    DisplayToast(getResources().getString(R.string.MessageAdd));
//
//                } else {
//                    carrotBox.setChecked(false);
//                    carrotBox.setSelected(false);
//
//                }
//            }
//        });
//


    }
    public void addToBasket (View view)
    {
        Basket.basket.remove(tomato);
        Basket.basket.remove(cucumber);
        Basket.basket.remove(pepper);
        Basket.basket.remove(potato);
        Basket.basket.remove(carrot);

        CheckBox chBox = (CheckBox)findViewById(R.id.chTomato);
        EditText editText = (EditText)findViewById(R.id.TomatoQ);
        String qt = editText.getText().toString();

        if (chBox.isChecked()&& !qt.isEmpty() )
        {
            tomato.setName(getResources().getString(R.string.V_Tomato));
            tomato.setPrice(getResources().getString(R.string.V_TomatoP));
            tomato.setQ(qt);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.V_TomatoP));
            q = Double.parseDouble(qt);
            r=round2(p*q);
            tomato.setAmount(r.toString());

            if (Basket.basket.contains(tomato))
            {
                int i = Basket.basket.indexOf(tomato);
                Basket.basket.get(i).setQ(qt);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(tomato);
            }

        }

        CheckBox chBox2 = (CheckBox)findViewById(R.id.chCucumber);
        EditText editText2 = (EditText)findViewById(R.id.CucumberQ);
        String qt2 = editText2.getText().toString();

        if (chBox2.isChecked()&& !qt2.isEmpty() )
        {
            cucumber.setName(getResources().getString(R.string.V_Cucumber));
            cucumber.setPrice(getResources().getString(R.string.V_CucumberP));
            cucumber.setQ(qt2);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.V_CucumberP));
            q = Double.parseDouble(qt2);
            r=round2(p*q);
            cucumber.setAmount(r.toString());

            if (Basket.basket.contains(cucumber))
            {
                int i = Basket.basket.indexOf(cucumber);
                Basket.basket.get(i).setQ(qt2);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(cucumber);
            }

        }
        //start
        CheckBox chBox3 = (CheckBox)findViewById(R.id.chPepper);
        EditText editText3 = (EditText)findViewById(R.id.PepperQ);
        String qt3 = editText3.getText().toString();

        if (chBox3.isChecked()&& !qt3.isEmpty() )
        {
            pepper.setName(getResources().getString(R.string.V_Pepper));
            pepper.setPrice(getResources().getString(R.string.V_PepperP));
            pepper.setQ(qt3);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.V_PepperP));
            q = Double.parseDouble(qt3);
            r=round2(p*q);
            pepper.setAmount(r.toString());

            if (Basket.basket.contains(pepper))
            {
                int i = Basket.basket.indexOf(pepper);
                Basket.basket.get(i).setQ(qt3);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(pepper);
            }

        }

         //finish

        CheckBox chBox4 = (CheckBox)findViewById(R.id.chPotato);
        EditText editText4 = (EditText)findViewById(R.id.PotatoQ);
        String qt4 = editText4.getText().toString();

        if (chBox4.isChecked()&& !qt4.isEmpty() )
        {
            potato.setName(getResources().getString(R.string.V_Potato));
            potato.setPrice(getResources().getString(R.string.V_PotatoP));
            potato.setQ(qt4);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.V_PotatoP));
            q = Double.parseDouble(qt4);
            r=round2(p*q);
            potato.setAmount(r.toString());

            if (Basket.basket.contains(potato))
            {
                int i = Basket.basket.indexOf(potato);
                Basket.basket.get(i).setQ(qt4);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(potato);
            }

        }

        CheckBox chBox5 = (CheckBox)findViewById(R.id.chCarrot);
        EditText editText5 = (EditText)findViewById(R.id.CarrotQ);
        String qt5 = editText5.getText().toString();

        if (chBox5.isChecked()&& !qt5.isEmpty() )
        {
            carrot.setName(getResources().getString(R.string.V_Carrot));
            carrot.setPrice(getResources().getString(R.string.V_CarrotP));
            carrot.setQ(qt5);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.V_CarrotP));
            q = Double.parseDouble(qt5);
            r=round2(p*q);
            carrot.setAmount(r.toString());

            if (Basket.basket.contains(carrot))
            {
                int i = Basket.basket.indexOf(carrot);
                Basket.basket.get(i).setQ(qt5);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(carrot);
            }

        }
        DisplayToast(getResources().getString(R.string.MessageAdd));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.food_types, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle item selection
        switch (item.getItemId()) {
            case R.id.mn1:
                Basket.basket.remove(tomato);
                Basket.basket.remove(cucumber);
                Basket.basket.remove(pepper);
                Basket.basket.remove(potato);
                Basket.basket.remove(carrot);
                Intent intent1 = new Intent(this, pageVegetables.class);
                startActivity(intent1);

                break;
            case R.id.mn2:
                Intent intent2 = new Intent(this, pageFruit.class);
                startActivity(intent2);
                break;
            case R.id.mn3:
                Intent intent3 = new Intent(this, pageGrain.class);
                startActivity(intent3);
                break;
            case R.id.mn4:
                Intent intent4 = new Intent(this, pageLean.class);
                startActivity(intent4);
                break;
            case R.id.mn5:

                Intent intent5 = new Intent(this, pageMilk.class);
                startActivity(intent5);
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return true;

    }

    public static double round2 (double d)
    {
        d = d * 100;
        int i = (int) Math.round(d);
        return  (double) i / 100;
    }

    private void DisplayToast(String msg)
    {
        Toast.makeText(getBaseContext(), msg,
                Toast.LENGTH_SHORT).show();
    }
    public void showCart (View view) {
        Intent intent = new Intent(this, Cart.class);
        startActivity(intent);
    }
}
