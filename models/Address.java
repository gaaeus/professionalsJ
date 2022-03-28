package models;

/**
 * Address class to accompany the professional entity. One address only must be set as default. 
  * 
 * @author  Hélio Silva
 * @version 1.0
 * @since   2022-03-28
 */

public class Address extends Base implements Comparable<Address> {

    /** Gets or sets the first address line. */
    public String AddressLine1;

    /** Gets or sets the second address line. */
    public String AddressLine2;

    /** Gets or sets the city. */
    public String City;

    /** Gets or sets the Country in ISO country code format. */
    public int CountryISOCode;

    /** Gets or sets the phone. */
    public String PhoneNumber;

    /** Gets or sets the postal code. */
    public String PostalCode;

    /** Gets or sets the region. */
    public String Region;

    /** Gets or sets the state. */
    public String State;

    /** Gets or sets the Geocoordinates Latitude. */
    public double Latitude;

    /** Gets or sets the Geocoordinates Longitude. */
    public double Longitude;

    /** Get or set whether the address shouid be used as default. */
    public Boolean IsDefault;

    public String getAddressLine1() {
        return this.AddressLine1;
    }

    public void setAddressLine1(String AddressLine1) {
        this.AddressLine1 = AddressLine1;
    }

    public String getAddressLine2() {
        return this.AddressLine2;
    }

    public void setAddressLine2(String AddressLine2) {
        this.AddressLine2 = AddressLine2;
    }

    public String getCity() {
        return this.City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public int getCountryISOCode() {
        return this.CountryISOCode;
    }

    public void setCountryISOCode(int CountryISOCode) {
        this.CountryISOCode = CountryISOCode;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getPostalCode() {
        return this.PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    public String getRegion() {
        return this.Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getState() {
        return this.State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public double getLatitude() {
        return this.Latitude;
    }

    public void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }

    public double getLongitude() {
        return this.Longitude;
    }

    public void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }

    public Boolean isIsDefault() {
        return this.IsDefault;
    }

    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }
    
    @Override
    public int compareTo(final Address other) {
        return this.Id - other.Id;
    }
}