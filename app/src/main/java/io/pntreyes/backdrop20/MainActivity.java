package io.pntreyes.backdrop20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.pntreyes.backdrop20.dagger.main.DaggerMainComponent;
import io.pntreyes.backdrop20.dagger.main.MainComponent;

public class MainActivity extends AppCompatActivity {

    MainComponent mComponent;

    MainComponent component(){
        if(mComponent==null){
            mComponent = DaggerMainComponent.builder()
                    .appComponent(((App)getApplication()).component()).build();
        }
        return mComponent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_container);
        mComponent.inject(this);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,new MainFragment());
        }
    }
}