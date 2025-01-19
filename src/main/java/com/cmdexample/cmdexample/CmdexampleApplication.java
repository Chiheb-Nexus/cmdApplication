package com.cmdexample.cmdexample;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cmdexample.cmdexample.core.CoreLogicApplication;

@SpringBootApplication
public class CmdexampleApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);

	@Autowired
	private CoreLogicApplication instance;

	public static void main(String[] args) {
		SpringApplication.run(CmdexampleApplication.class, args);
	}

	@Override
	public void run(String... args) {
		logger.info("Inside run method and executing it");
		while (true) {
			try {
				instance.run();
				TimeUnit.SECONDS.sleep(5);
			} catch (Exception e) {
				logger.info("Got exception: {e}", e);
				break;
			}
		}
	}
}
