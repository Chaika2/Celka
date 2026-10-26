/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
package celestial;

import celestial.gR_2;
import celestial.gp_3;
import celestial.gy_3;
import celestial.oe_3;
import celestial.oh_3;
import celestial.rAp_1;
import celestial.rAt_1;
import celestial.rgn_3;
import celestial.rgv_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class oO_2 {
    private static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("commands.datapack.unknown", object));
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("commands.datapack.enable.failed", object));
    private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(object -> new rgn_3("commands.datapack.disable.failed", object));
    private static final SuggestionProvider<gy_3> id_protected = (commandContext, suggestionsBuilder) -> gR_2.id_break(((gy_3)commandContext.getSource()).id_super().I().id_protected().stream().map(StringArgumentType::escapeIfRequired), suggestionsBuilder);
    private static final SuggestionProvider<gy_3> id_throws = (commandContext, suggestionsBuilder) -> {
        rAt_1 rAt_12 = ((gy_3)commandContext.getSource()).id_super().I();
        Collection<String> collection = rAt_12.id_protected();
        return gR_2.id_break(rAt_12.id_break().stream().filter(string -> !collection.contains(string)).map(StringArgumentType::escapeIfRequired), suggestionsBuilder);
    };

    private static int id_byte(gy_3 gy_32) {
        rAt_1 rAt_12 = gy_32.id_super().I();
        rAt_12.id_class();
        Collection<rAp_1> collection = rAt_12.id_throws();
        if (collection.isEmpty()) {
            gy_32.id_class(new rgn_3("commands.datapack.list.enabled.none"), false);
        } else {
            gy_32.id_class(new rgn_3("commands.datapack.list.enabled.success", collection.size(), rgv_3.id_break(collection, (T rAp_12) -> rAp_12.id_class(true))), false);
        }
        return collection.size();
    }

    private static int id_class(gy_3 gy_32, rAp_1 rAp_12, oh_3 oh_32) throws CommandSyntaxException {
        rAt_1 rAt_12 = gy_32.id_super().I();
        ArrayList arrayList = Lists.newArrayList(rAt_12.id_throws());
        oh_32.apply(arrayList, rAp_12);
        gy_32.id_class(new rgn_3("commands.datapack.modify.enable", rAp_12.id_class(true)), true);
        oe_3.id_class(arrayList.stream().map(rAp_1::id_throws).collect(Collectors.toList()), gy_32);
        return arrayList.size();
    }

    private static int id_class(gy_3 gy_32, rAp_1 rAp_12) {
        rAt_1 rAt_12 = gy_32.id_super().I();
        ArrayList arrayList = Lists.newArrayList(rAt_12.id_throws());
        arrayList.remove(rAp_12);
        gy_32.id_class(new rgn_3("commands.datapack.modify.disable", rAp_12.id_class(true)), true);
        oe_3.id_class(arrayList.stream().map(rAp_1::id_throws).collect(Collectors.toList()), gy_32);
        return arrayList.size();
    }

    private static int id_class(gy_3 gy_32) {
        return oO_2.id_byte(gy_32) + oO_2.id_break(gy_32);
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("datapack").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("enable").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("name", StringArgumentType.string()).suggests(id_throws).executes(commandContext -> oO_2.id_class((gy_3)commandContext.getSource(), oO_2.id_class((CommandContext<gy_3>)commandContext, "name", true), (List<rAp_1> list, rAp_1 rAp_13) -> rAp_13.id_private().id_class(list, rAp_13, rAp_12 -> rAp_12, false)))).then(gp_3.id_class("after").then(gp_3.id_class("existing", StringArgumentType.string()).suggests(id_protected).executes(commandContext -> oO_2.id_class((gy_3)commandContext.getSource(), oO_2.id_class((CommandContext<gy_3>)commandContext, "name", true), (List<rAp_1> list, rAp_1 rAp_12) -> list.add(list.indexOf(oO_2.id_class((CommandContext<gy_3>)commandContext, "existing", false)) + 1, rAp_12)))))).then(gp_3.id_class("before").then(gp_3.id_class("existing", StringArgumentType.string()).suggests(id_protected).executes(commandContext -> oO_2.id_class((gy_3)commandContext.getSource(), oO_2.id_class((CommandContext<gy_3>)commandContext, "name", true), (List<rAp_1> list, rAp_1 rAp_12) -> list.add(list.indexOf(oO_2.id_class((CommandContext<gy_3>)commandContext, "existing", false)), rAp_12)))))).then(gp_3.id_class("last").executes(commandContext -> oO_2.id_class((gy_3)commandContext.getSource(), oO_2.id_class((CommandContext<gy_3>)commandContext, "name", true), List::add)))).then(gp_3.id_class("first").executes(commandContext -> oO_2.id_class((gy_3)commandContext.getSource(), oO_2.id_class((CommandContext<gy_3>)commandContext, "name", true), (List<rAp_1> list, rAp_1 rAp_12) -> list.add(0, rAp_12))))))).then(gp_3.id_class("disable").then(gp_3.id_class("name", StringArgumentType.string()).suggests(id_protected).executes(commandContext -> oO_2.id_class((gy_3)commandContext.getSource(), oO_2.id_class((CommandContext<gy_3>)commandContext, "name", false)))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("list").executes(commandContext -> oO_2.id_class((gy_3)commandContext.getSource()))).then(gp_3.id_class("available").executes(commandContext -> oO_2.id_break((gy_3)commandContext.getSource())))).then(gp_3.id_class("enabled").executes(commandContext -> oO_2.id_byte((gy_3)commandContext.getSource())))));
    }

    private static rAp_1 id_class(CommandContext<gy_3> commandContext, String string, boolean bl) throws CommandSyntaxException {
        String string2 = StringArgumentType.getString(commandContext, (String)string);
        rAt_1 rAt_12 = ((gy_3)commandContext.getSource()).id_super().I();
        rAp_1 rAp_12 = rAt_12.id_class(string2);
        if (rAp_12 == null) {
            throw id_class.create((Object)string2);
        }
        boolean bl2 = rAt_12.id_throws().contains(rAp_12);
        if (bl && bl2) {
            throw id_break.create((Object)string2);
        }
        if (!bl && !bl2) {
            throw id_byte.create((Object)string2);
        }
        return rAp_12;
    }

    private static int id_break(gy_3 gy_32) {
        rAt_1 rAt_12 = gy_32.id_super().I();
        rAt_12.id_class();
        Collection<rAp_1> collection = rAt_12.id_throws();
        Collection<rAp_1> collection2 = rAt_12.id_byte();
        List list = collection2.stream().filter(rAp_12 -> !collection.contains(rAp_12)).collect(Collectors.toList());
        if (list.isEmpty()) {
            gy_32.id_class(new rgn_3("commands.datapack.list.available.none"), false);
        } else {
            gy_32.id_class(new rgn_3("commands.datapack.list.available.success", list.size(), rgv_3.id_break(list, (T rAp_12) -> rAp_12.id_class(false))), false);
        }
        return list.size();
    }
}

