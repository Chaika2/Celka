/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rRR;
import celestial.rfH_2;
import celestial.rrPA;
import celestial.rrPN;
import celestial.rrPp_1;
import celestial.rrPx_1;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPd_1
extends rrPA {
    public static final Codec<rrPd_1> id_class = Codec.FLOAT.fieldOf("integrity").orElse((Object)Float.valueOf(1.0f)).xmap(rrPd_1::new, rrPd_12 -> Float.valueOf(rrPd_12.id_break)).codec();
    private final float id_break;

    public rrPd_1(float f) {
        this.id_break = f;
    }

    @Override
    public rrPp_1 id_class(rRR rRR2, rfH_2 rfH_22, rfH_2 rfH_23, rrPp_1 rrPp_12, rrPp_1 rrPp_13, rrPN rrPN2) {
        Random random = rrPN2.id_break(rrPp_13.id_class);
        return !(this.id_break >= 1.0f) && !(random.nextFloat() <= this.id_break) ? null : rrPp_13;
    }

    @Override
    protected rrPx_1<?> id_class() {
        return rrPx_1.id_break;
    }
}

