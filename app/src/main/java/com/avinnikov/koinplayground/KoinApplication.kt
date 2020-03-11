package com.avinnikov.koinplayground

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import com.avinnikov.koinplayground.data.BusinessService
import com.avinnikov.koinplayground.data.Controller
import com.avinnikov.koinplayground.data.set.ImplementationOne
import com.avinnikov.koinplayground.data.set.ImplementationThree
import com.avinnikov.koinplayground.data.set.ImplementationTwo
import com.avinnikov.koinplayground.data.set.TestInterface
import com.avinnikov.koinplayground.navigator.Navigator
import com.avinnikov.koinplayground.viewmodel.ViewModelViewModel
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.qualifier.TypeQualifier
import org.koin.dsl.module

class KoinApplication : Application() {

    private val koinModule = module {
        single { Controller(get(), androidContext()) }
        single { BusinessService() }
        viewModel { ViewModelViewModel(get()) }
        single { (activity: AppCompatActivity) -> Navigator(activity) }
        single(qualifier = TypeQualifier(TestInterface::class)) {
            listOf(ImplementationOne(), ImplementationTwo(), ImplementationThree())
        }
    }

    private val configurators: List<TestInterface> by inject(TypeQualifier(TestInterface::class))

    override fun onCreate() {
        super.onCreate()

        initializeInjector()

        configure()
    }

    private fun initializeInjector() {
        startKoin {
            androidContext(this@KoinApplication)
            modules(koinModule)
        }
    }

    private fun configure() {
        configurators.forEach { it.printText() }
    }
}