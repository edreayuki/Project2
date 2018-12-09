package ryan.banayat.com.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Lrt2Code extends AppCompatActivity {
    String station;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stations_lrt2);

        // ADD ARROW BACK BUTTON
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        // END ARROW BACK BUTTON


        Log.d("ICS115", "LRT 1 onCreate successful");
        // Construct a GeoDataClient.
    }

    public void onClick (View v) {
        Intent i = new Intent(Lrt2Code.this, EstablishmentsList.class);

        switch (v.getId()) {
            case R.id.img1:
            case R.id.txt1:
                i.putExtra("station_name", "Santolan");
                i.putExtra("latitude", "14.6215");
                i.putExtra("longitude", "121.0843");
                break;

            case R.id.txt2:
            case R.id.img2:
                i.putExtra("station_name", "Katipunan");
                i.putExtra("latitude", "14.6314");
                i.putExtra("longitude", "121.0734");
                break;


            case R.id.txt3:
            case R.id.img3:
                i.putExtra("station_name", "Anonas");
                i.putExtra("latitude", "14.6279");
                i.putExtra("longitude", "121.0642");
                break;

            case R.id.txt4:
            case R.id.img4:
                i.putExtra("station_name", "Araneta Center-Cubao");
                i.putExtra("latitude", "14.6228");
                i.putExtra("longitude", "121.0525");
                break;
            case R.id.txt5:
            case R.id.img5:
                i.putExtra("station_name", "Betty Go-Belmonte");
                i.putExtra("latitude", "14.6186");
                i.putExtra("longitude", "121.0426");
                break;

            case R.id.txt6:
            case R.id.img6:
                i.putExtra("station_name", "Gilmore");
                i.putExtra("latitude", "14.6135");
                i.putExtra("longitude", "121.0343");
                break;

            case R.id.txt7:
            case R.id.img7:
                i.putExtra("station_name", "J. Ruiz");
                i.putExtra("latitude", "14.6105");
                i.putExtra("longitude", "121.0266");
                break;
            case R.id.txt8:
            case R.id.img8:
                i.putExtra("station_name", "V. Mapa");
                i.putExtra("latitude", "14.6042");
                i.putExtra("longitude", "121.0172");
                break;
            case R.id.txt9:
            case R.id.img9:
                i.putExtra("station_name", "Pureza");
                i.putExtra("latitude", "14.6017");
                i.putExtra("longitude", "121.0049");
                break;
            case R.id.txt10:
            case R.id.img10:
                i.putExtra("station_name", "Legarda");
                i.putExtra("latitude", "14.6010");
                i.putExtra("longitude", "120.9922");
                break;
            case R.id.img11:
            case R.id.txt11:
                i.putExtra("station_name", "Recto");
                i.putExtra("latitude", "14.6035");
                i.putExtra("longitude", "120.9831");
                break;
        }

        startActivity(i);
    }

//    public void lrt2_screen(View v){
//        Intent i = new Intent(this, MainActivity.class);
//        startActivity(i);
//    }

}
