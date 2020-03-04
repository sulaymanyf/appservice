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
public class QuranTitleDTO implements Serializable {

private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String titleArb;

    private Integer ayatCuz;

    private Integer ayatNum;





}
