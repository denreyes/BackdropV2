package io.pntreyes.backdrop20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_container);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,new MainFragment());
        }
    }
}