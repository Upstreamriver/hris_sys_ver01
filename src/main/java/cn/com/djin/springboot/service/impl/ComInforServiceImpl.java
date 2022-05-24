package cn.com.djin.springboot.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.com.djin.springboot.model.ComInfor;
import cn.com.djin.springboot.service.ComInforService;

/**
 * 
 * @author djin
 *    ComInfor业务层实现类
 * @date 2022-05-23 20:18:11
 */
@Service
@Transactional
public class ComInforServiceImpl extends BaseServiceImpl<ComInfor> implements ComInforService {
	
}
