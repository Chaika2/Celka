/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.RZ;
import celestial.an_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rRl_1;
import celestial.rgn_3;
import celestial.rhN_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class KJ {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.spectate.self"));
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("commands.spectate.not_spectator", object));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("spectate").requires(gy_32 -> gy_32.id_class(2))).executes(commandContext -> KJ.id_class((gy_3)commandContext.getSource(), null, ((gy_3)commandContext.getSource()).id_new()))).then(((RequiredArgumentBuilder)gp_3.id_class("target", RZ.id_class()).executes(commandContext -> KJ.id_class((gy_3)commandContext.getSource(), RZ.id_class((CommandContext<gy_3>)commandContext, "target"), ((gy_3)commandContext.getSource()).id_new()))).then(gp_3.id_class("player", RZ.id_byte()).executes(commandContext -> KJ.id_class((gy_3)commandContext.getSource(), RZ.id_class((CommandContext<gy_3>)commandContext, "target"), RZ.id_throws((CommandContext<gy_3>)commandContext, "player"))))));
    }

    private static int id_class(gy_3 gy_32, an_3 an_32, rhN_2 rhN_22) throws CommandSyntaxException {
        if (rhN_22 == an_32) {
            throw id_class.create();
        }
        if (rhN_22.id_finally.id_break() != rRl_1.SPECTATOR) {
            throw id_break.create((Object)rhN_22.L_());
        }
        rhN_22.id_abstract(an_32);
        if (an_32 != null) {
            gy_32.id_class(new rgn_3("commands.spectate.success.started", an_32.L_()), false);
        } else {
            gy_32.id_class(new rgn_3("commands.spectate.success.stopped"), false);
        }
        return 1;
    }
}

