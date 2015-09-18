package com.example.rsy.ibh_mess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rootlayout);
        TextView textView = new TextView(this);
        textView.setText(Html.fromHtml(
                "</h2><br> <b> <font size ='10'>Monday-------------------------------------------------</font> </b><br><br>" +
                        "<b><i>Breakfast:</i></b> Bread Omelette/ Cutlets, Tea<br>"+
                        "<b><i>Lunch:</i></b> Dal Makhni, Aloo Shimla Mirch, Rice, Chapati, Kheera Raita<br>"+
                        "<b><i>Snacks:</i></b> Bread Pakora, Tea<br>"+
                        "<b><i>Dinner:</i></b> Arhar Dal, Bhindi Aloo, Rice, Chapati, <b>Custard, Milk</b><br>"+

                        "</h2><br> <b> <font size ='10'>Tuesday-------------------------------------------------</font> </b><br><br>" +
                        "<b><i>Breakfast:</i></b> Aloo Paratha, Curd, Mix Pickle, Tea<br>"+
                        "<b><i>Lunch:</i></b> Kadhi, Rice, Zeera Aloo, Chapati<br>"+
                        "<b><i>Snacks:</i></b> Chowmein, Tea<br>"+
                        "<b><i>Dinner:</i></b> Masoor Dal, Aloo Gobhi, Rice, Chapati, <b>Milk</b><br>"+

                        "</h2><br> <b> <font size ='10'>Wednesday----------------------------------------------</font> </b><br>" +
                        "<b><i>Breakfast:</i></b> Puri Aloo, Mix Pickle, Tea<br>"+
                        "<b><i>Lunch:</i></b> Rajma, Rice, Mix Veg, Chapati<br>"+
                        "<b><i>Snacks:</i></b> Samosa, Tea<br>"+
                        "<b><i>Dinner:</i></b> Chili Paneer, Chili Egg, Rice, Chapati(Butter), <b>Suji Halwa</b><br>"+

                        "</h2><br> <b> <font size ='10'>Thursday------------------------------------------------</font> </b><br><br>" +
                        "<b><i>Breakfast:</i></b> Veg sandwich, Tea<br>"+
                        "<b><i>Lunch:</i></b> Malka Dal, Loki Kofte, Rice, Raita, Chapati<br>"+
                        "<b><i>Snacks:</i></b> Pasta/Macroni, Coffee<br>"+
                        "<b><i>Dinner:</i></b> Kaale Chane, Mutter Mushroom, Rice, Chapati, <b>Milk</b><br>"+

                        "</h2><br> <b> <font size ='10'>Friday------------------------------------------------</font> </b><br><br>" +
                        "<b><i>*Breakfast:</i></b>Sambar Vada/Idli/Aloo Paratha, Nariyal Pudina Chutney/Curd, Mix Pickle, Tea<br>"+
                        "<b><i>Lunch:</i></b>Chhole Puri, Kaddu, Rice, Zeera Raita<br>"+
                        "<b><i>Snacks:</i></b> Poha, Tea<br>"+
                        "<b><i>Dinner:</i></b> Chana Dal, Soyabean Keema, Rice, Chapati, <b>Sevaiya</b><br>"+

                        "</h2><br> <b> <font size ='10'>Saturday------------------------------------------------</font> </b><br><br>" +
                        "<b><i>Breakfast:</i></b>Pao Bhaji, Tea<br>"+
                        "<b><i>Lunch:</i></b>Mix Dal, Aloo Patta Gobhi, Rice, Chapati, Vegetable Raita<br>"+
                        "<b><i>Snacks:</i></b> Tikki Chaat, Tea<br>"+
                        "<b><i>Dinner:</i></b> Rajma, Aloo Mutter, Rice, Chapati, <b>Kheer, Milk</b><br>"+

                        "</h2><br> <b> <font size ='10'>Sunday------------------------------------------------</font> </b><br><br>" +
                        "<b><i>Breakfast:</i></b>Chhole Bhature, Mix Pickle, Curd<br>"+
                        "<b><i>Lunch:</i></b> Munchurian, Rice<br>"+
                        "<b><i>Snacks:</i></b> Sandwich, Coffee<br>"+
                        "<b><i>Dinner:</i></b> Shahi Paneer/ Chicken, Rice, Tandoori Roti</b><br><br><br>"+

                        "<b><i>*Breakfast menu for FRIDAY is yet to be confirmed.</i><b><br><br> For Suggestions: IBH Room 101"



        ));
        textView.setMovementMethod(new ScrollingMovementMethod());
        relativeLayout.addView(textView);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
