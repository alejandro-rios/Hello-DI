package com.alejandrorios.hellodi

import org.koin.dsl.module

/**
 * Created by alejandrorios on 2019-09-14
 */
// Module
val bag = module {
    single { Info("Hello Koin") }
}
