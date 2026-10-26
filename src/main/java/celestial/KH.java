/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.KI;
import celestial.Kl_1;
import celestial.Kp_1;
import celestial.RM;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rfH_2;
import celestial.ryO_2;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public class KH
implements Kp_1 {
    public final /* synthetic */ String id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public KH(String string) {
        this.id_class = string;
    }

    @Override
    public KI id_class(CommandContext<gy_3> commandContext) throws CommandSyntaxException {
        rfH_2 rfH_22 = RM.id_class(commandContext, this.id_class + "Pos");
        ryO_2 ryO_22 = ((gy_3)commandContext.getSource()).id_final().id_class(rfH_22);
        if (ryO_22 == null) {
            throw Kl_1.id_break.create();
        }
        return new Kl_1(ryO_22, rfH_22);
    }

    @Override
    public ArgumentBuilder<gy_3, ?> id_class(ArgumentBuilder<gy_3, ?> argumentBuilder, Function<ArgumentBuilder<gy_3, ?>, ArgumentBuilder<gy_3, ?>> function) {
        return argumentBuilder.then(gp_3.id_class("block").then(function.apply((ArgumentBuilder<gy_3, ?>)gp_3.id_class(this.id_class + "Pos", RM.id_class()))));
    }
}

