package com.effecia.webdata.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the slots_lucky_delete_bet_record_day database table.
 *
 */
@Entity
@Table(name="slots_lucky_delete_bet_record_day")
@NamedQuery(name="SlotsLuckyDeleteBetRecordDay.findAll", query="SELECT s FROM SlotsLuckyDeleteBetRecordDay s")
public class SlotsLuckyDeleteBetRecordDay implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="delete_id")
    private int deleteId;

    @Temporal(TemporalType.DATE)
    @Column(name="report_date")
    private Date reportDate;

    public SlotsLuckyDeleteBetRecordDay() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeleteId() {
        return this.deleteId;
    }

    public void setDeleteId(int deleteId) {
        this.deleteId = deleteId;
    }

    public Date getReportDate() {
        return this.reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

}