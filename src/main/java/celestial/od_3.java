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

import celestial.gp_3;
import celestial.gy_3;
import celestial.rRO;
import celestial.rgn_3;
import celestial.rnW_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class od_3 {
    private static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("commands.difficulty.failure", object));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        LiteralArgumentBuilder<gy_3> literalArgumentBuilder = gp_3.id_class("difficulty");
        for (rRO rRO2 : rRO.values()) {
            literalArgumentBuilder.then(gp_3.id_class(rRO2.id_byte()).executes(commandContext -> od_3.id_class((gy_3)commandContext.getSource(), rRO2)));
        }
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder.requires(gy_32 -> gy_32.id_class(2))).executes(commandContext -> {
            rRO rRO2 = ((gy_3)commandContext.getSource()).id_final().id_abstract();
            ((gy_3)commandContext.getSource()).id_class(new rgn_3("commands.difficulty.query", rRO2.id_break()), false);
            return rRO2.id_class();
        }));
    }

    public static int id_class(gy_3 gy_32, rRO rRO2) throws CommandSyntaxException {
        rnW_2 rnW_22 = gy_32.id_super();
        if (rnW_22.rB().id_extends() == rRO2) {
            throw id_class.create((Object)rRO2.id_byte());
        }
        rnW_22.id_class(rRO2, true);
        gy_32.id_class(new rgn_3("commands.difficulty.success", rRO2.id_break()), true);
        return 0;
    }
}

