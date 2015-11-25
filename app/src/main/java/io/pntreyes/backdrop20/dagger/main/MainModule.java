package io.pntreyes.backdrop20.dagger.main;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import io.pntreyes.backdrop20.dagger.PerActivity;

/**
 * Created by Dj on 11/25/2015.
 */
@Module
public class MainModule {
    Activity activity;

    public MainModule(Activity activity){
        this.activity = activity;
    }

    @PerActivity
    @Provides
    Activity provideActivity(){
        return this.activity;
    }
}
