package com.example;


import java.util.Date;

import javax.persistence.PersistenceContext;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.context.event.StartupEvent;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class Start implements ApplicationEventListener<StartupEvent>
{
	@Inject
	// Tried both, none work @PersistenceContext
	private ScanHistoryRepository test;

	@Override
	public void onApplicationEvent(StartupEvent event)
	{
		test.findSumInRange(new Date(), new Date());
	}
}