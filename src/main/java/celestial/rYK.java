/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rKI;
import celestial.rVL;
import celestial.rVn_1;
import celestial.rYG;
import celestial.rYY;
import celestial.rYl_1;
import celestial.rfU_2;
import celestial.rqm_3;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rYK
extends rYY {
    public static final Codec<rYK> id_throws = RecordCodecBuilder.create(instance -> instance.group((App)rVn_1.id_class(rVL.n).forGetter(rYK2 -> rYK2.id_catch), (App)Codec.LONG.fieldOf("seed").stable().forGetter(rYK2 -> rYK2.id_private)).apply((Applicative)instance, instance.stable(rYK::new)));
    private final rKI id_case;
    private final rVL<rYG> id_catch;
    private final long id_private;
    private final rYG id_implements;
    private final rYG id_finally;
    private final rYG id_extends;
    private final rYG id_native;
    private final rYG id_volatile;

    public rYK(rVL<rYG> rVL2, long l) {
        this(rVL2, l, rVL2.id_byte(rYl_1.id_finally), rVL2.id_byte(rYl_1.id_transient), rVL2.id_byte(rYl_1.id_boolean), rVL2.id_byte(rYl_1.id_strictfp), rVL2.id_byte(rYl_1.id_for));
    }

    private rYK(rVL<rYG> rVL2, long l, rYG rYG2, rYG rYG3, rYG rYG4, rYG rYG5, rYG rYG6) {
        super((List<rYG>)ImmutableList.of((Object)rYG2, (Object)rYG3, (Object)rYG4, (Object)rYG5, (Object)rYG6));
        this.id_catch = rVL2;
        this.id_private = l;
        this.id_implements = rYG2;
        this.id_finally = rYG3;
        this.id_extends = rYG4;
        this.id_native = rYG5;
        this.id_volatile = rYG6;
        rqm_3 rqm_32 = new rqm_3(l);
        rqm_32.id_class(17292);
        this.id_case = new rKI(rqm_32);
    }

    public static float id_class(rKI rKI2, int n, int n2) {
        int n3 = n / 2;
        int n4 = n2 / 2;
        int n5 = n % 2;
        int n6 = n2 % 2;
        float f = 100.0f - rfU_2.id_byte((float)(n * n + n2 * n2)) * 8.0f;
        f = rfU_2.id_class(f, -100.0f, 80.0f);
        for (int i = -12; i <= 12; ++i) {
            for (int j = -12; j <= 12; ++j) {
                long l = n3 + i;
                long l2 = n4 + j;
                if (l * l + l2 * l2 <= 4096L || !(rKI2.id_class(l, l2) < (double)-0.9f)) continue;
                float f2 = (rfU_2.id_throws(l) * 3439.0f + rfU_2.id_throws(l2) * 147.0f) % 13.0f + 9.0f;
                float f3 = n5 - i * 2;
                float f4 = n6 - j * 2;
                float f5 = 100.0f - rfU_2.id_byte(f3 * f3 + f4 * f4) * f2;
                f5 = rfU_2.id_class(f5, -100.0f, 80.0f);
                f = Math.max(f, f5);
            }
        }
        return f;
    }

    @Override
    public rYY id_class(long l) {
        return new rYK(this.id_catch, l, this.id_implements, this.id_finally, this.id_extends, this.id_native, this.id_volatile);
    }

    @Override
    protected Codec<? extends rYY> id_class() {
        return id_throws;
    }

    public boolean id_break(long l) {
        return this.id_private == l;
    }

    @Override
    public rYG id_protected(int n, int n2, int n3) {
        int n4 = n >> 2;
        int n5 = n3 >> 2;
        if ((long)n4 * (long)n4 + (long)n5 * (long)n5 <= 4096L) {
            return this.id_implements;
        }
        float f = rYK.id_class(this.id_case, n4 * 2 + 1, n5 * 2 + 1);
        if (f > 40.0f) {
            return this.id_finally;
        }
        if (f >= 0.0f) {
            return this.id_extends;
        }
        return f < -20.0f ? this.id_native : this.id_volatile;
    }
}

