package com.yeaile.appservice.istanbulu.dto;


import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * </p>
 *
 * @author sulaymanyf
 * @since 2020-03-04
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IsparkuserDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  private BigInteger id;

  private String userName;

  private String email;

  private String passWord;

  private String plaka;

  private String homeAddr;

  private String officeAddr;

  private String popOne;

  private String popTwo;

  private String popThree;

  private LocalDateTime createTime;

  private LocalDateTime updateTime;

  private int deleteFlag;


}
