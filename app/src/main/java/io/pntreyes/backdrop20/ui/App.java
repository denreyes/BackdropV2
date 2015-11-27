package io.pntreyes.backdrop20.ui;

import android.app.Application;

import io.pntreyes.backdrop20.dagger.app.AppComponent;
import io.pntreyes.backdrop20.dagger.app.AppModule;
import io.pntreyes.backdrop20.dagger.app.DaggerAppComponent;

/**
 * Created by Dj on 11/24/2015.
 */
public class App extends Application{

    private AppComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this)).build();
        mComponent.inject(this);
    }

    public AppComponent component(){
        return mComponent;
    }
}
