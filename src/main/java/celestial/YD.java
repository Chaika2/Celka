/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
package celestial;

import celestial.OT;
import celestial.RZ;
import celestial.YU;
import celestial.Yi_1;
import celestial.Ym_1;
import celestial.gH_2;
import celestial.gR_2;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rgn_3;
import celestial.rhN_2;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class YD {
    private static final SuggestionProvider<gy_3> id_class = (commandContext, suggestionsBuilder) -> {
        Collection<OT> collection = ((gy_3)commandContext.getSource()).id_super().t().id_class();
        return gR_2.id_class(collection.stream().map(OT::id_private), suggestionsBuilder);
    };

    private static int id_class(gy_3 gy_32, Collection<rhN_2> collection, YU yU, OT oT, String string) {
        int n = 0;
        if (!oT.id_case().containsKey(string)) {
            throw new gH_2(new rgn_3("commands.advancement.criterionNotFound", oT.id_finally(), string));
        }
        for (rhN_2 rhN_22 : collection) {
            if (!yU.id_class(rhN_22, oT, string)) continue;
            ++n;
        }
        if (n == 0) {
            if (collection.size() == 1) {
                throw new gH_2(new rgn_3(yU.id_class() + ".criterion.to.one.failure", string, oT.id_finally(), collection.iterator().next().L_()));
            }
            throw new gH_2(new rgn_3(yU.id_class() + ".criterion.to.many.failure", string, oT.id_finally(), collection.size()));
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3(yU.id_class() + ".criterion.to.one.success", string, oT.id_finally(), collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3(yU.id_class() + ".criterion.to.many.success", string, oT.id_finally(), collection.size()), true);
        }
        return n;
    }

    private static int id_class(gy_3 gy_32, Collection<rhN_2> collection, YU yU, Collection<OT> collection2) {
        int n = 0;
        for (rhN_2 rhN_22 : collection) {
            n += yU.id_class(rhN_22, collection2);
        }
        if (n == 0) {
            if (collection2.size() == 1) {
                if (collection.size() == 1) {
                    throw new gH_2(new rgn_3(yU.id_class() + ".one.to.one.failure", collection2.iterator().next().id_finally(), collection.iterator().next().L_()));
                }
                throw new gH_2(new rgn_3(yU.id_class() + ".one.to.many.failure", collection2.iterator().next().id_finally(), collection.size()));
            }
            if (collection.size() == 1) {
                throw new gH_2(new rgn_3(yU.id_class() + ".many.to.one.failure", collection2.size(), collection.iterator().next().L_()));
            }
            throw new gH_2(new rgn_3(yU.id_class() + ".many.to.many.failure", collection2.size(), collection.size()));
        }
        if (collection2.size() == 1) {
            if (collection.size() == 1) {
                gy_32.id_class(new rgn_3(yU.id_class() + ".one.to.one.success", collection2.iterator().next().id_finally(), collection.iterator().next().L_()), true);
            } else {
                gy_32.id_class(new rgn_3(yU.id_class() + ".one.to.many.success", collection2.iterator().next().id_finally(), collection.size()), true);
            }
        } else if (collection.size() == 1) {
            gy_32.id_class(new rgn_3(yU.id_class() + ".many.to.one.success", collection2.size(), collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3(yU.id_class() + ".many.to.many.success", collection2.size(), collection.size()), true);
        }
        return n;
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("advancement").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("grant").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected()).then(gp_3.id_class("only").then(((RequiredArgumentBuilder)gp_3.id_class("advancement", Ym_1.id_class()).suggests(id_class).executes(commandContext -> YD.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YU.GRANT, YD.id_class(Ym_1.id_class((CommandContext<gy_3>)commandContext, "advancement"), Yi_1.ONLY)))).then(gp_3.id_class("criterion", StringArgumentType.greedyString()).suggests((commandContext, suggestionsBuilder) -> gR_2.id_break(Ym_1.id_class((CommandContext<gy_3>)commandContext, "advancement").id_case().keySet(), suggestionsBuilder)).executes(commandContext -> YD.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YU.GRANT, Ym_1.id_class((CommandContext<gy_3>)commandContext, "advancement"), StringArgumentType.getString((CommandContext)commandContext, (String)"criterion"))))))).then(gp_3.id_class("from").then(gp_3.id_class("advancement", Ym_1.id_class()).suggests(id_class).executes(commandContext -> YD.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YU.GRANT, YD.id_class(Ym_1.id_class((CommandContext<gy_3>)commandContext, "advancement"), Yi_1.FROM)))))).then(gp_3.id_class("until").then(gp_3.id_class("advancement", Ym_1.id_class()).suggests(id_class).executes(commandContext -> YD.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YU.GRANT, YD.id_class(Ym_1.id_class((CommandContext<gy_3>)commandContext, "advancement"), Yi_1.UNTIL)))))).then(gp_3.id_class("through").then(gp_3.id_class("advancement", Ym_1.id_class()).suggests(id_class).executes(commandContext -> YD.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YU.GRANT, YD.id_class(Ym_1.id_class((CommandContext<gy_3>)commandContext, "advancement"), Yi_1.THROUGH)))))).then(gp_3.id_class("everything").executes(commandContext -> YD.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YU.GRANT, ((gy_3)commandContext.getSource()).id_super().t().id_class())))))).then(gp_3.id_class("revoke").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected()).then(gp_3.id_class("only").then(((RequiredArgumentBuilder)gp_3.id_class("advancement", Ym_1.id_class()).suggests(id_class).executes(commandContext -> YD.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YU.REVOKE, YD.id_class(Ym_1.id_class((CommandContext<gy_3>)commandContext, "advancement"), Yi_1.ONLY)))).then(gp_3.id_class("criterion", StringArgumentType.greedyString()).suggests((commandContext, suggestionsBuilder) -> gR_2.id_break(Ym_1.id_class((CommandContext<gy_3>)commandContext, "advancement").id_case().keySet(), suggestionsBuilder)).executes(commandContext -> YD.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YU.REVOKE, Ym_1.id_class((CommandContext<gy_3>)commandContext, "advancement"), StringArgumentType.getString((CommandContext)commandContext, (String)"criterion"))))))).then(gp_3.id_class("from").then(gp_3.id_class("advancement", Ym_1.id_class()).suggests(id_class).executes(commandContext -> YD.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YU.REVOKE, YD.id_class(Ym_1.id_class((CommandContext<gy_3>)commandContext, "advancement"), Yi_1.FROM)))))).then(gp_3.id_class("until").then(gp_3.id_class("advancement", Ym_1.id_class()).suggests(id_class).executes(commandContext -> YD.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YU.REVOKE, YD.id_class(Ym_1.id_class((CommandContext<gy_3>)commandContext, "advancement"), Yi_1.UNTIL)))))).then(gp_3.id_class("through").then(gp_3.id_class("advancement", Ym_1.id_class()).suggests(id_class).executes(commandContext -> YD.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YU.REVOKE, YD.id_class(Ym_1.id_class((CommandContext<gy_3>)commandContext, "advancement"), Yi_1.THROUGH)))))).then(gp_3.id_class("everything").executes(commandContext -> YD.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), YU.REVOKE, ((gy_3)commandContext.getSource()).id_super().t().id_class()))))));
    }

    private static void id_class(OT oT, List<OT> list) {
        for (OT oT2 : oT.id_throws()) {
            list.add(oT2);
            YD.id_class(oT2, list);
        }
    }

    private static List<OT> id_class(OT oT, Yi_1 yi_1) {
        ArrayList arrayList = Lists.newArrayList();
        if (yi_1.includesParents) {
            for (OT oT2 = oT.id_break(); oT2 != null; oT2 = oT2.id_break()) {
                arrayList.add(oT2);
            }
        }
        arrayList.add(oT);
        if (yi_1.includesChildren) {
            YD.id_class(oT, arrayList);
        }
        return arrayList;
    }
}

