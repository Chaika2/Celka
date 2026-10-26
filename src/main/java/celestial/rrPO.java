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

public class rrPO
extends rrPL {
    public static final Codec<rrPO> id_class = xc_3.id_break.fieldOf("block_state").xmap(rrPO::new, rrPO2 -> rrPO2.id_break).codec();
    private final xc_3 id_break;

    public rrPO(xc_3 xc_32) {
        this.id_break = xc_32;
    }

    @Override
    public boolean id_class(xc_3 xc_32, Random random) {
        return xc_32 == this.id_break;
    }

    @Override
    protected rrPJ<?> id_class() {
        return rrPJ.id_byte;
    }
}

