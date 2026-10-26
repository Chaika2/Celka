/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rDv_1;
import celestial.rKH;
import celestial.rUX;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfi_3;
import celestial.rrPR;
import celestial.rrPY;
import celestial.rrPo_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPD
extends rrPR {
    public static final Codec<rrPD> id_class = RecordCodecBuilder.create(instance -> rrPD.id_break(instance).and((App)rUX.id_class(0, 16, 8).fieldOf("crown_height").forGetter(rrPD2 -> rrPD2.id_break)).apply((Applicative)instance, rrPD::new));
    private final rUX id_break;

    public rrPD(rUX rUX2, rUX rUX3, rUX rUX4) {
        super(rUX2, rUX3);
        this.id_break = rUX4;
    }

    @Override
    protected boolean id_class(Random random, int n, int n2, int n3, int n4, boolean bl) {
        if (n + n3 >= 7) {
            return true;
        }
        return n * n + n3 * n3 > n4 * n4;
    }

    @Override
    protected rrPo_1<?> id_class() {
        return rrPo_1.id_private;
    }

    @Override
    public int id_class(Random random, int n, rDv_1 rDv_12) {
        return this.id_break.id_class(random);
    }

    @Override
    protected void id_class(rKH rKH2, Random random, rDv_1 rDv_12, int n, rrPY rrPY2, int n2, int n3, Set<rfH_2> set, int n4, rfi_3 rfi_32) {
        rfH_2 rfH_22 = rrPY2.id_class();
        int n5 = 0;
        for (int i = rfH_22.c_() - n2 + n4; i <= rfH_22.c_() + n4; ++i) {
            int n6 = rfH_22.c_() - i;
            int n7 = n3 + rrPY2.id_break() + rfU_2.id_protected((float)n6 / (float)n2 * 3.5f);
            int n8 = n6 > 0 && n7 == n5 && (i & 1) == 0 ? n7 + 1 : n7;
            this.id_class(rKH2, random, rDv_12, new rfH_2(rfH_22.b_(), i, rfH_22.d_()), n8, set, 0, rrPY2.id_byte(), rfi_32);
            n5 = n7;
        }
    }
}

