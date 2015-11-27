package io.pntreyes.backdrop20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import io.pntreyes.backdrop20.dagger.main.DaggerMainComponent;
import io.pntreyes.backdrop20.dagger.main.MainComponent;
import io.pntreyes.backdrop20.dagger.main.MainModule;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainFragment mMainFragment;
    MainComponent mComponent;

    MainComponent component() {
        if (mComponent == null) {
            mComponent = DaggerMainComponent.builder()
                    .appComponent(((App) getApplication()).component())
                    .mainModule(new MainModule(this)).build();
        }
        return mComponent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_container);
        component().inject(this);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mMainFragment).commit();
        }
    }
}