package cn.com.djin.springboot.service;

import cn.com.djin.springboot.model.ComInfor;

import java.io.File;

/**
 * 
 * @author djin
 *    ComInfor业务层接口
 * @date 2022-05-23 20:18:11
 */
public interface ComInforService extends BaseService<ComInfor>{

    String upLoad(String file) throws Exception;
	
}
