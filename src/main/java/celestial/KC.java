/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.Yt_1;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rfU_2;
import celestial.rgn_3;
import celestial.rjK_2;
import celestial.roE_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;

public class KC {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.worldborder.center.failed"));
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.worldborder.set.failed.nochange"));
    private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("commands.worldborder.set.failed.small."));
    private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType((Message)new rgn_3("commands.worldborder.set.failed.big."));
    private static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType((Message)new rgn_3("commands.worldborder.warning.time.failed"));
    private static final SimpleCommandExceptionType id_case = new SimpleCommandExceptionType((Message)new rgn_3("commands.worldborder.warning.distance.failed"));
    private static final SimpleCommandExceptionType id_catch = new SimpleCommandExceptionType((Message)new rgn_3("commands.worldborder.damage.buffer.failed"));
    private static final SimpleCommandExceptionType id_private = new SimpleCommandExceptionType((Message)new rgn_3("commands.worldborder.damage.amount.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("worldborder").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("add").then(((RequiredArgumentBuilder)gp_3.id_class("distance", FloatArgumentType.floatArg((float)-6.0E7f, (float)6.0E7f)).executes(commandContext -> KC.id_class((gy_3)commandContext.getSource(), ((gy_3)commandContext.getSource()).id_final().id_instanceof().id_implements() + (double)FloatArgumentType.getFloat((CommandContext)commandContext, (String)"distance"), 0L))).then(gp_3.id_class("time", IntegerArgumentType.integer((int)0)).executes(commandContext -> KC.id_class((gy_3)commandContext.getSource(), ((gy_3)commandContext.getSource()).id_final().id_instanceof().id_implements() + (double)FloatArgumentType.getFloat((CommandContext)commandContext, (String)"distance"), ((gy_3)commandContext.getSource()).id_final().id_instanceof().id_finally() + (long)IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time") * 1000L)))))).then(gp_3.id_class("set").then(((RequiredArgumentBuilder)gp_3.id_class("distance", FloatArgumentType.floatArg((float)-6.0E7f, (float)6.0E7f)).executes(commandContext -> KC.id_class((gy_3)commandContext.getSource(), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"distance"), 0L))).then(gp_3.id_class("time", IntegerArgumentType.integer((int)0)).executes(commandContext -> KC.id_class((gy_3)commandContext.getSource(), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"distance"), (long)IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time") * 1000L)))))).then(gp_3.id_class("center").then(gp_3.id_class("pos", Yt_1.id_class()).executes(commandContext -> KC.id_class((gy_3)commandContext.getSource(), Yt_1.id_class((CommandContext<gy_3>)commandContext, "pos")))))).then(((LiteralArgumentBuilder)gp_3.id_class("damage").then(gp_3.id_class("amount").then(gp_3.id_class("damagePerBlock", FloatArgumentType.floatArg((float)0.0f)).executes(commandContext -> KC.id_break((gy_3)commandContext.getSource(), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"damagePerBlock")))))).then(gp_3.id_class("buffer").then(gp_3.id_class("distance", FloatArgumentType.floatArg((float)0.0f)).executes(commandContext -> KC.id_class((gy_3)commandContext.getSource(), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"distance"))))))).then(gp_3.id_class("get").executes(commandContext -> KC.id_class((gy_3)commandContext.getSource())))).then(((LiteralArgumentBuilder)gp_3.id_class("warning").then(gp_3.id_class("distance").then(gp_3.id_class("distance", IntegerArgumentType.integer((int)0)).executes(commandContext -> KC.id_break((gy_3)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"distance")))))).then(gp_3.id_class("time").then(gp_3.id_class("time", IntegerArgumentType.integer((int)0)).executes(commandContext -> KC.id_class((gy_3)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time")))))));
    }

    private static int id_class(gy_3 gy_32, double d, long l) throws CommandSyntaxException {
        roE_2 roE_22 = gy_32.id_final().id_instanceof();
        double d2 = roE_22.id_implements();
        if (d2 == d) {
            throw id_break.create();
        }
        if (d < 1.0) {
            throw id_byte.create();
        }
        if (d > 6.0E7) {
            throw id_protected.create();
        }
        if (l > 0L) {
            roE_22.id_class(d2, d, l);
            if (d > d2) {
                gy_32.id_class(new rgn_3("commands.worldborder.set.grow", String.format(Locale.ROOT, "%.1f", d), Long.toString(l / 1000L)), true);
            } else {
                gy_32.id_class(new rgn_3("commands.worldborder.set.shrink", String.format(Locale.ROOT, "%.1f", d), Long.toString(l / 1000L)), true);
            }
        } else {
            roE_22.id_class(d);
            gy_32.id_class(new rgn_3("commands.worldborder.set.immediate", String.format(Locale.ROOT, "%.1f", d)), true);
        }
        return (int)(d - d2);
    }

    private static int id_class(gy_3 gy_32, float f) throws CommandSyntaxException {
        roE_2 roE_22 = gy_32.id_final().id_instanceof();
        if (roE_22.id_final() == (double)f) {
            throw id_catch.create();
        }
        roE_22.id_break(f);
        gy_32.id_class(new rgn_3("commands.worldborder.damage.buffer.success", String.format(Locale.ROOT, "%.2f", Float.valueOf(f))), true);
        return (int)f;
    }

    private static int id_class(gy_3 gy_32, rjK_2 rjK_22) throws CommandSyntaxException {
        roE_2 roE_22 = gy_32.id_final().id_instanceof();
        if (roE_22.id_class() == (double)rjK_22.id_byte && roE_22.id_break() == (double)rjK_22.id_protected) {
            throw id_class.create();
        }
        roE_22.id_break(rjK_22.id_byte, rjK_22.id_protected);
        gy_32.id_class(new rgn_3("commands.worldborder.center.success", String.format(Locale.ROOT, "%.2f", Float.valueOf(rjK_22.id_byte)), String.format("%.2f", Float.valueOf(rjK_22.id_protected))), true);
        return 0;
    }

    private static int id_class(gy_3 gy_32, int n) throws CommandSyntaxException {
        roE_2 roE_22 = gy_32.id_final().id_instanceof();
        if (roE_22.id_new() == n) {
            throw id_throws.create();
        }
        roE_22.id_break(n);
        gy_32.id_class(new rgn_3("commands.worldborder.warning.time.success", n), true);
        return n;
    }

    private static int id_class(gy_3 gy_32) {
        double d = gy_32.id_final().id_instanceof().id_implements();
        gy_32.id_class(new rgn_3("commands.worldborder.get", String.format(Locale.ROOT, "%.0f", d)), false);
        return rfU_2.id_byte(d + 0.5);
    }

    private static int id_break(gy_3 gy_32, float f) throws CommandSyntaxException {
        roE_2 roE_22 = gy_32.id_final().id_instanceof();
        if (roE_22.id_package() == (double)f) {
            throw id_private.create();
        }
        roE_22.id_byte(f);
        gy_32.id_class(new rgn_3("commands.worldborder.damage.amount.success", String.format(Locale.ROOT, "%.2f", Float.valueOf(f))), true);
        return (int)f;
    }

    private static int id_break(gy_3 gy_32, int n) throws CommandSyntaxException {
        roE_2 roE_22 = gy_32.id_final().id_instanceof();
        if (roE_22.id_continue() == n) {
            throw id_case.create();
        }
        roE_22.id_byte(n);
        gy_32.id_class(new rgn_3("commands.worldborder.warning.distance.success", n), true);
        return n;
    }
}

