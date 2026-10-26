/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
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

import celestial.RM;
import celestial.RR;
import celestial.RZ;
import celestial.YC;
import celestial.an_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rJT;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.ryO_2;
import com.google.common.collect.Lists;
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
import java.util.ArrayList;
import java.util.Collection;

public class oa_3 {
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.replaceitem.block.failed"));
    public static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("commands.replaceitem.slot.inapplicable", object));
    public static final Dynamic2CommandExceptionType id_byte = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("commands.replaceitem.entity.failed", object, object2));

    private static int id_class(gy_3 gy_32, rfH_2 rfH_22, int n, rdn_3 rdn_32) throws CommandSyntaxException {
        ryO_2 ryO_22 = gy_32.id_final().id_class(rfH_22);
        if (!(ryO_22 instanceof rXu_1)) {
            throw id_class.create();
        }
        rXu_1 rXu_12 = (rXu_1)((Object)ryO_22);
        if (n >= 0 && n < rXu_12.id_else()) {
            rXu_12.id_break(n, rdn_32);
            gy_32.id_class(new rgn_3("commands.replaceitem.block.success", rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), rdn_32.id_throw()), true);
            return 1;
        }
        throw id_break.create((Object)n);
    }

    private static int id_class(gy_3 gy_32, Collection<? extends an_3> collection, int n, rdn_3 rdn_32) throws CommandSyntaxException {
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)collection.size());
        for (an_3 an_32 : collection) {
            if (an_32 instanceof rhN_2) {
                ((rJT)((rhN_2)an_32).id_implements[3]).id_native();
            }
            if (!an_32.id_class(n, rdn_32.id_implements())) continue;
            arrayList.add(an_32);
            if (!(an_32 instanceof rhN_2)) continue;
            ((rJT)((rhN_2)an_32).id_implements[3]).id_native();
        }
        if (arrayList.isEmpty()) {
            throw id_byte.create((Object)rdn_32.id_throw(), (Object)n);
        }
        if (arrayList.size() == 1) {
            gy_32.id_class(new rgn_3("commands.replaceitem.entity.success.single", ((an_3)arrayList.iterator().next()).L_(), rdn_32.id_throw()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.replaceitem.entity.success.multiple", arrayList.size(), rdn_32.id_throw()), true);
        }
        return arrayList.size();
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("replaceitem").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("block").then(gp_3.id_class("pos", RM.id_class()).then(gp_3.id_class("slot", YC.id_class()).then(((RequiredArgumentBuilder)gp_3.id_class("item", RR.id_class()).executes(commandContext -> oa_3.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "pos"), YC.id_class((CommandContext<gy_3>)commandContext, "slot"), RR.id_class(commandContext, "item").id_class(1, false)))).then(gp_3.id_class("count", IntegerArgumentType.integer((int)1, (int)64)).executes(commandContext -> oa_3.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "pos"), YC.id_class((CommandContext<gy_3>)commandContext, "slot"), RR.id_class(commandContext, "item").id_class(IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), true))))))))).then(gp_3.id_class("entity").then(gp_3.id_class("targets", RZ.id_break()).then(gp_3.id_class("slot", YC.id_class()).then(((RequiredArgumentBuilder)gp_3.id_class("item", RR.id_class()).executes(commandContext -> oa_3.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), YC.id_class((CommandContext<gy_3>)commandContext, "slot"), RR.id_class(commandContext, "item").id_class(1, false)))).then(gp_3.id_class("count", IntegerArgumentType.integer((int)1, (int)64)).executes(commandContext -> oa_3.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), YC.id_class((CommandContext<gy_3>)commandContext, "slot"), RR.id_class(commandContext, "item").id_class(IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), true)))))))));
    }
}

