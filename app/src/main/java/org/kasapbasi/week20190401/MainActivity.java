package org.kasapbasi.week20190401;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {

switch(requestCode){

    case 1967:
        if (grantResults.length > 0
                && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            Toast.makeText(this,"TEŞEKKÜRLER TAKVİME ERİŞİYORUM",Toast.LENGTH_LONG).show();
        }

        break;


}

    }

    public void Control(View v){

        int permissionCheck = ContextCompat.checkSelfPermission(this,Manifest.permission.VIBRATE);
        int permissionCheck2 = ContextCompat.checkSelfPermission(this,Manifest.permission.READ_CONTACTS);


        if(permissionCheck2== PackageManager.PERMISSION_GRANTED)
     Toast.makeText(this,"OK!",Toast.LENGTH_LONG).show();
 else {
            Toast.makeText(this, "No !", Toast.LENGTH_LONG).show();


              requestPermissions( new String[]{Manifest.permission.WRITE_CALENDAR}, 1967);
 }


    }

}
