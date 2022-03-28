package models;

import java.util.Date;

/**
 * Base class used to define common properties used within other implementations.
  * 
 * @author  Hélio Silva
 * @version 1.0
 * @since   2022-03-28
 */

public abstract class Base {
    
    /** Enumeration of the possible objects states */
    public enum Status
    {
        Inactive(0),
        Active(1),
        Blocked(2),
        Deleted(3);

        private final int status;

        private Status(int status)
        {
            this.status = status;
        }
    }

    /** The record identifier */
    protected int Id;

    /** Gets or sets the date/time when the record was created */
    protected Date CreationDate;

    /** Gets or sets the identifier of who created the record */
    protected int CreatedBy;

    /** Gets or sets the date when the record was modified */
    protected Date ModificationDate;

    /** Gets or sets the identifier of who changed the record */ 
    protected int LastModifiedBy;

    /** Gets or sets the status of the record in the system */
    protected Status StatusId;

    /** Gets or sets the identifier of the user that modified the object's status */
    protected int LastStatusModifiedBy;

    /** Gets or sets the dete when the user modified the object's status */
    protected Date LastStatusModifiedDate;

    
    public int getId() {
        return this.Id;
    }

    public void setId(int id) {
        this.Id = id;
    }
    
    public Date getCreationDate() {
        return this.CreationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.CreationDate = creationDate;
    }

    public int getCreatedBy() {
        return this.CreatedBy;
    }

    public void setCreatedBy(int createdBy) {
        this.CreatedBy = createdBy;
    }

    public Date getModificationDate() {
        return this.ModificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.ModificationDate = modificationDate;
    }

    public int getLastModifiedBy() {
        return this.LastModifiedBy;
    }

    public void setLastModifiedBy(int lastModifiedBy) {
        this.LastModifiedBy = lastModifiedBy;
    }

    public Status getStatusId() {
        return this.StatusId;
    }

    public void setStatusId(Status statusId) {
        this.StatusId = statusId;
    }

    public int getLastStatusModifiedBy() {
        return this.LastStatusModifiedBy;
    }

    public void setLastStatusModifiedBy(int lastStatusModifiedBy) {
        this.LastStatusModifiedBy = lastStatusModifiedBy;
    }

    public Date getLastStatusModifiedDate() {
        return this.LastStatusModifiedDate;
    }

    public void setLastStatusModifiedDate(Date lastStatusModifiedDate) {
        this.LastStatusModifiedDate = lastStatusModifiedDate;
    }

    public static boolean isNullOrWhiteSpace(String param) { 
        return param == null || param.trim().length() == 0;
    }
}