package com.xwb.Library.entity;

import java.util.Date;

/**
 * @author xwb
 */
public class Record {
    private Integer RecordID;
    private String ISBN;
    private int ReaderID;
    private Date BorrowingDate;
    private Date ReturnDate;

    public Integer getRecordID() {
        return RecordID;
    }

    public void setRecordID(Integer recordID) {
        RecordID = recordID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getReaderID() {
        return ReaderID;
    }

    public void setReaderID(int readerID) {
        ReaderID = readerID;
    }

    public Date getBorrowingDate() {
        return BorrowingDate;
    }

    public void setBorrowingDate(Date borrowingDate) {
        BorrowingDate = borrowingDate;
    }
    public Date getReturnDate() {
        return ReturnDate;
    }
    public void setReturnDate(Date returnDate) {
        ReturnDate = returnDate;
    }

}
