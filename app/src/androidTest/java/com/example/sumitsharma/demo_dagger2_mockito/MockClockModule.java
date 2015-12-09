package com.example.sumitsharma.demo_dagger2_mockito;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MockClockModule {
  @Provides
  @Singleton
  Clock provideClock() {
    return Mockito.mock(Clock.class);
  }
}