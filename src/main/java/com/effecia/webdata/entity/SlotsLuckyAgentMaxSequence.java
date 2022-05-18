package com.effecia.webdata.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the slots_lucky_agent_max_sequence database table.
 *
 */
@Entity
@Table(name="slots_lucky_agent_max_sequence")
@NamedQuery(name="SlotsLuckyAgentMaxSequence.findAll", query="SELECT s FROM SlotsLuckyAgentMaxSequence s")
public class SlotsLuckyAgentMaxSequence implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "agent_id")
    private int agentId;

    @Column(name = "max_sequence_no")
    private int maxSequenceNo;

    public SlotsLuckyAgentMaxSequence() {
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

    public int getMaxSequenceNo() {
        return this.maxSequenceNo;
    }

    public void setMaxSequenceNo(int maxSequenceNo) {
        this.maxSequenceNo = maxSequenceNo;
    }

}