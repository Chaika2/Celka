/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rrPJ;
import celestial.rrPL;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPB
extends rrPL {
    public static final Codec<rrPB> id_class;
    public static final rrPB id_break;

    private rrPB() {
    }

    static {
        id_break = new rrPB();
        id_class = Codec.unit(() -> id_break);
    }

    @Override
    public boolean id_class(xc_3 xc_32, Random random) {
        return true;
    }

    @Override
    protected rrPJ<?> id_class() {
        return rrPJ.id_class;
    }
}

