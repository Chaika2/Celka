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

public class rrPK
extends rrPR {
    public static final Codec<rrPK> id_class = RecordCodecBuilder.create(instance -> rrPK.id_break(instance).and((App)Codec.intRange((int)0, (int)16).fieldOf("height").forGetter(rrPK2 -> rrPK2.id_break)).apply((Applicative)instance, rrPK::new));
    protected final int id_break;

    public rrPK(rUX rUX2, rUX rUX3, int n) {
        super(rUX2, rUX3);
        this.id_break = n;
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
        return rrPo_1.id_catch;
    }

    @Override
    public int id_class(Random random, int n, rDv_1 rDv_12) {
        return this.id_break;
    }

    @Override
    protected void id_class(rKH rKH2, Random random, rDv_1 rDv_12, int n, rrPY rrPY2, int n2, int n3, Set<rfH_2> set, int n4, rfi_3 rfi_32) {
        int n5 = rrPY2.id_byte() ? n2 : 1 + random.nextInt(2);
        for (int i = n4; i >= n4 - n5; --i) {
            int n6 = n3 + rrPY2.id_break() + 1 - i;
            this.id_class(rKH2, random, rDv_12, rrPY2.id_class(), n6, set, i, rrPY2.id_byte(), rfi_32);
        }
    }
}

