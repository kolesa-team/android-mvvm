package kz.kolesa.mvvm.architecutre

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.android.UI
import kotlin.coroutines.experimental.CoroutineContext

/**
 * @author marshal@kolesa.kz
 */
open class CoroutineContextProvider {
    open val main: CoroutineContext by lazy { UI }
    open val io: CoroutineContext by lazy { CommonPool }
}
