package kz.kolesa.mvvm.advertisements

import android.arch.core.executor.testing.InstantTaskExecutorRule
import android.arch.lifecycle.Observer
import com.nhaarman.mockito_kotlin.inOrder
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import kotlinx.coroutines.experimental.runBlocking
import kz.kolesa.mvvm.domain.Advertisement
import kz.kolesa.mvvm.repository.AdvertisementRepository
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * @author marshal@kolesa.kz
 */
class AdvertisementViewModelTest {

    /**
     * Правило проверки JUnit, которое меняет фоновый исполнитель, используемый Architecture Components,
     * с другим, который выполняет каждую задачу синхронно.
     */
    @Rule
    @JvmField
    var rule = InstantTaskExecutorRule()

    private lateinit var advertisementViewModel: AdvertisementViewModel

    private val mockedAdvertisementRepository: AdvertisementRepository = mock()
    private val mockedAdvertisementClickListener: ((Advertisement) -> Unit) = mock()
    private val progressObserver: Observer<Boolean> = mock()
    private val advertisementObserver: Observer<List<Advertisement>> = mock()

    @Before
    fun setUp() {
        advertisementViewModel = AdvertisementViewModel(
                advertisementRepository = mockedAdvertisementRepository,
                onAdvertisementClicked = mockedAdvertisementClickListener,
                coroutineContextProvider = TestCoroutineContextProvider()
        )
        advertisementViewModel.apply {
            getAdvertisementLiveData().observeForever(advertisementObserver)
            getProgressLiveData().observeForever(progressObserver)
        }
    }

    @Test
    fun `load advertisements onStart`() {
        val expectedList = listOf(createAdvertisement(id = 1))
        runBlocking {
            whenever(mockedAdvertisementRepository.getAdvertisements()).thenReturn(expectedList)
        }

        advertisementViewModel.onStart()

        inOrder(progressObserver, advertisementObserver).apply {
            verify(progressObserver).onChanged(true)
            verify(advertisementObserver).onChanged(expectedList)
            verify(progressObserver).onChanged(false)
        }
    }

    @After
    fun tearDown() {
        advertisementViewModel.apply {
            getAdvertisementLiveData().removeObserver(advertisementObserver)
            getProgressLiveData().removeObserver(progressObserver)
        }
    }
}