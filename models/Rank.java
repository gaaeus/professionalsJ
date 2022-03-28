package models;

/** Rank class with the user and professional's identifiers, along with the value set 
 *  
 * @author  Hélio Silva
 * @version 1.0
 * @since   2022-03-28
 */
public class Rank extends Base {

    protected int UserId;

    /** Gets or sets the professional's record identifier */
    protected int ProfessionalID;

    /** Gets or sets the comment's record identifier */
    protected int CommentID;

    /** Gets or sets the rank for the professional */
    protected int RankValue;
}
