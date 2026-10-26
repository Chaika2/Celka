/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rUv_1;
import celestial.rfH_2;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rUN<U extends rUv_1>
extends rUO<U> {
    public rUN(Codec<U> codec) {
        super(codec);
    }

    public abstract xc_3 id_class(Random var1, rfH_2 var2, U var3);

    public abstract int id_class(U var1);

    public abstract boolean id_class(rRg_1 var1, rfH_2 var2, U var3);

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, U u) {
        xc_3 xc_32 = this.id_class(random, rfH_22, u);
        int n = 0;
        for (int i = 0; i < this.id_class(u); ++i) {
            rfH_2 rfH_23 = this.id_break(random, rfH_22, u);
            if (!rRI2.id_finally(rfH_23) || rfH_23.c_() >= 255 || !xc_32.id_class(rRI2, rfH_23) || !this.id_class(rRI2, rfH_23, u)) continue;
            rRI2.id_class(rfH_23, xc_32, 2);
            ++n;
        }
        return n > 0;
    }

    public abstract rfH_2 id_break(Random var1, rfH_2 var2, U var3);
}

