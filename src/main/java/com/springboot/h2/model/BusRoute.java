package com.springboot.h2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class BusRoute {

	@Id
	@GeneratedValue
	private int id;
	private int routeNo;
	private String busNo;
	private String driverName;
	private String source;
	private String source_lat;
	private String source_long;
	private String destination;
	private String destination_lat;
	private String destination_long;
	private String currentLocation;
	private String currentLocation_lat;
	private String currentLocation_long;

}
