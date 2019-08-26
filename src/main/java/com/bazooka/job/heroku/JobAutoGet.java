package com.bazooka.job.heroku;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Component
public class JobAutoGet {

    private static final Logger log = LoggerFactory.getLogger(JobAutoGet.class);

    @Scheduled(cron = "${job.auto-get.cron}")
    public void run() {
        try {
            //log.info("Job auto get");
            URL url = new URL("https://estados-cidades.herokuapp.com");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            //log.info("Job success!");

        } catch (MalformedURLException e) {
            log.error("ERROR URL mal formatada: {}", e.toString());
            e.printStackTrace();

        } catch (IOException e) {
            log.error("ERROR de conexão url", e.toString());
            e.printStackTrace();
        }
    }

}
