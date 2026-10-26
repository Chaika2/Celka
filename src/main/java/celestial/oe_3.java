/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.gp_3;
import celestial.gy_3;
import celestial.rAt_1;
import celestial.rgn_3;
import celestial.rnW_2;
import celestial.rrGP;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class oe_3 {
    private static final Logger id_class = LogManager.getLogger();

    public static void id_class(Collection<String> collection, gy_3 gy_32) {
        gy_32.id_super().id_class(collection).exceptionally(throwable -> {
            id_class.warn("Failed to execute reload", throwable);
            gy_32.id_class(new rgn_3("commands.reload.failure"));
            return null;
        });
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("reload").requires(gy_32 -> gy_32.id_class(2))).executes(commandContext -> {
            gy_3 gy_32 = (gy_3)commandContext.getSource();
            rnW_2 rnW_22 = gy_32.id_super();
            rAt_1 rAt_12 = rnW_22.I();
            rrGP rrGP2 = rnW_22.rB();
            Collection<String> collection = rAt_12.id_protected();
            Collection<String> collection2 = oe_3.id_class(rAt_12, rrGP2, collection);
            gy_32.id_class(new rgn_3("commands.reload.success"), true);
            oe_3.id_class(collection2, gy_32);
            return 0;
        }));
    }

    private static Collection<String> id_class(rAt_1 rAt_12, rrGP rrGP2, Collection<String> collection) {
        rAt_12.id_class();
        ArrayList arrayList = Lists.newArrayList(collection);
        List<String> list = rrGP2.id_public().id_break();
        for (String string : rAt_12.id_break()) {
            if (list.contains(string) || arrayList.contains(string)) continue;
            arrayList.add(string);
        }
        return arrayList;
    }
}

