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

public class pageMilk extends AppCompatActivity {
    Product milk = new Product ();
    Product yogurt = new Product ();
    Product cheese = new Product ();
    Product butter = new Product ();
    Product sour_cream = new Product ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_milk);
        Basket.basket.remove(milk);
        Basket.basket.remove(yogurt);
        Basket.basket.remove(cheese);
        Basket.basket.remove(butter);
        Basket.basket.remove(sour_cream);
    }

    public void addToBasket (View view)
    {
        Basket.basket.remove(milk);
        Basket.basket.remove(yogurt);
        Basket.basket.remove(cheese);
        Basket.basket.remove(butter);
        Basket.basket.remove(sour_cream);

        CheckBox chBox = (CheckBox)findViewById(R.id.chMilk);
        EditText editText = (EditText)findViewById(R.id.MilkQ);
        String qt = editText.getText().toString();

        if (chBox.isChecked()&& !qt.isEmpty() )
        {
            milk.setName(getResources().getString(R.string.M_Milk));
            milk.setPrice(getResources().getString(R.string.M_MilkP));
            milk.setQ(qt);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.M_MilkP));
            q = Double.parseDouble(qt);
            r=round2(p*q);
            milk.setAmount(r.toString());

            if (Basket.basket.contains(milk))
            {
                int i = Basket.basket.indexOf(milk);
                Basket.basket.get(i).setQ(qt);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(milk);
            }

        }

        CheckBox chBox2 = (CheckBox)findViewById(R.id.chYogurt);
        EditText editText2 = (EditText)findViewById(R.id.YogurtQ);
        String qt2 = editText2.getText().toString();

        if (chBox2.isChecked()&& !qt2.isEmpty() )
        {
            yogurt.setName(getResources().getString(R.string.M_Yogurt));
            yogurt.setPrice(getResources().getString(R.string.M_YogurtP));
            yogurt.setQ(qt2);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.M_YogurtP));
            q = Double.parseDouble(qt2);
            r=round2(p*q);
            yogurt.setAmount(r.toString());

            if (Basket.basket.contains(yogurt))
            {
                int i = Basket.basket.indexOf(yogurt);
                Basket.basket.get(i).setQ(qt2);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(yogurt);
            }

        }
        //start
        CheckBox chBox3 = (CheckBox)findViewById(R.id.chCheese);
        EditText editText3 = (EditText)findViewById(R.id.CheeseQ);
        String qt3 = editText3.getText().toString();

        if (chBox3.isChecked()&& !qt3.isEmpty() )
        {
            cheese.setName(getResources().getString(R.string.M_Cheese));
            cheese.setPrice(getResources().getString(R.string.M_CheeseP));
            cheese.setQ(qt3);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.M_CheeseP));
            q = Double.parseDouble(qt3);
            r=round2(p*q);
            cheese.setAmount(r.toString());

            if (Basket.basket.contains(cheese))
            {
                int i = Basket.basket.indexOf(cheese);
                Basket.basket.get(i).setQ(qt3);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(cheese);
            }

        }

        //finish

        CheckBox chBox4 = (CheckBox)findViewById(R.id.chButter);
        EditText editText4 = (EditText)findViewById(R.id.ButterQ);
        String qt4 = editText4.getText().toString();

        if (chBox4.isChecked()&& !qt4.isEmpty() )
        {
            butter.setName(getResources().getString(R.string.M_Butter));
            butter.setPrice(getResources().getString(R.string.M_ButterP));
            butter.setQ(qt4);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.M_ButterP));
            q = Double.parseDouble(qt4);
            r=round2(p*q);
            butter.setAmount(r.toString());

            if (Basket.basket.contains(butter))
            {
                int i = Basket.basket.indexOf(butter);
                Basket.basket.get(i).setQ(qt4);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(butter);
            }

        }

        CheckBox chBox5 = (CheckBox)findViewById(R.id.chSourCream);
        EditText editText5 = (EditText)findViewById(R.id.SourCreamQ);
        String qt5 = editText5.getText().toString();

        if (chBox5.isChecked()&& !qt5.isEmpty() )
        {
            sour_cream.setName(getResources().getString(R.string.M_SourCream));
            sour_cream.setPrice(getResources().getString(R.string.M_SourCreamP));
            sour_cream.setQ(qt5);
            Double p,q,r;
            p = Double.parseDouble(getResources().getString(R.string.M_SourCreamP));
            q = Double.parseDouble(qt5);
            r=round2(p*q);
            sour_cream.setAmount(r.toString());

            if (Basket.basket.contains(sour_cream))
            {
                int i = Basket.basket.indexOf(sour_cream);
                Basket.basket.get(i).setQ(qt5);
                Basket.basket.get(i).setAmount(r.toString());
            }
            else{
                Basket.basket.add(sour_cream);
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
