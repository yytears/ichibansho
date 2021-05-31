package com.jinxiu.business.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.jinxiu.common.annotation.Excel;
import com.jinxiu.common.core.domain.BaseEntity;

/**
 * 客户端信息对象 clientdetails
 * 
 * @author Allen
 * @date 2021-04-12
 */
public class ClientDetails extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String appid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String resourceids;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String appsecret;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String scope;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String granttypes;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String redirecturl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String authorities;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long accessTokenValidity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long refreshTokenValidity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String additionalinformation;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String autoapprovescopes;

    public void setAppid(String appid) 
    {
        this.appid = appid;
    }

    public String getAppid() 
    {
        return appid;
    }
    public void setResourceids(String resourceids) 
    {
        this.resourceids = resourceids;
    }

    public String getResourceids() 
    {
        return resourceids;
    }
    public void setAppsecret(String appsecret) 
    {
        this.appsecret = appsecret;
    }

    public String getAppsecret() 
    {
        return appsecret;
    }
    public void setScope(String scope) 
    {
        this.scope = scope;
    }

    public String getScope() 
    {
        return scope;
    }
    public void setGranttypes(String granttypes) 
    {
        this.granttypes = granttypes;
    }

    public String getGranttypes() 
    {
        return granttypes;
    }
    public void setRedirecturl(String redirecturl) 
    {
        this.redirecturl = redirecturl;
    }

    public String getRedirecturl() 
    {
        return redirecturl;
    }
    public void setAuthorities(String authorities) 
    {
        this.authorities = authorities;
    }

    public String getAuthorities() 
    {
        return authorities;
    }
    public void setAccessTokenValidity(Long accessTokenValidity) 
    {
        this.accessTokenValidity = accessTokenValidity;
    }

    public Long getAccessTokenValidity() 
    {
        return accessTokenValidity;
    }
    public void setRefreshTokenValidity(Long refreshTokenValidity) 
    {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public Long getRefreshTokenValidity() 
    {
        return refreshTokenValidity;
    }
    public void setAdditionalinformation(String additionalinformation) 
    {
        this.additionalinformation = additionalinformation;
    }

    public String getAdditionalinformation() 
    {
        return additionalinformation;
    }
    public void setAutoapprovescopes(String autoapprovescopes) 
    {
        this.autoapprovescopes = autoapprovescopes;
    }

    public String getAutoapprovescopes() 
    {
        return autoapprovescopes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("appid", getAppid())
            .append("resourceids", getResourceids())
            .append("appsecret", getAppsecret())
            .append("scope", getScope())
            .append("granttypes", getGranttypes())
            .append("redirecturl", getRedirecturl())
            .append("authorities", getAuthorities())
            .append("accessTokenValidity", getAccessTokenValidity())
            .append("refreshTokenValidity", getRefreshTokenValidity())
            .append("additionalinformation", getAdditionalinformation())
            .append("autoapprovescopes", getAutoapprovescopes())
            .toString();
    }
}
