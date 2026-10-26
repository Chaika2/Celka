/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rfH_2;
import celestial.rrPX;
import celestial.rrPc_1;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPS
extends rrPc_1 {
    public static final Codec<rrPS> id_class;
    public static final rrPS id_break;

    private rrPS() {
    }

    static {
        id_break = new rrPS();
        id_class = Codec.unit(() -> id_break);
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, rfH_2 rfH_23, rfH_2 rfH_24, Random random) {
        return true;
    }

    @Override
    protected rrPX<?> id_class() {
        return rrPX.id_class;
    }
}

