package io.pntreyes.backdrop20.dagger.app;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Dj on 11/24/2015.
 */
@Module
public class AppModule {
    Application application;

    public AppModule(Application application){
        this.application = application;
    }

    @Provides
    @Singleton
    Application provideApplication(){
        return this.application;
    }
}
