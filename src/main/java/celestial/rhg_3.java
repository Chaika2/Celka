/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.eX_2;
import celestial.iB_2;
import celestial.rFJ;
import celestial.rLD;
import celestial.rLQ;
import celestial.rLY;
import celestial.rRO;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfo_3;
import celestial.rhd_3;
import celestial.rhf_3;
import celestial.rhj_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjU_2;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.ruS_2;
import celestial.rye_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class rhg_3
extends rhf_3 {
    private an_3 id_class;
    private rpr_3 id_break;
    private int id_protected;
    private double id_catch;
    private double id_private;
    private double id_implements;
    private UUID id_finally;

    public rhg_3(rYB rYB2, iB_2 iB_22, an_3 an_32, rpB_2 rpB_22) {
        this((aI_2<? extends rhg_3>)aI_2.F, rYB2);
        this.id_break(iB_22);
        rfH_2 rfH_22 = iB_22.Bs();
        double d = (double)rfH_22.b_() + 0.5;
        double d2 = (double)rfH_22.c_() + 0.5;
        double d3 = (double)rfH_22.d_() + 0.5;
        this.id_class(d, d2, d3, ((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
        this.id_class = an_32;
        this.id_break = rpr_3.UP;
        this.id_class(rpB_22);
    }

    public rhg_3(rYB rYB2, double d, double d2, double d3, double d4, double d5, double d6) {
        this((aI_2<? extends rhg_3>)aI_2.F, rYB2);
        this.id_class(d, d2, d3, ((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
        this.id_catch(d4, d5, d6);
    }

    public rhg_3(aI_2<? extends rhg_3> aI_22, rYB rYB2) {
        super((aI_2<? extends rhf_3>)aI_22, rYB2);
        Boolean bl = true;
        this.id_throws[38] = bl;
    }

    @Override
    public void id_this() {
        Object object;
        super.id_this();
        if (!((rYB)this.id_throws[7]).id_continue) {
            if (this.id_class == null && this.id_finally != null) {
                this.id_class = ((rrEm_1)((rYB)this.id_throws[7])).id_break(this.id_finally);
                if (this.id_class == null) {
                    this.id_finally = null;
                }
            }
            if (this.id_class == null || !this.id_class.BM() || this.id_class instanceof rhd_3 && ((rhd_3)this.id_class).id_native()) {
                if (!this.rw()) {
                    this.id_byte(this.rv().id_break(0.0, -0.04, 0.0));
                }
            } else {
                this.id_catch = rfU_2.id_class(this.id_catch * 1.025, -1.0, 1.0);
                this.id_private = rfU_2.id_class(this.id_private * 1.025, -1.0, 1.0);
                this.id_implements = rfU_2.id_class(this.id_implements * 1.025, -1.0, 1.0);
                object = this.rv();
                this.id_byte(((rjU_2)object).id_break((this.id_catch - ((rjU_2)object).id_break) * 0.2, (this.id_private - ((rjU_2)object).id_byte) * 0.2, (this.id_implements - ((rjU_2)object).id_protected) * 0.2));
            }
            if (((rjG_2)(object = rhj_3.id_class((an_3)this, this::id_class))).id_byte() != rjM_2.MISS) {
                this.id_class((rjG_2)object);
            }
        }
        this.Px();
        object = this.rv();
        this.id_new(this.rx() + ((rjU_2)object).id_break, this.re() + ((rjU_2)object).id_byte, this.BO() + ((rjU_2)object).id_protected);
        rhj_3.id_class((an_3)this, 0.5f);
        if (((rYB)this.id_throws[7]).id_continue) {
            ((rYB)this.id_throws[7]).id_class(rLQ.id_this, this.rx() - ((rjU_2)object).id_break, this.re() - ((rjU_2)object).id_byte + 0.15, this.BO() - ((rjU_2)object).id_protected, 0.0, 0.0, 0.0);
        } else if (this.id_class != null && !((Boolean)this.id_class.id_throws[27]).booleanValue()) {
            if (this.id_protected > 0) {
                --this.id_protected;
                if (this.id_protected == 0) {
                    this.id_class(this.id_break == null ? null : this.id_break.id_final());
                }
            }
            if (this.id_break != null) {
                rfH_2 rfH_22 = this.Bs();
                rpB_2 rpB_22 = this.id_break.id_final();
                if (((rYB)this.id_throws[7]).id_class(rfH_22.id_break(this.id_break), (an_3)this)) {
                    this.id_class(rpB_22);
                } else {
                    rfH_2 rfH_23 = this.id_class.Bs();
                    if (rpB_22 == rpB_2.X && rfH_22.b_() == rfH_23.b_() || rpB_22 == rpB_2.Z && rfH_22.d_() == rfH_23.d_() || rpB_22 == rpB_2.Y && rfH_22.c_() == rfH_23.c_()) {
                        this.id_class(rpB_22);
                    }
                }
            }
        }
    }

    @Override
    protected void id_class(rjG_2 rjG_22) {
        super.id_class(rjG_22);
        this.PD();
    }

    @Override
    protected void id_class(rff_3 rff_32) {
        super.id_class(rff_32);
        ((rrEm_1)((rYB)this.id_throws[7])).id_class(rLQ.id_return, this.rx(), this.re(), this.BO(), 2, 0.2, 0.2, 0.2, 0.0);
        this.id_class(rqn_3.JX, 1.0f, 1.0f);
    }

    @Override
    protected boolean id_class(an_3 an_32) {
        return super.id_class(an_32) && (Boolean)an_32.id_throws[38] == false;
    }

    @Override
    protected void id_class(rfo_3 rfo_32) {
        super.id_class(rfo_32);
        an_3 an_32 = rfo_32.id_class();
        an_3 an_33 = this.id_else();
        iB_2 iB_22 = an_33 instanceof iB_2 ? (iB_2)an_33 : null;
        boolean bl = an_32.id_break(rye_3.id_class((an_3)this, iB_22).id_byte(), 4.0f);
        if (bl) {
            this.id_class(iB_22, an_32);
            if (an_32 instanceof iB_2) {
                ((iB_2)an_32).id_break(new rLY(rLD.id_goto, 200));
            }
        }
    }

    @Override
    public boolean id_class(double d) {
        return d < 16384.0;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.id_class != null) {
            rcd_32.id_class("Target", this.id_class.ro());
        }
        if (this.id_break != null) {
            rcd_32.id_break("Dir", this.id_break.id_byte());
        }
        rcd_32.id_break("Steps", this.id_protected);
        rcd_32.id_class("TXD", this.id_catch);
        rcd_32.id_class("TYD", this.id_private);
        rcd_32.id_class("TZD", this.id_implements);
    }

    private void id_class(rpr_3 rpr_32) {
        this.id_break = rpr_32;
    }

    private void id_class(rpB_2 rpB_22) {
        rfH_2 rfH_22;
        double d = 0.5;
        if (this.id_class == null) {
            rfH_22 = this.Bs().id_break();
        } else {
            d = (double)this.id_class.Bm() * 0.5;
            rfH_22 = new rfH_2(this.id_class.rx(), this.id_class.re() + d, this.id_class.BO());
        }
        double d2 = (double)rfH_22.b_() + 0.5;
        double d3 = (double)rfH_22.c_() + d;
        double d4 = (double)rfH_22.d_() + 0.5;
        rpr_3 rpr_32 = null;
        if (!rfH_22.id_class((eX_2)this.Ps(), 2.0)) {
            rfH_2 rfH_23 = this.Bs();
            ArrayList arrayList = Lists.newArrayList();
            if (rpB_22 != rpB_2.X) {
                if (rfH_23.b_() < rfH_22.b_() && ((rYB)this.id_throws[7]).id_finally(rfH_23.id_extends())) {
                    arrayList.add(rpr_3.EAST);
                } else if (rfH_23.b_() > rfH_22.b_() && ((rYB)this.id_throws[7]).id_finally(rfH_23.id_byte())) {
                    arrayList.add(rpr_3.WEST);
                }
            }
            if (rpB_22 != rpB_2.Y) {
                if (rfH_23.c_() < rfH_22.c_() && ((rYB)this.id_throws[7]).id_finally(rfH_23.id_final())) {
                    arrayList.add(rpr_3.UP);
                } else if (rfH_23.c_() > rfH_22.c_() && ((rYB)this.id_throws[7]).id_finally(rfH_23.id_break())) {
                    arrayList.add(rpr_3.DOWN);
                }
            }
            if (rpB_22 != rpB_2.Z) {
                if (rfH_23.d_() < rfH_22.d_() && ((rYB)this.id_throws[7]).id_finally(rfH_23.id_protected())) {
                    arrayList.add(rpr_3.SOUTH);
                } else if (rfH_23.d_() > rfH_22.d_() && ((rYB)this.id_throws[7]).id_finally(rfH_23.id_private())) {
                    arrayList.add(rpr_3.NORTH);
                }
            }
            rpr_32 = rpr_3.id_class((Random)this.id_throws[40]);
            if (arrayList.isEmpty()) {
                for (int i = 5; !((rYB)this.id_throws[7]).id_finally(rfH_23.id_break(rpr_32)) && i > 0; --i) {
                    rpr_32 = rpr_3.id_class((Random)this.id_throws[40]);
                }
            } else {
                rpr_32 = (rpr_3)arrayList.get(((Random)this.id_throws[40]).nextInt(arrayList.size()));
            }
            d2 = this.rx() + (double)rpr_32.id_implements();
            d3 = this.re() + (double)rpr_32.id_finally();
            d4 = this.BO() + (double)rpr_32.id_extends();
        }
        this.id_class(rpr_32);
        double d5 = d2 - this.rx();
        double d6 = d3 - this.re();
        double d7 = d4 - this.BO();
        double d8 = rfU_2.id_class(d5 * d5 + d6 * d6 + d7 * d7);
        if (d8 == 0.0) {
            this.id_catch = 0.0;
            this.id_private = 0.0;
            this.id_implements = 0.0;
        } else {
            this.id_catch = d5 / d8 * 0.15;
            this.id_private = d6 / d8 * 0.15;
            this.id_implements = d7 / d8 * 0.15;
        }
        Boolean bl = true;
        this.id_throws[57] = bl;
        this.id_protected = 10 + ((Random)this.id_throws[40]).nextInt(5) * 10;
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_protected = rcd_32.id_private("Steps");
        this.id_catch = rcd_32.id_extends("TXD");
        this.id_private = rcd_32.id_extends("TYD");
        this.id_implements = rcd_32.id_extends("TZD");
        if (rcd_32.id_byte("Dir", 99)) {
            this.id_break = rpr_3.id_class(rcd_32.id_private("Dir"));
        }
        if (rcd_32.id_break("Target")) {
            this.id_finally = rcd_32.id_class("Target");
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_class(rqn_3.JJ, 1.0f, 1.0f);
            ((rrEm_1)((rYB)this.id_throws[7])).id_class(rLQ.id_catch, this.rx(), this.re(), this.BO(), 15, 0.2, 0.2, 0.2, 0.0);
            this.PD();
        }
        return true;
    }

    @Override
    public boolean Pz() {
        return false;
    }

    @Override
    public void rA() {
        if (((rYB)this.id_throws[7]).id_abstract() == rRO.PEACEFUL) {
            this.PD();
        }
    }

    @Override
    public float rX() {
        return 1.0f;
    }

    @Override
    public rqL_2 Pr() {
        return rqL_2.HOSTILE;
    }

    @Override
    public boolean rY() {
        return true;
    }

    @Override
    protected void m_() {
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this);
    }
}

