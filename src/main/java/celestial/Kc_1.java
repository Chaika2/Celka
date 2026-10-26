/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 */
package celestial;

import celestial.YP;
import celestial.an_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rVi_1;
import celestial.rgH_2;
import celestial.rgP_2;
import celestial.rgc_3;
import celestial.rgl_3;
import celestial.rgn_3;
import celestial.rgp_3;
import celestial.rgy_3;
import celestial.rhN_2;
import celestial.rnB_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class Kc_1 {
    private static final rgc_3 id_class = rgc_3.id_class.id_class(new rgy_3(rgp_3.id_class, new rgn_3("chat.type.team.hover"))).id_class(new rgl_3(rgH_2.SUGGEST_COMMAND, "/teammsg "));
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.teammsg.failed.noteam"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)gp_3.id_class("teammsg").then(gp_3.id_class("message", YP.id_class()).executes(commandContext -> Kc_1.id_class((gy_3)commandContext.getSource(), YP.id_class((CommandContext<gy_3>)commandContext, "message")))));
        commandDispatcher.register((LiteralArgumentBuilder)gp_3.id_class("tm").redirect((CommandNode)literalCommandNode));
    }

    private static int id_class(gy_3 gy_32, rgP_2 rgP_22) throws CommandSyntaxException {
        an_3 an_32 = gy_32.id_int();
        rnB_2 rnB_22 = (rnB_2)an_32.BG();
        if (rnB_22 == null) {
            throw id_break.create();
        }
        rVi_1 rVi_12 = rnB_22.id_byte().id_break(id_class);
        List<rhN_2> list = gy_32.id_super().x().id_super();
        for (rhN_2 rhN_22 : list) {
            if (rhN_22 == an_32) {
                rhN_22.id_class((rgP_2)new rgn_3("chat.type.team.sent", rVi_12, gy_32.id_extends(), rgP_22), an_32.ro());
                continue;
            }
            if (rhN_22.BG() != rnB_22) continue;
            rhN_22.id_class((rgP_2)new rgn_3("chat.type.team.text", rVi_12, gy_32.id_extends(), rgP_22), an_32.ro());
        }
        return list.size();
    }
}

