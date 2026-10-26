/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.dQ_2;
import celestial.kE_2;
import celestial.rHC;
import celestial.rHu_1;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rRR;
import celestial.rRf_1;
import celestial.rRq_1;
import celestial.rVL;
import celestial.rXE;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rpa_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrrA;
import celestial.rrrl_1;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class rrrn_1 {
    protected static final xc_3 id_volatile = xu_3.hb.id_continue();
    protected rfi_3 id_final;
    private rpr_3 id_class;
    private rpa_3 id_break;
    private rqd_3 id_byte;
    protected int id_package;
    private final raF_2 id_protected;
    private static final Set<xd_3> id_throws = ImmutableSet.builder().add((Object)xu_3.SB).add((Object)xu_3.rR).add((Object)xu_3.rY).add((Object)xu_3.PV).add((Object)xu_3.bQ).add((Object)xu_3.bm).add((Object)xu_3.bu).add((Object)xu_3.bN).add((Object)xu_3.bc).add((Object)xu_3.PJ).add((Object)xu_3.Bf).build();

    protected rrrn_1(raF_2 raF_22, int n) {
        this.id_protected = raF_22;
        this.id_package = n;
    }

    public rrrn_1(raF_2 raF_22, rcd_3 rcd_32) {
        this(raF_22, rcd_32.id_private("GD"));
        int n;
        if (rcd_32.id_throws("BB")) {
            this.id_final = new rfi_3(rcd_32.id_final("BB"));
        }
        this.id_class((n = rcd_32.id_private("O")) == -1 ? null : rpr_3.id_break(n));
    }

    protected void id_class(rRI rRI2, rfi_3 rfi_32, Random random, float f, int n, int n2, int n3, int n4, int n5, int n6, xc_3 xc_32, xc_3 xc_33, boolean bl, boolean bl2) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (random.nextFloat() > f || bl && this.id_class((rRq_1)rRI2, j, i, k, rfi_32).id_catch() || bl2 && !this.id_class(rRI2, j, i, k, rfi_32)) continue;
                    if (i != n2 && i != n5 && j != n && j != n4 && k != n3 && k != n6) {
                        this.id_class(rRI2, xc_33, j, i, k, rfi_32);
                        continue;
                    }
                    this.id_class(rRI2, xc_32, j, i, k, rfi_32);
                }
            }
        }
    }

    protected void id_class(rRI rRI2, rfi_3 rfi_32, Random random, float f, int n, int n2, int n3, xc_3 xc_32) {
        if (random.nextFloat() < f) {
            this.id_class(rRI2, xc_32, n, n2, n3, rfi_32);
        }
    }

    protected void id_class(rRI rRI2, rfi_3 rfi_32, int n, int n2, int n3, int n4, int n5, int n6, xc_3 xc_32, boolean bl) {
        float f = n4 - n + 1;
        float f2 = n5 - n2 + 1;
        float f3 = n6 - n3 + 1;
        float f4 = (float)n + f / 2.0f;
        float f5 = (float)n3 + f3 / 2.0f;
        for (int i = n2; i <= n5; ++i) {
            float f6 = (float)(i - n2) / f2;
            for (int j = n; j <= n4; ++j) {
                float f7 = ((float)j - f4) / (f * 0.5f);
                for (int k = n3; k <= n6; ++k) {
                    float f8;
                    float f9 = ((float)k - f5) / (f3 * 0.5f);
                    if (bl && this.id_class((rRq_1)rRI2, j, i, k, rfi_32).id_catch() || !((f8 = f7 * f7 + f6 * f6 + f9 * f9) <= 1.05f)) continue;
                    this.id_class(rRI2, xc_32, j, i, k, rfi_32);
                }
            }
        }
    }

    protected boolean id_class(rRI rRI2, rfi_3 rfi_32, Random random, int n, int n2, int n3, rqO_2 rqO_22) {
        rfH_2 rfH_22 = new rfH_2(this.id_class(n, n3), this.id_class(n2), this.id_break(n, n3));
        return this.id_class((rRf_1)rRI2, rfi_32, random, rfH_22, rqO_22, (xc_3)null);
    }

    protected void id_class(rRI rRI2, rfi_3 rfi_32, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, Random random, rrrl_1 rrrl_12) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (bl && this.id_class((rRq_1)rRI2, j, i, k, rfi_32).id_catch()) continue;
                    rrrl_12.id_class(random, j, i, k, i == n2 || i == n5 || j == n || j == n4 || k == n3 || k == n6);
                    this.id_class(rRI2, rrrl_12.id_class(), j, i, k, rfi_32);
                }
            }
        }
    }

    protected void id_class(rRI rRI2, rfi_3 rfi_32, int n, int n2, int n3, int n4, int n5, int n6, xc_3 xc_32, xc_3 xc_33, boolean bl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (bl && this.id_class((rRq_1)rRI2, j, i, k, rfi_32).id_catch()) continue;
                    if (i != n2 && i != n5 && j != n && j != n4 && k != n3 && k != n6) {
                        this.id_class(rRI2, xc_33, j, i, k, rfi_32);
                        continue;
                    }
                    this.id_class(rRI2, xc_32, j, i, k, rfi_32);
                }
            }
        }
    }

    protected boolean id_class(rRR rRR2, int n, int n2, int n3, rfi_3 rfi_32) {
        int n4;
        int n5;
        int n6 = this.id_class(n, n3);
        rfH_2 rfH_22 = new rfH_2(n6, n5 = this.id_class(n2 + 1), n4 = this.id_break(n, n3));
        if (!rfi_32.id_break(rfH_22)) {
            return false;
        }
        return n5 < rRR2.id_class(rKv_1.OCEAN_FLOOR_WG, n6, n4);
    }

    public rqd_3 id_class() {
        return this.id_byte;
    }

    public void id_class(rpr_3 rpr_32) {
        this.id_class = rpr_32;
        if (rpr_32 == null) {
            this.id_byte = rqd_3.NONE;
            this.id_break = rpa_3.NONE;
        } else {
            switch (rpr_32) {
                case SOUTH: {
                    this.id_break = rpa_3.LEFT_RIGHT;
                    this.id_byte = rqd_3.NONE;
                    break;
                }
                case WEST: {
                    this.id_break = rpa_3.LEFT_RIGHT;
                    this.id_byte = rqd_3.CLOCKWISE_90;
                    break;
                }
                case EAST: {
                    this.id_break = rpa_3.NONE;
                    this.id_byte = rqd_3.CLOCKWISE_90;
                    break;
                }
                default: {
                    this.id_break = rpa_3.NONE;
                    this.id_byte = rqd_3.NONE;
                }
            }
        }
    }

    public void id_class(int n, int n2, int n3) {
        this.id_final.id_class(n, n2, n3);
    }

    protected boolean id_class(rRI rRI2, rfi_3 rfi_32, Random random, int n, int n2, int n3, rpr_3 rpr_32, rqO_2 rqO_22) {
        rfH_2 rfH_22 = new rfH_2(this.id_class(n, n3), this.id_class(n2), this.id_break(n, n3));
        if (rfi_32.id_break(rfH_22) && !rRI2.id_byte(rfH_22).id_class(xu_3.v)) {
            this.id_class(rRI2, (xc_3)xu_3.v.id_continue().id_class(dQ_2.id_volatile, rpr_32), n, n2, n3, rfi_32);
            ryO_2 ryO_22 = rRI2.id_class(rfH_22);
            if (ryO_22 instanceof rHC) {
                ((rHC)ryO_22).id_class(rqO_22, random.nextLong());
            }
            return true;
        }
        return false;
    }

    protected boolean id_class(rRf_1 rRf_12, rfi_3 rfi_32, Random random, rfH_2 rfH_22, rqO_2 rqO_22, xc_3 xc_32) {
        if (rfi_32.id_break(rfH_22) && !rRf_12.id_byte(rfH_22).id_class(xu_3.re)) {
            if (xc_32 == null) {
                xc_32 = rrrn_1.id_class(rRf_12, rfH_22, xu_3.re.id_continue());
            }
            rRf_12.id_class(rfH_22, xc_32, 2);
            ryO_2 ryO_22 = rRf_12.id_class(rfH_22);
            if (ryO_22 instanceof rHu_1) {
                ((rHu_1)ryO_22).id_class(rqO_22, random.nextLong());
            }
            return true;
        }
        return false;
    }

    public static xc_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        Object object3;
        Object object2 = null;
        for (Object object3 : rpb_3.HORIZONTAL) {
            rfH_2 rfH_23 = rfH_22.id_break((rpr_3)object3);
            xc_3 xc_33 = rRq_12.id_byte(rfH_23);
            if (xc_33.id_class(xu_3.re)) {
                return xc_32;
            }
            if (!xc_33.id_implements(rRq_12, rfH_23)) continue;
            if (object2 != null) {
                object2 = null;
                break;
            }
            object2 = object3;
        }
        if (object2 != null) {
            return (xc_3)xc_32.id_class(kE_2.p, ((rpr_3)object2).id_case());
        }
        Object object4 = xc_32.id_byte(kE_2.p);
        object3 = rfH_22.id_break((rpr_3)object4);
        if (rRq_12.id_byte((rfH_2)object3).id_implements(rRq_12, (rfH_2)object3)) {
            object4 = ((rpr_3)object4).id_case();
            object3 = rfH_22.id_break((rpr_3)object4);
        }
        if (rRq_12.id_byte((rfH_2)object3).id_implements(rRq_12, (rfH_2)object3)) {
            object4 = ((rpr_3)object4).id_catch();
            object3 = rfH_22.id_break((rpr_3)object4);
        }
        if (rRq_12.id_byte((rfH_2)object3).id_implements(rRq_12, (rfH_2)object3)) {
            object4 = ((rpr_3)object4).id_case();
            rfH_22.id_break((rpr_3)object4);
        }
        return (xc_3)xc_32.id_class(kE_2.p, object4);
    }

    protected boolean id_class(rRq_1 rRq_12, rfi_3 rfi_32) {
        int n;
        int n2;
        int n3 = Math.max(this.id_final.id_class - 1, rfi_32.id_class);
        int n4 = Math.max(this.id_final.id_break - 1, rfi_32.id_break);
        int n5 = Math.max(this.id_final.id_byte - 1, rfi_32.id_byte);
        int n6 = Math.min(this.id_final.id_protected + 1, rfi_32.id_protected);
        int n7 = Math.min(this.id_final.id_throws + 1, rfi_32.id_throws);
        int n8 = Math.min(this.id_final.id_case + 1, rfi_32.id_case);
        rfw_3 rfw_32 = new rfw_3();
        for (n2 = n3; n2 <= n6; ++n2) {
            for (n = n5; n <= n8; ++n) {
                if (rRq_12.id_byte(rfw_32.id_class(n2, n4, n)).id_byte().id_class()) {
                    return true;
                }
                if (!rRq_12.id_byte(rfw_32.id_class(n2, n7, n)).id_byte().id_class()) continue;
                return true;
            }
        }
        for (n2 = n3; n2 <= n6; ++n2) {
            for (n = n4; n <= n7; ++n) {
                if (rRq_12.id_byte(rfw_32.id_class(n2, n, n5)).id_byte().id_class()) {
                    return true;
                }
                if (!rRq_12.id_byte(rfw_32.id_class(n2, n, n8)).id_byte().id_class()) continue;
                return true;
            }
        }
        for (n2 = n5; n2 <= n8; ++n2) {
            for (n = n4; n <= n7; ++n) {
                if (rRq_12.id_byte(rfw_32.id_class(n3, n, n2)).id_byte().id_class()) {
                    return true;
                }
                if (!rRq_12.id_byte(rfw_32.id_class(n6, n, n2)).id_byte().id_class()) continue;
                return true;
            }
        }
        return false;
    }

    public static rrrn_1 id_class(List<rrrn_1> list, rfi_3 rfi_32) {
        for (rrrn_1 rrrn_12 : list) {
            if (rrrn_12.id_catch() == null || !rrrn_12.id_catch().id_class(rfi_32)) continue;
            return rrrn_12;
        }
        return null;
    }

    public boolean id_class(rfj_3 rfj_32, int n) {
        int n2 = rfj_32.id_break << 4;
        int n3 = rfj_32.id_byte << 4;
        return this.id_final.id_class(n2 - n, n3 - n, n2 + 15 + n, n3 + 15 + n);
    }

    public abstract boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7);

    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
    }

    protected abstract void id_class(rcd_3 var1);

    protected xc_3 id_class(rRq_1 rRq_12, int n, int n2, int n3, rfi_3 rfi_32) {
        int n4;
        int n5;
        int n6 = this.id_class(n, n3);
        rfH_2 rfH_22 = new rfH_2(n6, n5 = this.id_class(n2), n4 = this.id_break(n, n3));
        return !rfi_32.id_break(rfH_22) ? xu_3.id_class.id_continue() : rRq_12.id_byte(rfH_22);
    }

    protected void id_class(rRI rRI2, xc_3 xc_32, int n, int n2, int n3, rfi_3 rfi_32) {
        rfH_2 rfH_22 = new rfH_2(this.id_class(n, n3), this.id_class(n2), this.id_break(n, n3));
        if (rfi_32.id_break(rfH_22)) {
            if (this.id_break != rpa_3.NONE) {
                xc_32 = xc_32.id_class(this.id_break);
            }
            if (this.id_byte != rqd_3.NONE) {
                xc_32 = xc_32.id_class(this.id_byte);
            }
            rRI2.id_class(rfH_22, xc_32, 2);
            rXE rXE2 = rRI2.id_break(rfH_22);
            if (!rXE2.id_byte()) {
                rRI2.id_extends().id_class(rfH_22, rXE2.id_class(), 0);
            }
            if (id_throws.contains(xc_32.id_break())) {
                rRI2.id_volatile(rfH_22).id_extends(rfH_22);
            }
        }
    }

    protected int id_class(int n) {
        return this.id_implements() == null ? n : n + this.id_final.id_break;
    }

    protected int id_class(int n, int n2) {
        rpr_3 rpr_32 = this.id_implements();
        if (rpr_32 == null) {
            return n;
        }
        switch (rpr_32) {
            case NORTH: 
            case SOUTH: {
                return this.id_final.id_class + n;
            }
            case WEST: {
                return this.id_final.id_protected - n2;
            }
            case EAST: {
                return this.id_final.id_class + n2;
            }
        }
        return n;
    }

    protected void id_break(rRI rRI2, rfi_3 rfi_32, int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    this.id_class(rRI2, xu_3.id_class.id_continue(), j, i, k, rfi_32);
                }
            }
        }
    }

    protected void id_break(rRI rRI2, xc_3 xc_32, int n, int n2, int n3, rfi_3 rfi_32) {
        int n4;
        int n5;
        int n6 = this.id_class(n, n3);
        if (rfi_32.id_break(new rfH_2(n6, n5 = this.id_class(n2), n4 = this.id_break(n, n3)))) {
            while ((rRI2.id_finally(new rfH_2(n6, n5, n4)) || rRI2.id_byte(new rfH_2(n6, n5, n4)).id_byte().id_class()) && n5 > 1) {
                rRI2.id_class(new rfH_2(n6, n5, n4), xc_32, 2);
                --n5;
            }
        }
    }

    protected int id_break(int n, int n2) {
        rpr_3 rpr_32 = this.id_implements();
        if (rpr_32 == null) {
            return n2;
        }
        switch (rpr_32) {
            case NORTH: {
                return this.id_final.id_case - n2;
            }
            case SOUTH: {
                return this.id_final.id_byte + n2;
            }
            case WEST: 
            case EAST: {
                return this.id_final.id_byte + n;
            }
        }
        return n2;
    }

    public raF_2 id_finally() {
        return this.id_protected;
    }

    public rfi_3 id_catch() {
        return this.id_final;
    }

    public final rcd_3 id_case() {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("id", rVL.I.id_break(this.id_finally()).toString());
        rcd_32.id_class("BB", this.id_final.id_private());
        rpr_3 rpr_32 = this.id_implements();
        rcd_32.id_break("O", rpr_32 == null ? -1 : rpr_32.id_protected());
        rcd_32.id_break("GD", this.id_package);
        this.id_class(rcd_32);
        return rcd_32;
    }

    public rpr_3 id_implements() {
        return this.id_class;
    }

    public int id_private() {
        return this.id_package;
    }
}

