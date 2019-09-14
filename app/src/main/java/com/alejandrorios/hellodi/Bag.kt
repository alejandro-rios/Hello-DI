package com.alejandrorios.hellodi

import org.kodein.di.Kodein
import org.kodein.di.erased.bind
import org.kodein.di.erased.provider

/**
 * Created by alejandrorios on 2019-09-14
 */
// Module
val bag = Kodein.Module("bag module") {
    bind<Info>() with provider { Info("Hello Kodein") }
}
