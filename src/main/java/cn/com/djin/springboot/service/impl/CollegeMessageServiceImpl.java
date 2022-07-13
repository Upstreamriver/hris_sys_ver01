package cn.com.djin.springboot.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.com.djin.springboot.model.CollegeMessage;
import cn.com.djin.springboot.service.CollegeMessageService;

/**
 *
 * @author djin
 *    CollegeMessage业务层实现类
 * @date 2022-05-23 20:18:11
 */
@Service
@Transactional
public class CollegeMessageServiceImpl extends BaseServiceImpl<CollegeMessage> implements CollegeMessageService {

}
