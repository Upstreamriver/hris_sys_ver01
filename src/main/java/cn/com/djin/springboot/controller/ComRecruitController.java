package cn.com.djin.springboot.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import cn.com.djin.springboot.model.ComRecruit;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author djin
 *   ComRecruit控制器
 * @date 2022-05-23 20:18:11
 */
@Controller
@Api(tags = "岗位详情")
@RequestMapping(value = "/comrecruit",method = {RequestMethod.POST,RequestMethod.GET})
public class ComRecruitController extends BaseController<ComRecruit>{
	

}
