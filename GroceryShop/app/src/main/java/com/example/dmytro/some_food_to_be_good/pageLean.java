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
import android.widget.Toast;

public class pageLean extends AppCompatActivity {
    Product pork = new Product ();
    Product beaf = new Product ();
    Product chicken = new Product ();
    Product fish = new Product ();
    Product egg = new Product ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_lean);
        Basket.basket.remove(pork);
        Basket.basket.remove(beaf);
        Basket.basket.remove(chicken);
        Basket.basket.remove(fish);
        Basket.basket.remove(egg);
    }

    public void addToBasket (View view)
    {
        Basket.basket.remove(pork);
        Basket.basket.remove(beaf);
        Basket.basket.remove(chicken);
        Basket.basket.remove(fish);
        Basket.basket.remove(egg);

        CheckBox chBox = (CheckBox)findViewById(R.id.chPork);
        EditText editText = (EditText)findViewById(R.id.PorkQ);
        String qt = editText.getText().toString();

        if (chBox.isChecked()&& !qt.isEmpty() )
        {
            pork.setName(getResources().getString(R.string.L_Pork));
            pork.setPrice(getResources().getString(R.string.L_PorkP));
            pork.setQ(qt);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.L_PorkP));
            q = Double.parseDouble(qt);
            r=round2(p*q);
            pork.setAmount(r.toString());

            if (Basket.basket.contains(pork))
            {
                int i = Basket.basket.indexOf(pork);
                Basket.basket.get(i).setQ(qt);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(pork);
            }

        }

        CheckBox chBox2 = (CheckBox)findViewById(R.id.chBeaf);
        EditText editText2 = (EditText)findViewById(R.id.BeafQ);
        String qt2 = editText2.getText().toString();

        if (chBox2.isChecked()&& !qt2.isEmpty() )
        {
            beaf.setName(getResources().getString(R.string.L_Beaf));
            beaf.setPrice(getResources().getString(R.string.L_BeafP));
            beaf.setQ(qt2);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.L_BeafP));
            q = Double.parseDouble(qt2);
            r=round2(p*q);
            beaf.setAmount(r.toString());

            if (Basket.basket.contains(beaf))
            {
                int i = Basket.basket.indexOf(beaf);
                Basket.basket.get(i).setQ(qt2);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(beaf);
            }

        }
        //start
        CheckBox chBox3 = (CheckBox)findViewById(R.id.chChicken);
        EditText editText3 = (EditText)findViewById(R.id.ChickenQ);
        String qt3 = editText3.getText().toString();

        if (chBox3.isChecked()&& !qt3.isEmpty() )
        {
            chicken.setName(getResources().getString(R.string.L_Chicken));
            chicken.setPrice(getResources().getString(R.string.L_ChickenP));
            chicken.setQ(qt3);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.L_ChickenP));
            q = Double.parseDouble(qt3);
            r=round2(p*q);
            chicken.setAmount(r.toString());

            if (Basket.basket.contains(chicken))
            {
                int i = Basket.basket.indexOf(chicken);
                Basket.basket.get(i).setQ(qt3);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(chicken);
            }

        }

        //finish

        CheckBox chBox4 = (CheckBox)findViewById(R.id.chEgg);
        EditText editText4 = (EditText)findViewById(R.id.EggQ);
        String qt4 = editText4.getText().toString();

        if (chBox4.isChecked()&& !qt4.isEmpty() )
        {
            egg.setName(getResources().getString(R.string.L_Egg));
            egg.setPrice(getResources().getString(R.string.L_EggP));
            egg.setQ(qt4);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.L_EggP));
            q = Double.parseDouble(qt4);
            r=round2(p*q);
            egg.setAmount(r.toString());

            if (Basket.basket.contains(egg))
            {
                int i = Basket.basket.indexOf(egg);
                Basket.basket.get(i).setQ(qt4);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(egg);
            }

        }

        CheckBox chBox5 = (CheckBox)findViewById(R.id.chFish);
        EditText editText5 = (EditText)findViewById(R.id.FishQ);
        String qt5 = editText5.getText().toString();

        if (chBox5.isChecked()&& !qt5.isEmpty() )
        {
            fish.setName(getResources().getString(R.string.L_Fish));
            fish.setPrice(getResources().getString(R.string.L_FishP));
            fish.setQ(qt5);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.L_FishP));
            q = Double.parseDouble(qt5);
            r=round2(p*q);
            fish.setAmount(r.toString());

            if (Basket.basket.contains(fish))
            {
                int i = Basket.basket.indexOf(fish);
                Basket.basket.get(i).setQ(qt5);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(fish);
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
