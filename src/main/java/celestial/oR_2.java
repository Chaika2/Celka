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
import celestial.rgn_3;
import celestial.rgv_3;
import celestial.rno_3;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class oR_2 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.pardon.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("pardon").requires(gy_32 -> gy_32.id_class(3))).then(gp_3.id_class("targets", RT.id_class()).suggests((commandContext, suggestionsBuilder) -> gR_2.id_class(((gy_3)commandContext.getSource()).id_super().x().id_catch().id_class(), suggestionsBuilder)).executes(commandContext -> oR_2.id_class((gy_3)commandContext.getSource(), RT.id_class((CommandContext<gy_3>)commandContext, "targets")))));
    }

    private static int id_class(gy_3 gy_32, Collection<GameProfile> collection) throws CommandSyntaxException {
        rno_3 rno_32 = gy_32.id_super().x().id_catch();
        int n = 0;
        for (GameProfile gameProfile : collection) {
            if (!rno_32.id_class(gameProfile)) continue;
            rno_32.id_byte(gameProfile);
            ++n;
            gy_32.id_class(new rgn_3("commands.pardon.success", rgv_3.id_class(gameProfile)), true);
        }
        if (n == 0) {
            throw id_class.create();
        }
        return n;
    }
}

