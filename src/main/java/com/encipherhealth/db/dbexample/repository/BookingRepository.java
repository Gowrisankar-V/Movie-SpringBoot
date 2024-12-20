package com.encipherhealth.db.dbexample.repository;

import com.encipherhealth.db.dbexample.model.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository  extends CrudRepository<Booking, Integer> {

}
