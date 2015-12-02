package com.demo.ms.rest.ic;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ms.mongo.model.Coordinates;

@RestController
@EnableAutoConfiguration
public class InsertCordtController {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@RequestMapping("/insert/coordinates/{user}/{lat}/{lng}")
	@ResponseBody
	String inserCoordinates(@PathVariable String user,@PathVariable String lat,@PathVariable String lng) {
		System.out.println(" insert-------");
		Coordinates coordinates = new Coordinates(user,lat,lng);
		coordinates.setTime(new Timestamp(System.currentTimeMillis()));
		System.out.println(" dbObject done-------");
		mongoTemplate.save(coordinates);	
		System.out.println(" done-------");
		return "success";
	}
	
	
	@RequestMapping("/fetch/coordinates/{user}")
	@ResponseBody
	List<Coordinates> inserCoordinates(@PathVariable String user) {
		Query searchUserQuery  = new Query(Criteria.where("user").is(user));
		
		return mongoTemplate.find(searchUserQuery, Coordinates.class);
		
	}

}
