/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.gp_3;
import celestial.gy_3;
import celestial.rgn_3;
import celestial.rpu_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class oD_2 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.publish.failed"));
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("commands.publish.alreadyPublished", object));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("publish").requires(gy_32 -> gy_32.id_class(4))).executes(commandContext -> oD_2.id_class((gy_3)commandContext.getSource(), rpu_3.id_class()))).then(gp_3.id_class("port", IntegerArgumentType.integer((int)0, (int)65535)).executes(commandContext -> oD_2.id_class((gy_3)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"port")))));
    }

    private static int id_class(gy_3 gy_32, int n) throws CommandSyntaxException {
        if (gy_32.id_super().d()) {
            throw id_break.create((Object)gy_32.id_super().id_short());
        }
        if (!gy_32.id_super().id_class(gy_32.id_super().id_package(), false, n)) {
            throw id_class.create();
        }
        gy_32.id_class(new rgn_3("commands.publish.success", n), true);
        return n;
    }
}

