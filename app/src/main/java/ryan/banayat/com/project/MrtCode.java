package ryan.banayat.com.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MrtCode extends AppCompatActivity {
    String station;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stations_mrt);
    }
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.img1:
                station = getString(R.string.North_Avenue);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt1:
                station = getString(R.string.North_Avenue);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt2:
                station = getString(R.string.Quezon_Avenue);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img2:
                station = getString(R.string.Quezon_Avenue);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt3:
                station = getString(R.string.GMA_Kamuning);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img3:
                station = getString(R.string.GMA_Kamuning);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt4:
                station = getString(R.string.Araneta_Cubao);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img4:
                station = getString(R.string.Araneta_Cubao);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt5:
                station = getString(R.string.Santolan_Annapolis);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img5:
                station = getString(R.string.Santolan_Annapolis);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt6:
                station = getString(R.string.Ortigas);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img6:
                station = getString(R.string.Ortigas);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt7:
                station = getString(R.string.Shaw_Boulevard);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img7:
                station = getString(R.string.Shaw_Boulevard);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt8:
                station = getString(R.string.Boni_Avenue);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img8:
                station = getString(R.string.Boni_Avenue);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt9:
                station = getString(R.string.Guadalupe);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img9:
                station = getString(R.string.Guadalupe);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt10:
                station = getString(R.string.Buendia);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img10:
                station = getString(R.string.Buendia);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt11:
                station = getString(R.string.Ayala);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img11:
                station = getString(R.string.Ayala);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt12:
                station = getString(R.string.Magallanes);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img12:
                station = getString(R.string.Magallanes);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt13:
                station = getString(R.string.Taft);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img13:
                station = getString(R.string.Taft);
                Log.d("ICS115", "selected station is " + station);
                break;
        }
        Station selected = new Station (station);
        Log.d("ICS115", "content of station bean is " + selected.getStation());
    }


//    public void mrt_screen(View v){
//        Intent i = new Intent(this, MainActivity.class);
//        startActivity(i);
//    }

}
