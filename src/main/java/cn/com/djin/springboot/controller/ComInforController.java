package cn.com.djin.springboot.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import cn.com.djin.springboot.model.ComInfor;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author djin
 *   ComInfor控制器
 * @date 2022-05-23 20:18:11
 */
@Controller
@Api(tags = "企业详情")
@RequestMapping(value = "/cominfor",method = {RequestMethod.POST,RequestMethod.GET})
public class ComInforController extends BaseController<ComInfor>{



}
