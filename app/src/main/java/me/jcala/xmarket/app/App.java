package me.jcala.xmarket.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import me.jcala.xmarket.di.components.AppComponent;
import me.jcala.xmarket.di.components.DaggerAppComponent;

public class App extends Application {
    private static final String TAG="App";
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
        initialize();
    }
    private void initialize(){
        Fresco.initialize(this);
        Realm.init(this);
        RealmConfiguration realmConfig = new RealmConfiguration.Builder().build();
        Realm.deleteRealm(realmConfig); // Delete Realm between app restarts.
        Realm.setDefaultConfiguration(realmConfig);
    }

    public AppComponent getComponent() {
        return appComponent;
    }
}
