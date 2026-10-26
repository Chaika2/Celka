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
import celestial.ap_3;
import celestial.au_3;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iP_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBP;
import celestial.rBY;
import celestial.rBb_1;
import celestial.rBx_1;
import celestial.rJP;
import celestial.rOM;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rSO;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rkg_3;
import celestial.rkj_3;
import celestial.rmE_2;
import celestial.rpL_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsE_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rxA_2;
import celestial.rxL_2;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class rOb_1
extends rbZ_2
implements iP_2 {
    private static final rut_3<Byte> id_super = rmE_2.id_class(rOb_1.class, ruw_3.id_class);
    private static final Map<rxL_2, rpL_2> id_this = rqR_2.id_class(Maps.newEnumMap(rxL_2.class), (T enumMap) -> {
        enumMap.put(rxL_2.WHITE, xu_3.rs);
        enumMap.put(rxL_2.ORANGE, xu_3.rE);
        enumMap.put(rxL_2.MAGENTA, xu_3.rG);
        enumMap.put(rxL_2.LIGHT_BLUE, xu_3.rb);
        enumMap.put(rxL_2.YELLOW, xu_3.rM);
        enumMap.put(rxL_2.LIME, xu_3.rO);
        enumMap.put(rxL_2.PINK, xu_3.rh);
        enumMap.put(rxL_2.GRAY, xu_3.rX);
        enumMap.put(rxL_2.LIGHT_GRAY, xu_3.rJ);
        enumMap.put(rxL_2.CYAN, xu_3.rx);
        enumMap.put(rxL_2.PURPLE, xu_3.rd);
        enumMap.put(rxL_2.BLUE, xu_3.rk);
        enumMap.put(rxL_2.BROWN, xu_3.rW);
        enumMap.put(rxL_2.GREEN, xu_3.rz);
        enumMap.put(rxL_2.RED, xu_3.rQ);
        enumMap.put(rxL_2.BLACK, xu_3.rN);
    });
    private static final Map<rxL_2, float[]> id_else = Maps.newEnumMap(Arrays.stream(rxL_2.values()).collect(Collectors.toMap(rxL_22 -> rxL_22, rOb_1::id_byte)));
    private int id_synchronized;
    private rBb_1 id_return;

    private static float[] id_byte(rxL_2 rxL_22) {
        if (rxL_22 == rxL_2.WHITE) {
            return new float[]{0.9019608f, 0.9019608f, 0.9019608f};
        }
        float[] fArray = rxL_22.id_protected();
        float f = 0.75f;
        return new float[]{fArray[0] * 0.75f, fArray[1] * 0.75f, fArray[2] * 0.75f};
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Xe;
    }

    @Override
    protected void id_double() {
        this.id_synchronized = this.id_return.id_catch();
        super.id_double();
    }

    public rOb_1(aI_2<? extends rOb_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
    }

    public void id_this(boolean bl) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_super);
        if (bl) {
            ((rmE_2)this.id_throws[49]).id_break(id_super, (byte)(by | 0x10));
        } else {
            ((rmE_2)this.id_throws[49]).id_break(id_super, (byte)(by & 0xFFFFFFEF));
        }
    }

    public rxL_2 n() {
        return rxL_2.id_class(((rmE_2)this.id_throws[49]).id_class(id_super) & 0xF);
    }

    public float id_interface(float f) {
        if (this.id_synchronized > 4 && this.id_synchronized <= 36) {
            float f2 = ((float)(this.id_synchronized - 4) - f) / 32.0f;
            return 0.62831855f + 0.2199115f * rfU_2.id_class(f2 * 28.7f);
        }
        return this.id_synchronized > 0 ? 0.62831855f : ((Float)this.id_throws[16]).floatValue() * ((float)Math.PI / 180);
    }

    @Override
    public boolean id_class() {
        return this.BM() && !this.sJ() && !this.n_();
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_break(rrEm_12, au_32);
    }

    public static rxL_2 id_class(Random random) {
        int n = random.nextInt(100);
        if (n < 5) {
            return rxL_2.BLACK;
        }
        if (n < 10) {
            return rxL_2.GRAY;
        }
        if (n < 15) {
            return rxL_2.LIGHT_GRAY;
        }
        if (n < 18) {
            return rxL_2.BROWN;
        }
        return random.nextInt(500) == 0 ? rxL_2.PINK : rxL_2.WHITE;
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        this.id_break(rOb_1.id_class(rRf_12.id_long()));
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    private rxL_2 id_class(rbZ_2 rbZ_22, rbZ_2 rbZ_23) {
        rxL_2 rxL_22 = ((rOb_1)rbZ_22).n();
        rxL_2 rxL_23 = ((rOb_1)rbZ_23).n();
        rXk_1 rXk_12 = rOb_1.id_class(rxL_22, rxL_23);
        return ((rYB)this.id_throws[7]).id_implements().id_class(rkj_3.id_class, rXk_12, (rYB)this.id_throws[7]).map(rkt_32 -> rkt_32.id_class(rXk_12)).map(rdn_3::id_break).filter(rxA_2.class::isInstance).map(rxA_2.class::cast).map(rxA_2::id_byte).orElseGet(() -> ((rYB)this.id_throws[7]).id_int.nextBoolean() ? rxL_22 : rxL_23);
    }

    public static float[] id_class(rxL_2 rxL_22) {
        return id_else.get(rxL_22);
    }

    private static rXk_1 id_class(rxL_2 rxL_22, rxL_2 rxL_23) {
        rXk_1 rXk_12 = new rXk_1(new rOM((rJP)null, -1), 2, 1);
        rXk_12.id_break(0, new rdn_3(rxA_2.id_class(rxL_22)));
        rXk_12.id_break(1, new rdn_3(rxA_2.id_class(rxL_23)));
        return rXk_12;
    }

    @Override
    public void id_class(byte by) {
        if (by == 10) {
            this.id_synchronized = 40;
        } else {
            super.id_class(by);
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Sheared", this.sJ());
        rcd_32.id_class("Color", (byte)this.n().id_break());
    }

    @Override
    public void id_class(rqL_2 rqL_22) {
        ((rYB)this.id_throws[7]).id_class((rhd_3)null, this, rqn_3.Xa, rqL_22, 1.0f, 1.0f);
        this.id_this(true);
        int n = 1 + ((Random)this.id_throws[40]).nextInt(3);
        for (int i = 0; i < n; ++i) {
            rsE_2 rsE_22 = this.id_class(id_this.get(this.n()), 1);
            if (rsE_22 == null) continue;
            rsE_22.id_byte(rsE_22.rv().id_break((((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.1f, ((Random)this.id_throws[40]).nextFloat() * 0.05f, (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.1f));
        }
    }

    @Override
    public void id_default() {
        if (((rYB)this.id_throws[7]).id_continue) {
            this.id_synchronized = Math.max(0, this.id_synchronized - 1);
        }
        super.id_default();
    }

    @Override
    public rqO_2 id_short() {
        if (this.sJ()) {
            return this.BC().id_finally();
        }
        switch (this.n()) {
            default: {
                return rzl_3.id_transient;
            }
            case ORANGE: {
                return rzl_3.id_for;
            }
            case MAGENTA: {
                return rzl_3.id_double;
            }
            case LIGHT_BLUE: {
                return rzl_3.id_switch;
            }
            case YELLOW: {
                return rzl_3.r;
            }
            case LIME: {
                return rzl_3.P;
            }
            case PINK: {
                return rzl_3.B;
            }
            case GRAY: {
                return rzl_3.S;
            }
            case LIGHT_GRAY: {
                return rzl_3.s;
            }
            case CYAN: {
                return rzl_3.E;
            }
            case PURPLE: {
                return rzl_3.G;
            }
            case BLUE: {
                return rzl_3.b;
            }
            case BROWN: {
                return rzl_3.M;
            }
            case GREEN: {
                return rzl_3.O;
            }
            case RED: {
                return rzl_3.h;
            }
            case BLACK: 
        }
        return rzl_3.X;
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 0.95f * ap_32.id_break;
    }

    public rOb_1 id_break(rrEm_1 rrEm_12, au_3 au_32) {
        rOb_1 rOb_12 = (rOb_1)au_32;
        rOb_1 rOb_13 = aI_2.Z.id_class(rrEm_12);
        rOb_13.id_break(this.id_class(this, (rbZ_2)rOb_12));
        return rOb_13;
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_33, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_33.id_protected(rpm_32);
        if (rdn_32.id_break() == rdy_3.JJ) {
            if (!((rYB)this.id_throws[7]).id_continue && this.id_class()) {
                this.id_class(rqL_2.PLAYERS);
                rdn_32.id_class(1, rhd_33, (T rhd_32) -> rhd_32.id_byte(rpm_32));
                return ryZ_2.SUCCESS;
            }
            return ryZ_2.CONSUME;
        }
        return super.id_break(rhd_33, rpm_32);
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.Xi, 0.15f, 1.0f);
    }

    public void id_break(rxL_2 rxL_22) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_super);
        ((rmE_2)this.id_throws[49]).id_break(id_super, (byte)(by & 0xF0 | rxL_22.id_break() & 0xF));
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_this(rcd_32.id_new("Sheared"));
        this.id_break(rxL_2.id_class(rcd_32.id_case("Color")));
    }

    public static iz_3 L() {
        return is_3.id_package().id_class(iQ_2.id_class, 8.0).id_class(iQ_2.id_protected, 0.23f);
    }

    @Override
    public void id_instanceof() {
        this.id_this(false);
        if (this.n_()) {
            this.d_(60);
        }
    }

    public float id_throw(float f) {
        if (this.id_synchronized <= 0) {
            return 0.0f;
        }
        if (this.id_synchronized >= 4 && this.id_synchronized <= 36) {
            return 1.0f;
        }
        return this.id_synchronized < 4 ? ((float)this.id_synchronized - f) / 4.0f : -((float)(this.id_synchronized - 40) - f) / 4.0f;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.XD;
    }

    @Override
    protected void id_final() {
        this.id_return = new rBb_1(this);
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(1, new rBY(this, 1.25));
        this.id_package.id_class(2, new rBP(this, 1.0));
        this.id_package.id_class(3, new rSO((aA_2)this, 1.1, rkg_3.id_class(rdy_3.hB), false));
        this.id_package.id_class(4, new rBx_1(this, 1.1));
        this.id_package.id_class(5, this.id_return);
        this.id_package.id_class(6, new rSk_1(this, 1.0));
        this.id_package.id_class(7, new rBA(this, rhd_3.class, 6.0f));
        this.id_package.id_class(8, new rBC(this));
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.XU;
    }

    public boolean sJ() {
        return (((rmE_2)this.id_throws[49]).id_class(id_super) & 0x10) != 0;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_super, (byte)0);
    }
}

