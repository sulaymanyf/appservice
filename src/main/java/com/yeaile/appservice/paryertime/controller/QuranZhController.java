package com.yeaile.appservice.paryertime.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yeaile.appservice.paryertime.entity.QuranTitle;
import com.yeaile.appservice.paryertime.entity.QuranZh;
import com.yeaile.appservice.paryertime.service.IQuranTitleService;
import com.yeaile.appservice.paryertime.service.IQuranZhService;
import com.yeaile.appservice.result.AppResult;
import com.yeaile.appservice.result.AppResultBuilder;
import com.yeaile.appservice.result.ResultCode;
import java.util.List;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sulaymanyf
 * @since 2020-03-04
 */

@RestController
@RequestMapping("/api/prayertime/")
public class QuranZhController {

  @Autowired
  private IQuranZhService iQuranZhService;

  @Autowired
  private IQuranTitleService iQuranTitleService;

  @GetMapping(value = {"/v1/quran/{page}/{key}","/v1/quran/{key}"})
  public AppResult<IPage<QuranZh>> getQuran(@PathVariable(required = false) Integer page, @PathVariable(required = false) String key){
    IPage<QuranZh> quranZhPage =  iQuranZhService.getQuranByPage(page,key );
    return AppResultBuilder.success(quranZhPage, ResultCode.SUCCESS);
  }


  @GetMapping(value = {"/v1/quran/cuz/{cuz}"})
  public AppResult< List<QuranZh>> getQuranSoz(@PathVariable Integer cuz){
    List<QuranZh> quranZh =  iQuranZhService.getQuranSoz(cuz);
    return AppResultBuilder.success(quranZh, ResultCode.SUCCESS);
  }


  @GetMapping(value = {"/v1/quran/cuz"})
  public AppResult< List<QuranTitle>> getQuranTitles(){
    List<QuranTitle> quranTitles =  iQuranTitleService.getQuranTitles();
    return AppResultBuilder.success(quranTitles, ResultCode.SUCCESS);
  }

}

