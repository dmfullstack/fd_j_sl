package com.stackroute.foodieapi.service.zomato.model.reviews;

public class User {

    private String profile_url;

    private String profile_image;

    private String profile_deeplink;

    private String name;

    private String foodie_level;

    private String foodie_color;

    private String foodie_level_num;

    public String getProfile_url ()
    {
        return profile_url;
    }

    public void setProfile_url (String profile_url)
    {
        this.profile_url = profile_url;
    }

    public String getProfile_image ()
    {
        return profile_image;
    }

    public void setProfile_image (String profile_image)
    {
        this.profile_image = profile_image;
    }

    public String getProfile_deeplink ()
    {
        return profile_deeplink;
    }

    public void setProfile_deeplink (String profile_deeplink)
    {
        this.profile_deeplink = profile_deeplink;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getFoodie_level ()
    {
        return foodie_level;
    }

    public void setFoodie_level (String foodie_level)
    {
        this.foodie_level = foodie_level;
    }

    public String getFoodie_color ()
    {
        return foodie_color;
    }

    public void setFoodie_color (String foodie_color)
    {
        this.foodie_color = foodie_color;
    }

    public String getFoodie_level_num ()
    {
        return foodie_level_num;
    }

    public void setFoodie_level_num (String foodie_level_num)
    {
        this.foodie_level_num = foodie_level_num;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [profile_url = "+profile_url+", profile_image = "+profile_image+", profile_deeplink = "+profile_deeplink+", name = "+name+", foodie_level = "+foodie_level+", foodie_color = "+foodie_color+", foodie_level_num = "+foodie_level_num+"]";
    }

}
