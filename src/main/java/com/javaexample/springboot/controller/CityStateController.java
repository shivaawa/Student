package com.javaexample.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityStateController {
	@GetMapping("/city/state")
	public List<State> getStates(){
		 return Arrays.asList(
	                new State(1, "UP", Arrays.asList(new City(1, "Lucknow"), new City(2, "Noida"))),
	                new State(2, "Bihar", Arrays.asList(new City(3, "Motihari"), new City(4, "Patna")))
	        );
		
	}

}
class State{
	private int stateId;
	private String stateName;
	private List<City> Cities;
	
	public State(int stateId,String stateName,List<City> Cities) {
		 this.stateId = stateId;
	        this.stateName = stateName;
	        this.Cities = Cities;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<City> getCities() {
		return Cities;
	}

	public void setCities(List<City> cities) {
		Cities = cities;
	}
	
}
class City {
    private int cityId;
    private String cityName;

    public City(int cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

 
}
