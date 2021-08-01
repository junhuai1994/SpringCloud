package cn.huanzi.qch.txlcn.tm;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@EnableEurekaClient
@SpringBootApplication
@EnableTransactionManagerServer

public class TxlcnTmApplication {


    public static void main(String[] args) {
        SpringApplication.run(TxlcnTmApplication.class, args);
    }

}
