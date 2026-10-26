/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.RZ;
import celestial.Yu_1;
import celestial.an_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.iB_2;
import celestial.rLR;
import celestial.rLY;
import celestial.rgn_3;
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ok_3 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.effect.give.failed"));
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.effect.clear.everything.failed"));
    private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("commands.effect.clear.specific.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("effect").requires(gy_32 -> gy_32.id_class(2))).then(((LiteralArgumentBuilder)gp_3.id_class("clear").executes(commandContext -> ok_3.id_class((gy_3)commandContext.getSource(), (Collection<? extends an_3>)ImmutableList.of((Object)((gy_3)commandContext.getSource()).id_int())))).then(((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_break()).executes(commandContext -> ok_3.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets")))).then(gp_3.id_class("effect", Yu_1.id_class()).executes(commandContext -> ok_3.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), Yu_1.id_class((CommandContext<gy_3>)commandContext, "effect"))))))).then(gp_3.id_class("give").then(gp_3.id_class("targets", RZ.id_break()).then(((RequiredArgumentBuilder)gp_3.id_class("effect", Yu_1.id_class()).executes(commandContext -> ok_3.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), Yu_1.id_class((CommandContext<gy_3>)commandContext, "effect"), null, 0, true))).then(((RequiredArgumentBuilder)gp_3.id_class("seconds", IntegerArgumentType.integer((int)1, (int)1000000)).executes(commandContext -> ok_3.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), Yu_1.id_class((CommandContext<gy_3>)commandContext, "effect"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seconds"), 0, true))).then(((RequiredArgumentBuilder)gp_3.id_class("amplifier", IntegerArgumentType.integer((int)0, (int)255)).executes(commandContext -> ok_3.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), Yu_1.id_class((CommandContext<gy_3>)commandContext, "effect"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seconds"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amplifier"), true))).then(gp_3.id_class("hideParticles", BoolArgumentType.bool()).executes(commandContext -> ok_3.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), Yu_1.id_class((CommandContext<gy_3>)commandContext, "effect"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seconds"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amplifier"), !BoolArgumentType.getBool((CommandContext)commandContext, (String)"hideParticles"))))))))));
    }

    private static int id_class(gy_3 gy_32, Collection<? extends an_3> collection, rLR rLR2, Integer n, int n2, boolean bl) throws CommandSyntaxException {
        int n3 = 0;
        int n4 = n != null ? (rLR2.id_class() ? n : n * 20) : (rLR2.id_class() ? 1 : 600);
        for (an_3 an_32 : collection) {
            rLY rLY2;
            if (!(an_32 instanceof iB_2) || !((iB_2)an_32).id_break(rLY2 = new rLY(rLR2, n4, n2, false, bl))) continue;
            ++n3;
        }
        if (n3 == 0) {
            throw id_class.create();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.effect.give.success.single", rLR2.id_protected(), collection.iterator().next().L_(), n4 / 20), true);
        } else {
            gy_32.id_class(new rgn_3("commands.effect.give.success.multiple", rLR2.id_protected(), collection.size(), n4 / 20), true);
        }
        return n3;
    }

    private static int id_class(gy_3 gy_32, Collection<? extends an_3> collection) throws CommandSyntaxException {
        int n = 0;
        for (an_3 an_32 : collection) {
            if (!(an_32 instanceof iB_2) || !((iB_2)an_32).SY()) continue;
            ++n;
        }
        if (n == 0) {
            throw id_break.create();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.effect.clear.everything.success.single", collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.effect.clear.everything.success.multiple", collection.size()), true);
        }
        return n;
    }

    private static int id_class(gy_3 gy_32, Collection<? extends an_3> collection, rLR rLR2) throws CommandSyntaxException {
        int n = 0;
        for (an_3 an_32 : collection) {
            if (!(an_32 instanceof iB_2) || !((iB_2)an_32).id_protected(rLR2)) continue;
            ++n;
        }
        if (n == 0) {
            throw id_byte.create();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.effect.clear.specific.success.single", rLR2.id_protected(), collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.effect.clear.specific.success.multiple", rLR2.id_protected(), collection.size()), true);
        }
        return n;
    }
}

