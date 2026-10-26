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

import celestial.Yq_1;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rgn_3;
import celestial.rrEm_1;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class Kv_1 {
    private static int id_byte(gy_3 gy_32, int n) {
        gy_32.id_class(new rgn_3("commands.time.query", n), false);
        return n;
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("time").requires(gy_32 -> gy_32.id_class(2))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("set").then(gp_3.id_class("day").executes(commandContext -> Kv_1.id_class((gy_3)commandContext.getSource(), 1000)))).then(gp_3.id_class("noon").executes(commandContext -> Kv_1.id_class((gy_3)commandContext.getSource(), 6000)))).then(gp_3.id_class("night").executes(commandContext -> Kv_1.id_class((gy_3)commandContext.getSource(), 13000)))).then(gp_3.id_class("midnight").executes(commandContext -> Kv_1.id_class((gy_3)commandContext.getSource(), 18000)))).then(gp_3.id_class("time", Yq_1.id_class()).executes(commandContext -> Kv_1.id_class((gy_3)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time")))))).then(gp_3.id_class("add").then(gp_3.id_class("time", Yq_1.id_class()).executes(commandContext -> Kv_1.id_break((gy_3)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("query").then(gp_3.id_class("daytime").executes(commandContext -> Kv_1.id_byte((gy_3)commandContext.getSource(), Kv_1.id_class(((gy_3)commandContext.getSource()).id_final()))))).then(gp_3.id_class("gametime").executes(commandContext -> Kv_1.id_byte((gy_3)commandContext.getSource(), (int)(((gy_3)commandContext.getSource()).id_final().r() % Integer.MAX_VALUE))))).then(gp_3.id_class("day").executes(commandContext -> Kv_1.id_byte((gy_3)commandContext.getSource(), (int)(((gy_3)commandContext.getSource()).id_final().P() / 24000L % Integer.MAX_VALUE))))));
    }

    private static int id_class(rrEm_1 rrEm_12) {
        return (int)(rrEm_12.P() % 24000L);
    }

    public static int id_class(gy_3 gy_32, int n) {
        for (rrEm_1 rrEm_12 : gy_32.id_super().id_float()) {
            rrEm_12.id_class(n);
        }
        gy_32.id_class(new rgn_3("commands.time.set", n), true);
        return Kv_1.id_class(gy_32.id_final());
    }

    public static int id_break(gy_3 gy_32, int n) {
        for (rrEm_1 rrEm_12 : gy_32.id_super().id_float()) {
            rrEm_12.id_class(rrEm_12.P() + (long)n);
        }
        int n2 = Kv_1.id_class(gy_32.id_final());
        gy_32.id_class(new rgn_3("commands.time.set", n2), true);
        return n2;
    }
}

