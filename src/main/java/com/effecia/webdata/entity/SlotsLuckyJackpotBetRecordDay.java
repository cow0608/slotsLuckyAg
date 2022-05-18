package com.effecia.webdata.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the slots_two_bet_record_day database table.
 *
 */
@Entity
@Table(name="slots_lucky_jackpot_bet_record_day")
@NamedQuery(name="SlotsLuckyJackpotBetRecordDay.findAll", query="SELECT s FROM SlotsLuckyJackpotBetRecordDay s")
public class SlotsLuckyJackpotBetRecordDay implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="agent_comm_amount")
    private BigDecimal agentCommAmount;

    @Column(name="agent_id")
    private int agentId;

    @Column(name="agent_share_amount")
    private BigDecimal agentShareAmount;

    @Column(name="agent_stake_amount")
    private BigDecimal agentStakeAmount;

    @Column(name="agent_win_comm_amount")
    private BigDecimal agentWinCommAmount;

    @Column(name="bet_count")
    private int betCount;

    @Column(name="company_comm_amount")
    private BigDecimal companyCommAmount;

    @Column(name="company_id")
    private int companyId;

    @Column(name="company_share_amount")
    private BigDecimal companyShareAmount;

    @Column(name="company_stake_amount")
    private BigDecimal companyStakeAmount;

    @Column(name="currency_id")
    private int currencyId;

    @Column(name="game_code")
    private String gameCode;

    @Column(name="master_comm_amount")
    private BigDecimal masterCommAmount;

    @Column(name="master_id")
    private int masterId;

    @Column(name="master_share_amount")
    private BigDecimal masterShareAmount;

    @Column(name="master_stake_amount")
    private BigDecimal masterStakeAmount;

    @Column(name="master_win_comm_amount")
    private BigDecimal masterWinCommAmount;

    @Column(name="member_comm_amount")
    private BigDecimal memberCommAmount;

    @Column(name="member_info_id")
    private int memberInfoId;

    @Column(name="partner_comm_amount")
    private BigDecimal partnerCommAmount;

    @Column(name="partner_id")
    private int partnerId;

    @Column(name="partner_share_amount")
    private BigDecimal partnerShareAmount;

    @Column(name="partner_stake_amount")
    private BigDecimal partnerStakeAmount;

    @Column(name="partner_win_comm_amount")
    private BigDecimal partnerWinCommAmount;

    @Column(name="report_date")
    private LocalDate reportDate;

    @Column(name="senior_comm_amount")
    private BigDecimal seniorCommAmount;

    @Column(name="senior_id")
    private int seniorId;

    @Column(name="senior_share_amount")
    private BigDecimal seniorShareAmount;

    @Column(name="senior_stake_amount")
    private BigDecimal seniorStakeAmount;

    @Column(name="senior_win_comm_amount")
    private BigDecimal seniorWinCommAmount;

    @Column(name="stake_amount")
    private BigDecimal stakeAmount;

    @Column(name="available_stake_amount")
    private BigDecimal availableStakeAmount;

    @Column(name="user_name")
    private String userName;

    @Column(name="win_loss_amount")
    private BigDecimal winLossAmount;

    public SlotsLuckyJackpotBetRecordDay() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getAgentCommAmount() {
        return this.agentCommAmount;
    }

    public void setAgentCommAmount(BigDecimal agentCommAmount) {
        this.agentCommAmount = agentCommAmount;
    }

    public int getAgentId() {
        return this.agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public BigDecimal getAgentShareAmount() {
        return this.agentShareAmount;
    }

    public void setAgentShareAmount(BigDecimal agentShareAmount) {
        this.agentShareAmount = agentShareAmount;
    }

    public BigDecimal getAgentStakeAmount() {
        return this.agentStakeAmount;
    }

    public void setAgentStakeAmount(BigDecimal agentStakeAmount) {
        this.agentStakeAmount = agentStakeAmount;
    }

    public BigDecimal getAgentWinCommAmount() {
        return this.agentWinCommAmount;
    }

    public void setAgentWinCommAmount(BigDecimal agentWinCommAmount) {
        this.agentWinCommAmount = agentWinCommAmount;
    }

    public int getBetCount() {
        return this.betCount;
    }

    public void setBetCount(int betCount) {
        this.betCount = betCount;
    }

    public BigDecimal getCompanyCommAmount() {
        return this.companyCommAmount;
    }

    public void setCompanyCommAmount(BigDecimal companyCommAmount) {
        this.companyCommAmount = companyCommAmount;
    }

    public int getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public BigDecimal getCompanyShareAmount() {
        return this.companyShareAmount;
    }

    public void setCompanyShareAmount(BigDecimal companyShareAmount) {
        this.companyShareAmount = companyShareAmount;
    }

    public BigDecimal getCompanyStakeAmount() {
        return this.companyStakeAmount;
    }

    public void setCompanyStakeAmount(BigDecimal companyStakeAmount) {
        this.companyStakeAmount = companyStakeAmount;
    }

    public int getCurrencyId() {
        return this.currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public String getGameCode() {
        return this.gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public BigDecimal getMasterCommAmount() {
        return this.masterCommAmount;
    }

    public void setMasterCommAmount(BigDecimal masterCommAmount) {
        this.masterCommAmount = masterCommAmount;
    }

    public int getMasterId() {
        return this.masterId;
    }

    public void setMasterId(int masterId) {
        this.masterId = masterId;
    }

    public BigDecimal getMasterShareAmount() {
        return this.masterShareAmount;
    }

    public void setMasterShareAmount(BigDecimal masterShareAmount) {
        this.masterShareAmount = masterShareAmount;
    }

    public BigDecimal getMasterStakeAmount() {
        return this.masterStakeAmount;
    }

    public void setMasterStakeAmount(BigDecimal masterStakeAmount) {
        this.masterStakeAmount = masterStakeAmount;
    }

    public BigDecimal getMasterWinCommAmount() {
        return this.masterWinCommAmount;
    }

    public void setMasterWinCommAmount(BigDecimal masterWinCommAmount) {
        this.masterWinCommAmount = masterWinCommAmount;
    }

    public BigDecimal getMemberCommAmount() {
        return this.memberCommAmount;
    }

    public void setMemberCommAmount(BigDecimal memberCommAmount) {
        this.memberCommAmount = memberCommAmount;
    }

    public int getMemberInfoId() {
        return this.memberInfoId;
    }

    public void setMemberInfoId(int memberInfoId) {
        this.memberInfoId = memberInfoId;
    }

    public BigDecimal getPartnerCommAmount() {
        return this.partnerCommAmount;
    }

    public void setPartnerCommAmount(BigDecimal partnerCommAmount) {
        this.partnerCommAmount = partnerCommAmount;
    }

    public int getPartnerId() {
        return this.partnerId;
    }

    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
    }

    public BigDecimal getPartnerShareAmount() {
        return this.partnerShareAmount;
    }

    public void setPartnerShareAmount(BigDecimal partnerShareAmount) {
        this.partnerShareAmount = partnerShareAmount;
    }

    public BigDecimal getPartnerStakeAmount() {
        return this.partnerStakeAmount;
    }

    public void setPartnerStakeAmount(BigDecimal partnerStakeAmount) {
        this.partnerStakeAmount = partnerStakeAmount;
    }

    public BigDecimal getPartnerWinCommAmount() {
        return this.partnerWinCommAmount;
    }

    public void setPartnerWinCommAmount(BigDecimal partnerWinCommAmount) {
        this.partnerWinCommAmount = partnerWinCommAmount;
    }

    public LocalDate getReportDate() {
        return this.reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public BigDecimal getSeniorCommAmount() {
        return this.seniorCommAmount;
    }

    public void setSeniorCommAmount(BigDecimal seniorCommAmount) {
        this.seniorCommAmount = seniorCommAmount;
    }

    public int getSeniorId() {
        return this.seniorId;
    }

    public void setSeniorId(int seniorId) {
        this.seniorId = seniorId;
    }

    public BigDecimal getSeniorShareAmount() {
        return this.seniorShareAmount;
    }

    public void setSeniorShareAmount(BigDecimal seniorShareAmount) {
        this.seniorShareAmount = seniorShareAmount;
    }

    public BigDecimal getSeniorStakeAmount() {
        return this.seniorStakeAmount;
    }

    public void setSeniorStakeAmount(BigDecimal seniorStakeAmount) {
        this.seniorStakeAmount = seniorStakeAmount;
    }

    public BigDecimal getSeniorWinCommAmount() {
        return this.seniorWinCommAmount;
    }

    public void setSeniorWinCommAmount(BigDecimal seniorWinCommAmount) {
        this.seniorWinCommAmount = seniorWinCommAmount;
    }

    public BigDecimal getStakeAmount() {
        return this.stakeAmount;
    }

    public void setStakeAmount(BigDecimal stakeAmount) {
        this.stakeAmount = stakeAmount;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getWinLossAmount() {
        return this.winLossAmount;
    }

    public void setWinLossAmount(BigDecimal winLossAmount) {
        this.winLossAmount = winLossAmount;
    }

    public BigDecimal getAvailableStakeAmount() {
        return availableStakeAmount;
    }

    public void setAvailableStakeAmount(BigDecimal availableStakeAmount) {
        this.availableStakeAmount = availableStakeAmount;
    }

}