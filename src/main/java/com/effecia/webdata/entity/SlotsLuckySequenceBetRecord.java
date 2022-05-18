package com.effecia.webdata.entity;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the slots_lucky_sequence_bet_record database table.
 *
 */
@Entity
@Table(name="slots_lucky_sequence_bet_record")
@NamedQuery(name="SlotsLuckySequenceBetRecord.findAll", query="SELECT s FROM SlotsLuckySequenceBetRecord s")
public class SlotsLuckySequenceBetRecord implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="agent_id")
    private int agentId;

    @Column(name="record_id")
    private int recordId;

    @Column(name="sequence_no")
    private int sequenceNo;

    public SlotsLuckySequenceBetRecord() {
    }

    public int getAgentId() {
        return this.agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRecordId() {
        return this.recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getSequenceNo() {
        return this.sequenceNo;
    }

    public void setSequenceNo(int sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

}