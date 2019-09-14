package com.alejandrorios.hellodi

import dagger.Component

/**
 * Created by alejandrorios on 2019-09-14
 */
// Component
@Component(modules = [Bag::class])
interface MagicBox {
    fun poke(app: MainActivity)
}
