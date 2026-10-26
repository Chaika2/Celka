/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.am_3;
import celestial.an_3;
import celestial.ap_3;
import celestial.au_3;
import celestial.eX_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBJ;
import celestial.rBX;
import celestial.rBY;
import celestial.rBZ;
import celestial.rLD;
import celestial.rLL;
import celestial.rLY;
import celestial.rLp_1;
import celestial.rLy_1;
import celestial.rMY;
import celestial.rMm_1;
import celestial.rOh_1;
import celestial.rPV;
import celestial.rRO;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rSG;
import celestial.rSb_1;
import celestial.rSd_1;
import celestial.rYB;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rls_3;
import celestial.rmE_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;

public class rMR
extends rOh_1
implements rMm_1 {
    private static final rut_3<Integer> id_goto = rmE_2.id_class(rMR.class, ruw_3.id_break);
    private static final Predicate<is_3> id_while = new rMY();
    private static final rdb_3 id_try = rdy_3.Jh;
    private static final Set<rdb_3> id_instanceof = Sets.newHashSet((Object[])new rdb_3[]{rdy_3.hP, rdy_3.JW, rdy_3.Jk, rdy_3.kJ});
    public static final Map<aI_2<?>, rqA_2> id_throw = rqR_2.id_class(Maps.newHashMap(), (T hashMap) -> {
        hashMap.put(aI_2.id_case, rqn_3.OG);
        hashMap.put(aI_2.id_implements, rqn_3.On);
        hashMap.put(aI_2.id_volatile, rqn_3.Ob);
        hashMap.put(aI_2.id_new, rqn_3.OM);
        hashMap.put(aI_2.id_continue, rqn_3.OO);
        hashMap.put(aI_2.id_this, rqn_3.Oh);
        hashMap.put(aI_2.id_synchronized, rqn_3.OX);
        hashMap.put(aI_2.id_return, rqn_3.OJ);
        hashMap.put(aI_2.id_interface, rqn_3.Ox);
        hashMap.put(aI_2.id_abstract, rqn_3.Od);
        hashMap.put(aI_2.id_long, rqn_3.Ok);
        hashMap.put(aI_2.id_void, rqn_3.OW);
        hashMap.put(aI_2.id_static, rqn_3.Oz);
        hashMap.put(aI_2.id_double, rqn_3.OQ);
        hashMap.put(aI_2.J, rqn_3.ON);
        hashMap.put(aI_2.d, rqn_3.Oc);
        hashMap.put(aI_2.k, rqn_3.Ou);
        hashMap.put(aI_2.W, rqn_3.Om);
        hashMap.put(aI_2.u, rqn_3.OZ);
        hashMap.put(aI_2.v, rqn_3.Ov);
        hashMap.put(aI_2.L, rqn_3.OF);
        hashMap.put(aI_2.A, rqn_3.OL);
        hashMap.put(aI_2.C, rqn_3.OA);
        hashMap.put(aI_2.q, rqn_3.On);
        hashMap.put(aI_2.t, rqn_3.OC);
        hashMap.put(aI_2.K, rqn_3.Ol);
        hashMap.put(aI_2.U, rqn_3.OH);
        hashMap.put(aI_2.a, rqn_3.Oy);
        hashMap.put(aI_2.i, rqn_3.Op);
        hashMap.put(aI_2.rr, rqn_3.Oq);
        hashMap.put(aI_2.rS, rqn_3.OT);
        hashMap.put(aI_2.rs, rqn_3.Ot);
        hashMap.put(aI_2.rG, rqn_3.Ow);
    });
    public float id_super;
    public float id_this;
    public float id_else;
    public float id_synchronized;
    private float id_interface = 1.0f;
    private boolean id_char;
    private rfH_2 id_abstract;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.OE;
    }

    public rMR(aI_2<? extends rMR> aI_22, rYB rYB2) {
        super((aI_2<? extends rOh_1>)aI_22, rYB2);
        this.id_native = new rPV(this, 10, false);
        this.id_class(rLp_1.DANGER_FIRE, -1.0f);
        this.id_class(rLp_1.DAMAGE_FIRE, -1.0f);
        this.id_class(rLp_1.COCOA, -1.0f);
    }

    public boolean n() {
        return this.id_char;
    }

    @Override
    public au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return null;
    }

    @Override
    public boolean id_class(rbZ_2 rbZ_22) {
        return false;
    }

    @Override
    public boolean id_class(float f, float f2) {
        return false;
    }

    @Override
    protected void id_class(double d, boolean bl, xc_3 xc_32, rfH_2 rfH_22) {
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Variant", this.sJ());
    }

    public static float id_class(Random random) {
        return (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f;
    }

    public static rqA_2 id_class(rYB rYB2, Random random) {
        if (rYB2.id_abstract() != rRO.PEACEFUL && random.nextInt(1000) == 0) {
            ArrayList arrayList = Lists.newArrayList(id_throw.keySet());
            return rMR.id_break((aI_2)arrayList.get(random.nextInt(arrayList.size())));
        }
        return rqn_3.OP;
    }

    public static boolean id_class(rYB rYB2, an_3 an_32) {
        if (an_32.BM() && !an_32.BF() && rYB2.id_int.nextInt(2) == 0) {
            is_3 is_32;
            List<is_3> list = rYB2.id_class(is_3.class, an_32.rN().id_class(20.0), id_while);
            if (!list.isEmpty() && !(is_32 = list.get(rYB2.id_int.nextInt(list.size()))).BF()) {
                rqA_2 rqA_22 = rMR.id_break(is_32.BC());
                rYB2.id_class((rhd_3)null, an_32.rx(), an_32.re(), an_32.BO(), rqA_22, an_32.Pr(), 0.7f, rMR.id_class(rYB2.id_int));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        this.id_else(((Random)this.id_throws[40]).nextInt(5));
        if (aU_22 == null) {
            aU_22 = new am_3(false);
        }
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public void id_class(rfH_2 rfH_22, boolean bl) {
        this.id_abstract = rfH_22;
        this.id_char = bl;
    }

    private void sc() {
        this.id_synchronized = this.id_super;
        this.id_else = this.id_this;
        this.id_this = (float)((double)this.id_this + (double)((Boolean)this.id_throws[20] == false && !this.Pm() ? 4 : -1) * 0.3);
        this.id_this = rfU_2.id_class(this.id_this, 0.0f, 1.0f);
        if (!((Boolean)this.id_throws[20]).booleanValue() && this.id_interface < 1.0f) {
            this.id_interface = 1.0f;
        }
        this.id_interface = (float)((double)this.id_interface * 0.9);
        rjU_2 rjU_22 = this.rv();
        if (!((Boolean)this.id_throws[20]).booleanValue() && rjU_22.id_byte < 0.0) {
            this.id_byte(rjU_22.id_throws(1.0, 0.6, 1.0));
        }
        this.id_super += this.id_interface * 2.0f;
    }

    @Override
    public void id_default() {
        if (this.id_abstract == null || !this.id_abstract.id_class((eX_2)this.Ps(), 3.46) || !((rYB)this.id_throws[7]).id_byte(this.id_abstract).id_class(xu_3.Pj)) {
            this.id_char = false;
            this.id_abstract = null;
        }
        if (((rYB)this.id_throws[7]).id_int.nextInt(400) == 0) {
            rMR.id_class((rYB)this.id_throws[7], this);
        }
        super.id_default();
        this.sc();
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.OI, 0.15f, 1.0f);
    }

    private static rqA_2 id_break(aI_2<?> aI_22) {
        return id_throw.getOrDefault(aI_22, rqn_3.OP);
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return ap_32.id_break * 0.6f;
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        this.id_goto(false);
        return super.id_break(rye_32, f);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_else(rcd_32.id_private("Variant"));
    }

    @Override
    protected rLy_1 id_break(rYB rYB2) {
        rLL rLL2 = new rLL(this, rYB2);
        rLL2.id_class(false);
        rLL2.id_byte(true);
        rLL2.id_break(true);
        return rLL2;
    }

    public static boolean id_break(aI_2<rMR> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        xc_3 xc_32 = rRg_12.id_byte(rfH_22.id_break());
        return (xc_32.id_class(rls_3.id_void) || xc_32.id_class(xu_3.id_implements) || xc_32.id_class(rls_3.id_super) || xc_32.id_class(xu_3.id_class)) && rRg_12.id_class(rfH_22, 0) > 8;
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (!this.sZ() && id_instanceof.contains(rdn_32.id_break())) {
            if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                rdn_32.id_catch(1);
            }
            if (!this.BF()) {
                ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.OS, this.Pr(), 1.0f, 1.0f + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f);
            }
            if (!((rYB)this.id_throws[7]).id_continue) {
                if (((Random)this.id_throws[40]).nextInt(10) == 0) {
                    this.id_case(rhd_32);
                    ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)7);
                } else {
                    ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)6);
                }
            }
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        if (rdn_32.id_break() == id_try) {
            if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                rdn_32.id_catch(1);
            }
            this.id_break(new rLY(rLD.id_super, 900));
            if (rhd_32.id_implements() || !this.rg()) {
                this.id_break(rye_3.id_class(rhd_32), Float.MAX_VALUE);
            }
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        if (!this.sx() && this.sZ() && this.id_private(rhd_32)) {
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.id_goto(!this.sL());
            }
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        return super.id_break(rhd_32, rpm_32);
    }

    public static iz_3 L() {
        return is_3.id_package().id_class(iQ_2.id_class, 6.0).id_class(iQ_2.id_throws, 0.4f).id_class(iQ_2.id_protected, 0.2f);
    }

    public boolean sx() {
        return (Boolean)this.id_throws[20] == false;
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return false;
    }

    public void id_else(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_goto, n);
    }

    @Override
    protected void id_instanceof(an_3 an_32) {
        if (!(an_32 instanceof rhd_3)) {
            super.id_instanceof(an_32);
        }
    }

    @Override
    public rqA_2 id_static() {
        return rMR.id_class((rYB)this.id_throws[7], ((rYB)this.id_throws[7]).id_int);
    }

    @Override
    public boolean id_public(an_3 an_32) {
        return an_32.id_break(rye_3.id_byte(this), 3.0f);
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(0, new rBY(this, 1.25));
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(1, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(2, new rSG(this));
        this.id_package.id_class(2, new rBJ(this, 1.0, 5.0f, 1.0f, true));
        this.id_package.id_class(2, new rSd_1(this, 1.0));
        this.id_package.id_class(3, new rBZ(this));
        this.id_package.id_class(3, new rBX(this, 1.0, 3.0f, 7.0f));
    }

    @Override
    protected float id_final(float f) {
        this.id_class(rqn_3.Os, 0.15f, 1.0f);
        return f + this.id_this / 2.0f;
    }

    @Override
    protected boolean PJ() {
        return true;
    }

    @Override
    public boolean rG() {
        return true;
    }

    @Override
    public rqL_2 Pr() {
        return rqL_2.NEUTRAL;
    }

    @Override
    public rjU_2 BA() {
        return new rjU_2(0.0, 0.5f * this.Bx(), this.PN() * 0.4f);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.OB;
    }

    public int sJ() {
        return rfU_2.id_class((int)((rmE_2)this.id_throws[49]).id_class(id_goto), 0, 4);
    }

    @Override
    protected float SN() {
        return rMR.id_class((Random)this.id_throws[40]);
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_goto, 0);
    }

    @Override
    public boolean n_() {
        return false;
    }
}

