package limited.becker.natureshopping;

import limited.becker.natureshopping.commands.commandhandler.CommandManager;
import limited.becker.natureshopping.listener.GuildJoinListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class NatureShopping {

    private static JDA jda;
    private static CommandManager commandManager;

    public static void main(String[] args) {

        JDABuilder jdaBuilder = JDABuilder.createDefault(args[0]);

        commandManager = new CommandManager();

        jdaBuilder.setActivity(Activity.customStatus("Creating Businesses"));

        jdaBuilder.addEventListeners(commandManager);
        jdaBuilder.addEventListeners(new GuildJoinListener());

        jda = jdaBuilder.build();

    }


    public static JDA getJda() {
        return jda;
    }


}
