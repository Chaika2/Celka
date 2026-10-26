/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.du_3;
import celestial.rKY;
import celestial.rKo_1;
import celestial.rRg_1;
import celestial.rfH_2;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rKD
extends rKY {
    public static final Codec<rKD> id_break;
    public static final rKD id_byte;

    static {
        id_byte = new rKD();
        id_break = Codec.unit(() -> id_byte);
    }

    @Override
    protected rKo_1<?> id_class() {
        return rKo_1.id_break;
    }

    @Override
    public void id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, Random random) {
        ((du_3)xc_32.id_break()).id_class(rRg_12, rfH_22, 2);
    }
}

