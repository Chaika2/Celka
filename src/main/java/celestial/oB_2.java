/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.Rn_1;
import celestial.YP;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rnD_2;
import celestial.rnU_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class oB_2 {
    public static final Pattern id_class = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.banip.invalid"));
    private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("commands.banip.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("ban-ip").requires(gy_32 -> gy_32.id_class(3))).then(((RequiredArgumentBuilder)gp_3.id_class("target", StringArgumentType.word()).executes(commandContext -> oB_2.id_class((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"target"), null))).then(gp_3.id_class("reason", YP.id_class()).executes(commandContext -> oB_2.id_class((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"target"), YP.id_class((CommandContext<gy_3>)commandContext, "reason"))))));
    }

    private static int id_class(gy_3 gy_32, String string, rgP_2 rgP_22) throws CommandSyntaxException {
        Matcher matcher = id_class.matcher(string);
        if (matcher.matches()) {
            return oB_2.id_break(gy_32, string, rgP_22);
        }
        rhN_2 rhN_22 = gy_32.id_super().x().id_class(string);
        if (rhN_22 != null) {
            return oB_2.id_break(gy_32, rhN_22.id_super(), rgP_22);
        }
        throw id_break.create();
    }

    private static int id_break(gy_3 gy_32, String string, rgP_2 rgP_22) throws CommandSyntaxException {
        rnU_2 rnU_22 = gy_32.id_super().x().id_private();
        if (rnU_22.id_class(string)) {
            throw id_byte.create();
        }
        List<rhN_2> list = gy_32.id_super().x().id_break(string);
        rnD_2 rnD_22 = new rnD_2(string, (Date)null, gy_32.id_native(), (Date)null, rgP_22 == null ? null : rgP_22.getString());
        rnU_22.id_class(rnD_22);
        gy_32.id_class(new rgn_3("commands.banip.success", string, rnD_22.id_byte()), true);
        if (!list.isEmpty()) {
            gy_32.id_class(new rgn_3("commands.banip.info", list.size(), Rn_1.id_class(list)), true);
        }
        for (rhN_2 rhN_22 : list) {
            rhN_22.id_class.id_class(new rgn_3("multiplayer.disconnect.ip_banned"));
        }
        return list.size();
    }
}

