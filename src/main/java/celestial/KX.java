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

import celestial.RM;
import celestial.RS;
import celestial.RZ;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rqM_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class KX {
    private static int id_class(gy_3 gy_32, Collection<rhN_2> collection, rfH_2 rfH_22, float f) {
        rqM_2<rYB> rqM_22 = gy_32.id_final().E();
        for (rhN_2 rhN_22 : collection) {
            rhN_22.id_class(rqM_22, rfH_22, f, true, false);
        }
        String string = rqM_22.id_class().toString();
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.spawnpoint.success.single", rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), Float.valueOf(f), string, collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.spawnpoint.success.multiple", rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), Float.valueOf(f), string, collection.size()), true);
        }
        return collection.size();
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("spawnpoint").requires(gy_32 -> gy_32.id_class(2))).executes(commandContext -> KX.id_class((gy_3)commandContext.getSource(), Collections.singleton(((gy_3)commandContext.getSource()).id_new()), new rfH_2(((gy_3)commandContext.getSource()).id_volatile()), 0.0f))).then(((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected()).executes(commandContext -> KX.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), new rfH_2(((gy_3)commandContext.getSource()).id_volatile()), 0.0f))).then(((RequiredArgumentBuilder)gp_3.id_class("pos", RM.id_class()).executes(commandContext -> KX.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), RM.id_break((CommandContext<gy_3>)commandContext, "pos"), 0.0f))).then(gp_3.id_class("angle", RS.id_class()).executes(commandContext -> KX.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), RM.id_break((CommandContext<gy_3>)commandContext, "pos"), RS.id_class((CommandContext<gy_3>)commandContext, "angle")))))));
    }
}

