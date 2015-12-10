/**
 * The contents of this file are subject to the Regenstrief Public License
 * Version 1.0 (the "License"); you may not use this file except in compliance with the License.
 * Please contact Regenstrief Institute if you would like to obtain a copy of the license.
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) Regenstrief Institute.  All Rights Reserved.
 */
package org.ohdsi.webapi.panacea.pojo;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 */
@Entity(name = "PanaceaStudy")
@Table(name = "panacea_study")
//@IdClass(PanaceaStudy.class) -- DO NOT use this composite key annotation. It causes hibernate select statement includes CLOB in "where" clause like: DEBUG main org.hibernate.persister.entity.AbstractEntityPersister -  -  Version select: select study_id from panacea_study where study_id =?, study_detail=?...
@XmlRootElement(name = "PanaceaStudy")
@XmlAccessorType(XmlAccessType.FIELD)
public class PanaceaStudy implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @SequenceGenerator(name = "PANACEA_STUDY_SEQUENCE_GENERATOR", sequenceName = "seq_pnc_stdy", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PANACEA_STUDY_SEQUENCE_GENERATOR")
    @Column(name = "study_id")
    private Long studyId;
    
    @Column(name = "study_name")
    private String studyName;
    
    @Column(name = "study_desc")
    private String studyDesc;
    
    @Column(name = "concept_set_def", insertable = true, updatable = true, unique = false)
    private String concepSetDef;
    
    @Column(name = "cohort_definition_id")
    private Integer cohortDefId;
    
    @Column(name = "study_detail", insertable = true, updatable = true, unique = false)
    //    @Type(type = "org.hibernate.type.StringClobType")
    private String studyDetail;
    
    @Column(name = "switch_window")
    private Integer switchWindow;
    
    @Column(name = "study_duration")
    private Integer studyDuration;
    
    @Column(name = "start_date")
    private Date startDate;
    
    @Column(name = "end_date")
    private Date endDate;
    
    /**
     * @return the studyId
     */
    public Long getStudyId() {
        return this.studyId;
    }
    
    /**
     * @param studyId the studyId to set
     */
    public void setStudyId(final Long studyId) {
        this.studyId = studyId;
    }
    
    /**
     * @return the studyName
     */
    public String getStudyName() {
        return this.studyName;
    }
    
    /**
     * @param studyName the studyName to set
     */
    public void setStudyName(final String studyName) {
        this.studyName = studyName;
    }
    
    /**
     * @return the studyDesc
     */
    public String getStudyDesc() {
        return this.studyDesc;
    }
    
    /**
     * @param studyDesc the studyDesc to set
     */
    public void setStudyDesc(final String studyDesc) {
        this.studyDesc = studyDesc;
    }
    
    /**
     * @return the cohortDefId
     */
    public Integer getCohortDefId() {
        return this.cohortDefId;
    }
    
    /**
     * @param cohortDefId the cohortDefId to set
     */
    public void setCohortDefId(final Integer cohortDefId) {
        this.cohortDefId = cohortDefId;
    }
    
    /**
     * @return the concepSetDef
     */
    public String getConcepSetDef() {
        return this.concepSetDef;
    }
    
    /**
     * @param concepSetDef the concepSetDef to set
     */
    public void setConcepSetDef(final String concepSetDef) {
        this.concepSetDef = concepSetDef;
    }
    
    /**
     * @return the studyDetail
     */
    public String getStudyDetail() {
        return this.studyDetail;
    }
    
    /**
     * @param studyDetail the studyDetail to set
     */
    public void setStudyDetail(final String studyDetail) {
        this.studyDetail = studyDetail;
    }
    
    /**
     * @return the switchWindow
     */
    public Integer getSwitchWindow() {
        return this.switchWindow;
    }
    
    /**
     * @param switchWindow the switchWindow to set
     */
    public void setSwitchWindow(final Integer switchWindow) {
        this.switchWindow = switchWindow;
    }
    
    /**
     * @return the studyDuration
     */
    public Integer getStudyDuration() {
        return this.studyDuration;
    }
    
    /**
     * @param studyDuration the studyDuration to set
     */
    public void setStudyDuration(final Integer studyDuration) {
        this.studyDuration = studyDuration;
    }
    
    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return this.startDate;
    }
    
    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }
    
    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return this.endDate;
    }
    
    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }
    
    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PanaceaStudy [studyId=" + this.studyId + ", studyName=" + this.studyName + ", studyDesc=" + this.studyDesc
                + ", concepSetDef=" + this.concepSetDef + ", cohortDefId=" + this.cohortDefId + ", studyDetail="
                + this.studyDetail + ", switchWindow=" + this.switchWindow + ", studyDuration=" + this.studyDuration
                + ", startDate=" + this.startDate + ", endDate=" + this.endDate + "]";
    }
}
