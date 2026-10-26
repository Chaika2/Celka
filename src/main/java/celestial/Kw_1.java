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
import celestial.Kp_1;
import celestial.Kt_1;
import celestial.RZ;
import celestial.gp_3;
import celestial.gy_3;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public class Kw_1
implements Kp_1 {
    public final /* synthetic */ String id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public Kw_1(String string) {
        this.id_class = string;
    }

    @Override
    public KI id_class(CommandContext<gy_3> commandContext) throws CommandSyntaxException {
        return new Kt_1(RZ.id_class(commandContext, this.id_class));
    }

    @Override
    public ArgumentBuilder<gy_3, ?> id_class(ArgumentBuilder<gy_3, ?> argumentBuilder, Function<ArgumentBuilder<gy_3, ?>, ArgumentBuilder<gy_3, ?>> function) {
        return argumentBuilder.then(gp_3.id_class("entity").then(function.apply((ArgumentBuilder<gy_3, ?>)gp_3.id_class(this.id_class, RZ.id_class()))));
    }
}

