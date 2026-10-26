/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
package celestial;

import celestial.Yl_1;
import celestial.Ym_1;
import celestial.gp_3;
import celestial.gy_3;
import celestial.oT_2;
import celestial.rVL;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rgn_3;
import celestial.rqO_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class oq_3 {
    public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("commands.locatebiome.invalid", object));
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("commands.locatebiome.notFound", object));

    private static int id_class(gy_3 gy_32, rqO_2 rqO_22) throws CommandSyntaxException {
        rYG rYG2 = (rYG)gy_32.id_super().rS().id_break(rVL.n).id_break(rqO_22).orElseThrow(() -> id_class.create((Object)rqO_22));
        rfH_2 rfH_22 = new rfH_2(gy_32.id_volatile());
        rfH_2 rfH_23 = gy_32.id_final().id_class(rYG2, rfH_22, 6400, 8);
        String string = rqO_22.toString();
        if (rfH_23 == null) {
            throw id_break.create((Object)string);
        }
        return oT_2.id_class(gy_32, string, rfH_22, rfH_23, "commands.locatebiome.success");
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("locatebiome").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("biome", Ym_1.id_class()).suggests(Yl_1.id_protected).executes(commandContext -> oq_3.id_class((gy_3)commandContext.getSource(), (rqO_2)commandContext.getArgument("biome", rqO_2.class)))));
    }
}

