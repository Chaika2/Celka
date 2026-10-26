/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.Yk_1;
import celestial.an_3;
import celestial.gR_2;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rAa_1;
import celestial.rAi_1;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rnG_2;
import celestial.rnP_2;
import celestial.rns_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class KL {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.trigger.failed.unprimed"));
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.trigger.failed.invalid"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)gp_3.id_class("trigger").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("objective", Yk_1.id_class()).suggests((commandContext, suggestionsBuilder) -> KL.id_class((gy_3)commandContext.getSource(), suggestionsBuilder)).executes(commandContext -> KL.id_class((gy_3)commandContext.getSource(), KL.id_class(((gy_3)commandContext.getSource()).id_new(), Yk_1.id_class((CommandContext<gy_3>)commandContext, "objective"))))).then(gp_3.id_class("add").then(gp_3.id_class("value", IntegerArgumentType.integer()).executes(commandContext -> KL.id_class((gy_3)commandContext.getSource(), KL.id_class(((gy_3)commandContext.getSource()).id_new(), Yk_1.id_class((CommandContext<gy_3>)commandContext, "objective")), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"value")))))).then(gp_3.id_class("set").then(gp_3.id_class("value", IntegerArgumentType.integer()).executes(commandContext -> KL.id_break((gy_3)commandContext.getSource(), KL.id_class(((gy_3)commandContext.getSource()).id_new(), Yk_1.id_class((CommandContext<gy_3>)commandContext, "objective")), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"value")))))));
    }

    private static rAa_1 id_class(rhN_2 rhN_22, rnP_2 rnP_22) throws CommandSyntaxException {
        String string;
        if (rnP_22.id_byte() != rAi_1.id_byte) {
            throw id_break.create();
        }
        rns_3 rns_32 = rhN_22.st();
        if (!rns_32.id_class(string = rhN_22.i(), rnP_22)) {
            throw id_class.create();
        }
        rAa_1 rAa_12 = rns_32.id_break(string, rnP_22);
        if (rAa_12.id_catch()) {
            throw id_class.create();
        }
        rAa_12.id_class(true);
        return rAa_12;
    }

    private static int id_class(gy_3 gy_32, rAa_1 rAa_12, int n) {
        rAa_12.id_class(n);
        gy_32.id_class(new rgn_3("commands.trigger.add.success", rAa_12.id_protected().id_throws(), n), true);
        return rAa_12.id_break();
    }

    private static int id_class(gy_3 gy_32, rAa_1 rAa_12) {
        rAa_12.id_class(1);
        gy_32.id_class(new rgn_3("commands.trigger.simple.success", rAa_12.id_protected().id_throws()), true);
        return rAa_12.id_break();
    }

    public static CompletableFuture<Suggestions> id_class(gy_3 gy_32, SuggestionsBuilder suggestionsBuilder) {
        an_3 an_32 = gy_32.id_package();
        ArrayList arrayList = Lists.newArrayList();
        if (an_32 != null) {
            rnG_2 rnG_22 = gy_32.id_super().R();
            String string = an_32.i();
            for (rnP_2 rnP_22 : rnG_22.id_class()) {
                rAa_1 rAa_12;
                if (rnP_22.id_byte() != rAi_1.id_byte || !rnG_22.id_class(string, rnP_22) || (rAa_12 = rnG_22.id_break(string, rnP_22)).id_catch()) continue;
                arrayList.add(rnP_22.id_break());
            }
        }
        return gR_2.id_break(arrayList, suggestionsBuilder);
    }

    private static int id_break(gy_3 gy_32, rAa_1 rAa_12, int n) {
        rAa_12.id_break(n);
        gy_32.id_class(new rgn_3("commands.trigger.set.success", rAa_12.id_protected().id_throws(), n), true);
        return n;
    }
}

