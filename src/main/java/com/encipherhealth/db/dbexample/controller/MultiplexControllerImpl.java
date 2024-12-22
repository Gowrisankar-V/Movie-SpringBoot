package com.encipherhealth.db.dbexample.controller;

import java.util.List;

import com.encipherhealth.db.dbexample.model.Booking;
import com.encipherhealth.db.dbexample.model.Movies;
import com.encipherhealth.db.dbexample.model.Snacks;
import com.encipherhealth.db.dbexample.repository.MultiplexRepository;
import com.encipherhealth.db.dbexample.service.MultiplexServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MultiplexControllerImpl {
	
	@Autowired
	MultiplexServiceImpl multiplexServiceImpl;
	
	
	public MultiplexControllerImpl() {
		
	}
	@PostMapping("/multiplex")
	public Movies createMovies(@RequestBody Movies movie)
	{
		return multiplexServiceImpl.createMovies(movie);
	}
	@GetMapping("/multiplex")
	public List<Movies> listMovies() {
		return multiplexServiceImpl.listMovies();
		
	}
	@PostMapping("/multiplex/booking")
	public Booking createBooking(@RequestBody Movies movies) {

		return multiplexServiceImpl.createBooking(movies);
	}
	@PostMapping("/multiplex/{bookingId}/snacks")
	public Snacks createOrder(@RequestBody Snacks snack, @PathVariable int bookingId)
	{
		return multiplexServiceImpl.createOrder(snack,bookingId);
	}
	@PutMapping("/multiplex/{bookingId}/snacks/{snacksId}")
	public Snacks updateSnacks(@RequestBody Snacks snacks, @PathVariable int bookingId,@PathVariable int snacksId)
	{
		return multiplexServiceImpl.updateSnacks(snacks,bookingId,snacksId);
	}
	@DeleteMapping("/multiplex/{bookingId}/snacks/{snacksId}")
	public void deleteSnacks(@PathVariable int bookingId,@PathVariable int snacksId)
	{
		multiplexServiceImpl.deleteSnacks(bookingId,snacksId);
	}


}
