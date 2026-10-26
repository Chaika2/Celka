/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rVL;
import celestial.rrPS;
import celestial.rrPc_1;
import celestial.rrPs_1;
import celestial.rrPz_1;
import com.mojang.serialization.Codec;

public interface rrPX<P extends rrPc_1> {
    public static final rrPX<rrPS> id_class = rrPX.id_class("always_true", rrPS.id_class);
    public static final rrPX<rrPz_1> id_break = rrPX.id_class("linear_pos", rrPz_1.id_class);
    public static final rrPX<rrPs_1> id_byte = rrPX.id_class("axis_aligned_linear_pos", rrPs_1.id_class);

    public static <P extends rrPc_1> rrPX<P> id_class(String string, Codec<P> codec) {
        return rVL.id_class(rVL.E, string, () -> codec);
    }

    public Codec<P> codec();
}

