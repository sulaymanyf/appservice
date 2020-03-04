package com.yeaile.appservice.paryertime.dto;

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
public class QuranZhDto implements Serializable {

private static final long serialVersionUID = 1L;

    private int  id;

    private long databaseId;

    private int suraId;

    private int verseId;

    private String ayahText;





}
