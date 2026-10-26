/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.RZ;
import celestial.Yl_1;
import celestial.Ym_1;
import celestial.Yw_1;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rfU_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rjU_2;
import celestial.rqL_2;
import celestial.rqO_2;
import celestial.rvI_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Iterator;

public class oK_2 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.playsound.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        RequiredArgumentBuilder requiredArgumentBuilder = gp_3.id_class("sound", Ym_1.id_class()).suggests(Yl_1.id_byte);
        for (rqL_2 rqL_22 : rqL_2.values()) {
            requiredArgumentBuilder.then(oK_2.id_class(rqL_22));
        }
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("playsound").requires(gy_32 -> gy_32.id_class(2))).then((ArgumentBuilder)requiredArgumentBuilder));
    }

    private static LiteralArgumentBuilder<gy_3> id_class(rqL_2 rqL_22) {
        return (LiteralArgumentBuilder)gp_3.id_class(rqL_22.id_class()).then(((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected()).executes(commandContext -> oK_2.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), Ym_1.id_throws((CommandContext<gy_3>)commandContext, "sound"), rqL_22, ((gy_3)commandContext.getSource()).id_volatile(), 1.0f, 1.0f, 0.0f))).then(((RequiredArgumentBuilder)gp_3.id_class("pos", Yw_1.id_class()).executes(commandContext -> oK_2.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), Ym_1.id_throws((CommandContext<gy_3>)commandContext, "sound"), rqL_22, Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos"), 1.0f, 1.0f, 0.0f))).then(((RequiredArgumentBuilder)gp_3.id_class("volume", FloatArgumentType.floatArg((float)0.0f)).executes(commandContext -> oK_2.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), Ym_1.id_throws((CommandContext<gy_3>)commandContext, "sound"), rqL_22, Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos"), ((Float)commandContext.getArgument("volume", Float.class)).floatValue(), 1.0f, 0.0f))).then(((RequiredArgumentBuilder)gp_3.id_class("pitch", FloatArgumentType.floatArg((float)0.0f, (float)2.0f)).executes(commandContext -> oK_2.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), Ym_1.id_throws((CommandContext<gy_3>)commandContext, "sound"), rqL_22, Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos"), ((Float)commandContext.getArgument("volume", Float.class)).floatValue(), ((Float)commandContext.getArgument("pitch", Float.class)).floatValue(), 0.0f))).then(gp_3.id_class("minVolume", FloatArgumentType.floatArg((float)0.0f, (float)1.0f)).executes(commandContext -> oK_2.id_class((gy_3)commandContext.getSource(), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), Ym_1.id_throws((CommandContext<gy_3>)commandContext, "sound"), rqL_22, Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos"), ((Float)commandContext.getArgument("volume", Float.class)).floatValue(), ((Float)commandContext.getArgument("pitch", Float.class)).floatValue(), ((Float)commandContext.getArgument("minVolume", Float.class)).floatValue())))))));
    }

    private static int id_class(gy_3 gy_32, Collection<rhN_2> collection, rqO_2 rqO_22, rqL_2 rqL_22, rjU_2 rjU_22, float f, float f2, float f3) throws CommandSyntaxException {
        double d = Math.pow(f > 1.0f ? (double)(f * 16.0f) : 16.0, 2.0);
        int n = 0;
        Iterator<rhN_2> iterator = collection.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                if (n == 0) {
                    throw id_class.create();
                }
                if (collection.size() == 1) {
                    gy_32.id_class(new rgn_3("commands.playsound.success.single", rqO_22, collection.iterator().next().L_()), true);
                } else {
                    gy_32.id_class(new rgn_3("commands.playsound.success.multiple", rqO_22, collection.size()), true);
                }
                return n;
            }
            rhN_2 rhN_22 = iterator.next();
            double d2 = rjU_22.id_break - rhN_22.rx();
            double d3 = rjU_22.id_byte - rhN_22.re();
            double d4 = rjU_22.id_protected - rhN_22.BO();
            double d5 = d2 * d2 + d3 * d3 + d4 * d4;
            rjU_2 rjU_23 = rjU_22;
            float f4 = f;
            if (d5 > d) {
                if (f3 <= 0.0f) continue;
                double d6 = rfU_2.id_class(d5);
                rjU_23 = new rjU_2(rhN_22.rx() + d2 / d6 * 2.0, rhN_22.re() + d3 / d6 * 2.0, rhN_22.BO() + d4 / d6 * 2.0);
                f4 = f3;
            }
            rhN_22.id_class.id_class(new rvI_2(rqO_22, rqL_22, rjU_23, f4, f2));
            ++n;
        }
    }
}

