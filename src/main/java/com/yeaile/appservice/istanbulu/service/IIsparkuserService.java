package com.yeaile.appservice.istanbulu.service;


import com.yeaile.appservice.istanbulu.dto.IsparkuserDTO;
import com.yeaile.appservice.istanbulu.vo.IsparkuserVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sulaymanyf
 * @since 2020-03-04
 */
public interface IIsparkuserService {

  IsparkuserVO Login(IsparkuserDTO userDto);

  IsparkuserVO getUserInfo();

  void register(IsparkuserDTO userDto);
}
