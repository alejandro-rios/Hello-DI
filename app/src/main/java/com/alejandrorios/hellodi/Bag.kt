package com.alejandrorios.hellodi

import dagger.Module
import dagger.Provides

/**
 * Created by alejandrorios on 2019-09-14
 */
// Module
@Module
class Bag {
    @Provides
    fun sayHelloDagger2(): Info {
        return Info("Hello Dagger 2")
    }
}
