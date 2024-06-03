package com.xwb.Library.entity;

import java.util.Date;

/**
 * @author xwb
 */
public class Books {

    private String ISBN;
    private String Title;
    private String Authors;
    private String Publishers;
    private String EditionNumber;
    private Date PublicationDate;
    private String Type;

    public String getIBSN() {
        return ISBN;
    }

    public void setIBSN(String IBSN) {
        this.ISBN = IBSN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthors() {
        return Authors;
    }

    public void setAuthors(String authors) {
        Authors = authors;
    }

    public String getPublishers() {
        return Publishers;
    }

    public void setPublishers(String publishers) {
        Publishers = publishers;
    }

    public String getEditionNumber() {
        return EditionNumber;
    }

    public void setEditionNumber(String editionNumber) {
        EditionNumber = editionNumber;
    }

    public Date getPublicationDate() {
        return PublicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        PublicationDate = publicationDate;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }




}
