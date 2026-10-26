/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.math.NumberUtils
 */
package celestial;

import celestial.rja_3;
import celestial.rqR_2;
import celestial.rrWD;
import java.util.Random;
import java.util.UUID;
import java.util.function.IntPredicate;
import org.apache.commons.lang3.math.NumberUtils;

public class rfU_2 {
    public static final float id_class;
    public static final float id_break;
    public static final float id_byte;
    public static final float id_protected;
    private static final float id_extends;
    public static final float id_throws;
    public static final float id_case = (float)Math.PI / 180;
    public static final float id_catch = (float)Math.PI / 180;
    public static final double id_private = 1.5707963267948966;
    public static final double id_implements = 57.2957763671875;
    private static final float[] id_native;
    public static boolean id_finally;
    private static final float[] id_volatile;
    private static final Random id_final;
    private static final int[] id_package;
    private static final double id_int;
    private static final double[] id_new;
    private static final double[] id_continue;

    public static int id_byte(int n, int n2) {
        int n3;
        if (n2 == 0) {
            return 0;
        }
        if (n == 0) {
            return n2;
        }
        if (n < 0) {
            n2 *= -1;
        }
        return (n3 = n % n2) == 0 ? n : n + n2 - n3;
    }

    public static double id_byte(double d, double d2) {
        return (d % d2 + d2) % d2;
    }

    public static int id_byte(double d) {
        int n = (int)d;
        return d < (double)n ? n - 1 : n;
    }

    public static float id_byte(float f, float f2, float f3) {
        f3 = rfU_2.id_throws(f3);
        return f < f2 ? rfU_2.id_class(f + f3, f, f2) : rfU_2.id_class(f - f3, f2, f);
    }

    public static float id_byte(float f, float f2) {
        return rfU_2.id_catch(f2 - f);
    }

    public static int id_byte(int n) {
        int n2 = n - 1;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return n2 + 1;
    }

    public static double id_byte(double d, double d2, double d3) {
        return (d - d2) / (d3 - d2);
    }

    public static long id_byte(int n, int n2, int n3) {
        long l = (long)n * 3129871L ^ (long)n3 * 116129781L ^ (long)n2;
        l = l * l * 42317861L + l * 11L;
        return l >> 16;
    }

    public static float id_byte(float f) {
        return (float)Math.sqrt(f);
    }

    static {
        int n;
        id_class = rfU_2.id_byte(2.0f);
        id_break = rrWD.id_class(Math.PI);
        id_byte = rrWD.id_class(Math.PI * 2);
        id_protected = rrWD.id_class(1.5707963267948966);
        id_extends = rrWD.id_class(651.8986469044033);
        id_throws = rrWD.id_class(Math.PI / 180);
        id_native = new float[4096];
        id_finally = false;
        id_volatile = rqR_2.id_class(new float[65536], fArray -> {
            for (int i = 0; i < ((float[])fArray).length; ++i) {
                fArray[i] = (float)Math.sin((double)i * Math.PI * 2.0 / 65536.0);
            }
        });
        id_final = new Random();
        id_package = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
        id_int = Double.longBitsToDouble(4805340802404319232L);
        id_new = new double[257];
        id_continue = new double[257];
        for (n = 0; n < 257; ++n) {
            double d = (double)n / 256.0;
            double d2 = Math.asin(d);
            rfU_2.id_continue[n] = Math.cos(d2);
            rfU_2.id_new[n] = d2;
        }
        for (n = 0; n < id_native.length; ++n) {
            rfU_2.id_native[n] = rrWD.id_class(Math.sin((double)n * Math.PI * 2.0 / 4096.0));
        }
    }

    public static UUID id_class(Random random) {
        long l = random.nextLong() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
        long l2 = random.nextLong() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
        return new UUID(l, l2);
    }

    public static UUID id_class() {
        return rfU_2.id_class(id_final);
    }

    public static float id_class(float f) {
        return id_finally ? id_native[(int)(f * id_extends) & 0xFFF] : id_volatile[(int)(f * 10430.378f) & 0xFFFF];
    }

    public static boolean id_class(float f, float f2) {
        return Math.abs(f2 - f) < 1.0E-5f;
    }

    public static double id_class(long[] lArray) {
        long l = 0L;
        for (long l2 : lArray) {
            l += l2;
        }
        return (double)l / (double)lArray.length;
    }

    public static double id_class(Random random, double d, double d2) {
        return d >= d2 ? d : random.nextDouble() * (d2 - d) + d;
    }

    public static int id_class(String string, int n) {
        return NumberUtils.toInt((String)string, (int)n);
    }

    public static double id_class(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        return rfU_2.id_protected(d3, rfU_2.id_class(d, d2, d4, d5, d6, d7), rfU_2.id_class(d, d2, d8, d9, d10, d11));
    }

    public static double id_class(double d, double d2, double d3, double d4, double d5, double d6) {
        return rfU_2.id_protected(d2, rfU_2.id_protected(d, d3, d4), rfU_2.id_protected(d, d5, d6));
    }

    public static long id_class(rja_3 rja_32) {
        return rfU_2.id_byte(rja_32.b_(), rja_32.c_(), rja_32.d_());
    }

    public static int id_class(int n) {
        return Math.abs(n);
    }

    public static double id_class(double d, double d2, double d3) {
        if (d < d2) {
            return d2;
        }
        return d > d3 ? d3 : d;
    }

    public static float id_class(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static long id_class(long l, long l2, long l3) {
        if (l < l2) {
            return l2;
        }
        return l > l3 ? l3 : l;
    }

    public static int id_class(int n, int n2, int n3) {
        if (n < n2) {
            return n2;
        }
        return n > n3 ? n3 : n;
    }

    public static int id_class(int n, int n2, IntPredicate intPredicate) {
        int n3 = n2 - n;
        while (n3 > 0) {
            int n4 = n3 / 2;
            int n5 = n + n4;
            if (intPredicate.test(n5)) {
                n3 = n4;
                continue;
            }
            n = n5 + 1;
            n3 -= n4 + 1;
        }
        return n;
    }

    public static float id_class(double d) {
        return (float)Math.sqrt(d);
    }

    public static float id_class(Random random, float f, float f2) {
        return f >= f2 ? f : random.nextFloat() * (f2 - f) + f;
    }

    public static int id_class(Random random, int n, int n2) {
        return n >= n2 ? n : random.nextInt(n2 - n + 1) + n;
    }

    public static double id_class(double d, double d2) {
        if (d < 0.0) {
            d = -d;
        }
        if (d2 < 0.0) {
            d2 = -d2;
        }
        return d > d2 ? d : d2;
    }

    public static double id_class(double d, double d2, float f) {
        return d2 + (d - d2) * (double)f;
    }

    public static int id_class(int n, int n2) {
        return Math.floorDiv(n, n2);
    }

    public static int id_break(double d) {
        return (int)(d + 1024.0) - 1024;
    }

    public static float id_break(float f) {
        return id_finally ? id_native[(int)(f * id_extends + 1024.0f) & 0xFFF] : id_volatile[(int)(f * 10430.378f + 16384.0f) & 0xFFFF];
    }

    public static int id_break(int n, int n2, int n3) {
        int n4 = (n << 8) + n2;
        return (n4 << 8) + n3;
    }

    public static int id_break(int n) {
        int n2 = n % 360;
        if (n2 >= 180) {
            n2 -= 360;
        }
        if (n2 < -180) {
            n2 += 360;
        }
        return n2;
    }

    public static float id_break(float f, float f2, float f3) {
        float f4 = rfU_2.id_byte(f, f2);
        float f5 = rfU_2.id_class(f4, -f3, f3);
        return f2 - f5;
    }

    public static boolean id_break(double d, double d2) {
        return Math.abs(d2 - d) < (double)1.0E-5f;
    }

    public static double id_break(double d, double d2, double d3) {
        if (d3 < 0.0) {
            return d;
        }
        return d3 > 1.0 ? d2 : rfU_2.id_protected(d3, d, d2);
    }

    public static int id_break(int n, int n2) {
        return Math.floorMod(n, n2);
    }

    public static float id_break(float f, float f2) {
        return (f % f2 + f2) % f2;
    }

    public static float id_throws(float f, float f2) {
        return (Math.abs(f % f2 - f2 * 0.5f) - f2 * 0.25f) / (f2 * 0.25f);
    }

    public static int id_throws(double d) {
        int n = (int)d;
        return d > (double)n ? n + 1 : n;
    }

    public static int id_throws(int n) {
        n = rfU_2.id_protected(n) ? n : rfU_2.id_byte(n);
        return id_package[(int)((long)n * 125613361L >> 27) & 0x1F];
    }

    public static int id_throws(float f, float f2, float f3) {
        return rfU_2.id_break(rfU_2.id_protected(f * 255.0f), rfU_2.id_protected(f2 * 255.0f), rfU_2.id_protected(f3 * 255.0f));
    }

    public static float id_throws(float f) {
        return Math.abs(f);
    }

    public static float id_finally(float f) {
        int n = Float.floatToIntBits(f);
        n = 1419967116 - n / 3;
        float f2 = Float.intBitsToFloat(n);
        f2 = 0.6666667f * f2 + 1.0f / (3.0f * f2 * f2 * f);
        return 0.6666667f * f2 + 1.0f / (3.0f * f2 * f2 * f);
    }

    public static int id_finally(double d) {
        if (d == 0.0) {
            return 0;
        }
        return d > 0.0 ? 1 : -1;
    }

    public static int id_catch(int n) {
        n ^= n >>> 16;
        n *= -2048144789;
        n ^= n >>> 13;
        return (n *= -1028477387) ^ n >>> 16;
    }

    public static float id_catch(float f, float f2, float f3) {
        return f2 + f * (f3 - f2);
    }

    public static double id_catch(double d) {
        return d - (double)rfU_2.id_protected(d);
    }

    public static float id_catch(float f) {
        float f2 = f % 360.0f;
        if (f2 >= 180.0f) {
            f2 -= 360.0f;
        }
        if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        return f2;
    }

    @Deprecated
    public static float id_extends(double d) {
        while (d >= 180.0) {
            d -= 360.0;
        }
        while (d < -180.0) {
            d += 360.0;
        }
        return (float)d;
    }

    public static float id_extends(float f) {
        return f * f;
    }

    public static int id_case(float f, float f2, float f3) {
        float f4;
        float f5;
        int n = (int)(f * 6.0f) % 6;
        float f6 = f * 6.0f - (float)n;
        float f7 = f3 * (1.0f - f2);
        float f8 = f3 * (1.0f - f6 * f2);
        float f9 = f3 * (1.0f - (1.0f - f6) * f2);
        float f10 = switch (n) {
            case 0 -> {
                f5 = f3;
                f4 = f9;
                yield f7;
            }
            case 1 -> {
                f5 = f8;
                f4 = f3;
                yield f7;
            }
            case 2 -> {
                f5 = f7;
                f4 = f3;
                yield f9;
            }
            case 3 -> {
                f5 = f7;
                f4 = f8;
                yield f3;
            }
            case 4 -> {
                f5 = f9;
                f4 = f7;
                yield f3;
            }
            case 5 -> {
                f5 = f3;
                f4 = f7;
                yield f8;
            }
            default -> throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + f + ", " + f2 + ", " + f3);
        };
        int n2 = rfU_2.id_class((int)(f5 * 255.0f), 0, 255);
        int n3 = rfU_2.id_class((int)(f4 * 255.0f), 0, 255);
        int n4 = rfU_2.id_class((int)(f10 * 255.0f), 0, 255);
        return n2 << 16 | n3 << 8 | n4;
    }

    public static int id_case(float f) {
        int n = (int)f;
        return f > (float)n ? n + 1 : n;
    }

    public static int id_case(int n) {
        return rfU_2.id_throws(n) - (rfU_2.id_protected(n) ? 0 : 1);
    }

    public static double id_case(double d) {
        double d2 = d % 360.0;
        if (d2 >= 180.0) {
            d2 -= 360.0;
        }
        if (d2 < -180.0) {
            d2 += 360.0;
        }
        return d2;
    }

    public static double id_implements(double d) {
        return d * d * d * (d * (d * 6.0 - 15.0) + 10.0);
    }

    @Deprecated
    public static float id_implements(float f, float f2, float f3) {
        float f4;
        for (f4 = f2 - f; f4 < -180.0f; f4 += 360.0f) {
        }
        while (f4 >= 180.0f) {
            f4 -= 360.0f;
        }
        return f + f3 * f4;
    }

    public static float id_implements(float f) {
        float f2 = 0.5f * f;
        int n = Float.floatToIntBits(f);
        n = 1597463007 - (n >> 1);
        f = Float.intBitsToFloat(n);
        return f * (1.5f - f2 * f * f);
    }

    public static int id_protected(float f) {
        int n = (int)f;
        return f < (float)n ? n - 1 : n;
    }

    public static long id_protected(double d) {
        long l = (long)d;
        return d < (double)l ? l - 1L : l;
    }

    public static float id_protected(float f, float f2) {
        return rfU_2.id_throws(rfU_2.id_byte(f, f2));
    }

    public static boolean id_protected(int n) {
        return n != 0 && (n & n - 1) == 0;
    }

    public static double id_protected(double d, double d2) {
        double d3;
        boolean bl;
        boolean bl2;
        boolean bl3;
        double d4 = d2 * d2 + d * d;
        if (Double.isNaN(d4)) {
            return Double.NaN;
        }
        boolean bl4 = bl3 = d < 0.0;
        if (bl3) {
            d = -d;
        }
        boolean bl5 = bl2 = d2 < 0.0;
        if (bl2) {
            d2 = -d2;
        }
        boolean bl6 = bl = d > d2;
        if (bl) {
            d3 = d2;
            d2 = d;
            d = d3;
        }
        d3 = rfU_2.id_private(d4);
        d2 *= d3;
        double d5 = id_int + (d *= d3);
        int n = (int)Double.doubleToRawLongBits(d5);
        double d6 = id_new[n];
        double d7 = id_continue[n];
        double d8 = d5 - id_int;
        double d9 = d * d7 - d2 * d8;
        double d10 = (6.0 + d9 * d9) * d9 * 0.16666666666666666;
        double d11 = d6 + d10;
        if (bl) {
            d11 = 1.5707963267948966 - d11;
        }
        if (bl2) {
            d11 = Math.PI - d11;
        }
        if (bl3) {
            d11 = -d11;
        }
        return d11;
    }

    public static float id_protected(float f, float f2, float f3) {
        float f4 = rfU_2.id_byte(f, f2);
        return rfU_2.id_byte(f, f + f4, f3);
    }

    public static double id_protected(double d, double d2, double d3) {
        return d2 + d * (d3 - d2);
    }

    public static double id_private(double d) {
        double d2 = 0.5 * d;
        long l = Double.doubleToRawLongBits(d);
        l = 6910469410427058090L - (l >> 1);
        d = Double.longBitsToDouble(l);
        return d * (1.5 - d2 * d * d);
    }

    public static float id_private(float f) {
        return f - (float)rfU_2.id_protected(f);
    }

    public static float id_private(float f, float f2, float f3) {
        return f2 + f * rfU_2.id_catch(f3 - f2);
    }
}

