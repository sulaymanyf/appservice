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
public class VeicleVo implements Serializable {

  private static final long serialVersionUID = 1902127362903228073L;

  private String Tip;

  private int Katsayi;

  public String getTip() {
    return Tip;
  }

  public void setTip(String Tip) {
    this.Tip = Tip;
  }

  public int getKatsayi() {
    return Katsayi;
  }

  public void setKatsayi(int Katsayi) {
    this.Katsayi = Katsayi;
  }
}
