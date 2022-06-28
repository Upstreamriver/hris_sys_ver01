package cn.com.djin.springboot.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author djin
 *    ComPhoto实体类
 * @date 2022-05-23 20:18:11
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@ApiModel(description = "企业图片")
public class ComPhoto implements Serializable{

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "岗位id")
    private Integer id;
    @ApiModelProperty(value = "企业id")
    private Integer ci_id;
    @ApiModelProperty(value = "图片位置")
    private Integer photoPlace;
    @ApiModelProperty(value = "图片展示状态")
    private Integer status;


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
     * 设置：图片位置
     */
    public void setphotoPlace(Integer photoPlace) {
        this.photoPlace = photoPlace;
    }
    /**
     * 获取：图片位置
     */
    public Integer getphotoPlace() {
        return photoPlace;
    }
    /**
     * 获取：图片展示状态
     */
    public void setstatus(Integer status) {
        this.status = status;
    }
    /**
     * 获取：图片展示状态
     */
    public Integer getstatus() {
        return status;
    }
    @Override
    public String toString() {
        return  ReflectionToStringBuilder.toString(this);
    }

}