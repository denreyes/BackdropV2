package io.pntreyes.backdrop20.dagger.login;

import dagger.Component;
import io.pntreyes.backdrop20.ui.login.LoginActivity;
import io.pntreyes.backdrop20.ui.login.LoginFragment;
import io.pntreyes.backdrop20.dagger.PerActivity;
import io.pntreyes.backdrop20.dagger.app.AppComponent;

/**
 * Created by Dj on 11/26/2015.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
    void inject(LoginFragment loginFragment);

    LoginFragment loginFragment();
}
