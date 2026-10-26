/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 */
package celestial;

import celestial.gp_3;
import celestial.gy_3;
import celestial.rgn_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class Kk_1 {
    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("stop").requires(gy_32 -> gy_32.id_class(4))).executes(commandContext -> {
            ((gy_3)commandContext.getSource()).id_class(new rgn_3("commands.stop.stopping"), true);
            ((gy_3)commandContext.getSource()).id_super().id_class(false);
            return 1;
        }));
    }
}

