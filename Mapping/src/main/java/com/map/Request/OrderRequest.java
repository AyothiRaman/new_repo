package com.map.Request;

import javax.persistence.Entity;

import com.map.MapEntity.CustomerDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class OrderRequest {
	
	private CustomerDetails customerdetails;

	

}