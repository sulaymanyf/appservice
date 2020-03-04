package com.yeaile.appservice.paryertime.vo;


import java.io.Serializable;
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
public class QuranZhVO implements Serializable {

  private static final long serialVersionUID = 1L;
  private Integer id;

  private Integer databaseId;

  private Integer suraId;

  private Integer verseId;

  private String ayahText;


}
