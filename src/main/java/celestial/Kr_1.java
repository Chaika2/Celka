/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.gp_3;
import celestial.gy_3;
import celestial.rgn_3;
import celestial.rrEm_1;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Kr_1 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.save.alreadyOff"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("save-off").requires(gy_32 -> gy_32.id_class(4))).executes(commandContext -> {
            gy_3 gy_32 = (gy_3)commandContext.getSource();
            boolean bl = false;
            for (rrEm_1 rrEm_12 : gy_32.id_super().id_float()) {
                if (rrEm_12 == null || rrEm_12.id_synchronized) continue;
                rrEm_12.id_synchronized = true;
                bl = true;
            }
            if (!bl) {
                throw id_class.create();
            }
            gy_32.id_class(new rgn_3("commands.save.disabled"), true);
            return 1;
        }));
    }
}

