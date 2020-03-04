package com.yeaile.appservice.paryertime.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yeaile.appservice.paryertime.entity.QuranZh;
import com.yeaile.appservice.paryertime.vo.QuranZhVO;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sulaymanyf
 * @since 2020-03-04
 */
public interface IQuranZhService {

  IPage<QuranZh> getQuranByPage(Integer page, String key);

  List<QuranZh> getQuranSoz(Integer cuz);
}
