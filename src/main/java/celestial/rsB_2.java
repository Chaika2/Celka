/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.JC;
import celestial.Ji_1;
import celestial.Ko_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.dH_2;
import celestial.dr_3;
import celestial.iG_2;
import celestial.kx_3;
import celestial.rCT;
import celestial.rFJ;
import celestial.rRR;
import celestial.rRu_1;
import celestial.rXG;
import celestial.rYB;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rjB_2;
import celestial.rjM_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rjs_3;
import celestial.rlG_2;
import celestial.rls_3;
import celestial.rmE_2;
import celestial.rpL_2;
import celestial.rpr_3;
import celestial.ruS_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rxv_3;
import celestial.ryO_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;

public class rsB_2
extends an_3 {
    private xc_3 id_private = xu_3.id_throw.id_continue();
    public int id_class;
    public boolean id_break = true;
    private boolean id_implements;
    private boolean id_finally;
    private int id_extends = 40;
    private float id_native = 2.0f;
    public rcd_3 id_protected;
    protected static final rut_3<rfH_2> id_catch = rmE_2.id_class(rsB_2.class, ruw_3.id_native);

    public rsB_2(aI_2<? extends rsB_2> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    public rsB_2(rYB rYB2, double d, double d2, double d3, xc_3 xc_32) {
        this((aI_2<? extends rsB_2>)aI_2.id_try, rYB2);
        this.id_private = xc_32;
        Boolean bl = true;
        this.id_throws[2] = bl;
        this.id_new(d, d2 + (double)((1.0f - this.Bm()) / 2.0f), d3);
        this.id_byte(rjU_2.id_class);
        Double d4 = d;
        this.id_throws[8] = d4;
        Double d5 = d2;
        this.id_throws[9] = d5;
        Double d6 = d3;
        this.id_throws[10] = d6;
        this.id_class(this.Bs());
    }

    @Override
    public void id_this() {
        if (this.id_private.id_catch()) {
            this.PD();
        } else {
            rfH_2 rfH_22;
            xd_3 xd_32 = this.id_private.id_break();
            if (this.id_class++ == 0) {
                rfH_22 = this.Bs();
                if (((rYB)this.id_throws[7]).id_byte(rfH_22).id_class(xd_32)) {
                    ((rYB)this.id_throws[7]).id_class(rfH_22, false);
                } else if (!((rYB)this.id_throws[7]).id_continue) {
                    this.PD();
                    return;
                }
            }
            if (!this.rw()) {
                this.id_byte(this.rv().id_break(0.0, -0.04, 0.0));
            }
            this.id_class(iG_2.SELF, this.rv());
            if (!((rYB)this.id_throws[7]).id_continue) {
                Object object;
                rfH_22 = this.Bs();
                boolean bl = this.id_private.id_break() instanceof dr_3;
                boolean bl2 = bl && ((rYB)this.id_throws[7]).id_break(rfH_22).id_class(rlG_2.id_break);
                double d = this.rv().id_catch();
                if (bl && d > 1.0 && ((rff_3)(object = ((rYB)this.id_throws[7]).id_class(new rjB_2(new rjU_2((Double)this.id_throws[8], (Double)this.id_throws[9], (Double)this.id_throws[10]), this.Ps(), rjS_2.COLLIDER, rjs_3.SOURCE_ONLY, this)))).id_byte() != rjM_2.MISS && ((rYB)this.id_throws[7]).id_break(((rff_3)object).id_class()).id_class(rlG_2.id_break)) {
                    rfH_22 = ((rff_3)object).id_class();
                    bl2 = true;
                }
                if (!((Boolean)this.id_throws[20]).booleanValue() && !bl2) {
                    if (!(((rYB)this.id_throws[7]).id_continue || (this.id_class <= 100 || rfH_22.c_() >= 1 && rfH_22.c_() <= 256) && this.id_class <= 600)) {
                        if (this.id_break && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
                            this.id_class((rpL_2)xd_32);
                        }
                        this.PD();
                    }
                } else {
                    object = ((rYB)this.id_throws[7]).id_byte(rfH_22);
                    this.id_byte(this.rv().id_throws(0.7, -0.5, 0.7));
                    if (!((JC)object).id_class(xu_3.rc)) {
                        this.PD();
                        if (!this.id_implements) {
                            boolean bl3;
                            boolean bl4 = ((JC)object).id_class(new rxv_3((rYB)this.id_throws[7], rfH_22, rpr_3.DOWN, rdn_3.id_break, rpr_3.UP));
                            boolean bl5 = dH_2.id_implements(((rYB)this.id_throws[7]).id_byte(rfH_22.id_break())) && (!bl || !bl2);
                            boolean bl6 = bl3 = this.id_private.id_class((rRR)((rYB)this.id_throws[7]), rfH_22) && !bl5;
                            if (bl4 && bl3) {
                                if (this.id_private.id_break(rCT.id_throw) && ((rYB)this.id_throws[7]).id_break(rfH_22).id_class() == rXG.id_byte) {
                                    this.id_private = (xc_3)this.id_private.id_class(rCT.id_throw, true);
                                }
                                if (((rYB)this.id_throws[7]).id_class(rfH_22, this.id_private, 3)) {
                                    ryO_2 ryO_22;
                                    if (xd_32 instanceof dH_2) {
                                        ((dH_2)xd_32).id_class((rYB)this.id_throws[7], rfH_22, this.id_private, (xc_3)object, this);
                                    }
                                    if (this.id_protected != null && xd_32 instanceof kx_3 && (ryO_22 = ((rYB)this.id_throws[7]).id_class(rfH_22)) != null) {
                                        rcd_3 rcd_32 = ryO_22.id_class(new rcd_3());
                                        for (String string : this.id_protected.id_protected()) {
                                            rcZ_2 rcZ_22 = this.id_protected.id_byte(string);
                                            if ("x".equals(string) || "y".equals(string) || "z".equals(string)) continue;
                                            rcd_32.id_class(string, rcZ_22.id_byte());
                                        }
                                        ryO_22.id_class(this.id_private, rcd_32);
                                        ryO_22.id_break();
                                    }
                                } else if (this.id_break && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
                                    this.id_class((rpL_2)xd_32);
                                }
                            } else if (this.id_break && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
                                this.id_class((rpL_2)xd_32);
                            }
                        } else if (xd_32 instanceof dH_2) {
                            ((dH_2)xd_32).id_class((rYB)this.id_throws[7], rfH_22, this);
                        }
                    }
                }
            }
            this.id_byte(this.rv().id_class(0.98));
        }
    }

    @Override
    public void id_class(Ko_1 ko_1) {
        super.id_class(ko_1);
        ko_1.id_class("Immitating BlockState", this.id_private.toString());
    }

    @Override
    public boolean id_class(float f, float f2) {
        int n;
        if (this.id_finally && (n = rfU_2.id_case(f - 1.0f)) > 0) {
            ArrayList arrayList = Lists.newArrayList(((rYB)this.id_throws[7]).id_class((an_3)this, this.rN()));
            boolean bl = this.id_private.id_class(rls_3.id_long);
            rye_3 rye_32 = bl ? rye_3.id_new : rye_3.id_continue;
            for (an_3 an_32 : arrayList) {
                an_32.id_break(rye_32, Math.min(rfU_2.id_protected((float)n * this.id_native), this.id_extends));
            }
            if (bl && (double)((Random)this.id_throws[40]).nextFloat() < (double)0.05f + (double)n * 0.05) {
                xc_3 xc_32 = Ji_1.id_private(this.id_private);
                if (xc_32 == null) {
                    this.id_implements = true;
                } else {
                    this.id_private = xc_32;
                }
            }
        }
        return false;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        rcd_32.id_class("BlockState", rco_3.id_class(this.id_private));
        rcd_32.id_break("Time", this.id_class);
        rcd_32.id_class("DropItem", this.id_break);
        rcd_32.id_class("HurtEntities", this.id_finally);
        rcd_32.id_class("FallHurtAmount", this.id_native);
        rcd_32.id_break("FallHurtMax", this.id_extends);
        if (this.id_protected != null) {
            rcd_32.id_class("TileEntityData", this.id_protected);
        }
    }

    public void id_class(boolean bl) {
        this.id_finally = bl;
    }

    public void id_class(rfH_2 rfH_22) {
        ((rmE_2)this.id_throws[49]).id_break(id_catch, rfH_22);
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        this.id_private = rco_3.id_byte(rcd_32.id_int("BlockState"));
        this.id_class = rcd_32.id_private("Time");
        if (rcd_32.id_byte("HurtEntities", 99)) {
            this.id_finally = rcd_32.id_new("HurtEntities");
            this.id_native = rcd_32.id_finally("FallHurtAmount");
            this.id_extends = rcd_32.id_private("FallHurtMax");
        } else if (this.id_private.id_class(rls_3.id_long)) {
            this.id_finally = true;
        }
        if (rcd_32.id_byte("DropItem", 99)) {
            this.id_break = rcd_32.id_new("DropItem");
        }
        if (rcd_32.id_byte("TileEntityData", 10)) {
            this.id_protected = rcd_32.id_int("TileEntityData");
        }
        if (this.id_private.id_catch()) {
            this.id_private = xu_3.id_throw.id_continue();
        }
    }

    public rYB id_throws() {
        return (rYB)this.id_throws[7];
    }

    @Override
    public boolean rt() {
        return false;
    }

    public xc_3 id_case() {
        return this.id_private;
    }

    public rfH_2 id_protected() {
        return ((rmE_2)this.id_throws[49]).id_class(id_catch);
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean rY() {
        return (Boolean)this.id_throws[27] == false;
    }

    @Override
    protected boolean PK() {
        return false;
    }

    @Override
    protected void m_() {
        ((rmE_2)this.id_throws[49]).id_class(id_catch, rfH_2.id_protected);
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this, xd_3.id_finally(this.id_case()));
    }
}

