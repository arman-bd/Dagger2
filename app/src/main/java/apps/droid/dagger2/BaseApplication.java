package apps.droid.dagger2;

import android.app.Application;

import apps.droid.dagger2.di.DaggerAppComponent;
import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class BaseApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector()
    {
        return DaggerAppComponent.builder().application(this).build();
    }

}