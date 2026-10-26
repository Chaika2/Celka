/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
package celestial;

import celestial.RM;
import celestial.RR;
import celestial.RZ;
import celestial.YC;
import celestial.Ym_1;
import celestial.Yw_1;
import celestial.an_3;
import celestial.gR_2;
import celestial.gp_3;
import celestial.gy_3;
import celestial.iB_2;
import celestial.oI_2;
import celestial.oa_3;
import celestial.of_3;
import celestial.ow_3;
import celestial.rJT;
import celestial.rXQ;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rjU_2;
import celestial.rqO_2;
import celestial.rrEm_1;
import celestial.rsE_2;
import celestial.ryO_2;
import celestial.rye_3;
import celestial.rzC_2;
import celestial.rzL_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzr_3;
import celestial.rzz_3;
import celestial.xc_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ot_3 {
    public static final SuggestionProvider<gy_3> id_class = (commandContext, suggestionsBuilder) -> {
        rzC_2 rzC_22 = ((gy_3)commandContext.getSource()).id_super().o();
        return gR_2.id_class(rzC_22.id_break(), suggestionsBuilder);
    };
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("commands.drop.no_held_items", object));
    private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(object -> new rgn_3("commands.drop.no_loot_table", object));

    private static rXu_1 id_class(gy_3 gy_32, rfH_2 rfH_22) throws CommandSyntaxException {
        ryO_2 ryO_22 = gy_32.id_final().id_class(rfH_22);
        if (!(ryO_22 instanceof rXu_1)) {
            throw oa_3.id_class.create();
        }
        return (rXu_1)((Object)ryO_22);
    }

    private static int id_class(CommandContext<gy_3> commandContext, rqO_2 rqO_22, rzr_3 rzr_32, of_3 of_32) throws CommandSyntaxException {
        gy_3 gy_32 = (gy_3)commandContext.getSource();
        rzL_2 rzL_22 = gy_32.id_super().o().id_class(rqO_22);
        List<rdn_3> list2 = rzL_22.id_class(rzr_32);
        return of_32.accept(commandContext, list2, list -> ot_3.id_class(gy_32, list));
    }

    private static int id_class(CommandContext<gy_3> commandContext, rqO_2 rqO_22, rfH_2 rfH_22, rdn_3 rdn_32, of_3 of_32) throws CommandSyntaxException {
        gy_3 gy_32 = (gy_3)commandContext.getSource();
        rzr_3 rzr_32 = new rzP_2(gy_32.id_final()).id_class(rzQ_2.id_case, rjU_2.id_class(rfH_22)).id_class(rzQ_2.id_implements, rdn_32).id_break(rzQ_2.id_class, gy_32.id_package()).id_class(rzz_3.id_throws);
        return ot_3.id_class(commandContext, rqO_22, rzr_32, of_32);
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register(ot_3.id_class((LiteralArgumentBuilder)gp_3.id_class("loot").requires(gy_32 -> gy_32.id_class(2)), (ArgumentBuilder<gy_3, ?> argumentBuilder, of_3 of_32) -> argumentBuilder.then(gp_3.id_class("fish").then(gp_3.id_class("loot_table", Ym_1.id_class()).suggests(id_class).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("pos", RM.id_class()).executes(commandContext -> ot_3.id_class((CommandContext<gy_3>)commandContext, Ym_1.id_throws((CommandContext<gy_3>)commandContext, "loot_table"), RM.id_class((CommandContext<gy_3>)commandContext, "pos"), rdn_3.id_break, of_32))).then(gp_3.id_class("tool", RR.id_class()).executes(commandContext -> ot_3.id_class((CommandContext<gy_3>)commandContext, Ym_1.id_throws((CommandContext<gy_3>)commandContext, "loot_table"), RM.id_class((CommandContext<gy_3>)commandContext, "pos"), RR.id_class(commandContext, "tool").id_class(1, false), of_32)))).then(gp_3.id_class("mainhand").executes(commandContext -> ot_3.id_class((CommandContext<gy_3>)commandContext, Ym_1.id_throws((CommandContext<gy_3>)commandContext, "loot_table"), RM.id_class((CommandContext<gy_3>)commandContext, "pos"), ot_3.id_class((gy_3)commandContext.getSource(), rXQ.MAINHAND), of_32)))).then(gp_3.id_class("offhand").executes(commandContext -> ot_3.id_class((CommandContext<gy_3>)commandContext, Ym_1.id_throws((CommandContext<gy_3>)commandContext, "loot_table"), RM.id_class((CommandContext<gy_3>)commandContext, "pos"), ot_3.id_class((gy_3)commandContext.getSource(), rXQ.OFFHAND), of_32)))))).then(gp_3.id_class("loot").then(gp_3.id_class("loot_table", Ym_1.id_class()).suggests(id_class).executes(commandContext -> ot_3.id_class((CommandContext<gy_3>)commandContext, Ym_1.id_throws((CommandContext<gy_3>)commandContext, "loot_table"), of_32)))).then(gp_3.id_class("kill").then(gp_3.id_class("target", RZ.id_class()).executes(commandContext -> ot_3.id_class((CommandContext<gy_3>)commandContext, RZ.id_class((CommandContext<gy_3>)commandContext, "target"), of_32)))).then(gp_3.id_class("mine").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("pos", RM.id_class()).executes(commandContext -> ot_3.id_class((CommandContext<gy_3>)commandContext, RM.id_class((CommandContext<gy_3>)commandContext, "pos"), rdn_3.id_break, of_32))).then(gp_3.id_class("tool", RR.id_class()).executes(commandContext -> ot_3.id_class((CommandContext<gy_3>)commandContext, RM.id_class((CommandContext<gy_3>)commandContext, "pos"), RR.id_class(commandContext, "tool").id_class(1, false), of_32)))).then(gp_3.id_class("mainhand").executes(commandContext -> ot_3.id_class((CommandContext<gy_3>)commandContext, RM.id_class((CommandContext<gy_3>)commandContext, "pos"), ot_3.id_class((gy_3)commandContext.getSource(), rXQ.MAINHAND), of_32)))).then(gp_3.id_class("offhand").executes(commandContext -> ot_3.id_class((CommandContext<gy_3>)commandContext, RM.id_class((CommandContext<gy_3>)commandContext, "pos"), ot_3.id_class((gy_3)commandContext.getSource(), rXQ.OFFHAND), of_32)))))));
    }

    private static <T extends ArgumentBuilder<gy_3, T>> T id_class(T t, ow_3 ow_32) {
        return (T)t.then(((LiteralArgumentBuilder)gp_3.id_class("replace").then(gp_3.id_class("entity").then(gp_3.id_class("entities", RZ.id_break()).then(ow_32.construct((ArgumentBuilder<gy_3, ?>)gp_3.id_class("slot", YC.id_class()), (commandContext, list, oI_22) -> ot_3.id_class(RZ.id_break((CommandContext<gy_3>)commandContext, "entities"), YC.id_class((CommandContext<gy_3>)commandContext, "slot"), list.size(), list, oI_22)).then(ow_32.construct((ArgumentBuilder<gy_3, ?>)gp_3.id_class("count", IntegerArgumentType.integer((int)0)), (commandContext, list, oI_22) -> ot_3.id_class(RZ.id_break((CommandContext<gy_3>)commandContext, "entities"), YC.id_class((CommandContext<gy_3>)commandContext, "slot"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), list, oI_22))))))).then(gp_3.id_class("block").then(gp_3.id_class("targetPos", RM.id_class()).then(ow_32.construct((ArgumentBuilder<gy_3, ?>)gp_3.id_class("slot", YC.id_class()), (commandContext, list, oI_22) -> ot_3.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "targetPos"), YC.id_class((CommandContext<gy_3>)commandContext, "slot"), list.size(), list, oI_22)).then(ow_32.construct((ArgumentBuilder<gy_3, ?>)gp_3.id_class("count", IntegerArgumentType.integer((int)0)), (commandContext, list, oI_22) -> ot_3.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "targetPos"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"slot"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), list, oI_22))))))).then(gp_3.id_class("insert").then(ow_32.construct((ArgumentBuilder<gy_3, ?>)gp_3.id_class("targetPos", RM.id_class()), (commandContext, list, oI_22) -> ot_3.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "targetPos"), (List<rdn_3>)list, oI_22)))).then(gp_3.id_class("give").then(ow_32.construct((ArgumentBuilder<gy_3, ?>)gp_3.id_class("players", RZ.id_protected()), (commandContext, list, oI_22) -> ot_3.id_class(RZ.id_case((CommandContext<gy_3>)commandContext, "players"), (List<rdn_3>)list, oI_22)))).then(gp_3.id_class("spawn").then(ow_32.construct((ArgumentBuilder<gy_3, ?>)gp_3.id_class("targetPos", Yw_1.id_class()), (commandContext, list, oI_22) -> ot_3.id_class((gy_3)commandContext.getSource(), Yw_1.id_class((CommandContext<gy_3>)commandContext, "targetPos"), (List<rdn_3>)list, oI_22))));
    }

    private static int id_class(Collection<rhN_2> collection, List<rdn_3> list, oI_2 oI_22) throws CommandSyntaxException {
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)list.size());
        for (rdn_3 rdn_32 : list) {
            for (rhN_2 rhN_22 : collection) {
                if (!((rhz_3)rhN_22.id_implements[1]).id_throws(rdn_32.id_implements())) continue;
                arrayList.add(rdn_32);
            }
        }
        oI_22.accept(arrayList);
        return arrayList.size();
    }

    private static void id_class(an_3 an_32, List<rdn_3> list, int n, int n2, List<rdn_3> list2) {
        for (int i = 0; i < n2; ++i) {
            rdn_3 rdn_32;
            rdn_3 rdn_33 = rdn_32 = i < list.size() ? list.get(i) : rdn_3.id_break;
            if (!an_32.id_class(n + i, rdn_32.id_implements())) continue;
            list2.add(rdn_32);
        }
    }

    private static int id_class(Collection<? extends an_3> collection, int n, int n2, List<rdn_3> list, oI_2 oI_22) throws CommandSyntaxException {
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)list.size());
        for (an_3 an_32 : collection) {
            if (an_32 instanceof rhN_2) {
                rhN_2 rhN_22 = (rhN_2)an_32;
                ((rJT)rhN_22.id_implements[3]).id_native();
                ot_3.id_class(an_32, list, n, n2, arrayList);
                ((rJT)rhN_22.id_implements[3]).id_native();
                continue;
            }
            ot_3.id_class(an_32, list, n, n2, arrayList);
        }
        oI_22.accept(arrayList);
        return arrayList.size();
    }

    private static int id_class(gy_3 gy_32, rjU_2 rjU_22, List<rdn_3> list, oI_2 oI_22) throws CommandSyntaxException {
        rrEm_1 rrEm_12 = gy_32.id_final();
        list.forEach(rdn_32 -> {
            rsE_2 rsE_22 = new rsE_2(rrEm_12, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, rdn_32.id_implements());
            rsE_22.id_private();
            rrEm_12.a_(rsE_22);
        });
        oI_22.accept(list);
        return list.size();
    }

    private static int id_class(gy_3 gy_32, rfH_2 rfH_22, List<rdn_3> list, oI_2 oI_22) throws CommandSyntaxException {
        rXu_1 rXu_12 = ot_3.id_class(gy_32, rfH_22);
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)list.size());
        for (rdn_3 rdn_32 : list) {
            if (!ot_3.id_class(rXu_12, rdn_32.id_implements())) continue;
            rXu_12.id_break();
            arrayList.add(rdn_32);
        }
        oI_22.accept(arrayList);
        return arrayList.size();
    }

    private static boolean id_class(rXu_1 rXu_12, rdn_3 rdn_32) {
        boolean bl = false;
        for (int i = 0; i < rXu_12.id_else() && !rdn_32.id_class(); ++i) {
            rdn_3 rdn_33 = rXu_12.id_extends(i);
            if (!rXu_12.a_(i, rdn_32)) continue;
            if (rdn_33.id_class()) {
                rXu_12.id_break(i, rdn_32);
                bl = true;
                break;
            }
            if (!ot_3.id_class(rdn_33, rdn_32)) continue;
            int n = rdn_32.id_byte() - rdn_33.id_char();
            int n2 = Math.min(rdn_32.id_char(), n);
            rdn_32.id_catch(n2);
            rdn_33.id_case(n2);
            bl = true;
        }
        return bl;
    }

    private static int id_class(gy_3 gy_32, rfH_2 rfH_22, int n, int n2, List<rdn_3> list, oI_2 oI_22) throws CommandSyntaxException {
        rXu_1 rXu_12 = ot_3.id_class(gy_32, rfH_22);
        int n3 = rXu_12.id_else();
        if (n >= 0 && n < n3) {
            ArrayList arrayList = Lists.newArrayListWithCapacity((int)list.size());
            for (int i = 0; i < n2; ++i) {
                rdn_3 rdn_32;
                int n4 = n + i;
                rdn_3 rdn_33 = rdn_32 = i < list.size() ? list.get(i) : rdn_3.id_break;
                if (!rXu_12.a_(n4, rdn_32)) continue;
                rXu_12.id_break(n4, rdn_32);
                arrayList.add(rdn_32);
            }
            oI_22.accept(arrayList);
            return arrayList.size();
        }
        throw oa_3.id_break.create((Object)n);
    }

    private static boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        return rdn_32.id_break() == rdn_33.id_break() && rdn_32.id_catch() == rdn_33.id_catch() && rdn_32.id_char() <= rdn_32.id_byte() && Objects.equals(rdn_32.id_package(), rdn_33.id_package());
    }

    private static int id_class(CommandContext<gy_3> commandContext, an_3 an_32, of_3 of_32) throws CommandSyntaxException {
        if (!(an_32 instanceof iB_2)) {
            throw id_byte.create((Object)an_32.L_());
        }
        rqO_2 rqO_22 = ((iB_2)an_32).By();
        gy_3 gy_32 = (gy_3)commandContext.getSource();
        rzP_2 rzP_22 = new rzP_2(gy_32.id_final());
        an_3 an_33 = gy_32.id_package();
        if (an_33 instanceof rhd_3) {
            rzP_22.id_class(rzQ_2.id_break, (rhd_3)an_33);
        }
        rzP_22.id_class(rzQ_2.id_byte, rye_3.id_package);
        rzP_22.id_break(rzQ_2.id_throws, an_33);
        rzP_22.id_break(rzQ_2.id_protected, an_33);
        rzP_22.id_class(rzQ_2.id_class, an_32);
        rzP_22.id_class(rzQ_2.id_case, gy_32.id_volatile());
        rzL_2 rzL_22 = gy_32.id_super().o().id_class(rqO_22);
        List<rdn_3> list2 = rzL_22.id_class(rzP_22.id_class(rzz_3.id_case));
        return of_32.accept(commandContext, list2, list -> ot_3.id_class(gy_32, (List<rdn_3>)list, rqO_22));
    }

    private static int id_class(CommandContext<gy_3> commandContext, rfH_2 rfH_22, rdn_3 rdn_32, of_3 of_32) throws CommandSyntaxException {
        gy_3 gy_32 = (gy_3)commandContext.getSource();
        rrEm_1 rrEm_12 = gy_32.id_final();
        xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
        ryO_2 ryO_22 = rrEm_12.id_class(rfH_22);
        rzP_2 rzP_22 = new rzP_2(rrEm_12).id_class(rzQ_2.id_case, rjU_2.id_class(rfH_22)).id_class(rzQ_2.id_catch, xc_32).id_break(rzQ_2.id_private, ryO_22).id_break(rzQ_2.id_class, gy_32.id_package()).id_class(rzQ_2.id_implements, rdn_32);
        List<rdn_3> list2 = xc_32.id_class(rzP_22);
        return of_32.accept(commandContext, list2, list -> ot_3.id_class(gy_32, (List<rdn_3>)list, xc_32.id_break().id_throws()));
    }

    private static void id_class(gy_3 gy_32, List<rdn_3> list, rqO_2 rqO_22) {
        if (list.size() == 1) {
            rdn_3 rdn_32 = list.get(0);
            gy_32.id_class(new rgn_3("commands.drop.success.single_with_table", rdn_32.id_char(), rdn_32.id_throw(), rqO_22), false);
        } else {
            gy_32.id_class(new rgn_3("commands.drop.success.multiple_with_table", list.size(), rqO_22), false);
        }
    }

    private static rdn_3 id_class(gy_3 gy_32, rXQ rXQ2) throws CommandSyntaxException {
        an_3 an_32 = gy_32.id_int();
        if (an_32 instanceof iB_2) {
            return ((iB_2)an_32).id_class(rXQ2);
        }
        throw id_break.create((Object)an_32.L_());
    }

    private static void id_class(gy_3 gy_32, List<rdn_3> list) {
        if (list.size() == 1) {
            rdn_3 rdn_32 = list.get(0);
            gy_32.id_class(new rgn_3("commands.drop.success.single", rdn_32.id_char(), rdn_32.id_throw()), false);
        } else {
            gy_32.id_class(new rgn_3("commands.drop.success.multiple", list.size()), false);
        }
    }

    private static int id_class(CommandContext<gy_3> commandContext, rqO_2 rqO_22, of_3 of_32) throws CommandSyntaxException {
        gy_3 gy_32 = (gy_3)commandContext.getSource();
        rzP_2 rzP_22 = new rzP_2(gy_32.id_final()).id_break(rzQ_2.id_class, gy_32.id_package()).id_class(rzQ_2.id_case, gy_32.id_volatile());
        return ot_3.id_class(commandContext, rqO_22, rzP_22.id_class(rzz_3.id_break), of_32);
    }
}

