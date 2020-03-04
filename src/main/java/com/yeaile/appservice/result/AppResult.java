package com.yeaile.appservice.result;

/**
 * @author sulaymanyf
 * @Description
 * @date 2020/2/27
 * @return
 **/
public class AppResult <T> {

  private int code;
  private String msg;
  // 数据
  private T data;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

}

