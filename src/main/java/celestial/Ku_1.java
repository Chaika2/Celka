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
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 */
package celestial;

import celestial.Km_1;
import celestial.RZ;
import celestial.Rf_1;
import celestial.Ri_1;
import celestial.Rm_1;
import celestial.Ru_1;
import celestial.YZ;
import celestial.Yw_1;
import celestial.aA_2;
import celestial.an_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.iB_2;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rjK_2;
import celestial.rjU_2;
import celestial.rrEl_1;
import celestial.rrEm_1;
import celestial.rvU_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public class Ku_1 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.teleport.invalidPosition"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("teleport").requires(gy_32 -> gy_32.id_class(2))).then(((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_break()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("location", Yw_1.id_class()).executes(commandContext -> Ku_1.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), ((gy_3)commandContext.getSource()).id_final(), Yw_1.id_break((CommandContext<gy_3>)commandContext, "location"), null, null))).then(gp_3.id_class("rotation", YZ.id_class()).executes(commandContext -> Ku_1.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), ((gy_3)commandContext.getSource()).id_final(), Yw_1.id_break((CommandContext<gy_3>)commandContext, "location"), YZ.id_class((CommandContext<gy_3>)commandContext, "rotation"), null)))).then(((LiteralArgumentBuilder)gp_3.id_class("facing").then(gp_3.id_class("entity").then(((RequiredArgumentBuilder)gp_3.id_class("facingEntity", RZ.id_class()).executes(commandContext -> Ku_1.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), ((gy_3)commandContext.getSource()).id_final(), Yw_1.id_break((CommandContext<gy_3>)commandContext, "location"), null, new Km_1(RZ.id_class((CommandContext<gy_3>)commandContext, "facingEntity"), Rm_1.FEET)))).then(gp_3.id_class("facingAnchor", Ru_1.id_class()).executes(commandContext -> Ku_1.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), ((gy_3)commandContext.getSource()).id_final(), Yw_1.id_break((CommandContext<gy_3>)commandContext, "location"), null, new Km_1(RZ.id_class((CommandContext<gy_3>)commandContext, "facingEntity"), Ru_1.id_class((CommandContext<gy_3>)commandContext, "facingAnchor")))))))).then(gp_3.id_class("facingLocation", Yw_1.id_class()).executes(commandContext -> Ku_1.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), ((gy_3)commandContext.getSource()).id_final(), Yw_1.id_break((CommandContext<gy_3>)commandContext, "location"), null, new Km_1(Yw_1.id_class((CommandContext<gy_3>)commandContext, "facingLocation")))))))).then(gp_3.id_class("destination", RZ.id_class()).executes(commandContext -> Ku_1.id_class((gy_3)commandContext.getSource(), RZ.id_break((CommandContext<gy_3>)commandContext, "targets"), RZ.id_class((CommandContext<gy_3>)commandContext, "destination")))))).then(gp_3.id_class("location", Yw_1.id_class()).executes(commandContext -> Ku_1.id_class((gy_3)commandContext.getSource(), Collections.singleton(((gy_3)commandContext.getSource()).id_int()), ((gy_3)commandContext.getSource()).id_final(), Yw_1.id_break((CommandContext<gy_3>)commandContext, "location"), Ri_1.id_protected(), null)))).then(gp_3.id_class("destination", RZ.id_class()).executes(commandContext -> Ku_1.id_class((gy_3)commandContext.getSource(), Collections.singleton(((gy_3)commandContext.getSource()).id_int()), RZ.id_class((CommandContext<gy_3>)commandContext, "destination")))));
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("tp").requires(gy_32 -> gy_32.id_class(2))).redirect((CommandNode)literalCommandNode));
    }

    private static int id_class(gy_3 gy_32, Collection<? extends an_3> collection, an_3 an_32) throws CommandSyntaxException {
        for (an_3 an_33 : collection) {
            Ku_1.id_class(gy_32, an_33, (rrEm_1)((rYB)an_32.id_throws[7]), an_32.rx(), an_32.re(), an_32.BO(), EnumSet.noneOf(rvU_2.class), ((Float)an_32.id_throws[15]).floatValue(), ((Float)an_32.id_throws[16]).floatValue(), null);
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.teleport.success.entity.single", collection.iterator().next().L_(), an_32.L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.teleport.success.entity.multiple", collection.size(), an_32.L_()), true);
        }
        return collection.size();
    }

    private static int id_class(gy_3 gy_32, Collection<? extends an_3> collection, rrEm_1 rrEm_12, Rf_1 rf_1, Rf_1 rf_12, Km_1 km_1) throws CommandSyntaxException {
        rjU_2 rjU_22 = rf_1.id_class(gy_32);
        rjK_2 rjK_22 = rf_12 == null ? null : rf_12.id_break(gy_32);
        EnumSet<rvU_2> enumSet = EnumSet.noneOf(rvU_2.class);
        if (rf_1.id_class()) {
            enumSet.add(rvU_2.X);
        }
        if (rf_1.id_break()) {
            enumSet.add(rvU_2.Y);
        }
        if (rf_1.id_byte()) {
            enumSet.add(rvU_2.Z);
        }
        if (rf_12 == null) {
            enumSet.add(rvU_2.X_ROT);
            enumSet.add(rvU_2.Y_ROT);
        } else {
            if (rf_12.id_class()) {
                enumSet.add(rvU_2.X_ROT);
            }
            if (rf_12.id_break()) {
                enumSet.add(rvU_2.Y_ROT);
            }
        }
        for (an_3 an_32 : collection) {
            if (rf_12 == null) {
                Ku_1.id_class(gy_32, an_32, rrEm_12, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, enumSet, ((Float)an_32.id_throws[15]).floatValue(), ((Float)an_32.id_throws[16]).floatValue(), km_1);
                continue;
            }
            Ku_1.id_class(gy_32, an_32, rrEm_12, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, enumSet, rjK_22.id_protected, rjK_22.id_byte, km_1);
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.teleport.success.location.single", collection.iterator().next().L_(), rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected), true);
        } else {
            gy_32.id_class(new rgn_3("commands.teleport.success.location.multiple", collection.size(), rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected), true);
        }
        return collection.size();
    }

    private static void id_class(gy_3 gy_32, an_3 an_32, rrEm_1 rrEm_12, double d, double d2, double d3, Set<rvU_2> set, float f, float f2, Km_1 km_1) throws CommandSyntaxException {
        rfH_2 rfH_22 = new rfH_2(d, d2, d3);
        if (!rYB.id_continue(rfH_22)) {
            throw id_class.create();
        }
        if (an_32 instanceof rhN_2) {
            rfj_3 rfj_32 = new rfj_3(new rfH_2(d, d2, d3));
            rrEm_12.id_else().id_class(rrEl_1.id_catch, rfj_32, 1, an_32.V());
            an_32.BH();
            if (((rhN_2)an_32).Sc()) {
                ((rhN_2)an_32).id_class(true, true);
            }
            if (rrEm_12 == (rYB)an_32.id_throws[7]) {
                ((rhN_2)an_32).id_class.id_class(d, d2, d3, f, f2, set);
            } else {
                ((rhN_2)an_32).id_class(rrEm_12, d, d2, d3, f, f2);
            }
            an_32.id_implements(f);
        } else {
            float f3 = rfU_2.id_catch(f);
            float f4 = rfU_2.id_catch(f2);
            f4 = rfU_2.id_class(f4, -90.0f, 90.0f);
            if (rrEm_12 == (rYB)an_32.id_throws[7]) {
                an_32.id_class(d, d2, d3, f3, f4);
                an_32.id_implements(f3);
            } else {
                an_32.K();
                an_3 an_33 = an_32;
                an_32 = an_32.BC().id_class(rrEm_12);
                if (an_32 == null) {
                    return;
                }
                an_32.id_throws(an_33);
                an_32.id_class(d, d2, d3, f3, f4);
                an_32.id_implements(f3);
                rrEm_12.id_catch(an_32);
                Boolean bl = true;
                an_33.id_throws[27] = bl;
            }
        }
        if (km_1 != null) {
            km_1.id_class(gy_32, an_32);
        }
        if (!(an_32 instanceof iB_2) || !((iB_2)an_32).Sy()) {
            an_32.id_byte(an_32.rv().id_throws(1.0, 0.0, 1.0));
            an_32.id_int(true);
        }
        if (an_32 instanceof aA_2) {
            ((aA_2)an_32).id_public().id_final();
        }
    }
}

