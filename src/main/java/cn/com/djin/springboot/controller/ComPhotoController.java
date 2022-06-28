package cn.com.djin.springboot.controller;

import cn.com.djin.springboot.model.ComPhoto;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author djin
 *   ComPhoto控制器
 * @date 2022-05-23 20:18:11
 */
@Controller
@Api(tags = "照片详情")
@RequestMapping(value = "/comphoto",method = {RequestMethod.POST,RequestMethod.GET})
public class ComPhotoController extends BaseController<ComPhoto>{


}