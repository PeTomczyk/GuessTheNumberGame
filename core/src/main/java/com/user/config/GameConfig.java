package com.user.config;

import com.user.GuessCount;
import com.user.MaxNumber;
import com.user.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.user")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    // == fields ==
    @Value("${game.minNumber:0}")
    private int minNumber;

    @Value("${game.maxNumber:20}")
    private int maxNumber;

    @Value("${game.guessCount:5}")
    private int guessCount;

    // == bean methods ==
    @Bean
    @MinNumber
    public int getMinNumber() {
        return minNumber;
    }

    @Bean
    @MaxNumber
    public int getMaxNumber() {
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int getGuessCount() {
        return guessCount;
    }
}
