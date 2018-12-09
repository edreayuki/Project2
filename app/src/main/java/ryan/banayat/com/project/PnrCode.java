package ryan.banayat.com.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class PnrCode extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stations_pnr);

        // ADD ARROW BACK BUTTON
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        // END ARROW BACK BUTTON


        Log.d("ICS115", "LRT 1 onCreate successful");
        // Construct a GeoDataClient.
    }


//    public void pnr_screen(View v){
//        Intent i = new Intent(this, MainActivity.class);
//        startActivity(i);
//    }

}
