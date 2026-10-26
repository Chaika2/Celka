/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.RZ;
import celestial.Yl_1;
import celestial.Ym_1;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rkw_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class oU_2 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.recipe.give.failed"));
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.recipe.take.failed"));

    private static int id_class(gy_3 gy_32, Collection<rhN_2> collection, Collection<rkw_3<?>> collection2) throws CommandSyntaxException {
        int n = 0;
        for (rhN_2 rhN_22 : collection) {
            n += rhN_22.id_break(collection2);
        }
        if (n == 0) {
            throw id_class.create();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.recipe.give.success.single", collection2.size(), collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.recipe.give.success.multiple", collection2.size(), collection.size()), true);
        }
        return n;
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("recipe").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("give").then(((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected()).then(gp_3.id_class("recipe", Ym_1.id_class()).suggests(Yl_1.id_break).executes(commandContext -> oU_2.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), Collections.singleton(Ym_1.id_break((CommandContext<gy_3>)commandContext, "recipe")))))).then(gp_3.id_class("*").executes(commandContext -> oU_2.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), ((gy_3)commandContext.getSource()).id_super().V().id_break())))))).then(gp_3.id_class("take").then(((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected()).then(gp_3.id_class("recipe", Ym_1.id_class()).suggests(Yl_1.id_break).executes(commandContext -> oU_2.id_break((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), Collections.singleton(Ym_1.id_break((CommandContext<gy_3>)commandContext, "recipe")))))).then(gp_3.id_class("*").executes(commandContext -> oU_2.id_break((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), ((gy_3)commandContext.getSource()).id_super().V().id_break()))))));
    }

    private static int id_break(gy_3 gy_32, Collection<rhN_2> collection, Collection<rkw_3<?>> collection2) throws CommandSyntaxException {
        int n = 0;
        for (rhN_2 rhN_22 : collection) {
            n += rhN_22.id_byte(collection2);
        }
        if (n == 0) {
            throw id_break.create();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.recipe.take.success.single", collection2.size(), collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.recipe.take.success.multiple", collection2.size(), collection.size()), true);
        }
        return n;
    }
}

