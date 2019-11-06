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

public class pageFruit extends AppCompatActivity {

    Product apple = new Product ();
    Product pear = new Product ();
    Product banana = new Product ();
    Product lemon = new Product ();
    Product grape = new Product ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_fruit);

        Basket.basket.remove(apple);
        Basket.basket.remove(pear);
        Basket.basket.remove(banana);
        Basket.basket.remove(lemon);
        Basket.basket.remove(grape);


    }
    public void addToBasket (View view)
    {
        Basket.basket.remove(apple);
        Basket.basket.remove(pear);
        Basket.basket.remove(banana);
        Basket.basket.remove(lemon);
        Basket.basket.remove(grape);

        CheckBox chBox = (CheckBox)findViewById(R.id.chApple);
        EditText editText = (EditText)findViewById(R.id.AppleQ);
        String qt = editText.getText().toString();

        if (chBox.isChecked()&& !qt.isEmpty() )
        {
            apple.setName(getResources().getString(R.string.F_Apple));
            apple.setPrice(getResources().getString(R.string.F_AppleP));
            apple.setQ(qt);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.F_AppleP));
            q = Double.parseDouble(qt);
            r=round2(p*q);
            apple.setAmount(r.toString());

            if (Basket.basket.contains(apple))
            {
                int i = Basket.basket.indexOf(apple);
                Basket.basket.get(i).setQ(qt);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(apple);
            }

        }

        CheckBox chBox2 = (CheckBox)findViewById(R.id.chPear);
        EditText editText2 = (EditText)findViewById(R.id.PearQ);
        String qt2 = editText2.getText().toString();

        if (chBox2.isChecked()&& !qt2.isEmpty() )
        {
            pear.setName(getResources().getString(R.string.F_Pear));
            pear.setPrice(getResources().getString(R.string.F_PearP));
            pear.setQ(qt2);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.F_PearP));
            q = Double.parseDouble(qt2);
            r=round2(p*q);
            pear.setAmount(r.toString());

            if (Basket.basket.contains(pear))
            {
                int i = Basket.basket.indexOf(pear);
                Basket.basket.get(i).setQ(qt2);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(pear);
            }

        }
        //start
        CheckBox chBox3 = (CheckBox)findViewById(R.id.chBanana);
        EditText editText3 = (EditText)findViewById(R.id.BananaQ);
        String qt3 = editText3.getText().toString();

        if (chBox3.isChecked()&& !qt3.isEmpty() )
        {
            banana.setName(getResources().getString(R.string.F_Banana));
            banana.setPrice(getResources().getString(R.string.F_BananaP));
            banana.setQ(qt3);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.F_BananaP));
            q = Double.parseDouble(qt3);
            r=round2(p*q);
            banana.setAmount(r.toString());

            if (Basket.basket.contains(banana))
            {
                int i = Basket.basket.indexOf(banana);
                Basket.basket.get(i).setQ(qt3);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(banana);
            }

        }

        //finish

        CheckBox chBox4 = (CheckBox)findViewById(R.id.chLemon);
        EditText editText4 = (EditText)findViewById(R.id.LemonQ);
        String qt4 = editText4.getText().toString();

        if (chBox4.isChecked()&& !qt4.isEmpty() )
        {
            lemon.setName(getResources().getString(R.string.F_Lemon));
            lemon.setPrice(getResources().getString(R.string.F_LemonP));
            lemon.setQ(qt4);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.F_LemonP));
            q = Double.parseDouble(qt4);
            r=round2(p*q);
            lemon.setAmount(r.toString());

            if (Basket.basket.contains(lemon))
            {
                int i = Basket.basket.indexOf(lemon);
                Basket.basket.get(i).setQ(qt4);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(lemon);
            }

        }

        CheckBox chBox5 = (CheckBox)findViewById(R.id.chGrape);
        EditText editText5 = (EditText)findViewById(R.id.GrapeQ);
        String qt5 = editText5.getText().toString();

        if (chBox5.isChecked()&& !qt5.isEmpty() )
        {
            grape.setName(getResources().getString(R.string.F_Grape));
            grape.setPrice(getResources().getString(R.string.F_GrapeP));
            grape.setQ(qt5);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.F_GrapeP));
            q = Double.parseDouble(qt5);
            r=round2(p*q);
            grape.setAmount(r.toString());

            if (Basket.basket.contains(grape))
            {
                int i = Basket.basket.indexOf(grape);
                Basket.basket.get(i).setQ(qt5);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(grape);
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
