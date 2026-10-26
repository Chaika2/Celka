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

import celestial.Rl_1;
import celestial.Yl_1;
import celestial.Ys_1;
import celestial.Yw_1;
import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.iO_2;
import celestial.is_3;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rgn_3;
import celestial.rjU_2;
import celestial.rqO_2;
import celestial.rrEm_1;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Kz_1 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.summon.failed"));
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.summon.failed.uuid"));
    private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("commands.summon.invalidPosition"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("summon").requires(gy_32 -> gy_32.id_class(2))).then(((RequiredArgumentBuilder)gp_3.id_class("entity", Rl_1.id_class()).suggests(Yl_1.id_throws).executes(commandContext -> Kz_1.id_class((gy_3)commandContext.getSource(), Rl_1.id_class((CommandContext<gy_3>)commandContext, "entity"), ((gy_3)commandContext.getSource()).id_volatile(), new rcd_3(), true))).then(((RequiredArgumentBuilder)gp_3.id_class("pos", Yw_1.id_class()).executes(commandContext -> Kz_1.id_class((gy_3)commandContext.getSource(), Rl_1.id_class((CommandContext<gy_3>)commandContext, "entity"), Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos"), new rcd_3(), true))).then(gp_3.id_class("nbt", Ys_1.id_class()).executes(commandContext -> Kz_1.id_class((gy_3)commandContext.getSource(), Rl_1.id_class((CommandContext<gy_3>)commandContext, "entity"), Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos"), Ys_1.id_class(commandContext, "nbt"), false))))));
    }

    private static int id_class(gy_3 gy_32, rqO_2 rqO_22, rjU_2 rjU_22, rcd_3 rcd_32, boolean bl) throws CommandSyntaxException {
        rfH_2 rfH_22 = new rfH_2(rjU_22);
        if (!rYB.id_continue(rfH_22)) {
            throw id_byte.create();
        }
        rcd_3 rcd_33 = rcd_32.id_catch();
        rcd_33.id_class("id", rqO_22.toString());
        rrEm_1 rrEm_12 = gy_32.id_final();
        an_3 an_33 = aI_2.id_class(rcd_33, rrEm_12, an_32 -> {
            an_32.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, ((Float)an_32.id_throws[15]).floatValue(), ((Float)an_32.id_throws[16]).floatValue());
            return an_32;
        });
        if (an_33 == null) {
            throw id_class.create();
        }
        if (bl && an_33 instanceof is_3) {
            ((is_3)an_33).id_class(gy_32.id_final(), gy_32.id_final().id_throws(an_33.Bs()), iO_2.COMMAND, (aU_2)null, (rcd_3)null);
        }
        if (!rrEm_12.id_implements(an_33)) {
            throw id_break.create();
        }
        gy_32.id_class(new rgn_3("commands.summon.success", an_33.L_()), true);
        return 1;
    }
}

