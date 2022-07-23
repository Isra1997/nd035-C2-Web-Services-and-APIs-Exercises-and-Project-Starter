package com.udacity.pricing.domain.price;

import com.udacity.pricing.service.PriceException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



public interface CrudPriceRepository extends CrudRepository<Price,Long> {

}
