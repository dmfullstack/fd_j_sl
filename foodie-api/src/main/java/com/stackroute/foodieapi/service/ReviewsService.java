/*
 * 
 */
package com.stackroute.foodieapi.service;

import org.springframework.stereotype.Service;

import com.stackroute.foodieapi.entity.ReviewEntity;

// TODO: Auto-generated Javadoc
/**
 * The Interface ReviewsService.
 */
@Service
public interface ReviewsService {

	/**
	 * Creates the.
	 *
	 * @param reviewEntity the review entity
	 * @return the review entity
	 */
	ReviewEntity create(ReviewEntity reviewEntity);

	/**
	 * Update.
	 *
	 * @param reviewEntity the review entity
	 * @return the review entity
	 */
	ReviewEntity update(ReviewEntity reviewEntity);

	/**
	 * Gets the.
	 *
	 * @param id the id
	 * @return the review entity
	 */
	ReviewEntity get(String id);
}
