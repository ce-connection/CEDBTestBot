package com.ce.comandos;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class startComando {

    private Update update;

    public startComando(Update update) {
        this.update = update;
    }

    public SendMessage sendMenu() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow kr1 = new KeyboardRow();
        kr1.add(new KeyboardButton().setText("Horario de la asocia\uD83D\uDCC5"));
        kr1.add(new KeyboardButton().setText("Menú de respostería"));

        KeyboardRow kr2 = new KeyboardRow();
        kr2.add(new KeyboardButton().setText("Secretaria CE"));
        kr2.add(new KeyboardButton().setText("Contactos"));

        KeyboardRow kr3 = new KeyboardRow();
        kr3.add(new KeyboardButton().setText("Horarios de consulta"));
        kr3.add(new KeyboardButton().setText("Info"));

        keyboard.add(kr1);
        keyboard.add(kr2);
        keyboard.add(kr3);

        replyKeyboardMarkup.setKeyboard(keyboard);

        SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
                .setChatId(update.getMessage().getChatId())
                .setReplyMarkup(replyKeyboardMarkup)
                .setText("Selecione una opción");

        return message;
    }
}
