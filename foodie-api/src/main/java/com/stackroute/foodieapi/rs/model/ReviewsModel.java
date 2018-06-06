/*
 * 
 */
package com.stackroute.foodieapi.rs.model;

import java.util.List;

import com.stackroute.foodieapi.service.zomato.model.reviews.Review;

// TODO: Auto-generated Javadoc
/**
 * The Class ReviewsModel.
 */
public class ReviewsModel {
	
	/** The reviews. */
	private List<Review> reviews;

	/**
	 * Gets the reviews.
	 *
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}

	/**
	 * Sets the reviews.
	 *
	 * @param reviews the new reviews
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

}
