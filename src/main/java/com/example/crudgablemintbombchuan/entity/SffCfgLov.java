package com.example.crudgablemintbombchuan.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SFF_CFG_LOV")
public class SffCfgLov {

        @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="ROW_ID")
        private String rowId;

        @Column(name="PAR_ROW_ID")
        private String parRowId;

        @Column(name="LOV_TYPE")
        private String lovType;

        @Column(name="LOV_NAME")
        private String lovName;

        @Column(name="DISPLAY_VAL")
        private String displayVal;

        @Column(name="ACTIVE_FLG")
        private String activeFlg;

        @Column(name="TEXT_DESC")
        private String textDesc;

        @Column(name="ORDER_BY")
        private BigInteger orderBy;

        @Column(name="MODIFICATION_NUM")
        private BigInteger modificationNum;


        @CreationTimestamp
        @Column(name="CREATED")
        private Date create;

        @Column(name="CREATED_BY")
        private String createBy;


        @UpdateTimestamp
        @Column(name="LAST_UPD")
        private Date lastUpd;

        @Column(name="LAST_UPD_BY")
        private String lastUpdBy;

        @Column(name="GROUP_TYPE")
        private String groupType;

        @Column(name="LOV_VAL1")
        private String lovVal1;

        @Column(name="LOV_VAL2")
        private String lovVal2;

        @Column(name="LOV_VAL3")
        private String lovVal3;

        @Column(name="LOV_VAL4")
        private String lovVal4;

        @Column(name="LOV_VAL5")
        private String lovVal5;

        @Column(name="LOV_VAL6")
        private String lovVal6;

        @Column(name="LOV_VAL7")
        private String lovVal7;

        @Column(name="LOV_VAL8")
        private String lovVal8;

        @Column(name="LOV_VAL9")
        private String lovVal9;

        @Column(name="PAR_ROW_ID")
        private String lovVal10;

        public void copy(SffCfgLov s){
                this.setRowId(s.getRowId());
                this.setParRowId(s.getParRowId());
                this.setLovType(s.getLovType());
                this.setLovName(s.getLovName());
                this.setDisplayVal(s.getDisplayVal());
                this.setActiveFlg(s.getActiveFlg());
                this.setTextDesc(s.getTextDesc());
                this.setOrderBy(s.getOrderBy());
                this.setModificationNum(s.getModificationNum());
                this.setCreate(s.getCreate());
                this.setCreateBy(s.getCreateBy());
                this.setLastUpd(s.getLastUpd());
                this.setLastUpdBy(s.getLastUpdBy());
                this.setGroupType(s.getGroupType());

                this.setLovVal1(s.getLovVal1());
                this.setLovVal2(s.getLovVal2());
                this.setLovVal3(s.getLovVal3());
                this.setLovVal4(s.getLovVal4());
                this.setLovVal5(s.getLovVal5());
                this.setLovVal6(s.getLovVal6());
                this.setLovVal7(s.getLovVal7());
                this.setLovVal8(s.getLovVal8());
                this.setLovVal9(s.getLovVal9());
                this.setLovVal10(s.getLovVal10());



        }




}
