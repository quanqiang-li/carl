package com.carl.user.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "f_user")
public class User {
    /**
     * 主键
     */
    @Id
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 登录名
     */
    @Column(name = "LOGIN_NAME")
    private String loginName;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 状态代码
     */
    @Column(name = "STATUS_CODE")
    private String statusCode;

    /**
     * 状态名称
     */
    @Column(name = "STATUS_NAME")
    private String statusName;

    /**
     * 注册时间
     */
    @Column(name = "REGISTER_TIME")
    private Date registerTime;

    /**
     * 当前登录时间
     */
    @Column(name = "CURRENT_LOGIN_TIME")
    private Date currentLoginTime;

    /**
     * 上次登录时间
     */
    @Column(name = "LAST_LOGIN_TIME")
    private Date lastLoginTime;

    /**
     * 登录错误重试次数
     */
    @Column(name = "RETRY")
    private Integer retry;

    /**
     * 登录错误3次锁定时间
     */
    @Column(name = "LOCK_TIME")
    private Date lockTime;

    /**
     * 实名认证标识
     */
    @Column(name = "REALNAME_FLAG")
    private String realnameFlag;

    /**
     * 税务授权标识
     */
    @Column(name = "TAX_AUTH_FLAG")
    private String taxAuthFlag;

    /**
     * 站点代码
     */
    @Column(name = "SITE_CODE")
    private String siteCode;

    /**
     * 银行账号接收手机号
     */
    @Column(name = "BANK_MOBILE")
    private String bankMobile;

    /**
     * 非实名情况下，记录纳税人识别号
     */
    @Column(name = "NSRSBH")
    private String nsrsbh;

    /**
     * 获取主键
     *
     * @return USER_ID - 主键
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置主键
     *
     * @param userId 主键
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取登录名
     *
     * @return LOGIN_NAME - 登录名
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录名
     *
     * @param loginName 登录名
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取状态代码
     *
     * @return STATUS_CODE - 状态代码
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态代码
     *
     * @param statusCode 状态代码
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    /**
     * 获取状态名称
     *
     * @return STATUS_NAME - 状态名称
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * 设置状态名称
     *
     * @param statusName 状态名称
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    /**
     * 获取注册时间
     *
     * @return REGISTER_TIME - 注册时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置注册时间
     *
     * @param registerTime 注册时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取当前登录时间
     *
     * @return CURRENT_LOGIN_TIME - 当前登录时间
     */
    public Date getCurrentLoginTime() {
        return currentLoginTime;
    }

    /**
     * 设置当前登录时间
     *
     * @param currentLoginTime 当前登录时间
     */
    public void setCurrentLoginTime(Date currentLoginTime) {
        this.currentLoginTime = currentLoginTime;
    }

    /**
     * 获取上次登录时间
     *
     * @return LAST_LOGIN_TIME - 上次登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置上次登录时间
     *
     * @param lastLoginTime 上次登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取登录错误重试次数
     *
     * @return RETRY - 登录错误重试次数
     */
    public Integer getRetry() {
        return retry;
    }

    /**
     * 设置登录错误重试次数
     *
     * @param retry 登录错误重试次数
     */
    public void setRetry(Integer retry) {
        this.retry = retry;
    }

    /**
     * 获取登录错误3次锁定时间
     *
     * @return LOCK_TIME - 登录错误3次锁定时间
     */
    public Date getLockTime() {
        return lockTime;
    }

    /**
     * 设置登录错误3次锁定时间
     *
     * @param lockTime 登录错误3次锁定时间
     */
    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    /**
     * 获取实名认证标识
     *
     * @return REALNAME_FLAG - 实名认证标识
     */
    public String getRealnameFlag() {
        return realnameFlag;
    }

    /**
     * 设置实名认证标识
     *
     * @param realnameFlag 实名认证标识
     */
    public void setRealnameFlag(String realnameFlag) {
        this.realnameFlag = realnameFlag == null ? null : realnameFlag.trim();
    }

    /**
     * 获取税务授权标识
     *
     * @return TAX_AUTH_FLAG - 税务授权标识
     */
    public String getTaxAuthFlag() {
        return taxAuthFlag;
    }

    /**
     * 设置税务授权标识
     *
     * @param taxAuthFlag 税务授权标识
     */
    public void setTaxAuthFlag(String taxAuthFlag) {
        this.taxAuthFlag = taxAuthFlag == null ? null : taxAuthFlag.trim();
    }

    /**
     * 获取站点代码
     *
     * @return SITE_CODE - 站点代码
     */
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * 设置站点代码
     *
     * @param siteCode 站点代码
     */
    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode == null ? null : siteCode.trim();
    }

    /**
     * 获取银行账号接收手机号
     *
     * @return BANK_MOBILE - 银行账号接收手机号
     */
    public String getBankMobile() {
        return bankMobile;
    }

    /**
     * 设置银行账号接收手机号
     *
     * @param bankMobile 银行账号接收手机号
     */
    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile == null ? null : bankMobile.trim();
    }

    /**
     * 获取非实名情况下，记录纳税人识别号
     *
     * @return NSRSBH - 非实名情况下，记录纳税人识别号
     */
    public String getNsrsbh() {
        return nsrsbh;
    }

    /**
     * 设置非实名情况下，记录纳税人识别号
     *
     * @param nsrsbh 非实名情况下，记录纳税人识别号
     */
    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh == null ? null : nsrsbh.trim();
    }
}