/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rFJ;
import celestial.rLQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.ruS_2;
import celestial.rye_3;
import java.util.Random;
import java.util.UUID;

public class rhC_2
extends an_3 {
    private int id_class;
    private boolean id_break;
    private int id_protected = 22;
    private boolean id_catch;
    private iB_2 id_private;
    private UUID id_implements;

    private void id_byte(iB_2 iB_22) {
        iB_2 iB_23 = this.id_protected();
        if (iB_22.BM() && !iB_22.rg() && iB_22 != iB_23) {
            if (iB_23 == null) {
                iB_22.id_break(rye_3.id_package, 6.0f);
            } else {
                if (iB_23.id_final(iB_22)) {
                    return;
                }
                iB_22.id_break(rye_3.id_byte(this, iB_23), 6.0f);
            }
        }
    }

    public float id_byte(float f) {
        if (!this.id_catch) {
            return 0.0f;
        }
        int n = this.id_protected - 2;
        return n <= 0 ? 1.0f : 1.0f - ((float)n - f) / 20.0f;
    }

    public rhC_2(rYB rYB2, double d, double d2, double d3, float f, int n, iB_2 iB_22) {
        this((aI_2<? extends rhC_2>)aI_2.id_public, rYB2);
        this.id_class = n;
        this.id_class(iB_22);
        Float f2 = Float.valueOf(f * 57.295776f);
        this.id_throws[15] = f2;
        this.id_new(d, d2, d3);
    }

    public rhC_2(aI_2<? extends rhC_2> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (((rYB)this.id_throws[7]).id_continue) {
            if (this.id_catch) {
                --this.id_protected;
                if (this.id_protected == 14) {
                    for (int i = 0; i < 12; ++i) {
                        double d = this.rx() + (((Random)this.id_throws[40]).nextDouble() * 2.0 - 1.0) * (double)this.PN() * 0.5;
                        double d2 = this.re() + 0.05 + ((Random)this.id_throws[40]).nextDouble();
                        double d3 = this.BO() + (((Random)this.id_throws[40]).nextDouble() * 2.0 - 1.0) * (double)this.PN() * 0.5;
                        double d4 = (((Random)this.id_throws[40]).nextDouble() * 2.0 - 1.0) * 0.3;
                        double d5 = 0.3 + ((Random)this.id_throws[40]).nextDouble() * 0.3;
                        double d6 = (((Random)this.id_throws[40]).nextDouble() * 2.0 - 1.0) * 0.3;
                        ((rYB)this.id_throws[7]).id_class(rLQ.id_catch, d, d2 + 1.0, d3, d4, d5, d6);
                    }
                }
            }
        } else if (--this.id_class < 0) {
            if (this.id_class == -8) {
                for (iB_2 iB_22 : ((rYB)this.id_throws[7]).id_class(iB_2.class, this.rN().id_byte(0.2, 0.0, 0.2))) {
                    this.id_byte(iB_22);
                }
            }
            if (!this.id_break) {
                ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)4);
                this.id_break = true;
            }
            if (--this.id_protected < 0) {
                this.PD();
            }
        }
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        rcd_32.id_break("Warmup", this.id_class);
        if (this.id_implements != null) {
            rcd_32.id_class("Owner", this.id_implements);
        }
    }

    @Override
    public void id_class(byte by) {
        super.id_class(by);
        if (by == 4) {
            this.id_catch = true;
            if (!this.BF()) {
                ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), rqn_3.BU, this.Pr(), 1.0f, ((Random)this.id_throws[40]).nextFloat() * 0.2f + 0.85f, false);
            }
        }
    }

    public void id_class(iB_2 iB_22) {
        this.id_private = iB_22;
        this.id_implements = iB_22 == null ? null : iB_22.ro();
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        this.id_class = rcd_32.id_private("Warmup");
        if (rcd_32.id_break("Owner")) {
            this.id_implements = rcd_32.id_class("Owner");
        }
    }

    public iB_2 id_protected() {
        an_3 an_32;
        if (this.id_private == null && this.id_implements != null && (rYB)this.id_throws[7] instanceof rrEm_1 && (an_32 = ((rrEm_1)((rYB)this.id_throws[7])).id_break(this.id_implements)) instanceof iB_2) {
            this.id_private = (iB_2)an_32;
        }
        return this.id_private;
    }

    @Override
    protected void m_() {
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this);
    }
}

