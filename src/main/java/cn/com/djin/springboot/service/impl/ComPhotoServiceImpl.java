package cn.com.djin.springboot.service.impl;

import cn.com.djin.springboot.model.ComPhoto;
import cn.com.djin.springboot.service.ComPhotoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author djin
 *    ComPhoto业务层实现类
 * @date 2022-05-23 20:18:11
 */
@Service
@Transactional
public class ComPhotoServiceImpl extends BaseServiceImpl<ComPhoto> implements ComPhotoService {

}
