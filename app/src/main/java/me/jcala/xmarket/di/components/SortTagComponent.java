package me.jcala.xmarket.di.components;

import javax.inject.Singleton;

import dagger.Component;
import me.jcala.xmarket.di.modules.SortTagModule;
import me.jcala.xmarket.mvp.sort.SortTagFragment;

@Singleton
@Component(modules = SortTagModule.class)
public interface SortTagComponent {
    void inject(SortTagFragment fragment);
}
