/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 */
package celestial;

import celestial.Aq_1;
import celestial.C_break;
import celestial.Np_1;
import celestial.QY;
import celestial.VR;
import celestial.Y;
import celestial.an_3;
import celestial.cb_3;
import celestial.gm_3;
import celestial.iB_2;
import celestial.kW_2;
import celestial.rJr_1;
import celestial.rOD;
import celestial.rRg_1;
import celestial.rRl_1;
import celestial.rXE;
import celestial.rXa_1;
import celestial.rYB;
import celestial.rZE;
import celestial.rZM;
import celestial.rZX;
import celestial.rZb_1;
import celestial.rZd_1;
import celestial.rZq_1;
import celestial.rZs_1;
import celestial.rZx_1;
import celestial.rdH_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfo_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rjU_2;
import celestial.rkw_3;
import celestial.rlP_2;
import celestial.rmK_2;
import celestial.rmR_2;
import celestial.rme_3;
import celestial.rmt_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rrAC;
import celestial.rrAI;
import celestial.rrAK;
import celestial.rrAR;
import celestial.rrAg_1;
import celestial.rrFf_1;
import celestial.rrFj_1;
import celestial.rrLT;
import celestial.rrLe_1;
import celestial.rrLp_1;
import celestial.rrLq_1;
import celestial.rrQX;
import celestial.rrTR;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrjA_2;
import celestial.rrjc_3;
import celestial.rxm_3;
import celestial.ryZ_2;
import celestial.rym_3;
import celestial.xK_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.zr_3;
import celestial.zx_3;
import com.mojang.datafixers.util.Pair;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;

public class Ax_1 {
    private final QY id_catch;
    private final Aq_1 id_private;
    private rfH_2 id_implements = new rfH_2(-1, -1, -1);
    private rdn_3 id_finally = rdn_3.id_break;
    public float id_class;
    private float id_extends;
    private int id_native;
    private boolean id_volatile;
    private rRl_1 id_final = rRl_1.SURVIVAL;
    private rRl_1 id_package = rRl_1.NOT_SET;
    private final Object2ObjectLinkedOpenHashMap<Pair<rfH_2, rZM>, rjU_2> id_int = new Object2ObjectLinkedOpenHashMap();
    public int id_break;
    public long id_byte;
    public long id_protected;
    public long id_throws;
    public long id_case;

    private void id_byte(rhd_3 rhd_32, an_3 an_32, boolean bl) {
        this.id_new();
        if (rrjA_2.id_protected().id_throws().id_protected(ProtocolVersion.v1_8)) {
            if (bl) {
                rhd_32.id_class(rpm_3.MAIN_HAND);
            }
            this.id_private.id_class(new rZq_1(an_32, rhd_32.h()));
        } else {
            this.id_private.id_class(new rZq_1(an_32, rhd_32.h()));
            if (bl) {
                rhd_32.id_class(rpm_3.MAIN_HAND);
            }
        }
        if (this.id_final != rRl_1.SPECTATOR) {
            rhd_32.id_throw(an_32);
            rhd_32.sg();
        }
    }

    public float id_byte() {
        return this.id_final.id_throws() ? 5.0f : 4.5f;
    }

    public void id_byte(rhd_3 rhd_32) {
        this.id_new();
        this.id_private.id_class(new rZb_1(rZM.RELEASE_USE_ITEM, rfH_2.id_protected, rpr_3.DOWN));
        rhd_32.SC();
    }

    public void id_byte(int n) {
        this.id_native = n;
    }

    public void id_int() {
        if (!((cb_3)this.id_catch.id_class[57]).id_native()) {
            this.id_new();
            ((Aq_1)((cb_3)this.id_catch.id_class[57]).id_break[0]).id_class(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.id_protected, rpr_3.DOWN));
        }
    }

    public Ax_1(QY qY, Aq_1 aq_1) {
        this.id_catch = qY;
        this.id_private = aq_1;
        rme_3.id_class = 0;
    }

    public void id_class(int n, rkw_3<?> rkw_32, boolean bl) {
        this.id_private.id_class(new rZE(n, rkw_32, bl));
    }

    public void id_class(int n, int n2) {
        this.id_private.id_class(new rmK_2(n, n2));
    }

    public void id_class(rdn_3 rdn_32, int n) {
        if (this.id_final.id_throws()) {
            this.id_private.id_class(new rmR_2(n, rdn_32));
        }
    }

    public void id_class(rdn_3 rdn_32) {
        if (this.id_final.id_throws() && !rdn_32.id_class()) {
            this.id_private.id_class(new rmR_2(-1, rdn_32));
        }
    }

    public ryZ_2 id_class(rhd_3 rhd_32, an_3 an_32, rpm_3 rpm_32) {
        this.id_new();
        if (an_32 instanceof iB_2) {
            iB_2 iB_22 = (iB_2)an_32;
            if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLe_1.id_class(iB_22, rpm_32)).id_byte()) {
                return ryZ_2.PASS;
            }
        }
        this.id_private.id_class(new rZq_1(an_32, rpm_32, rhd_32.h()));
        return this.id_final == rRl_1.SPECTATOR ? ryZ_2.PASS : rhd_32.id_class(an_32, rpm_32);
    }

    public ryZ_2 id_class(rhd_3 rhd_32, an_3 an_32, rfo_3 rfo_32, rpm_3 rpm_32) {
        rrTR rrTR2;
        this.id_new();
        if (an_32 instanceof iB_2) {
            rrTR2 = (iB_2)an_32;
            if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLe_1.id_class(rrTR2, rpm_32)).id_byte()) {
                return ryZ_2.PASS;
            }
        }
        rrTR2 = rfo_32.id_case().id_class(an_32.rx(), an_32.re(), an_32.BO());
        this.id_private.id_class(new rZq_1(an_32, rpm_32, (rjU_2)rrTR2, rhd_32.h()));
        return this.id_final == rRl_1.SPECTATOR ? ryZ_2.PASS : an_32.id_class(rhd_32, (rjU_2)rrTR2, rpm_32);
    }

    public void id_class(int n, int n2, int n3, rXa_1 rXa_12, boolean bl) {
        if (rrAK.id_break(n, n2, n3, rXa_12).id_byte()) {
            return;
        }
        short s = ((rJr_1)((cb_3)this.id_catch.id_class[57]).id_implements[4]).id_class((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]);
        rdn_3 rdn_32 = ((rJr_1)((cb_3)this.id_catch.id_class[57]).id_implements[4]).id_class(n2, n3, rXa_12, (cb_3)this.id_catch.id_class[57]);
        rdn_3 rdn_33 = bl && rXa_12.id_class() ? new rdn_3(rdy_3.id_class) : rdn_32;
        this.id_private.id_class(new rmt_3(n, n2, n3, rXa_12, rdn_33, s));
        rrAg_1.id_break(n, n2, n3, s, rXa_12, rdn_32);
    }

    public void id_class(int n, int n2, int n3, rXa_1 rXa_12) {
        this.id_class(n, n2, n3, rXa_12, new rdn_3(rdy_3.id_class));
    }

    public void id_class(gm_3 gm_32, rfH_2 rfH_22, xc_3 xc_32, rZM rZM2, boolean bl) {
        rjU_2 rjU_22 = (rjU_2)this.id_int.remove((Object)Pair.of((Object)rfH_22, (Object)((Object)rZM2)));
        xc_3 xc_33 = gm_32.id_byte(rfH_22);
        if ((rjU_22 == null || !bl || rZM2 != rZM.START_DESTROY_BLOCK && xc_33 != xc_32) && xc_33 != xc_32) {
            gm_32.id_class(rfH_22, xc_32);
            cb_3 cb_32 = (cb_3)this.id_catch.id_class[57];
            if (rjU_22 != null && gm_32 == (rYB)cb_32.id_throws[7] && cb_32.id_class(rfH_22, xc_32)) {
                cb_32.id_package(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
            }
        }
        while (this.id_int.size() >= 50) {
            this.id_int.removeFirst();
        }
    }

    public void id_class(boolean bl) {
        this.id_volatile = bl;
    }

    public void id_class(rhd_3 rhd_32) {
        this.id_final.id_class((rhx_3)rhd_32.id_implements[18]);
    }

    public void id_class(int n, int n2, int n3, rXa_1 rXa_12, rdn_3 rdn_32) {
        short s = ((rJr_1)((cb_3)this.id_catch.id_class[57]).id_implements[4]).id_class((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]);
        this.id_private.id_class(new rmt_3(n, n2, n3, rXa_12, rdn_32, s));
    }

    private void id_class(rZM rZM2, rfH_2 rfH_22, rpr_3 rpr_32) {
        cb_3 cb_32 = (cb_3)this.id_catch.id_class[57];
        this.id_int.put((Object)Pair.of((Object)rfH_22, (Object)((Object)rZM2)), (Object)cb_32.Ps());
        this.id_private.id_class(new rZb_1(rZM2, rfH_22, rpr_32));
    }

    public void id_class(int n) {
        this.id_private.id_class(new rZs_1(n));
        this.id_protected = System.currentTimeMillis();
    }

    public void id_class(rRl_1 rRl_12) {
        this.id_package = rRl_12;
    }

    public cb_3 id_class(gm_3 gm_32, rlP_2 rlP_22, VR vR) {
        return this.id_class(gm_32, rlP_22, vR, false, false);
    }

    public ryZ_2 id_class(rpm_3 rpm_32) {
        boolean bl;
        if (this.id_final == rRl_1.SPECTATOR) {
            return ryZ_2.PASS;
        }
        cb_3 cb_32 = (cb_3)this.id_catch.id_class[57];
        this.id_new();
        rdn_3 rdn_32 = cb_32.id_protected(rpm_32);
        boolean bl2 = cb_32.sK().id_class(rdn_32.id_break());
        boolean bl3 = bl = (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) && rdn_32.id_break() == rdy_3.kU;
        if (bl2 && bl && rxm_3.id_protected(rdn_32)) {
            return ryZ_2.PASS;
        }
        if (rrjA_2.id_protected().id_throws().id_byte(ProtocolVersion.v1_17_1)) {
            this.id_private.id_class(new rZX(cb_32.rx(), cb_32.re(), cb_32.BO(), ((Float)cb_32.id_throws[15]).floatValue(), ((Float)cb_32.id_throws[16]).floatValue(), cb_32.BL()));
        }
        this.id_private.id_class(new rZd_1(rpm_32));
        if (bl2 && !bl) {
            return ryZ_2.PASS;
        }
        rym_3<rdn_3> rym_32 = rdn_32.id_class((rYB)((gm_3)this.id_catch.id_class[56]), (rhd_3)cb_32, rpm_32);
        rdn_3 rdn_33 = rym_32.id_break();
        if (rdn_33 != rdn_32) {
            cb_32.id_class(rpm_32, rdn_33);
        }
        return rym_32.id_class();
    }

    public ryZ_2 id_class(cb_3 cb_32, gm_3 gm_32, rpm_3 rpm_32, rff_3 rff_32) {
        Object object;
        boolean bl;
        rfH_2 rfH_22 = rff_32.id_class();
        this.id_new();
        if (!((gm_3)this.id_catch.id_class[56]).id_instanceof().id_class(rfH_22)) {
            return ryZ_2.FAIL;
        }
        rdn_3 rdn_32 = cb_32.id_protected(rpm_32);
        xd_3 xd_32 = rrjc_3.id_protected(rfH_22);
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAR.id_class(rdn_32, rff_32, xd_32, rpm_32)).id_byte()) {
            return ryZ_2.PASS;
        }
        if (this.id_final == rRl_1.SPECTATOR) {
            this.id_private.id_class(new rZx_1(rpm_32, rff_32));
            return ryZ_2.SUCCESS;
        }
        boolean bl2 = !cb_32.ss().id_class() || !cb_32.Sn().id_class();
        boolean bl3 = bl = cb_32.sN() && bl2;
        if (!bl) {
            object = gm_32.id_byte(rfH_22).id_class((rYB)gm_32, cb_32, rpm_32, rff_32);
            if (cb_32.sK().id_class(rdn_32.id_break())) {
                return ryZ_2.PASS;
            }
            if (object.id_class()) {
                this.id_private.id_class(new rZx_1(rpm_32, rff_32));
                return object;
            }
        }
        this.id_private.id_class(new rZx_1(rpm_32, rff_32));
        if (!rdn_32.id_class() && !cb_32.sK().id_class(rdn_32.id_break())) {
            ryZ_2 ryZ_22;
            object = new rdH_2(cb_32, rpm_32, rff_32);
            if (this.id_final.id_throws()) {
                int n = rdn_32.id_char();
                ryZ_22 = rdn_32.id_class((rdH_2)object);
                rdn_32.id_throws(n);
            } else {
                ryZ_22 = rdn_32.id_class((rdH_2)object);
            }
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAI.id_class(rdn_32, rfH_22, xd_32, ryZ_22));
            return ryZ_22;
        }
        return ryZ_2.PASS;
    }

    public boolean id_class(rfH_2 rfH_22, rpr_3 rpr_32, boolean bl) {
        rrLp_1 rrLp_12 = rrLp_1.id_class((rrLq_1)((Object)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[0]), rfH_22, rpr_32, ((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_class.get(((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_protected), 5);
        if (rrLp_12.id_byte()) {
            return false;
        }
        if (((cb_3)this.id_catch.id_class[57]).id_class((gm_3)this.id_catch.id_class[56], rfH_22, this.id_final)) {
            return false;
        }
        if (!((gm_3)this.id_catch.id_class[56]).id_instanceof().id_class(rfH_22)) {
            return false;
        }
        if (this.id_final.id_throws()) {
            this.id_class(rZM.START_DESTROY_BLOCK, rfH_22, rpr_32);
            this.id_class(rfH_22, bl);
            this.id_native = rrLp_12.id_break();
        } else if (!this.id_volatile || !this.id_class(rfH_22)) {
            boolean bl2;
            if (this.id_volatile) {
                this.id_class(rZM.ABORT_DESTROY_BLOCK, this.id_implements, rpr_32);
            }
            xc_3 xc_32 = ((gm_3)this.id_catch.id_class[56]).id_byte(rfH_22);
            this.id_class(rZM.START_DESTROY_BLOCK, rfH_22, rpr_32);
            boolean bl3 = bl2 = !xc_32.id_catch();
            if (bl2 && this.id_class == 0.0f) {
                xc_32.id_class((rYB)((gm_3)this.id_catch.id_class[56]), rfH_22, (cb_3)this.id_catch.id_class[57]);
            }
            if (bl2 && xc_32.id_class((cb_3)this.id_catch.id_class[57], (rYB)((cb_3)this.id_catch.id_class[57]).id_throws[7], rfH_22) >= 1.0f) {
                this.id_class(rfH_22, bl);
                rrLp_1.id_class((rrLq_1)((Object)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2]), rfH_22, rpr_32, ((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_class.get(((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_protected), 5);
            } else {
                this.id_volatile = true;
                this.id_implements = rfH_22;
                this.id_finally = ((cb_3)this.id_catch.id_class[57]).ss();
                this.id_class = 0.0f;
                this.id_extends = 0.0f;
                ((gm_3)this.id_catch.id_class[56]).id_class(((cb_3)this.id_catch.id_class[57]).V(), this.id_implements, (int)(this.id_class * 10.0f) - 1);
            }
        }
        return true;
    }

    private boolean id_class(rfH_2 rfH_22) {
        boolean bl;
        rdn_3 rdn_32 = ((cb_3)this.id_catch.id_class[57]).ss();
        boolean bl2 = bl = this.id_finally.id_class() && rdn_32.id_class();
        if (!this.id_finally.id_class() && !rdn_32.id_class()) {
            bl = rdn_32.id_break() == this.id_finally.id_break() && rdn_3.id_class(rdn_32, this.id_finally) && (rdn_32.id_throws() || rdn_32.id_catch() == this.id_finally.id_catch());
        }
        return rfH_22.equals(this.id_implements) && bl;
    }

    public boolean id_class(rfH_2 rfH_22, boolean bl) {
        boolean bl2;
        if (((cb_3)this.id_catch.id_class[57]).id_class((gm_3)this.id_catch.id_class[56], rfH_22, this.id_final)) {
            return false;
        }
        gm_3 gm_32 = (gm_3)this.id_catch.id_class[56];
        xc_3 xc_32 = gm_32.id_byte(rfH_22);
        if (!((cb_3)this.id_catch.id_class[57]).ss().id_break().id_class(xc_32, (rYB)gm_32, rfH_22, (cb_3)this.id_catch.id_class[57])) {
            return false;
        }
        xd_3 xd_32 = xc_32.id_break();
        if ((xd_32 instanceof xK_2 || xd_32 instanceof zx_3 || xd_32 instanceof kW_2) && !((cb_3)this.id_catch.id_class[57]).sU()) {
            return false;
        }
        if (xc_32.id_catch()) {
            return false;
        }
        xd_32.id_class((rYB)gm_32, rfH_22, xc_32, (rhd_3)((cb_3)this.id_catch.id_class[57]));
        rXE rXE2 = gm_32.id_break(rfH_22);
        boolean bl3 = bl2 = bl && ((rYB)gm_32).id_class(rfH_22, rXE2.id_catch(), 11);
        if (bl2) {
            xd_32.id_class((rRg_1)gm_32, rfH_22, xc_32);
        }
        return false;
    }

    public void id_class(rhd_3 rhd_32, an_3 an_32, boolean bl) {
        rrFj_1 rrFj_12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrFj_1.id_class(an_32));
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(rrFj_12);
        if (rrFj_12.id_byte()) {
            return;
        }
        this.id_byte(rhd_32, an_32, bl);
        rrFf_1 rrFf_12 = rrFf_1.id_class(an_32);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrFf_12);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(rrFf_12);
    }

    public boolean id_class() {
        return this.id_final.id_case();
    }

    public cb_3 id_class(gm_3 gm_32, rlP_2 rlP_22, VR vR, boolean bl, boolean bl2) {
        return new cb_3(this.id_catch, gm_32, this.id_private, rlP_22, vR, bl, bl2);
    }

    public boolean id_break(rfH_2 rfH_22, rpr_3 rpr_32, boolean bl) {
        rrLp_1 rrLp_12 = rrLp_1.id_class((rrLq_1)((Object)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[1]), rfH_22, rpr_32, ((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_class.get(((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_protected), 5);
        if (rrLp_12.id_byte()) {
            return false;
        }
        this.id_new();
        if (this.id_native > 0) {
            --this.id_native;
            return true;
        }
        if (this.id_final.id_throws() && ((gm_3)this.id_catch.id_class[56]).id_instanceof().id_class(rfH_22)) {
            this.id_native = rrLp_12.id_break();
            this.id_class(rZM.START_DESTROY_BLOCK, rfH_22, rpr_32);
            this.id_class(rfH_22, bl);
            rrLp_1.id_class((rrLq_1)((Object)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2]), rfH_22, rpr_32, ((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_class.get(((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_protected), 5);
            return true;
        }
        if (this.id_class(rfH_22)) {
            Object object;
            xc_3 xc_32 = ((gm_3)this.id_catch.id_class[56]).id_byte(rfH_22);
            if (xc_32.id_catch()) {
                this.id_volatile = false;
                return false;
            }
            this.id_class += xc_32.id_class((cb_3)this.id_catch.id_class[57], (rYB)((cb_3)this.id_catch.id_class[57]).id_throws[7], rfH_22);
            if (this.id_extends % 4.0f == 0.0f) {
                object = xc_32.id_package();
                this.id_catch.c().id_class(new Np_1(((zr_3)object).id_case(), rqL_2.BLOCKS, (((zr_3)object).id_class() + 1.0f) / 8.0f, ((zr_3)object).id_break() * 0.5f, rfH_22));
            }
            this.id_extends += 1.0f;
            object = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLT.id_class(1.0f));
            if (this.id_class >= ((rrLT)object).id_class()) {
                rrLp_1.id_class((rrLq_1)((Object)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2]), rfH_22, rpr_32, ((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_class.get(((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_protected), rrLp_12.id_break());
                this.id_volatile = false;
                this.id_class(rZM.STOP_DESTROY_BLOCK, rfH_22, rpr_32);
                this.id_class(rfH_22, bl);
                this.id_class = 0.0f;
                this.id_extends = 0.0f;
                this.id_native = rrLp_12.id_break();
            }
            ((gm_3)this.id_catch.id_class[56]).id_class(((cb_3)this.id_catch.id_class[57]).V(), this.id_implements, (int)(this.id_class * 10.0f) - 1);
            return true;
        }
        return this.id_class(rfH_22, rpr_32, bl);
    }

    public void id_break(int n) {
        this.id_private.id_break(new rZs_1(n));
    }

    public void id_break(rhd_3 rhd_32, an_3 an_32, boolean bl) {
        this.id_byte(rhd_32, an_32, bl);
    }

    public ryZ_2 id_break(cb_3 cb_32, gm_3 gm_32, rpm_3 rpm_32, rff_3 rff_32) {
        Object object;
        boolean bl;
        rfH_2 rfH_22 = rff_32.id_class();
        this.id_new();
        if (!((gm_3)this.id_catch.id_class[56]).id_instanceof().id_class(rfH_22)) {
            return ryZ_2.FAIL;
        }
        rdn_3 rdn_32 = cb_32.id_protected(rpm_32);
        if (this.id_final == rRl_1.SPECTATOR) {
            this.id_private.id_class(new rZx_1(rpm_32, rff_32));
            return ryZ_2.SUCCESS;
        }
        boolean bl2 = !cb_32.ss().id_class() || !cb_32.Sn().id_class();
        boolean bl3 = bl = cb_32.sN() && bl2;
        if (!bl) {
            object = gm_32.id_byte(rfH_22).id_class((rYB)gm_32, cb_32, rpm_32, rff_32);
            if (cb_32.sK().id_class(rdn_32.id_break())) {
                return ryZ_2.PASS;
            }
            if (object.id_class()) {
                this.id_private.id_class(new rZx_1(rpm_32, rff_32));
                return object;
            }
        }
        this.id_private.id_class(new rZx_1(rpm_32, rff_32));
        if (!rdn_32.id_class() && !cb_32.sK().id_class(rdn_32.id_break())) {
            ryZ_2 ryZ_22;
            object = new rdH_2(cb_32, rpm_32, rff_32);
            if (this.id_final.id_throws()) {
                int n = rdn_32.id_char();
                ryZ_22 = rdn_32.id_class((rdH_2)object);
                rdn_32.id_throws(n);
            } else {
                ryZ_22 = rdn_32.id_class((rdH_2)object);
            }
            return ryZ_22;
        }
        return ryZ_2.PASS;
    }

    public void id_break(rRl_1 rRl_12) {
        if (rRl_12 != this.id_final) {
            this.id_package = this.id_final;
        }
        this.id_final = rRl_12;
        this.id_final.id_class((rhx_3)((cb_3)this.id_catch.id_class[57]).id_implements[18]);
    }

    public void id_break(rhd_3 rhd_32) {
        this.id_new();
        rpm_3 rpm_32 = ((cb_3)this.id_catch.id_class[57]).P();
        rdn_3 rdn_32 = ((cb_3)this.id_catch.id_class[57]).sX();
        if (rhd_32 == (cb_3)this.id_catch.id_class[57] && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAC.id_class((Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]), rdn_32, rpm_32)).id_byte()) {
            return;
        }
        this.id_private.id_class(new rZb_1(rZM.RELEASE_USE_ITEM, rfH_2.id_protected, rpr_3.DOWN));
        rhd_32.SC();
        if (rhd_32 == (cb_3)this.id_catch.id_class[57]) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAC.id_class((Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1]), rdn_32, rpm_32));
        }
    }

    public void id_break() {
        if (this.id_volatile) {
            this.id_class(rZM.ABORT_DESTROY_BLOCK, this.id_implements, rpr_3.DOWN);
            this.id_class = 0.0f;
            ((gm_3)this.id_catch.id_class[56]).id_class(((cb_3)this.id_catch.id_class[57]).V(), this.id_implements, -1);
            ((cb_3)this.id_catch.id_class[57]).sg();
            this.id_volatile = false;
        }
    }

    public void id_break(int n, int n2, int n3, rXa_1 rXa_12, boolean bl) {
        short s = ((rJr_1)((cb_3)this.id_catch.id_class[57]).id_implements[4]).id_class((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]);
        rdn_3 rdn_32 = ((rJr_1)((cb_3)this.id_catch.id_class[57]).id_implements[4]).id_class(n2, n3, rXa_12, (cb_3)this.id_catch.id_class[57]);
        rdn_3 rdn_33 = bl && rXa_12.id_class() ? new rdn_3(rdy_3.id_class) : rdn_32;
        this.id_private.id_class(new rmt_3(n, n2, n3, rXa_12, rdn_33, s));
    }

    public boolean id_throws() {
        return this.id_final.id_case();
    }

    public boolean id_finally() {
        return this.id_final == rRl_1.SPECTATOR;
    }

    public boolean id_catch() {
        return this.id_final.id_throws();
    }

    public rRl_1 id_extends() {
        return this.id_package;
    }

    public boolean id_case() {
        return !this.id_final.id_throws();
    }

    public boolean id_implements() {
        return ((cb_3)this.id_catch.id_class[57]).Pm() && ((cb_3)this.id_catch.id_class[57]).ra() instanceof rOD;
    }

    private void id_new() {
        int n = ((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_protected;
        if (n != this.id_break && rme_3.id_class != n) {
            this.id_break = n;
            this.id_private.id_class(new rme_3(this.id_break));
            this.id_protected = System.currentTimeMillis();
        }
    }

    public void id_package() {
        this.id_new();
    }

    public void id_protected() {
        this.id_new();
        if (this.id_private.id_class().id_case()) {
            this.id_private.id_class().id_class();
        } else {
            this.id_private.id_class().id_native();
        }
    }

    public boolean id_private() {
        return this.id_final.id_throws();
    }

    public rfH_2 id_final() {
        return this.id_implements;
    }

    public boolean id_volatile() {
        return this.id_volatile;
    }

    public rRl_1 id_native() {
        return this.id_final;
    }
}

