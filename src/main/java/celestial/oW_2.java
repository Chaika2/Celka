/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.RZ;
import celestial.Rc_1;
import celestial.an_3;
import celestial.eA_2;
import celestial.ev_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.iB_2;
import celestial.rdn_3;
import celestial.rgn_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class oW_2 {
    private static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("commands.enchant.failed.entity", object));
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("commands.enchant.failed.itemless", object));
    private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(object -> new rgn_3("commands.enchant.failed.incompatible", object));
    private static final Dynamic2CommandExceptionType id_protected = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("commands.enchant.failed.level", object, object2));
    private static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType((Message)new rgn_3("commands.enchant.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("enchant").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("targets", RZ.id_break()).then(((RequiredArgumentBuilder)gp_3.id_class("enchantment", Rc_1.id_class()).executes(commandContext -> oW_2.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), Rc_1.id_class((CommandContext<gy_3>)commandContext, "enchantment"), 1))).then(gp_3.id_class("level", IntegerArgumentType.integer((int)0)).executes(commandContext -> oW_2.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), Rc_1.id_class((CommandContext<gy_3>)commandContext, "enchantment"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"level")))))));
    }

    private static int id_class(gy_3 gy_32, Collection<? extends an_3> collection, ev_3 ev_32, int n) throws CommandSyntaxException {
        if (n > ev_32.id_class()) {
            throw id_protected.create((Object)n, (Object)ev_32.id_class());
        }
        int n2 = 0;
        for (an_3 an_32 : collection) {
            if (an_32 instanceof iB_2) {
                iB_2 iB_22 = (iB_2)an_32;
                rdn_3 rdn_32 = iB_22.ss();
                if (!rdn_32.id_class()) {
                    if (ev_32.id_class(rdn_32) && eA_2.id_class(eA_2.id_class(rdn_32).keySet(), ev_32)) {
                        rdn_32.id_class(ev_32, n);
                        ++n2;
                        continue;
                    }
                    if (collection.size() != 1) continue;
                    throw id_byte.create((Object)rdn_32.id_break().id_implements(rdn_32).getString());
                }
                if (collection.size() != 1) continue;
                throw id_break.create((Object)iB_22.g().getString());
            }
            if (collection.size() != 1) continue;
            throw id_class.create((Object)an_32.g().getString());
        }
        if (n2 == 0) {
            throw id_throws.create();
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.enchant.success.single", ev_32.id_protected(n), collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.enchant.success.multiple", ev_32.id_protected(n), collection.size()), true);
        }
        return n2;
    }
}

