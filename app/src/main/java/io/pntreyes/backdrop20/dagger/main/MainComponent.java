package io.pntreyes.backdrop20.dagger.main;

import dagger.Component;
import io.pntreyes.backdrop20.ui.main.MainActivity;
import io.pntreyes.backdrop20.ui.main.MainFragment;
import io.pntreyes.backdrop20.dagger.PerActivity;
import io.pntreyes.backdrop20.dagger.app.AppComponent;

/**
 * Created by Dj on 11/25/2015.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
    void inject(MainFragment mainFragment);

    MainFragment mainFragment();
}
