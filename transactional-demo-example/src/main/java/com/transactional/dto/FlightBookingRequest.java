package com.transactional.dto;

import com.transactional.entity.PassengerInformation;
import com.transactional.entity.PaymentInformation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private PassengerInformation passengerInformation;

    private PaymentInformation paymentInformation;
}
