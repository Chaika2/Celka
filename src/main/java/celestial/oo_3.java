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

import celestial.RZ;
import celestial.Yc_1;
import celestial.Yw_1;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rLx_1;
import celestial.rVL;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rjU_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class oo_3 {
    private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("commands.particle.failed"));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("particle").requires(gy_32 -> gy_32.id_class(2))).then(((RequiredArgumentBuilder)gp_3.id_class("name", Yc_1.id_class()).executes(commandContext -> oo_3.id_class((gy_3)commandContext.getSource(), Yc_1.id_class((CommandContext<gy_3>)commandContext, "name"), ((gy_3)commandContext.getSource()).id_volatile(), rjU_2.id_class, 0.0f, 0, false, ((gy_3)commandContext.getSource()).id_super().x().id_super()))).then(((RequiredArgumentBuilder)gp_3.id_class("pos", Yw_1.id_class()).executes(commandContext -> oo_3.id_class((gy_3)commandContext.getSource(), Yc_1.id_class((CommandContext<gy_3>)commandContext, "name"), Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos"), rjU_2.id_class, 0.0f, 0, false, ((gy_3)commandContext.getSource()).id_super().x().id_super()))).then(gp_3.id_class("delta", Yw_1.id_class(false)).then(gp_3.id_class("speed", FloatArgumentType.floatArg((float)0.0f)).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("count", IntegerArgumentType.integer((int)0)).executes(commandContext -> oo_3.id_class((gy_3)commandContext.getSource(), Yc_1.id_class((CommandContext<gy_3>)commandContext, "name"), Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos"), Yw_1.id_class((CommandContext<gy_3>)commandContext, "delta"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), false, ((gy_3)commandContext.getSource()).id_super().x().id_super()))).then(((LiteralArgumentBuilder)gp_3.id_class("force").executes(commandContext -> oo_3.id_class((gy_3)commandContext.getSource(), Yc_1.id_class((CommandContext<gy_3>)commandContext, "name"), Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos"), Yw_1.id_class((CommandContext<gy_3>)commandContext, "delta"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), true, ((gy_3)commandContext.getSource()).id_super().x().id_super()))).then(gp_3.id_class("viewers", RZ.id_protected()).executes(commandContext -> oo_3.id_class((gy_3)commandContext.getSource(), Yc_1.id_class((CommandContext<gy_3>)commandContext, "name"), Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos"), Yw_1.id_class((CommandContext<gy_3>)commandContext, "delta"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), true, RZ.id_case((CommandContext<gy_3>)commandContext, "viewers")))))).then(((LiteralArgumentBuilder)gp_3.id_class("normal").executes(commandContext -> oo_3.id_class((gy_3)commandContext.getSource(), Yc_1.id_class((CommandContext<gy_3>)commandContext, "name"), Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos"), Yw_1.id_class((CommandContext<gy_3>)commandContext, "delta"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), false, ((gy_3)commandContext.getSource()).id_super().x().id_super()))).then(gp_3.id_class("viewers", RZ.id_protected()).executes(commandContext -> oo_3.id_class((gy_3)commandContext.getSource(), Yc_1.id_class((CommandContext<gy_3>)commandContext, "name"), Yw_1.id_class((CommandContext<gy_3>)commandContext, "pos"), Yw_1.id_class((CommandContext<gy_3>)commandContext, "delta"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), false, RZ.id_case((CommandContext<gy_3>)commandContext, "viewers")))))))))));
    }

    private static int id_class(gy_3 gy_32, rLx_1 rLx_12, rjU_2 rjU_22, rjU_2 rjU_23, float f, int n, boolean bl, Collection<rhN_2> collection) throws CommandSyntaxException {
        int n2 = 0;
        for (rhN_2 rhN_22 : collection) {
            if (!gy_32.id_final().id_class(rhN_22, rLx_12, bl, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, n, rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected, f)) continue;
            ++n2;
        }
        if (n2 == 0) {
            throw id_class.create();
        }
        gy_32.id_class(new rgn_3("commands.particle.success", rVL.id_switch.id_break(rLx_12.id_protected()).toString()), true);
        return n2;
    }
}

