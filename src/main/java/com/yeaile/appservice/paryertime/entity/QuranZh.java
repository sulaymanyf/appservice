package com.yeaile.appservice.paryertime.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("quran_zh")
public class QuranZh  implements Serializable {

  private static final long serialVersionUID = 1L;


  @TableId(value = "id", type = IdType.AUTO)
  private int id;

  @TableField("database_id")
  private int databaseId;

  @TableField("sura_id")
  private int suraId;

  @TableField("verse_id")
  private int verseId;

  @TableField("ayah_text")
  private  String ayahText;

  @Tolerate
  public QuranZh() {
  }


}
