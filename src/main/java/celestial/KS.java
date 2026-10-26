/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.RH;
import celestial.Yq_1;
import celestial.gD_2;
import celestial.gR_2;
import celestial.ge_3;
import celestial.gi_3;
import celestial.gp_3;
import celestial.gt_3;
import celestial.gy_3;
import celestial.oF_2;
import celestial.rgn_3;
import celestial.rlb_3;
import celestial.rnW_2;
import celestial.rqO_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;

public class KS {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.schedule.same_tick"));
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("commands.schedule.cleared.failure", object));
    private static final SuggestionProvider<gy_3> id_byte = (commandContext, suggestionsBuilder) -> gR_2.id_break(((gy_3)commandContext.getSource()).id_super().rB().id_instanceof().id_else().id_class(), suggestionsBuilder);

    private static int id_class(gy_3 gy_32, Pair<rqO_2, Either<gt_3, rlb_3<gt_3>>> pair, int n, boolean bl) throws CommandSyntaxException {
        if (n == 0) {
            throw id_class.create();
        }
        long l = gy_32.id_final().r() + (long)n;
        rqO_2 rqO_22 = (rqO_2)pair.getFirst();
        gi_3<rnW_2> gi_32 = gy_32.id_super().rB().id_instanceof().id_else();
        ((Either)pair.getSecond()).ifLeft(gt_32 -> {
            String string = rqO_22.toString();
            if (bl) {
                gi_32.id_class(string);
            }
            gi_32.id_class(string, l, new gD_2(rqO_22));
            gy_32.id_class(new rgn_3("commands.schedule.created.function", rqO_22, n, l), true);
        }).ifRight(rlb_32 -> {
            String string = "#" + rqO_22.toString();
            if (bl) {
                gi_32.id_class(string);
            }
            gi_32.id_class(string, l, new ge_3(rqO_22));
            gy_32.id_class(new rgn_3("commands.schedule.created.tag", rqO_22, n, l), true);
        });
        return (int)Math.floorMod(l, Integer.MAX_VALUE);
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("schedule").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("function").then(gp_3.id_class("function", RH.id_class()).suggests(oF_2.id_class).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("time", Yq_1.id_class()).executes(commandContext -> KS.id_class((gy_3)commandContext.getSource(), RH.id_break((CommandContext<gy_3>)commandContext, "function"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time"), true))).then(gp_3.id_class("append").executes(commandContext -> KS.id_class((gy_3)commandContext.getSource(), RH.id_break((CommandContext<gy_3>)commandContext, "function"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time"), false)))).then(gp_3.id_class("replace").executes(commandContext -> KS.id_class((gy_3)commandContext.getSource(), RH.id_break((CommandContext<gy_3>)commandContext, "function"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time"), true))))))).then(gp_3.id_class("clear").then(gp_3.id_class("function", StringArgumentType.greedyString()).suggests(id_byte).executes(commandContext -> KS.id_class((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"function"))))));
    }

    private static int id_class(gy_3 gy_32, String string) throws CommandSyntaxException {
        int n = gy_32.id_super().rB().id_instanceof().id_else().id_class(string);
        if (n == 0) {
            throw id_break.create((Object)string);
        }
        gy_32.id_class(new rgn_3("commands.schedule.cleared.success", n, string), true);
        return n;
    }
}

