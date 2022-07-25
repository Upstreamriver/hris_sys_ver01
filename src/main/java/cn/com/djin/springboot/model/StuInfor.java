package cn.com.djin.springboot.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author djin
 *    StuInfor实体类
 * @date 2022-05-23 20:18:11
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@ApiModel(description = "学生信息")
public class StuInfor implements Serializable{

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "学生id")
    private Integer id;
    @ApiModelProperty(value = "学生姓名")
    private Integer name;
    @ApiModelProperty(value = "年龄")
    private Integer age;
    @ApiModelProperty(value = "户籍")
    private Integer censusRegister;
    @ApiModelProperty(value = "现居地")
    private Integer address;
    @ApiModelProperty(value = "联系电话")
    private Integer phone;
    @ApiModelProperty(value = "邮箱")
    private Integer email;
    @ApiModelProperty(value = "学历")
    private Integer academic;
    @ApiModelProperty(value = "专业")
    private Integer filed;
    @ApiModelProperty(value = "教育范围时间")
    private Integer educationTime;
    @ApiModelProperty(value = "期望岗位")
    private Integer expectedPosition;
    @ApiModelProperty(value = "期望地区")
    private Integer expectedArea;
    @ApiModelProperty(value = "工作经验")
    private Integer experience;
    @ApiModelProperty(value = "从事行业")
    private Integer industey;
    @ApiModelProperty(value = "求职状态")
    private Integer jobStatus;
    @ApiModelProperty(value = "期望薪资")
    private Integer expectedSalary;
    @ApiModelProperty(value = "到岗时间")
    private Integer reachTime;
    @ApiModelProperty(value = "个人荣誉")
    private Integer personalHonor;
    @ApiModelProperty(value = "个人简介")
    private Integer personalProfile;


    /**
     * 设置：学生id
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * 获取：学生id
     */
    public Integer getId() {
        return id;
    }
    /**
     * 设置：学生姓名
     */
    public void setName(Integer name) {
        this.name = name;
    }
    /**
     * 获取：学生姓名
     */
    public Integer getName() {
        return name;
    }
    /**
     * 设置：年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }
    /**
     * 获取：年龄
     */
    public Integer getAge() {
        return age;
    }
    /**
     * 设置：户籍
     */
    public void setCensusRegister(Integer censusRegister) {
        this.censusRegister = censusRegister;
    }
    /**
     * 获取：户籍
     */
    public Integer getCensusRegister() {
        return censusRegister;
    }
    /**
     * 设置：现居地
     */
    public void setAddress(Integer address) {
        this.address = address;
    }
    /**
     * 获取：现居地
     */
    public Integer getAddress() {
        return address;
    }
    /**
     * 设置：联系电话
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    /**
     * 获取：联系电话
     */
    public Integer getPhone() {
        return phone;
    }
    /**
     * 设置：邮箱
     */
    public void setEmail(Integer email) {
        this.email = email;
    }
    /**
     * 获取：邮箱
     */
    public Integer getEmail() {
        return email;
    }
    /**
     * 设置：学历
     */
    public void setAcademic(Integer academic) {
        this.academic = academic;
    }
    /**
     * 获取：学历
     */
    public Integer getAcademic() {
        return academic;
    }
    /**
     * 设置：专业
     */
    public void setFiled(Integer filed) {
        this.filed = filed;
    }
    /**
     * 获取：专业
     */
    public Integer getFiled() {
        return filed;
    }
    /**
     * 设置：教育范围时间
     */
    public void setEducationTime(Integer educationTime) {
        this.educationTime = educationTime;
    }
    /**
     * 获取：教育范围时间
     */
    public Integer getEducationTime() {
        return educationTime;
    }
    /**
     * 设置：期望岗位
     */
    public void setExpectedPosition(Integer expectedPosition) {
        this.expectedPosition = expectedPosition;
    }
    /**
     * 获取：期望岗位
     */
    public Integer getExpectedPosition() {
        return expectedPosition;
    }
    /**
     * 设置：期望地区
     */
    public void setExpectedArea(Integer expectedArea) {
        this.expectedArea = expectedArea;
    }
    /**
     * 获取：期望地区
     */
    public Integer getExpectedArea() {
        return expectedArea;
    }
    /**
     * 设置：工作经验
     */
    public void setExperience(Integer experience) {
        this.experience = experience;
    }
    /**
     * 获取：工作经验
     */
    public Integer getExperience() {
        return experience;
    }
    /**
     * 设置：从事行业
     */
    public void setIndustey(Integer industey) {
        this.industey = industey;
    }
    /**
     * 获取：从事行业
     */
    public Integer getIndustey() {
        return industey;
    }
    /**
     * 设置：求职状态
     */
    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }
    /**
     * 获取：求职状态
     */
    public Integer getJobStatus() {
        return jobStatus;
    }
    /**
     * 设置：期望薪资
     */
    public void setExpectedSalary(Integer expectedSalary) {
        this.expectedSalary = expectedSalary;
    }
    /**
     * 获取：期望薪资
     */
    public Integer getExpectedSalary() {
        return expectedSalary;
    }
    /**
     * 设置：到岗时间
     */
    public void setReachTime(Integer reachTime) {
        this.reachTime = reachTime;
    }
    /**
     * 获取：到岗时间
     */
    public Integer getReachTime() {
        return reachTime;
    }
    /**
     * 设置：个人荣誉
     */
    public void setPersonalHonor(Integer personalHonor) {
        this.personalHonor = personalHonor;
    }
    /**
     * 获取：个人荣誉
     */
    public Integer getPersonalHonor() {
        return personalHonor;
    }
    /**
     * 设置：个人简介
     */
    public void setPersonalProfile(Integer personalProfile) {
        this.personalProfile = personalProfile;
    }
    /**
     * 获取：个人简介
     */
    public Integer getPersonalProfile() {
        return personalProfile;
    }

    @Override
    public String toString() {
        return  ReflectionToStringBuilder.toString(this);
    }

}