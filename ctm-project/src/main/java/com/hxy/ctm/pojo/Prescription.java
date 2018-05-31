package com.hxy.ctm.pojo;

import java.util.Date;

public class Prescription {
    private Integer id;

    private String prescriptionName;

    private String prescriptionComposition;

    private String prescriptionFunction;

    private String prescriptionIndications;

    private String prescriptionClinic;

    private String prescriptionApply;

    private String prescriptionUse;

    private String prescriptionAttention;

    private Date createTime;

    private Date modifyTime;

    public Prescription(Integer id, String prescriptionName, String prescriptionComposition, String prescriptionFunction, String prescriptionIndications, String prescriptionClinic, String prescriptionApply, String prescriptionUse, String prescriptionAttention, Date createTime, Date modifyTime) {
        this.id = id;
        this.prescriptionName = prescriptionName;
        this.prescriptionComposition = prescriptionComposition;
        this.prescriptionFunction = prescriptionFunction;
        this.prescriptionIndications = prescriptionIndications;
        this.prescriptionClinic = prescriptionClinic;
        this.prescriptionApply = prescriptionApply;
        this.prescriptionUse = prescriptionUse;
        this.prescriptionAttention = prescriptionAttention;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    public Prescription() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrescriptionName() {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName == null ? null : prescriptionName.trim();
    }

    public String getPrescriptionComposition() {
        return prescriptionComposition;
    }

    public void setPrescriptionComposition(String prescriptionComposition) {
        this.prescriptionComposition = prescriptionComposition == null ? null : prescriptionComposition.trim();
    }

    public String getPrescriptionFunction() {
        return prescriptionFunction;
    }

    public void setPrescriptionFunction(String prescriptionFunction) {
        this.prescriptionFunction = prescriptionFunction == null ? null : prescriptionFunction.trim();
    }

    public String getPrescriptionIndications() {
        return prescriptionIndications;
    }

    public void setPrescriptionIndications(String prescriptionIndications) {
        this.prescriptionIndications = prescriptionIndications == null ? null : prescriptionIndications.trim();
    }

    public String getPrescriptionClinic() {
        return prescriptionClinic;
    }

    public void setPrescriptionClinic(String prescriptionClinic) {
        this.prescriptionClinic = prescriptionClinic == null ? null : prescriptionClinic.trim();
    }

    public String getPrescriptionApply() {
        return prescriptionApply;
    }

    public void setPrescriptionApply(String prescriptionApply) {
        this.prescriptionApply = prescriptionApply == null ? null : prescriptionApply.trim();
    }

    public String getPrescriptionUse() {
        return prescriptionUse;
    }

    public void setPrescriptionUse(String prescriptionUse) {
        this.prescriptionUse = prescriptionUse == null ? null : prescriptionUse.trim();
    }

    public String getPrescriptionAttention() {
        return prescriptionAttention;
    }

    public void setPrescriptionAttention(String prescriptionAttention) {
        this.prescriptionAttention = prescriptionAttention == null ? null : prescriptionAttention.trim();
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