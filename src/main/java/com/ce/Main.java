package com.ce;

import org.telegram.telegrambots.ApiContextInitializer;
//import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Main {

    private static final String CEBOT_TOKEN = "812895708:AAFC6ooyk0tYWGhuN2f1leKhCWIbWZubob0";
    private static final String CEBOT_USER = "tearsintherainbot";

    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            //telegramBotsApi.registerBot(new TestAbilitybot(CEBOT_TOKEN, CEBOT_USER));
            telegramBotsApi.registerBot(new testBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
