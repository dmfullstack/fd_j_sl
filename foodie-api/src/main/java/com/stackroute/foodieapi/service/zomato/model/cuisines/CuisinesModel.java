package com.stackroute.foodieapi.service.zomato.model.cuisines;

public class CuisinesModel
{
	
    private Cuisines[] cuisines;

    public Cuisines[] getCuisines ()
    {
        return cuisines;
    }

    public void setCuisines (Cuisines[] cuisines)
    {
        this.cuisines = cuisines;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cuisines = "+cuisines+"]";
    }
}
