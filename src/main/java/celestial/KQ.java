/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.RZ;
import celestial.an_3;
import celestial.gR_2;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rgn_3;
import celestial.rgv_3;
import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.HashSet;

public class KQ {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.tag.add.failed"));
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.tag.remove.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("tag").requires(gy_32 -> gy_32.id_class(2))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_break()).then(gp_3.id_class("add").then(gp_3.id_class("name", StringArgumentType.word()).executes(commandContext -> KQ.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), StringArgumentType.getString((CommandContext)commandContext, (String)"name")))))).then(gp_3.id_class("remove").then(gp_3.id_class("name", StringArgumentType.word()).suggests((commandContext, suggestionsBuilder) -> gR_2.id_break(KQ.id_class(RZ.id_break((CommandContext<gy_3>)commandContext, "targets")), suggestionsBuilder)).executes(commandContext -> KQ.id_break((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), StringArgumentType.getString((CommandContext)commandContext, (String)"name")))))).then(gp_3.id_class("list").executes(commandContext -> KQ.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"))))));
    }

    private static int id_class(gy_3 gy_32, Collection<? extends an_3> collection, String string) throws CommandSyntaxException {
        int n = 0;
        for (an_3 an_32 : collection) {
            if (!an_32.id_implements(string)) continue;
            ++n;
        }
        if (n == 0) {
            throw id_class.create();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.tag.add.success.single", string, collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.tag.add.success.multiple", string, collection.size()), true);
        }
        return n;
    }

    private static int id_class(gy_3 gy_32, Collection<? extends an_3> collection) {
        HashSet hashSet = Sets.newHashSet();
        for (an_3 an_32 : collection) {
            hashSet.addAll(an_32.y());
        }
        if (collection.size() == 1) {
            an_3 an_33 = collection.iterator().next();
            if (hashSet.isEmpty()) {
                gy_32.id_class(new rgn_3("commands.tag.list.single.empty", an_33.L_()), false);
            } else {
                gy_32.id_class(new rgn_3("commands.tag.list.single.success", an_33.L_(), hashSet.size(), rgv_3.id_class(hashSet)), false);
            }
        } else if (hashSet.isEmpty()) {
            gy_32.id_class(new rgn_3("commands.tag.list.multiple.empty", collection.size()), false);
        } else {
            gy_32.id_class(new rgn_3("commands.tag.list.multiple.success", collection.size(), hashSet.size(), rgv_3.id_class(hashSet)), false);
        }
        return hashSet.size();
    }

    private static Collection<String> id_class(Collection<? extends an_3> collection) {
        HashSet hashSet = Sets.newHashSet();
        for (an_3 an_32 : collection) {
            hashSet.addAll(an_32.y());
        }
        return hashSet;
    }

    private static int id_break(gy_3 gy_32, Collection<? extends an_3> collection, String string) throws CommandSyntaxException {
        int n = 0;
        for (an_3 an_32 : collection) {
            if (!an_32.id_private(string)) continue;
            ++n;
        }
        if (n == 0) {
            throw id_break.create();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.tag.remove.success.single", string, collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.tag.remove.success.multiple", string, collection.size()), true);
        }
        return n;
    }
}

