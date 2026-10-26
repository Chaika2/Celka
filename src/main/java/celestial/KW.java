/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
package celestial;

import celestial.RZ;
import celestial.Yl_1;
import celestial.Ym_1;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rFz_1;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rqL_2;
import celestial.rqO_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;

public class KW {
    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        RequiredArgumentBuilder requiredArgumentBuilder = (RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected()).executes(commandContext -> KW.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), null, null))).then(gp_3.id_class("*").then(gp_3.id_class("sound", Ym_1.id_class()).suggests(Yl_1.id_byte).executes(commandContext -> KW.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), null, Ym_1.id_throws((CommandContext<gy_3>)commandContext, "sound")))));
        for (rqL_2 rqL_22 : rqL_2.values()) {
            requiredArgumentBuilder.then(((LiteralArgumentBuilder)gp_3.id_class(rqL_22.id_class()).executes(commandContext -> KW.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), rqL_22, null))).then(gp_3.id_class("sound", Ym_1.id_class()).suggests(Yl_1.id_byte).executes(commandContext -> KW.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), rqL_22, Ym_1.id_throws((CommandContext<gy_3>)commandContext, "sound")))));
        }
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("stopsound").requires(gy_32 -> gy_32.id_class(2))).then((ArgumentBuilder)requiredArgumentBuilder));
    }

    private static int id_class(gy_3 gy_32, Collection<rhN_2> collection, rqL_2 rqL_22, rqO_2 rqO_22) {
        rFz_1 rFz_12 = new rFz_1(rqO_22, rqL_22);
        for (rhN_2 rhN_22 : collection) {
            rhN_22.id_class.id_class(rFz_12);
        }
        if (rqL_22 != null) {
            if (rqO_22 != null) {
                gy_32.id_class(new rgn_3("commands.stopsound.success.source.sound", rqO_22, rqL_22.id_class()), true);
            } else {
                gy_32.id_class(new rgn_3("commands.stopsound.success.source.any", rqL_22.id_class()), true);
            }
        } else if (rqO_22 != null) {
            gy_32.id_class(new rgn_3("commands.stopsound.success.sourceless.sound", rqO_22), true);
        } else {
            gy_32.id_class(new rgn_3("commands.stopsound.success.sourceless.any"), true);
        }
        return collection.size();
    }
}

