package com.ltts.Rental;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.ltts.Rental.Repo.BookingRepo;
import com.ltts.Rental.model.Booking;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class BookingRepoTests {
	@Autowired
	private BookingRepo repo;

	@Test
	public void testCreateBooking( ) {
		/*
		 * Booking savedBooking = repo.save(new Booking("Booking"));
		 * assertThat(savedBooking.getId().isGreaterThan(0));
		 */
	}
}
