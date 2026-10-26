/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.au_3;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBB;
import celestial.rBJ;
import celestial.rBP;
import celestial.rBS;
import celestial.rBf_1;
import celestial.rBj_1;
import celestial.rBv_1;
import celestial.rMi_1;
import celestial.rON;
import celestial.rOQ;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rSG;
import celestial.rSO;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rbV_2;
import celestial.rbZ_2;
import celestial.rbg_3;
import celestial.rbj_3;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rkg_3;
import celestial.rmE_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rrrZ;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rxA_2;
import celestial.rxL_2;
import celestial.ryZ_2;
import celestial.rye_3;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;

public class rbf_3
extends rOQ {
    private static final rkg_3 id_this = rkg_3.id_class(rdy_3.Xz, rdy_3.XQ);
    private static final rut_3<Integer> id_else = rmE_2.id_class(rbf_3.class, ruw_3.id_break);
    private static final rut_3<Boolean> id_synchronized = rmE_2.id_class(rbf_3.class, ruw_3.id_implements);
    private static final rut_3<Boolean> id_goto = rmE_2.id_class(rbf_3.class, ruw_3.id_implements);
    private static final rut_3<Integer> id_while = rmE_2.id_class(rbf_3.class, ruw_3.id_break);
    public static final Map<Integer, rqO_2> id_super = rqR_2.id_class(Maps.newHashMap(), hashMap -> {
        hashMap.put(0, new rqO_2("textures/entity/cat/tabby.png"));
        hashMap.put(1, new rqO_2("textures/entity/cat/black.png"));
        hashMap.put(2, new rqO_2("textures/entity/cat/red.png"));
        hashMap.put(3, new rqO_2("textures/entity/cat/siamese.png"));
        hashMap.put(4, new rqO_2("textures/entity/cat/british_shorthair.png"));
        hashMap.put(5, new rqO_2("textures/entity/cat/calico.png"));
        hashMap.put(6, new rqO_2("textures/entity/cat/persian.png"));
        hashMap.put(7, new rqO_2("textures/entity/cat/ragdoll.png"));
        hashMap.put(8, new rqO_2("textures/entity/cat/white.png"));
        hashMap.put(9, new rqO_2("textures/entity/cat/jellie.png"));
        hashMap.put(10, new rqO_2("textures/entity/cat/all_black.png"));
    });
    private rbj_3<rhd_3> id_try;
    private rSO id_instanceof;
    private float id_throw;
    private float id_interface;
    private float id_char;
    private float id_abstract;
    private float id_long;
    private float id_float;

    @Override
    public int id_char() {
        return 120;
    }

    public float id_char(float f) {
        return rfU_2.id_catch(f, this.id_float, this.id_long);
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.rn;
    }

    @Override
    public void id_double() {
        if (this.id_super().id_break()) {
            double d = this.id_super().id_byte();
            if (d == 0.6) {
                this.id_class(iM_2.CROUCHING);
                this.c_(false);
            } else if (d == 1.33) {
                this.id_class(iM_2.STANDING);
                this.c_(true);
            } else {
                this.id_class(iM_2.STANDING);
                this.c_(false);
            }
        } else {
            this.id_class(iM_2.STANDING);
            this.c_(false);
        }
    }

    public rbf_3(aI_2<? extends rbf_3> aI_22, rYB rYB2) {
        super((aI_2<? extends rOQ>)aI_22, rYB2);
    }

    public void id_this(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_synchronized, bl);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (this.id_instanceof != null && this.id_instanceof.id_private() && !this.sZ() && (Integer)this.id_throws[41] % 100 == 0) {
            this.id_class(rqn_3.rA, 1.0f, 1.0f);
        }
        this.sn();
    }

    private void sl() {
        this.id_float = this.id_long;
        this.id_long = this.sx() ? Math.min(1.0f, this.id_long + 0.1f) : Math.max(0.0f, this.id_long - 0.13f);
    }

    public int n() {
        return ((rmE_2)this.id_throws[49]).id_class(id_else);
    }

    public float id_interface(float f) {
        return rfU_2.id_catch(f, this.id_abstract, this.id_char);
    }

    @Override
    protected void id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        if (this.id_extends(rdn_32)) {
            this.id_class(rqn_3.rF, 1.0f, 1.0f);
        }
        super.id_class(rhd_32, rdn_32);
    }

    @Override
    public boolean id_class(rbZ_2 rbZ_22) {
        if (!this.sZ()) {
            return false;
        }
        if (!(rbZ_22 instanceof rbf_3)) {
            return false;
        }
        rbf_3 rbf_32 = (rbf_3)rbZ_22;
        return rbf_32.sZ() && super.id_class(rbZ_22);
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_break(rrEm_12, au_32);
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        aU_22 = super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
        if (rRf_12.id_interface() > 0.9f) {
            this.id_else(((Random)this.id_throws[40]).nextInt(11));
        } else {
            this.id_else(((Random)this.id_throws[40]).nextInt(10));
        }
        rrEm_1 rrEm_12 = rRf_12.id_byte();
        if (rrEm_12 instanceof rrEm_1 && rrEm_12.id_protected().id_class(this.Bs(), true, rrrZ.id_finally).id_throws()) {
            this.id_else(10);
            this.b();
        }
        return aU_22;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("CatType", this.n());
        rcd_32.id_class("CollarColor", (byte)this.sd().id_break());
    }

    public void id_class(rxL_2 rxL_22) {
        ((rmE_2)this.id_throws[49]).id_break(id_while, rxL_22.id_break());
    }

    @Override
    public boolean id_class(float f, float f2) {
        return false;
    }

    @Override
    protected void sm() {
        if (this.id_try == null) {
            this.id_try = new rbj_3<rhd_3>(this, rhd_3.class, 16.0f, 0.8, 1.33);
        }
        this.id_package.id_class(this.id_try);
        if (!this.sZ()) {
            this.id_package.id_class(4, this.id_try);
        }
    }

    public void sc() {
        this.id_class(rqn_3.rL, this.Si(), this.SN());
    }

    public rxL_2 sd() {
        return rxL_2.id_class(((rmE_2)this.id_throws[49]).id_class(id_while));
    }

    public rbf_3 id_break(rrEm_1 rrEm_12, au_3 au_32) {
        rbf_3 rbf_32 = aI_2.id_private.id_class(rrEm_12);
        if (au_32 instanceof rbf_3) {
            if (((Random)this.id_throws[40]).nextBoolean()) {
                rbf_32.id_else(this.n());
            } else {
                rbf_32.id_else(((rbf_3)au_32).n());
            }
            if (this.sZ()) {
                rbf_32.id_break(this.sv());
                rbf_32.id_return(true);
                if (((Random)this.id_throws[40]).nextBoolean()) {
                    rbf_32.id_class(this.sd());
                } else {
                    rbf_32.id_class(((rbf_3)au_32).sd());
                }
            }
        }
        return rbf_32;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_else(rcd_32.id_private("CatType"));
        if (rcd_32.id_byte("CollarColor", 99)) {
            this.id_class(rxL_2.id_class(rcd_32.id_private("CollarColor")));
        }
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return ap_32.id_break * 0.5f;
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        Enum enum_;
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rdb_3 rdb_32 = rdn_32.id_break();
        if (((rYB)this.id_throws[7]).id_continue) {
            if (this.sZ() && this.id_private(rhd_32)) {
                return ryZ_2.SUCCESS;
            }
            return !this.id_extends(rdn_32) || !(this.Ss() < this.SK()) && this.sZ() ? ryZ_2.PASS : ryZ_2.SUCCESS;
        }
        if (this.sZ()) {
            if (this.id_private(rhd_32)) {
                if (!(rdb_32 instanceof rxA_2)) {
                    if (rdb_32.id_super() && this.id_extends(rdn_32) && this.Ss() < this.SK()) {
                        this.id_class(rhd_32, rdn_32);
                        this.id_protected((float)rdb_32.id_this().id_class());
                        return ryZ_2.CONSUME;
                    }
                    ryZ_2 ryZ_22 = super.id_break(rhd_32, rpm_32);
                    if (!ryZ_22.id_class() || this.n_()) {
                        this.id_goto(!this.sL());
                    }
                    return ryZ_22;
                }
                enum_ = ((rxA_2)rdb_32).id_byte();
                if (enum_ != this.sd()) {
                    this.id_class((rxL_2)enum_);
                    if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                        rdn_32.id_catch(1);
                    }
                    this.b();
                    return ryZ_2.CONSUME;
                }
            }
        } else if (this.id_extends(rdn_32)) {
            this.id_class(rhd_32, rdn_32);
            if (((Random)this.id_throws[40]).nextInt(3) == 0) {
                this.id_case(rhd_32);
                this.id_goto(true);
                ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)7);
            } else {
                ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)6);
            }
            this.b();
            return ryZ_2.CONSUME;
        }
        if (((ryZ_2)(enum_ = super.id_break(rhd_32, rpm_32))).id_class()) {
            this.b();
        }
        return enum_;
    }

    public rqO_2 L() {
        return id_super.getOrDefault(this.n(), id_super.get(0));
    }

    public boolean sx() {
        return ((rmE_2)this.id_throws[49]).id_class(id_goto);
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return id_this.id_class(rdn_32);
    }

    public void id_else(int n) {
        if (n < 0 || n >= 11) {
            n = ((Random)this.id_throws[40]).nextInt(10);
        }
        ((rmE_2)this.id_throws[49]).id_break(id_else, n);
    }

    public void id_else(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_goto, bl);
    }

    public float id_throw(float f) {
        return rfU_2.id_catch(f, this.id_interface, this.id_throw);
    }

    @Override
    protected rqA_2 id_static() {
        if (this.sZ()) {
            if (this.sQ()) {
                return rqn_3.rC;
            }
            return ((Random)this.id_throws[40]).nextInt(4) == 0 ? rqn_3.rl : rqn_3.rm;
        }
        return rqn_3.rZ;
    }

    @Override
    public boolean id_public(an_3 an_32) {
        return an_32.id_break(rye_3.id_byte(this), this.sA());
    }

    @Override
    public boolean id_private(double d) {
        return !this.sZ() && (Integer)this.id_throws[41] > 2400;
    }

    @Override
    protected void id_final() {
        this.id_instanceof = new rbg_3(this, 0.6, id_this, true);
        this.id_package.id_class(1, new rSb_1(this));
        this.id_package.id_class(1, new rSG(this));
        this.id_package.id_class(2, new rbV_2(this));
        this.id_package.id_class(3, this.id_instanceof);
        this.id_package.id_class(5, new rBB(this, 1.1, 8));
        this.id_package.id_class(6, new rBJ(this, 1.0, 10.0f, 5.0f, false));
        this.id_package.id_class(7, new rBS(this, 0.8));
        this.id_package.id_class(8, new rBv_1(this, 0.3f));
        this.id_package.id_class(9, new rBj_1(this));
        this.id_package.id_class(10, new rBP(this, 0.8));
        this.id_package.id_class(11, new rSk_1((aA_2)this, 0.8, 1.0000001E-5f));
        this.id_package.id_class(12, new rBA(this, rhd_3.class, 10.0f));
        this.id_int.id_class(1, new rBf_1<rMi_1>(this, rMi_1.class, false, null));
        this.id_int.id_class(1, new rBf_1<rON>(this, rON.class, false, rON.id_super));
    }

    private void sn() {
        if ((this.sJ() || this.sx()) && (Integer)this.id_throws[41] % 5 == 0) {
            this.id_class(rqn_3.rC, 0.6f + 0.4f * (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()), 1.0f);
        }
        this.sC();
        this.sl();
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.rv;
    }

    public boolean sJ() {
        return ((rmE_2)this.id_throws[49]).id_class(id_synchronized);
    }

    public static iz_3 su() {
        return is_3.id_package().id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_protected, 0.3f).id_class(iQ_2.id_case, 3.0);
    }

    private float sA() {
        return (float)this.id_class(iQ_2.id_case);
    }

    private void sC() {
        this.id_interface = this.id_throw;
        this.id_abstract = this.id_char;
        if (this.sJ()) {
            this.id_throw = Math.min(1.0f, this.id_throw + 0.15f);
            this.id_char = Math.min(1.0f, this.id_char + 0.08f);
        } else {
            this.id_throw = Math.max(0.0f, this.id_throw - 0.22f);
            this.id_char = Math.max(0.0f, this.id_char - 0.13f);
        }
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_else, 1);
        ((rmE_2)this.id_throws[49]).id_class(id_synchronized, false);
        ((rmE_2)this.id_throws[49]).id_class(id_goto, false);
        ((rmE_2)this.id_throws[49]).id_class(id_while, rxL_2.RED.id_break());
    }
}

