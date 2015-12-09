package com.example.sumitsharma.demo_dagger2_mockito;

import org.joda.time.DateTime;

import javax.inject.Singleton;

@Singleton
public class Clock {
  public DateTime getNow() {
    return new DateTime();
  }
}