package models;

/**
 * A professional in this system can be a person or a company. 
 * This is the implementation for the person
 * 
 * @author  Hélio Silva
 * @version 1.0
 * @since   2022-03-28
 */
public class Professional extends ProfessionalEntity implements Comparable<Professional> {

    /** Gets or sets the title of the professional. */
    protected String Title;

    /** Gets or sets the Surname of the professional. */
    private String Surname;

    /** Gets or sets the forename of the professional. */
    private String Forename;

    /** The current rank, set by the users. It is an average of all the rankings made. */
    private float RankValue;

    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getSurname() {
        return this.Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getForename() {
        return this.Forename;
    }

    public void setForename(String Forename) {
        this.Forename = Forename;
    }

    public float getRankValue() {
        return this.RankValue;
    }

    public void setRankValue(float RankValue) {
        this.RankValue = RankValue;
    }

    @Override
    public String toString()
    {
        StringBuilder completeName = new StringBuilder();
        if (!isNullOrWhiteSpace(this.Title)) completeName.append(this.Title + " ");
        if (!isNullOrWhiteSpace(this.Name)) completeName.append(this.Name + " ");
        if (!isNullOrWhiteSpace(this.Forename)) completeName.append(this.Forename + " ");
        if (!isNullOrWhiteSpace(this.Surname)) completeName.append(this.Surname + " ");

        return completeName.toString();
    }

    @Override
    public int compareTo(Professional o) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    
}