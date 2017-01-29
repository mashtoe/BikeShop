/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.be;

/**
 *
 * @author Stegger
 */
public class Bike
{

    private String seller = "Mr. Robot";

    private String type = "Mountain Bike";

    private double price = 1500;

    public Bike(String type, String seller, double price)
    {
        this.price = price;
        this.type = type;
        this.seller = seller;
    }

    public Bike()
    {
    }

    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(double price)
    {
        this.price = price;
    }

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public String getType()
    {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * Get the value of seller
     *
     * @return the value of seller
     */
    public String getSeller()
    {
        return seller;
    }

    /**
     * Set the value of seller
     *
     * @param seller new value of seller
     */
    public void setSeller(String seller)
    {
        this.seller = seller;
    }

}
