/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.RQ;
import celestial.YN;
import celestial.YW;
import celestial.Yk_1;
import celestial.Yn_1;
import celestial.Yv_1;
import celestial.Yz_1;
import celestial.gR_2;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rAa_1;
import celestial.rAi_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rgv_3;
import celestial.rnG_2;
import celestial.rnP_2;
import celestial.rnr_3;
import celestial.rns_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class Ks_1 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.scoreboard.objectives.add.duplicate"));
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.scoreboard.objectives.display.alreadyEmpty"));
    private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("commands.scoreboard.objectives.display.alreadySet"));
    private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType((Message)new rgn_3("commands.scoreboard.players.enable.failed"));
    private static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType((Message)new rgn_3("commands.scoreboard.players.enable.invalid"));
    private static final Dynamic2CommandExceptionType id_case = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("commands.scoreboard.players.get.null", object, object2));

    private static int id_byte(gy_3 gy_32, Collection<String> collection, rnP_2 rnP_22, int n) {
        rnG_2 rnG_22 = gy_32.id_super().R();
        int n2 = 0;
        for (String string : collection) {
            rAa_1 rAa_12 = rnG_22.id_break(string, rnP_22);
            rAa_12.id_break(rAa_12.id_break() - n);
            n2 += rAa_12.id_break();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.remove.success.single", n, rnP_22.id_throws(), collection.iterator().next(), n2), true);
        } else {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.remove.success.multiple", n, rnP_22.id_throws(), collection.size()), true);
        }
        return n2;
    }

    private static int id_class(gy_3 gy_32, String string, rnP_2 rnP_22) throws CommandSyntaxException {
        rnG_2 rnG_22 = gy_32.id_super().R();
        if (!rnG_22.id_class(string, rnP_22)) {
            throw id_case.create((Object)rnP_22.id_break(), (Object)string);
        }
        rAa_1 rAa_12 = rnG_22.id_break(string, rnP_22);
        gy_32.id_class(new rgn_3("commands.scoreboard.players.get.success", string, rAa_12.id_break(), rnP_22.id_throws()), false);
        return rAa_12.id_break();
    }

    private static int id_class(gy_3 gy_32, String string, rAi_1 rAi_12, rgP_2 rgP_22) throws CommandSyntaxException {
        rnG_2 rnG_22 = gy_32.id_super().R();
        if (rnG_22.id_byte(string) != null) {
            throw id_class.create();
        }
        if (string.length() > 16) {
            throw Yk_1.id_class.create((Object)16);
        }
        rnG_22.id_class(string, rAi_12, rgP_22, rAi_12.id_byte());
        rnP_2 rnP_22 = rnG_22.id_byte(string);
        gy_32.id_class(new rgn_3("commands.scoreboard.objectives.add.success", rnP_22.id_throws()), true);
        return rnG_22.id_class().size();
    }

    private static int id_class(gy_3 gy_32, rnP_2 rnP_22) {
        rnG_2 rnG_22 = gy_32.id_super().R();
        rnG_22.id_byte(rnP_22);
        gy_32.id_class(new rgn_3("commands.scoreboard.objectives.remove.success", rnP_22.id_throws()), true);
        return rnG_22.id_class().size();
    }

    private static int id_class(gy_3 gy_32, rnP_2 rnP_22, rnr_3 rnr_32) {
        if (rnP_22.id_case() != rnr_32) {
            rnP_22.id_class(rnr_32);
            gy_32.id_class(new rgn_3("commands.scoreboard.objectives.modify.rendertype", rnP_22.id_throws()), true);
        }
        return 0;
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("scoreboard").requires(gy_32 -> gy_32.id_class(2))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("objectives").then(gp_3.id_class("list").executes(commandContext -> Ks_1.id_break((gy_3)commandContext.getSource())))).then(gp_3.id_class("add").then(gp_3.id_class("objective", StringArgumentType.word()).then(((RequiredArgumentBuilder)gp_3.id_class("criteria", YW.id_class()).executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"objective"), YW.id_class((CommandContext<gy_3>)commandContext, "criteria"), new rgN_2(StringArgumentType.getString((CommandContext)commandContext, (String)"objective"))))).then(gp_3.id_class("displayName", RQ.id_class()).executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"objective"), YW.id_class((CommandContext<gy_3>)commandContext, "criteria"), RQ.id_class((CommandContext<gy_3>)commandContext, "displayName")))))))).then(gp_3.id_class("modify").then(((RequiredArgumentBuilder)gp_3.id_class("objective", Yk_1.id_class()).then(gp_3.id_class("displayname").then(gp_3.id_class("displayName", RQ.id_class()).executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource(), Yk_1.id_class((CommandContext<gy_3>)commandContext, "objective"), RQ.id_class((CommandContext<gy_3>)commandContext, "displayName")))))).then(Ks_1.id_class())))).then(gp_3.id_class("remove").then(gp_3.id_class("objective", Yk_1.id_class()).executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource(), Yk_1.id_class((CommandContext<gy_3>)commandContext, "objective")))))).then(gp_3.id_class("setdisplay").then(((RequiredArgumentBuilder)gp_3.id_class("slot", Yn_1.id_class()).executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource(), Yn_1.id_class((CommandContext<gy_3>)commandContext, "slot")))).then(gp_3.id_class("objective", Yk_1.id_class()).executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource(), Yn_1.id_class((CommandContext<gy_3>)commandContext, "slot"), Yk_1.id_class((CommandContext<gy_3>)commandContext, "objective")))))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("players").then(((LiteralArgumentBuilder)gp_3.id_class("list").executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource()))).then(gp_3.id_class("target", Yv_1.id_class()).suggests(Yv_1.id_class).executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource(), Yv_1.id_class((CommandContext<gy_3>)commandContext, "target")))))).then(gp_3.id_class("set").then(gp_3.id_class("targets", Yv_1.id_break()).suggests(Yv_1.id_class).then(gp_3.id_class("objective", Yk_1.id_class()).then(gp_3.id_class("score", IntegerArgumentType.integer()).executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource(), Yv_1.id_byte((CommandContext<gy_3>)commandContext, "targets"), Yk_1.id_break((CommandContext<gy_3>)commandContext, "objective"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"score")))))))).then(gp_3.id_class("get").then(gp_3.id_class("target", Yv_1.id_class()).suggests(Yv_1.id_class).then(gp_3.id_class("objective", Yk_1.id_class()).executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource(), Yv_1.id_class((CommandContext<gy_3>)commandContext, "target"), Yk_1.id_class((CommandContext<gy_3>)commandContext, "objective"))))))).then(gp_3.id_class("add").then(gp_3.id_class("targets", Yv_1.id_break()).suggests(Yv_1.id_class).then(gp_3.id_class("objective", Yk_1.id_class()).then(gp_3.id_class("score", IntegerArgumentType.integer((int)0)).executes(commandContext -> Ks_1.id_break((gy_3)commandContext.getSource(), Yv_1.id_byte((CommandContext<gy_3>)commandContext, "targets"), Yk_1.id_break((CommandContext<gy_3>)commandContext, "objective"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"score")))))))).then(gp_3.id_class("remove").then(gp_3.id_class("targets", Yv_1.id_break()).suggests(Yv_1.id_class).then(gp_3.id_class("objective", Yk_1.id_class()).then(gp_3.id_class("score", IntegerArgumentType.integer((int)0)).executes(commandContext -> Ks_1.id_byte((gy_3)commandContext.getSource(), Yv_1.id_byte((CommandContext<gy_3>)commandContext, "targets"), Yk_1.id_break((CommandContext<gy_3>)commandContext, "objective"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"score")))))))).then(gp_3.id_class("reset").then(((RequiredArgumentBuilder)gp_3.id_class("targets", Yv_1.id_break()).suggests(Yv_1.id_class).executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource(), Yv_1.id_byte((CommandContext<gy_3>)commandContext, "targets")))).then(gp_3.id_class("objective", Yk_1.id_class()).executes(commandContext -> Ks_1.id_break((gy_3)commandContext.getSource(), Yv_1.id_byte((CommandContext<gy_3>)commandContext, "targets"), Yk_1.id_class((CommandContext<gy_3>)commandContext, "objective"))))))).then(gp_3.id_class("enable").then(gp_3.id_class("targets", Yv_1.id_break()).suggests(Yv_1.id_class).then(gp_3.id_class("objective", Yk_1.id_class()).suggests((commandContext, suggestionsBuilder) -> Ks_1.id_class((gy_3)commandContext.getSource(), Yv_1.id_byte((CommandContext<gy_3>)commandContext, "targets"), suggestionsBuilder)).executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource(), Yv_1.id_byte((CommandContext<gy_3>)commandContext, "targets"), Yk_1.id_class((CommandContext<gy_3>)commandContext, "objective"))))))).then(gp_3.id_class("operation").then(gp_3.id_class("targets", Yv_1.id_break()).suggests(Yv_1.id_class).then(gp_3.id_class("targetObjective", Yk_1.id_class()).then(gp_3.id_class("operation", Yz_1.id_class()).then(gp_3.id_class("source", Yv_1.id_break()).suggests(Yv_1.id_class).then(gp_3.id_class("sourceObjective", Yk_1.id_class()).executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource(), Yv_1.id_byte((CommandContext<gy_3>)commandContext, "targets"), Yk_1.id_break((CommandContext<gy_3>)commandContext, "targetObjective"), Yz_1.id_class((CommandContext<gy_3>)commandContext, "operation"), Yv_1.id_byte((CommandContext<gy_3>)commandContext, "source"), Yk_1.id_class((CommandContext<gy_3>)commandContext, "sourceObjective")))))))))));
    }

    private static LiteralArgumentBuilder<gy_3> id_class() {
        LiteralArgumentBuilder<gy_3> literalArgumentBuilder = gp_3.id_class("rendertype");
        for (rnr_3 rnr_32 : rnr_3.values()) {
            literalArgumentBuilder.then(gp_3.id_class(rnr_32.id_class()).executes(commandContext -> Ks_1.id_class((gy_3)commandContext.getSource(), Yk_1.id_class((CommandContext<gy_3>)commandContext, "objective"), rnr_32)));
        }
        return literalArgumentBuilder;
    }

    private static CompletableFuture<Suggestions> id_class(gy_3 gy_32, Collection<String> collection, SuggestionsBuilder suggestionsBuilder) {
        ArrayList arrayList = Lists.newArrayList();
        rnG_2 rnG_22 = gy_32.id_super().R();
        for (rnP_2 rnP_22 : rnG_22.id_class()) {
            if (rnP_22.id_byte() != rAi_1.id_byte) continue;
            boolean bl = false;
            for (String string : collection) {
                if (rnG_22.id_class(string, rnP_22) && !rnG_22.id_break(string, rnP_22).id_catch()) continue;
                bl = true;
                break;
            }
            if (!bl) continue;
            arrayList.add(rnP_22.id_break());
        }
        return gR_2.id_break(arrayList, suggestionsBuilder);
    }

    private static int id_class(gy_3 gy_32) {
        Collection<String> collection = gy_32.id_super().R().id_byte();
        if (collection.isEmpty()) {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.list.empty"), false);
        } else {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.list.success", collection.size(), rgv_3.id_class(collection)), false);
        }
        return collection.size();
    }

    private static int id_class(gy_3 gy_32, Collection<String> collection, rnP_2 rnP_22, YN yN, Collection<String> collection2, rnP_2 rnP_23) throws CommandSyntaxException {
        rnG_2 rnG_22 = gy_32.id_super().R();
        int n = 0;
        for (String string : collection) {
            rAa_1 rAa_12 = rnG_22.id_break(string, rnP_22);
            for (String string2 : collection2) {
                rAa_1 rAa_13 = rnG_22.id_break(string2, rnP_23);
                yN.apply(rAa_12, rAa_13);
            }
            n += rAa_12.id_break();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.operation.success.single", rnP_22.id_throws(), collection.iterator().next(), n), true);
        } else {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.operation.success.multiple", rnP_22.id_throws(), collection.size()), true);
        }
        return n;
    }

    private static int id_class(gy_3 gy_32, Collection<String> collection, rnP_2 rnP_22) throws CommandSyntaxException {
        if (rnP_22.id_byte() != rAi_1.id_byte) {
            throw id_throws.create();
        }
        rnG_2 rnG_22 = gy_32.id_super().R();
        int n = 0;
        for (String string : collection) {
            rAa_1 rAa_12 = rnG_22.id_break(string, rnP_22);
            if (!rAa_12.id_catch()) continue;
            rAa_12.id_class(false);
            ++n;
        }
        if (n == 0) {
            throw id_protected.create();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.enable.success.single", rnP_22.id_throws(), collection.iterator().next()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.enable.success.multiple", rnP_22.id_throws(), collection.size()), true);
        }
        return n;
    }

    private static int id_class(gy_3 gy_32, Collection<String> collection, rnP_2 rnP_22, int n) {
        rnG_2 rnG_22 = gy_32.id_super().R();
        for (String string : collection) {
            rAa_1 rAa_12 = rnG_22.id_break(string, rnP_22);
            rAa_12.id_break(n);
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.set.success.single", rnP_22.id_throws(), collection.iterator().next(), n), true);
        } else {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.set.success.multiple", rnP_22.id_throws(), collection.size(), n), true);
        }
        return n * collection.size();
    }

    private static int id_class(gy_3 gy_32, Collection<String> collection) {
        rnG_2 rnG_22 = gy_32.id_super().R();
        for (String string : collection) {
            rnG_22.id_byte(string, null);
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.reset.all.single", collection.iterator().next()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.reset.all.multiple", collection.size()), true);
        }
        return collection.size();
    }

    private static int id_class(gy_3 gy_32, int n, rnP_2 rnP_22) throws CommandSyntaxException {
        rnG_2 rnG_22 = gy_32.id_super().R();
        if (rnG_22.id_class(n) == rnP_22) {
            throw id_byte.create();
        }
        ((rns_3)rnG_22).id_class(n, rnP_22);
        gy_32.id_class(new rgn_3("commands.scoreboard.objectives.display.set", rns_3.id_catch()[n], rnP_22.id_protected()), true);
        return 0;
    }

    private static int id_class(gy_3 gy_32, int n) throws CommandSyntaxException {
        rnG_2 rnG_22 = gy_32.id_super().R();
        if (rnG_22.id_class(n) == null) {
            throw id_break.create();
        }
        ((rns_3)rnG_22).id_class(n, (rnP_2)null);
        gy_32.id_class(new rgn_3("commands.scoreboard.objectives.display.cleared", rns_3.id_catch()[n]), true);
        return 0;
    }

    private static int id_class(gy_3 gy_32, rnP_2 rnP_22, rgP_2 rgP_22) {
        if (!rnP_22.id_protected().equals(rgP_22)) {
            rnP_22.id_class(rgP_22);
            gy_32.id_class(new rgn_3("commands.scoreboard.objectives.modify.displayname", rnP_22.id_break(), rnP_22.id_throws()), true);
        }
        return 0;
    }

    private static int id_class(gy_3 gy_32, String string) {
        Map<rnP_2, rAa_1> map = gy_32.id_super().R().id_protected(string);
        if (map.isEmpty()) {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.list.entity.empty", string), false);
        } else {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.list.entity.success", string, map.size()), false);
            for (Map.Entry<rnP_2, rAa_1> entry : map.entrySet()) {
                gy_32.id_class(new rgn_3("commands.scoreboard.players.list.entity.entry", entry.getKey().id_throws(), entry.getValue().id_break()), false);
            }
        }
        return map.size();
    }

    private static int id_break(gy_3 gy_32, Collection<String> collection, rnP_2 rnP_22, int n) {
        rnG_2 rnG_22 = gy_32.id_super().R();
        int n2 = 0;
        for (String string : collection) {
            rAa_1 rAa_12 = rnG_22.id_break(string, rnP_22);
            rAa_12.id_break(rAa_12.id_break() + n);
            n2 += rAa_12.id_break();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.add.success.single", n, rnP_22.id_throws(), collection.iterator().next(), n2), true);
        } else {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.add.success.multiple", n, rnP_22.id_throws(), collection.size()), true);
        }
        return n2;
    }

    private static int id_break(gy_3 gy_32, Collection<String> collection, rnP_2 rnP_22) {
        rnG_2 rnG_22 = gy_32.id_super().R();
        for (String string : collection) {
            rnG_22.id_byte(string, rnP_22);
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.reset.specific.single", rnP_22.id_throws(), collection.iterator().next()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.scoreboard.players.reset.specific.multiple", rnP_22.id_throws(), collection.size()), true);
        }
        return collection.size();
    }

    private static int id_break(gy_3 gy_32) {
        Collection<rnP_2> collection = gy_32.id_super().R().id_class();
        if (collection.isEmpty()) {
            gy_32.id_class(new rgn_3("commands.scoreboard.objectives.list.empty"), false);
        } else {
            gy_32.id_class(new rgn_3("commands.scoreboard.objectives.list.success", collection.size(), rgv_3.id_break(collection, rnP_2::id_throws)), false);
        }
        return collection.size();
    }
}

