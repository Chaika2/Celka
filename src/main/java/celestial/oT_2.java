/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.gp_3;
import celestial.gy_3;
import celestial.rVi_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgl_3;
import celestial.rgn_3;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import celestial.rrrZ;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Map;

public class oT_2 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.locate.failed"));

    private static float id_class(int n, int n2, int n3, int n4) {
        int n5 = n3 - n;
        int n6 = n4 - n2;
        return rfU_2.id_byte((float)(n5 * n5 + n6 * n6));
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        LiteralArgumentBuilder literalArgumentBuilder = (LiteralArgumentBuilder)gp_3.id_class("locate").requires(gy_32 -> gy_32.id_class(2));
        for (Map.Entry entry : rrrZ.id_class.entrySet()) {
            literalArgumentBuilder = (LiteralArgumentBuilder)literalArgumentBuilder.then(gp_3.id_class((String)entry.getKey()).executes(commandContext -> oT_2.id_class((gy_3)commandContext.getSource(), (rrrZ)entry.getValue())));
        }
        commandDispatcher.register(literalArgumentBuilder);
    }

    public static int id_class(gy_3 gy_32, String string, rfH_2 rfH_22, rfH_2 rfH_23, String string2) {
        int n = rfU_2.id_protected(oT_2.id_class(rfH_22.b_(), rfH_22.d_(), rfH_23.b_(), rfH_23.d_()));
        rVi_1 rVi_12 = rgv_3.id_class(new rgn_3("chat.coordinates", rfH_23.b_(), "~", rfH_23.d_())).id_class(rgc_32 -> rgc_32.id_class(rgF_2.GREEN).id_class(new rgl_3(rgH_2.SUGGEST_COMMAND, "/tp @s " + rfH_23.b_() + " ~ " + rfH_23.d_())).id_class(new rgy_3(rgp_3.id_class, new rgn_3("chat.coordinates.tooltip"))));
        gy_32.id_class(new rgn_3(string2, string, rVi_12, n), false);
        return n;
    }

    private static int id_class(gy_3 gy_32, rrrZ<?> rrrZ2) throws CommandSyntaxException {
        rfH_2 rfH_22 = new rfH_2(gy_32.id_volatile());
        rfH_2 rfH_23 = gy_32.id_final().id_class(rrrZ2, rfH_22, 100, false);
        if (rfH_23 == null) {
            throw id_class.create();
        }
        return oT_2.id_class(gy_32, rrrZ2.id_catch(), rfH_22, rfH_23, "commands.locate.success");
    }
}

