/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
package celestial;

import celestial.RK;
import celestial.RZ;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rJT;
import celestial.rJr_1;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rhz_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class oE_2 {
    private static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("clear.failed.single", object));
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("clear.failed.multiple", object));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("clear").requires(gy_32 -> gy_32.id_class(2))).executes(commandContext -> oE_2.id_class((gy_3)commandContext.getSource(), Collections.singleton(((gy_3)commandContext.getSource()).id_new()), rdn_32 -> true, -1))).then(((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected()).executes(commandContext -> oE_2.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), rdn_32 -> true, -1))).then(((RequiredArgumentBuilder)gp_3.id_class("item", RK.id_class()).executes(commandContext -> oE_2.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), RK.id_class((CommandContext<gy_3>)commandContext, "item"), -1))).then(gp_3.id_class("maxCount", IntegerArgumentType.integer((int)0)).executes(commandContext -> oE_2.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), RK.id_class((CommandContext<gy_3>)commandContext, "item"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"maxCount")))))));
    }

    private static int id_class(gy_3 gy_32, Collection<rhN_2> collection, Predicate<rdn_3> predicate, int n) throws CommandSyntaxException {
        int n2 = 0;
        for (rhN_2 rhN_22 : collection) {
            n2 += ((rhz_3)rhN_22.id_implements[1]).id_class(predicate, n, ((rJT)rhN_22.id_implements[3]).id_case());
            ((rJr_1)rhN_22.id_implements[4]).id_native();
            ((rJT)rhN_22.id_implements[3]).id_class((rXu_1)((rhz_3)rhN_22.id_implements[1]));
            rhN_22.id_private();
        }
        if (n2 == 0) {
            if (collection.size() == 1) {
                throw id_class.create((Object)collection.iterator().next().g());
            }
            throw id_break.create((Object)collection.size());
        }
        if (n == 0) {
            if (collection.size() == 1) {
                gy_32.id_class(new rgn_3("commands.clear.test.single", n2, collection.iterator().next().L_()), true);
            } else {
                gy_32.id_class(new rgn_3("commands.clear.test.multiple", n2, collection.size()), true);
            }
        } else if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.clear.success.single", n2, collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.clear.success.multiple", n2, collection.size()), true);
        }
        return n2;
    }
}

