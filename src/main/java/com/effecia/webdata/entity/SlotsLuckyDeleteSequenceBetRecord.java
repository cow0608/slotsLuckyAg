package com.effecia.webdata.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the slots_lucky_delete_sequence_bet_record database table.
 *
 */
@Entity
@Table(name="slots_lucky_delete_sequence_bet_record")
@NamedQuery(name="SlotsLuckyDeleteSequenceBetRecord.findAll", query="SELECT s FROM SlotsLuckyDeleteSequenceBetRecord s")
public class SlotsLuckyDeleteSequenceBetRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "agent_id")
    private int agentId;

    @Column(name = "delete_sequence_no")
    private int deleteSequenceNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "report_date")
    private Date reportDate;

    public SlotsLuckyDeleteSequenceBetRecord() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAgentId() {
        return this.agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public int getDeleteSequenceNo() {
        return this.deleteSequenceNo;
    }

    public void setDeleteSequenceNo(int deleteSequenceNo) {
        this.deleteSequenceNo = deleteSequenceNo;
    }

    public Date getReportDate() {
        return this.reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

}