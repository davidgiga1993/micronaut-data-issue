package com.example;

import java.util.Date;

import javax.persistence.EntityManager;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public abstract class ScanHistoryRepository implements PageableRepository<ScanHistory, Integer>
{
	private final EntityManager entityManager;

	public ScanHistoryRepository(EntityManager entityManager)
	{
		this.entityManager = entityManager;
	}


	public long findSumInRange(Date start, Date end)
	{
		return entityManager.createQuery("SELECT COUNT(A) FROM ScanHistory A WHERE A.group = :group AND " +
						"A.date >= :start AND A.date <= :end", Long.class)
				.setParameter("start", start)
				.setParameter("end", end)
				.getSingleResult();
	}
}