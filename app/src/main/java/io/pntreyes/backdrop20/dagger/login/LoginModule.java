package io.pntreyes.backdrop20.dagger.login;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import io.pntreyes.backdrop20.ui.login.LoginFragment;
import io.pntreyes.backdrop20.dagger.PerActivity;

/**
 * Created by Dj on 11/26/2015.
 */
@Module
public class LoginModule{
    Activity activity;

    public LoginModule(Activity activity){
        this.activity = activity;
    }

    @Provides
    @PerActivity
    Activity provideActivity(){
        return this.activity;
    }

    @Provides
    @PerActivity
    LoginFragment loginFragment(){
        return new LoginFragment();
    }
}
