/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDr_1;
import celestial.rKi_1;
import celestial.rfH_2;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDS
extends rKi_1 {
    public static final Codec<rDS> id_class = xc_3.id_break.fieldOf("state").xmap(rDS::new, rDS2 -> rDS2.id_byte).codec();
    private final xc_3 id_byte;

    public rDS(xc_3 xc_32) {
        this.id_byte = xc_32;
    }

    @Override
    protected rDr_1<?> id_class() {
        return rDr_1.id_class;
    }

    @Override
    public xc_3 id_class(Random random, rfH_2 rfH_22) {
        return this.id_byte;
    }
}

