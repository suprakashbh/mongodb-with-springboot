package com.demo.ms.mongo.model;

import java.sql.Timestamp;

import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coordinates")
public class Coordinates {
	@TextIndexed String user;
	String lat;
	String lng;
	Timestamp time;
	
	public Coordinates(){
		
	}
	
	public Coordinates(String user, String lat, String lng) {
		super();
		this.user = user;
		this.lat = lat;
		this.lng = lng;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
	
	
	
}
