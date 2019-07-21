package com.ce.comandos;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class ReposteriaComando {

    private Update update;

    public ReposteriaComando(Update update) { this.update = update; }

    public SendMessage enviarTiposDeReposteria() {

        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> pastries = new ArrayList<>();
        pastries.add(new InlineKeyboardButton().setText("Pasteleria salada"));
        pastries.add(new InlineKeyboardButton().setText("Pastelería Dulce"));

        List<InlineKeyboardButton> beverages = new ArrayList<>();
        beverages.add(new InlineKeyboardButton().setText("Bebidas").setCallbackData());

        List<InlineKeyboardButton> extra = new ArrayList<>();
        extra.add(new InlineKeyboardButton().setText("Extra"));

        keyboard.add(pastries);
        keyboard.add(beverages);
        keyboard.add(extra);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(keyboard);

        return new SendMessage()
                .setChatId(update.getMessage().getChatId())
                .setText("Menu asocia")
                .setReplyMarkup(inlineKeyboardMarkup);
    }
}
