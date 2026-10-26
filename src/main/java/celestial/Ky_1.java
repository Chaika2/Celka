/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.KI;
import celestial.KT;
import celestial.Kf_1;
import celestial.Kl_1;
import celestial.Kp_1;
import celestial.Kq_1;
import celestial.Kt_1;
import celestial.YE;
import celestial.YJ;
import celestial.Yd_1;
import celestial.Ys_1;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rcK_2;
import celestial.rcZ_2;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rcx_3;
import celestial.rcy_3;
import celestial.rfU_2;
import celestial.rgn_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class Ky_1 {
    private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType((Message)new rgn_3("commands.data.merge.failed"));
    private static final DynamicCommandExceptionType id_throws = new DynamicCommandExceptionType(object -> new rgn_3("commands.data.get.invalid", object));
    private static final DynamicCommandExceptionType id_case = new DynamicCommandExceptionType(object -> new rgn_3("commands.data.get.unknown", object));
    private static final SimpleCommandExceptionType id_catch = new SimpleCommandExceptionType((Message)new rgn_3("commands.data.get.multiple"));
    private static final DynamicCommandExceptionType id_private = new DynamicCommandExceptionType(object -> new rgn_3("commands.data.modify.expected_list", object));
    private static final DynamicCommandExceptionType id_implements = new DynamicCommandExceptionType(object -> new rgn_3("commands.data.modify.expected_object", object));
    private static final DynamicCommandExceptionType id_finally = new DynamicCommandExceptionType(object -> new rgn_3("commands.data.modify.invalid_index", object));
    public static final List<Function<String, Kp_1>> id_class = ImmutableList.of(Kt_1.id_class, Kl_1.id_class, Kf_1.id_class);
    public static final List<Kp_1> id_break = (List)id_class.stream().map(function -> (Kp_1)function.apply("target")).collect(ImmutableList.toImmutableList());
    public static final List<Kp_1> id_byte = (List)id_class.stream().map(function -> (Kp_1)function.apply("source")).collect(ImmutableList.toImmutableList());

    private static int id_class(CommandContext<gy_3> commandContext, Kp_1 kp_1, KT kT, List<rcZ_2> list) throws CommandSyntaxException {
        KI kI = kp_1.id_class(commandContext);
        YJ yJ = YE.id_class(commandContext, "targetPath");
        rcd_3 rcd_32 = kI.id_class();
        int n = kT.modify(commandContext, rcd_32, yJ, list);
        if (n == 0) {
            throw id_protected.create();
        }
        kI.id_class(rcd_32);
        ((gy_3)commandContext.getSource()).id_class(kI.id_break(), true);
        return n;
    }

    private static int id_class(gy_3 gy_32, KI kI, YJ yJ) throws CommandSyntaxException {
        rcd_3 rcd_32 = kI.id_class();
        int n = yJ.id_byte(rcd_32);
        if (n == 0) {
            throw id_protected.create();
        }
        kI.id_class(rcd_32);
        gy_32.id_class(kI.id_break(), true);
        return n;
    }

    private static int id_class(int n, rcd_3 rcd_32, YJ yJ, List<rcZ_2> list) throws CommandSyntaxException {
        List<rcZ_2> list2 = yJ.id_class(rcd_32, rcy_3::new);
        int n2 = 0;
        for (rcZ_2 rcZ_22 : list2) {
            if (!(rcZ_22 instanceof rcx_3)) {
                throw id_private.create((Object)rcZ_22);
            }
            boolean bl = false;
            rcx_3 rcx_32 = (rcx_3)rcZ_22;
            int n3 = n < 0 ? rcx_32.size() + n + 1 : n;
            for (rcZ_2 rcZ_23 : list) {
                try {
                    if (!rcx_32.id_break(n3, rcZ_23.id_byte())) continue;
                    ++n3;
                    bl = true;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw id_finally.create((Object)n3);
                }
            }
            n2 += bl ? 1 : 0;
        }
        return n2;
    }

    private static ArgumentBuilder<gy_3, ?> id_class(BiConsumer<ArgumentBuilder<gy_3, ?>, Kq_1> biConsumer) {
        LiteralArgumentBuilder<gy_3> literalArgumentBuilder = gp_3.id_class("modify");
        for (Kp_1 kp_1 : id_break) {
            kp_1.id_class((ArgumentBuilder<gy_3, ?>)literalArgumentBuilder, argumentBuilder -> {
                RequiredArgumentBuilder<gy_3, YJ> requiredArgumentBuilder = gp_3.id_class("targetPath", YE.id_class());
                for (Kp_1 kp_12 : id_byte) {
                    biConsumer.accept((ArgumentBuilder<gy_3, ?>)requiredArgumentBuilder, kT -> kp_12.id_class((ArgumentBuilder<gy_3, ?>)gp_3.id_class("from"), argumentBuilder -> argumentBuilder.executes(commandContext -> {
                        List<rcZ_2> list = Collections.singletonList(kp_12.id_class((CommandContext<gy_3>)commandContext).id_class());
                        return Ky_1.id_class((CommandContext<gy_3>)commandContext, kp_1, kT, list);
                    }).then(gp_3.id_class("sourcePath", YE.id_class()).executes(commandContext -> {
                        KI kI = kp_12.id_class((CommandContext<gy_3>)commandContext);
                        YJ yJ = YE.id_class((CommandContext<gy_3>)commandContext, "sourcePath");
                        List<rcZ_2> list = yJ.id_class(kI.id_class());
                        return Ky_1.id_class((CommandContext<gy_3>)commandContext, kp_1, kT, list);
                    }))));
                }
                biConsumer.accept((ArgumentBuilder<gy_3, ?>)requiredArgumentBuilder, kT -> gp_3.id_class("value").then(gp_3.id_class("value", Yd_1.id_class()).executes(commandContext -> {
                    List<rcZ_2> list = Collections.singletonList(Yd_1.id_class(commandContext, "value"));
                    return Ky_1.id_class((CommandContext<gy_3>)commandContext, kp_1, kT, list);
                })));
                return argumentBuilder.then(requiredArgumentBuilder);
            });
        }
        return literalArgumentBuilder;
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        LiteralArgumentBuilder literalArgumentBuilder = (LiteralArgumentBuilder)gp_3.id_class("data").requires(gy_32 -> gy_32.id_class(2));
        for (Kp_1 kp_1 : id_break) {
            ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder.then(kp_1.id_class((ArgumentBuilder<gy_3, ?>)gp_3.id_class("merge"), argumentBuilder -> argumentBuilder.then(gp_3.id_class("nbt", Ys_1.id_class()).executes(commandContext -> Ky_1.id_class((gy_3)commandContext.getSource(), kp_1.id_class((CommandContext<gy_3>)commandContext), Ys_1.id_class(commandContext, "nbt"))))))).then(kp_1.id_class((ArgumentBuilder<gy_3, ?>)gp_3.id_class("get"), argumentBuilder -> argumentBuilder.executes(commandContext -> Ky_1.id_class((gy_3)commandContext.getSource(), kp_1.id_class((CommandContext<gy_3>)commandContext))).then(((RequiredArgumentBuilder)gp_3.id_class("path", YE.id_class()).executes(commandContext -> Ky_1.id_break((gy_3)commandContext.getSource(), kp_1.id_class((CommandContext<gy_3>)commandContext), YE.id_class((CommandContext<gy_3>)commandContext, "path")))).then(gp_3.id_class("scale", DoubleArgumentType.doubleArg()).executes(commandContext -> Ky_1.id_class((gy_3)commandContext.getSource(), kp_1.id_class((CommandContext<gy_3>)commandContext), YE.id_class((CommandContext<gy_3>)commandContext, "path"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale")))))))).then(kp_1.id_class((ArgumentBuilder<gy_3, ?>)gp_3.id_class("remove"), argumentBuilder -> argumentBuilder.then(gp_3.id_class("path", YE.id_class()).executes(commandContext -> Ky_1.id_class((gy_3)commandContext.getSource(), kp_1.id_class((CommandContext<gy_3>)commandContext), YE.id_class((CommandContext<gy_3>)commandContext, "path"))))))).then(Ky_1.id_class((ArgumentBuilder<gy_3, ?> argumentBuilder, Kq_1 kq_1) -> argumentBuilder.then(gp_3.id_class("insert").then(gp_3.id_class("index", IntegerArgumentType.integer()).then(kq_1.create((commandContext, rcd_32, yJ, list) -> {
                int n = IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"index");
                return Ky_1.id_class(n, rcd_32, yJ, (List<rcZ_2>)list);
            })))).then(gp_3.id_class("prepend").then(kq_1.create((commandContext, rcd_32, yJ, list) -> Ky_1.id_class(0, rcd_32, yJ, (List<rcZ_2>)list)))).then(gp_3.id_class("append").then(kq_1.create((commandContext, rcd_32, yJ, list) -> Ky_1.id_class(-1, rcd_32, yJ, (List<rcZ_2>)list)))).then(gp_3.id_class("set").then(kq_1.create((commandContext, rcd_32, yJ, list) -> yJ.id_break(rcd_32, ((rcZ_2)Iterables.getLast((Iterable)list))::id_byte)))).then(gp_3.id_class("merge").then(kq_1.create((commandContext, rcd_32, yJ, list) -> {
                List<rcZ_2> list2 = yJ.id_class(rcd_32, rcd_3::new);
                int n = 0;
                for (rcZ_2 rcZ_22 : list2) {
                    if (!(rcZ_22 instanceof rcd_3)) {
                        throw id_implements.create((Object)rcZ_22);
                    }
                    rcd_3 rcd_33 = (rcd_3)rcZ_22;
                    rcd_3 rcd_34 = rcd_33.id_catch();
                    for (rcZ_2 rcZ_23 : list) {
                        if (!(rcZ_23 instanceof rcd_3)) {
                            throw id_implements.create((Object)rcZ_23);
                        }
                        rcd_33.id_class((rcd_3)rcZ_23);
                    }
                    n += rcd_34.equals(rcd_33) ? 0 : 1;
                }
                return n;
            })))));
        }
        commandDispatcher.register(literalArgumentBuilder);
    }

    private static int id_class(gy_3 gy_32, KI kI, rcd_3 rcd_32) throws CommandSyntaxException {
        rcd_3 rcd_33;
        rcd_3 rcd_34 = kI.id_class();
        if (rcd_34.equals(rcd_33 = rcd_34.id_catch().id_class(rcd_32))) {
            throw id_protected.create();
        }
        kI.id_class(rcd_33);
        gy_32.id_class(kI.id_break(), true);
        return 1;
    }

    private static int id_class(gy_3 gy_32, KI kI) throws CommandSyntaxException {
        gy_32.id_class(kI.id_class((rcZ_2)kI.id_class()), false);
        return 1;
    }

    private static int id_class(gy_3 gy_32, KI kI, YJ yJ, double d) throws CommandSyntaxException {
        rcZ_2 rcZ_22 = Ky_1.id_class(yJ, kI);
        if (!(rcZ_22 instanceof rcK_2)) {
            throw id_throws.create((Object)yJ.toString());
        }
        int n = rfU_2.id_byte(((rcK_2)rcZ_22).id_implements() * d);
        gy_32.id_class(kI.id_class(yJ, d, n), false);
        return n;
    }

    private static rcZ_2 id_class(YJ yJ, KI kI) throws CommandSyntaxException {
        List<rcZ_2> list = yJ.id_class(kI.id_class());
        Iterator iterator = list.iterator();
        rcZ_2 rcZ_22 = (rcZ_2)iterator.next();
        if (iterator.hasNext()) {
            throw id_catch.create();
        }
        return rcZ_22;
    }

    private static int id_break(gy_3 gy_32, KI kI, YJ yJ) throws CommandSyntaxException {
        int n;
        rcZ_2 rcZ_22 = Ky_1.id_class(yJ, kI);
        if (rcZ_22 instanceof rcK_2) {
            n = rfU_2.id_byte(((rcK_2)rcZ_22).id_implements());
        } else if (rcZ_22 instanceof rcx_3) {
            n = ((rcx_3)rcZ_22).size();
        } else if (rcZ_22 instanceof rcd_3) {
            n = ((rcd_3)rcZ_22).id_throws();
        } else {
            if (!(rcZ_22 instanceof rca_3)) {
                throw id_case.create((Object)yJ.toString());
            }
            n = rcZ_22.id_native().length();
        }
        gy_32.id_class(kI.id_class(rcZ_22), false);
        return n;
    }
}

