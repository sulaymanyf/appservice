package com.yeaile.appservice.paryertime.service.impl;

import com.yeaile.appservice.paryertime.entity.QuranTitle;
import com.yeaile.appservice.paryertime.mapper.QuranTitleMapper;
import com.yeaile.appservice.paryertime.service.IQuranTitleService;
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
public class QuranTitleServiceImpl implements IQuranTitleService {

    @Autowired
    private QuranTitleMapper quranTitleMapper ;

    @Override
    public List<QuranTitle> getQuranTitles() {
        List<QuranTitle> quranTitles = quranTitleMapper.selectList(null);
        return quranTitles;
    }
}
