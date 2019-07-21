package com.ce.comandos;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class ComandoFacade {

    public SendMessage doComando(Update update) {
        String comando = update.getMessage().getText();
        SendMessage sendMessage = null;

        switch (comando) {
            case "/start":
                startComando startComando = new startComando(update);
                sendMessage = startComando.sendMenu();
                break;

            case "Menú de respostería":
                ReposteriaComando reposteriaComando = new ReposteriaComando(update);
                sendMessage = reposteriaComando.enviarTiposDeReposteria();
                break;

            default:
                startComando startComando1 = new startComando(update);
                sendMessage = startComando1.sendMenu();
                sendMessage.setText("Comando Invalido");
                break;
        }

        return sendMessage;
    }

}
