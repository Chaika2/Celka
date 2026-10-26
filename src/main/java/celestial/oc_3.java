/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 */
package celestial;

import celestial.RZ;
import celestial.gp_3;
import celestial.gy_3;
import celestial.ou_3;
import celestial.rgn_3;
import celestial.rhN_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class oc_3 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.experience.set.points.invalid"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("experience").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("add").then(gp_3.id_class("targets", RZ.id_protected()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("amount", IntegerArgumentType.integer()).executes(commandContext -> oc_3.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amount"), ou_3.POINTS))).then(gp_3.id_class("points").executes(commandContext -> oc_3.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amount"), ou_3.POINTS)))).then(gp_3.id_class("levels").executes(commandContext -> oc_3.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amount"), ou_3.LEVELS))))))).then(gp_3.id_class("set").then(gp_3.id_class("targets", RZ.id_protected()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("amount", IntegerArgumentType.integer((int)0)).executes(commandContext -> oc_3.id_break((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amount"), ou_3.POINTS))).then(gp_3.id_class("points").executes(commandContext -> oc_3.id_break((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amount"), ou_3.POINTS)))).then(gp_3.id_class("levels").executes(commandContext -> oc_3.id_break((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amount"), ou_3.LEVELS))))))).then(gp_3.id_class("query").then(((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_byte()).then(gp_3.id_class("points").executes(commandContext -> oc_3.id_class((gy_3)commandContext.getSource(), RZ.id_throws((CommandContext<gy_3>)commandContext, "targets"), ou_3.POINTS)))).then(gp_3.id_class("levels").executes(commandContext -> oc_3.id_class((gy_3)commandContext.getSource(), RZ.id_throws((CommandContext<gy_3>)commandContext, "targets"), ou_3.LEVELS))))));
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("xp").requires(gy_32 -> gy_32.id_class(2))).redirect((CommandNode)literalCommandNode));
    }

    private static int id_class(gy_3 gy_32, rhN_2 rhN_22, ou_3 ou_32) {
        int n = ou_32.xpGetter.applyAsInt(rhN_22);
        gy_32.id_class(new rgn_3("commands.experience.query." + ou_32.name, rhN_22.L_(), n), false);
        return n;
    }

    private static int id_class(gy_3 gy_32, Collection<? extends rhN_2> collection, int n, ou_3 ou_32) {
        for (rhN_2 rhN_22 : collection) {
            ou_32.xpAdder.accept(rhN_22, n);
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.experience.add." + ou_32.name + ".success.single", n, collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.experience.add." + ou_32.name + ".success.multiple", n, collection.size()), true);
        }
        return collection.size();
    }

    private static int id_break(gy_3 gy_32, Collection<? extends rhN_2> collection, int n, ou_3 ou_32) throws CommandSyntaxException {
        int n2 = 0;
        for (rhN_2 rhN_22 : collection) {
            if (!ou_32.xpSetter.test(rhN_22, n)) continue;
            ++n2;
        }
        if (n2 == 0) {
            throw id_class.create();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.experience.set." + ou_32.name + ".success.single", n, collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.experience.set." + ou_32.name + ".success.multiple", n, collection.size()), true);
        }
        return collection.size();
    }
}

