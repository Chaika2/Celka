/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import celestial.rrPY;
import celestial.rrPf_1;
import celestial.rrPo_1;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPg_1
extends rrPf_1 {
    public static final Codec<rrPg_1> id_byte = RecordCodecBuilder.create(instance -> rrPg_1.id_class(instance).apply((Applicative)instance, rrPg_1::new));

    public rrPg_1(rUX rUX2, rUX rUX3, int n) {
        super(rUX2, rUX3, n);
    }

    @Override
    protected void id_class(rKH rKH2, Random random, rDv_1 rDv_12, int n, rrPY rrPY2, int n2, int n3, Set<rfH_2> set, int n4, rfi_3 rfi_32) {
        for (int i = n4; i >= n4 - n2; --i) {
            int n5 = n3 + (i != n4 && i != n4 - n2 ? 1 : 0);
            this.id_class(rKH2, random, rDv_12, rrPY2.id_class(), n5, set, i, rrPY2.id_byte(), rfi_32);
        }
    }

    @Override
    protected rrPo_1<?> id_class() {
        return rrPo_1.id_case;
    }

    @Override
    protected boolean id_class(Random random, int n, int n2, int n3, int n4, boolean bl) {
        return rfU_2.id_extends((float)n + 0.5f) + rfU_2.id_extends((float)n3 + 0.5f) > (float)(n4 * n4);
    }
}

