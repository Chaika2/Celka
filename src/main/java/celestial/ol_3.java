/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ParsedCommandNode
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 */
package celestial;

import celestial.gp_3;
import celestial.gy_3;
import celestial.rgN_2;
import celestial.rgn_3;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import java.util.Map;

public class ol_3 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.help.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("help").executes(commandContext -> {
            Map map = commandDispatcher.getSmartUsage((CommandNode)commandDispatcher.getRoot(), (Object)((gy_3)commandContext.getSource()));
            for (String string : map.values()) {
                ((gy_3)commandContext.getSource()).id_class(new rgN_2("/" + string), false);
            }
            return map.size();
        })).then(gp_3.id_class("command", StringArgumentType.greedyString()).executes(commandContext -> {
            ParseResults parseResults = commandDispatcher.parse(StringArgumentType.getString((CommandContext)commandContext, (String)"command"), (Object)((gy_3)commandContext.getSource()));
            if (parseResults.getContext().getNodes().isEmpty()) {
                throw id_class.create();
            }
            Map map = commandDispatcher.getSmartUsage(((ParsedCommandNode)Iterables.getLast((Iterable)parseResults.getContext().getNodes())).getNode(), (Object)((gy_3)commandContext.getSource()));
            for (String string : map.values()) {
                ((gy_3)commandContext.getSource()).id_class(new rgN_2("/" + parseResults.getReader().getString() + " " + string), false);
            }
            return map.size();
        })));
    }
}

