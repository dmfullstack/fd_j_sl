package com.stackroute.foodieapi.service.zomato.model.restaurant;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "restaurant" })
public class Restaurant {
	boolean fav;
	
	private String cuisines;

	private String photos_url;

	private String has_online_delivery;

	private Location location;

	private String featured_image;

	private String[] offers;

	private String menu_url;

	private String is_delivering_now;

	private String url;

	private String switch_to_order_menu;

	@JsonProperty("user_rating")
	private UserRating user_rating;

	private String apikey;

	private String currency;

	private String id;

	private String price_range;

	private R R;

	private String name;

	private String deeplink;

	private String events_url;

	private String average_cost_for_two;

	private String thumb;

	private String has_table_booking;

	@JsonProperty("establishment_types")
	private List<Object> establishmentTypes = null;

	public List<Object> getEstablishmentTypes() {
		return establishmentTypes;
	}

	public void setEstablishmentTypes(List<Object> establishmentTypes) {
		this.establishmentTypes = establishmentTypes;
	}

	public String getCuisines() {
		return cuisines;
	}

	public void setCuisines(String cuisines) {
		this.cuisines = cuisines;
	}

	public String getPhotos_url() {
		return photos_url;
	}

	public void setPhotos_url(String photos_url) {
		this.photos_url = photos_url;
	}

	public String getHas_online_delivery() {
		return has_online_delivery;
	}

	public void setHas_online_delivery(String has_online_delivery) {
		this.has_online_delivery = has_online_delivery;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getFeatured_image() {
		return featured_image;
	}

	public void setFeatured_image(String featured_image) {
		this.featured_image = featured_image;
	}

	public String[] getOffers() {
		return offers;
	}

	public void setOffers(String[] offers) {
		this.offers = offers;
	}

	public String getMenu_url() {
		return menu_url;
	}

	public void setMenu_url(String menu_url) {
		this.menu_url = menu_url;
	}

	public String getIs_delivering_now() {
		return is_delivering_now;
	}

	public void setIs_delivering_now(String is_delivering_now) {
		this.is_delivering_now = is_delivering_now;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSwitch_to_order_menu() {
		return switch_to_order_menu;
	}

	public void setSwitch_to_order_menu(String switch_to_order_menu) {
		this.switch_to_order_menu = switch_to_order_menu;
	}

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrice_range() {
		return price_range;
	}

	public void setPrice_range(String price_range) {
		this.price_range = price_range;
	}

	public R getR() {
		return R;
	}

	public void setR(R R) {
		this.R = R;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeeplink() {
		return deeplink;
	}

	public void setDeeplink(String deeplink) {
		this.deeplink = deeplink;
	}

	public String getEvents_url() {
		return events_url;
	}

	public void setEvents_url(String events_url) {
		this.events_url = events_url;
	}

	public String getAverage_cost_for_two() {
		return average_cost_for_two;
	}

	public void setAverage_cost_for_two(String average_cost_for_two) {
		this.average_cost_for_two = average_cost_for_two;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getHas_table_booking() {
		return has_table_booking;
	}

	public UserRating getUser_rating() {
		return user_rating;
	}

	public void setUser_rating(UserRating user_rating) {
		this.user_rating = user_rating;
	}

	public void setHas_table_booking(String has_table_booking) {
		this.has_table_booking = has_table_booking;
	}

	public boolean isFav() {
		return fav;
	}

	public void setFav(boolean fav) {
		this.fav = fav;
	}

	@Override
	public String toString() {
		return "Restaurant [fav=" + fav + ", cuisines=" + cuisines
				+ ", photos_url=" + photos_url + ", has_online_delivery="
				+ has_online_delivery + ", location=" + location
				+ ", featured_image=" + featured_image + ", offers="
				+ Arrays.toString(offers) + ", menu_url=" + menu_url
				+ ", is_delivering_now=" + is_delivering_now + ", url=" + url
				+ ", switch_to_order_menu=" + switch_to_order_menu
				+ ", user_rating=" + user_rating + ", apikey=" + apikey
				+ ", currency=" + currency + ", id=" + id + ", price_range="
				+ price_range + ", R=" + R + ", name=" + name + ", deeplink="
				+ deeplink + ", events_url=" + events_url
				+ ", average_cost_for_two=" + average_cost_for_two + ", thumb="
				+ thumb + ", has_table_booking=" + has_table_booking
				+ ", establishmentTypes=" + establishmentTypes + "]";
	}

	
}
