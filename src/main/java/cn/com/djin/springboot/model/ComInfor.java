package cn.com.djin.springboot.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author djin
 *    ComInfor实体类
 * @date 2022-05-23 20:18:11
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@ApiModel(description = "企业信息")
public class ComInfor implements Serializable{

	  private static final long serialVersionUID = 1L;

	  @ApiModelProperty(value = "企业信息id")
	  private Integer id;
	  @ApiModelProperty(value = "企业账号")
	  private String companyAccount;
	  @ApiModelProperty(value = "企业名字")
	  private String companyName;
	  @ApiModelProperty(value = "人事负责人名字")
	  private String personnelName;
	   @ApiModelProperty(value = "企业法人")
	  private String businessName;
	  @ApiModelProperty(value = "企业地址")
	  private String address;
	  @ApiModelProperty(value = "企业介绍")
	  private String companyIntroduce;
	  @ApiModelProperty(value = "企业邮箱")
	  private String companyMailbox;
	  @ApiModelProperty(value = "电话号码")
	  private String telephone;
	  @ApiModelProperty(value = "企业类型")
	  private String companyType;
	  @ApiModelProperty(value = "行业")
	  private String industry;
	  @ApiModelProperty(value = "企业规模")
	  private String companySize;
	  @ApiModelProperty(value = "企业性质")
	  private String companyNature;
	  @ApiModelProperty(value = "企业座机号码")
	  private String companyPhone;
	  /**
	   * 设置：企业信息表id
	   */
	  public void setId(Integer id) {
		  this.id = id;
	  }
	  /**
	   * 获取：企业信息表id
	   */
	  public Integer getId() {
	   	  return id;
	  }
	  /**
	   * 设置：企业账号
	   */
	  public void setCompanyAccount(String companyAccount) {
		  this.companyAccount = companyAccount;
	  }
	  /**
	   * 获取：企业账号
	   */
	  public String getCompanyAccount() {
	   	  return companyAccount;
	  }
	  /**
	   * 设置：企业名字
	   */
	  public void setCompanyName(String companyName) {
		  this.companyName = companyName;
	  }
	  /**
	   * 获取：企业名字
	   */
	  public String getCompanyName() { return companyName; }
	  /**
	   * 设置：人事负责人名字
	   */
	  public void setPersonnelName(String personnelName) {
		  this.personnelName = personnelName;
	  }
	  /**
	   * 获取：人事负责人名字
	   */
	  public String getPersonnelName() { return personnelName; }
	  /**
	   * 设置：企业法人
	   */
	  public void setBusinessName(String businessName) {
		  this.businessName = businessName;
	  }
	  /**
	   * 获取：企业法人
	   */
	  public String getBusinessName() {
	   	  return businessName;
	  }
	  /**
	   * 设置：企业地址
	   */
	  public void setAddress(String address) {
		  this.address = address;
	  }
	  /**
	   * 获取：企业地址
	   */
	  public String getAddress() {
	   	  return address;
	  }
	  /**
	   * 设置：企业介绍
	   */
	  public void setCompanyIntroduce(String companyIntroduce) {
		  this.companyIntroduce = companyIntroduce;
	  }
	  /**
	   * 获取：企业介绍
	   */
	  public String getCompanyIntroduce() {
	   	  return companyIntroduce;
	  }
	  /**
	   * 设置：企业邮箱
	   */
	  public void setCompanyMailbox(String companyMailbox) {
		  this.companyMailbox = companyMailbox;
	  }
	  /**
	   * 获取：企业邮箱
	   */
	  public String getCompanyMailbox() {
	   	  return companyMailbox;
	  }
	  /**
	   * 设置：电话号码
	   */
	  public void setTelephone(String telephone) {
		  this.telephone = telephone;
	  }
	  /**
	   * 获取：电话号码
	   */
	  public String getTelephone() {
	   	  return telephone;
	  }
	  /**
	   * 设置：企业类型
	   */
	  public void setCompanyType(String companyType) {
		  this.companyType = companyType;
	  }
	  /**
	   * 获取：企业类型
	   */
	  public String getCompanyType() {
	   	  return companyType;
	  }
	  /**
	   * 设置：行业
	   */
	  public void setIndustry(String industry) {
		  this.industry = industry;
	  }
	  /**
	   * 获取：行业
	   */
	  public String getIndustry() {
	   	  return industry;
	  }
	  /**
	   * 设置：企业规模
	   */
	  public void setCompanySize(String companySize) {
		this.companySize = companySize;
	}
	  /**
	   * 获取：企业规模
	  */
	  public String getCompanySize() {
		return companySize;
	}
	  /**
	   * 设置：企业性质
	   */
	  public void setCompanyNature(String companyNature) {
		this.companyNature = companyNature;
	}
	  /**
	   * 获取：企业性质
	   */
	  public String getCompanyNature() {
		return companyNature;
	}
	  /**
	   * 设置：企业座机号码
	   */
	  public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}
	  /**
	   * 获取：企业座机号码
	   */
	  public String getCompanyPhone() {
		return companyPhone;
	}

	 
	  @Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
