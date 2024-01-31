package com.transactional.controller;

import com.transactional.dto.FlightBookingAcknowledgement;
import com.transactional.dto.FlightBookingRequest;
import com.transactional.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightTicketController {

    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping("/bookTicket")
    public ResponseEntity<FlightBookingAcknowledgement> bookFlightTicket(@RequestBody FlightBookingRequest flightBookingRequest){

        flightBookingService.bookFlightTicket(flightBookingRequest);

        return new ResponseEntity<>(HttpStatus.CREATED);

    }
}
