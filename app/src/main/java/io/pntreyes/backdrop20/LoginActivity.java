package io.pntreyes.backdrop20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import io.pntreyes.backdrop20.dagger.login.DaggerLoginComponent;
import io.pntreyes.backdrop20.dagger.login.LoginComponent;
import io.pntreyes.backdrop20.dagger.login.LoginModule;

/**
 * Created by Dj on 11/26/2015.
 */
public class LoginActivity extends AppCompatActivity{

    @Inject LoginFragment mLoginFragment;
    LoginComponent mComponent;

    LoginComponent component(){
        if(mComponent==null){
            mComponent = DaggerLoginComponent.builder()
                    .appComponent(((App) getApplication()).component())
                    .loginModule(new LoginModule(this)).build();
        }
        return mComponent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_container);
        component().inject(this);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mLoginFragment);
        }
    }
}
