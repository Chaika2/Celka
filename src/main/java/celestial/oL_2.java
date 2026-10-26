/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
package celestial;

import celestial.RZ;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rRl_1;
import celestial.rRu_1;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rqR_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class oL_2 {
    private static int id_class(CommandContext<gy_3> commandContext, Collection<rhN_2> collection, rRl_1 rRl_12) {
        int n = 0;
        for (rhN_2 rhN_22 : collection) {
            if (rhN_22.id_finally.id_break() == rRl_12) continue;
            rhN_22.id_class(rRl_12);
            oL_2.id_class((gy_3)commandContext.getSource(), rhN_22, rRl_12);
            ++n;
        }
        return n;
    }

    private static void id_class(gy_3 gy_32, rhN_2 rhN_22, rRl_1 rRl_12) {
        rgn_3 rgn_32 = new rgn_3("gameMode." + rRl_12.id_break());
        if (gy_32.id_package() == rhN_22) {
            gy_32.id_class(new rgn_3("commands.gamemode.success.self", rgn_32), true);
        } else {
            if (gy_32.id_final().B().id_break(rRu_1.id_final)) {
                rhN_22.id_class((rgP_2)new rgn_3("gameMode.changed", rgn_32), rqR_2.id_break);
            }
            gy_32.id_class(new rgn_3("commands.gamemode.success.other", rhN_22.L_(), rgn_32), true);
        }
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        LiteralArgumentBuilder literalArgumentBuilder = (LiteralArgumentBuilder)gp_3.id_class("gamemode").requires(gy_32 -> gy_32.id_class(2));
        for (rRl_1 rRl_12 : rRl_1.values()) {
            if (rRl_12 == rRl_1.NOT_SET) continue;
            literalArgumentBuilder.then(((LiteralArgumentBuilder)gp_3.id_class(rRl_12.id_break()).executes(commandContext -> oL_2.id_class((CommandContext<gy_3>)commandContext, Collections.singleton(((gy_3)commandContext.getSource()).id_new()), rRl_12))).then(gp_3.id_class("target", RZ.id_protected()).executes(commandContext -> oL_2.id_class((CommandContext<gy_3>)commandContext, RZ.id_case((CommandContext<gy_3>)commandContext, "target"), rRl_12))));
        }
        commandDispatcher.register(literalArgumentBuilder);
    }
}

