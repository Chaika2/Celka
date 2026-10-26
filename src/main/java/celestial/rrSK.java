/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rYG;
import celestial.rfw_3;
import celestial.roC_2;
import celestial.rrSV;
import celestial.rrSa_1;
import celestial.rrsG_2;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rrSK
extends rrSV {
    private static final xc_3 id_import = xu_3.sw.id_continue();
    private static final xc_3 id_short = xu_3.sI.id_continue();
    private static final xc_3 id_default = xu_3.Ee.id_continue();

    public rrSK(Codec<rrsG_2> codec) {
        super(codec);
    }

    @Override
    public void id_class(Random random, roC_2 roC_22, rYG rYG2, int n, int n2, int n3, double d, xc_3 xc_32, xc_3 xc_33, int n4, long l, rrsG_2 rrsG_22) {
        double d2 = 0.0;
        double d3 = Math.min(Math.abs(d), this.id_byte.id_class((double)n * 0.25, (double)n2 * 0.25, false) * 15.0);
        if (d3 > 0.0) {
            double d4 = 0.001953125;
            d2 = d3 * d3 * 2.5;
            double d5 = Math.abs(this.id_protected.id_class((double)n * 0.001953125, (double)n2 * 0.001953125, false));
            double d6 = Math.ceil(d5 * 50.0) + 14.0;
            if (d2 > d6) {
                d2 = d6;
            }
            d2 += 64.0;
        }
        int n5 = n & 0xF;
        int n6 = n2 & 0xF;
        xc_3 xc_34 = id_import;
        rrSa_1 rrSa_12 = rYG2.id_throws().id_throws();
        xc_3 xc_35 = rrSa_12.id_break();
        xc_3 xc_36 = rrSa_12.id_class();
        xc_3 xc_37 = xc_35;
        int n7 = (int)(d / 3.0 + 3.0 + random.nextDouble() * 0.25);
        boolean bl = Math.cos(d / 3.0 * Math.PI) > 0.0;
        int n8 = -1;
        boolean bl2 = false;
        rfw_3 rfw_32 = new rfw_3();
        for (int i = Math.max(n3, (int)d2 + 1); i >= 0; --i) {
            xc_3 xc_38;
            rfw_32.id_class(n5, i, n6);
            if (roC_22.id_byte(rfw_32).id_catch() && i < (int)d2) {
                roC_22.id_class(rfw_32, xc_32, false);
            }
            if ((xc_38 = roC_22.id_byte(rfw_32)).id_catch()) {
                n8 = -1;
                continue;
            }
            if (!xc_38.id_class(xc_32.id_break())) continue;
            if (n8 == -1) {
                Object object;
                bl2 = false;
                if (n7 <= 0) {
                    xc_34 = xu_3.id_class.id_continue();
                    xc_37 = xc_32;
                } else if (i >= n4 - 4 && i <= n4 + 1) {
                    xc_34 = id_import;
                    xc_37 = xc_35;
                }
                if (i < n4 && (xc_34 == null || xc_34.id_catch())) {
                    xc_34 = xc_33;
                }
                n8 = n7 + Math.max(0, i - n4);
                if (i >= n4 - 1) {
                    if (i <= n4 + 3 + n7) {
                        roC_22.id_class(rfw_32, xc_36, false);
                        bl2 = true;
                        continue;
                    }
                    object = i >= 64 && i <= 127 ? (bl ? id_default : this.id_class(n, i, n2)) : id_short;
                    roC_22.id_class(rfw_32, (xc_3)object, false);
                    continue;
                }
                roC_22.id_class(rfw_32, xc_37, false);
                object = xc_37.id_break();
                if (object != xu_3.sw && object != xu_3.sI && object != xu_3.sf && object != xu_3.sj && object != xu_3.sV && object != xu_3.sg && object != xu_3.sR && object != xu_3.sY && object != xu_3.so && object != xu_3.sK && object != xu_3.sD && object != xu_3.sU && object != xu_3.se && object != xu_3.sa && object != xu_3.si && object != xu_3.Er) continue;
                roC_22.id_class(rfw_32, id_short, false);
                continue;
            }
            if (n8 <= 0) continue;
            --n8;
            if (bl2) {
                roC_22.id_class(rfw_32, id_short, false);
                continue;
            }
            roC_22.id_class(rfw_32, this.id_class(n, i, n2), false);
        }
    }
}

