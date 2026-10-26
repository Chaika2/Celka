/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.DoubleMath
 *  com.google.common.math.IntMath
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
package celestial;

import celestial.rRR;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rjA_2;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjW_2;
import celestial.rjZ_2;
import celestial.rjc_3;
import celestial.rjd_3;
import celestial.rjk_3;
import celestial.rjl_3;
import celestial.rjm_3;
import celestial.rjn_3;
import celestial.rjp_3;
import celestial.rjv_3;
import celestial.rjy_3;
import celestial.rpB_2;
import celestial.rpG_2;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.ryF_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

public final class rjw_3 {
    private static final rjC_2 id_break = rqR_2.id_class(() -> {
        rjd_3 rjd_32 = new rjd_3(1, 1, 1);
        ((rjp_3)rjd_32).id_class(0, 0, 0, true, true);
        return new rjy_3(rjd_32);
    });
    public static final rjC_2 id_class = rjw_3.id_class(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
    private static final rjC_2 id_byte = new rjl_3((rjp_3)new rjd_3(0, 0, 0), (DoubleList)new DoubleArrayList(new double[]{0.0}), (DoubleList)new DoubleArrayList(new double[]{0.0}), (DoubleList)new DoubleArrayList(new double[]{0.0}));

    public static boolean id_byte(rjC_2 rjC_22, rjC_2 rjC_23, rjN_2 rjN_22) {
        if (rjN_22.apply(false, false)) {
            throw rqR_2.id_byte(new IllegalArgumentException());
        }
        if (rjC_22 == rjC_23) {
            return rjN_22.apply(true, true);
        }
        if (rjC_22.id_break()) {
            return rjN_22.apply(false, !rjC_23.id_break());
        }
        if (rjC_23.id_break()) {
            return rjN_22.apply(!rjC_22.id_break(), false);
        }
        boolean bl = rjN_22.apply(true, false);
        boolean bl2 = rjN_22.apply(false, true);
        for (rpB_2 rpB_22 : ryF_2.AXES) {
            if (rjC_22.id_byte(rpB_22) < rjC_23.id_break(rpB_22) - 1.0E-7) {
                return bl || bl2;
            }
            if (!(rjC_23.id_byte(rpB_22) < rjC_22.id_break(rpB_22) - 1.0E-7)) continue;
            return bl || bl2;
        }
        rjc_3 rjc_32 = rjw_3.id_class(1, rjC_22.id_class(rpB_2.X), rjC_23.id_class(rpB_2.X), bl, bl2);
        rjc_3 rjc_33 = rjw_3.id_class(rjc_32.id_class().size() - 1, rjC_22.id_class(rpB_2.Y), rjC_23.id_class(rpB_2.Y), bl, bl2);
        rjc_3 rjc_34 = rjw_3.id_class((rjc_32.id_class().size() - 1) * (rjc_33.id_class().size() - 1), rjC_22.id_class(rpB_2.Z), rjC_23.id_class(rpB_2.Z), bl, bl2);
        return rjw_3.id_class(rjc_32, rjc_33, rjc_34, rjC_22.id_class, rjC_23.id_class, rjN_22);
    }

    protected static rjc_3 id_class(int n, DoubleList doubleList, DoubleList doubleList2, boolean bl, boolean bl2) {
        long l;
        int n2 = doubleList.size() - 1;
        int n3 = doubleList2.size() - 1;
        if (doubleList instanceof rjW_2 && doubleList2 instanceof rjW_2 && (long)n * (l = rjw_3.id_class(n2, n3)) <= 256L) {
            return new rjk_3(n2, n3);
        }
        if (doubleList.getDouble(n2) < doubleList2.getDouble(0) - 1.0E-7) {
            return new rjv_3(doubleList, doubleList2, false);
        }
        if (doubleList2.getDouble(n3) < doubleList.getDouble(0) - 1.0E-7) {
            return new rjv_3(doubleList2, doubleList, true);
        }
        if (n2 == n3 && Objects.equals(doubleList, doubleList2)) {
            if (doubleList instanceof rjA_2) {
                return (rjc_3)doubleList;
            }
            return doubleList2 instanceof rjA_2 ? (rjc_3)doubleList2 : new rjA_2(doubleList);
        }
        return new rjZ_2(doubleList, doubleList2, bl, bl2);
    }

    public static rjC_2 id_class(rjC_2 rjC_22, rpr_3 rpr_32) {
        int n;
        boolean bl;
        if (rjC_22 == rjw_3.id_break()) {
            return rjw_3.id_break();
        }
        rpB_2 rpB_22 = rpr_32.id_final();
        if (rpr_32.id_throws() == rpG_2.POSITIVE) {
            bl = DoubleMath.fuzzyEquals((double)rjC_22.id_byte(rpB_22), (double)1.0, (double)1.0E-7);
            n = rjC_22.id_class.id_byte(rpB_22) - 1;
        } else {
            bl = DoubleMath.fuzzyEquals((double)rjC_22.id_break(rpB_22), (double)0.0, (double)1.0E-7);
            n = 0;
        }
        return !bl ? rjw_3.id_class() : new rjn_3(rjC_22, rpB_22, n);
    }

    public static boolean id_class(rjC_2 rjC_22, rjC_2 rjC_23, rpr_3 rpr_32) {
        if (rjC_22 == rjw_3.id_break() && rjC_23 == rjw_3.id_break()) {
            return true;
        }
        if (rjC_23.id_break()) {
            return false;
        }
        rpB_2 rpB_22 = rpr_32.id_final();
        rpG_2 rpG_22 = rpr_32.id_throws();
        rjC_2 rjC_24 = rpG_22 == rpG_2.POSITIVE ? rjC_22 : rjC_23;
        rjC_2 rjC_25 = rpG_22 == rpG_2.POSITIVE ? rjC_23 : rjC_22;
        rjN_2 rjN_22 = rpG_22 == rpG_2.POSITIVE ? rjN_2.id_throws : rjN_2.id_byte;
        return DoubleMath.fuzzyEquals((double)rjC_24.id_byte(rpB_22), (double)1.0, (double)1.0E-7) && DoubleMath.fuzzyEquals((double)rjC_25.id_break(rpB_22), (double)0.0, (double)1.0E-7) && !rjw_3.id_byte(new rjn_3(rjC_24, rpB_22, rjC_24.id_class.id_byte(rpB_22) - 1), new rjn_3(rjC_25, rpB_22, 0), rjN_22);
    }

    private static int id_class(double d, double d2, double d3) {
        return d > 0.0 ? rfU_2.id_byte(d3 + d) + 1 : rfU_2.id_byte(d2 + d) - 1;
    }

    private static double id_class(rfl_3 rfl_32, rRR rRR2, double d, rjm_3 rjm_32, ryF_2 ryF_22, Stream<rjC_2> stream) {
        if (!(rfl_32.id_break() < 1.0E-6 || rfl_32.id_byte() < 1.0E-6 || rfl_32.id_protected() < 1.0E-6)) {
            if (Math.abs(d) < 1.0E-7) {
                return 0.0;
            }
            ryF_2 ryF_23 = ryF_22.id_class();
            rpB_2 rpB_22 = ryF_23.id_class(rpB_2.X);
            rpB_2 rpB_23 = ryF_23.id_class(rpB_2.Y);
            rpB_2 rpB_24 = ryF_23.id_class(rpB_2.Z);
            rfw_3 rfw_32 = new rfw_3();
            int n = rfU_2.id_byte(rfl_32.id_class(rpB_22) - 1.0E-7) - 1;
            int n2 = rfU_2.id_byte(rfl_32.id_break(rpB_22) + 1.0E-7) + 1;
            int n3 = rfU_2.id_byte(rfl_32.id_class(rpB_23) - 1.0E-7) - 1;
            int n4 = rfU_2.id_byte(rfl_32.id_break(rpB_23) + 1.0E-7) + 1;
            double d2 = rfl_32.id_class(rpB_24) - 1.0E-7;
            double d3 = rfl_32.id_break(rpB_24) + 1.0E-7;
            boolean bl = d > 0.0;
            int n5 = bl ? rfU_2.id_byte(rfl_32.id_break(rpB_24) - 1.0E-7) - 1 : rfU_2.id_byte(rfl_32.id_class(rpB_24) + 1.0E-7) + 1;
            int n6 = rjw_3.id_class(d, d2, d3);
            int n7 = bl ? 1 : -1;
            int n8 = n5;
            while (!(bl ? n8 > n6 : n8 < n6)) {
                for (int i = n; i <= n2; ++i) {
                    for (int j = n3; j <= n4; ++j) {
                        int n9 = 0;
                        if (i == n || i == n2) {
                            ++n9;
                        }
                        if (j == n3 || j == n4) {
                            ++n9;
                        }
                        if (n8 == n5 || n8 == n6) {
                            ++n9;
                        }
                        if (n9 >= 3) continue;
                        rfw_32.id_class(ryF_23, i, j, n8);
                        xc_3 xc_32 = rRR2.id_byte(rfw_32);
                        if (n9 == 1 && !xc_32.id_protected() || n9 == 2 && !xc_32.id_class(xu_3.rc)) continue;
                        d = xc_32.id_break((rRq_1)rRR2, (rfH_2)rfw_32, rjm_32).id_class(rpB_24, rfl_32.id_protected(-rfw_32.b_(), -rfw_32.c_(), -rfw_32.d_()), d);
                        if (Math.abs(d) < 1.0E-7) {
                            return 0.0;
                        }
                        n6 = rjw_3.id_class(d, d2, d3);
                    }
                }
                n8 += n7;
            }
            double[] dArray = new double[]{d};
            stream.forEach(rjC_22 -> {
                dArray[0] = rjC_22.id_class(rpB_24, rfl_32, dArray[0]);
            });
            return dArray[0];
        }
        return d;
    }

    public static double id_class(rpB_2 rpB_22, rfl_3 rfl_32, rRR rRR2, double d, rjm_3 rjm_32, Stream<rjC_2> stream) {
        return rjw_3.id_class(rfl_32, rRR2, d, rjm_32, ryF_2.id_class(rpB_22, rpB_2.Z), stream);
    }

    public static rjC_2 id_class() {
        return id_byte;
    }

    private static int id_class(double d, double d2) {
        if (!(d < -1.0E-7) && !(d2 > 1.0000001)) {
            for (int i = 0; i <= 3; ++i) {
                boolean bl;
                double d3 = d * (double)(1 << i);
                double d4 = d2 * (double)(1 << i);
                boolean bl2 = Math.abs(d3 - Math.floor(d3)) < 1.0E-7;
                boolean bl3 = bl = Math.abs(d4 - Math.floor(d4)) < 1.0E-7;
                if (!bl2 || !bl) continue;
                return i;
            }
            return -1;
        }
        return -1;
    }

    protected static long id_class(int n, int n2) {
        return (long)n * (long)(n2 / IntMath.gcd((int)n, (int)n2));
    }

    public static rjC_2 id_class(rjC_2 rjC_22, rjC_2 rjC_23, rjN_2 rjN_22) {
        return rjw_3.id_break(rjC_22, rjC_23, rjN_22).id_byte();
    }

    public static rjC_2 id_class(rjC_2 rjC_22, rjC_2 ... rjC_2Array) {
        return Arrays.stream(rjC_2Array).reduce(rjC_22, rjw_3::id_class);
    }

    public static rjC_2 id_class(rjC_2 rjC_22, rjC_2 rjC_23) {
        return rjw_3.id_class(rjC_22, rjC_23, rjN_2.id_package);
    }

    public static double id_class(rpB_2 rpB_22, rfl_3 rfl_32, Stream<rjC_2> stream, double d) {
        Iterator iterator = stream.iterator();
        while (iterator.hasNext()) {
            if (Math.abs(d) < 1.0E-7) {
                return 0.0;
            }
            d = ((rjC_2)iterator.next()).id_class(rpB_22, rfl_32, d);
        }
        return d;
    }

    public static rjC_2 id_class(rfl_3 rfl_32) {
        int n = rjw_3.id_class(rfl_32.id_class, rfl_32.id_protected);
        int n2 = rjw_3.id_class(rfl_32.id_break, rfl_32.id_throws);
        int n3 = rjw_3.id_class(rfl_32.id_byte, rfl_32.id_case);
        if (n >= 0 && n2 >= 0 && n3 >= 0) {
            if (n == 0 && n2 == 0 && n3 == 0) {
                return rfl_32.id_throws(0.5, 0.5, 0.5) ? rjw_3.id_break() : rjw_3.id_class();
            }
            int n4 = 1 << n;
            int n5 = 1 << n2;
            int n6 = 1 << n3;
            int n7 = (int)Math.round(rfl_32.id_class * (double)n4);
            int n8 = (int)Math.round(rfl_32.id_protected * (double)n4);
            int n9 = (int)Math.round(rfl_32.id_break * (double)n5);
            int n10 = (int)Math.round(rfl_32.id_throws * (double)n5);
            int n11 = (int)Math.round(rfl_32.id_byte * (double)n6);
            int n12 = (int)Math.round(rfl_32.id_case * (double)n6);
            rjd_3 rjd_32 = new rjd_3(n4, n5, n6, n7, n9, n11, n8, n10, n12);
            for (long i = (long)n7; i < (long)n8; ++i) {
                for (long j = (long)n9; j < (long)n10; ++j) {
                    for (long k = (long)n11; k < (long)n12; ++k) {
                        rjd_32.id_class((int)i, (int)j, (int)k, false, true);
                    }
                }
            }
            return new rjy_3(rjd_32);
        }
        return new rjl_3(rjw_3.id_break.id_class, new double[]{rfl_32.id_class, rfl_32.id_protected}, new double[]{rfl_32.id_break, rfl_32.id_throws}, new double[]{rfl_32.id_byte, rfl_32.id_case});
    }

    public static rjC_2 id_class(double d, double d2, double d3, double d4, double d5, double d6) {
        return rjw_3.id_class(new rfl_3(d, d2, d3, d4, d5, d6));
    }

    private static boolean id_class(rjc_3 rjc_32, rjc_3 rjc_33, rjc_3 rjc_34, rjp_3 rjp_32, rjp_3 rjp_33, rjN_2 rjN_22) {
        return !rjc_32.id_class((n, n2, n5) -> rjc_33.id_class((n3, n4, n8) -> rjc_34.id_class((n5, n6, n7) -> !rjN_22.apply(rjp_32.id_byte(n, n3, n5), rjp_33.id_byte(n2, n4, n6)))));
    }

    public static rjC_2 id_break() {
        return id_break;
    }

    public static rjC_2 id_break(rjC_2 rjC_22, rjC_2 rjC_23, rjN_2 rjN_22) {
        if (rjN_22.apply(false, false)) {
            throw rqR_2.id_byte(new IllegalArgumentException());
        }
        if (rjC_22 == rjC_23) {
            return rjN_22.apply(true, true) ? rjC_22 : rjw_3.id_class();
        }
        boolean bl = rjN_22.apply(true, false);
        boolean bl2 = rjN_22.apply(false, true);
        if (rjC_22.id_break()) {
            return bl2 ? rjC_23 : rjw_3.id_class();
        }
        if (rjC_23.id_break()) {
            return bl ? rjC_22 : rjw_3.id_class();
        }
        rjc_3 rjc_32 = rjw_3.id_class(1, rjC_22.id_class(rpB_2.X), rjC_23.id_class(rpB_2.X), bl, bl2);
        rjc_3 rjc_33 = rjw_3.id_class(rjc_32.id_class().size() - 1, rjC_22.id_class(rpB_2.Y), rjC_23.id_class(rpB_2.Y), bl, bl2);
        rjc_3 rjc_34 = rjw_3.id_class((rjc_32.id_class().size() - 1) * (rjc_33.id_class().size() - 1), rjC_22.id_class(rpB_2.Z), rjC_23.id_class(rpB_2.Z), bl, bl2);
        rjd_3 rjd_32 = rjd_3.id_class(rjC_22.id_class, rjC_23.id_class, rjc_32, rjc_33, rjc_34, rjN_22);
        return rjc_32 instanceof rjk_3 && rjc_33 instanceof rjk_3 && rjc_34 instanceof rjk_3 ? new rjy_3(rjd_32) : new rjl_3((rjp_3)rjd_32, rjc_32.id_class(), rjc_33.id_class(), rjc_34.id_class());
    }

    public static boolean id_break(rjC_2 rjC_22, rjC_2 rjC_23) {
        if (rjC_22 != rjw_3.id_break() && rjC_23 != rjw_3.id_break()) {
            if (rjC_22.id_break() && rjC_23.id_break()) {
                return false;
            }
            return !rjw_3.id_byte(rjw_3.id_break(), rjw_3.id_break(rjC_22, rjC_23, rjN_2.id_package), rjN_2.id_throws);
        }
        return true;
    }

    public static boolean id_break(rjC_2 rjC_22, rjC_2 rjC_23, rpr_3 rpr_32) {
        if (rjC_22 != rjw_3.id_break() && rjC_23 != rjw_3.id_break()) {
            rjC_2 rjC_24;
            rpB_2 rpB_22 = rpr_32.id_final();
            rpG_2 rpG_22 = rpr_32.id_throws();
            rjC_2 rjC_25 = rpG_22 == rpG_2.POSITIVE ? rjC_22 : rjC_23;
            rjC_2 rjC_26 = rjC_24 = rpG_22 == rpG_2.POSITIVE ? rjC_23 : rjC_22;
            if (!DoubleMath.fuzzyEquals((double)rjC_25.id_byte(rpB_22), (double)1.0, (double)1.0E-7)) {
                rjC_25 = rjw_3.id_class();
            }
            if (!DoubleMath.fuzzyEquals((double)rjC_24.id_break(rpB_22), (double)0.0, (double)1.0E-7)) {
                rjC_24 = rjw_3.id_class();
            }
            return !rjw_3.id_byte(rjw_3.id_break(), rjw_3.id_break((rjC_2)new rjn_3(rjC_25, rpB_22, rjC_25.id_class.id_byte(rpB_22) - 1), (rjC_2)new rjn_3(rjC_24, rpB_22, 0), rjN_2.id_package), rjN_2.id_throws);
        }
        return true;
    }
}

