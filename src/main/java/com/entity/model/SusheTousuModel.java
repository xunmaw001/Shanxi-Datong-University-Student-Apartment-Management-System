package com.entity.model;

import com.entity.SusheTousuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宿舍投诉
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class SusheTousuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 投诉编号
     */
    private String susheTousuUuidNumber;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 宿舍
     */
    private Integer susheId;


    /**
     * 投诉事由
     */
    private String susheTousuText;


    /**
     * 投诉时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 投诉类型
     */
    private Integer susheTousuTypes;


    /**
     * 投诉状态
     */
    private Integer susheTousuZhuangtaiTypes;


    /**
     * 投诉回复
     */
    private String xueshengKaoqinContent;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：投诉编号
	 */
    public String getSusheTousuUuidNumber() {
        return susheTousuUuidNumber;
    }


    /**
	 * 设置：投诉编号
	 */
    public void setSusheTousuUuidNumber(String susheTousuUuidNumber) {
        this.susheTousuUuidNumber = susheTousuUuidNumber;
    }
    /**
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：宿舍
	 */
    public Integer getSusheId() {
        return susheId;
    }


    /**
	 * 设置：宿舍
	 */
    public void setSusheId(Integer susheId) {
        this.susheId = susheId;
    }
    /**
	 * 获取：投诉事由
	 */
    public String getSusheTousuText() {
        return susheTousuText;
    }


    /**
	 * 设置：投诉事由
	 */
    public void setSusheTousuText(String susheTousuText) {
        this.susheTousuText = susheTousuText;
    }
    /**
	 * 获取：投诉时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：投诉时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：投诉类型
	 */
    public Integer getSusheTousuTypes() {
        return susheTousuTypes;
    }


    /**
	 * 设置：投诉类型
	 */
    public void setSusheTousuTypes(Integer susheTousuTypes) {
        this.susheTousuTypes = susheTousuTypes;
    }
    /**
	 * 获取：投诉状态
	 */
    public Integer getSusheTousuZhuangtaiTypes() {
        return susheTousuZhuangtaiTypes;
    }


    /**
	 * 设置：投诉状态
	 */
    public void setSusheTousuZhuangtaiTypes(Integer susheTousuZhuangtaiTypes) {
        this.susheTousuZhuangtaiTypes = susheTousuZhuangtaiTypes;
    }
    /**
	 * 获取：投诉回复
	 */
    public String getXueshengKaoqinContent() {
        return xueshengKaoqinContent;
    }


    /**
	 * 设置：投诉回复
	 */
    public void setXueshengKaoqinContent(String xueshengKaoqinContent) {
        this.xueshengKaoqinContent = xueshengKaoqinContent;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
