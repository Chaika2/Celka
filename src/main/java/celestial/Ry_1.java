/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.RH;
import celestial.Rq_1;
import celestial.gt_3;
import celestial.gy_3;
import celestial.rlb_3;
import celestial.rqO_2;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;

public class Ry_1
implements Rq_1 {
    public final /* synthetic */ rqO_2 id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public Ry_1(RH rH, rqO_2 rqO_22) {
        this.id_class = rqO_22;
    }

    @Override
    public Collection<gt_3> id_class(CommandContext<gy_3> commandContext) throws CommandSyntaxException {
        rlb_3<gt_3> rlb_32 = RH.id_break(commandContext, this.id_class);
        return rlb_32.id_class();
    }

    @Override
    public Pair<rqO_2, Either<gt_3, rlb_3<gt_3>>> id_break(CommandContext<gy_3> commandContext) throws CommandSyntaxException {
        return Pair.of((Object)this.id_class, (Object)Either.right(RH.id_break(commandContext, this.id_class)));
    }
}

