/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.ResultConsumer
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 */
package celestial;

import celestial.KI;
import celestial.Kp_1;
import celestial.Ky_1;
import celestial.RM;
import celestial.RN;
import celestial.RO;
import celestial.RZ;
import celestial.Rg_1;
import celestial.Rj_1;
import celestial.Rm_1;
import celestial.Ru_1;
import celestial.XF;
import celestial.YE;
import celestial.YJ;
import celestial.YZ;
import celestial.Yk_1;
import celestial.Ym_1;
import celestial.Yv_1;
import celestial.Yw_1;
import celestial.Yy_1;
import celestial.an_3;
import celestial.gR_2;
import celestial.gp_3;
import celestial.gy_3;
import celestial.oN_2;
import celestial.oQ_2;
import celestial.os_3;
import celestial.rAa_1;
import celestial.rQz_1;
import celestial.rYB;
import celestial.rcD_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rch_3;
import celestial.rcn_3;
import celestial.rct_3;
import celestial.rcu_3;
import celestial.rcz_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rgn_3;
import celestial.rnG_2;
import celestial.rnP_2;
import celestial.rnx_3;
import celestial.rrEm_1;
import celestial.ryO_2;
import celestial.ryw_3;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzZ_2;
import celestial.rzz_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;

public class oz_3 {
    private static final Dynamic2CommandExceptionType id_class = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("commands.execute.blocks.toobig", object, object2));
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.execute.conditional.fail"));
    private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(object -> new rgn_3("commands.execute.conditional.fail_count", object));
    private static final BinaryOperator<ResultConsumer<gy_3>> id_protected = (resultConsumer, resultConsumer2) -> (commandContext, bl, n) -> {
        resultConsumer.onCommandComplete(commandContext, bl, n);
        resultConsumer2.onCommandComplete(commandContext, bl, n);
    };
    private static final SuggestionProvider<gy_3> id_throws = (commandContext, suggestionsBuilder) -> {
        rzZ_2 rzZ_22 = ((gy_3)commandContext.getSource()).id_super().K();
        return gR_2.id_class(rzZ_22.id_break(), suggestionsBuilder);
    };

    private static OptionalInt id_byte(CommandContext<gy_3> commandContext, boolean bl) throws CommandSyntaxException {
        return oz_3.id_class(((gy_3)commandContext.getSource()).id_final(), RM.id_class(commandContext, "start"), RM.id_class(commandContext, "end"), RM.id_class(commandContext, "destination"), bl);
    }

    private static Command<gy_3> id_class(boolean bl, oN_2 oN_22) {
        return bl ? commandContext -> {
            int n = oN_22.test((CommandContext<gy_3>)commandContext);
            if (n > 0) {
                ((gy_3)commandContext.getSource()).id_class(new rgn_3("commands.execute.conditional.pass_count", n), false);
                return n;
            }
            throw id_break.create();
        } : commandContext -> {
            int n = oN_22.test((CommandContext<gy_3>)commandContext);
            if (n == 0) {
                ((gy_3)commandContext.getSource()).id_class(new rgn_3("commands.execute.conditional.pass"), false);
                return 1;
            }
            throw id_byte.create((Object)n);
        };
    }

    private static ArgumentBuilder<gy_3, ?> id_class(CommandNode<gy_3> commandNode, LiteralArgumentBuilder<gy_3> literalArgumentBuilder, boolean bl) {
        ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder.then(gp_3.id_class("block").then(gp_3.id_class("pos", RM.id_class()).then(oz_3.id_class(commandNode, gp_3.id_class("block", RO.id_class()), bl, (CommandContext<gy_3> commandContext) -> RO.id_class((CommandContext<gy_3>)commandContext, "block").test(new ryw_3(((gy_3)commandContext.getSource()).id_final(), RM.id_class((CommandContext<gy_3>)commandContext, "pos"), true))))))).then(gp_3.id_class("score").then(gp_3.id_class("target", Yv_1.id_class()).suggests(Yv_1.id_class).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("targetObjective", Yk_1.id_class()).then(gp_3.id_class("=").then(gp_3.id_class("source", Yv_1.id_class()).suggests(Yv_1.id_class).then(oz_3.id_class(commandNode, gp_3.id_class("sourceObjective", Yk_1.id_class()), bl, (CommandContext<gy_3> commandContext) -> oz_3.id_class((CommandContext<gy_3>)commandContext, Integer::equals)))))).then(gp_3.id_class("<").then(gp_3.id_class("source", Yv_1.id_class()).suggests(Yv_1.id_class).then(oz_3.id_class(commandNode, gp_3.id_class("sourceObjective", Yk_1.id_class()), bl, (CommandContext<gy_3> commandContext) -> oz_3.id_class((CommandContext<gy_3>)commandContext, (Integer n, Integer n2) -> n < n2)))))).then(gp_3.id_class("<=").then(gp_3.id_class("source", Yv_1.id_class()).suggests(Yv_1.id_class).then(oz_3.id_class(commandNode, gp_3.id_class("sourceObjective", Yk_1.id_class()), bl, (CommandContext<gy_3> commandContext) -> oz_3.id_class((CommandContext<gy_3>)commandContext, (Integer n, Integer n2) -> n <= n2)))))).then(gp_3.id_class(">").then(gp_3.id_class("source", Yv_1.id_class()).suggests(Yv_1.id_class).then(oz_3.id_class(commandNode, gp_3.id_class("sourceObjective", Yk_1.id_class()), bl, (CommandContext<gy_3> commandContext) -> oz_3.id_class((CommandContext<gy_3>)commandContext, (Integer n, Integer n2) -> n > n2)))))).then(gp_3.id_class(">=").then(gp_3.id_class("source", Yv_1.id_class()).suggests(Yv_1.id_class).then(oz_3.id_class(commandNode, gp_3.id_class("sourceObjective", Yk_1.id_class()), bl, (CommandContext<gy_3> commandContext) -> oz_3.id_class((CommandContext<gy_3>)commandContext, (Integer n, Integer n2) -> n >= n2)))))).then(gp_3.id_class("matches").then(oz_3.id_class(commandNode, gp_3.id_class("range", Rj_1.id_class()), bl, (CommandContext<gy_3> commandContext) -> oz_3.id_class((CommandContext<gy_3>)commandContext, Rg_1.id_class((CommandContext<gy_3>)commandContext, "range"))))))))).then(gp_3.id_class("blocks").then(gp_3.id_class("start", RM.id_class()).then(gp_3.id_class("end", RM.id_class()).then(((RequiredArgumentBuilder)gp_3.id_class("destination", RM.id_class()).then(oz_3.id_class(commandNode, gp_3.id_class("all"), bl, false))).then(oz_3.id_class(commandNode, gp_3.id_class("masked"), bl, true))))))).then(gp_3.id_class("entity").then(((RequiredArgumentBuilder)gp_3.id_class("entities", RZ.id_break()).fork(commandNode, commandContext -> oz_3.id_class((CommandContext<gy_3>)commandContext, bl, !RZ.id_byte((CommandContext<gy_3>)commandContext, "entities").isEmpty()))).executes(oz_3.id_class(bl, (CommandContext<gy_3> commandContext) -> RZ.id_byte((CommandContext<gy_3>)commandContext, "entities").size()))))).then(gp_3.id_class("predicate").then(oz_3.id_class(commandNode, gp_3.id_class("predicate", Ym_1.id_class()).suggests(id_throws), bl, (CommandContext<gy_3> commandContext) -> oz_3.id_class((gy_3)commandContext.getSource(), Ym_1.id_byte((CommandContext<gy_3>)commandContext, "predicate")))));
        for (Kp_1 kp_1 : Ky_1.id_byte) {
            literalArgumentBuilder.then(kp_1.id_class((ArgumentBuilder<gy_3, ?>)gp_3.id_class("data"), argumentBuilder -> argumentBuilder.then(((RequiredArgumentBuilder)gp_3.id_class("path", YE.id_class()).fork(commandNode, commandContext -> oz_3.id_class((CommandContext<gy_3>)commandContext, bl, oz_3.id_class(kp_1.id_class((CommandContext<gy_3>)commandContext), YE.id_class((CommandContext<gy_3>)commandContext, "path")) > 0))).executes(oz_3.id_class(bl, (CommandContext<gy_3> commandContext) -> oz_3.id_class(kp_1.id_class((CommandContext<gy_3>)commandContext), YE.id_class((CommandContext<gy_3>)commandContext, "path")))))));
        }
        return literalArgumentBuilder;
    }

    private static gy_3 id_class(gy_3 gy_32, KI kI, YJ yJ, IntFunction<rcZ_2> intFunction, boolean bl) {
        return gy_32.id_class((ResultConsumer<gy_3>)((ResultConsumer)(commandContext, bl2, n) -> {
            try {
                rcd_3 rcd_32 = kI.id_class();
                int n2 = bl ? n : (bl2 ? 1 : 0);
                yJ.id_break(rcd_32, () -> (rcZ_2)intFunction.apply(n2));
                kI.id_class(rcd_32);
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
        }), id_protected);
    }

    private static gy_3 id_class(gy_3 gy_32, rnx_3 rnx_32, boolean bl, boolean bl2) {
        return gy_32.id_class((ResultConsumer<gy_3>)((ResultConsumer)(commandContext, bl3, n) -> {
            int n2;
            int n3 = bl2 ? n : (n2 = bl3 ? 1 : 0);
            if (bl) {
                rnx_32.id_class(n2);
            } else {
                rnx_32.id_break(n2);
            }
        }), id_protected);
    }

    private static gy_3 id_class(gy_3 gy_32, Collection<String> collection, rnP_2 rnP_22, boolean bl) {
        rnG_2 rnG_22 = gy_32.id_super().R();
        return gy_32.id_class((ResultConsumer<gy_3>)((ResultConsumer)(commandContext, bl2, n) -> {
            for (String string : collection) {
                rAa_1 rAa_12 = rnG_22.id_break(string, rnP_22);
                int n2 = bl ? n : (bl2 ? 1 : 0);
                rAa_12.id_break(n2);
            }
        }), id_protected);
    }

    private static ArgumentBuilder<gy_3, ?> id_class(LiteralCommandNode<gy_3> literalCommandNode, LiteralArgumentBuilder<gy_3> literalArgumentBuilder, boolean bl) {
        literalArgumentBuilder.then(gp_3.id_class("score").then(gp_3.id_class("targets", Yv_1.id_break()).suggests(Yv_1.id_class).then(gp_3.id_class("objective", Yk_1.id_class()).redirect(literalCommandNode, commandContext -> oz_3.id_class((gy_3)commandContext.getSource(), Yv_1.id_byte((CommandContext<gy_3>)commandContext, "targets"), Yk_1.id_class((CommandContext<gy_3>)commandContext, "objective"), bl)))));
        literalArgumentBuilder.then(gp_3.id_class("bossbar").then(((RequiredArgumentBuilder)gp_3.id_class("id", Ym_1.id_class()).suggests(os_3.id_class).then(gp_3.id_class("value").redirect(literalCommandNode, commandContext -> oz_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), true, bl)))).then(gp_3.id_class("max").redirect(literalCommandNode, commandContext -> oz_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), false, bl)))));
        for (Kp_1 kp_1 : Ky_1.id_break) {
            kp_1.id_class((ArgumentBuilder<gy_3, ?>)literalArgumentBuilder, argumentBuilder -> argumentBuilder.then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("path", YE.id_class()).then(gp_3.id_class("id_int").then(gp_3.id_class("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode, commandContext -> oz_3.id_class((gy_3)commandContext.getSource(), kp_1.id_class((CommandContext<gy_3>)commandContext), YE.id_class((CommandContext<gy_3>)commandContext, "path"), (int n) -> rcn_3.id_class((int)((double)n * DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale"))), bl))))).then(gp_3.id_class("float").then(gp_3.id_class("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode, commandContext -> oz_3.id_class((gy_3)commandContext.getSource(), kp_1.id_class((CommandContext<gy_3>)commandContext), YE.id_class((CommandContext<gy_3>)commandContext, "path"), (int n) -> rcu_3.id_class((float)((double)n * DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale"))), bl))))).then(gp_3.id_class("short").then(gp_3.id_class("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode, commandContext -> oz_3.id_class((gy_3)commandContext.getSource(), kp_1.id_class((CommandContext<gy_3>)commandContext), YE.id_class((CommandContext<gy_3>)commandContext, "path"), (int n) -> rcD_2.id_class((short)((double)n * DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale"))), bl))))).then(gp_3.id_class("long").then(gp_3.id_class("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode, commandContext -> oz_3.id_class((gy_3)commandContext.getSource(), kp_1.id_class((CommandContext<gy_3>)commandContext), YE.id_class((CommandContext<gy_3>)commandContext, "path"), (int n) -> rct_3.id_class((long)((double)n * DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale"))), bl))))).then(gp_3.id_class("double").then(gp_3.id_class("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode, commandContext -> oz_3.id_class((gy_3)commandContext.getSource(), kp_1.id_class((CommandContext<gy_3>)commandContext), YE.id_class((CommandContext<gy_3>)commandContext, "path"), (int n) -> rcz_3.id_class((double)n * DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale")), bl))))).then(gp_3.id_class("id_byte").then(gp_3.id_class("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode, commandContext -> oz_3.id_class((gy_3)commandContext.getSource(), kp_1.id_class((CommandContext<gy_3>)commandContext), YE.id_class((CommandContext<gy_3>)commandContext, "path"), (int n) -> rch_3.id_class((byte)((double)n * DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale"))), bl))))));
        }
        return literalArgumentBuilder;
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)gp_3.id_class("execute").requires(gy_32 -> gy_32.id_class(2)));
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("execute").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("run").redirect((CommandNode)commandDispatcher.getRoot()))).then(oz_3.id_class((CommandNode<gy_3>)literalCommandNode, gp_3.id_class("if"), true))).then(oz_3.id_class((CommandNode<gy_3>)literalCommandNode, gp_3.id_class("unless"), false))).then(gp_3.id_class("as").then(gp_3.id_class("targets", RZ.id_break()).fork((CommandNode)literalCommandNode, commandContext -> {
            ArrayList arrayList = Lists.newArrayList();
            for (an_3 an_32 : RZ.id_byte((CommandContext<gy_3>)commandContext, "targets")) {
                arrayList.add(((gy_3)commandContext.getSource()).id_class(an_32));
            }
            return arrayList;
        })))).then(gp_3.id_class("at").then(gp_3.id_class("targets", RZ.id_break()).fork((CommandNode)literalCommandNode, commandContext -> {
            ArrayList arrayList = Lists.newArrayList();
            for (an_3 an_32 : RZ.id_byte((CommandContext<gy_3>)commandContext, "targets")) {
                arrayList.add(((gy_3)commandContext.getSource()).id_class((rrEm_1)((rYB)an_32.id_throws[7])).id_class(an_32.Ps()).id_class(an_32.id_import()));
            }
            return arrayList;
        })))).then(((LiteralArgumentBuilder)gp_3.id_class("store").then(oz_3.id_class((LiteralCommandNode<gy_3>)literalCommandNode, gp_3.id_class("result"), true))).then(oz_3.id_class((LiteralCommandNode<gy_3>)literalCommandNode, gp_3.id_class("success"), false)))).then(((LiteralArgumentBuilder)gp_3.id_class("positioned").then(gp_3.id_class("pos", Yw_1.id_class()).redirect((CommandNode)literalCommandNode, commandContext -> ((gy_3)commandContext.getSource()).id_class(Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos")).id_class(Rm_1.FEET)))).then(gp_3.id_class("as").then(gp_3.id_class("targets", RZ.id_break()).fork((CommandNode)literalCommandNode, commandContext -> {
            ArrayList arrayList = Lists.newArrayList();
            for (an_3 an_32 : RZ.id_byte((CommandContext<gy_3>)commandContext, "targets")) {
                arrayList.add(((gy_3)commandContext.getSource()).id_class(an_32.Ps()));
            }
            return arrayList;
        }))))).then(((LiteralArgumentBuilder)gp_3.id_class("rotated").then(gp_3.id_class("rot", YZ.id_class()).redirect((CommandNode)literalCommandNode, commandContext -> ((gy_3)commandContext.getSource()).id_class(YZ.id_class((CommandContext<gy_3>)commandContext, "rot").id_break((gy_3)commandContext.getSource()))))).then(gp_3.id_class("as").then(gp_3.id_class("targets", RZ.id_break()).fork((CommandNode)literalCommandNode, commandContext -> {
            ArrayList arrayList = Lists.newArrayList();
            for (an_3 an_32 : RZ.id_byte((CommandContext<gy_3>)commandContext, "targets")) {
                arrayList.add(((gy_3)commandContext.getSource()).id_class(an_32.id_import()));
            }
            return arrayList;
        }))))).then(((LiteralArgumentBuilder)gp_3.id_class("facing").then(gp_3.id_class("entity").then(gp_3.id_class("targets", RZ.id_break()).then(gp_3.id_class("anchor", Ru_1.id_class()).fork((CommandNode)literalCommandNode, commandContext -> {
            ArrayList arrayList = Lists.newArrayList();
            Rm_1 rm_1 = Ru_1.id_class((CommandContext<gy_3>)commandContext, "anchor");
            for (an_3 an_32 : RZ.id_byte((CommandContext<gy_3>)commandContext, "targets")) {
                arrayList.add(((gy_3)commandContext.getSource()).id_class(an_32, rm_1));
            }
            return arrayList;
        }))))).then(gp_3.id_class("pos", Yw_1.id_class()).redirect((CommandNode)literalCommandNode, commandContext -> ((gy_3)commandContext.getSource()).id_break(Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos")))))).then(gp_3.id_class("align").then(gp_3.id_class("axes", Yy_1.id_class()).redirect((CommandNode)literalCommandNode, commandContext -> ((gy_3)commandContext.getSource()).id_class(((gy_3)commandContext.getSource()).id_volatile().id_class(Yy_1.id_class((CommandContext<gy_3>)commandContext, "axes"))))))).then(gp_3.id_class("anchored").then(gp_3.id_class("anchor", Ru_1.id_class()).redirect((CommandNode)literalCommandNode, commandContext -> ((gy_3)commandContext.getSource()).id_class(Ru_1.id_class((CommandContext<gy_3>)commandContext, "anchor")))))).then(gp_3.id_class("in").then(gp_3.id_class("dimension", RN.id_class()).redirect((CommandNode)literalCommandNode, commandContext -> ((gy_3)commandContext.getSource()).id_class(RN.id_class((CommandContext<gy_3>)commandContext, "dimension"))))));
    }

    private static int id_class(KI kI, YJ yJ) throws CommandSyntaxException {
        return yJ.id_break(kI.id_class());
    }

    private static ArgumentBuilder<gy_3, ?> id_class(CommandNode<gy_3> commandNode, ArgumentBuilder<gy_3, ?> argumentBuilder, boolean bl, boolean bl2) {
        return argumentBuilder.fork(commandNode, commandContext -> oz_3.id_class((CommandContext<gy_3>)commandContext, bl, oz_3.id_byte((CommandContext<gy_3>)commandContext, bl2).isPresent())).executes(bl ? commandContext -> oz_3.id_class((CommandContext<gy_3>)commandContext, bl2) : commandContext -> oz_3.id_break((CommandContext<gy_3>)commandContext, bl2));
    }

    private static int id_class(CommandContext<gy_3> commandContext, boolean bl) throws CommandSyntaxException {
        OptionalInt optionalInt = oz_3.id_byte(commandContext, bl);
        if (optionalInt.isPresent()) {
            ((gy_3)commandContext.getSource()).id_class(new rgn_3("commands.execute.conditional.pass_count", optionalInt.getAsInt()), false);
            return optionalInt.getAsInt();
        }
        throw id_break.create();
    }

    private static ArgumentBuilder<gy_3, ?> id_class(CommandNode<gy_3> commandNode, ArgumentBuilder<gy_3, ?> argumentBuilder, boolean bl, oQ_2 oQ_22) {
        return argumentBuilder.fork(commandNode, commandContext -> oz_3.id_class((CommandContext<gy_3>)commandContext, bl, oQ_22.test((CommandContext<gy_3>)commandContext))).executes(commandContext -> {
            if (bl == oQ_22.test((CommandContext<gy_3>)commandContext)) {
                ((gy_3)commandContext.getSource()).id_class(new rgn_3("commands.execute.conditional.pass"), false);
                return 1;
            }
            throw id_break.create();
        });
    }

    private static OptionalInt id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, rfH_2 rfH_23, rfH_2 rfH_24, boolean bl) throws CommandSyntaxException {
        rfi_3 rfi_32 = new rfi_3(rfH_22, rfH_23);
        rfi_3 rfi_33 = new rfi_3(rfH_24, rfH_24.id_break(rfi_32.id_byte()));
        rfH_2 rfH_25 = new rfH_2(rfi_33.id_class - rfi_32.id_class, rfi_33.id_break - rfi_32.id_break, rfi_33.id_byte - rfi_32.id_byte);
        int n = rfi_32.id_protected() * rfi_32.id_throws() * rfi_32.id_case();
        if (n > 32768) {
            throw id_class.create((Object)32768, (Object)n);
        }
        int n2 = 0;
        for (int i = rfi_32.id_byte; i <= rfi_32.id_case; ++i) {
            for (int j = rfi_32.id_break; j <= rfi_32.id_throws; ++j) {
                for (int k = rfi_32.id_class; k <= rfi_32.id_protected; ++k) {
                    rfH_2 rfH_26 = new rfH_2(k, j, i);
                    rfH_2 rfH_27 = rfH_26.id_break(rfH_25);
                    xc_3 xc_32 = rrEm_12.id_byte(rfH_26);
                    if (bl && xc_32.id_class(xu_3.id_class)) continue;
                    if (xc_32 != rrEm_12.id_byte(rfH_27)) {
                        return OptionalInt.empty();
                    }
                    ryO_2 ryO_22 = rrEm_12.id_class(rfH_26);
                    ryO_2 ryO_23 = rrEm_12.id_class(rfH_27);
                    if (ryO_22 != null) {
                        if (ryO_23 == null) {
                            return OptionalInt.empty();
                        }
                        rcd_3 rcd_32 = ryO_22.id_class(new rcd_3());
                        rcd_32.id_continue("x");
                        rcd_32.id_continue("y");
                        rcd_32.id_continue("z");
                        rcd_3 rcd_33 = ryO_23.id_class(new rcd_3());
                        rcd_33.id_continue("x");
                        rcd_33.id_continue("y");
                        rcd_33.id_continue("z");
                        if (!rcd_32.equals(rcd_33)) {
                            return OptionalInt.empty();
                        }
                    }
                    ++n2;
                }
            }
        }
        return OptionalInt.of(n2);
    }

    private static boolean id_class(CommandContext<gy_3> commandContext, XF xF) throws CommandSyntaxException {
        String string = Yv_1.id_class(commandContext, "target");
        rnP_2 rnP_22 = Yk_1.id_class(commandContext, "targetObjective");
        rnG_2 rnG_22 = ((gy_3)commandContext.getSource()).id_super().R();
        return !rnG_22.id_class(string, rnP_22) ? false : xF.id_byte(rnG_22.id_break(string, rnP_22).id_break());
    }

    private static boolean id_class(CommandContext<gy_3> commandContext, BiPredicate<Integer, Integer> biPredicate) throws CommandSyntaxException {
        String string = Yv_1.id_class(commandContext, "target");
        rnP_2 rnP_22 = Yk_1.id_class(commandContext, "targetObjective");
        String string2 = Yv_1.id_class(commandContext, "source");
        rnP_2 rnP_23 = Yk_1.id_class(commandContext, "sourceObjective");
        rnG_2 rnG_22 = ((gy_3)commandContext.getSource()).id_super().R();
        if (rnG_22.id_class(string, rnP_22) && rnG_22.id_class(string2, rnP_23)) {
            rAa_1 rAa_12 = rnG_22.id_break(string, rnP_22);
            rAa_1 rAa_13 = rnG_22.id_break(string2, rnP_23);
            return biPredicate.test(rAa_12.id_break(), rAa_13.id_break());
        }
        return false;
    }

    private static Collection<gy_3> id_class(CommandContext<gy_3> commandContext, boolean bl, boolean bl2) {
        return bl2 == bl ? Collections.singleton((gy_3)commandContext.getSource()) : Collections.emptyList();
    }

    private static boolean id_class(gy_3 gy_32, rQz_1 rQz_12) {
        rrEm_1 rrEm_12 = gy_32.id_final();
        rzP_2 rzP_22 = new rzP_2(rrEm_12).id_class(rzQ_2.id_case, gy_32.id_volatile()).id_break(rzQ_2.id_class, gy_32.id_package());
        return rQz_12.test(rzP_22.id_class(rzz_3.id_byte));
    }

    private static int id_break(CommandContext<gy_3> commandContext, boolean bl) throws CommandSyntaxException {
        OptionalInt optionalInt = oz_3.id_byte(commandContext, bl);
        if (optionalInt.isPresent()) {
            throw id_byte.create((Object)optionalInt.getAsInt());
        }
        ((gy_3)commandContext.getSource()).id_class(new rgn_3("commands.execute.conditional.pass"), false);
        return 1;
    }
}

