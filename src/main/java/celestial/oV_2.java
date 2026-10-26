/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 */
package celestial;

import celestial.RZ;
import celestial.YP;
import celestial.an_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rqR_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.UUID;
import java.util.function.Consumer;

public class oV_2 {
    private static int id_class(gy_3 gy_32, Collection<rhN_2> collection, rgP_2 rgP_22) {
        Consumer<rgP_2> consumer;
        UUID uUID = gy_32.id_package() == null ? rqR_2.id_break : gy_32.id_package().ro();
        an_3 an_32 = gy_32.id_package();
        if (an_32 instanceof rhN_2) {
            rhN_2 rhN_22 = (rhN_2)an_32;
            consumer = rgP_23 -> rhN_22.id_class((rgP_2)new rgn_3("commands.message.display.outgoing", rgP_23, rgP_22).id_class(rgF_2.GRAY, rgF_2.ITALIC), rhN_22.ro());
        } else {
            consumer = rgP_23 -> gy_32.id_class(new rgn_3("commands.message.display.outgoing", rgP_23, rgP_22).id_class(rgF_2.GRAY, rgF_2.ITALIC), false);
        }
        for (rhN_2 rhN_23 : collection) {
            consumer.accept(rhN_23.L_());
            rhN_23.id_class((rgP_2)new rgn_3("commands.message.display.incoming", gy_32.id_extends(), rgP_22).id_class(rgF_2.GRAY, rgF_2.ITALIC), uUID);
        }
        return collection.size();
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)gp_3.id_class("msg").then(gp_3.id_class("targets", RZ.id_protected()).then(gp_3.id_class("message", YP.id_class()).executes(commandContext -> oV_2.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YP.id_class((CommandContext<gy_3>)commandContext, "message"))))));
        commandDispatcher.register((LiteralArgumentBuilder)gp_3.id_class("tell").redirect((CommandNode)literalCommandNode));
        commandDispatcher.register((LiteralArgumentBuilder)gp_3.id_class("w").redirect((CommandNode)literalCommandNode));
    }
}

