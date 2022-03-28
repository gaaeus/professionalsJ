package models;

import java.io.Serializable;

/**
 * Tag identifier that can be applied to a professional entity. 
 * 
 * @author  Hélio Silva
 * @version 1.0
 * @since   2022-03-28
 */

public class Tag extends Base implements Serializable, Comparable<Tag> {
    
    /** Gets or sets the tag name */
    protected String Name;

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public int compareTo(final Tag other) {
        return (this.Name.equals(other.Name)? 0 : 1);
    }
}
