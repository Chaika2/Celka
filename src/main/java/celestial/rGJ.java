/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.aI_2;
import celestial.aL_2;
import celestial.aU_2;
import celestial.aY_2;
import celestial.an_3;
import celestial.eA_2;
import celestial.eY_2;
import celestial.ev_3;
import celestial.iB_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBI;
import celestial.rBU;
import celestial.rBc_1;
import celestial.rBi_1;
import celestial.rEB;
import celestial.rEi_1;
import celestial.rEr_1;
import celestial.rEs_1;
import celestial.rMZ;
import celestial.rRO;
import celestial.rRR;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rSb_1;
import celestial.rXA;
import celestial.rXQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rhf_3;
import celestial.rkB_2;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEr_1;
import celestial.rsE_2;
import celestial.rsi_3;
import celestial.rsy_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rxO_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class rGJ
extends rsi_3
implements aY_2 {
    private static final rut_3<Boolean> id_protected = rmE_2.id_class(rGJ.class, ruw_3.id_implements);
    private final rXA id_super = new rXA(5);

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.hz;
    }

    public rGJ(aI_2<? extends rGJ> aI_22, rYB rYB2) {
        super((aI_2<? extends rsi_3>)aI_22, rYB2);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcy_3 rcy_32 = new rcy_3();
        for (int i = 0; i < this.id_super.id_else(); ++i) {
            rdn_3 rdn_32 = this.id_super.id_extends(i);
            if (rdn_32.id_class()) continue;
            rcy_32.add(rdn_32.id_break(new rcd_3()));
        }
        rcd_32.id_class("Inventory", rcy_32);
    }

    @Override
    public float id_class(rfH_2 rfH_22, rRR rRR2) {
        xc_3 xc_32 = rRR2.id_byte(rfH_22.id_break());
        return !xc_32.id_class(xu_3.id_implements) && !xc_32.id_class(xu_3.id_throw) ? 0.5f - rRR2.id_native(rfH_22) : 10.0f;
    }

    @Override
    public void id_class(int n, boolean bl) {
        boolean bl2;
        rrEr_1 rrEr_12 = this.sx();
        boolean bl3 = bl2 = ((Random)this.id_throws[40]).nextFloat() <= rrEr_12.id_else();
        if (bl2) {
            rdn_3 rdn_32 = new rdn_3(rdy_3.kU);
            HashMap hashMap = Maps.newHashMap();
            if (n > rrEr_12.id_class(rRO.NORMAL)) {
                hashMap.put(eY_2.id_void, 2);
            } else if (n > rrEr_12.id_class(rRO.EASY)) {
                hashMap.put(eY_2.id_void, 1);
            }
            hashMap.put(eY_2.id_float, 1);
            eA_2.id_class(hashMap, rdn_32);
            this.id_class(rXQ.MAINHAND, rdn_32);
        }
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        this.id_class(rRh_12);
        this.id_break(rRh_12);
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public boolean id_class(int n, rdn_3 rdn_32) {
        if (super.id_class(n, rdn_32)) {
            return true;
        }
        int n2 = n - 300;
        if (n2 >= 0 && n2 < this.id_super.id_else()) {
            this.id_super.id_break(n2, rdn_32);
            return true;
        }
        return false;
    }

    @Override
    public void id_class(iB_2 iB_22, rdn_3 rdn_32, rhf_3 rhf_32, float f) {
        this.id_class(this, iB_22, rhf_32, f, 1.6f);
    }

    @Override
    public void id_class() {
        Integer n = 0;
        this.id_private[33] = n;
    }

    @Override
    protected void id_class(rRh_1 rRh_12) {
        this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.kU));
    }

    @Override
    public boolean id_class(rkB_2 rkB_22) {
        return rkB_22 == rdy_3.kU;
    }

    public boolean sc() {
        return ((rmE_2)this.id_throws[49]).id_class(id_protected);
    }

    private boolean id_break(rdb_3 rdb_32) {
        return this.sd() && rdb_32 == rdy_3.dY;
    }

    @Override
    protected void id_break(rsE_2 rsE_22) {
        rdn_3 rdn_32 = rsE_22.id_protected();
        if (rdn_32.id_break() instanceof rxO_2) {
            super.id_break(rsE_22);
        } else {
            rdb_3 rdb_32 = rdn_32.id_break();
            if (this.id_break(rdb_32)) {
                this.id_class(rsE_22);
                rdn_3 rdn_33 = this.id_super.id_class(rdn_32);
                if (rdn_33.id_class()) {
                    rsE_22.PD();
                } else {
                    rdn_32.id_throws(rdn_33.id_char());
                }
            }
        }
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        rcy_3 rcy_32 = rcd_32.id_protected("Inventory", 10);
        for (int i = 0; i < rcy_32.size(); ++i) {
            rdn_3 rdn_32 = rdn_3.id_class(rcy_32.id_class(i));
            if (rdn_32.id_class()) continue;
            this.id_super.id_class(rdn_32);
        }
        this.id_byte(true);
    }

    @Override
    public void id_break(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_protected, bl);
    }

    @Override
    public void id_break(iB_2 iB_22, float f) {
        this.id_class((iB_2)this, 1.6f);
    }

    @Override
    public rEr_1 id_throws() {
        if (this.sc()) {
            return rEr_1.CROSSBOW_CHARGE;
        }
        if (this.id_class(rdy_3.kU)) {
            return rEr_1.CROSSBOW_HOLD;
        }
        return this.v() ? rEr_1.ATTACKING : rEr_1.NEUTRAL;
    }

    @Override
    protected void id_instanceof(float f) {
        rdn_3 rdn_32;
        super.id_instanceof(f);
        if (((Random)this.id_throws[40]).nextInt(300) == 0 && (rdn_32 = this.ss()).id_break() == rdy_3.kU) {
            Map<ev_3, Integer> map = eA_2.id_class(rdn_32);
            map.putIfAbsent(eY_2.id_static, 1);
            eA_2.id_class(map, rdn_32);
            this.id_class(rXQ.MAINHAND, rdn_32);
        }
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.hd;
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(2, new rEs_1(this, this, 10.0f));
        this.id_package.id_class(3, new rBi_1<rGJ>(this, 1.0, 8.0f));
        this.id_package.id_class(8, new rBU(this, 0.6));
        this.id_package.id_class(9, new rBA(this, rhd_3.class, 15.0f, 1.0f));
        this.id_package.id_class(10, new rBA(this, is_3.class, 15.0f));
        this.id_int.id_class(1, new rBc_1(this, rEB.class).id_class(new Class[0]));
        this.id_int.id_class(2, new rBI<rhd_3>((is_3)this, rhd_3.class, true));
        this.id_int.id_class(3, new rBI<rsy_3>((is_3)this, rsy_3.class, false));
        this.id_int.id_class(3, new rBI<rMZ>((is_3)this, rMZ.class, true));
    }

    @Override
    public boolean id_final(an_3 an_32) {
        if (super.id_final(an_32)) {
            return true;
        }
        if (an_32 instanceof iB_2 && ((iB_2)an_32).sG() == aL_2.id_protected) {
            return this.BG() == null && an_32.BG() == null;
        }
        return false;
    }

    @Override
    public int E() {
        return 1;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.hW;
    }

    public static iz_3 sN() {
        return rEi_1.sm().id_class(iQ_2.id_protected, 0.35f).id_class(iQ_2.id_class, 24.0).id_class(iQ_2.id_case, 5.0).id_class(iQ_2.id_break, 32.0);
    }

    @Override
    public rqA_2 sQ() {
        return rqn_3.hk;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_protected, false);
    }
}

