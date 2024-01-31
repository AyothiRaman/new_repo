package com.transactional.service;

import com.transactional.dto.FlightBookingAcknowledgement;
import com.transactional.dto.FlightBookingRequest;
import com.transactional.entity.PassengerInformation;
import com.transactional.entity.PaymentInformation;
import com.transactional.repository.PassengerRepository;
import com.transactional.repository.PaymentRepository;
import com.transactional.utils.PaymentUtils;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private PaymentRepository paymentRepository;


    @Transactional//(readOnly = false,isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {

        PassengerInformation passengerInformation = request.getPassengerInformation();
        passengerInformation = passengerRepository.save(passengerInformation);

        PaymentInformation paymentInformation = request.getPaymentInformation();

        PaymentUtils.validateCreditLimit(paymentInformation.getAccountNo(), passengerInformation.getFare());

        paymentInformation.setPassengerId(passengerInformation.getPId());
        paymentInformation.setAmount(passengerInformation.getFare());
        paymentRepository.save(paymentInformation);
        return new FlightBookingAcknowledgement("SUCCESS", passengerInformation.getFare(), UUID.randomUUID()
                .toString().split("-")[0], passengerInformation);

    }
    }
