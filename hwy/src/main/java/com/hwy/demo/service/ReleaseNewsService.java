package com.hwy.demo.service;

import com.hwy.demo.po.ImgInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;

@Service
public class ReleaseNewsService {

    @Value("${uploadPath}")
    String getPath;

    public ImgInfo setImgUrl(MultipartFile file, HttpServletResponse response) throws Exception {
        // Get the file and save it somewhere
        byte[] bytes = file.getBytes();
        String path = getPath;
        File imgFile = new File(path);
        if (!imgFile.exists()) {
            imgFile.mkdirs();
        }
        String fileName = file.getOriginalFilename();// 文件名称
        System.out.println(path + fileName);

        //写入文件
        try (FileOutputStream fos = new FileOutputStream(new File(path + fileName))) {
            fos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //返回给前台的url
        String value = "/hwyCompany/upload/img/" + fileName;
        String[] values = { value };

        ImgInfo imgInfo = new ImgInfo();
        imgInfo.setError(0);
        imgInfo.setUrl(values);

        System.out.println(imgInfo.toString());
        return imgInfo;
    }
}
