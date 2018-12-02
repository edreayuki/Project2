package ryan.banayat.com.project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.google.android.gms.location.places.GeoDataClient;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.PlaceDetectionClient;

public class Lrt1Code extends AppCompatActivity {

    private GeoDataClient mGeoDataClient;
    private PlaceDetectionClient mPlaceDetectionClient;
    String station;

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stations_lrt1);
        Log.d("ICS115", "LRT 1 onCreate successful");
        // Construct a GeoDataClient.
        //mGeoDataClient = Places.getGeoDataClient(this, null);
        //Log.d("ICS115", "Places.getGeoDataClient successful");

        // Construct a PlaceDetectionClient.
        //mPlaceDetectionClient = Places.getPlaceDetectionClient(this, null);
        //Log.d("ICS115", "Places.getPlaceDetectionClient successful");
        // TODO: Start using the Places API.
    }

    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.img1: station = getString(R.string.Roosevelt);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt1: station =  getString(R.string.Roosevelt);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt2: station =  getString(R.string.Balintawak);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img2: station =  getString(R.string.Balintawak);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt3: station =  getString(R.string.Monumento);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img3: station =  getString(R.string.Monumento);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt4: station =  getString(R.string.fifth_Avenue);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img4: station =  getString(R.string.fifth_Avenue);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt5: station =  getString(R.string.R_Papa);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img5: station =  getString(R.string.R_Papa);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt6: station =  getString(R.string.Abad_Santos);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img6: station =  getString(R.string.Abad_Santos);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt7: station =  getString(R.string.Blumentritt);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img7: station =  getString(R.string.Blumentritt);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt8: station =  getString(R.string.Tayuman);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img8: station =  getString(R.string.Tayuman);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt9: station =  getString(R.string.Bambang);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img9: station =  getString(R.string.Bambang);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt10: station =  getString(R.string.Doroteo_Jose);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img10: station =  getString(R.string.Doroteo_Jose);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt11: station =  getString(R.string.Carriedo);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img11: station =  getString(R.string.Carriedo);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt12: station =  getString(R.string.Central_Terminal);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img12: station =  getString(R.string.Central_Terminal);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt13: station =  getString(R.string.United_Nations);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img13: station =  getString(R.string.United_Nations);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt14: station =  getString(R.string.Pedro_Gil);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img14: station =  getString(R.string.Pedro_Gil);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt15: station =  getString(R.string.Quirino);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img15: station =  getString(R.string.Quirino);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt16: station =  getString(R.string.Vito_Cruz);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img16: station =  getString(R.string.Vito_Cruz);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt17: station =  getString(R.string.Gil_Puyat);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img17: station =  getString(R.string.Gil_Puyat);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt18: station =  getString(R.string.Libertad);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img18: station =  getString(R.string.Libertad);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt19: station =  getString(R.string.EDSA);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img19: station =  getString(R.string.EDSA);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt20: station =  getString(R.string.Baclaran);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img20: station =  getString(R.string.Baclaran);
                Log.d("ICS115", "selected station is " + station);
                break;
        }
        Station selected = new Station (station);
    }


//    public void lrt1_screen(View v){
//        Intent i = new Intent(this, MainActivity.class);
//        startActivity(i);
//    }

}
