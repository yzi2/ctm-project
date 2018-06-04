package com.hxy.ctm.pojo;

import java.util.Date;

public class Information {
    private Integer id;

    private String informationTitle;

    private String informationOutline;

    private String informationContent;

    private String informationComment;

    private Long informationStarCount;

    private Date createTime;

    private Date modifyTime;

    public Information(Integer id, String informationTitle, String informationOutline, String informationContent, String informationComment, Long informationStarCount, Date createTime, Date modifyTime) {
        this.id = id;
        this.informationTitle = informationTitle;
        this.informationOutline = informationOutline;
        this.informationContent = informationContent;
        this.informationComment = informationComment;
        this.informationStarCount = informationStarCount;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    public Information() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInformationTitle() {
        return informationTitle;
    }

    public void setInformationTitle(String informationTitle) {
        this.informationTitle = informationTitle == null ? null : informationTitle.trim();
    }

    public String getInformationOutline() {
        return informationOutline;
    }

    public void setInformationOutline(String informationOutline) {
        this.informationOutline = informationOutline == null ? null : informationOutline.trim();
    }

    public String getInformationContent() {
        return informationContent;
    }

    public void setInformationContent(String informationContent) {
        this.informationContent = informationContent == null ? null : informationContent.trim();
    }

    public String getInformationComment() {
        return informationComment;
    }

    public void setInformationComment(String informationComment) {
        this.informationComment = informationComment == null ? null : informationComment.trim();
    }

    public Long getInformationStarCount() {
        return informationStarCount;
    }

    public void setInformationStarCount(Long informationStarCount) {
        this.informationStarCount = informationStarCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}