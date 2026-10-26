/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.QP;
import celestial.rKw_1;
import celestial.rYG;
import celestial.rfw_3;
import celestial.roC_2;
import celestial.rqm_3;
import celestial.rrSa_1;
import celestial.rrsE_2;
import celestial.rrsG_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class rrSD
extends rrsE_2<rrsG_2> {
    protected static final xc_3 id_class = xu_3.Ei.id_continue();
    protected static final xc_3 id_break = xu_3.Pt.id_continue();
    private static final xc_3 id_byte = xu_3.id_class.id_continue();
    private static final xc_3 id_protected = xu_3.id_char.id_continue();
    private static final xc_3 id_throws = xu_3.PT.id_continue();
    private rKw_1 id_import;
    private rKw_1 id_short;
    private long id_default;

    public rrSD(Codec<rrsG_2> codec) {
        super(codec);
    }

    @Override
    public void id_class(Random random, roC_2 roC_22, rYG rYG2, int n, int n2, int n3, double d, xc_3 xc_32, xc_3 xc_33, int n4, long l, rrsG_2 rrsG_22) {
        double d2 = 0.0;
        double d3 = 0.0;
        rfw_3 rfw_32 = new rfw_3();
        float f = rYG2.id_class(rfw_32.id_class(n, 63, n2));
        double d4 = Math.min(Math.abs(d), this.id_import.id_class((double)n * 0.1, (double)n2 * 0.1, false) * 15.0);
        if (d4 > 1.8) {
            double d5 = 0.09765625;
            d2 = d4 * d4 * 1.2;
            double d6 = Math.abs(this.id_short.id_class((double)n * 0.09765625, (double)n2 * 0.09765625, false));
            double d7 = Math.ceil(d6 * 40.0) + 14.0;
            if (d2 > d7) {
                d2 = d7;
            }
            if (f > 0.1f) {
                d2 -= 2.0;
            }
            if (d2 > 2.0) {
                d3 = (double)n4 - d2 - 7.0;
                d2 += (double)n4;
            } else {
                d2 = 0.0;
            }
        }
        int n5 = n & 0xF;
        int n6 = n2 & 0xF;
        rrSa_1 rrSa_12 = rYG2.id_throws().id_throws();
        xc_3 xc_34 = rrSa_12.id_break();
        xc_3 xc_35 = rrSa_12.id_class();
        xc_3 xc_36 = xc_34;
        xc_3 xc_37 = xc_35;
        int n7 = (int)(d / 3.0 + 3.0 + random.nextDouble() * 0.25);
        int n8 = -1;
        int n9 = 0;
        int n10 = 2 + random.nextInt(4);
        int n11 = n4 + 18 + random.nextInt(10);
        for (int i = Math.max(n3, (int)d2 + 1); i >= 0; --i) {
            rfw_32.id_class(n5, i, n6);
            if (roC_22.id_byte(rfw_32).id_catch() && i < (int)d2 && random.nextDouble() > 0.01) {
                roC_22.id_class(rfw_32, id_class, false);
            } else if (roC_22.id_byte(rfw_32).id_byte() == QP.id_finally && i > (int)d3 && i < n4 && d3 != 0.0 && random.nextDouble() > 0.15) {
                roC_22.id_class(rfw_32, id_class, false);
            }
            xc_3 xc_38 = roC_22.id_byte(rfw_32);
            if (xc_38.id_catch()) {
                n8 = -1;
                continue;
            }
            if (!xc_38.id_class(xc_32.id_break())) {
                if (!xc_38.id_class(xu_3.Ei) || n9 > n10 || i <= n11) continue;
                roC_22.id_class(rfw_32, id_break, false);
                ++n9;
                continue;
            }
            if (n8 == -1) {
                if (n7 <= 0) {
                    xc_37 = id_byte;
                    xc_36 = xc_32;
                } else if (i >= n4 - 4 && i <= n4 + 1) {
                    xc_37 = xc_35;
                    xc_36 = xc_34;
                }
                if (i < n4 && (xc_37 == null || xc_37.id_catch())) {
                    xc_37 = rYG2.id_class(rfw_32.id_class(n, i, n2)) < 0.15f ? id_throws : xc_33;
                }
                n8 = n7;
                if (i >= n4 - 1) {
                    roC_22.id_class(rfw_32, xc_37, false);
                    continue;
                }
                if (i < n4 - 7 - n7) {
                    xc_37 = id_byte;
                    xc_36 = xc_32;
                    roC_22.id_class(rfw_32, id_protected, false);
                    continue;
                }
                roC_22.id_class(rfw_32, xc_36, false);
                continue;
            }
            if (n8 <= 0) continue;
            roC_22.id_class(rfw_32, xc_36, false);
            if (--n8 != 0 || !xc_36.id_class(xu_3.id_throw) || n7 <= 1) continue;
            n8 = random.nextInt(4) + Math.max(0, i - 63);
            xc_36 = xc_36.id_class(xu_3.id_interface) ? xu_3.GI.id_continue() : xu_3.F.id_continue();
        }
    }

    @Override
    public void id_class(long l) {
        if (this.id_default != l || this.id_import == null || this.id_short == null) {
            rqm_3 rqm_32 = new rqm_3(l);
            this.id_import = new rKw_1(rqm_32, IntStream.rangeClosed(-3, 0));
            this.id_short = new rKw_1(rqm_32, (List<Integer>)ImmutableList.of((Object)0));
        }
        this.id_default = l;
    }
}

