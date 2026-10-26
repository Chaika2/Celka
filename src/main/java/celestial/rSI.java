/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.iB_2;
import celestial.rLC;
import celestial.rLq_1;
import celestial.rST;
import celestial.rSp_1;
import celestial.rSu_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhA_2;
import celestial.rhd_3;
import celestial.rjU_2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rSI
extends rSp_1 {
    private static final Logger id_break = LogManager.getLogger();
    private int id_byte;
    private rLC id_protected;
    private rjU_2 id_throws;
    private iB_2 id_case;
    private boolean id_catch;

    @Override
    public void id_byte() {
        this.id_byte = 0;
        this.id_throws = null;
        this.id_protected = null;
        this.id_case = null;
    }

    public rSI(rSu_1 rSu_12) {
        super(rSu_12);
    }

    public void id_class(iB_2 iB_22) {
        this.id_case = iB_22;
        int n = this.id_class.id_catch();
        int n2 = this.id_class.id_continue(this.id_case.rx(), this.id_case.re(), this.id_case.BO());
        int n3 = rfU_2.id_byte(this.id_case.rx());
        int n4 = rfU_2.id_byte(this.id_case.BO());
        double d = (double)n3 - this.id_class.rx();
        double d2 = (double)n4 - this.id_class.BO();
        double d3 = rfU_2.id_class(d * d + d2 * d2);
        double d4 = Math.min((double)0.4f + d3 / 80.0 - 1.0, 10.0);
        int n5 = rfU_2.id_byte(this.id_case.re() + d4);
        rLq_1 rLq_12 = new rLq_1(n3, n5, n4);
        this.id_protected = this.id_class.id_class(n, n2, rLq_12);
        if (this.id_protected != null) {
            this.id_protected.id_class();
            this.id_extends();
        }
    }

    @Override
    public void id_break() {
        if (this.id_case == null) {
            id_break.warn("Skipping player strafe phase because no player was found");
            this.id_class.L().id_class(rST.id_class);
        } else {
            double d;
            double d2;
            double d3;
            if (this.id_protected != null && this.id_protected.id_byte()) {
                d3 = this.id_case.rx();
                d2 = this.id_case.BO();
                double d4 = d3 - this.id_class.rx();
                double d5 = d2 - this.id_class.BO();
                d = rfU_2.id_class(d4 * d4 + d5 * d5);
                double d6 = Math.min((double)0.4f + d / 80.0 - 1.0, 10.0);
                this.id_throws = new rjU_2(d3, this.id_case.re() + d6, d2);
            }
            double d7 = d3 = this.id_throws == null ? 0.0 : this.id_throws.id_protected(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
            if (d3 < 100.0 || d3 > 22500.0) {
                this.id_finally();
            }
            d2 = 64.0;
            if (this.id_case.id_int(this.id_class) < 4096.0) {
                if (this.id_class.id_while(this.id_case)) {
                    ++this.id_byte;
                    rjU_2 rjU_22 = new rjU_2(this.id_case.rx() - this.id_class.rx(), 0.0, this.id_case.BO() - this.id_class.BO()).id_protected();
                    rjU_2 rjU_23 = new rjU_2(rfU_2.id_class(((Float)this.id_class.id_throws[15]).floatValue() * ((float)Math.PI / 180)), 0.0, -rfU_2.id_break(((Float)this.id_class.id_throws[15]).floatValue() * ((float)Math.PI / 180))).id_protected();
                    float f = (float)rjU_23.id_break(rjU_22);
                    float f2 = (float)(Math.acos(f) * 57.2957763671875);
                    f2 += 0.5f;
                    if (this.id_byte >= 5 && f2 >= 0.0f && f2 < 10.0f) {
                        d = 1.0;
                        rjU_2 rjU_24 = this.id_class.id_break(1.0f);
                        double d8 = this.id_class.id_super.rx() - rjU_24.id_break * 1.0;
                        double d9 = this.id_class.id_super.id_byte(0.5) + 0.5;
                        double d10 = this.id_class.id_super.BO() - rjU_24.id_protected * 1.0;
                        double d11 = this.id_case.rx() - d8;
                        double d12 = this.id_case.id_byte(0.5) - d9;
                        double d13 = this.id_case.BO() - d10;
                        if (!this.id_class.BF()) {
                            ((rYB)this.id_class.id_throws[7]).id_class((rhd_3)null, 1017, this.id_class.Bs(), 0);
                        }
                        rhA_2 rhA_22 = new rhA_2((rYB)this.id_class.id_throws[7], this.id_class, d11, d12, d13);
                        rhA_22.id_class(d8, d9, d10, 0.0f, 0.0f);
                        ((rYB)this.id_class.id_throws[7]).a_(rhA_22);
                        this.id_byte = 0;
                        if (this.id_protected != null) {
                            while (!this.id_protected.id_byte()) {
                                this.id_protected.id_class();
                            }
                        }
                        this.id_class.L().id_class(rST.id_class);
                    }
                } else if (this.id_byte > 0) {
                    --this.id_byte;
                }
            } else if (this.id_byte > 0) {
                --this.id_byte;
            }
        }
    }

    private void id_finally() {
        if (this.id_protected == null || this.id_protected.id_byte()) {
            int n;
            int n2 = n = this.id_class.id_catch();
            if (this.id_class.Sa().nextInt(8) == 0) {
                this.id_catch = !this.id_catch;
                n2 = n + 6;
            }
            n2 = this.id_catch ? ++n2 : --n2;
            if (this.id_class.n() != null && this.id_class.n().id_byte() > 0) {
                if ((n2 %= 12) < 0) {
                    n2 += 12;
                }
            } else {
                n2 -= 12;
                n2 &= 7;
                n2 += 12;
            }
            this.id_protected = this.id_class.id_class(n, n2, (rLq_1)null);
            if (this.id_protected != null) {
                this.id_protected.id_class();
            }
        }
        this.id_extends();
    }

    private void id_extends() {
        if (this.id_protected != null && !this.id_protected.id_byte()) {
            double d;
            rfH_2 rfH_22 = this.id_protected.id_catch();
            this.id_protected.id_class();
            double d2 = rfH_22.b_();
            double d3 = rfH_22.d_();
            while ((d = (double)((float)rfH_22.c_() + this.id_class.Sa().nextFloat() * 20.0f)) < (double)rfH_22.c_()) {
            }
            this.id_throws = new rjU_2(d2, d, d3);
        }
    }

    @Override
    public rjU_2 id_case() {
        return this.id_throws;
    }

    public rST<rSI> id_protected() {
        return rST.id_break;
    }
}

