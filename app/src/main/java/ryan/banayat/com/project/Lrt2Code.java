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
    }

    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.img1: station = getString(R.string.Santolan);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt1: station =  getString(R.string.Santolan);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt2: station =  getString(R.string.Katipunan);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img2: station =  getString(R.string.Katipunan);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt3: station =  getString(R.string.Anonas);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img3: station =  getString(R.string.Anonas);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt4: station =  getString(R.string.AranetaCenter_Cubao);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img4: station =  getString(R.string.AranetaCenter_Cubao);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt5: station =  getString(R.string.Betty_Go_Belmonte);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img5: station =  getString(R.string.Betty_Go_Belmonte);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt6: station =  getString(R.string.Gilmore);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img6: station =  getString(R.string.Gilmore);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt7: station =  getString(R.string.J_Ruiz);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img7: station =  getString(R.string.J_Ruiz);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt8: station =  getString(R.string.V_Mapa);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img8: station =  getString(R.string.V_Mapa);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt9: station =  getString(R.string.Pureza);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img9: station =  getString(R.string.Pureza);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt10: station =  getString(R.string.Legarda);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img10: station =  getString(R.string.Legarda);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.txt11: station =  getString(R.string.Recto);
                Log.d("ICS115", "selected station is " + station);
                break;
            case R.id.img11: station =  getString(R.string.Recto);
                Log.d("ICS115", "selected station is " + station);
                break;
        }
        Station selected = new Station (station);
        Log.d("ICS115", "content of station bean is " + selected.getStation());
    }

//    public void lrt2_screen(View v){
//        Intent i = new Intent(this, MainActivity.class);
//        startActivity(i);
//    }

}
