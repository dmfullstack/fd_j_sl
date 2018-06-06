/*
 * 
 */
package com.stackroute.foodieapi.service.zomato.model.restaurantscuisines;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

// TODO: Auto-generated Javadoc
/**
 * The Class Restaurant.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "restaurant" })
public class Restaurant {

	/** The restaurant. */
	@JsonProperty("restaurant")
	private Restaurant_ restaurant;

	/**
	 * Gets the restaurant.
	 *
	 * @return the restaurant
	 */
	//@JsonProperty("restaurant")
	public Restaurant_ getRestaurant() {
		return restaurant;
	}

	/**
	 * Sets the restaurant.
	 *
	 * @param restaurant the new restaurant
	 */
	//@JsonProperty("restaurant")
	public void setRestaurant(Restaurant_ restaurant) {
		this.restaurant = restaurant;
	}


}
