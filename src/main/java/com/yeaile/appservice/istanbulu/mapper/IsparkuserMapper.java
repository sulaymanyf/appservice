package com.yeaile.appservice.istanbulu.mapper;

import com.yeaile.appservice.istanbulu.entity.Isparkuser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yeaile.appservice.istanbulu.vo.IsparkuserVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sulaymanyf
 * @since 2020-03-04
 */
@Mapper
public interface IsparkuserMapper extends BaseMapper<Isparkuser> {

  IsparkuserVO selectByEmail(String email);
}
