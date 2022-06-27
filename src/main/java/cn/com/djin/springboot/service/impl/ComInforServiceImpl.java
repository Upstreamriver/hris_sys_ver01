package cn.com.djin.springboot.service.impl;

//import cn.com.djin.springboot.service.AliyunOssUpload;
import com.aliyun.oss.ClientException;
import com.aliyun.oss.*;
import com.aliyun.oss.OSSException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.com.djin.springboot.model.ComInfor;
import cn.com.djin.springboot.service.ComInforService;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 
 * @author djin
 *    ComInfor业务层实现类
 * @date 2022-05-23 20:18:11
 */
@Service
@Transactional
public class ComInforServiceImpl extends BaseServiceImpl<ComInfor> implements ComInforService {
    //private static final org.slf4j.Logger logger = LoggerFactory.getLogger(AliyunOssUpload.class);

    /**
     * 上传文件
     * @param file
     */
    public String upLoad(String file) throws Exception {

        String endpoint = "https://oss-cn-hangzhou.aliyuncs.com";
        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
        String accessKeyId = "LTAI5tAHSCG52jAgtKEsUjpN";
        String accessKeySecret = "iBZozVXKx1vqavdYI4i2FgmN3KorhW";
        // 填写Bucket名称，例如examplebucket。
        String bucketName = "cominforfile";
        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
        String objectName = "photo/"+file;
        // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
        // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
        String filePath="C:\\photo\\"+file;
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        try {
            InputStream inputStream = new FileInputStream(filePath);
            // 创建PutObject请求。
            ossClient.putObject(bucketName, objectName, inputStream);
        } catch (OSSException oe) {
            System.out.println("Caught an OSSException, which means your request made it to OSS, "
                    + "but was rejected with an error response for some reason.");
            System.out.println("Error Message:" + oe.getErrorMessage());
            System.out.println("Error Code:" + oe.getErrorCode());
            System.out.println("Request ID:" + oe.getRequestId());
            System.out.println("Host ID:" + oe.getHostId());
        } catch (ClientException ce) {
            System.out.println("Caught an ClientException, which means the client encountered "
                    + "a serious internal problem while trying to communicate with OSS, "
                    + "such as not being able to access the network.");
            System.out.println("Error Message:" + ce.getMessage());
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
        return null;
    }

}
