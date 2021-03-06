package com.rohanrele.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.rohanrele.entity.Country;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Integer> {

}
