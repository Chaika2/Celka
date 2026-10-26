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
import celestial.rRl_1;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rnW_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ox_3 {
    private static int id_class(gy_3 gy_32, rRl_1 rRl_12) {
        int n = 0;
        rnW_2 rnW_22 = gy_32.id_super();
        rnW_22.id_class(rRl_12);
        if (rnW_22.c()) {
            for (rhN_2 rhN_22 : rnW_22.x().id_super()) {
                if (rhN_22.id_finally.id_break() == rRl_12) continue;
                rhN_22.id_class(rRl_12);
                ++n;
            }
        }
        gy_32.id_class(new rgn_3("commands.defaultgamemode.success", rRl_12.id_byte()), true);
        return n;
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        LiteralArgumentBuilder literalArgumentBuilder = (LiteralArgumentBuilder)gp_3.id_class("defaultgamemode").requires(gy_32 -> gy_32.id_class(2));
        for (rRl_1 rRl_12 : rRl_1.values()) {
            if (rRl_12 == rRl_1.NOT_SET) continue;
            literalArgumentBuilder.then(gp_3.id_class(rRl_12.id_break()).executes(commandContext -> ox_3.id_class((gy_3)commandContext.getSource(), rRl_12)));
        }
        commandDispatcher.register(literalArgumentBuilder);
    }
}

