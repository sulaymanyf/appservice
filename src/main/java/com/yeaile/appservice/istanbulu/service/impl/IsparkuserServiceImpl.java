package com.yeaile.appservice.istanbulu.service.impl;

import com.yeaile.appservice.istanbulu.dto.IsparkuserDTO;
import com.yeaile.appservice.istanbulu.entity.Isparkuser;
import com.yeaile.appservice.istanbulu.mapper.IsparkuserMapper;
import com.yeaile.appservice.istanbulu.service.IIsparkuserService;
import com.yeaile.appservice.istanbulu.vo.IsparkuserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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
public class IsparkuserServiceImpl implements IIsparkuserService {

    @Autowired
    private IsparkuserMapper isparkuserMapper ;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public IsparkuserVO Login(IsparkuserDTO userDto) {
        IsparkuserVO isparkuser = isparkuserMapper.selectByEmail(userDto.getEmail());
        if (isparkuser!=null && passwordEncoder.matches(userDto.getPassWord(),isparkuser.getPassWord())){
            return isparkuser;
        }else {
            return null;
        }
    }

    @Override
    public IsparkuserVO getUserInfo() {
        return null;
    }

    @Override
    public void register(IsparkuserDTO userDto) {
        Isparkuser isparkuser = new Isparkuser();
        BeanUtils.copyProperties(userDto, isparkuser);
        isparkuser.setPassWord(passwordEncoder.encode(userDto.getPassWord()));
        int insert = isparkuserMapper.insert(isparkuser);
        System.out.println(insert);
    }
}
