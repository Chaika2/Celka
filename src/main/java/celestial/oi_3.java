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
import celestial.rgn_3;
import celestial.rnW_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class oi_3 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.save.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("save-all").requires(gy_32 -> gy_32.id_class(4))).executes(commandContext -> oi_3.id_class((gy_3)commandContext.getSource(), false))).then(gp_3.id_class("flush").executes(commandContext -> oi_3.id_class((gy_3)commandContext.getSource(), true))));
    }

    private static int id_class(gy_3 gy_32, boolean bl) throws CommandSyntaxException {
        gy_32.id_class(new rgn_3("commands.save.saving"), false);
        rnW_2 rnW_22 = gy_32.id_super();
        rnW_22.x().id_implements();
        boolean bl2 = rnW_22.id_class(true, bl, true);
        if (!bl2) {
            throw id_class.create();
        }
        gy_32.id_class(new rgn_3("commands.save.success"), true);
        return 1;
    }
}

