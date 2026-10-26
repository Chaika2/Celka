/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.JC;
import celestial.Jq_1;
import celestial.WZ;
import celestial.kR_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCY;
import celestial.rCm_1;
import celestial.rCu_1;
import celestial.rLc_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjC_2;
import celestial.rja_3;
import celestial.rje_3;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpa_3;
import celestial.rpb_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class Wu_1
extends xd_3 {
    public static final rCu_1<rCY> id_volatile = rCT.S;
    public static final rCu_1<rCY> id_final = rCT.B;
    public static final rCu_1<rCY> id_package = rCT.s;
    public static final rCu_1<rCY> id_int = rCT.E;
    public static final rCm_1 id_new = rCT.H;
    public static final Map<rpr_3, rCu_1<rCY>> id_continue = Maps.newEnumMap((Map)ImmutableMap.of((Object)rpr_3.NORTH, id_volatile, (Object)rpr_3.EAST, id_final, (Object)rpr_3.SOUTH, id_package, (Object)rpr_3.WEST, id_int));
    private static final rjC_2 id_super = xd_3.id_class(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
    private static final Map<rpr_3, rjC_2> id_this = Maps.newEnumMap((Map)ImmutableMap.of((Object)rpr_3.NORTH, (Object)xd_3.id_class(3.0, 0.0, 0.0, 13.0, 1.0, 13.0), (Object)rpr_3.SOUTH, (Object)xd_3.id_class(3.0, 0.0, 3.0, 13.0, 1.0, 16.0), (Object)rpr_3.EAST, (Object)xd_3.id_class(3.0, 0.0, 3.0, 16.0, 1.0, 13.0), (Object)rpr_3.WEST, (Object)xd_3.id_class(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)));
    private static final Map<rpr_3, rjC_2> id_else = Maps.newEnumMap((Map)ImmutableMap.of((Object)rpr_3.NORTH, (Object)rjw_3.id_class(id_this.get(rpr_3.NORTH), xd_3.id_class(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)), (Object)rpr_3.SOUTH, (Object)rjw_3.id_class(id_this.get(rpr_3.SOUTH), xd_3.id_class(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)), (Object)rpr_3.EAST, (Object)rjw_3.id_class(id_this.get(rpr_3.EAST), xd_3.id_class(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)), (Object)rpr_3.WEST, (Object)rjw_3.id_class(id_this.get(rpr_3.WEST), xd_3.id_class(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))));
    private final Map<xc_3, rjC_2> id_synchronized = Maps.newHashMap();
    private static final rje_3[] id_return = new rje_3[16];
    private final xc_3 id_public;
    private boolean id_goto = true;

    @Override
    public boolean id_byte(xc_3 xc_32) {
        return this.id_goto;
    }

    public static int id_byte(int n) {
        rje_3 rje_32 = id_return[n];
        return rfU_2.id_throws(rje_32.id_class(), rje_32.id_break(), rje_32.id_byte());
    }

    public Wu_1(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rCY.NONE)).id_class(id_final, rCY.NONE)).id_class(id_package, rCY.NONE)).id_class(id_int, rCY.NONE)).id_class(id_new, 0));
        this.id_public = (xc_3)((xc_3)((xc_3)((xc_3)this.id_continue().id_class(id_volatile, rCY.SIDE)).id_class(id_final, rCY.SIDE)).id_class(id_package, rCY.SIDE)).id_class(id_int, rCY.SIDE);
        for (xc_3 xc_32 : this.id_new().id_class()) {
            if (xc_32.id_byte(id_new) != 0) continue;
            this.id_synchronized.put(xc_32, this.id_implements(xc_32));
        }
    }

    static {
        for (int i = 0; i <= 15; ++i) {
            float f;
            float f2 = f * 0.6f + ((f = (float)i / 15.0f) > 0.0f ? 0.4f : 0.3f);
            float f3 = rfU_2.id_class(f * f * 0.7f - 0.5f, 0.0f, 1.0f);
            float f4 = rfU_2.id_class(f * f * 0.6f - 0.7f, 0.0f, 1.0f);
            Wu_1.id_return[i] = new rje_3(f2, f3, f4);
        }
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        if (this.id_goto && rpr_32 != rpr_3.DOWN) {
            int n = xc_32.id_byte(id_new);
            if (n == 0) {
                return 0;
            }
            return rpr_32 != rpr_3.UP && !((rCY)this.id_class(rRq_12, xc_32, rfH_22).id_byte(id_continue.get(rpr_32.id_case()))).id_break() ? 0 : n;
        }
        return 0;
    }

    protected static boolean id_class(xc_3 xc_32, rpr_3 rpr_32) {
        if (xc_32.id_class(xu_3.ra)) {
            return true;
        }
        if (xc_32.id_class(xu_3.BS)) {
            rpr_3 rpr_33 = xc_32.id_byte(WZ.p);
            return rpr_33 == rpr_32 || rpr_33.id_case() == rpr_32;
        }
        if (xc_32.id_class(xu_3.bK)) {
            return rpr_32 == xc_32.id_byte(kR_2.id_volatile);
        }
        return xc_32.id_implements() && rpr_32 != null;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_synchronized.get(xc_32.id_class(id_new, 0));
    }

    private void id_class(rYB rYB2, Random random, rfH_2 rfH_22, rje_3 rje_32, rpr_3 rpr_32, rpr_3 rpr_33, float f, float f2) {
        float f3 = f2 - f;
        if (!(random.nextFloat() >= 0.2f * f3)) {
            float f4 = 0.4375f;
            float f5 = f + f3 * random.nextFloat();
            double d = 0.5 + (double)(0.4375f * (float)rpr_32.id_implements()) + (double)(f5 * (float)rpr_33.id_implements());
            double d2 = 0.5 + (double)(0.4375f * (float)rpr_32.id_finally()) + (double)(f5 * (float)rpr_33.id_finally());
            double d3 = 0.5 + (double)(0.4375f * (float)rpr_32.id_extends()) + (double)(f5 * (float)rpr_33.id_extends());
            rYB2.id_class(new rLc_1(rje_32.id_class(), rje_32.id_break(), rje_32.id_byte(), 1.0f), (double)rfH_22.b_() + d, (double)rfH_22.c_() + d2, (double)rfH_22.d_() + d3, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        if (!rYB2.id_continue) {
            if (xc_32.id_class((rRR)rYB2, rfH_22)) {
                this.id_class(rYB2, rfH_22, xc_32);
            } else {
                Wu_1.id_protected(xc_32, rYB2, rfH_22);
                rYB2.id_class(rfH_22, false);
            }
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_33.id_class(xc_32.id_break()) && !rYB2.id_continue) {
            this.id_class(rYB2, rfH_22, xc_32);
            for (rpr_3 rpr_32 : rpb_3.VERTICAL) {
                rYB2.id_break(rfH_22.id_break(rpr_32), this);
            }
            this.id_protected(rYB2, rfH_22);
        }
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return this.id_class((rRq_1)rxx_32.id_int(), this.id_public, rxx_32.id_class());
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, xc_3 xc_33) {
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
            if (((rCY)xc_32.id_byte(id_continue.get(rpr_32))).id_break() == ((rCY)xc_33.id_byte(id_continue.get(rpr_32))).id_break() || !rYB2.id_byte(rfH_23).id_catch(rYB2, rfH_23)) continue;
            rYB2.id_class(rfH_23, xc_33.id_break(), rpr_32.id_case());
        }
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (!((rhx_3)rhd_32.id_implements[18]).id_throws) {
            return ryZ_2.PASS;
        }
        if (Wu_1.id_volatile(xc_32) || Wu_1.id_final(xc_32)) {
            xc_3 xc_33 = Wu_1.id_volatile(xc_32) ? this.id_continue() : this.id_public;
            xc_33 = (xc_3)xc_33.id_class(id_new, xc_32.id_byte(id_new));
            if ((xc_33 = this.id_class((rRq_1)rYB2, xc_33, rfH_22)) != xc_32) {
                rYB2.id_class(rfH_22, xc_33, 3);
                this.id_class(rYB2, rfH_22, xc_32, xc_33);
                return ryZ_2.SUCCESS;
            }
        }
        return ryZ_2.PASS;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final, id_package, id_int, id_new);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        switch (rpa_32) {
            case LEFT_RIGHT: {
                return (xc_3)((xc_3)xc_32.id_class(id_volatile, xc_32.id_byte(id_package))).id_class(id_package, xc_32.id_byte(id_volatile));
            }
            case FRONT_BACK: {
                return (xc_3)((xc_3)xc_32.id_class(id_final, xc_32.id_byte(id_int))).id_class(id_int, xc_32.id_byte(id_final));
            }
        }
        return super.id_class(xc_32, rpa_32);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        switch (rqd_32) {
            case CLOCKWISE_180: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_volatile, xc_32.id_byte(id_package))).id_class(id_final, xc_32.id_byte(id_int))).id_class(id_package, xc_32.id_byte(id_volatile))).id_class(id_int, xc_32.id_byte(id_final));
            }
            case COUNTERCLOCKWISE_90: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_volatile, xc_32.id_byte(id_final))).id_class(id_final, xc_32.id_byte(id_package))).id_class(id_package, xc_32.id_byte(id_int))).id_class(id_int, xc_32.id_byte(id_volatile));
            }
            case CLOCKWISE_90: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_volatile, xc_32.id_byte(id_int))).id_class(id_final, xc_32.id_byte(id_volatile))).id_class(id_package, xc_32.id_byte(id_final))).id_class(id_int, xc_32.id_byte(id_package));
            }
        }
        return xc_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        int n = xc_32.id_byte(id_new);
        if (n != 0) {
            block4: for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
                rCY rCY2 = (rCY)xc_32.id_byte(id_continue.get(rpr_32));
                switch (rCY2) {
                    case UP: {
                        this.id_class(rYB2, random, rfH_22, id_return[n], rpr_32, rpr_3.UP, -0.5f, 0.5f);
                    }
                    case SIDE: {
                        this.id_class(rYB2, random, rfH_22, id_return[n], rpr_3.DOWN, rpr_32, 0.0f, 0.5f);
                        continue block4;
                    }
                }
                this.id_class(rYB2, random, rfH_22, id_return[n], rpr_3.DOWN, rpr_32, 0.0f, 0.3f);
            }
        }
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        int n = this.id_class(rYB2, rfH_22);
        if (xc_32.id_byte(id_new) != n) {
            if (rYB2.id_byte(rfH_22) == xc_32) {
                rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_new, n), 2);
            }
            HashSet hashSet = Sets.newHashSet();
            hashSet.add(rfH_22);
            for (rpr_3 rpr_32 : rpr_3.values()) {
                hashSet.add(rfH_22.id_break(rpr_32));
            }
            for (rfH_2 rfH_23 : hashSet) {
                rYB2.id_break(rfH_23, this);
            }
        }
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (rpr_32 == rpr_3.DOWN) {
            return xc_32;
        }
        if (rpr_32 == rpr_3.UP) {
            return this.id_class((rRq_1)rRg_12, xc_32, rfH_22);
        }
        rCY rCY2 = this.id_class((rRq_1)rRg_12, rfH_22, rpr_32);
        return rCY2.id_break() == ((rCY)xc_32.id_byte(id_continue.get(rpr_32))).id_break() && !Wu_1.id_volatile(xc_32) ? (xc_3)xc_32.id_class(id_continue.get(rpr_32), rCY2) : this.id_class((rRq_1)rRg_12, (xc_3)((xc_3)this.id_public.id_class(id_new, xc_32.id_byte(id_new))).id_class(id_continue.get(rpr_32), rCY2), rfH_22);
    }

    @Override
    public void id_class(xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22, int n, int n2) {
        rfw_3 rfw_32 = new rfw_3();
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            Object object;
            Object object2;
            rCY rCY2 = (rCY)xc_32.id_byte(id_continue.get(rpr_32));
            if (rCY2 == rCY.NONE || rRg_12.id_byte(rfw_32.id_class((rja_3)rfH_22, rpr_32)).id_class(this)) continue;
            rfw_32.id_class(rpr_3.DOWN);
            xc_3 xc_33 = rRg_12.id_byte(rfw_32);
            if (!xc_33.id_class(xu_3.bK)) {
                object2 = rfw_32.id_break(rpr_32.id_case());
                object = xc_33.id_class(rpr_32.id_case(), rRg_12.id_byte((rfH_2)object2), rRg_12, (rfH_2)rfw_32, (rfH_2)object2);
                Wu_1.id_class(xc_33, (xc_3)object, rRg_12, rfw_32, n, n2);
            }
            rfw_32.id_class((rja_3)rfH_22, rpr_32).id_class(rpr_3.UP);
            object2 = rRg_12.id_byte(rfw_32);
            if (((JC)object2).id_class(xu_3.bK)) continue;
            object = rfw_32.id_break(rpr_32.id_case());
            xc_3 xc_34 = ((JC)object2).id_class(rpr_32.id_case(), rRg_12.id_byte((rfH_2)object), rRg_12, (rfH_2)rfw_32, (rfH_2)object);
            Wu_1.id_class((xc_3)object2, xc_34, rRg_12, rfw_32, n, n2);
        }
    }

    private rCY id_class(rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return this.id_class(rRq_12, rfH_22, rpr_32, !rRq_12.id_byte(rfH_22.id_final()).id_catch(rRq_12, rfH_22));
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break();
        xc_3 xc_33 = rRR2.id_byte(rfH_23);
        return this.id_break((rRq_1)rRR2, rfH_23, xc_33);
    }

    private rCY id_class(rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32, boolean bl) {
        boolean bl2;
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        xc_3 xc_32 = rRq_12.id_byte(rfH_23);
        if (bl && (bl2 = this.id_break(rRq_12, rfH_23, xc_32)) && Wu_1.id_private(rRq_12.id_byte(rfH_23.id_final()))) {
            if (xc_32.id_protected(rRq_12, rfH_23, rpr_32.id_case())) {
                return rCY.UP;
            }
            return rCY.SIDE;
        }
        return !Wu_1.id_class(xc_32, rpr_32) && (xc_32.id_catch(rRq_12, rfH_23) || !Wu_1.id_private(rRq_12.id_byte(rfH_23.id_break()))) ? rCY.NONE : rCY.SIDE;
    }

    private xc_3 id_class(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22) {
        boolean bl;
        boolean bl2 = Wu_1.id_final(xc_32);
        xc_32 = this.id_break(rRq_12, (xc_3)this.id_continue().id_class(id_new, xc_32.id_byte(id_new)), rfH_22);
        if (bl2 && Wu_1.id_final(xc_32)) {
            return xc_32;
        }
        boolean bl3 = xc_32.id_byte(id_volatile).id_break();
        boolean bl4 = xc_32.id_byte(id_package).id_break();
        boolean bl5 = xc_32.id_byte(id_final).id_break();
        boolean bl6 = xc_32.id_byte(id_int).id_break();
        boolean bl7 = !bl3 && !bl4;
        boolean bl8 = bl = !bl5 && !bl6;
        if (!bl6 && bl7) {
            xc_32 = (xc_3)xc_32.id_class(id_int, rCY.SIDE);
        }
        if (!bl5 && bl7) {
            xc_32 = (xc_3)xc_32.id_class(id_final, rCY.SIDE);
        }
        if (!bl3 && bl) {
            xc_32 = (xc_3)xc_32.id_class(id_volatile, rCY.SIDE);
        }
        if (!bl4 && bl) {
            xc_32 = (xc_3)xc_32.id_class(id_package, rCY.SIDE);
        }
        return xc_32;
    }

    private int id_class(rYB rYB2, rfH_2 rfH_22) {
        this.id_goto = false;
        int n = rYB2.id_goto(rfH_22);
        this.id_goto = true;
        int n2 = 0;
        if (n < 15) {
            for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
                rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
                xc_3 xc_32 = rYB2.id_byte(rfH_23);
                n2 = Math.max(n2, this.id_package(xc_32));
                rfH_2 rfH_24 = rfH_22.id_final();
                if (xc_32.id_catch(rYB2, rfH_23) && !rYB2.id_byte(rfH_24).id_catch(rYB2, rfH_24)) {
                    n2 = Math.max(n2, this.id_package(rYB2.id_byte(rfH_23.id_final())));
                    continue;
                }
                if (xc_32.id_catch(rYB2, rfH_23)) continue;
                n2 = Math.max(n2, this.id_package(rYB2.id_byte(rfH_23.id_break())));
            }
        }
        return Math.max(n, n2 - 1);
    }

    private xc_3 id_break(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22) {
        boolean bl = !rRq_12.id_byte(rfH_22.id_final()).id_catch(rRq_12, rfH_22);
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            if (((rCY)xc_32.id_byte(id_continue.get(rpr_32))).id_break()) continue;
            rCY rCY2 = this.id_class(rRq_12, rfH_22, rpr_32, bl);
            xc_32 = (xc_3)xc_32.id_class(id_continue.get(rpr_32), rCY2);
        }
        return xc_32;
    }

    private void id_break(rYB rYB2, rfH_2 rfH_22) {
        if (rYB2.id_byte(rfH_22).id_class(this)) {
            rYB2.id_break(rfH_22, this);
            for (rpr_3 rpr_32 : rpr_3.values()) {
                rYB2.id_break(rfH_22.id_break(rpr_32), this);
            }
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!bl && !xc_32.id_class(xc_33.id_break())) {
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
            if (!rYB2.id_continue) {
                for (rpr_3 rpr_32 : rpr_3.values()) {
                    rYB2.id_break(rfH_22.id_break(rpr_32), this);
                }
                this.id_class(rYB2, rfH_22, xc_32);
                this.id_protected(rYB2, rfH_22);
            }
        }
    }

    @Override
    public int id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return !this.id_goto ? 0 : xc_32.id_break(rRq_12, rfH_22, rpr_32);
    }

    private boolean id_break(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return xc_32.id_protected(rRq_12, rfH_22, rpr_3.UP) || xc_32.id_class(xu_3.sl);
    }

    private rjC_2 id_implements(xc_3 xc_32) {
        rjC_2 rjC_22 = id_super;
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            rCY rCY2 = (rCY)xc_32.id_byte(id_continue.get(rpr_32));
            if (rCY2 == rCY.SIDE) {
                rjC_22 = rjw_3.id_class(rjC_22, id_this.get(rpr_32));
                continue;
            }
            if (rCY2 != rCY.UP) continue;
            rjC_22 = rjw_3.id_class(rjC_22, id_else.get(rpr_32));
        }
        return rjC_22;
    }

    private int id_package(xc_3 xc_32) {
        return xc_32.id_class(this) ? xc_32.id_byte(id_new) : 0;
    }

    private void id_protected(rYB rYB2, rfH_2 rfH_22) {
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            this.id_break(rYB2, rfH_22.id_break(rpr_32));
        }
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
            if (rYB2.id_byte(rfH_23).id_catch(rYB2, rfH_23)) {
                this.id_break(rYB2, rfH_23.id_final());
                continue;
            }
            this.id_break(rYB2, rfH_23.id_break());
        }
    }

    protected static boolean id_private(xc_3 xc_32) {
        return Wu_1.id_class(xc_32, (rpr_3)null);
    }

    private static boolean id_final(xc_3 xc_32) {
        return !xc_32.id_byte(id_volatile).id_break() && !xc_32.id_byte(id_package).id_break() && !xc_32.id_byte(id_final).id_break() && !xc_32.id_byte(id_int).id_break();
    }

    private static boolean id_volatile(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile).id_break() && xc_32.id_byte(id_package).id_break() && xc_32.id_byte(id_final).id_break() && xc_32.id_byte(id_int).id_break();
    }
}

