package io.pntreyes.backdrop20.dagger.app;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import io.pntreyes.backdrop20.App;

/**
 * Created by Dj on 11/24/2015.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App application);

    Application application();
}
