package com.hxy.ctm.pojo;

import java.util.Date;

public class Medicinal {
    private Integer id;

    private String medicinalName;

    private String medicinalAlias;

    private String medicinalCharacter;

    private String medicinalTaste;

    private String medicinalDrugFactors;

    private String medicinalPurpose;

    private String medicinalClinicalApplication;

    private Date createTime;

    private Date modifyTime;

    public Medicinal(Integer id, String medicinalName, String medicinalAlias, String medicinalCharacter, String medicinalTaste, String medicinalDrugFactors, String medicinalPurpose, String medicinalClinicalApplication, Date createTime, Date modifyTime) {
        this.id = id;
        this.medicinalName = medicinalName;
        this.medicinalAlias = medicinalAlias;
        this.medicinalCharacter = medicinalCharacter;
        this.medicinalTaste = medicinalTaste;
        this.medicinalDrugFactors = medicinalDrugFactors;
        this.medicinalPurpose = medicinalPurpose;
        this.medicinalClinicalApplication = medicinalClinicalApplication;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    public Medicinal() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicinalName() {
        return medicinalName;
    }

    public void setMedicinalName(String medicinalName) {
        this.medicinalName = medicinalName == null ? null : medicinalName.trim();
    }

    public String getMedicinalAlias() {
        return medicinalAlias;
    }

    public void setMedicinalAlias(String medicinalAlias) {
        this.medicinalAlias = medicinalAlias == null ? null : medicinalAlias.trim();
    }

    public String getMedicinalCharacter() {
        return medicinalCharacter;
    }

    public void setMedicinalCharacter(String medicinalCharacter) {
        this.medicinalCharacter = medicinalCharacter == null ? null : medicinalCharacter.trim();
    }

    public String getMedicinalTaste() {
        return medicinalTaste;
    }

    public void setMedicinalTaste(String medicinalTaste) {
        this.medicinalTaste = medicinalTaste == null ? null : medicinalTaste.trim();
    }

    public String getMedicinalDrugFactors() {
        return medicinalDrugFactors;
    }

    public void setMedicinalDrugFactors(String medicinalDrugFactors) {
        this.medicinalDrugFactors = medicinalDrugFactors == null ? null : medicinalDrugFactors.trim();
    }

    public String getMedicinalPurpose() {
        return medicinalPurpose;
    }

    public void setMedicinalPurpose(String medicinalPurpose) {
        this.medicinalPurpose = medicinalPurpose == null ? null : medicinalPurpose.trim();
    }

    public String getMedicinalClinicalApplication() {
        return medicinalClinicalApplication;
    }

    public void setMedicinalClinicalApplication(String medicinalClinicalApplication) {
        this.medicinalClinicalApplication = medicinalClinicalApplication == null ? null : medicinalClinicalApplication.trim();
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