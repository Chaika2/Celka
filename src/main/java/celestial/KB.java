/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
package celestial;

import celestial.YP;
import celestial.an_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rVU;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqR_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class KB {
    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("say").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("message", YP.id_class()).executes(commandContext -> {
            rgP_2 rgP_22 = YP.id_class((CommandContext<gy_3>)commandContext, "message");
            rgn_3 rgn_32 = new rgn_3("chat.type.announcement", ((gy_3)commandContext.getSource()).id_extends(), rgP_22);
            an_3 an_32 = ((gy_3)commandContext.getSource()).id_package();
            if (an_32 != null) {
                ((gy_3)commandContext.getSource()).id_super().x().id_class(rgn_32, rVU.CHAT, an_32.ro());
            } else {
                ((gy_3)commandContext.getSource()).id_super().x().id_class(rgn_32, rVU.SYSTEM, rqR_2.id_break);
            }
            return 1;
        })));
    }
}

