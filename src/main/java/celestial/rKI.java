/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import java.util.Random;

public class rKI {
    protected static final int[][] id_class = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}, {1, 1, 0}, {0, -1, 1}, {-1, 1, 0}, {0, -1, -1}};
    private static final double id_throws = Math.sqrt(3.0);
    private static final double id_case = 0.5 * (id_throws - 1.0);
    private static final double id_catch = (3.0 - id_throws) / 6.0;
    private final int[] id_private = new int[512];
    public final double id_break;
    public final double id_byte;
    public final double id_protected;

    public rKI(Random random) {
        this.id_break = random.nextDouble() * 256.0;
        this.id_byte = random.nextDouble() * 256.0;
        this.id_protected = random.nextDouble() * 256.0;
        int n = 0;
        while (n < 256) {
            this.id_private[n] = n++;
        }
        for (n = 0; n < 256; ++n) {
            int n2 = random.nextInt(256 - n);
            int n3 = this.id_private[n];
            this.id_private[n] = this.id_private[n2 + n];
            this.id_private[n2 + n] = n3;
        }
    }

    private double id_class(int n, double d, double d2, double d3, double d4) {
        double d5;
        double d6 = d4 - d * d - d2 * d2 - d3 * d3;
        if (d6 < 0.0) {
            d5 = 0.0;
        } else {
            d6 *= d6;
            d5 = d6 * d6 * rKI.id_class(id_class[n], d, d2, d3);
        }
        return d5;
    }

    public double id_class(double d, double d2, double d3) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        double d4 = 0.3333333333333333;
        double d5 = (d + d2 + d3) * 0.3333333333333333;
        int n7 = rfU_2.id_byte(d + d5);
        int n8 = rfU_2.id_byte(d2 + d5);
        int n9 = rfU_2.id_byte(d3 + d5);
        double d6 = 0.16666666666666666;
        double d7 = (double)(n7 + n8 + n9) * 0.16666666666666666;
        double d8 = (double)n7 - d7;
        double d9 = (double)n8 - d7;
        double d10 = (double)n9 - d7;
        double d11 = d - d8;
        double d12 = d2 - d9;
        double d13 = d3 - d10;
        if (d11 >= d12) {
            if (d12 >= d13) {
                n6 = 1;
                n5 = 0;
                n4 = 0;
                n3 = 1;
                n2 = 1;
                n = 0;
            } else if (d11 >= d13) {
                n6 = 1;
                n5 = 0;
                n4 = 0;
                n3 = 1;
                n2 = 0;
                n = 1;
            } else {
                n6 = 0;
                n5 = 0;
                n4 = 1;
                n3 = 1;
                n2 = 0;
                n = 1;
            }
        } else if (d12 < d13) {
            n6 = 0;
            n5 = 0;
            n4 = 1;
            n3 = 0;
            n2 = 1;
            n = 1;
        } else if (d11 < d13) {
            n6 = 0;
            n5 = 1;
            n4 = 0;
            n3 = 0;
            n2 = 1;
            n = 1;
        } else {
            n6 = 0;
            n5 = 1;
            n4 = 0;
            n3 = 1;
            n2 = 1;
            n = 0;
        }
        double d14 = d11 - (double)n6 + 0.16666666666666666;
        double d15 = d12 - (double)n5 + 0.16666666666666666;
        double d16 = d13 - (double)n4 + 0.16666666666666666;
        double d17 = d11 - (double)n3 + 0.3333333333333333;
        double d18 = d12 - (double)n2 + 0.3333333333333333;
        double d19 = d13 - (double)n + 0.3333333333333333;
        double d20 = d11 - 1.0 + 0.5;
        double d21 = d12 - 1.0 + 0.5;
        double d22 = d13 - 1.0 + 0.5;
        int n10 = n7 & 0xFF;
        int n11 = n8 & 0xFF;
        int n12 = n9 & 0xFF;
        int n13 = this.id_class(n10 + this.id_class(n11 + this.id_class(n12))) % 12;
        int n14 = this.id_class(n10 + n6 + this.id_class(n11 + n5 + this.id_class(n12 + n4))) % 12;
        int n15 = this.id_class(n10 + n3 + this.id_class(n11 + n2 + this.id_class(n12 + n))) % 12;
        int n16 = this.id_class(n10 + 1 + this.id_class(n11 + 1 + this.id_class(n12 + 1))) % 12;
        double d23 = this.id_class(n13, d11, d12, d13, 0.6);
        double d24 = this.id_class(n14, d14, d15, d16, 0.6);
        double d25 = this.id_class(n15, d17, d18, d19, 0.6);
        double d26 = this.id_class(n16, d20, d21, d22, 0.6);
        return 32.0 * (d23 + d24 + d25 + d26);
    }

    public double id_class(double d, double d2) {
        int n;
        int n2;
        double d3;
        double d4;
        int n3;
        double d5;
        double d6 = (d + d2) * id_case;
        int n4 = rfU_2.id_byte(d + d6);
        double d7 = (double)n4 - (d5 = (double)(n4 + (n3 = rfU_2.id_byte(d2 + d6))) * id_catch);
        double d8 = d - d7;
        if (d8 > (d4 = d2 - (d3 = (double)n3 - d5))) {
            n2 = 1;
            n = 0;
        } else {
            n2 = 0;
            n = 1;
        }
        double d9 = d8 - (double)n2 + id_catch;
        double d10 = d4 - (double)n + id_catch;
        double d11 = d8 - 1.0 + 2.0 * id_catch;
        double d12 = d4 - 1.0 + 2.0 * id_catch;
        int n5 = n4 & 0xFF;
        int n6 = n3 & 0xFF;
        int n7 = this.id_class(n5 + this.id_class(n6)) % 12;
        int n8 = this.id_class(n5 + n2 + this.id_class(n6 + n)) % 12;
        int n9 = this.id_class(n5 + 1 + this.id_class(n6 + 1)) % 12;
        double d13 = this.id_class(n7, d8, d4, 0.0, 0.5);
        double d14 = this.id_class(n8, d9, d10, 0.0, 0.5);
        double d15 = this.id_class(n9, d11, d12, 0.0, 0.5);
        return 70.0 * (d13 + d14 + d15);
    }

    private int id_class(int n) {
        return this.id_private[n & 0xFF];
    }

    protected static double id_class(int[] nArray, double d, double d2, double d3) {
        return (double)nArray[0] * d + (double)nArray[1] * d2 + (double)nArray[2] * d3;
    }
}

