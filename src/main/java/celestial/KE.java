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
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgn_3;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class KE {
    public static void id_class(CommandDispatcher<gy_3> commandDispatcher, boolean bl) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("seed").requires(gy_32 -> !bl || gy_32.id_class(2))).executes(commandContext -> {
            long l = ((gy_3)commandContext.getSource()).id_final().id_break();
            rVi_1 rVi_12 = rgv_3.id_class(new rgN_2(String.valueOf(l)).id_class(rgc_32 -> rgc_32.id_class(rgF_2.GREEN).id_class(new rgl_3(rgH_2.COPY_TO_CLIPBOARD, String.valueOf(l))).id_class(new rgy_3(rgp_3.id_class, new rgn_3("chat.copy.click"))).id_class(String.valueOf(l))));
            ((gy_3)commandContext.getSource()).id_class(new rgn_3("commands.seed.success", rVi_12), false);
            return (int)l;
        }));
    }
}

