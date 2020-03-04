package com.yeaile.appservice.istanbulu.controller;



import com.alibaba.fastjson.JSON;
import com.yeaile.appservice.istanbulu.dto.IsparkuserDTO;
import com.yeaile.appservice.istanbulu.entity.Isparkuser;
import com.yeaile.appservice.istanbulu.service.IIsparkuserService;
import com.yeaile.appservice.istanbulu.vo.IsParkResVo;
import com.yeaile.appservice.istanbulu.vo.IsParkVo;
import com.yeaile.appservice.istanbulu.vo.IsparkuserVO;
import com.yeaile.appservice.istanbulu.vo.VeicleVo;
import com.yeaile.appservice.istanbulu.vo.YakinParkVo;
import com.yeaile.appservice.result.AppResult;
import com.yeaile.appservice.result.AppResultBuilder;
import com.yeaile.appservice.result.ResultCode;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sulaymanyf
 * @since 2020-03-04
 */

@RestController
@RequestMapping("/api/ispark")
public class IsparkuserController {

    @Autowired
    private IIsparkuserService isparkuserService;

    @Autowired
    private RestTemplate restTemplate;



    @GetMapping("/v1/home/info/{lon}")
    public AppResult<IsParkResVo> getHomeInfo(@PathVariable String lon) {

//        String parkj = (String) redisTemplate.opsForValue().get(lon);

//        if (parkj!=null){
//            IsParkVo isParkVo = JSON.parseObject(parkj, IsParkVo.class);
//            System.out.println(isParkVo);
//            return AppResultBuilder.success(isParkVo, ResultCode.SUCCESS);
//
//        }
        System.out.println("原始请求");
        IsParkResVo park = getPark(lon);
        String parkJons = JSON.toJSONString(park);
//        redisTemplate.opsForValue().set(lon,parkJons,3, TimeUnit.MINUTES);
        return AppResultBuilder.success(park, ResultCode.SUCCESS);
    }


    private IsParkResVo getPark(String lon) {
        IsParkResVo isParkDto = new IsParkResVo();

        String forObject = restTemplate
            .getForObject("https://mobilservis.ibb.gov.tr/ispark/v1/park", String.class);
        List<IsParkVo> isParks = JSON.parseArray(forObject, IsParkVo.class);
        isParkDto.setIsParkVoList(isParks);

        String Url2 = String
            .format("https://mobilservis.ibb.gov.tr/ispark/v1/nearby/%s,%s", 24.4779053, lon);
        String nearbyPark = restTemplate
            .getForObject(Url2,
                String.class);
        List<YakinParkVo> yakinParks = JSON.parseArray(nearbyPark, YakinParkVo.class);
        isParkDto.setYakinParks(yakinParks);

        String url3 = "https://mobilservis.ibb.gov.tr/ispark/v1/veicle";
        String veicle = restTemplate
            .getForObject(url3,
                String.class);
        List<VeicleVo> veicles = JSON.parseArray(veicle, VeicleVo.class);
        isParkDto.setVeicles(veicles);
        return isParkDto;
    }


    @PostMapping("/v1/home/login")
    public AppResult<IsparkuserVO> Login(@RequestBody IsparkuserDTO userDto) {
        isparkuserService.Login(userDto);
        return AppResultBuilder.successNoData(ResultCode.SUCCESS);
    }

    @GetMapping("/v1/user/info")
    public AppResult<IsparkuserVO> getUserInfo() {
        IsparkuserVO userInfo = isparkuserService.getUserInfo();
        return AppResultBuilder.success(userInfo, ResultCode.SUCCESS);
    }


    @GetMapping("/v1/user/register")
    public AppResult<IsparkuserVO> register(@RequestBody IsparkuserDTO userDto) {
        isparkuserService.register(userDto);
        return AppResultBuilder.successNoData(ResultCode.SUCCESS);
    }
}

