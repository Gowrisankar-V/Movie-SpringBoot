package com.encipherhealth.db.dbexample.repository;

import com.encipherhealth.db.dbexample.model.Movies;
import org.springframework.data.repository.CrudRepository;

public interface MultiplexRepository  extends CrudRepository<Movies, Integer> {


}
