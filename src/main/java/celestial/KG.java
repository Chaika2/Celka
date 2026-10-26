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

import celestial.KM;
import celestial.RM;
import celestial.Rd_1;
import celestial.Rx_1;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rXc_1;
import celestial.rfH_2;
import celestial.rgn_3;
import celestial.rrEm_1;
import celestial.ryO_2;
import celestial.ryw_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;

public class KG {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.setblock.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("setblock").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("pos", RM.id_class()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("block", Rx_1.id_class()).executes(commandContext -> KG.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "pos"), Rx_1.id_class((CommandContext<gy_3>)commandContext, "block"), KM.REPLACE, null))).then(gp_3.id_class("destroy").executes(commandContext -> KG.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "pos"), Rx_1.id_class((CommandContext<gy_3>)commandContext, "block"), KM.DESTROY, null)))).then(gp_3.id_class("keep").executes(commandContext -> KG.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "pos"), Rx_1.id_class((CommandContext<gy_3>)commandContext, "block"), KM.REPLACE, ryw_32 -> ryw_32.id_byte().id_finally(ryw_32.id_protected()))))).then(gp_3.id_class("replace").executes(commandContext -> KG.id_class((gy_3)commandContext.getSource(), RM.id_class((CommandContext<gy_3>)commandContext, "pos"), Rx_1.id_class((CommandContext<gy_3>)commandContext, "block"), KM.REPLACE, null))))));
    }

    private static int id_class(gy_3 gy_32, rfH_2 rfH_22, Rd_1 rd_1, KM kM, Predicate<ryw_3> predicate) throws CommandSyntaxException {
        boolean bl;
        rrEm_1 rrEm_12 = gy_32.id_final();
        if (predicate != null && !predicate.test(new ryw_3(rrEm_12, rfH_22, true))) {
            throw id_class.create();
        }
        if (kM == KM.DESTROY) {
            rrEm_12.id_break(rfH_22, true);
            bl = !rd_1.id_class().id_catch() || !rrEm_12.id_byte(rfH_22).id_catch();
        } else {
            ryO_2 ryO_22 = rrEm_12.id_class(rfH_22);
            rXc_1.id_class(ryO_22);
            bl = true;
        }
        if (bl && !rd_1.id_class(rrEm_12, rfH_22, 2)) {
            throw id_class.create();
        }
        rrEm_12.id_class(rfH_22, rd_1.id_class().id_break());
        gy_32.id_class(new rgn_3("commands.setblock.success", rfH_22.b_(), rfH_22.c_(), rfH_22.d_()), true);
        return 1;
    }
}

