package cn.com.djin.springboot.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author djin
 *    CollegeMessage实体类
 * @date 2022-05-23 20:18:11
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@ApiModel(description = "大学信息")
public class CollegeMessage implements Serializable{

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "学生id")
    private Integer id;
    @ApiModelProperty(value = "学生id")
    private Integer sc_id;
    @ApiModelProperty(value = "大学名称")
    private Integer collegeName;
    @ApiModelProperty(value = "大学电话")
    private Integer collegeFixed;
    @ApiModelProperty(value = "大学联系人")
    private Integer collegePrincipal;
    @ApiModelProperty(value = "大学介绍")
    private Integer collegeIntroduction;
    @ApiModelProperty(value = "大学网站")
    private Integer collegeWebisite;
    @ApiModelProperty(value = "大学优势")
    private Integer collegeResources;
    @ApiModelProperty(value = "大学邮箱")
    private Integer collegeEmail;
    @ApiModelProperty(value = "审核状态")
    private Integer is_status;
    @ApiModelProperty(value = "是否删除")
    private Integer is_del;


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
     * 设置：学生id
     */
    public void setSc_id(Integer sc_id) {
        this.sc_id = sc_id;
    }
    /**
     * 获取：学生id
     */
    public Integer getSc_id() {
        return sc_id;
    }
    /**
     * 设置：大学名称
     */
    public void setcollegeName(Integer collegeName) {
        this.collegeName = collegeName;
    }
    /**
     * 获取：大学名称
     */
    public Integer getcollegeName() {
        return collegeName;
    }
    /**
     * 设置：大学电话
     */
    public void setcollegeFixed(Integer collegeFixed) {
        this.collegeFixed = collegeFixed;
    }
    /**
     * 获取：大学电话
     */
    public Integer getcollegeFixed() {
        return collegeFixed;
    }
    /**
     * 设置：大学联系人
     */
    public void setcollegePrincipal(Integer collegePrincipal) {
        this.collegePrincipal = collegePrincipal;
    }
    /**
     * 获取：大学联系人
     */
    public Integer getcollegePrincipal() {
        return collegePrincipal;
    }
    /**
     * 设置：大学介绍
     */
    public void setcollegeIntroduction(Integer collegeIntroduction) {
        this.collegeIntroduction = collegeIntroduction;
    }
    /**
     * 获取：大学介绍
     */
    public Integer getcollegeIntroduction() {
        return collegeIntroduction;
    }
    /**
     * 设置：大学网站
     */
    public void setcollegeWebisite(Integer collegeWebisite) {
        this.collegeWebisite = collegeWebisite;
    }
    /**
     * 获取：大学网站
     */
    public Integer getcollegeWebisite() {
        return collegeWebisite;
    }
    /**
     * 设置：大学优势
     */
    public void setcollegeResources(Integer collegeResources) {
        this.collegeResources = collegeResources;
    }
    /**
     * 获取：大学优势
     */
    public Integer getcollegeResources() {
        return collegeResources;
    }
    /**
     * 设置：大学邮箱
     */
    public void setcollegeEmail(Integer collegeEmail) {
        this.collegeEmail = collegeEmail;
    }
    /**
     * 获取：大学邮箱
     */
    public Integer getcollegeEmail() {
        return collegeEmail;
    }
    /**
     * 设置：审核状态
     */
    public void setIs_status(Integer is_status) {
        this.is_status = is_status;
    }
    /**
     * 获取：审核状态
     */
    public Integer getIs_status() { return is_status; }
    /**
     * 设置：是否删除
     */
    public void setIs_del(Integer is_del) {
        this.is_del = is_del;
    }
    /**
     * 获取：是否删除
     */
    public Integer getIs_del() { return is_del; }

    @Override
    public String toString() {
        return  ReflectionToStringBuilder.toString(this);
    }

}

