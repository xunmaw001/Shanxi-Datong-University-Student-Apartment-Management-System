package com.entity.model;

import com.entity.SusheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宿舍
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class SusheModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 宿舍名称
     */
    private String susheName;


    /**
     * 宿舍编号
     */
    private String susheUuidNumber;


    /**
     * 宿舍照片
     */
    private String sushePhoto;


    /**
     * 宿舍位置
     */
    private String susheAddress;


    /**
     * 楼层
     */
    private Integer loucengTypes;


    /**
     * 单元
     */
    private Integer danyuanTypes;


    /**
     * 宿舍类型
     */
    private Integer susheTypes;


    /**
     * 宿舍热度
     */
    private Integer susheClicknum;


    /**
     * 宿舍备注
     */
    private String susheContent;


    /**
     * 逻辑删除
     */
    private Integer susheDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：宿舍名称
	 */
    public String getSusheName() {
        return susheName;
    }


    /**
	 * 设置：宿舍名称
	 */
    public void setSusheName(String susheName) {
        this.susheName = susheName;
    }
    /**
	 * 获取：宿舍编号
	 */
    public String getSusheUuidNumber() {
        return susheUuidNumber;
    }


    /**
	 * 设置：宿舍编号
	 */
    public void setSusheUuidNumber(String susheUuidNumber) {
        this.susheUuidNumber = susheUuidNumber;
    }
    /**
	 * 获取：宿舍照片
	 */
    public String getSushePhoto() {
        return sushePhoto;
    }


    /**
	 * 设置：宿舍照片
	 */
    public void setSushePhoto(String sushePhoto) {
        this.sushePhoto = sushePhoto;
    }
    /**
	 * 获取：宿舍位置
	 */
    public String getSusheAddress() {
        return susheAddress;
    }


    /**
	 * 设置：宿舍位置
	 */
    public void setSusheAddress(String susheAddress) {
        this.susheAddress = susheAddress;
    }
    /**
	 * 获取：楼层
	 */
    public Integer getLoucengTypes() {
        return loucengTypes;
    }


    /**
	 * 设置：楼层
	 */
    public void setLoucengTypes(Integer loucengTypes) {
        this.loucengTypes = loucengTypes;
    }
    /**
	 * 获取：单元
	 */
    public Integer getDanyuanTypes() {
        return danyuanTypes;
    }


    /**
	 * 设置：单元
	 */
    public void setDanyuanTypes(Integer danyuanTypes) {
        this.danyuanTypes = danyuanTypes;
    }
    /**
	 * 获取：宿舍类型
	 */
    public Integer getSusheTypes() {
        return susheTypes;
    }


    /**
	 * 设置：宿舍类型
	 */
    public void setSusheTypes(Integer susheTypes) {
        this.susheTypes = susheTypes;
    }
    /**
	 * 获取：宿舍热度
	 */
    public Integer getSusheClicknum() {
        return susheClicknum;
    }


    /**
	 * 设置：宿舍热度
	 */
    public void setSusheClicknum(Integer susheClicknum) {
        this.susheClicknum = susheClicknum;
    }
    /**
	 * 获取：宿舍备注
	 */
    public String getSusheContent() {
        return susheContent;
    }


    /**
	 * 设置：宿舍备注
	 */
    public void setSusheContent(String susheContent) {
        this.susheContent = susheContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getSusheDelete() {
        return susheDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setSusheDelete(Integer susheDelete) {
        this.susheDelete = susheDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
