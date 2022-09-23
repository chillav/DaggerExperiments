package com.krasovitova.daggerexperiments

import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [AppModule::class])
interface AppComponent {
    val computer: Computer

    fun inject(activity: MainActivity)
}

@Module
object AppModule {

    @Provides
    fun provideComponent(
        processor: Processor,
        RAM: RAM,
        motherboard: Motherboard
    ): Computer {
        return Computer(
            processor = processor,
            RAM = RAM,
            motherboard = motherboard
        )
    }

    @Provides
    fun provideProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun provideRAM(): RAM {
        return RAM()
    }

    @Provides
    fun provideMotherboard(): Motherboard {
        return Motherboard()
    }
}