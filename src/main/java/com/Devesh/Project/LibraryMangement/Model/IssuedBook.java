package com.Devesh.Project.LibraryMangement.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Entity Class for Issued Book
 */
@Entity
public class IssuedBook  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    /**
     * User id in User Class
     */
    private int userId;

    /**
     * Book id in Book Class
     */
    private int bookId;

    /**
     * Issue Date pf Book
     */
    private Date issueDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("IssuedBook{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", bookId=").append(bookId);
        sb.append(", issueDate=").append(issueDate);
        sb.append('}');
        return sb.toString();
    }
}
