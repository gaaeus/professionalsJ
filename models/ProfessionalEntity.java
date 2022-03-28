package models;

import java.util.*;
import java.io.Serializable;

/**
 * A professional in this system can be a person or a company. 
 * This abstract class must be implemented by both.
 * 
 * @author  Hélio Silva
 * @version 1.0
 * @since   2022-03-28
 */

public abstract class ProfessionalEntity extends Base implements Serializable{
    
    /** Gets or sets the record identifier */
    protected int Id;
    
    public void setId(int id) {
        this.Id = id;
    }

    public int getId() {
        return this.Id;
    }

    /** Gets or sets the (full) Name of the professional, including the title */
    protected String Name;

    /** Gets or sets the description of the services offered by the professional */
    protected String Specialty;

    /** The list of adresses used by professional or company. */
    protected List<Address> Addresses;

    /** The list of tags associated to the professional or company. */
    protected List<Tag> Tags;

    /** Get or sets the list of languages spoken, in ISO code. */
    protected List<Language> Languages;

    /** Flag to indicate whether the professional entity is a company or an individual */
    protected Boolean IsCompany;

    /** Social media identifier or URL: Linkedin */
    protected String LinkedIn;

    /** Social media identifier or URL: Facebook */
    protected String Facebook;

    /** Social media identifier or URL: Instagram */
    protected String Instagram;

    /** Social media identifier or URL: YouTube */
    protected String YouTube;

    /** Social media identifier or URL: TikTok */
    protected String TikTok;

    /** Social media identifier or URL: Twitter */
    protected String Twitter;

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSpecialty() {
        return this.Specialty;
    }

    public void setSpecialty(String Specialty) {
        this.Specialty = Specialty;
    }

    public List<Address> getAddresses() {
        return this.Addresses;
    }

    public void setAddresses(List<Address> Addresses) {
        this.Addresses = Addresses;
    }

    public List<Tag> getTags() {
        return this.Tags;
    }

    public void setTags(List<Tag> Tags) {
        this.Tags = Tags;
    }

    public List<Language> getLanguages() {
        return this.Languages;
    }

    public void setLanguages(List<Language> Languages) {
        this.Languages = Languages;
    }

    public Boolean isIsCompany() {
        return this.IsCompany;
    }

    public Boolean getIsCompany() {
        return this.IsCompany;
    }

    public void setIsCompany(Boolean IsCompany) {
        this.IsCompany = IsCompany;
    }

    public String getLinkedIn() {
        return this.LinkedIn;
    }

    public void setLinkedIn(String LinkedIn) {
        this.LinkedIn = LinkedIn;
    }

    public String getFacebook() {
        return this.Facebook;
    }

    public void setFacebook(String Facebook) {
        this.Facebook = Facebook;
    }

    public String getInstagram() {
        return this.Instagram;
    }

    public void setInstagram(String Instagram) {
        this.Instagram = Instagram;
    }

    public String getYouTube() {
        return this.YouTube;
    }

    public void setYouTube(String YouTube) {
        this.YouTube = YouTube;
    }

    public String getTikTok() {
        return this.TikTok;
    }

    public void setTikTok(String TikTok) {
        this.TikTok = TikTok;
    }

    public String getTwitter() {
        return this.Twitter;
    }

    public void setTwitter(String Twitter) {
        this.Twitter = Twitter;
    }
}