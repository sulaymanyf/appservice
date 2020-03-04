package com.yeaile.appservice.paryertime.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yeaile.appservice.base.BaseEntity;
import java.io.Serializable;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Tolerate;

/**
 * <p>
 *
 * </p>
 *
 * @author sulaymanyf
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@ToString
@TableName("quran_title")
public class QuranTitle implements Serializable {

  private static final long serialVersionUID = 1L;


  @TableId(value = "id", type = IdType.AUTO)
  private int id;

  @TableField("title")
  private String title;

  @TableField("title_arb")
  private  String titleArb;

  @TableField("ayat_cuz")
  private Integer  ayatCuz;

  @TableField("ayat_num")
  private Integer ayatNum;


  @Tolerate
  public QuranTitle() {
  }


}
