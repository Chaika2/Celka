/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 */
package celestial;

import celestial.gp_3;
import celestial.gy_3;
import celestial.rCr_1;
import celestial.rVi_1;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rgv_3;
import celestial.rhN_2;
import celestial.rhd_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class op_3 {
    private static int id_class(gy_3 gy_32, Function<rhN_2, rgP_2> function) {
        rCr_1 rCr_12 = gy_32.id_super().x();
        List<rhN_2> list = rCr_12.id_super();
        rVi_1 rVi_12 = rgv_3.id_break(list, function);
        gy_32.id_class(new rgn_3("commands.list.players", list.size(), rCr_12.id_package(), rVi_12), false);
        return list.size();
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("list").executes(commandContext -> op_3.id_class((gy_3)commandContext.getSource()))).then(gp_3.id_class("uuids").executes(commandContext -> op_3.id_break((gy_3)commandContext.getSource()))));
    }

    private static int id_class(gy_3 gy_32) {
        return op_3.id_class(gy_32, rhd_3::L_);
    }

    private static int id_break(gy_3 gy_32) {
        return op_3.id_class(gy_32, rhN_22 -> new rgn_3("commands.list.nameAndId", rhN_22.g(), rhN_22.sv().getId()));
    }
}

