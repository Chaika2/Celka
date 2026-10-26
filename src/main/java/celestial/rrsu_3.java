/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.WL;
import celestial.rDv_1;
import celestial.rKH;
import celestial.reS_2;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfi_3;
import celestial.rpB_2;
import celestial.rrPY;
import celestial.rrsA_2;
import celestial.rrsN_2;
import celestial.rrsm_3;
import celestial.xc_3;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class rrsu_3
extends rrsN_2 {
    public static final Codec<rrsu_3> id_throws = RecordCodecBuilder.create(instance -> rrsu_3.id_class(instance).apply((Applicative)instance, rrsu_3::new));

    public rrsu_3(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    @Override
    protected rrsA_2<?> id_class() {
        return rrsA_2.id_case;
    }

    private boolean id_class(int n, int n2) {
        return (double)n2 >= (double)n * 0.2;
    }

    private void id_class(rKH rKH2, Random random, int n, rfH_2 rfH_22, List<rrsm_3> list, Set<rfH_2> set, rfi_3 rfi_32, rDv_1 rDv_12) {
        for (rrsm_3 rrsm_32 : list) {
            int n2 = rrsm_32.id_class();
            rfH_2 rfH_23 = new rfH_2(rfH_22.b_(), n2, rfH_22.d_());
            if (rfH_23.equals(rrsm_32.id_class.id_class()) || !this.id_class(n, n2 - rfH_22.c_())) continue;
            this.id_class(rKH2, random, rfH_23, rrsm_32.id_class.id_class(), true, set, rfi_32, rDv_12);
        }
    }

    private rpB_2 id_class(rfH_2 rfH_22, rfH_2 rfH_23) {
        int n;
        rpB_2 rpB_22 = rpB_2.Y;
        int n2 = Math.abs(rfH_23.b_() - rfH_22.b_());
        int n3 = Math.max(n2, n = Math.abs(rfH_23.d_() - rfH_22.d_()));
        if (n3 > 0) {
            rpB_22 = n2 == n3 ? rpB_2.X : rpB_2.Z;
        }
        return rpB_22;
    }

    @Override
    public List<rrPY> id_class(rKH rKH2, Random random, int n, rfH_2 rfH_22, Set<rfH_2> set, rfi_3 rfi_32, rDv_1 rDv_12) {
        int n2;
        int n3 = 5;
        int n4 = n + 2;
        int n5 = rfU_2.id_byte((double)n4 * 0.618);
        if (!rDv_12.id_throws) {
            rrsu_3.id_class(rKH2, rfH_22.id_break());
        }
        double d = 1.0;
        int n6 = Math.min(1, rfU_2.id_byte(1.382 + Math.pow(1.0 * (double)n4 / 13.0, 2.0)));
        int n7 = rfH_22.c_() + n5;
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new rrsm_3(rfH_22.id_break(n2), n7));
        for (n2 = n4 - 5; n2 >= 0; --n2) {
            float f = this.id_break(n4, n2);
            if (f < 0.0f) continue;
            for (int i = 0; i < n6; ++i) {
                rfH_2 rfH_23;
                double d2;
                double d3;
                double d4 = 1.0;
                double d5 = 1.0 * (double)f * ((double)random.nextFloat() + 0.328);
                double d6 = d5 * Math.sin(d3 = (double)(random.nextFloat() * 2.0f) * Math.PI) + 0.5;
                rfH_2 rfH_24 = rfH_22.id_byte(d6, n2 - 1, d2 = d5 * Math.cos(d3) + 0.5);
                if (!this.id_class(rKH2, random, rfH_24, rfH_23 = rfH_24.id_break(5), false, set, rfi_32, rDv_12)) continue;
                int n8 = rfH_22.b_() - rfH_24.b_();
                int n9 = rfH_22.d_() - rfH_24.d_();
                double d7 = (double)rfH_24.c_() - Math.sqrt(n8 * n8 + n9 * n9) * 0.381;
                int n10 = d7 > (double)n7 ? n7 : (int)d7;
                rfH_2 rfH_25 = new rfH_2(rfH_22.b_(), n10, rfH_22.d_());
                if (!this.id_class(rKH2, random, rfH_25, rfH_24, false, set, rfi_32, rDv_12)) continue;
                arrayList.add(new rrsm_3(rfH_24, rfH_25.c_()));
            }
        }
        this.id_class(rKH2, random, rfH_22, rfH_22.id_break(n5), true, set, rfi_32, rDv_12);
        this.id_class(rKH2, random, n4, rfH_22, arrayList, set, rfi_32, rDv_12);
        ArrayList arrayList2 = Lists.newArrayList();
        for (rrsm_3 rrsm_32 : arrayList) {
            if (!this.id_class(n4, rrsm_32.id_class() - rfH_22.c_())) continue;
            arrayList2.add(rrsm_32.id_class);
        }
        return arrayList2;
    }

    private boolean id_class(rKH rKH2, Random random, rfH_2 rfH_22, rfH_2 rfH_23, boolean bl, Set<rfH_2> set, rfi_3 rfi_32, rDv_1 rDv_12) {
        if (!bl && Objects.equals(rfH_22, rfH_23)) {
            return true;
        }
        rfH_2 rfH_24 = rfH_23.id_break(-rfH_22.b_(), -rfH_22.c_(), -rfH_22.d_());
        int n = this.id_class(rfH_24);
        float f = (float)rfH_24.b_() / (float)n;
        float f2 = (float)rfH_24.c_() / (float)n;
        float f3 = (float)rfH_24.d_() / (float)n;
        for (int i = 0; i <= n; ++i) {
            rfH_2 rfH_25 = rfH_22.id_byte(0.5f + (float)i * f, 0.5f + (float)i * f2, 0.5f + (float)i * f3);
            if (bl) {
                rrsu_3.id_class(rKH2, rfH_25, (xc_3)rDv_12.id_break.id_class(random, rfH_25).id_class(WL.id_new, this.id_class(rfH_22, rfH_25)), rfi_32);
                set.add(rfH_25.id_int());
                continue;
            }
            if (reS_2.id_byte(rKH2, rfH_25)) continue;
            return false;
        }
        return true;
    }

    private int id_class(rfH_2 rfH_22) {
        int n = rfU_2.id_class(rfH_22.b_());
        int n2 = rfU_2.id_class(rfH_22.c_());
        int n3 = rfU_2.id_class(rfH_22.d_());
        return Math.max(n, Math.max(n2, n3));
    }

    private float id_break(int n, int n2) {
        if ((float)n2 < (float)n * 0.3f) {
            return -1.0f;
        }
        float f = (float)n / 2.0f;
        float f2 = f - (float)n2;
        float f3 = rfU_2.id_byte(f * f - f2 * f2);
        if (f2 == 0.0f) {
            f3 = f;
        } else if (Math.abs(f2) >= f) {
            return 0.0f;
        }
        return f3 * 0.5f;
    }
}

