package cn.attackme.myuploader;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class MyUploaderApplication {

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication.run(MyUploaderApplication.class, args);


    }
}
