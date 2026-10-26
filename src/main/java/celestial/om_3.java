/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.RM;
import celestial.RO;
import celestial.Rd_1;
import celestial.Rx_1;
import celestial.gp_3;
import celestial.gy_3;
import celestial.oZ_2;
import celestial.rXc_1;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rgn_3;
import celestial.rrEm_1;
import celestial.ryO_2;
import celestial.ryw_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class om_3 {
    private static final Dynamic2CommandExceptionType id_class = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("commands.fill.toobig", object, object2));
    public static final Rd_1 id_break = new Rd_1(xu_3.id_class.id_continue(), Collections.emptySet(), null);
    private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("commands.fill.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("fill").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("from", RM.id_class()).then(gp_3.id_class("to", RM.id_class()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("block", Rx_1.id_class()).executes(commandContext -> om_3.id_class((gy_3)commandContext.getSource(), new rfi_3(RM.id_class((CommandContext<gy_3>)commandContext, "from"), RM.id_class((CommandContext<gy_3>)commandContext, "to")), Rx_1.id_class((CommandContext<gy_3>)commandContext, "block"), oZ_2.REPLACE, null))).then(((LiteralArgumentBuilder)gp_3.id_class("replace").executes(commandContext -> om_3.id_class((gy_3)commandContext.getSource(), new rfi_3(RM.id_class((CommandContext<gy_3>)commandContext, "from"), RM.id_class((CommandContext<gy_3>)commandContext, "to")), Rx_1.id_class((CommandContext<gy_3>)commandContext, "block"), oZ_2.REPLACE, null))).then(gp_3.id_class("filter", RO.id_class()).executes(commandContext -> om_3.id_class((gy_3)commandContext.getSource(), new rfi_3(RM.id_class((CommandContext<gy_3>)commandContext, "from"), RM.id_class((CommandContext<gy_3>)commandContext, "to")), Rx_1.id_class((CommandContext<gy_3>)commandContext, "block"), oZ_2.REPLACE, RO.id_class((CommandContext<gy_3>)commandContext, "filter")))))).then(gp_3.id_class("keep").executes(commandContext -> om_3.id_class((gy_3)commandContext.getSource(), new rfi_3(RM.id_class((CommandContext<gy_3>)commandContext, "from"), RM.id_class((CommandContext<gy_3>)commandContext, "to")), Rx_1.id_class((CommandContext<gy_3>)commandContext, "block"), oZ_2.REPLACE, ryw_32 -> ryw_32.id_byte().id_finally(ryw_32.id_protected()))))).then(gp_3.id_class("outline").executes(commandContext -> om_3.id_class((gy_3)commandContext.getSource(), new rfi_3(RM.id_class((CommandContext<gy_3>)commandContext, "from"), RM.id_class((CommandContext<gy_3>)commandContext, "to")), Rx_1.id_class((CommandContext<gy_3>)commandContext, "block"), oZ_2.OUTLINE, null)))).then(gp_3.id_class("hollow").executes(commandContext -> om_3.id_class((gy_3)commandContext.getSource(), new rfi_3(RM.id_class((CommandContext<gy_3>)commandContext, "from"), RM.id_class((CommandContext<gy_3>)commandContext, "to")), Rx_1.id_class((CommandContext<gy_3>)commandContext, "block"), oZ_2.HOLLOW, null)))).then(gp_3.id_class("destroy").executes(commandContext -> om_3.id_class((gy_3)commandContext.getSource(), new rfi_3(RM.id_class((CommandContext<gy_3>)commandContext, "from"), RM.id_class((CommandContext<gy_3>)commandContext, "to")), Rx_1.id_class((CommandContext<gy_3>)commandContext, "block"), oZ_2.DESTROY, null)))))));
    }

    private static int id_class(gy_3 gy_32, rfi_3 rfi_32, Rd_1 rd_1, oZ_2 oZ_22, Predicate<ryw_3> predicate) throws CommandSyntaxException {
        Object object;
        int n = rfi_32.id_protected() * rfi_32.id_throws() * rfi_32.id_case();
        if (n > 32768) {
            throw id_class.create((Object)32768, (Object)n);
        }
        ArrayList arrayList = Lists.newArrayList();
        rrEm_1 rrEm_12 = gy_32.id_final();
        int n2 = 0;
        for (rfH_2 rfH_22 : rfH_2.id_break(rfi_32.id_class, rfi_32.id_break, rfi_32.id_byte, rfi_32.id_protected, rfi_32.id_throws, rfi_32.id_case)) {
            if (predicate != null && !predicate.test(new ryw_3(rrEm_12, rfH_22, true)) || (object = oZ_22.filter.filter(rfi_32, rfH_22, rd_1, rrEm_12)) == null) continue;
            ryO_2 ryO_22 = rrEm_12.id_class(rfH_22);
            rXc_1.id_class(ryO_22);
            if (!((Rd_1)object).id_class(rrEm_12, rfH_22, 2)) continue;
            arrayList.add(rfH_22.id_int());
            ++n2;
        }
        for (rfH_2 rfH_22 : arrayList) {
            object = rrEm_12.id_byte(rfH_22).id_break();
            rrEm_12.id_class(rfH_22, (xd_3)object);
        }
        if (n2 == 0) {
            throw id_byte.create();
        }
        gy_32.id_class(new rgn_3("commands.fill.success", n2), true);
        return n2;
    }
}

