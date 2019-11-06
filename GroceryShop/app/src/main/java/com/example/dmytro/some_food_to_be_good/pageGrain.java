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

public class pageGrain extends AppCompatActivity {

    Product oatmeal = new Product ();
    Product crunch = new Product ();
    Product cheerios = new Product ();
    Product flakes = new Product ();
    Product quick_oats = new Product ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_grain);
        Basket.basket.remove(oatmeal);
        Basket.basket.remove(crunch);
        Basket.basket.remove(cheerios);
        Basket.basket.remove(flakes);
        Basket.basket.remove(quick_oats);
    }


    public void addToBasket (View view)
    {
        Basket.basket.remove(oatmeal);
        Basket.basket.remove(crunch);
        Basket.basket.remove(cheerios);
        Basket.basket.remove(flakes);
        Basket.basket.remove(quick_oats);

        CheckBox chBox = (CheckBox)findViewById(R.id.chOatmeal);
        EditText editText = (EditText)findViewById(R.id.OatmealQ);
        String qt = editText.getText().toString();

        if (chBox.isChecked()&& !qt.isEmpty() )
        {
            oatmeal.setName(getResources().getString(R.string.G_Oatmeal));
            oatmeal.setPrice(getResources().getString(R.string.G_OatmealP));
            oatmeal.setQ(qt);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.G_OatmealP));
            q = Double.parseDouble(qt);
            r=round2(p*q);
            oatmeal.setAmount(r.toString());

            if (Basket.basket.contains(oatmeal))
            {
                int i = Basket.basket.indexOf(oatmeal);
                Basket.basket.get(i).setQ(qt);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(oatmeal);
            }

        }

        CheckBox chBox2 = (CheckBox)findViewById(R.id.chCrunch);
        EditText editText2 = (EditText)findViewById(R.id.CrunchQ);
        String qt2 = editText2.getText().toString();

        if (chBox2.isChecked()&& !qt2.isEmpty() )
        {
            crunch.setName(getResources().getString(R.string.G_Crunch));
            crunch.setPrice(getResources().getString(R.string.G_CrunchP));
            crunch.setQ(qt2);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.G_CrunchP));
            q = Double.parseDouble(qt2);
            r=round2(p*q);
            crunch.setAmount(r.toString());

            if (Basket.basket.contains(crunch))
            {
                int i = Basket.basket.indexOf(crunch);
                Basket.basket.get(i).setQ(qt2);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(crunch);
            }

        }
        //start
        CheckBox chBox3 = (CheckBox)findViewById(R.id.chCheerios);
        EditText editText3 = (EditText)findViewById(R.id.CheeriosQ);
        String qt3 = editText3.getText().toString();

        if (chBox3.isChecked()&& !qt3.isEmpty() )
        {
            cheerios.setName(getResources().getString(R.string.G_Cheerios));
            cheerios.setPrice(getResources().getString(R.string.G_CheeriosP));
            cheerios.setQ(qt3);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.G_CheeriosP));
            q = Double.parseDouble(qt3);
            r=round2(p*q);
            cheerios.setAmount(r.toString());

            if (Basket.basket.contains(cheerios))
            {
                int i = Basket.basket.indexOf(cheerios);
                Basket.basket.get(i).setQ(qt3);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(cheerios);
            }

        }

        //finish

        CheckBox chBox4 = (CheckBox)findViewById(R.id.chFlakes);
        EditText editText4 = (EditText)findViewById(R.id.FlakesQ);
        String qt4 = editText4.getText().toString();

        if (chBox4.isChecked()&& !qt4.isEmpty() )
        {
            flakes.setName(getResources().getString(R.string.G_Flakes));
            flakes.setPrice(getResources().getString(R.string.G_FlakesP));
            flakes.setQ(qt4);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.G_FlakesP));
            q = Double.parseDouble(qt4);
            r=round2(p*q);
            flakes.setAmount(r.toString());

            if (Basket.basket.contains(flakes))
            {
                int i = Basket.basket.indexOf(flakes);
                Basket.basket.get(i).setQ(qt4);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(flakes);
            }

        }

        CheckBox chBox5 = (CheckBox)findViewById(R.id.chOats);
        EditText editText5 = (EditText)findViewById(R.id.OatsQ);
        String qt5 = editText5.getText().toString();

        if (chBox5.isChecked()&& !qt5.isEmpty() )
        {
            quick_oats.setName(getResources().getString(R.string.G_Oats));
            quick_oats.setPrice(getResources().getString(R.string.G_OatsP));
            quick_oats.setQ(qt5);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.G_OatsP));
            q = Double.parseDouble(qt5);
            r=round2(p*q);
            quick_oats.setAmount(r.toString());

            if (Basket.basket.contains(quick_oats))
            {
                int i = Basket.basket.indexOf(quick_oats);
                Basket.basket.get(i).setQ(qt5);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(quick_oats);
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
