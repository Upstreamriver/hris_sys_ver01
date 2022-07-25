package cn.com.djin.springboot.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import cn.com.djin.springboot.model.StuInfor;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author djin
 *   StuInfor控制器
 * @date 2022-05-23 20:18:11
 */
@Controller
@Api(tags = "学生信息")
@RequestMapping(value = "/stuinfor",method = {RequestMethod.POST,RequestMethod.GET})
public class StuInforController extends BaseController<StuInfor>{


}

