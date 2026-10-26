/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.aH_2;
import celestial.rDM;
import celestial.rKT;
import celestial.rKf_1;
import celestial.rKk_1;
import celestial.rKu_1;
import celestial.rKv_1;
import celestial.rKz_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rRj_1;
import celestial.rRq_1;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rYA;
import celestial.rYG;
import celestial.rYY;
import celestial.rYZ;
import celestial.rYf_1;
import celestial.rYv_1;
import celestial.reP_2;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rjh_3;
import celestial.roC_2;
import celestial.rok_3;
import celestial.rqm_3;
import celestial.rrEm_1;
import celestial.rrPt_1;
import celestial.rrSI;
import celestial.rrSf_1;
import celestial.rrSq_1;
import celestial.rrrA;
import celestial.rrrF;
import celestial.rrrH;
import celestial.rrrZ;
import celestial.ruP_2;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class rKd_1 {
    public static final Codec<rKd_1> id_class = rVL.rG.dispatchStable(rKd_1::id_class, Function.identity());
    protected final rYY id_break;
    protected final rYY id_byte;
    private final rrSq_1 id_protected;
    private final long id_throws;
    private final List<rfj_3> id_case = Lists.newArrayList();

    public int id_byte() {
        return 64;
    }

    public int id_byte(int n, int n2, rKv_1 rKv_12) {
        return this.id_class(n, n2, rKv_12) - 1;
    }

    public rKd_1(rYY rYY2, rrSq_1 rrSq_12) {
        this(rYY2, rYY2, rrSq_12, 0L);
    }

    public rKd_1(rYY rYY2, rYY rYY3, rrSq_1 rrSq_12, long l) {
        this.id_break = rYY2;
        this.id_byte = rYY3;
        this.id_protected = rrSq_12;
        this.id_throws = l;
    }

    static {
        rVL.id_class(rVL.rG, "noise", rKT.id_protected);
        rVL.id_class(rVL.rG, "flat", rKz_1.id_protected);
        rVL.id_class(rVL.rG, "debug", rKk_1.id_protected);
    }

    public abstract int id_class(int var1, int var2, rKv_1 var3);

    public abstract void id_class(rRg_1 var1, rrrA var2, roC_2 var3);

    public void id_class(rRI rRI2, rrrA rrrA2, roC_2 roC_22) {
        int n = 8;
        int n2 = roC_22.id_private().id_break;
        int n3 = roC_22.id_private().id_byte;
        int n4 = n2 << 4;
        int n5 = n3 << 4;
        rjh_3 rjh_32 = rjh_3.id_class(roC_22.id_private(), 0);
        for (int i = n2 - 8; i <= n2 + 8; ++i) {
            for (int j = n3 - 8; j <= n3 + 8; ++j) {
                long l = rfj_3.id_class(i, j);
                for (rrrH<?> rrrH2 : rRI2.id_protected(i, j).id_super().values()) {
                    try {
                        if (rrrH2 == rrrH.id_class || !rrrH2.id_byte().id_class(n4, n5, n4 + 15, n5 + 15)) continue;
                        rrrA2.id_class(rjh_32, rrrH2.id_native(), l, (rRj_1)roC_22);
                        ruP_2.id_class(rRI2, rrrH2);
                    }
                    catch (Exception exception) {
                        KY kY = KY.id_class(exception, "Generating structure reference");
                        Ko_1 ko_1 = kY.id_class("Structure");
                        ko_1.id_class("Id", () -> rVL.t.id_break(rrrH2.id_native()).toString());
                        ko_1.id_class("Name", () -> rrrH2.id_native().id_catch());
                        ko_1.id_class("Class", () -> rrrH2.id_native().getClass().getCanonicalName());
                        throw new KU(kY);
                    }
                }
            }
        }
    }

    private void id_class(reP_2<?, ?> reP_22, rVm_1 rVm_12, rrrA rrrA2, roC_2 roC_22, rrPt_1 rrPt_12, long l, rfj_3 rfj_32, rYG rYG2) {
        rrrH<?> rrrH2 = rrrA2.id_class(rjh_3.id_class(roC_22.id_private(), 0), (rrrZ<?>)reP_22.id_protected, roC_22);
        int n = rrrH2 != null ? rrrH2.id_finally() : 0;
        rrSI rrSI2 = this.id_protected.id_class((rrrZ<?>)reP_22.id_protected);
        if (rrSI2 != null) {
            rrrH<?> rrrH3 = reP_22.id_class(rVm_12, this, this.id_break, rrPt_12, l, rfj_32, rYG2, n, rrSI2);
            rrrA2.id_class(rjh_3.id_class(roC_22.id_private(), 0), (rrrZ<?>)reP_22.id_protected, rrrH3, (rRj_1)roC_22);
        }
    }

    public void id_class(rVm_1 rVm_12, rrrA rrrA2, roC_2 roC_22, rrPt_1 rrPt_12, long l) {
        rfj_3 rfj_32 = roC_22.id_private();
        rYG rYG2 = this.id_break.id_protected((rfj_32.id_break << 2) + 2, 0, (rfj_32.id_byte << 2) + 2);
        this.id_class(rrrF.id_extends, rVm_12, rrrA2, roC_22, rrPt_12, l, rfj_32, rYG2);
        for (Supplier<reP_2<?, ?>> supplier : rYG2.id_throws().id_class()) {
            this.id_class(supplier.get(), rVm_12, rrrA2, roC_22, rrPt_12, l, rfj_32, rYG2);
        }
    }

    public List<rYf_1> id_class(rYG rYG2, rrrA rrrA2, aH_2 aH_22, rfH_2 rfH_22) {
        return rYG2.id_break().id_class(aH_22);
    }

    public boolean id_class(rfj_3 rfj_32) {
        this.id_catch();
        return this.id_case.contains(rfj_32);
    }

    protected abstract Codec<? extends rKd_1> id_class();

    public abstract rRq_1 id_class(int var1, int var2);

    public void id_class(rKf_1 rKf_12) {
    }

    public void id_class(long l, rYA rYA2, roC_2 roC_22, rKu_1 rKu_12) {
        rYA rYA3 = rYA2.id_class(this.id_break);
        rqm_3 rqm_32 = new rqm_3();
        int n = 8;
        rfj_3 rfj_32 = roC_22.id_private();
        int n2 = rfj_32.id_break;
        int n3 = rfj_32.id_byte;
        rYv_1 rYv_12 = this.id_break.id_protected(rfj_32.id_break << 2, 0, rfj_32.id_byte << 2).id_throws();
        BitSet bitSet = ((rok_3)roC_22).id_break(rKu_12);
        for (int i = n2 - 8; i <= n2 + 8; ++i) {
            for (int j = n3 - 8; j <= n3 + 8; ++j) {
                List<Supplier<rDM<?>>> list = rYv_12.id_class(rKu_12);
                ListIterator<Supplier<rDM<?>>> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    int n4 = listIterator.nextIndex();
                    rDM<?> rDM2 = listIterator.next().get();
                    rqm_32.id_byte(l + (long)n4, i, j);
                    if (!rDM2.id_class(rqm_32, i, j)) continue;
                    rDM2.id_class(roC_22, rYA3::id_class, rqm_32, this.id_case(), i, j, n2, n3, bitSet);
                }
            }
        }
    }

    public abstract void id_class(rKf_1 var1, roC_2 var2);

    public void id_class(rKf_1 rKf_12, rrrA rrrA2) {
        int n = rKf_12.id_protected();
        int n2 = rKf_12.id_throws();
        int n3 = n * 16;
        int n4 = n2 * 16;
        rfH_2 rfH_22 = new rfH_2(n3, 0, n4);
        rYG rYG2 = this.id_break.id_protected((n << 2) + 2, 2, (n2 << 2) + 2);
        rqm_3 rqm_32 = new rqm_3();
        long l = rqm_32.id_class(rKf_12.id_break(), n3, n4);
        try {
            rYG2.id_class(rrrA2, this, rKf_12, l, rqm_32, rfH_22);
        }
        catch (Exception exception) {
            KY kY = KY.id_class(exception, "Biome decoration");
            kY.id_class("Generation").id_class("CenterX", n).id_class("CenterZ", n2).id_class("Seed", l).id_class("Biome", rYG2);
            throw new KU(kY);
        }
    }

    public rfH_2 id_class(rrEm_1 rrEm_12, rrrZ<?> rrrZ2, rfH_2 rfH_22, int n, boolean bl) {
        if (!this.id_break.id_class(rrrZ2)) {
            return null;
        }
        if (rrrZ2 == rrrZ.id_extends) {
            this.id_catch();
            rfH_2 rfH_23 = null;
            double d = Double.MAX_VALUE;
            rfw_3 rfw_32 = new rfw_3();
            for (rfj_3 rfj_32 : this.id_case) {
                rfw_32.id_class((rfj_32.id_break << 4) + 8, 32, (rfj_32.id_byte << 4) + 8);
                double d2 = rfw_32.id_private(rfH_22);
                if (rfH_23 == null) {
                    rfH_23 = new rfH_2(rfw_32);
                    d = d2;
                    continue;
                }
                if (!(d2 < d)) continue;
                rfH_23 = new rfH_2(rfw_32);
                d = d2;
            }
            return rfH_23;
        }
        rrSI rrSI2 = this.id_protected.id_class(rrrZ2);
        return rrSI2 == null ? null : rrrZ2.id_class(rrEm_12, rrEm_12.id_protected(), rfH_22, n, bl, rrEm_12.id_break(), rrSI2);
    }

    public void id_class(rVL<rYG> rVL2, roC_2 roC_22) {
        rfj_3 rfj_32 = roC_22.id_private();
        ((rok_3)roC_22).id_class(new rYZ(rVL2, rfj_32, this.id_byte));
    }

    public abstract rKd_1 id_class(long var1);

    public int id_break(int n, int n2, rKv_1 rKv_12) {
        return this.id_class(n, n2, rKv_12);
    }

    public rrSq_1 id_break() {
        return this.id_protected;
    }

    public int id_throws() {
        return 256;
    }

    private void id_catch() {
        rrSf_1 rrSf_12;
        if (this.id_case.isEmpty() && (rrSf_12 = this.id_protected.id_break()) != null && rrSf_12.id_byte() != 0) {
            ArrayList arrayList = Lists.newArrayList();
            for (rYG rYG2 : this.id_break.id_break()) {
                if (!rYG2.id_throws().id_class(rrrZ.id_extends)) continue;
                arrayList.add(rYG2);
            }
            int n = rrSf_12.id_class();
            int n2 = rrSf_12.id_byte();
            int n3 = rrSf_12.id_break();
            Random random = new Random();
            random.setSeed(this.id_throws);
            double d = random.nextDouble() * Math.PI * 2.0;
            int n4 = 0;
            int n5 = 0;
            for (int i = 0; i < n2; ++i) {
                double d2 = (double)(4 * n + n * n5 * 6) + (random.nextDouble() - 0.5) * (double)n * 2.5;
                int n6 = (int)Math.round(Math.cos(d) * d2);
                int n7 = (int)Math.round(Math.sin(d) * d2);
                rfH_2 rfH_22 = this.id_break.id_class((n6 << 4) + 8, 0, (n7 << 4) + 8, 112, arrayList::contains, random);
                if (rfH_22 != null) {
                    n6 = rfH_22.b_() >> 4;
                    n7 = rfH_22.d_() >> 4;
                }
                this.id_case.add(new rfj_3(n6, n7));
                d += Math.PI * 2 / (double)n3;
                if (++n4 != n3) continue;
                n4 = 0;
                n3 += 2 * n3 / (++n5 + 1);
                n3 = Math.min(n3, n2 - i);
                d += random.nextDouble() * Math.PI * 2.0;
            }
        }
    }

    public int id_case() {
        return 63;
    }

    public rYY id_protected() {
        return this.id_byte;
    }
}

