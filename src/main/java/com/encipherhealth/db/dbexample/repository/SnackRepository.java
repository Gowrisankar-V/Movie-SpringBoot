package com.encipherhealth.db.dbexample.repository;

import com.encipherhealth.db.dbexample.model.Snacks;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SnackRepository extends CrudRepository<Snacks,Integer> {

//    @Query(Native)
    Snacks findByBookingIdAndSnacksId(int bookingId,int snacksId);

    void deleteByBookingIdAndSnacksId(int bookingId, int snacksId);
}
