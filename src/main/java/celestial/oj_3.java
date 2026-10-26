/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
package celestial;

import celestial.an_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rVU;
import celestial.rgP_2;
import celestial.rgV_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rnW_2;
import celestial.rqR_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.concurrent.Executor;

public class oj_3 {
    private static rgP_2 id_class(CommandContext<gy_3> commandContext, String string) {
        return new rgn_3("chat.type.emote", ((gy_3)commandContext.getSource()).id_extends(), string);
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)gp_3.id_class("me").then(gp_3.id_class("action", StringArgumentType.greedyString()).executes(commandContext -> {
            String string = StringArgumentType.getString((CommandContext)commandContext, (String)"action");
            an_3 an_32 = ((gy_3)commandContext.getSource()).id_package();
            rnW_2 rnW_22 = ((gy_3)commandContext.getSource()).id_super();
            if (an_32 != null) {
                rgV_2 rgV_22;
                if (an_32 instanceof rhN_2 && (rgV_22 = ((rhN_2)an_32).O()) != null) {
                    rgV_22.id_class(string).thenAcceptAsync(optional -> optional.ifPresent(string -> rnW_22.x().id_class(oj_3.id_class((CommandContext<gy_3>)commandContext, string), rVU.CHAT, an_32.ro())), (Executor)rnW_22);
                    return 1;
                }
                rnW_22.x().id_class(oj_3.id_class((CommandContext<gy_3>)commandContext, string), rVU.CHAT, an_32.ro());
            } else {
                rnW_22.x().id_class(oj_3.id_class((CommandContext<gy_3>)commandContext, string), rVU.SYSTEM, rqR_2.id_break);
            }
            return 1;
        })));
    }
}

