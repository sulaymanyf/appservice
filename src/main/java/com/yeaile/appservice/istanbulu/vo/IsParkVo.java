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
public class IsParkVo implements Serializable {

  private static final long serialVersionUID = 1498966060228030703L;

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


  @Override
  public String toString() {
    return "IsPark{" +
        "ParkID=" + ParkID +
        ", ParkAdi='" + ParkAdi + '\'' +
        ", Latitude='" + Latitude + '\'' +
        ", Longitude='" + Longitude + '\'' +
        ", Kapasitesi=" + Kapasitesi +
        ", BosKapasite=" + BosKapasite +
        ", ParkTipi='" + ParkTipi + '\'' +
        ", Ilce='" + Ilce + '\'' +
        ", Distance=" + Distance +
        ", UcretsizParklanmaDk=" + UcretsizParklanmaDk +
        '}';
  }
}
