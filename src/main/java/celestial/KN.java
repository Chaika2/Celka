/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.RQ;
import celestial.RW;
import celestial.Yp_1;
import celestial.Yv_1;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rgv_3;
import celestial.rnB_2;
import celestial.rnG_2;
import celestial.rnX_2;
import celestial.rnh_3;
import celestial.rns_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class KN {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.team.add.duplicate"));
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("commands.team.add.longName", object));
    private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("commands.team.empty.unchanged"));
    private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType((Message)new rgn_3("commands.team.option.name.unchanged"));
    private static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType((Message)new rgn_3("commands.team.option.color.unchanged"));
    private static final SimpleCommandExceptionType id_case = new SimpleCommandExceptionType((Message)new rgn_3("commands.team.option.friendlyfire.alreadyEnabled"));
    private static final SimpleCommandExceptionType id_catch = new SimpleCommandExceptionType((Message)new rgn_3("commands.team.option.friendlyfire.alreadyDisabled"));
    private static final SimpleCommandExceptionType id_private = new SimpleCommandExceptionType((Message)new rgn_3("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
    private static final SimpleCommandExceptionType id_implements = new SimpleCommandExceptionType((Message)new rgn_3("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
    private static final SimpleCommandExceptionType id_finally = new SimpleCommandExceptionType((Message)new rgn_3("commands.team.option.nametagVisibility.unchanged"));
    private static final SimpleCommandExceptionType id_extends = new SimpleCommandExceptionType((Message)new rgn_3("commands.team.option.deathMessageVisibility.unchanged"));
    private static final SimpleCommandExceptionType id_native = new SimpleCommandExceptionType((Message)new rgn_3("commands.team.option.collisionRule.unchanged"));

    private static int id_byte(gy_3 gy_32, rnB_2 rnB_22, rgP_2 rgP_22) {
        rnB_22.id_byte(rgP_22);
        gy_32.id_class(new rgn_3("commands.team.option.suffix.success", rgP_22), false);
        return 1;
    }

    private static int id_byte(gy_3 gy_32, rnB_2 rnB_22) {
        Collection<String> collection = rnB_22.id_case();
        if (collection.isEmpty()) {
            gy_32.id_class(new rgn_3("commands.team.list.members.empty", rnB_22.id_byte()), false);
        } else {
            gy_32.id_class(new rgn_3("commands.team.list.members.success", rnB_22.id_byte(), collection.size(), rgv_3.id_class(collection)), false);
        }
        return collection.size();
    }

    private static int id_class(gy_3 gy_32, rnB_2 rnB_22, rnX_2 rnX_22) throws CommandSyntaxException {
        if (rnB_22.id_implements() == rnX_22) {
            throw id_finally.create();
        }
        rnB_22.id_class(rnX_22);
        gy_32.id_class(new rgn_3("commands.team.option.nametagVisibility.success", rnB_22.id_byte(), rnX_22.id_class()), true);
        return 0;
    }

    private static int id_class(gy_3 gy_32) {
        Collection<rnB_2> collection = gy_32.id_super().R().id_throws();
        if (collection.isEmpty()) {
            gy_32.id_class(new rgn_3("commands.team.list.teams.empty"), false);
        } else {
            gy_32.id_class(new rgn_3("commands.team.list.teams.success", collection.size(), rgv_3.id_break(collection, rnB_2::id_byte)), false);
        }
        return collection.size();
    }

    private static int id_class(gy_3 gy_32, String string, rgP_2 rgP_22) throws CommandSyntaxException {
        rnG_2 rnG_22 = gy_32.id_super().R();
        if (rnG_22.id_throws(string) != null) {
            throw id_class.create();
        }
        if (string.length() > 16) {
            throw id_break.create((Object)16);
        }
        rnB_2 rnB_22 = rnG_22.id_case(string);
        rnB_22.id_class(rgP_22);
        gy_32.id_class(new rgn_3("commands.team.add.success", rnB_22.id_byte()), true);
        return rnG_22.id_throws().size();
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("team").requires(gy_32 -> gy_32.id_class(2))).then(((LiteralArgumentBuilder)gp_3.id_class("list").executes(commandContext -> KN.id_class((gy_3)commandContext.getSource()))).then(gp_3.id_class("team", Yp_1.id_class()).executes(commandContext -> KN.id_byte((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team")))))).then(gp_3.id_class("add").then(((RequiredArgumentBuilder)gp_3.id_class("team", StringArgumentType.word()).executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"team")))).then(gp_3.id_class("displayName", RQ.id_class()).executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"team"), RQ.id_class((CommandContext<gy_3>)commandContext, "displayName"))))))).then(gp_3.id_class("remove").then(gp_3.id_class("team", Yp_1.id_class()).executes(commandContext -> KN.id_break((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team")))))).then(gp_3.id_class("empty").then(gp_3.id_class("team", Yp_1.id_class()).executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team")))))).then(gp_3.id_class("join").then(((RequiredArgumentBuilder)gp_3.id_class("team", Yp_1.id_class()).executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), Collections.singleton(((gy_3)commandContext.getSource()).id_int().i())))).then(gp_3.id_class("members", Yv_1.id_break()).suggests(Yv_1.id_class).executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), Yv_1.id_byte((CommandContext<gy_3>)commandContext, "members"))))))).then(gp_3.id_class("leave").then(gp_3.id_class("members", Yv_1.id_break()).suggests(Yv_1.id_class).executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yv_1.id_byte((CommandContext<gy_3>)commandContext, "members")))))).then(gp_3.id_class("modify").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("team", Yp_1.id_class()).then(gp_3.id_class("displayName").then(gp_3.id_class("displayName", RQ.id_class()).executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), RQ.id_class((CommandContext<gy_3>)commandContext, "displayName")))))).then(gp_3.id_class("color").then(gp_3.id_class("value", RW.id_class()).executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), RW.id_class((CommandContext<gy_3>)commandContext, "value")))))).then(gp_3.id_class("friendlyFire").then(gp_3.id_class("allowed", BoolArgumentType.bool()).executes(commandContext -> KN.id_break((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"allowed")))))).then(gp_3.id_class("seeFriendlyInvisibles").then(gp_3.id_class("allowed", BoolArgumentType.bool()).executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"allowed")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("nametagVisibility").then(gp_3.id_class("never").executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), rnX_2.NEVER)))).then(gp_3.id_class("hideForOtherTeams").executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), rnX_2.HIDE_FOR_OTHER_TEAMS)))).then(gp_3.id_class("hideForOwnTeam").executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), rnX_2.HIDE_FOR_OWN_TEAM)))).then(gp_3.id_class("always").executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), rnX_2.ALWAYS))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("deathMessageVisibility").then(gp_3.id_class("never").executes(commandContext -> KN.id_break((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), rnX_2.NEVER)))).then(gp_3.id_class("hideForOtherTeams").executes(commandContext -> KN.id_break((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), rnX_2.HIDE_FOR_OTHER_TEAMS)))).then(gp_3.id_class("hideForOwnTeam").executes(commandContext -> KN.id_break((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), rnX_2.HIDE_FOR_OWN_TEAM)))).then(gp_3.id_class("always").executes(commandContext -> KN.id_break((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), rnX_2.ALWAYS))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("collisionRule").then(gp_3.id_class("never").executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), rnh_3.NEVER)))).then(gp_3.id_class("pushOwnTeam").executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), rnh_3.PUSH_OWN_TEAM)))).then(gp_3.id_class("pushOtherTeams").executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), rnh_3.PUSH_OTHER_TEAMS)))).then(gp_3.id_class("always").executes(commandContext -> KN.id_class((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), rnh_3.ALWAYS))))).then(gp_3.id_class("prefix").then(gp_3.id_class("prefix", RQ.id_class()).executes(commandContext -> KN.id_break((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), RQ.id_class((CommandContext<gy_3>)commandContext, "prefix")))))).then(gp_3.id_class("suffix").then(gp_3.id_class("suffix", RQ.id_class()).executes(commandContext -> KN.id_byte((gy_3)commandContext.getSource(), Yp_1.id_class((CommandContext<gy_3>)commandContext, "team"), RQ.id_class((CommandContext<gy_3>)commandContext, "suffix"))))))));
    }

    private static int id_class(gy_3 gy_32, Collection<String> collection) {
        rnG_2 rnG_22 = gy_32.id_super().R();
        for (String string : collection) {
            rnG_22.id_catch(string);
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.team.leave.success.single", collection.iterator().next()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.team.leave.success.multiple", collection.size()), true);
        }
        return collection.size();
    }

    private static int id_class(gy_3 gy_32, rnB_2 rnB_22, Collection<String> collection) {
        rnG_2 rnG_22 = gy_32.id_super().R();
        for (String string : collection) {
            ((rns_3)rnG_22).id_class(string, rnB_22);
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.team.join.success.single", collection.iterator().next(), rnB_22.id_byte()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.team.join.success.multiple", collection.size(), rnB_22.id_byte()), true);
        }
        return collection.size();
    }

    private static int id_class(gy_3 gy_32, rnB_2 rnB_22, rgP_2 rgP_22) throws CommandSyntaxException {
        if (rnB_22.id_break().equals(rgP_22)) {
            throw id_protected.create();
        }
        rnB_22.id_class(rgP_22);
        gy_32.id_class(new rgn_3("commands.team.option.name.success", rnB_22.id_byte()), true);
        return 0;
    }

    private static int id_class(gy_3 gy_32, rnB_2 rnB_22, rgF_2 rgF_22) throws CommandSyntaxException {
        if (rnB_22.id_volatile() == rgF_22) {
            throw id_throws.create();
        }
        rnB_22.id_class(rgF_22);
        gy_32.id_class(new rgn_3("commands.team.option.color.success", rnB_22.id_byte(), rgF_22.id_throws()), true);
        return 0;
    }

    private static int id_class(gy_3 gy_32, rnB_2 rnB_22) throws CommandSyntaxException {
        rnG_2 rnG_22 = gy_32.id_super().R();
        ArrayList arrayList = Lists.newArrayList(rnB_22.id_case());
        if (arrayList.isEmpty()) {
            throw id_byte.create();
        }
        for (String string : arrayList) {
            ((rns_3)rnG_22).id_break(string, rnB_22);
        }
        gy_32.id_class(new rgn_3("commands.team.empty.success", arrayList.size(), rnB_22.id_byte()), true);
        return arrayList.size();
    }

    private static int id_class(gy_3 gy_32, rnB_2 rnB_22, rnh_3 rnh_32) throws CommandSyntaxException {
        if (rnB_22.id_extends() == rnh_32) {
            throw id_native.create();
        }
        rnB_22.id_class(rnh_32);
        gy_32.id_class(new rgn_3("commands.team.option.collisionRule.success", rnB_22.id_byte(), rnh_32.id_class()), true);
        return 0;
    }

    private static int id_class(gy_3 gy_32, rnB_2 rnB_22, boolean bl) throws CommandSyntaxException {
        if (rnB_22.id_private() == bl) {
            if (bl) {
                throw id_private.create();
            }
            throw id_implements.create();
        }
        rnB_22.id_break(bl);
        gy_32.id_class(new rgn_3("commands.team.option.seeFriendlyInvisibles." + (bl ? "enabled" : "disabled"), rnB_22.id_byte()), true);
        return 0;
    }

    private static int id_class(gy_3 gy_32, String string) throws CommandSyntaxException {
        return KN.id_class(gy_32, string, (rgP_2)new rgN_2(string));
    }

    private static int id_break(gy_3 gy_32, rnB_2 rnB_22, rnX_2 rnX_22) throws CommandSyntaxException {
        if (rnB_22.id_finally() == rnX_22) {
            throw id_extends.create();
        }
        rnB_22.id_break(rnX_22);
        gy_32.id_class(new rgn_3("commands.team.option.deathMessageVisibility.success", rnB_22.id_byte(), rnX_22.id_class()), true);
        return 0;
    }

    private static int id_break(gy_3 gy_32, rnB_2 rnB_22, boolean bl) throws CommandSyntaxException {
        if (rnB_22.id_catch() == bl) {
            if (bl) {
                throw id_case.create();
            }
            throw id_catch.create();
        }
        rnB_22.id_class(bl);
        gy_32.id_class(new rgn_3("commands.team.option.friendlyfire." + (bl ? "enabled" : "disabled"), rnB_22.id_byte()), true);
        return 0;
    }

    private static int id_break(gy_3 gy_32, rnB_2 rnB_22) {
        rnG_2 rnG_22 = gy_32.id_super().R();
        rnG_22.id_class(rnB_22);
        gy_32.id_class(new rgn_3("commands.team.remove.success", rnB_22.id_byte()), true);
        return rnG_22.id_throws().size();
    }

    private static int id_break(gy_3 gy_32, rnB_2 rnB_22, rgP_2 rgP_22) {
        rnB_22.id_break(rgP_22);
        gy_32.id_class(new rgn_3("commands.team.option.prefix.success", rgP_22), false);
        return 1;
    }
}

