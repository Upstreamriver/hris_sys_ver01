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

	  @ApiModelProperty(value = "学历要求")
	  private String educationNeed;
	  @ApiModelProperty(value = "经验要求")
	  private String experienceNeed;
	  @ApiModelProperty(value = "工作岗位")
	  private String postInformation;
	  @ApiModelProperty(value = "职业描述")
	  private String jobDescription;
	  @ApiModelProperty(value = "公司名字")
	  private String companyName;
	  @ApiModelProperty(value = "公司介绍")
	  private String companyIntroduce;
	  @ApiModelProperty(value = "基本薪酬")
	  private Integer baseSalary;
	  @ApiModelProperty(value = "综合薪资")
	  private Integer totalSalary;
	  @ApiModelProperty(value = "电话号码")
	  private String telephone;
	  @ApiModelProperty(value = "职位状态")
	  private String jobStatus;
	  @ApiModelProperty(value = "工作区域")
	  private String jobPlace;
	  @ApiModelProperty(value = "公司福利")
	  private String companyBenefits;
	  @ApiModelProperty(value = "性别要求")
	  private String jobSex;
	  @ApiModelProperty(value = "岗位id")
	  private Integer id;
	  @ApiModelProperty(value = "企业id")
	  private Integer ci_id;
	  @ApiModelProperty(value = "招聘人数")
	  private Integer jobperson;

	  /**
	   * 设置：学历要求
	   */
	  public void setEducationNeed(String educationNeed) {
		  this.educationNeed = educationNeed;
	  }
	  /**
	   * 获取：学历要求
	   */
	  public String getEducationNeed() {
	   	  return educationNeed;
	  }
	  /**
	   * 设置：经验要求
	   */
	  public void setExperienceNeed(String experienceNeed) {
		this.experienceNeed = experienceNeed;
	}
	  /**
	   * 获取：经验要求
	   */
	  public String getExperienceNeed() {
		return experienceNeed;
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
	   * 设置：基本薪酬
	   */
	  public void setBaseSalary(Integer baseSalary) {
		  this.baseSalary = baseSalary;
	  }
	  /**
	   * 获取：基本薪酬
	   */
	  public Integer getBaseSalary() {
	   	  return baseSalary;
	  }
	  /**
	   * 设置：综合薪资
	   */
	  public void setTotalSalary(Integer totalSalary) {
		this.totalSalary = totalSalary;
	}
	  /**
	   * 获取：综合薪资
	   */
	  public Integer getTotalSalary() {
		return totalSalary;
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
	   * 设置：职位状态
	   */
	  public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}
	  /**
	   * 获取：职位状态
	  */
	  public String JobStatus() {
		return jobStatus;
	}
	  /**
	   * 设置：工作区域
	   */
	  public void setJobPlace(String jobPlace) {
		this.jobPlace = jobPlace;
	}
	  /**
	   * 获取：工作区域
	   */
	  public String getJobPlace() {
		return jobPlace;
	}
	  /**
	   * 设置：公司福利
	   */
	  public void setCompanyBenefits(String companyBenefits) { this.companyBenefits = companyBenefits; }
	  /**
	   * 获取：公司福利
	   */
	  public String getCompanyBenefits() {
		return companyBenefits;
	}
	  /**
	   * 设置：性别要求
	   */
	  public void setJobSex(String jobSex) {
		this.jobSex = jobSex;
	}
	  /**
	   * 获取：性别要求
	   */
	  public String getJobSex() {
		return jobSex;
	}
	  /**
	   * 设置：岗位id
	   */
	  public void setId(Integer id) {
		  this.id = id;
	  }
	  /**
	   * 获取：岗位id
	   */
	  public Integer getId() {
	   	  return id;
	  }
	  /**
	   * 获取：企业id
	   */
	  public void setCi_id(Integer ci_id) {
		  this.ci_id = ci_id;
	  }
	  /**
	   * 获取：企业id
	   */
	  public Integer getCi_id() {
		  return ci_id;
	  }
	  /**
	   * 设置：招聘人数
	   */
	  public void setJobperson(Integer jobperson) {
		this.jobperson = jobperson;
	}
	  /**
	   * 获取：招聘人数
	   */
	  public Integer getJobperson() {
		return jobperson;
	}


	@Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
