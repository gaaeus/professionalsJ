package models;

import java.io.Serializable;

/** Rank class with the user and professional's identifiers, along with the value set 
 *  
 * @author  Hélio Silva
 * @version 1.0
 * @since   2022-03-28
 */
public class Rank extends Base implements Serializable {

    protected int UserId;

    /** Gets or sets the professional's record identifier */
    protected int ProfessionalID;

    /** Gets or sets the comment's record identifier */
    protected int CommentID;

    /** Gets or sets the rank for the professional */
    protected int RankValue;

    public int getUserId() {
        return this.UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public int getProfessionalID() {
        return this.ProfessionalID;
    }

    public void setProfessionalID(int ProfessionalID) {
        this.ProfessionalID = ProfessionalID;
    }

    public int getCommentID() {
        return this.CommentID;
    }

    public void setCommentID(int CommentID) {
        this.CommentID = CommentID;
    }

    public int getRankValue() {
        return this.RankValue;
    }

    public void setRankValue(int RankValue) {
        this.RankValue = RankValue;
    }
}
