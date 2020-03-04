package com.yeaile.appservice.istanbulu.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yeaile.appservice.base.BaseEntity;
import java.time.LocalDateTime;
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
@TableName("isparkuser")
public class Isparkuser extends BaseEntity {

  private static final long serialVersionUID = 1L;


  @TableField("user_name")
  private String userName;

  @TableField("email")
  private String email;

  @TableField("pass_word")
  private String passWord;

  @TableField("plaka")
  private String plaka;

  @TableField("home_addr")
  private String homeAddr;

  @TableField("office_addr")
  private String officeAddr;

  @TableField("pop_one")
  private String popOne;

  @TableField("pop_two")
  private String popTwo;

  @TableField("pop_three")
  private String popThree;

  @TableField("createTime")
  private LocalDateTime createTime;

  @TableField("updateTime")
  private LocalDateTime updateTime;




  @Tolerate
  public Isparkuser() {
  }


}
