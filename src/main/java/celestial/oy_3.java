/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
package celestial;

import celestial.RZ;
import celestial.an_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rgn_3;
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;

public class oy_3 {
    private static int id_class(gy_3 gy_32, Collection<? extends an_3> collection) {
        for (an_3 an_32 : collection) {
            an_32.j();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.kill.success.single", collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.kill.success.multiple", collection.size()), true);
        }
        return collection.size();
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("kill").requires(gy_32 -> gy_32.id_class(2))).executes(commandContext -> oy_3.id_class((gy_3)commandContext.getSource(), (Collection<? extends an_3>)ImmutableList.of((Object)((gy_3)commandContext.getSource()).id_int())))).then(gp_3.id_class("targets", RZ.id_break()).executes(commandContext -> oy_3.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets")))));
    }
}

