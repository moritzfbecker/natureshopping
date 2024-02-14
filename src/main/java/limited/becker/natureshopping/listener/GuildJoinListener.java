package limited.becker.natureshopping.listener;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.channel.concrete.Category;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import net.dv8tion.jda.api.managers.channel.concrete.CategoryManager;
import net.dv8tion.jda.api.requests.restaction.ChannelAction;

import java.awt.*;
import java.util.Collections;
import java.util.EnumSet;

public class GuildJoinListener extends ListenerAdapter {

    @Override
    public void onGuildJoin(GuildJoinEvent event) {
        Guild guild = event.getGuild();

        Category category = guild.createCategory("Nature Shopping").complete();
        CategoryManager categoryManager = category.getManager();

        categoryManager.setPosition(0).queue();
        categoryManager.putPermissionOverride(guild.getPublicRole(), null, Collections.singleton(Permission.VIEW_CHANNEL)).queue();

        TextChannel overviewChannel = category.createTextChannel("shop overview").complete();

        overviewChannel.sendMessage("# Hi I'm Nature Shopping!").queue();

        EmbedBuilder authentication = new EmbedBuilder();
        authentication.setTitle("Business Account");
        authentication.setDescription("To access Nature Shopping, you must have a Nature Business Account. Please sign in or create an account to proceed.");
        authentication.setColor(Color.GREEN);
        authentication.setThumbnail("https://png2.cleanpng.com/sh/d5a05efbc3d582efd0820a1e5b20cf1a/L0KzQYm3VcE3N5tBfZH0aYP2gLBuTfNwdaF6jNd7LXnmf7B6Tfdwd5hxfZ9qY3PyhbB7Tflkd58yfNd8aXfxPb32hBlvNWZmftU5MnTkdLa6UcI0Nmk4T6QAN0S1QYa5VsQ3PWM5Sqs6MEGxgLBu/kisspng-computer-icons-google-account-icon-design-login-5afc02dade3123.8372574215264652429101.png");

        Button Login = Button.primary("", "");

        overviewChannel.sendMessageEmbeds(authentication.build()).queue();



    }
}
