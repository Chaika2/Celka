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
import celestial.gp_3;
import celestial.gy_3;
import celestial.rfH_2;
import celestial.rgn_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class Kh_1 {
    private static int id_class(gy_3 gy_32, rfH_2 rfH_22, float f) {
        gy_32.id_final().id_class(rfH_22, f);
        gy_32.id_class(new rgn_3("commands.setworldspawn.success", rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), Float.valueOf(f)), true);
        return 1;
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("setworldspawn").requires(gy_32 -> gy_32.id_class(2))).executes(commandContext -> Kh_1.id_class((gy_3)commandContext.getSource(), new rfH_2(((gy_3)commandContext.getSource()).id_volatile()), 0.0f))).then(((RequiredArgumentBuilder)gp_3.id_class("pos", RM.id_class()).executes(commandContext -> Kh_1.id_class((gy_3)commandContext.getSource(), RM.id_break((CommandContext<gy_3>)commandContext, "pos"), 0.0f))).then(gp_3.id_class("angle", RS.id_class()).executes(commandContext -> Kh_1.id_class((gy_3)commandContext.getSource(), RM.id_break((CommandContext<gy_3>)commandContext, "pos"), RS.id_class((CommandContext<gy_3>)commandContext, "angle"))))));
    }
}

