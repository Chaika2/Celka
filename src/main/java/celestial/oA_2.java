/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
package celestial;

import celestial.gp_3;
import celestial.gy_3;
import celestial.on_3;
import celestial.rRA;
import celestial.rRC;
import celestial.rRu_1;
import celestial.rgn_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class oA_2 {
    public static <T extends rRC<T>> int id_class(gy_3 gy_32, rRA<T> rRA2) {
        T t = gy_32.id_super().D().id_class(rRA2);
        gy_32.id_class(new rgn_3("commands.gamerule.query", rRA2.id_class(), ((rRC)t).toString()), false);
        return ((rRC)t).id_byte();
    }

    public static <T extends rRC<T>> int id_class(CommandContext<gy_3> commandContext, rRA<T> rRA2) {
        gy_3 gy_32 = (gy_3)commandContext.getSource();
        T t = gy_32.id_super().D().id_class(rRA2);
        ((rRC)t).id_break(commandContext, "value");
        gy_32.id_class(new rgn_3("commands.gamerule.set", rRA2.id_class(), ((rRC)t).toString()), true);
        return ((rRC)t).id_byte();
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        LiteralArgumentBuilder literalArgumentBuilder = (LiteralArgumentBuilder)gp_3.id_class("gamerule").requires(gy_32 -> gy_32.id_class(2));
        rRu_1.id_class(new on_3(literalArgumentBuilder));
        commandDispatcher.register(literalArgumentBuilder);
    }
}

