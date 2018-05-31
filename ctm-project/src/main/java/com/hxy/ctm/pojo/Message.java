package com.hxy.ctm.pojo;

import java.util.Date;

public class Message {
    private Integer id;

    private String userId;

    private String messageContext;

    private String messageComment;

    private String messageStarCount;

    private Date createTime;

    private Date modifyTime;

    public Message(Integer id, String userId, String messageContext, String messageComment, String messageStarCount, Date createTime, Date modifyTime) {
        this.id = id;
        this.userId = userId;
        this.messageContext = messageContext;
        this.messageComment = messageComment;
        this.messageStarCount = messageStarCount;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    public Message() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMessageContext() {
        return messageContext;
    }

    public void setMessageContext(String messageContext) {
        this.messageContext = messageContext == null ? null : messageContext.trim();
    }

    public String getMessageComment() {
        return messageComment;
    }

    public void setMessageComment(String messageComment) {
        this.messageComment = messageComment == null ? null : messageComment.trim();
    }

    public String getMessageStarCount() {
        return messageStarCount;
    }

    public void setMessageStarCount(String messageStarCount) {
        this.messageStarCount = messageStarCount == null ? null : messageStarCount.trim();
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