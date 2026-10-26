/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 */
package celestial;

import celestial.gp_3;
import celestial.gy_3;
import celestial.rCr_1;
import celestial.rgn_3;
import celestial.rnY_2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class oS_2 {
    private static int id_class(gy_3 gy_32, Collection<? extends rnY_2<?>> collection) {
        if (collection.isEmpty()) {
            gy_32.id_class(new rgn_3("commands.banlist.none"), false);
        } else {
            gy_32.id_class(new rgn_3("commands.banlist.list", collection.size()), false);
            for (rnY_2<?> rnY_22 : collection) {
                gy_32.id_class(new rgn_3("commands.banlist.entry", rnY_22.id_protected(), rnY_22.id_class(), rnY_22.id_byte()), false);
            }
        }
        return collection.size();
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("banlist").requires(gy_32 -> gy_32.id_class(3))).executes(commandContext -> {
            rCr_1 rCr_12 = ((gy_3)commandContext.getSource()).id_super().x();
            return oS_2.id_class((gy_3)commandContext.getSource(), Lists.newArrayList((Iterable)Iterables.concat(rCr_12.id_catch().id_protected(), rCr_12.id_private().id_protected())));
        })).then(gp_3.id_class("ips").executes(commandContext -> oS_2.id_class((gy_3)commandContext.getSource(), ((gy_3)commandContext.getSource()).id_super().x().id_private().id_protected())))).then(gp_3.id_class("players").executes(commandContext -> oS_2.id_class((gy_3)commandContext.getSource(), ((gy_3)commandContext.getSource()).id_super().x().id_catch().id_protected()))));
    }
}

