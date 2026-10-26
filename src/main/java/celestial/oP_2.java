/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.RT;
import celestial.YP;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rCJ;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rgv_3;
import celestial.rhN_2;
import celestial.rno_3;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Date;

public class oP_2 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.ban.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("ban").requires(gy_32 -> gy_32.id_class(3))).then(((RequiredArgumentBuilder)gp_3.id_class("targets", RT.id_class()).executes(commandContext -> oP_2.id_class((gy_3)commandContext.getSource(), RT.id_class((CommandContext<gy_3>)commandContext, "targets"), null))).then(gp_3.id_class("reason", YP.id_class()).executes(commandContext -> oP_2.id_class((gy_3)commandContext.getSource(), RT.id_class((CommandContext<gy_3>)commandContext, "targets"), YP.id_class((CommandContext<gy_3>)commandContext, "reason"))))));
    }

    private static int id_class(gy_3 gy_32, Collection<GameProfile> collection, rgP_2 rgP_22) throws CommandSyntaxException {
        rno_3 rno_32 = gy_32.id_super().x().id_catch();
        int n = 0;
        for (GameProfile gameProfile : collection) {
            if (rno_32.id_class(gameProfile)) continue;
            rCJ rCJ2 = new rCJ(gameProfile, (Date)null, gy_32.id_native(), (Date)null, rgP_22 == null ? null : rgP_22.getString());
            rno_32.id_class(rCJ2);
            ++n;
            gy_32.id_class(new rgn_3("commands.ban.success", rgv_3.id_class(gameProfile), rCJ2.id_byte()), true);
            rhN_2 rhN_22 = gy_32.id_super().x().id_class(gameProfile.getId());
            if (rhN_22 == null) continue;
            rhN_22.id_class.id_class(new rgn_3("multiplayer.disconnect.banned"));
        }
        if (n == 0) {
            throw id_class.create();
        }
        return n;
    }
}

