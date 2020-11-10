package apps.droid.dagger2.di;

import android.app.Application;

import javax.inject.Singleton;

import apps.droid.dagger2.BaseApplication;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {


    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}







