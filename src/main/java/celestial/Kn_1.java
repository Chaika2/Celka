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
import celestial.rCW;
import celestial.rCk_1;
import celestial.rCr_1;
import celestial.rgn_3;
import celestial.rgv_3;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class Kn_1 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.whitelist.alreadyOn"));
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.whitelist.alreadyOff"));
    private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("commands.whitelist.add.failed"));
    private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType((Message)new rgn_3("commands.whitelist.remove.failed"));

    private static int id_byte(gy_3 gy_32) throws CommandSyntaxException {
        rCr_1 rCr_12 = gy_32.id_super().x();
        if (!rCr_12.id_int()) {
            throw id_break.create();
        }
        rCr_12.id_class(false);
        gy_32.id_class(new rgn_3("commands.whitelist.disabled"), true);
        return 1;
    }

    private static int id_class(gy_3 gy_32) {
        gy_32.id_super().x().id_class();
        gy_32.id_class(new rgn_3("commands.whitelist.reloaded"), true);
        gy_32.id_super().id_class(gy_32);
        return 1;
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("whitelist").requires(gy_32 -> gy_32.id_class(3))).then(gp_3.id_class("on").executes(commandContext -> Kn_1.id_break((gy_3)commandContext.getSource())))).then(gp_3.id_class("off").executes(commandContext -> Kn_1.id_byte((gy_3)commandContext.getSource())))).then(gp_3.id_class("list").executes(commandContext -> Kn_1.id_protected((gy_3)commandContext.getSource())))).then(gp_3.id_class("add").then(gp_3.id_class("targets", RT.id_class()).suggests((commandContext, suggestionsBuilder) -> {
            rCr_1 rCr_12 = ((gy_3)commandContext.getSource()).id_super().x();
            return gR_2.id_break(rCr_12.id_super().stream().filter(rhN_22 -> !rCr_12.id_finally().id_class(rhN_22.sv())).map(rhN_22 -> rhN_22.sv().getName()), suggestionsBuilder);
        }).executes(commandContext -> Kn_1.id_class((gy_3)commandContext.getSource(), RT.id_class((CommandContext<gy_3>)commandContext, "targets")))))).then(gp_3.id_class("remove").then(gp_3.id_class("targets", RT.id_class()).suggests((commandContext, suggestionsBuilder) -> gR_2.id_class(((gy_3)commandContext.getSource()).id_super().x().id_extends(), suggestionsBuilder)).executes(commandContext -> Kn_1.id_break((gy_3)commandContext.getSource(), RT.id_class((CommandContext<gy_3>)commandContext, "targets")))))).then(gp_3.id_class("reload").executes(commandContext -> Kn_1.id_class((gy_3)commandContext.getSource()))));
    }

    private static int id_class(gy_3 gy_32, Collection<GameProfile> collection) throws CommandSyntaxException {
        rCk_1 rCk_12 = gy_32.id_super().x().id_finally();
        int n = 0;
        for (GameProfile gameProfile : collection) {
            if (rCk_12.id_class(gameProfile)) continue;
            rCW rCW2 = new rCW(gameProfile);
            rCk_12.id_class(rCW2);
            gy_32.id_class(new rgn_3("commands.whitelist.add.success", rgv_3.id_class(gameProfile)), true);
            ++n;
        }
        if (n == 0) {
            throw id_byte.create();
        }
        return n;
    }

    private static int id_break(gy_3 gy_32, Collection<GameProfile> collection) throws CommandSyntaxException {
        rCk_1 rCk_12 = gy_32.id_super().x().id_finally();
        int n = 0;
        for (GameProfile gameProfile : collection) {
            if (!rCk_12.id_class(gameProfile)) continue;
            rCW rCW2 = new rCW(gameProfile);
            rCk_12.id_break(rCW2);
            gy_32.id_class(new rgn_3("commands.whitelist.remove.success", rgv_3.id_class(gameProfile)), true);
            ++n;
        }
        if (n == 0) {
            throw id_protected.create();
        }
        gy_32.id_super().id_class(gy_32);
        return n;
    }

    private static int id_break(gy_3 gy_32) throws CommandSyntaxException {
        rCr_1 rCr_12 = gy_32.id_super().x();
        if (rCr_12.id_int()) {
            throw id_class.create();
        }
        rCr_12.id_class(true);
        gy_32.id_class(new rgn_3("commands.whitelist.enabled"), true);
        gy_32.id_super().id_class(gy_32);
        return 1;
    }

    private static int id_protected(gy_3 gy_32) {
        CharSequence[] charSequenceArray = gy_32.id_super().x().id_extends();
        if (charSequenceArray.length == 0) {
            gy_32.id_class(new rgn_3("commands.whitelist.none"), false);
        } else {
            gy_32.id_class(new rgn_3("commands.whitelist.list", charSequenceArray.length, String.join((CharSequence)", ", charSequenceArray)), false);
        }
        return charSequenceArray.length;
    }
}

