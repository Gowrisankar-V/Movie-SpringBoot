package com.encipherhealth.db.dbexample.repository;

import com.encipherhealth.db.dbexample.model.Snacks;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SnackRepository extends CrudRepository<Snacks,Integer> {

//    @Query(Native)
    Snacks findByBookingIdAndSnacksId(int bookingId,int snacksId);
}
