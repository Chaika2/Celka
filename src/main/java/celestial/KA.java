/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
package celestial;

import celestial.gp_3;
import celestial.gy_3;
import celestial.rgn_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class KA {
    private static int id_byte(gy_3 gy_32, int n) {
        gy_32.id_final().id_class(0, n, true, true);
        gy_32.id_class(new rgn_3("commands.weather.set.thunder"), true);
        return n;
    }

    private static int id_class(gy_3 gy_32, int n) {
        gy_32.id_final().id_class(n, 0, false, false);
        gy_32.id_class(new rgn_3("commands.weather.set.clear"), true);
        return n;
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("weather").requires(gy_32 -> gy_32.id_class(2))).then(((LiteralArgumentBuilder)gp_3.id_class("clear").executes(commandContext -> KA.id_class((gy_3)commandContext.getSource(), 6000))).then(gp_3.id_class("duration", IntegerArgumentType.integer((int)0, (int)1000000)).executes(commandContext -> KA.id_class((gy_3)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"duration") * 20))))).then(((LiteralArgumentBuilder)gp_3.id_class("rain").executes(commandContext -> KA.id_break((gy_3)commandContext.getSource(), 6000))).then(gp_3.id_class("duration", IntegerArgumentType.integer((int)0, (int)1000000)).executes(commandContext -> KA.id_break((gy_3)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"duration") * 20))))).then(((LiteralArgumentBuilder)gp_3.id_class("thunder").executes(commandContext -> KA.id_byte((gy_3)commandContext.getSource(), 6000))).then(gp_3.id_class("duration", IntegerArgumentType.integer((int)0, (int)1000000)).executes(commandContext -> KA.id_byte((gy_3)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"duration") * 20)))));
    }

    private static int id_break(gy_3 gy_32, int n) {
        gy_32.id_final().id_class(0, n, true, false);
        gy_32.id_class(new rgn_3("commands.weather.set.rain"), true);
        return n;
    }
}

