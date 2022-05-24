package cn.com.djin.springboot.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author djin
 *    ComRecruit实体类
 * @date 2022-05-23 20:18:11
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@ApiModel(description = "岗位信息")
public class ComRecruit implements Serializable{

	  private static final long serialVersionUID = 1L;

	  @ApiModelProperty(value = "招聘要求")
	  private String companyNeed;
	  @ApiModelProperty(value = "工作岗位")
	  private String postInformation;
	  @ApiModelProperty(value = "职业描述")
	  private String jobDescription;
	  @ApiModelProperty(value = "公司名字")
	  private String companyName;
	  @ApiModelProperty(value = "公司介绍")
	  private String companyIntroduce;
	  @ApiModelProperty(value = "薪资")
	  private Integer salary;
	  @ApiModelProperty(value = "电话号码")
	  private String telephone;
	  @ApiModelProperty(value = "岗位id")
	  private Integer id;
	  @ApiModelProperty(value = "企业id")
	  private Integer ci_id;

	  /**
	   * 设置：招聘要求
	   */
	  public void setCompanyNeed(String companyNeed) {
		  this.companyNeed = companyNeed;
	  }
	  /**
	   * 获取：招聘要求
	   */
	  public String getCompanyNeed() {
	   	  return companyNeed;
	  }
	  /**
	   * 设置：工作岗位
	   */
	  public void setPostInformation(String postInformation) {
		  this.postInformation = postInformation;
	  }
	  /**
	   * 获取：工作岗位
	   */
	  public String getPostInformation() {
	   	  return postInformation;
	  }
	  /**
	   * 设置：职业描述
	   */
	  public void setJobDescription(String jobDescription) {
		  this.jobDescription = jobDescription;
	  }
	  /**
	   * 获取：职业描述
	   */
	  public String getJobDescription() {
	   	  return jobDescription;
	  }
	  /**
	   * 设置：公司名字
	   */
	  public void setCompanyName(String companyName) {
		  this.companyName = companyName;
	  }
	  /**
	   * 获取：公司名字
	   */
	  public String getCompanyName() {
	   	  return companyName;
	  }
	  /**
	   * 设置：公司介绍
	   */
	  public void setCompanyIntroduce(String companyIntroduce) {
		  this.companyIntroduce = companyIntroduce;
	  }
	  /**
	   * 获取：公司介绍
	   */
	  public String getCompanyIntroduce() {
	   	  return companyIntroduce;
	  }
	  /**
	   * 设置：薪资
	   */
	  public void setSalary(Integer salary) {
		  this.salary = salary;
	  }
	  /**
	   * 获取：薪资
	   */
	  public Integer getSalary() {
	   	  return salary;
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
	   * 设置：公司招聘id
	   */
	  public void setId(Integer id) {
		  this.id = id;
	  }
	  /**
	   * 获取：公司招聘id
	   */
	  public Integer getId() {
	   	  return id;
	  }

	  public Integer getCi_id() {
		  return ci_id;
	  }

	  public void setCi_id(Integer ci_id) {
		  this.ci_id = ci_id;
	  }

	@Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
