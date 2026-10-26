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
import celestial.rfi_3;
import celestial.rrPR;
import celestial.rrPY;
import celestial.rrPo_1;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPI
extends rrPR {
    public static final Codec<rrPI> id_class = RecordCodecBuilder.create(instance -> rrPI.id_break(instance).apply((Applicative)instance, rrPI::new));

    public rrPI(rUX rUX2, rUX rUX3) {
        super(rUX2, rUX3);
    }

    @Override
    public int id_class(Random random, int n, rDv_1 rDv_12) {
        return 0;
    }

    @Override
    protected boolean id_class(Random random, int n, int n2, int n3, int n4, boolean bl) {
        if (n2 == 0) {
            return (n > 1 || n3 > 1) && n != 0 && n3 != 0;
        }
        return n == n4 && n3 == n4 && n4 > 0;
    }

    @Override
    protected rrPo_1<?> id_class() {
        return rrPo_1.id_protected;
    }

    @Override
    protected void id_class(rKH rKH2, Random random, rDv_1 rDv_12, int n, rrPY rrPY2, int n2, int n3, Set<rfH_2> set, int n4, rfi_3 rfi_32) {
        boolean bl = rrPY2.id_byte();
        rfH_2 rfH_22 = rrPY2.id_class().id_break(n4);
        this.id_class(rKH2, random, rDv_12, rfH_22, n3 + rrPY2.id_break(), set, -1 - n2, bl, rfi_32);
        this.id_class(rKH2, random, rDv_12, rfH_22, n3 - 1, set, -n2, bl, rfi_32);
        this.id_class(rKH2, random, rDv_12, rfH_22, n3 + rrPY2.id_break() - 1, set, 0, bl, rfi_32);
    }
}

