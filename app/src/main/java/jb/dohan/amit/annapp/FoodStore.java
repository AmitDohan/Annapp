package jb.dohan.amit.annapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FoodStore extends AppCompatActivity {

    private MenuItem menueItemPizza, menuItemChips, menuItemPersonalPizza;
    TextView tvChoise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_store);

        tvChoise= findViewById(R.id.tvChoise);
        getSupportActionBar().setTitle("Food Store");


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.food_menu, menu);

        menueItemPizza = menu.findItem(R.id.menuItemPizza);
        menuItemChips = menu.findItem(R.id.menuItemChips);
        menuItemPersonalPizza = menu.findItem(R.id.menuItemPersonalPizza);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();

        if(itemId == R.id.menuItemPizza || itemId == R.id.menuItemChips || itemId == R.id.menuItemPersonalPizza) {
            menueItemPizza.setChecked(false);
            menuItemChips.setChecked(false);
            menuItemPersonalPizza.setChecked(false);
            item.setChecked(true);
        }

        switch (itemId) {
            case R.id.menuItemPizza:
                tvChoise.setText("Pizza");
                return true;
            case R.id.menuItemChips:
                tvChoise.setText("Chips");
                return true;
            case R.id.menuItemPersonalPizza:
                tvChoise.setText("Personal Pizza");
                return true;

        }

        return false;
    }

    public void onClick_Back(View v){
        finish();
    }

}
