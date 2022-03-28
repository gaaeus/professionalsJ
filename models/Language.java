package models;

public class Language extends Base {

    /** Gets or sets the tag name */
    protected String Name;

    /** Gets or sets the ISO language code (3 chars) */
    protected String ISOCode;

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getISOCode() {
        return this.ISOCode;
    }

    public void setISOCode(String ISOCode) {
        this.ISOCode = ISOCode;
    }
}
