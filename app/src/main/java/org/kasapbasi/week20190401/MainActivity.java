package org.kasapbasi.week20190401;

import android.Manifest;
import android.content.pm.PackageManager;
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


    public void Control(View v){

        int permissionCheck = ContextCompat.checkSelfPermission(this,Manifest.permission.VIBRATE);
 if(permissionCheck== PackageManager.PERMISSION_GRANTED)
     Toast.makeText(this,"OK!",Toast.LENGTH_LONG).show();
 else
     Toast.makeText(this,"No !",Toast.LENGTH_LONG).show();



    }
}
