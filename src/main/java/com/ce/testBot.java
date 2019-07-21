package com.ce;

import com.ce.comandos.ComandoFacade;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class testBot extends TelegramLongPollingBot {

    ComandoFacade comandoFacade = new ComandoFacade();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = comandoFacade.doComando(update);
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "tearsintherainbot";
    }

    @Override
    public String getBotToken() {
        return "812895708:AAFC6ooyk0tYWGhuN2f1leKhCWIbWZubob0";
    }

}
