/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.RT;
import celestial.gR_2;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rCr_1;
import celestial.rgn_3;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class og_3 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.op.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("op").requires(gy_32 -> gy_32.id_class(3))).then(gp_3.id_class("targets", RT.id_class()).suggests((commandContext, suggestionsBuilder) -> {
            rCr_1 rCr_12 = ((gy_3)commandContext.getSource()).id_super().x();
            return gR_2.id_break(rCr_12.id_super().stream().filter(rhN_22 -> !rCr_12.id_case(rhN_22.sv())).map(rhN_22 -> rhN_22.sv().getName()), suggestionsBuilder);
        }).executes(commandContext -> og_3.id_class((gy_3)commandContext.getSource(), RT.id_class((CommandContext<gy_3>)commandContext, "targets")))));
    }

    private static int id_class(gy_3 gy_32, Collection<GameProfile> collection) throws CommandSyntaxException {
        rCr_1 rCr_12 = gy_32.id_super().x();
        int n = 0;
        for (GameProfile gameProfile : collection) {
            if (rCr_12.id_case(gameProfile)) continue;
            rCr_12.id_class(gameProfile);
            ++n;
            gy_32.id_class(new rgn_3("commands.op.success", collection.iterator().next().getName()), true);
        }
        if (n == 0) {
            throw id_class.create();
        }
        return n;
    }
}

