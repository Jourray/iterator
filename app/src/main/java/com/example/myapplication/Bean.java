package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * author : ZhiG
 * e-mail : 1120121044@163.com
 * date   : 2019/9/209:12
 * desc   :
 * package: StuSpace:
 */
public class Bean {
    /**
     * awayGround : 明尼苏达联
     * awayHistory : 10|3|1|6
     * awayIcon :
     * change : 8811
     * data : 188595
     * homeCourt : 洛杉矶FC
     * homeHistory : 0|0|0|0
     * homeIcon :
     * homeVsAway : 0|0|0|0
     * is : 1
     * isCollect : false
     * leagueId : 1114
     * leagueName : 美职
     * matchProb : 3,1
     * matchRe : 0
     * matchSn : 周日060
     * matchStatus : 2
     * matchTime : 2019-09-02
     * model : 132
     * period : 20190902060
     * prob : 93
     * rowKey : 1111406829012
     * update : 0
     */
    private String awayGround;
    private String awayHistory;
    private String awayIcon;
    private String change;
    private String data;
    private String homeCourt;
    private String homeHistory;
    private String homeIcon;
    private String homeVsAway;
    private String is;
    private boolean isCollect;
    private String leagueId;
    private String leagueName;
    private String matchProb;
    private String matchRe;
    private String matchSn;
    private String matchStatus;
    private String matchTime;
    private String model;
    private String period;
    private String prob;
    private String rowKey;
    private String update;

    @Override
    public String toString() {
        return "Bean{" +
                "awayGround='" + awayGround + '\'' +
                ", awayHistory='" + awayHistory + '\'' +
                ", awayIcon='" + awayIcon + '\'' +
                ", change='" + change + '\'' +
                ", data='" + data + '\'' +
                ", homeCourt='" + homeCourt + '\'' +
                ", homeHistory='" + homeHistory + '\'' +
                ", homeIcon='" + homeIcon + '\'' +
                ", homeVsAway='" + homeVsAway + '\'' +
                ", is='" + is + '\'' +
                ", isCollect=" + isCollect +
                ", leagueId='" + leagueId + '\'' +
                ", leagueName='" + leagueName + '\'' +
                ", matchProb='" + matchProb + '\'' +
                ", matchRe='" + matchRe + '\'' +
                ", matchSn='" + matchSn + '\'' +
                ", matchStatus='" + matchStatus + '\'' +
                ", matchTime='" + matchTime + '\'' +
                ", model='" + model + '\'' +
                ", period='" + period + '\'' +
                ", prob='" + prob + '\'' +
                ", rowKey='" + rowKey + '\'' +
                ", update='" + update + '\'' +
                '}';
    }



    public String getAwayGround() {
        return awayGround;
    }

    public void setAwayGround(String awayGround) {
        this.awayGround = awayGround;
    }

    public String getAwayHistory() {
        return awayHistory;
    }

    public void setAwayHistory(String awayHistory) {
        this.awayHistory = awayHistory;
    }

    public String getAwayIcon() {
        return awayIcon;
    }

    public void setAwayIcon(String awayIcon) {
        this.awayIcon = awayIcon;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHomeCourt() {
        return homeCourt;
    }

    public void setHomeCourt(String homeCourt) {
        this.homeCourt = homeCourt;
    }

    public String getHomeHistory() {
        return homeHistory;
    }

    public void setHomeHistory(String homeHistory) {
        this.homeHistory = homeHistory;
    }

    public String getHomeIcon() {
        return homeIcon;
    }

    public void setHomeIcon(String homeIcon) {
        this.homeIcon = homeIcon;
    }

    public String getHomeVsAway() {
        return homeVsAway;
    }

    public void setHomeVsAway(String homeVsAway) {
        this.homeVsAway = homeVsAway;
    }

    public String getIs() {
        return is;
    }

    public void setIs(String is) {
        this.is = is;
    }

    public boolean isCollect() {
        return isCollect;
    }

    public void setCollect(boolean collect) {
        isCollect = collect;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getMatchProb() {
        return matchProb;
    }

    public void setMatchProb(String matchProb) {
        this.matchProb = matchProb;
    }

    public String getMatchRe() {
        return matchRe;
    }

    public void setMatchRe(String matchRe) {
        this.matchRe = matchRe;
    }

    public String getMatchSn() {
        return matchSn;
    }

    public void setMatchSn(String matchSn) {
        this.matchSn = matchSn;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getProb() {
        return prob;
    }

    public void setProb(String prob) {
        this.prob = prob;
    }

    public String getRowKey() {
        return rowKey;
    }

    public void setRowKey(String rowKey) {
        this.rowKey = rowKey;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }
}
