/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKY;
import celestial.rKo_1;
import celestial.rRg_1;
import celestial.rfH_2;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rKU
extends rKY {
    public static final Codec<rKU> id_break;
    public static final rKU id_byte;

    static {
        id_byte = new rKU();
        id_break = Codec.unit(() -> id_byte);
    }

    @Override
    protected rKo_1<?> id_class() {
        return rKo_1.id_class;
    }

    @Override
    public void id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, Random random) {
        rRg_12.id_class(rfH_22, xc_32, 2);
    }
}

