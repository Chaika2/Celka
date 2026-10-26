/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
package celestial;

import celestial.RQ;
import celestial.RZ;
import celestial.an_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rgP_2;
import celestial.rgv_3;
import celestial.rhN_2;
import celestial.rqR_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class KZ {
    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("tellraw").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("targets", RZ.id_protected()).then(gp_3.id_class("message", RQ.id_class()).executes(commandContext -> {
            int n = 0;
            for (rhN_2 rhN_22 : RZ.id_case((CommandContext<gy_3>)commandContext, "targets")) {
                rhN_22.id_class((rgP_2)rgv_3.id_class((gy_3)commandContext.getSource(), RQ.id_class((CommandContext<gy_3>)commandContext, "message"), (an_3)rhN_22, 0), rqR_2.id_break);
                ++n;
            }
            return n;
        }))));
    }
}

