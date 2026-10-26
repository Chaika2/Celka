/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rVL;
import celestial.rrPJ;
import celestial.rrPL;
import celestial.xc_3;
import celestial.xd_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPb_1
extends rrPL {
    public static final Codec<rrPb_1> id_class = rVL.id_strictfp.fieldOf("block").xmap(rrPb_1::new, rrPb_12 -> rrPb_12.id_break).codec();
    private final xd_3 id_break;

    public rrPb_1(xd_3 xd_32) {
        this.id_break = xd_32;
    }

    @Override
    public boolean id_class(xc_3 xc_32, Random random) {
        return xc_32.id_class(this.id_break);
    }

    @Override
    protected rrPJ<?> id_class() {
        return rrPJ.id_break;
    }
}

