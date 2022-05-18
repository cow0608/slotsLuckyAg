package com.effecia.webdata.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the slots_two_bet_record database table.
 *
 */
@Entity
@Table(name="slots_lucky_bet_record")
@NamedQuery(name="SlotsLuckyBetRecord.findAll", query="SELECT s FROM SlotsLuckyBetRecord s")
public class SlotsLuckyBetRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="account_type_id")
    private int accountTypeId;

    @Column(name="agent_comm")
    private BigDecimal agentComm;

    @Column(name="agent_comm_amount")
    private BigDecimal agentCommAmount;

    @Column(name="agent_id")
    private int agentId;

    @Column(name="agent_share")
    private BigDecimal agentShare;

    @Column(name="agent_share_amount")
    private BigDecimal agentShareAmount;

    @Column(name="agent_win_comm_amount")
    private BigDecimal agentWinCommAmount;

    @Column(name="available_stake_amount")
    private BigDecimal availableStakeAmount;

    @Column(name="balance_after")
    private BigDecimal balanceAfter;

    @Column(name="bet_id")
    private String betId;

    @Column(name="bet_time")
    private LocalDateTime betTime;

    private BigDecimal comm;

    @Column(name="comm_amount")
    private BigDecimal commAmount;

    @Column(name="company_comm")
    private BigDecimal companyComm;

    @Column(name="company_comm_amount")
    private BigDecimal companyCommAmount;

    @Column(name="company_id")
    private int companyId;

    @Column(name="company_share")
    private BigDecimal companyShare;

    @Column(name="company_share_amount")
    private BigDecimal companyShareAmount;

    @Column(name="currency_id")
    private int currencyId;

    private String equipment;

    @Column(name="game_code")
    private String gameCode;

    @Column(name="game_name")
    private String gameName;

    @Column(name="game_type")
    private String gameType;

    private String ip;

    @Column(name="master_comm")
    private BigDecimal masterComm;

    @Column(name="master_comm_amount")
    private BigDecimal masterCommAmount;

    @Column(name="master_id")
    private int masterId;

    @Column(name="master_share")
    private BigDecimal masterShare;

    @Column(name="master_share_amount")
    private BigDecimal masterShareAmount;

    @Column(name="master_win_comm_amount")
    private BigDecimal masterWinCommAmount;

    @Column(name="member_comm")
    private BigDecimal memberComm;

    @Column(name="member_comm_amount")
    private BigDecimal memberCommAmount;

    @Column(name="member_info_id")
    private int memberInfoId;

    @Column(name="mode")
    private String mode;

    @Column(name="parent_id")
    private int parentId;

    @Column(name="partner_comm")
    private BigDecimal partnerComm;

    @Column(name="partner_comm_amount")
    private BigDecimal partnerCommAmount;

    @Column(name="partner_id")
    private int partnerId;

    @Column(name="partner_share")
    private BigDecimal partnerShare;

    @Column(name="partner_share_amount")
    private BigDecimal partnerShareAmount;

    @Column(name="partner_win_comm_amount")
    private BigDecimal partnerWinCommAmount;

    private BigDecimal rate;

    @Column(name="report_date")
    private LocalDate reportDate;

    @Column(name="senior_comm")
    private BigDecimal seniorComm;

    @Column(name="senior_comm_amount")
    private BigDecimal seniorCommAmount;

    @Column(name="senior_id")
    private int seniorId;

    @Column(name="senior_share")
    private BigDecimal seniorShare;

    @Column(name="senior_share_amount")
    private BigDecimal seniorShareAmount;

    @Column(name="senior_win_comm_amount")
    private BigDecimal seniorWinCommAmount;

    @Column(name="stake_amount")
    private BigDecimal stakeAmount;

    private int status;

    @Column(name="lucky_status")
    private int luckyStatus;

    @Column(name="user_name")
    private String userName;

    private LocalDateTime walletTime;

    @Column(name="win_loss_amount")
    private BigDecimal winLossAmount;

    @Column(name="win_ning_id")
    private String winNingId;

    public SlotsLuckyBetRecord() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountTypeId() {
        return this.accountTypeId;
    }

    public void setAccountTypeId(int accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public BigDecimal getAgentComm() {
        return this.agentComm;
    }

    public void setAgentComm(BigDecimal agentComm) {
        this.agentComm = agentComm;
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

    public BigDecimal getAgentShare() {
        return this.agentShare;
    }

    public void setAgentShare(BigDecimal agentShare) {
        this.agentShare = agentShare;
    }

    public BigDecimal getAgentShareAmount() {
        return this.agentShareAmount;
    }

    public void setAgentShareAmount(BigDecimal agentShareAmount) {
        this.agentShareAmount = agentShareAmount;
    }

    public BigDecimal getAgentWinCommAmount() {
        return this.agentWinCommAmount;
    }

    public void setAgentWinCommAmount(BigDecimal agentWinCommAmount) {
        this.agentWinCommAmount = agentWinCommAmount;
    }

    public BigDecimal getAvailableStakeAmount() {
        return this.availableStakeAmount;
    }

    public void setAvailableStakeAmount(BigDecimal availableStakeAmount) {
        this.availableStakeAmount = availableStakeAmount;
    }

    public BigDecimal getBalanceAfter() {
        return this.balanceAfter;
    }

    public void setBalanceAfter(BigDecimal balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public String getBetId() {
        return this.betId;
    }

    public void setBetId(String betId) {
        this.betId = betId;
    }

    public LocalDateTime getBetTime() {
        return this.betTime;
    }

    public void setBetTime(LocalDateTime betTime) {
        this.betTime = betTime;
    }

    public BigDecimal getComm() {
        return this.comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public BigDecimal getCommAmount() {
        return this.commAmount;
    }

    public void setCommAmount(BigDecimal commAmount) {
        this.commAmount = commAmount;
    }

    public BigDecimal getCompanyComm() {
        return this.companyComm;
    }

    public void setCompanyComm(BigDecimal companyComm) {
        this.companyComm = companyComm;
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

    public BigDecimal getCompanyShare() {
        return this.companyShare;
    }

    public void setCompanyShare(BigDecimal companyShare) {
        this.companyShare = companyShare;
    }

    public BigDecimal getCompanyShareAmount() {
        return this.companyShareAmount;
    }

    public void setCompanyShareAmount(BigDecimal companyShareAmount) {
        this.companyShareAmount = companyShareAmount;
    }

    public int getCurrencyId() {
        return this.currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public String getEquipment() {
        return this.equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getGameCode() {
        return this.gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public String getGameName() {
        return this.gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameType() {
        return this.gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public BigDecimal getMasterComm() {
        return this.masterComm;
    }

    public void setMasterComm(BigDecimal masterComm) {
        this.masterComm = masterComm;
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

    public BigDecimal getMasterShare() {
        return this.masterShare;
    }

    public void setMasterShare(BigDecimal masterShare) {
        this.masterShare = masterShare;
    }

    public BigDecimal getMasterShareAmount() {
        return this.masterShareAmount;
    }

    public void setMasterShareAmount(BigDecimal masterShareAmount) {
        this.masterShareAmount = masterShareAmount;
    }

    public BigDecimal getMasterWinCommAmount() {
        return this.masterWinCommAmount;
    }

    public void setMasterWinCommAmount(BigDecimal masterWinCommAmount) {
        this.masterWinCommAmount = masterWinCommAmount;
    }

    public BigDecimal getMemberComm() {
        return this.memberComm;
    }

    public void setMemberComm(BigDecimal memberComm) {
        this.memberComm = memberComm;
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

    public String getMode() {
        return this.mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public int getParentId() {
        return this.parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public BigDecimal getPartnerComm() {
        return this.partnerComm;
    }

    public void setPartnerComm(BigDecimal partnerComm) {
        this.partnerComm = partnerComm;
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

    public BigDecimal getPartnerShare() {
        return this.partnerShare;
    }

    public void setPartnerShare(BigDecimal partnerShare) {
        this.partnerShare = partnerShare;
    }

    public BigDecimal getPartnerShareAmount() {
        return this.partnerShareAmount;
    }

    public void setPartnerShareAmount(BigDecimal partnerShareAmount) {
        this.partnerShareAmount = partnerShareAmount;
    }

    public BigDecimal getPartnerWinCommAmount() {
        return this.partnerWinCommAmount;
    }

    public void setPartnerWinCommAmount(BigDecimal partnerWinCommAmount) {
        this.partnerWinCommAmount = partnerWinCommAmount;
    }

    public BigDecimal getRate() {
        return this.rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public LocalDate getReportDate() {
        return this.reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public BigDecimal getSeniorComm() {
        return this.seniorComm;
    }

    public void setSeniorComm(BigDecimal seniorComm) {
        this.seniorComm = seniorComm;
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

    public BigDecimal getSeniorShare() {
        return this.seniorShare;
    }

    public void setSeniorShare(BigDecimal seniorShare) {
        this.seniorShare = seniorShare;
    }

    public BigDecimal getSeniorShareAmount() {
        return this.seniorShareAmount;
    }

    public void setSeniorShareAmount(BigDecimal seniorShareAmount) {
        this.seniorShareAmount = seniorShareAmount;
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

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getWalletTime() {
        return this.walletTime;
    }

    public void setWalletTime(LocalDateTime walletTime) {
        this.walletTime = walletTime;
    }

    public BigDecimal getWinLossAmount() {
        return this.winLossAmount;
    }

    public void setWinLossAmount(BigDecimal winLossAmount) {
        this.winLossAmount = winLossAmount;
    }

    public String getWinNingId() {
        return this.winNingId;
    }

    public void setWinNingId(String string) {
        this.winNingId = string;
    }

    public int getLuckyStatus() {
        return luckyStatus;
    }

    public void setLuckyStatus(int luckyStatus) {
        this.luckyStatus = luckyStatus;
    }

}