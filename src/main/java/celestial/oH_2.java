/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
package celestial;

import celestial.RZ;
import celestial.YP;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;

public class oH_2 {
    private static int id_class(gy_3 gy_32, Collection<rhN_2> collection, rgP_2 rgP_22) {
        for (rhN_2 rhN_22 : collection) {
            rhN_22.id_class.id_class(rgP_22);
            gy_32.id_class(new rgn_3("commands.kick.success", rhN_22.L_(), rgP_22), true);
        }
        return collection.size();
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("kick").requires(gy_32 -> gy_32.id_class(3))).then(((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected()).executes(commandContext -> oH_2.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), new rgn_3("multiplayer.disconnect.kicked")))).then(gp_3.id_class("reason", YP.id_class()).executes(commandContext -> oH_2.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YP.id_class((CommandContext<gy_3>)commandContext, "reason"))))));
    }
}

