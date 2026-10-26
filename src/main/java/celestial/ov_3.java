/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  it.unimi.dsi.fastutil.longs.LongSet
 */
package celestial;

import celestial.RM;
import celestial.Rz_1;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rYB;
import celestial.rfg_3;
import celestial.rfj_3;
import celestial.rgn_3;
import celestial.rqM_2;
import celestial.rrEm_1;
import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ov_3 {
    private static final Dynamic2CommandExceptionType id_class = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("commands.forceload.toobig", object, object2));
    private static final Dynamic2CommandExceptionType id_break = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("commands.forceload.query.failure", object, object2));
    private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("commands.forceload.added.failure"));
    private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType((Message)new rgn_3("commands.forceload.removed.failure"));

    private static int id_class(gy_3 gy_32, rfg_3 rfg_32) throws CommandSyntaxException {
        rfj_3 rfj_32 = new rfj_3(rfg_32.id_class >> 4, rfg_32.id_break >> 4);
        rrEm_1 rrEm_12 = gy_32.id_final();
        rqM_2<rYB> rqM_22 = rrEm_12.E();
        boolean bl = rrEm_12.x().contains(rfj_32.id_class());
        if (bl) {
            gy_32.id_class(new rgn_3("commands.forceload.query.success", rfj_32, rqM_22.id_class()), false);
            return 1;
        }
        throw id_break.create((Object)rfj_32, (Object)rqM_22.id_class());
    }

    private static int id_class(gy_3 gy_32) {
        rrEm_1 rrEm_12 = gy_32.id_final();
        rqM_2<rYB> rqM_22 = rrEm_12.E();
        LongSet longSet = rrEm_12.x();
        int n = longSet.size();
        if (n > 0) {
            String string = Joiner.on((String)", ").join(longSet.stream().sorted().map(rfj_3::new).map(rfj_3::toString).iterator());
            if (n == 1) {
                gy_32.id_class(new rgn_3("commands.forceload.list.single", rqM_22.id_class(), string), false);
            } else {
                gy_32.id_class(new rgn_3("commands.forceload.list.multiple", n, rqM_22.id_class(), string), false);
            }
        } else {
            gy_32.id_class(new rgn_3("commands.forceload.added.none", rqM_22.id_class()));
        }
        return n;
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("forceload").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("add").then(((RequiredArgumentBuilder)gp_3.id_class("from", Rz_1.id_class()).executes(commandContext -> ov_3.id_class((gy_3)commandContext.getSource(), Rz_1.id_class((CommandContext<gy_3>)commandContext, "from"), Rz_1.id_class((CommandContext<gy_3>)commandContext, "from"), true))).then(gp_3.id_class("to", Rz_1.id_class()).executes(commandContext -> ov_3.id_class((gy_3)commandContext.getSource(), Rz_1.id_class((CommandContext<gy_3>)commandContext, "from"), Rz_1.id_class((CommandContext<gy_3>)commandContext, "to"), true)))))).then(((LiteralArgumentBuilder)gp_3.id_class("remove").then(((RequiredArgumentBuilder)gp_3.id_class("from", Rz_1.id_class()).executes(commandContext -> ov_3.id_class((gy_3)commandContext.getSource(), Rz_1.id_class((CommandContext<gy_3>)commandContext, "from"), Rz_1.id_class((CommandContext<gy_3>)commandContext, "from"), false))).then(gp_3.id_class("to", Rz_1.id_class()).executes(commandContext -> ov_3.id_class((gy_3)commandContext.getSource(), Rz_1.id_class((CommandContext<gy_3>)commandContext, "from"), Rz_1.id_class((CommandContext<gy_3>)commandContext, "to"), false))))).then(gp_3.id_class("all").executes(commandContext -> ov_3.id_break((gy_3)commandContext.getSource()))))).then(((LiteralArgumentBuilder)gp_3.id_class("query").executes(commandContext -> ov_3.id_class((gy_3)commandContext.getSource()))).then(gp_3.id_class("pos", Rz_1.id_class()).executes(commandContext -> ov_3.id_class((gy_3)commandContext.getSource(), Rz_1.id_class((CommandContext<gy_3>)commandContext, "pos"))))));
    }

    private static int id_class(gy_3 gy_32, rfg_3 rfg_32, rfg_3 rfg_33, boolean bl) throws CommandSyntaxException {
        int n = Math.min(rfg_32.id_class, rfg_33.id_class);
        int n2 = Math.min(rfg_32.id_break, rfg_33.id_break);
        int n3 = Math.max(rfg_32.id_class, rfg_33.id_class);
        int n4 = Math.max(rfg_32.id_break, rfg_33.id_break);
        if (n >= -30000000 && n2 >= -30000000 && n3 < 30000000 && n4 < 30000000) {
            int n5 = n3 >> 4;
            int n6 = n >> 4;
            int n7 = n4 >> 4;
            int n8 = n2 >> 4;
            long l = ((long)(n5 - n6) + 1L) * ((long)(n7 - n8) + 1L);
            if (l > 256L) {
                throw id_class.create((Object)256, (Object)l);
            }
            rrEm_1 rrEm_12 = gy_32.id_final();
            rqM_2<rYB> rqM_22 = rrEm_12.E();
            rfj_3 rfj_32 = null;
            int n9 = 0;
            for (int i = n6; i <= n5; ++i) {
                for (int j = n8; j <= n7; ++j) {
                    boolean bl2 = rrEm_12.id_class(i, j, bl);
                    if (!bl2) continue;
                    ++n9;
                    if (rfj_32 != null) continue;
                    rfj_32 = new rfj_3(i, j);
                }
            }
            if (n9 == 0) {
                throw (bl ? id_byte : id_protected).create();
            }
            if (n9 == 1) {
                gy_32.id_class(new rgn_3("commands.forceload." + (bl ? "added" : "removed") + ".single", rfj_32, rqM_22.id_class()), true);
            } else {
                rfj_3 rfj_33 = new rfj_3(n6, n8);
                rfj_3 rfj_34 = new rfj_3(n5, n7);
                gy_32.id_class(new rgn_3("commands.forceload." + (bl ? "added" : "removed") + ".multiple", n9, rqM_22.id_class(), rfj_33, rfj_34), true);
            }
            return n9;
        }
        throw RM.id_break.create();
    }

    private static int id_break(gy_3 gy_32) {
        rrEm_1 rrEm_12 = gy_32.id_final();
        rqM_2<rYB> rqM_22 = rrEm_12.E();
        LongSet longSet = rrEm_12.x();
        longSet.forEach(l -> rrEm_12.id_class(rfj_3.id_class(l), rfj_3.id_break(l), false));
        gy_32.id_class(new rgn_3("commands.forceload.removed.all", rqM_22.id_class()), true);
        return 0;
    }
}

