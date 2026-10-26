/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.reA_2;
import celestial.red_3;
import celestial.rem_3;
import celestial.rfi_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrPG;
import celestial.rrPN;
import celestial.rrPl_1;
import celestial.rrPn_1;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;

public class reF_2
extends reA_2 {
    public static final Codec<reF_2> id_class = RecordCodecBuilder.create(instance -> instance.group(reF_2.id_catch(), reF_2.id_case(), reF_2.id_break()).apply((Applicative)instance, reF_2::new));

    protected reF_2(Either<rqO_2, rrPl_1> either, Supplier<rrPn_1> supplier, rem_3 rem_32) {
        super(either, supplier, rem_32);
    }

    @Override
    public String toString() {
        return "LegacySingle[" + this.id_protected + "]";
    }

    @Override
    public red_3<?> id_class() {
        return red_3.id_throws;
    }

    @Override
    protected rrPN id_class(rqd_3 rqd_32, rfi_3 rfi_32, boolean bl) {
        rrPN rrPN2 = super.id_class(rqd_32, rfi_32, bl);
        rrPN2.id_break(rrPG.id_break);
        rrPN2.id_class(rrPG.id_protected);
        return rrPN2;
    }
}

