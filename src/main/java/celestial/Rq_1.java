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

import celestial.gt_3;
import celestial.gy_3;
import celestial.rlb_3;
import celestial.rqO_2;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;

public interface Rq_1 {
    public Collection<gt_3> id_class(CommandContext<gy_3> var1) throws CommandSyntaxException;

    public Pair<rqO_2, Either<gt_3, rlb_3<gt_3>>> id_break(CommandContext<gy_3> var1) throws CommandSyntaxException;
}

