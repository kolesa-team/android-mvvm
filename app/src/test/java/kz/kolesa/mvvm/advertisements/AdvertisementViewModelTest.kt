package kz.kolesa.mvvm.advertisements

import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import kotlinx.coroutines.experimental.runBlocking
import kz.kolesa.mvvm.domain.Advertisement
import kz.kolesa.mvvm.repository.AdvertisementRepository
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * @author marshal@kolesa.kz
 */
class AdvertisementViewModelTest {

    private lateinit var advertisementViewModel: AdvertisementViewModel

    private val mockedAdvertisementRepository: AdvertisementRepository = mock()
    private val mockedAdvertisementClickListener: ((Advertisement) -> Unit) = mock()

    /**
     * Правило проверки JUnit, которое меняет фоновый исполнитель, используемый Architecture Components,
     * с другим, который выполняет каждую задачу синхронно.
     */
    @Rule
    @JvmField
    var rule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        advertisementViewModel = AdvertisementViewModel(
                advertisementRepository = mockedAdvertisementRepository,
                onAdvertisementClicked = mockedAdvertisementClickListener,
                coroutineContextProvider = TestCoroutineContextProvider()
        )
    }

    @Test
    fun `should load advertisements onStart`() = runBlocking {
        advertisementViewModel.onStart()

        verify(mockedAdvertisementRepository).getAdvertisements()
    }
}