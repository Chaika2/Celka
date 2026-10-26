/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.RR;
import celestial.RY;
import celestial.RZ;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rJT;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rsE_2;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class oC_2 {
    private static int id_class(gy_3 gy_32, RY rY, Collection<rhN_2> collection, int n) throws CommandSyntaxException {
        for (rhN_2 rhN_22 : collection) {
            int n2 = n;
            while (n2 > 0) {
                rsE_2 rsE_22;
                int n3 = Math.min(rY.id_class().id_implements(), n2);
                n2 -= n3;
                rdn_3 rdn_32 = rY.id_class(n3, false);
                boolean bl = ((rhz_3)rhN_22.id_implements[1]).id_throws(rdn_32);
                if (bl && rdn_32.id_class()) {
                    rdn_32.id_throws(1);
                    rsE_22 = rhN_22.id_class(rdn_32, false);
                    if (rsE_22 != null) {
                        rsE_22.id_new();
                    }
                    ((rYB)rhN_22.id_throws[7]).id_class((rhd_3)null, rhN_22.rx(), rhN_22.re(), rhN_22.BO(), rqn_3.ER, rqL_2.PLAYERS, 0.2f, ((rhN_22.Sa().nextFloat() - rhN_22.Sa().nextFloat()) * 0.7f + 1.0f) * 2.0f);
                    ((rJT)rhN_22.id_implements[3]).id_native();
                    continue;
                }
                rsE_22 = rhN_22.id_class(rdn_32, false);
                if (rsE_22 == null) continue;
                rsE_22.id_implements();
                rsE_22.id_break(rhN_22.ro());
            }
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.give.success.single", n, rY.id_class(n, false).id_throw(), collection.iterator().next().L_()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.give.success.single", n, rY.id_class(n, false).id_throw(), collection.size()), true);
        }
        return collection.size();
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("give").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("targets", RZ.id_protected()).then(((RequiredArgumentBuilder)gp_3.id_class("item", RR.id_class()).executes(commandContext -> oC_2.id_class((gy_3)commandContext.getSource(), RR.id_class(commandContext, "item"), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), 1))).then(gp_3.id_class("count", IntegerArgumentType.integer((int)1)).executes(commandContext -> oC_2.id_class((gy_3)commandContext.getSource(), RR.id_class(commandContext, "item"), RZ.id_case((CommandContext<gy_3>)commandContext, "targets"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count")))))));
    }
}

