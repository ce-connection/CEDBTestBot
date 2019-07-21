package com.ce;

import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.abilitybots.api.objects.Locality;
import org.telegram.abilitybots.api.objects.Privacy;

public class TestAbilitybot extends AbilityBot{

    public TestAbilitybot(String botToken, String botUsername) {
        super(botToken, botUsername);
    }

    public Ability startBotAbility() {
        return Ability
                .builder()
                .name("start")
                .info("Inicializa bot")
                .locality(Locality.ALL)
                .privacy(Privacy.PUBLIC)
                .action(ctx -> silent.send("Hello", ctx.chatId()))
                .build();
    }

    @Override
    public int creatorId() {
            return 295691591;
    }
}
