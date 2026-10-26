/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.iQ_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rEO;
import celestial.rYB;
import celestial.rfU_2;
import celestial.rhR_2;
import celestial.rhd_3;
import java.util.EnumSet;

public class rEh_1
extends rBk_1 {
    private final rEO id_class;
    private int id_break;
    private int id_byte;
    private int id_protected;

    @Override
    public void id_byte() {
        this.id_break = 0;
    }

    public rEh_1(rEO rEO2) {
        this.id_class = rEO2;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        iB_2 iB_22 = this.id_class.I_();
        return iB_22 != null && iB_22.BM() && this.id_class.id_catch(iB_22);
    }

    @Override
    public void id_throws() {
        --this.id_byte;
        iB_2 iB_22 = this.id_class.I_();
        if (iB_22 != null) {
            boolean bl = this.id_class.id_goto().id_class(iB_22);
            this.id_protected = bl ? 0 : ++this.id_protected;
            double d = this.id_class.id_int(iB_22);
            if (d < 4.0) {
                if (!bl) {
                    return;
                }
                if (this.id_byte <= 0) {
                    this.id_byte = 20;
                    this.id_class.id_public(iB_22);
                }
                this.id_class.id_super().id_class(iB_22.rx(), iB_22.re(), iB_22.BO(), 1.0);
            } else if (d < this.id_catch() * this.id_catch() && bl) {
                double d2 = iB_22.rx() - this.id_class.rx();
                double d3 = iB_22.id_byte(0.5) - this.id_class.id_byte(0.5);
                double d4 = iB_22.BO() - this.id_class.BO();
                if (this.id_byte <= 0) {
                    ++this.id_break;
                    if (this.id_break == 1) {
                        this.id_byte = 60;
                        this.id_class.id_this(true);
                    } else if (this.id_break <= 4) {
                        this.id_byte = 6;
                    } else {
                        this.id_byte = 100;
                        this.id_break = 0;
                        this.id_class.id_this(false);
                    }
                    if (this.id_break > 1) {
                        float f = rfU_2.id_byte(rfU_2.id_class(d)) * 0.5f;
                        if (!this.id_class.BF()) {
                            ((rYB)this.id_class.id_throws[7]).id_class((rhd_3)null, 1018, this.id_class.Bs(), 0);
                        }
                        for (int i = 0; i < 1; ++i) {
                            rhR_2 rhR_22 = new rhR_2((rYB)this.id_class.id_throws[7], this.id_class, d2 + this.id_class.Sa().nextGaussian() * (double)f, d3, d4 + this.id_class.Sa().nextGaussian() * (double)f);
                            rhR_22.id_new(rhR_22.rx(), this.id_class.id_byte(0.5) + 0.5, rhR_22.BO());
                            ((rYB)this.id_class.id_throws[7]).a_(rhR_22);
                        }
                    }
                }
                this.id_class.id_continue().id_class(iB_22, 10.0f, 10.0f);
            } else if (this.id_protected < 5) {
                this.id_class.id_super().id_class(iB_22.rx(), iB_22.re(), iB_22.BO(), 1.0);
            }
            super.id_throws();
        }
    }

    private double id_catch() {
        return this.id_class.id_class(iQ_2.id_break);
    }

    @Override
    public void id_protected() {
        this.id_class.id_this(false);
        this.id_protected = 0;
    }
}

