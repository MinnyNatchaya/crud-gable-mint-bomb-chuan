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


        @NotNull
        private String ROW_ID;

        private String PAR_ROW_ID;

        @NotNull
        private String LOV_TYPE;
        @NotNull
        private String LOV_NAME;
        @NotNull
        private String DISPLAY_VAL;

        @NotNull
        private String ACTIVE_FLG;
        private String TEXT_DESC;
        private BigInteger ORDER_BY;

        @NotNull
        private BigInteger MODIFICATION_NUM;

        @NotNull
        @CreationTimestamp
        private Date CREATED;
        @NotNull
        private String CREATED_BY;

        @NotNull
        @UpdateTimestamp
        private Date LAST_UPD;
        @NotNull
        private String LAST_UPD_BY;

        private String GROUP_TYPE;
        private String LOV_VAL1;
        private String LOV_VAL2;
        private String LOV_VAL3;
        private String LOV_VAL4;
        private String LOV_VAL5;
        private String LOV_VAL6;
        private String LOV_VAL7;
        private String LOV_VAL8;
        private String LOV_VAL9;
        private String LOV_VAL10;

        public void copy(SffCfgLov s){
                this.setROW_ID(s.getROW_ID());
                this.setPAR_ROW_ID(s.getPAR_ROW_ID());
                this.setLOV_TYPE(s.getLOV_TYPE());
                this.setLOV_NAME(s.getLOV_NAME());
                this.setDISPLAY_VAL(s.getDISPLAY_VAL());
                this.setACTIVE_FLG(s.getACTIVE_FLG());
                this.setTEXT_DESC(s.getTEXT_DESC());
                this.setORDER_BY(s.getORDER_BY());
                this.setMODIFICATION_NUM(s.getMODIFICATION_NUM());
                this.setCREATED(s.getCREATED());
                this.setCREATED_BY(s.getCREATED_BY());
                this.setLAST_UPD(s.getLAST_UPD());
                this.setLAST_UPD_BY(s.getLAST_UPD_BY());
                this.setGROUP_TYPE(s.getGROUP_TYPE());

                this.setLOV_VAL1(s.getLOV_VAL1());
                this.setLOV_VAL2(s.getLOV_VAL2());
                this.setLOV_VAL3(s.getLOV_VAL3());
                this.setLOV_VAL4(s.getLOV_VAL4());
                this.setLOV_VAL5(s.getLOV_VAL5());
                this.setLOV_VAL6(s.getLOV_VAL6());
                this.setLOV_VAL7(s.getLOV_VAL7());
                this.setLOV_VAL8(s.getLOV_VAL8());
                this.setLOV_VAL9(s.getLOV_VAL9());
                this.setLOV_VAL10(s.getLOV_VAL10());

        }




}
