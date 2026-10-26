/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
package celestial;

import celestial.RQ;
import celestial.RZ;
import celestial.Ym_1;
import celestial.an_3;
import celestial.gR_2;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rRM;
import celestial.rRb_1;
import celestial.rVi_1;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rgv_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rnd_3;
import celestial.rnx_3;
import celestial.rqO_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.Collections;

public class os_3 {
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("commands.bossbar.create.failed", object));
    private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(object -> new rgn_3("commands.bossbar.unknown", object));
    private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType((Message)new rgn_3("commands.bossbar.set.players.unchanged"));
    private static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType((Message)new rgn_3("commands.bossbar.set.name.unchanged"));
    private static final SimpleCommandExceptionType id_case = new SimpleCommandExceptionType((Message)new rgn_3("commands.bossbar.set.color.unchanged"));
    private static final SimpleCommandExceptionType id_catch = new SimpleCommandExceptionType((Message)new rgn_3("commands.bossbar.set.style.unchanged"));
    private static final SimpleCommandExceptionType id_private = new SimpleCommandExceptionType((Message)new rgn_3("commands.bossbar.set.value.unchanged"));
    private static final SimpleCommandExceptionType id_implements = new SimpleCommandExceptionType((Message)new rgn_3("commands.bossbar.set.max.unchanged"));
    private static final SimpleCommandExceptionType id_finally = new SimpleCommandExceptionType((Message)new rgn_3("commands.bossbar.set.visibility.unchanged.hidden"));
    private static final SimpleCommandExceptionType id_extends = new SimpleCommandExceptionType((Message)new rgn_3("commands.bossbar.set.visibility.unchanged.visible"));
    public static final SuggestionProvider<gy_3> id_class = (commandContext, suggestionsBuilder) -> gR_2.id_class(((gy_3)commandContext.getSource()).id_super().U().id_class(), suggestionsBuilder);

    private static int id_byte(gy_3 gy_32, rnx_3 rnx_32) {
        if (rnx_32.id_package()) {
            gy_32.id_class(new rgn_3("commands.bossbar.get.visible.visible", rnx_32.id_case()), true);
            return 1;
        }
        gy_32.id_class(new rgn_3("commands.bossbar.get.visible.hidden", rnx_32.id_case()), true);
        return 0;
    }

    private static int id_class(gy_3 gy_32, rqO_2 rqO_22, rgP_2 rgP_22) throws CommandSyntaxException {
        rnd_3 rnd_32 = gy_32.id_super().U();
        if (rnd_32.id_class(rqO_22) != null) {
            throw id_break.create((Object)rqO_22.toString());
        }
        rnx_3 rnx_32 = rnd_32.id_class(rqO_22, rgv_3.id_class(gy_32, rgP_22, (an_3)null, 0));
        gy_32.id_class(new rgn_3("commands.bossbar.create.success", rnx_32.id_case()), true);
        return rnd_32.id_break().size();
    }

    private static int id_class(gy_3 gy_32) {
        Collection<rnx_3> collection = gy_32.id_super().U().id_break();
        if (collection.isEmpty()) {
            gy_32.id_class(new rgn_3("commands.bossbar.list.bars.none"), false);
        } else {
            gy_32.id_class(new rgn_3("commands.bossbar.list.bars.some", collection.size(), rgv_3.id_break(collection, rnx_3::id_case)), false);
        }
        return collection.size();
    }

    private static int id_class(gy_3 gy_32, rnx_3 rnx_32, Collection<rhN_2> collection) throws CommandSyntaxException {
        boolean bl = rnx_32.id_class(collection);
        if (!bl) {
            throw id_protected.create();
        }
        if (rnx_32.id_int().isEmpty()) {
            gy_32.id_class(new rgn_3("commands.bossbar.set.players.success.none", rnx_32.id_case()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.bossbar.set.players.success.some", rnx_32.id_case(), collection.size(), rgv_3.id_break(collection, rhd_3::L_)), true);
        }
        return rnx_32.id_int().size();
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("bossbar").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("add").then(gp_3.id_class("id", Ym_1.id_class()).then(gp_3.id_class("name", RQ.id_class()).executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), Ym_1.id_throws((CommandContext<gy_3>)commandContext, "id"), RQ.id_class((CommandContext<gy_3>)commandContext, "name"))))))).then(gp_3.id_class("remove").then(gp_3.id_class("id", Ym_1.id_class()).suggests(id_class).executes(commandContext -> os_3.id_throws((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext)))))).then(gp_3.id_class("list").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource())))).then(gp_3.id_class("set").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("id", Ym_1.id_class()).suggests(id_class).then(gp_3.id_class("name").then(gp_3.id_class("name", RQ.id_class()).executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), RQ.id_class((CommandContext<gy_3>)commandContext, "name")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("color").then(gp_3.id_class("pink").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), rRb_1.PINK)))).then(gp_3.id_class("blue").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), rRb_1.BLUE)))).then(gp_3.id_class("red").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), rRb_1.RED)))).then(gp_3.id_class("green").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), rRb_1.GREEN)))).then(gp_3.id_class("yellow").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), rRb_1.YELLOW)))).then(gp_3.id_class("purple").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), rRb_1.PURPLE)))).then(gp_3.id_class("white").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), rRb_1.WHITE))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("style").then(gp_3.id_class("progress").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), rRM.PROGRESS)))).then(gp_3.id_class("notched_6").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), rRM.NOTCHED_6)))).then(gp_3.id_class("notched_10").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), rRM.NOTCHED_10)))).then(gp_3.id_class("notched_12").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), rRM.NOTCHED_12)))).then(gp_3.id_class("notched_20").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), rRM.NOTCHED_20))))).then(gp_3.id_class("value").then(gp_3.id_class("value", IntegerArgumentType.integer((int)0)).executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"value")))))).then(gp_3.id_class("max").then(gp_3.id_class("max", IntegerArgumentType.integer((int)1)).executes(commandContext -> os_3.id_break((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"max")))))).then(gp_3.id_class("visible").then(gp_3.id_class("visible", BoolArgumentType.bool()).executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), BoolArgumentType.getBool((CommandContext)commandContext, (String)"visible")))))).then(((LiteralArgumentBuilder)gp_3.id_class("players").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), Collections.emptyList()))).then(gp_3.id_class("targets", RZ.id_protected()).executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext), RZ.id_protected((CommandContext<gy_3>)commandContext, "targets")))))))).then(gp_3.id_class("get").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("id", Ym_1.id_class()).suggests(id_class).then(gp_3.id_class("value").executes(commandContext -> os_3.id_class((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext))))).then(gp_3.id_class("max").executes(commandContext -> os_3.id_break((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext))))).then(gp_3.id_class("visible").executes(commandContext -> os_3.id_byte((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext))))).then(gp_3.id_class("players").executes(commandContext -> os_3.id_protected((gy_3)commandContext.getSource(), os_3.id_class((CommandContext<gy_3>)commandContext)))))));
    }

    private static int id_class(gy_3 gy_32, rnx_3 rnx_32) {
        gy_32.id_class(new rgn_3("commands.bossbar.get.value", rnx_32.id_case(), rnx_32.id_protected()), true);
        return rnx_32.id_protected();
    }

    private static int id_class(gy_3 gy_32, rnx_3 rnx_32, int n) throws CommandSyntaxException {
        if (rnx_32.id_protected() == n) {
            throw id_private.create();
        }
        rnx_32.id_class(n);
        gy_32.id_class(new rgn_3("commands.bossbar.set.value.success", rnx_32.id_case(), n), true);
        return n;
    }

    private static int id_class(gy_3 gy_32, rnx_3 rnx_32, boolean bl) throws CommandSyntaxException {
        if (rnx_32.id_package() == bl) {
            if (bl) {
                throw id_extends.create();
            }
            throw id_finally.create();
        }
        rnx_32.id_protected(bl);
        if (bl) {
            gy_32.id_class(new rgn_3("commands.bossbar.set.visible.success.visible", rnx_32.id_case()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.bossbar.set.visible.success.hidden", rnx_32.id_case()), true);
        }
        return 0;
    }

    private static int id_class(gy_3 gy_32, rnx_3 rnx_32, rRb_1 rRb_12) throws CommandSyntaxException {
        if (rnx_32.id_finally().equals((Object)rRb_12)) {
            throw id_case.create();
        }
        rnx_32.id_class(rRb_12);
        gy_32.id_class(new rgn_3("commands.bossbar.set.color.success", rnx_32.id_case()), true);
        return 0;
    }

    private static int id_class(gy_3 gy_32, rnx_3 rnx_32, rgP_2 rgP_22) throws CommandSyntaxException {
        rVi_1 rVi_12 = rgv_3.id_class(gy_32, rgP_22, (an_3)null, 0);
        if (rnx_32.id_implements().equals(rVi_12)) {
            throw id_throws.create();
        }
        rnx_32.id_class(rVi_12);
        gy_32.id_class(new rgn_3("commands.bossbar.set.name.success", rnx_32.id_case()), true);
        return 0;
    }

    private static int id_class(gy_3 gy_32, rnx_3 rnx_32, rRM rRM2) throws CommandSyntaxException {
        if (rnx_32.id_extends().equals((Object)rRM2)) {
            throw id_catch.create();
        }
        rnx_32.id_class(rRM2);
        gy_32.id_class(new rgn_3("commands.bossbar.set.style.success", rnx_32.id_case()), true);
        return 0;
    }

    public static rnx_3 id_class(CommandContext<gy_3> commandContext) throws CommandSyntaxException {
        rqO_2 rqO_22 = Ym_1.id_throws(commandContext, "id");
        rnx_3 rnx_32 = ((gy_3)commandContext.getSource()).id_super().U().id_class(rqO_22);
        if (rnx_32 == null) {
            throw id_byte.create((Object)rqO_22.toString());
        }
        return rnx_32;
    }

    private static int id_break(gy_3 gy_32, rnx_3 rnx_32) {
        gy_32.id_class(new rgn_3("commands.bossbar.get.max", rnx_32.id_case(), rnx_32.id_throws()), true);
        return rnx_32.id_throws();
    }

    private static int id_break(gy_3 gy_32, rnx_3 rnx_32, int n) throws CommandSyntaxException {
        if (rnx_32.id_throws() == n) {
            throw id_implements.create();
        }
        rnx_32.id_break(n);
        gy_32.id_class(new rgn_3("commands.bossbar.set.max.success", rnx_32.id_case(), n), true);
        return n;
    }

    private static int id_throws(gy_3 gy_32, rnx_3 rnx_32) {
        rnd_3 rnd_32 = gy_32.id_super().U();
        rnx_32.id_byte();
        rnd_32.id_class(rnx_32);
        gy_32.id_class(new rgn_3("commands.bossbar.remove.success", rnx_32.id_case()), true);
        return rnd_32.id_break().size();
    }

    private static int id_protected(gy_3 gy_32, rnx_3 rnx_32) {
        if (rnx_32.id_int().isEmpty()) {
            gy_32.id_class(new rgn_3("commands.bossbar.get.players.none", rnx_32.id_case()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.bossbar.get.players.some", rnx_32.id_case(), rnx_32.id_int().size(), rgv_3.id_break(rnx_32.id_int(), rhd_3::L_)), true);
        }
        return rnx_32.id_int().size();
    }
}

