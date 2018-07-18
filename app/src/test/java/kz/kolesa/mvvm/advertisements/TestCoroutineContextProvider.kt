package kz.kolesa.mvvm.advertisements

import kotlinx.coroutines.experimental.Unconfined
import kz.kolesa.mvvm.architecutre.CoroutineContextProvider
import kotlin.coroutines.experimental.CoroutineContext

/**
 * @author marshal@kolesa.kz
 */
class TestCoroutineContextProvider : CoroutineContextProvider() {
    override val Main: CoroutineContext
        get() = Unconfined

    override val IO: CoroutineContext
        get() = Unconfined
}