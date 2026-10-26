/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKt_1;
import celestial.rYG;
import celestial.rfw_3;
import celestial.roC_2;
import celestial.rqm_3;
import celestial.rrsE_2;
import celestial.rrsG_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;

public class rrsr_3
extends rrsE_2<rrsG_2> {
    private static final xc_3 id_break = xu_3.hb.id_continue();
    protected long id_class;
    private rKt_1 id_byte;

    public rrsr_3(Codec<rrsG_2> codec) {
        super(codec);
    }

    @Override
    public void id_class(Random random, roC_2 roC_22, rYG rYG2, int n, int n2, int n3, double d, xc_3 xc_32, xc_3 xc_33, int n4, long l, rrsG_2 rrsG_22) {
        int n5 = n4;
        int n6 = n & 0xF;
        int n7 = n2 & 0xF;
        double d2 = this.id_byte.id_class((double)n * 0.1, n4, (double)n2 * 0.1);
        boolean bl = d2 > 0.15 + random.nextDouble() * 0.35;
        double d3 = this.id_byte.id_class((double)n * 0.1, 109.0, (double)n2 * 0.1);
        boolean bl2 = d3 > 0.25 + random.nextDouble() * 0.9;
        int n8 = (int)(d / 3.0 + 3.0 + random.nextDouble() * 0.25);
        rfw_3 rfw_32 = new rfw_3();
        int n9 = -1;
        xc_3 xc_34 = rrsG_22.id_break();
        for (int i = 127; i >= 0; --i) {
            rfw_32.id_class(n6, i, n7);
            xc_3 xc_35 = rrsG_22.id_class();
            xc_3 xc_36 = roC_22.id_byte(rfw_32);
            if (xc_36.id_catch()) {
                n9 = -1;
                continue;
            }
            if (!xc_36.id_class(xc_32.id_break())) continue;
            if (n9 == -1) {
                boolean bl3 = false;
                if (n8 <= 0) {
                    bl3 = true;
                    xc_34 = rrsG_22.id_break();
                }
                if (bl) {
                    xc_35 = rrsG_22.id_break();
                } else if (bl2) {
                    xc_35 = rrsG_22.id_byte();
                }
                if (i < n5 && bl3) {
                    xc_35 = xc_33;
                }
                n9 = n8;
                if (i >= n5 - 1) {
                    roC_22.id_class(rfw_32, xc_35, false);
                    continue;
                }
                roC_22.id_class(rfw_32, xc_34, false);
                continue;
            }
            if (n9 <= 0) continue;
            --n9;
            roC_22.id_class(rfw_32, xc_34, false);
        }
    }

    @Override
    public void id_class(long l) {
        if (this.id_class != l || this.id_byte == null) {
            this.id_byte = new rKt_1(new rqm_3(l), (List<Integer>)ImmutableList.of((Object)0));
        }
        this.id_class = l;
    }
}

