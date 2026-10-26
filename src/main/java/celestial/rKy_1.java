/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKI;
import celestial.rfU_2;
import java.util.Random;

public final class rKy_1 {
    private final byte[] id_protected;
    public final double id_class;
    public final double id_break;
    public final double id_byte;

    public rKy_1(Random random) {
        int n;
        this.id_class = random.nextDouble() * 256.0;
        this.id_break = random.nextDouble() * 256.0;
        this.id_byte = random.nextDouble() * 256.0;
        this.id_protected = new byte[256];
        for (n = 0; n < 256; ++n) {
            this.id_protected[n] = (byte)n;
        }
        for (n = 0; n < 256; ++n) {
            int n2 = random.nextInt(256 - n);
            byte by = this.id_protected[n];
            this.id_protected[n] = this.id_protected[n + n2];
            this.id_protected[n + n2] = by;
        }
    }

    public double id_class(int n, int n2, int n3, double d, double d2, double d3, double d4, double d5, double d6) {
        int n4 = this.id_class(n) + n2;
        int n5 = this.id_class(n4) + n3;
        int n6 = this.id_class(n4 + 1) + n3;
        int n7 = this.id_class(n + 1) + n2;
        int n8 = this.id_class(n7) + n3;
        int n9 = this.id_class(n7 + 1) + n3;
        double d7 = rKy_1.id_class(this.id_class(n5), d, d2, d3);
        double d8 = rKy_1.id_class(this.id_class(n8), d - 1.0, d2, d3);
        double d9 = rKy_1.id_class(this.id_class(n6), d, d2 - 1.0, d3);
        double d10 = rKy_1.id_class(this.id_class(n9), d - 1.0, d2 - 1.0, d3);
        double d11 = rKy_1.id_class(this.id_class(n5 + 1), d, d2, d3 - 1.0);
        double d12 = rKy_1.id_class(this.id_class(n8 + 1), d - 1.0, d2, d3 - 1.0);
        double d13 = rKy_1.id_class(this.id_class(n6 + 1), d, d2 - 1.0, d3 - 1.0);
        double d14 = rKy_1.id_class(this.id_class(n9 + 1), d - 1.0, d2 - 1.0, d3 - 1.0);
        return rfU_2.id_class(d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14);
    }

    private int id_class(int n) {
        return this.id_protected[n & 0xFF] & 0xFF;
    }

    private static double id_class(int n, double d, double d2, double d3) {
        int n2 = n & 0xF;
        return rKI.id_class(rKI.id_class[n2], d, d2, d3);
    }

    public double id_class(double d, double d2, double d3, double d4, double d5) {
        double d6;
        double d7 = d + this.id_class;
        double d8 = d2 + this.id_break;
        double d9 = d3 + this.id_byte;
        int n = rfU_2.id_byte(d7);
        int n2 = rfU_2.id_byte(d8);
        int n3 = rfU_2.id_byte(d9);
        double d10 = d7 - (double)n;
        double d11 = d8 - (double)n2;
        double d12 = d9 - (double)n3;
        double d13 = rfU_2.id_implements(d10);
        double d14 = rfU_2.id_implements(d11);
        double d15 = rfU_2.id_implements(d12);
        if (d4 != 0.0) {
            double d16 = Math.min(d5, d11);
            d6 = (double)rfU_2.id_byte(d16 / d4) * d4;
        } else {
            d6 = 0.0;
        }
        return this.id_class(n, n2, n3, d10, d11 - d6, d12, d13, d14, d15);
    }
}

