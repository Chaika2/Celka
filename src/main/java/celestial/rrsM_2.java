/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKt_1;
import celestial.rYG;
import celestial.rfw_3;
import celestial.roC_2;
import celestial.rpr_3;
import celestial.rqm_3;
import celestial.rrsE_2;
import celestial.rrsG_2;
import celestial.xc_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public abstract class rrsM_2
extends rrsE_2<rrsG_2> {
    private long id_class;
    private ImmutableMap<xc_3, rKt_1> id_break = ImmutableMap.of();
    private ImmutableMap<xc_3, rKt_1> id_byte = ImmutableMap.of();
    private rKt_1 id_protected;

    protected abstract xc_3 id_byte();

    public rrsM_2(Codec<rrsG_2> codec) {
        super(codec);
    }

    protected abstract ImmutableList<xc_3> id_class();

    @Override
    public void id_class(Random random, roC_2 roC_22, rYG rYG2, int n, int n2, int n3, double d, xc_3 xc_32, xc_3 xc_33, int n4, long l, rrsG_2 rrsG_22) {
        int n5 = n4 + 1;
        int n6 = n & 0xF;
        int n7 = n2 & 0xF;
        int n8 = (int)(d / 3.0 + 3.0 + random.nextDouble() * 0.25);
        int n9 = (int)(d / 3.0 + 3.0 + random.nextDouble() * 0.25);
        double d2 = 0.03125;
        boolean bl = this.id_protected.id_class((double)n * 0.03125, 109.0, (double)n2 * 0.03125) * 75.0 + random.nextDouble() > 0.0;
        xc_3 xc_34 = (xc_3)this.id_byte.entrySet().stream().max(Comparator.comparing(entry -> ((rKt_1)entry.getValue()).id_class(n, n4, n2))).get().getKey();
        xc_3 xc_35 = (xc_3)this.id_break.entrySet().stream().max(Comparator.comparing(entry -> ((rKt_1)entry.getValue()).id_class(n, n4, n2))).get().getKey();
        rfw_3 rfw_32 = new rfw_3();
        xc_3 xc_36 = roC_22.id_byte(rfw_32.id_class(n6, 128, n7));
        for (int i = 127; i >= 0; --i) {
            int n10;
            rfw_32.id_class(n6, i, n7);
            xc_3 xc_37 = roC_22.id_byte(rfw_32);
            if (xc_36.id_class(xc_32.id_break()) && (xc_37.id_catch() || xc_37 == xc_33)) {
                for (n10 = 0; n10 < n8; ++n10) {
                    rfw_32.id_class(rpr_3.UP);
                    if (!roC_22.id_byte(rfw_32).id_class(xc_32.id_break())) break;
                    roC_22.id_class(rfw_32, xc_34, false);
                }
                rfw_32.id_class(n6, i, n7);
            }
            if ((xc_36.id_catch() || xc_36 == xc_33) && xc_37.id_class(xc_32.id_break())) {
                for (n10 = 0; n10 < n9 && roC_22.id_byte(rfw_32).id_class(xc_32.id_break()); ++n10) {
                    if (bl && i >= n5 - 4 && i <= n5 + 1) {
                        roC_22.id_class(rfw_32, this.id_byte(), false);
                    } else {
                        roC_22.id_class(rfw_32, xc_35, false);
                    }
                    rfw_32.id_class(rpr_3.DOWN);
                }
            }
            xc_36 = xc_37;
        }
    }

    private static ImmutableMap<xc_3, rKt_1> id_class(ImmutableList<xc_3> immutableList, long l) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        for (xc_3 xc_32 : immutableList) {
            builder.put((Object)xc_32, (Object)new rKt_1(new rqm_3(l), (List<Integer>)ImmutableList.of((Object)-4)));
            ++l;
        }
        return builder.build();
    }

    @Override
    public void id_class(long l) {
        if (this.id_class != l || this.id_protected == null || this.id_break.isEmpty() || this.id_byte.isEmpty()) {
            this.id_break = rrsM_2.id_class(this.id_class(), l);
            this.id_byte = rrsM_2.id_class(this.id_break(), l + (long)this.id_break.size());
            this.id_protected = new rKt_1(new rqm_3(l + (long)this.id_break.size() + (long)this.id_byte.size()), (List<Integer>)ImmutableList.of((Object)0));
        }
        this.id_class = l;
    }

    protected abstract ImmutableList<xc_3> id_break();
}

