package com.yeaile.appservice.paryertime.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yeaile.appservice.paryertime.entity.QuranZh;
import com.yeaile.appservice.paryertime.mapper.QuranZhMapper;
import com.yeaile.appservice.paryertime.service.IQuranZhService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sulaymanyf
 * @since 2020-03-04
 */

@Service
public class QuranZhServiceImpl implements IQuranZhService {


    @Autowired
    private QuranZhMapper quranZhMapper;

    @Override
    public IPage<QuranZh> getQuranByPage(Integer page, String key) {
        IPage<QuranZh> voPage = new Page<>();
        voPage.setCurrent(page==null?0:page);
        voPage.setSize(10);
        QueryWrapper<QuranZh> query = new QueryWrapper<>();
        query.like(key!=null,"ayah_text",key);
        IPage<QuranZh> quranZhIPage = quranZhMapper.selectPage(voPage, query);
        return quranZhIPage;
    }

    @Override
    public List<QuranZh> getQuranSoz(Integer cuz) {
        QueryWrapper<QuranZh> query = new QueryWrapper<>();
        query.eq("sura_id",cuz);
        List<QuranZh> quranZhList = quranZhMapper.selectList(query);
        return quranZhList;
    }
}
