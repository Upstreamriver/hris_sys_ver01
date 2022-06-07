package cn.com.djin.springboot.controller;

import io.swagger.annotations.Api;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import cn.com.djin.springboot.model.ComInfor;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

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
    @RequestMapping("/upload")
    public @ResponseBody
    void upload(MultipartFile cominforFile){
        System.out.println(cominforFile);
        System.out.println(cominforFile.getSize());
        try {
            //1.获取源文件的输入流
            InputStream is = cominforFile.getInputStream();
            //2.获取源文件类型，文件后缀名
            String originalFileName = cominforFile.getOriginalFilename();
            //3.定义上传后的目标文件名(为了避免文件名称重复，此时使用UUID)
            String newFileName = UUID.randomUUID().toString()+"."+originalFileName;
            //4.通过上传路径得到上传的文件夹
            File file = new File("D:\\dome");
            //4.1.若目标文件夹不存在，则创建
            if(!file.exists()){ //判断目标文件夹是否存在
                file.mkdirs();//4.2.不存在，则创建文件夹
            }
            //5.根据目标文件夹和目标文件名新建目标文件（上传后的文件）
            File newFile = new File("D:\\dome",newFileName);  //空的目标文件
            //6.根据目标文件的新建其输出流对象
            FileOutputStream os = new FileOutputStream(newFile);
            //7.完成输入流到输出流的复制
            IOUtils.copy(is,os);
            //8.关闭流（先开后关）
            os.close();
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
