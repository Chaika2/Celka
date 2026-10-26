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
import celestial.rrsE_2;
import celestial.rrsG_2;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rrSo_1
extends rrsE_2<rrsG_2> {
    public rrSo_1(Codec<rrsG_2> codec) {
        super(codec);
    }

    protected void id_class(Random random, roC_2 roC_22, rYG rYG2, int n, int n2, int n3, double d, xc_3 xc_32, xc_3 xc_33, xc_3 xc_34, xc_3 xc_35, xc_3 xc_36, int n4) {
        xc_3 xc_37 = xc_34;
        xc_3 xc_38 = xc_35;
        rfw_3 rfw_32 = new rfw_3();
        int n5 = -1;
        int n6 = (int)(d / 3.0 + 3.0 + random.nextDouble() * 0.25);
        int n7 = n & 0xF;
        int n8 = n2 & 0xF;
        for (int i = n3; i >= 0; --i) {
            rfw_32.id_class(n7, i, n8);
            xc_3 xc_39 = roC_22.id_byte(rfw_32);
            if (xc_39.id_catch()) {
                n5 = -1;
                continue;
            }
            if (!xc_39.id_class(xc_32.id_break())) continue;
            if (n5 == -1) {
                if (n6 <= 0) {
                    xc_37 = xu_3.id_class.id_continue();
                    xc_38 = xc_32;
                } else if (i >= n4 - 4 && i <= n4 + 1) {
                    xc_37 = xc_34;
                    xc_38 = xc_35;
                }
                if (i < n4 && (xc_37 == null || xc_37.id_catch())) {
                    xc_37 = rYG2.id_class(rfw_32.id_class(n, i, n2)) < 0.15f ? xu_3.PT.id_continue() : xc_33;
                    rfw_32.id_class(n7, i, n8);
                }
                n5 = n6;
                if (i >= n4 - 1) {
                    roC_22.id_class(rfw_32, xc_37, false);
                    continue;
                }
                if (i < n4 - 7 - n6) {
                    xc_37 = xu_3.id_class.id_continue();
                    xc_38 = xc_32;
                    roC_22.id_class(rfw_32, xc_36, false);
                    continue;
                }
                roC_22.id_class(rfw_32, xc_38, false);
                continue;
            }
            if (n5 <= 0) continue;
            roC_22.id_class(rfw_32, xc_38, false);
            if (--n5 != 0 || !xc_38.id_class(xu_3.id_throw) || n6 <= 1) continue;
            n5 = random.nextInt(4) + Math.max(0, i - 63);
            xc_38 = xc_38.id_class(xu_3.id_interface) ? xu_3.GI.id_continue() : xu_3.F.id_continue();
        }
    }

    @Override
    public void id_class(Random random, roC_2 roC_22, rYG rYG2, int n, int n2, int n3, double d, xc_3 xc_32, xc_3 xc_33, int n4, long l, rrsG_2 rrsG_22) {
        this.id_class(random, roC_22, rYG2, n, n2, n3, d, xc_32, xc_33, rrsG_22.id_class(), rrsG_22.id_break(), rrsG_22.id_byte(), n4);
    }
}

