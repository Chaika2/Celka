/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.RQ;
import celestial.RZ;
import celestial.an_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rFm_1;
import celestial.rFu_1;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rgv_3;
import celestial.rhN_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.Locale;

public class KF {
    private static int id_class(gy_3 gy_32, Collection<rhN_2> collection, int n, int n2, int n3) {
        rFu_1 rFu_12 = new rFu_1(n, n2, n3);
        for (rhN_2 rhN_22 : collection) {
            rhN_22.id_class.id_class(rFu_12);
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.title.times.single", collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.title.times.multiple", collection.size()), true);
        }
        return collection.size();
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("title").requires(gy_32 -> gy_32.id_class(2))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected()).then(gp_3.id_class("clear").executes(commandContext -> KF.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"))))).then(gp_3.id_class("reset").executes(commandContext -> KF.id_break((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"))))).then(gp_3.id_class("title").then(gp_3.id_class("title", RQ.id_class()).executes(commandContext -> KF.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), RQ.id_class((CommandContext<gy_3>)commandContext, "title"), rFm_1.TITLE))))).then(gp_3.id_class("subtitle").then(gp_3.id_class("title", RQ.id_class()).executes(commandContext -> KF.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), RQ.id_class((CommandContext<gy_3>)commandContext, "title"), rFm_1.SUBTITLE))))).then(gp_3.id_class("actionbar").then(gp_3.id_class("title", RQ.id_class()).executes(commandContext -> KF.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), RQ.id_class((CommandContext<gy_3>)commandContext, "title"), rFm_1.ACTIONBAR))))).then(gp_3.id_class("times").then(gp_3.id_class("fadeIn", IntegerArgumentType.integer((int)0)).then(gp_3.id_class("stay", IntegerArgumentType.integer((int)0)).then(gp_3.id_class("fadeOut", IntegerArgumentType.integer((int)0)).executes(commandContext -> KF.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"fadeIn"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"stay"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"fadeOut")))))))));
    }

    private static int id_class(gy_3 gy_32, Collection<rhN_2> collection) {
        rFu_1 rFu_12 = new rFu_1(rFm_1.CLEAR, null);
        for (rhN_2 rhN_22 : collection) {
            rhN_22.id_class.id_class(rFu_12);
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.title.cleared.single", collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.title.cleared.multiple", collection.size()), true);
        }
        return collection.size();
    }

    private static int id_class(gy_3 gy_32, Collection<rhN_2> collection, rgP_2 rgP_22, rFm_1 rFm_12) throws CommandSyntaxException {
        for (rhN_2 rhN_22 : collection) {
            rhN_22.id_class.id_class(new rFu_1(rFm_12, rgv_3.id_class(gy_32, rgP_22, (an_3)rhN_22, 0)));
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.title.show." + rFm_12.name().toLowerCase(Locale.ROOT) + ".single", collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.title.show." + rFm_12.name().toLowerCase(Locale.ROOT) + ".multiple", collection.size()), true);
        }
        return collection.size();
    }

    private static int id_break(gy_3 gy_32, Collection<rhN_2> collection) {
        rFu_1 rFu_12 = new rFu_1(rFm_1.RESET, null);
        for (rhN_2 rhN_22 : collection) {
            rhN_22.id_class.id_class(rFu_12);
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.title.reset.single", collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.title.reset.multiple", collection.size()), true);
        }
        return collection.size();
    }
}

