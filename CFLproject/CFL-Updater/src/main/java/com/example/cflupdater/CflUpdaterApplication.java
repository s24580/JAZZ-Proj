package com.example.cflupdater;

import com.example.cflupdater.updater.IUpdateGames;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.example.*"})
public class CflUpdaterApplication implements CommandLineRunner {

    private final IUpdateGames updater;

    public CflUpdaterApplication(IUpdateGames updateGames) {
        this.updater = updateGames;
    }

    public static void main(String[] args) {
        SpringApplication.run(CflUpdaterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        updater.updateGames(2015);
    }
}
