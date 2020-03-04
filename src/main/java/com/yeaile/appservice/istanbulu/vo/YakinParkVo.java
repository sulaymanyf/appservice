package com.yeaile.appservice.istanbulu.vo;

import java.io.Serializable;
import lombok.Data;

/**
 * @author sulaymanyf
 * @Description
 * @date 2020/2/27
 * @return
 **/
@Data
public class YakinParkVo implements Serializable {

  private static final long serialVersionUID = 6974483270320760007L;

  private int ParkID;
  private String ParkAdi;
  private String Latitude;
  private String Longitude;
  private int Kapasitesi;
  private int BosKapasite;
  private String ParkTipi;
  private String Ilce;
  private double Distance;
  private int UcretsizParklanmaDk;


}
