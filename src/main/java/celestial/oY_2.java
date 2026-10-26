/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.gR_2;
import celestial.gp_3;
import celestial.gy_3;
import celestial.oB_2;
import celestial.rgn_3;
import celestial.rnU_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.regex.Matcher;

public class oY_2 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.pardonip.invalid"));
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.pardonip.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("pardon-ip").requires(gy_32 -> gy_32.id_class(3))).then(gp_3.id_class("target", StringArgumentType.word()).suggests((commandContext, suggestionsBuilder) -> gR_2.id_class(((gy_3)commandContext.getSource()).id_super().x().id_private().id_class(), suggestionsBuilder)).executes(commandContext -> oY_2.id_class((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"target")))));
    }

    private static int id_class(gy_3 gy_32, String string) throws CommandSyntaxException {
        Matcher matcher = oB_2.id_class.matcher(string);
        if (!matcher.matches()) {
            throw id_class.create();
        }
        rnU_2 rnU_22 = gy_32.id_super().x().id_private();
        if (!rnU_22.id_class(string)) {
            throw id_break.create();
        }
        rnU_22.id_byte(string);
        gy_32.id_class(new rgn_3("commands.pardonip.success", string), true);
        return 1;
    }
}

