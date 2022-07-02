package cn.com.djin.springboot.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.com.djin.springboot.model.SchoolMessage;
import cn.com.djin.springboot.service.SchoolMessageService;

/**
 *
 * @author djin
 *    SchoolMessage业务层实现类
 * @date 2022-05-23 20:18:11
 */
@Service
@Transactional
public class SchoolMessageServiceImpl extends BaseServiceImpl<SchoolMessage> implements SchoolMessageService {

}
