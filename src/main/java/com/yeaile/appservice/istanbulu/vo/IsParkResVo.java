package com.yeaile.appservice.istanbulu.vo;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * @author sulaymanyf
 * @Description
 * @date 2020/3/4
 * @return
 **/
@Data
public class IsParkResVo implements Serializable {

  private static final long serialVersionUID = 1498966060228030703L;
  private List<IsParkVo> isParkVoList;
  List<VeicleVo> veicles;
  List<YakinParkVo> yakinParks;

}
