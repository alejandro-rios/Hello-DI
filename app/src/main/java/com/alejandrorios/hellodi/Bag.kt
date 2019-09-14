package com.alejandrorios.hellodi

import org.rewedigital.katana.Module
import org.rewedigital.katana.dsl.compact.singleton

/**
 * Created by alejandrorios on 2019-09-14
 */
// Module
val bag = Module {
    singleton { Info("Hello Katana") }
}
