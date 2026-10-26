/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDk_1;
import celestial.rUV;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.roC_2;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;

public class rDG
extends rDk_1<rUV> {
    private final float[] id_volatile = new float[1024];

    public rDG(Codec<rUV> codec) {
        super(codec, 256);
    }

    @Override
    protected boolean id_class(double d, double d2, double d3, int n) {
        return (d * d + d3 * d3) * (double)this.id_volatile[n - 1] + d2 * d2 / 6.0 >= 1.0;
    }

    private void id_class(roC_2 roC_22, Function<rfH_2, rYG> function, long l, int n, int n2, int n3, double d, double d2, double d3, float f, float f2, float f3, int n4, int n5, double d4, BitSet bitSet) {
        Random random = new Random(l);
        float f4 = 1.0f;
        for (int i = 0; i < 256; ++i) {
            if (i == 0 || random.nextInt(3) == 0) {
                f4 = 1.0f + random.nextFloat() * random.nextFloat();
            }
            this.id_volatile[i] = f4 * f4;
        }
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = n4; i < n5; ++i) {
            double d5 = 1.5 + (double)(rfU_2.id_class((float)i * (float)Math.PI / (float)n5) * f);
            double d6 = d5 * d4;
            d5 *= (double)random.nextFloat() * 0.25 + 0.75;
            d6 *= (double)random.nextFloat() * 0.25 + 0.75;
            float f7 = rfU_2.id_break(f3);
            float f8 = rfU_2.id_class(f3);
            d += (double)(rfU_2.id_break(f2) * f7);
            d2 += (double)f8;
            d3 += (double)(rfU_2.id_class(f2) * f7);
            f3 *= 0.7f;
            f3 += f6 * 0.05f;
            f2 += f5 * 0.05f;
            f6 *= 0.8f;
            f5 *= 0.5f;
            f6 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (random.nextInt(4) == 0) continue;
            if (!this.id_class(n2, n3, d, d3, i, n5, f)) {
                return;
            }
            this.id_class(roC_22, function, l, n, n2, n3, d, d2, d3, d5, d6, bitSet);
        }
    }

    @Override
    public boolean id_class(roC_2 roC_22, Function<rfH_2, rYG> function, Random random, int n, int n2, int n3, int n4, int n5, BitSet bitSet, rUV rUV2) {
        int n6 = (this.id_protected() * 2 - 1) * 16;
        double d = n2 * 16 + random.nextInt(16);
        double d2 = random.nextInt(random.nextInt(40) + 8) + 20;
        double d3 = n3 * 16 + random.nextInt(16);
        float f = random.nextFloat() * ((float)Math.PI * 2);
        float f2 = (random.nextFloat() - 0.5f) * 2.0f / 8.0f;
        double d4 = 3.0;
        float f3 = (random.nextFloat() * 2.0f + random.nextFloat()) * 2.0f;
        int n7 = n6 - random.nextInt(n6 / 4);
        boolean bl = false;
        this.id_class(roC_22, function, random.nextLong(), n, n4, n5, d, d2, d3, f3, f, f2, 0, n7, 3.0, bitSet);
        return true;
    }

    @Override
    public boolean id_class(Random random, int n, int n2, rUV rUV2) {
        return random.nextFloat() <= rUV2.id_break;
    }
}

