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
import celestial.gp_3;
import celestial.gy_3;
import celestial.oM_2;
import celestial.ob_3;
import celestial.rXc_1;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rgn_3;
import celestial.rrEm_1;
import celestial.ryO_2;
import celestial.ryw_3;
import celestial.xc_3;
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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class oG_2 {
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.clone.overlap"));
    private static final Dynamic2CommandExceptionType id_byte = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("commands.clone.toobig", object, object2));
    private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType((Message)new rgn_3("commands.clone.failed"));
    public static final Predicate<ryw_3> id_class = ryw_32 -> !ryw_32.id_class().id_catch();

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("clone").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("begin", RM.id_class()).then(gp_3.id_class("end", RM.id_class()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("destination", RM.id_class()).executes(commandContext -> oG_2.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "begin"), RM.id_class((CommandContext<gy_3>)commandContext, "end"), RM.id_class((CommandContext<gy_3>)commandContext, "destination"), ryw_32 -> true, oM_2.NORMAL))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("replace").executes(commandContext -> oG_2.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "begin"), RM.id_class((CommandContext<gy_3>)commandContext, "end"), RM.id_class((CommandContext<gy_3>)commandContext, "destination"), ryw_32 -> true, oM_2.NORMAL))).then(gp_3.id_class("force").executes(commandContext -> oG_2.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "begin"), RM.id_class((CommandContext<gy_3>)commandContext, "end"), RM.id_class((CommandContext<gy_3>)commandContext, "destination"), ryw_32 -> true, oM_2.FORCE)))).then(gp_3.id_class("move").executes(commandContext -> oG_2.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "begin"), RM.id_class((CommandContext<gy_3>)commandContext, "end"), RM.id_class((CommandContext<gy_3>)commandContext, "destination"), ryw_32 -> true, oM_2.MOVE)))).then(gp_3.id_class("normal").executes(commandContext -> oG_2.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "begin"), RM.id_class((CommandContext<gy_3>)commandContext, "end"), RM.id_class((CommandContext<gy_3>)commandContext, "destination"), ryw_32 -> true, oM_2.NORMAL))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("masked").executes(commandContext -> oG_2.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "begin"), RM.id_class((CommandContext<gy_3>)commandContext, "end"), RM.id_class((CommandContext<gy_3>)commandContext, "destination"), id_class, oM_2.NORMAL))).then(gp_3.id_class("force").executes(commandContext -> oG_2.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "begin"), RM.id_class((CommandContext<gy_3>)commandContext, "end"), RM.id_class((CommandContext<gy_3>)commandContext, "destination"), id_class, oM_2.FORCE)))).then(gp_3.id_class("move").executes(commandContext -> oG_2.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "begin"), RM.id_class((CommandContext<gy_3>)commandContext, "end"), RM.id_class((CommandContext<gy_3>)commandContext, "destination"), id_class, oM_2.MOVE)))).then(gp_3.id_class("normal").executes(commandContext -> oG_2.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "begin"), RM.id_class((CommandContext<gy_3>)commandContext, "end"), RM.id_class((CommandContext<gy_3>)commandContext, "destination"), id_class, oM_2.NORMAL))))).then(gp_3.id_class("filtered").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("filter", RO.id_class()).executes(commandContext -> oG_2.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "begin"), RM.id_class((CommandContext<gy_3>)commandContext, "end"), RM.id_class((CommandContext<gy_3>)commandContext, "destination"), RO.id_class((CommandContext<gy_3>)commandContext, "filter"), oM_2.NORMAL))).then(gp_3.id_class("force").executes(commandContext -> oG_2.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "begin"), RM.id_class((CommandContext<gy_3>)commandContext, "end"), RM.id_class((CommandContext<gy_3>)commandContext, "destination"), RO.id_class((CommandContext<gy_3>)commandContext, "filter"), oM_2.FORCE)))).then(gp_3.id_class("move").executes(commandContext -> oG_2.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "begin"), RM.id_class((CommandContext<gy_3>)commandContext, "end"), RM.id_class((CommandContext<gy_3>)commandContext, "destination"), RO.id_class((CommandContext<gy_3>)commandContext, "filter"), oM_2.MOVE)))).then(gp_3.id_class("normal").executes(commandContext -> oG_2.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "begin"), RM.id_class((CommandContext<gy_3>)commandContext, "end"), RM.id_class((CommandContext<gy_3>)commandContext, "destination"), RO.id_class((CommandContext<gy_3>)commandContext, "filter"), oM_2.NORMAL)))))))));
    }

    private static int id_class(gy_3 gy_32, rfH_2 rfH_22, rfH_2 rfH_23, rfH_2 rfH_24, Predicate<ryw_3> predicate, oM_2 oM_22) throws CommandSyntaxException {
        rfi_3 rfi_32 = new rfi_3(rfH_22, rfH_23);
        rfH_2 rfH_25 = rfH_24.id_break(rfi_32.id_byte());
        rfi_3 rfi_33 = new rfi_3(rfH_24, rfH_25);
        if (!oM_22.id_class() && rfi_33.id_class(rfi_32)) {
            throw id_break.create();
        }
        int n = rfi_32.id_protected() * rfi_32.id_throws() * rfi_32.id_case();
        if (n > 32768) {
            throw id_byte.create((Object)32768, (Object)n);
        }
        rrEm_1 rrEm_12 = gy_32.id_final();
        if (rrEm_12.id_class(rfH_22, rfH_23) && rrEm_12.id_class(rfH_24, rfH_25)) {
            Object object;
            Object object22;
            ArrayList arrayList = Lists.newArrayList();
            ArrayList arrayList2 = Lists.newArrayList();
            ArrayList arrayList3 = Lists.newArrayList();
            LinkedList linkedList = Lists.newLinkedList();
            rfH_2 rfH_26 = new rfH_2(rfi_33.id_class - rfi_32.id_class, rfi_33.id_break - rfi_32.id_break, rfi_33.id_byte - rfi_32.id_byte);
            for (int i = rfi_32.id_byte; i <= rfi_32.id_case; ++i) {
                for (int j = rfi_32.id_break; j <= rfi_32.id_throws; ++j) {
                    for (int k = rfi_32.id_class; k <= rfi_32.id_protected; ++k) {
                        Iterator iterator = new rfH_2(k, j, i);
                        object22 = ((rfH_2)((Object)iterator)).id_break(rfH_26);
                        object = new ryw_3(rrEm_12, (rfH_2)((Object)iterator), false);
                        xc_3 xc_32 = ((ryw_3)object).id_class();
                        if (!predicate.test((ryw_3)object)) continue;
                        ryO_2 ryO_22 = rrEm_12.id_class((rfH_2)((Object)iterator));
                        if (ryO_22 != null) {
                            rcd_3 rcd_32 = ryO_22.id_class(new rcd_3());
                            arrayList2.add(new ob_3((rfH_2)object22, xc_32, rcd_32));
                            linkedList.addLast(iterator);
                            continue;
                        }
                        if (!xc_32.id_implements(rrEm_12, (rfH_2)((Object)iterator)) && !xc_32.id_new(rrEm_12, (rfH_2)((Object)iterator))) {
                            arrayList3.add(new ob_3((rfH_2)object22, xc_32, null));
                            linkedList.addFirst(iterator);
                            continue;
                        }
                        arrayList.add(new ob_3((rfH_2)object22, xc_32, null));
                        linkedList.addLast(iterator);
                    }
                }
            }
            if (oM_22 == oM_2.MOVE) {
                for (rfH_2 rfH_27 : linkedList) {
                    ryO_2 ryO_23 = rrEm_12.id_class(rfH_27);
                    rXc_1.id_class(ryO_23);
                    rrEm_12.id_class(rfH_27, xu_3.Ec.id_continue(), 2);
                }
                for (rfH_2 rfH_28 : linkedList) {
                    rrEm_12.id_class(rfH_28, xu_3.id_class.id_continue(), 3);
                }
            }
            ArrayList arrayList4 = Lists.newArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            arrayList4.addAll(arrayList3);
            List list = Lists.reverse((List)arrayList4);
            for (Iterator iterator : list) {
                object22 = rrEm_12.id_class(((ob_3)((Object)iterator)).id_class);
                rXc_1.id_class(object22);
                rrEm_12.id_class(((ob_3)((Object)iterator)).id_class, xu_3.Ec.id_continue(), 2);
            }
            int n2 = 0;
            for (Object object22 : arrayList4) {
                if (!rrEm_12.id_class(((ob_3)object22).id_class, ((ob_3)object22).id_break, 2)) continue;
                ++n2;
            }
            for (Object object22 : arrayList2) {
                object = rrEm_12.id_class(((ob_3)object22).id_class);
                if (((ob_3)object22).id_byte != null && object != null) {
                    ((ob_3)object22).id_byte.id_break("x", ((ob_3)object22).id_class.b_());
                    ((ob_3)object22).id_byte.id_break("y", ((ob_3)object22).id_class.c_());
                    ((ob_3)object22).id_byte.id_break("z", ((ob_3)object22).id_class.d_());
                    ((ryO_2)object).id_class(((ob_3)object22).id_break, ((ob_3)object22).id_byte);
                    ((ryO_2)object).id_break();
                }
                rrEm_12.id_class(((ob_3)object22).id_class, ((ob_3)object22).id_break, 2);
            }
            for (Object object22 : list) {
                rrEm_12.id_class(((ob_3)object22).id_class, ((ob_3)object22).id_break.id_break());
            }
            rrEm_12.id_synchronized().id_class(rfi_32, rfH_26);
            if (n2 == 0) {
                throw id_protected.create();
            }
            gy_32.id_class(new rgn_3("commands.clone.success", n2), true);
            return n2;
        }
        throw RM.id_class.create();
    }
}

