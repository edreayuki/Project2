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
                i.putExtra("latitude", "14.6576");
                i.putExtra("longitude", "121.0211");
                break;

            case R.id.txt2:
            case R.id.img2:
                i.putExtra("station_name", "Katipunan");
                i.putExtra("latitude", "14.6574");
                i.putExtra("longitude", "121.0032");
                break;


            case R.id.txt3:
            case R.id.img3:
                i.putExtra("station_name", "Anonas");
                i.putExtra("latitude", "14.6543");
                i.putExtra("longitude", "120.9838");
                break;

            case R.id.txt4:
            case R.id.img4:
                i.putExtra("station_name", "Araneta Center-Cubao");
                i.putExtra("latitude", "14.6543");
                i.putExtra("longitude", "120.9838");
                break;

        }

        startActivity(i);
    }

//    public void lrt2_screen(View v){
//        Intent i = new Intent(this, MainActivity.class);
//        startActivity(i);
//    }

}
