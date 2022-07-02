package cn.com.djin.springboot.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author djin
 *    SchoolMessage实体类
 * @date 2022-05-23 20:18:11
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@ApiModel(description = "学校信息")
public class SchoolMessage implements Serializable{

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "学生id")
    private Integer id;
    @ApiModelProperty(value = "学生姓名")
    private Integer name;
    @ApiModelProperty(value = "学术要求")
    private Integer academicRequirements;
    @ApiModelProperty(value = "类型")
    private Integer type;
    @ApiModelProperty(value = "在校时间")
    private Integer schoolTime;
    @ApiModelProperty(value = "密码")
    private Integer code;
    @ApiModelProperty(value = "地址")
    private Integer address;
    @ApiModelProperty(value = "介绍")
    private Integer introduction;
    @ApiModelProperty(value = "图标")
    private Integer avatar;
    @ApiModelProperty(value = "电话")
    private Integer phone;
    @ApiModelProperty(value = "优势")
    private Integer resources;
    @ApiModelProperty(value = "创建时间")
    private Integer createtime;
    @ApiModelProperty(value = "更新时间")
    private Integer updatetime;
    @ApiModelProperty(value = "审核状态")
    private Integer is_status;
    @ApiModelProperty(value = "是否删除")
    private Integer is_del;
    @ApiModelProperty(value = "院校电话")
    private Integer fixed;
    @ApiModelProperty(value = "院校邮箱")
    private Integer email;
    @ApiModelProperty(value = "院校联系人")
    private Integer principal;
    @ApiModelProperty(value = "院校网站")
    private Integer webisite;


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
     * 设置：学术要求
     */
    public void setAcademicRequirements(Integer academicRequirements) {
        this.academicRequirements = academicRequirements;
    }
    /**
     * 获取：学术要求
     */
    public Integer getAcademicRequirements() {
        return academicRequirements;
    }
    /**
     * 设置：类型
     */
    public void setType(Integer type) {
        this.type = type;
    }
    /**
     * 获取：类型
     */
    public Integer getType() {
        return type;
    }
    /**
     * 设置：在校时间
     */
    public void setSchoolTime(Integer schoolTime) {
        this.schoolTime = schoolTime;
    }
    /**
     * 获取：在校时间
     */
    public Integer getSchoolTime() {
        return schoolTime;
    }
    /**
     * 设置：密码
     */
    public void setCode(Integer code) {
        this.code = code;
    }
    /**
     * 获取：密码
     */
    public Integer getCode() {
        return code;
    }
    /**
     * 设置：地址
     */
    public void setAddress(Integer address) {
        this.address = address;
    }
    /**
     * 获取：地址
     */
    public Integer getAddress() {
        return address;
    }
    /**
     * 设置：介绍
     */
    public void setIntroduction(Integer introduction) {
        this.introduction = introduction;
    }
    /**
     * 获取：介绍
     */
    public Integer getIntroduction() {
        return introduction;
    }
    /**
     * 设置：图标
     */
    public void setAvatar(Integer avatar) {
        this.avatar = avatar;
    }
    /**
     * 获取：图标
     */
    public Integer getAvatar() {
        return avatar;
    }
    /**
     * 设置：电话
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    /**
     * 获取：电话
     */
    public Integer getPhone() { return phone; }
    /**
     * 设置：优势
     */
    public void setResources(Integer resources) {
        this.resources = resources;
    }
    /**
     * 获取：优势
     */
    public Integer getResources() { return resources; }
    /**
     * 设置：创建时间
     */
    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }
    /**
     * 获取：创建时间
     */
    public Integer getCreatetime() { return createtime; }
    /**
     * 设置：更新时间
     */
    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }
    /**
     * 获取：更新时间
     */
    public Integer getUpdatetime() { return updatetime; }
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
    /**
     * 设置：院校电话
     */
    public void setFixed(Integer fixed) {
        this.fixed = fixed;
    }
    /**
     * 获取：院校电话
     */
    public Integer getFixed() { return fixed; }
    /**
     * 设置：院校邮箱
     */
    public void setEmail(Integer email) {
        this.email = email;
    }
    /**
     * 获取：院校邮箱
     */
    public Integer getEmail() { return email; }
    /**
     * 设置：院校联系人
     */
    public void setPrincipal(Integer principal) {
        this.principal = principal;
    }
    /**
     * 获取：院校联系人
     */
    public Integer getPrincipal() { return principal; }
    /**
     * 设置：院校网站
     */
    public void setWebisite(Integer webisite) {
        this.webisite = webisite;
    }
    /**
     * 获取：院校网站
     */
    public Integer getWebisite() { return webisite; }

    @Override
    public String toString() {
        return  ReflectionToStringBuilder.toString(this);
    }

}