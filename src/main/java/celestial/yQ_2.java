/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.HU;
import celestial.Hh_1;
import celestial.Hv_1;
import celestial.QY;
import celestial.Wu_1;
import celestial.gm_3;
import celestial.jm_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.ly_3;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.roJ_2;
import celestial.roN_2;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.rrGC;
import celestial.rrJI;
import celestial.rrQX;
import celestial.rrWM;
import celestial.rrbW_2;
import celestial.rrbb_3;
import celestial.rrxA_2;
import celestial.rrxJ_2;
import celestial.rrxr_3;
import celestial.ryO_2;
import celestial.xL_2;
import celestial.xc_3;
import celestial.yN_2;
import celestial.yO_2;
import celestial.yS_2;
import celestial.yW_2;
import celestial.yZ_2;
import celestial.yc_3;
import celestial.yu_3;
import celestial.yx_3;
import celestial.yz_3;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class yQ_2
implements rrGC {
    public final AtomicReference<yZ_2> id_class = new AtomicReference<yZ_2>(yZ_2.id_class);
    private yc_3 id_case;
    private yu_3 id_catch;
    private final Set<ryO_2> id_private = Sets.newHashSet();
    private final rrxJ_2<jm_3> id_implements = new rrxJ_2<jm_3>(hU -> new jm_3(ju_3.id_private));
    public rfl_3 id_break;
    private int id_finally = -1;
    private boolean id_extends = true;
    public final rfw_3 id_native = new rfw_3(-1, -1, -1);
    private final rfw_3[] id_volatile = rqR_2.id_class(new rfw_3[6], rfw_3Array -> {
        for (int i = 0; i < ((rfw_3[])rfw_3Array).length; ++i) {
            rfw_3Array[i] = new rfw_3();
        }
    });
    private boolean id_final;
    private final boolean id_package = rrbb_3.id_package();
    private final boolean id_int = !rrxr_3.id_class.id_byte();
    private boolean id_new = false;
    private final boolean id_continue = rrbb_3.ry();
    public int id_byte;
    public int id_protected;
    public int id_super;
    public int id_this;
    public int id_else;
    private final yQ_2[] id_synchronized = new yQ_2[6];
    private boolean id_return = false;
    public roJ_2 id_public;
    private final yQ_2[] id_goto = new yQ_2[rpr_3.VALUES.length];
    private final yQ_2[] id_while = new yQ_2[rpr_3.VALUES.length];
    private boolean id_try = false;
    private final yx_3 id_instanceof = new yx_3(this, null, 0);
    public final /* synthetic */ yz_3 id_throws;

    public yZ_2 id_byte() {
        return this.id_class.get();
    }

    private roJ_2 id_byte(rfH_2 rfH_22) {
        roJ_2 roJ_22 = this.id_public;
        if (rrWM.id_break(roJ_22)) {
            return roJ_22;
        }
        this.id_public = roJ_22 = this.id_throws.id_native.id_this(rfH_22);
        return roJ_22;
    }

    private void id_int() {
        this.id_implements();
        this.id_class.set(yZ_2.id_class);
        this.id_extends = true;
    }

    public yQ_2(yz_3 yz_32) {
        this.id_throws = yz_32;
    }

    public String toString() {
        return "pos: " + this.id_throws() + ", frameIndex: " + this.id_finally;
    }

    public boolean id_class(HU hU, yz_3 yz_32) {
        yZ_2 yZ_22 = this.id_byte();
        if (this.id_catch != null) {
            this.id_catch.id_class();
        }
        if (!yZ_22.id_byte.contains(hU)) {
            return false;
        }
        this.id_catch = yz_3.id_new ? new yu_3(this, new rfj_3(this.id_throws()), this.id_break(), yZ_22) : new yu_3(this, this.id_break(), yZ_22);
        yz_32.id_class(this.id_catch);
        return true;
    }

    @Override
    public yW_2 id_class(rYB rYB2, rfH_2 rfH_22, rfH_2 rfH_23, int n) {
        return yW_2.id_class(rYB2, rfH_22, rfH_23, n, false);
    }

    public void id_class(Hv_1 hv_1, yZ_2 yZ_22) {
        this.id_class(rrxA_2.id_byte, hv_1, yZ_22);
        this.id_class(rrxA_2.id_break, hv_1, yZ_22);
        this.id_class(rrxA_2.id_protected, hv_1, yZ_22);
    }

    public rfH_2 id_class(rpr_3 rpr_32) {
        return this.id_volatile[rpr_32.ordinal()];
    }

    public HU[] id_class(xc_3 xc_32, HU[] hUArray) {
        if (yz_3.id_continue) {
            return yz_3.id_class;
        }
        hUArray[0] = yS_2.id_class(xc_32);
        return hUArray;
    }

    public yQ_2 id_class(yO_2 yO_22, rpr_3 rpr_32) {
        if (!this.id_return) {
            for (int i = 0; i < rpr_3.VALUES.length; ++i) {
                rpr_3 rpr_33 = rpr_3.VALUES[i];
                rfH_2 rfH_22 = this.id_class(rpr_33);
                this.id_synchronized[i] = yO_22.id_class(rfH_22);
            }
            this.id_return = true;
        }
        return this.id_synchronized[rpr_32.ordinal()];
    }

    private void id_class(HU hU, Hv_1 hv_1, yZ_2 yZ_22) {
        lD_2 lD_22 = hv_1.id_class(hU);
        if (lD_22.id_final()) {
            yZ_22.id_protected(hU);
            if (lD_22.id_int() > 0) {
                yZ_22.id_throws(hU);
            }
        }
    }

    public void id_class(Set<ryO_2> set) {
        HashSet hashSet = Sets.newHashSet(set);
        HashSet hashSet2 = Sets.newHashSet(this.id_private);
        hashSet.removeAll(this.id_private);
        hashSet2.removeAll(set);
        this.id_private.clear();
        this.id_private.addAll(set);
        this.id_throws.id_volatile.id_class(hashSet2, hashSet);
    }

    public void id_class(yz_3 yz_32) {
        yN_2 yN_22 = this.id_finally();
        yz_32.id_class(yN_22);
    }

    public HU id_class(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, HU hU) {
        Object object;
        if (rrbW_2.id_break() && (object = rrbW_2.id_class(rRq_12, xc_32, rfH_22)) != null) {
            return object;
        }
        if (!this.id_int) {
            return hU;
        }
        if (this.id_package) {
            if (hU == rrxA_2.id_byte) {
                object = xc_32.id_break();
                if (object instanceof Wu_1) {
                    return hU;
                }
                if (object instanceof xL_2) {
                    return hU;
                }
                return rrxA_2.id_break;
            }
        } else if (hU == rrxA_2.id_break) {
            return rrxA_2.id_byte;
        }
        return hU;
    }

    public HU[] id_class(rXE rXE2, HU[] hUArray) {
        if (yz_3.id_super) {
            return yz_3.id_class;
        }
        hUArray[0] = yS_2.id_class(rXE2);
        return hUArray;
    }

    public void id_class(int n, int n2, int n3) {
        if (n != this.id_native.b_() || n2 != this.id_native.c_() || n3 != this.id_native.d_()) {
            this.id_int();
            this.id_native.id_class(n, n2, n3);
            if (this.id_continue) {
                int n4 = 8;
                this.id_byte = n >> n4 << n4;
                this.id_protected = n3 >> n4 << n4;
                this.id_super = n - this.id_byte;
                this.id_this = n2;
                this.id_else = n3 - this.id_protected;
            }
            this.id_break = new rfl_3(n, n2, n3, n + 16, n2 + 16, n3 + 16);
            for (rpr_3 rpr_32 : rpr_3.VALUES) {
                this.id_volatile[rpr_32.ordinal()].id_class(this.id_native).id_byte(rpr_32, 16);
            }
            this.id_return = false;
            this.id_try = false;
            for (int i = 0; i < this.id_goto.length; ++i) {
                yQ_2 yQ_22 = this.id_goto[i];
                if (yQ_22 == null) continue;
                yQ_22.id_try = false;
            }
            this.id_public = null;
        }
    }

    public jm_3 id_class(HU hU) {
        return this.id_implements.id_class(hU);
    }

    public boolean id_class(int n) {
        if (this.id_finally == n) {
            return false;
        }
        this.id_finally = n;
        return true;
    }

    public boolean id_class() {
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_() || !(this.id_break() > 576.0)) {
            return true;
        }
        return this.id_class(this.id_volatile[rpr_3.WEST.ordinal()]) && this.id_class(this.id_volatile[rpr_3.NORTH.ordinal()]) && this.id_class(this.id_volatile[rpr_3.EAST.ordinal()]) && this.id_class(this.id_volatile[rpr_3.SOUTH.ordinal()]);
    }

    private boolean id_class(rfH_2 rfH_22) {
        return this.id_throws.id_native.id_class(rfH_22.b_() >> 4, rfH_22.d_() >> 4, roN_2.id_volatile, false) != null;
    }

    public void id_class(boolean bl) {
        boolean bl2 = this.id_extends;
        this.id_extends = true;
        this.id_final = bl | (bl2 && this.id_final);
        if (this.id_new()) {
            this.id_new = true;
        }
    }

    public void id_class(rpr_3 rpr_32, yQ_2 yQ_22) {
        this.id_goto[rpr_32.ordinal()] = yQ_22;
        this.id_while[rpr_32.ordinal()] = yQ_22;
    }

    public void id_class(lD_2 lD_22) {
        lD_22.id_class(7, ju_3.id_private);
    }

    public rrJI id_break(rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break(-1, -1, -1);
        rfH_2 rfH_24 = rfH_22.id_break(16, 16, 16);
        yW_2 yW_22 = this.id_class(this.id_throws.id_native, rfH_23, rfH_24, 1);
        return new rrJI(yW_22, rfH_23, rfH_24, 1);
    }

    public yQ_2 id_break(rpr_3 rpr_32) {
        if (!this.id_try) {
            this.id_continue();
        }
        return this.id_while[rpr_32.ordinal()];
    }

    protected double id_break() {
        ly_3 ly_32 = ((Hh_1)QY.id_instanceof().id_class[16]).id_finally();
        double d = this.id_break.id_class + 8.0 - ly_32.id_break().id_break;
        double d2 = this.id_break.id_break + 8.0 - ly_32.id_break().id_byte;
        double d3 = this.id_break.id_byte + 8.0 - ly_32.id_break().id_protected;
        return d * d + d2 * d2 + d3 * d3;
    }

    public rfH_2 id_throws() {
        return this.id_native;
    }

    public yN_2 id_finally() {
        this.id_implements();
        yW_2 yW_22 = null;
        this.id_case = yz_3.id_new ? new yc_3(this, new rfj_3(this.id_throws()), this.id_break(), yW_22) : new yc_3(this, this.id_break(), yW_22);
        return this.id_case;
    }

    public boolean id_catch() {
        return this.id_extends;
    }

    public void id_extends() {
        yN_2 yN_22 = this.id_finally();
        yN_22.id_class(this.id_throws.id_implements);
    }

    public void id_case() {
        this.id_extends = false;
        this.id_final = false;
        this.id_new = false;
    }

    private void id_continue() {
        int n = this.id_throws().b_();
        int n2 = this.id_throws().d_();
        int n3 = rpr_3.NORTH.ordinal();
        int n4 = rpr_3.SOUTH.ordinal();
        int n5 = rpr_3.WEST.ordinal();
        int n6 = rpr_3.EAST.ordinal();
        this.id_while[n3] = this.id_goto[n3].id_throws().d_() == n2 - 16 ? this.id_goto[n3] : null;
        this.id_while[n4] = this.id_goto[n4].id_throws().d_() == n2 + 16 ? this.id_goto[n4] : null;
        this.id_while[n5] = this.id_goto[n5].id_throws().b_() == n - 16 ? this.id_goto[n5] : null;
        this.id_while[n6] = this.id_goto[n6].id_throws().b_() == n + 16 ? this.id_goto[n6] : null;
        this.id_try = true;
    }

    protected void id_implements() {
        if (this.id_case != null) {
            this.id_case.id_class();
            this.id_case = null;
        }
        if (this.id_catch != null) {
            this.id_catch.id_class();
            this.id_catch = null;
        }
    }

    private boolean id_new() {
        rYB rYB2 = this.id_throws.id_native;
        if (rYB2 instanceof gm_3) {
            gm_3 gm_32 = (gm_3)rYB2;
            return gm_32.id_volatile();
        }
        return false;
    }

    public yx_3 id_package() {
        return this.id_instanceof;
    }

    public void id_protected() {
        this.id_int();
        this.id_implements.id_class().forEach(jm_3::close);
    }

    public boolean id_protected(rfH_2 rfH_22) {
        int n = rfH_22.c_();
        int n2 = n + 15;
        return this.id_byte(rfH_22).id_class(n, n2);
    }

    public boolean id_private() {
        return this.id_extends && this.id_final;
    }

    public boolean id_final() {
        return this.id_protected(this.id_native);
    }

    public roJ_2 id_volatile() {
        return this.id_byte(this.id_native);
    }

    public boolean id_native() {
        return this.id_new;
    }
}

