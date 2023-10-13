package com.example.activity3;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
public class Activities extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities);
    }
    public void callActivity1(View v){
        Intent i = new Intent(this,Activity1.class);
        startActivity(i);
    }
    public void callActivity2(View v){
        Intent i = new Intent(this,Activity2.class);
        startActivity(i);
    }
    public void callActivity3(View v){
        Intent i = new Intent(this,Activity3.class);
        startActivity(i);
    }
    public void back(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
