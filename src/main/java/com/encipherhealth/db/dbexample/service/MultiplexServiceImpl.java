package com.encipherhealth.db.dbexample.service;

import java.util.ArrayList;
import java.util.List;

import com.encipherhealth.db.dbexample.model.Booking;
import com.encipherhealth.db.dbexample.model.Snacks;
import com.encipherhealth.db.dbexample.repository.BookingRepository;
import com.encipherhealth.db.dbexample.model.Movies;
import com.encipherhealth.db.dbexample.repository.MultiplexRepository;
import com.encipherhealth.db.dbexample.repository.SnackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MultiplexServiceImpl {

	@Autowired
	MultiplexRepository multiplexRepository;
	
	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	SnackRepository snackRepository;

	List<Movies> movieList = new ArrayList<Movies>();
	public MultiplexServiceImpl() {

	}
	
	public List<Movies> listMovies(){
		return (List<Movies>) multiplexRepository.findAll();
	}
	
	public Booking createBooking(Movies movies) {
		int price=200;
		Booking booking = new Booking();
		booking.setMovieId(movies.getMovieId());
		booking.setPrice(price);
		bookingRepository.save(booking);
		return booking;
	}

	public Snacks createOrder(Snacks snack, int bookingId)
	{
		Snacks snack1=new Snacks();
		snack1.setSnacksName(snack.getSnacksName());
		snack1.setSnacksPrice(snack.getSnacksPrice());
		snack1.setBookingId(bookingId);
		snackRepository.save(snack1);
		return snack1;
	}

	public Movies createMovies(Movies movie) {
		Movies movie1=new Movies();
		movie1.setName(movie.getName());
		movie1.setLanguage(movie.getLanguage());
		multiplexRepository.save(movie1);
		return movie1;
	}

	@Transactional
	public Snacks updateSnacks(Snacks snack, int bookingId, int snacksId) {
		Snacks snacks =snackRepository.findByBookingIdAndSnacksId(bookingId,snacksId);
		snacks.setSnacksName(snack.getSnacksName());
		snacks.setSnacksPrice(snack.getSnacksPrice());
		return snackRepository.save(snacks);
	}

}
