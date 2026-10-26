/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FB;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.Qw_1;
import celestial.cI_2;
import celestial.cW_2;
import celestial.cq_3;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rgc_3;
import celestial.rgn_3;
import celestial.rrQX;
import celestial.rrvk_1;
import celestial.util.BlurShader;
import celestial.vm_3;

public class FP
extends vm_3 {
    private String id_throws = "";
    private int id_case = -1;
    public Lu_1 id_class;
    private final String id_catch;
    public cW_2 id_private;

    private void id_byte(String string) {
        this.id_class.id_class(string);
    }

    public FP(String string) {
        super(rgN_2.id_byte);
        this.id_catch = string;
    }

    @Override
    public boolean id_class(double d, double d2, double d3) {
        if (d3 > 1.0) {
            d3 = 1.0;
        }
        if (d3 < -1.0) {
            d3 = -1.0;
        }
        if (this.id_private.id_class(d3)) {
            return true;
        }
        if (!FP.id_synchronized()) {
            d3 *= 7.0;
        }
        ((cq_3)this.id_volatile.id_class[19]).id_throws().id_class(d3);
        return true;
    }

    @Override
    public boolean id_class(double d, double d2, int n) {
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_class().id_class((Integer)rrvk_1.id_class[0], (int)((Integer)rrvk_1.id_class[1]), n);
        return super.id_class(d, d2, n);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (this.id_private.id_class(n, n2, n3)) {
            return true;
        }
        if (super.id_class(n, n2, n3)) {
            return true;
        }
        if (n == 256) {
            this.id_volatile.id_break((vm_3)null);
            return true;
        }
        if (n != 257 && n != 335) {
            if (n == 265) {
                this.id_break(-1);
                return true;
            }
            if (n == 264) {
                this.id_break(1);
                return true;
            }
            if (n == 266) {
                ((cq_3)this.id_volatile.id_class[19]).id_throws().id_class((double)(((cq_3)this.id_volatile.id_class[19]).id_throws().id_implements() - 1));
                return true;
            }
            if (n == 267) {
                ((cq_3)this.id_volatile.id_class[19]).id_throws().id_class((double)(-((cq_3)this.id_volatile.id_class[19]).id_throws().id_implements() + 1));
                return true;
            }
            return false;
        }
        String string = this.id_class.id_private().trim();
        if (!string.isEmpty()) {
            this.id_break(string);
        }
        this.id_volatile.id_break((vm_3)null);
        return true;
    }

    @Override
    protected void id_class(String string, boolean bl) {
        if (bl) {
            this.id_class.id_class(string);
        } else {
            this.id_class.id_break(string);
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(this.id_class);
        this.id_class.id_byte(true);
        FP.id_class(ml_1, 2, this.id_int - 14, this.id_package - 2, this.id_int - 2, ((Qw_1)this.id_volatile.id_class[20]).id_class(Integer.MIN_VALUE));
        this.id_class.id_class(ml_1, n, n2, f);
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_protected(this.id_class.id_private())) {
            BlurShader.id_class(ml_1, () -> FP.id_class(ml_1, 2, this.id_int - 14, Math.min(this.id_class.id_case() + 6, this.id_super.id_break(this.id_class.id_private()) + 5), this.id_int - 2, -1), 10.0f);
        }
        this.id_private.id_class(ml_1, n, n2);
        rgc_3 rgc_32 = ((cq_3)this.id_volatile.id_class[19]).id_throws().id_break(n, n2);
        if (rgc_32 != null && rgc_32.id_implements() != null) {
            this.id_class(ml_1, rgc_32, n, n2);
        }
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public void id_class(QY qY, int n, int n2) {
        String string = this.id_class.id_private();
        this.id_break(qY, n, n2);
        this.id_byte(string);
        this.id_private.id_class();
    }

    private void id_class(String string) {
        String string2 = this.id_class.id_private();
        this.id_private.id_class(!string2.equals(this.id_catch));
        this.id_private.id_class();
    }

    public void id_break(int n) {
        int n2 = this.id_case + n;
        int n3 = ((cq_3)this.id_volatile.id_class[19]).id_throws().id_protected().size();
        if ((n2 = rfU_2.id_class(n2, 0, n3)) != this.id_case) {
            if (n2 == n3) {
                this.id_case = n3;
                this.id_class.id_class(this.id_throws);
            } else {
                if (this.id_case == n3) {
                    this.id_throws = this.id_class.id_private();
                }
                this.id_class.id_class(((cq_3)this.id_volatile.id_class[19]).id_throws().id_protected().get(n2));
                this.id_private.id_class(false);
                this.id_case = n2;
            }
        }
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_class().id_class((Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1], n, true, false);
        if (this.id_private.id_class((double)((int)d), (double)((int)d2), n)) {
            return true;
        }
        if (n == 0) {
            cI_2 cI_22 = ((cq_3)this.id_volatile.id_class[19]).id_throws();
            if (cI_22.id_class(d, d2)) {
                return true;
            }
            rgc_3 rgc_32 = cI_22.id_break(d, d2);
            if (rgc_32 != null && this.id_class(rgc_32)) {
                return true;
            }
        }
        return this.id_class.id_break(d, d2, n) || super.id_break(d, d2, n);
    }

    public cW_2 id_finally() {
        return this.id_private;
    }

    @Override
    public void id_private() {
        this.id_class.id_catch();
    }

    @Override
    public void id_volatile() {
        super.id_volatile();
    }

    @Override
    protected void v_() {
        int n = 130;
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        this.id_case = ((cq_3)this.id_volatile.id_class[19]).id_throws().id_protected().size();
        this.id_class = new FB(this, this.id_super, 4, this.id_int - 12, this.id_package - n - 10, 12, new rgn_3("chat.editBox"));
        this.id_class.id_implements(Integer.MAX_VALUE);
        this.id_class.id_protected(false);
        this.id_class.id_class(this.id_catch);
        this.id_class.id_class(this::id_class);
        this.id_native.add(this.id_class);
        this.id_private = new cW_2(this.id_volatile, this, this.id_class, this.id_super, false, false, 1, 10, true, -805306368);
        this.id_private.id_class();
        this.id_break(this.id_class);
    }

    @Override
    public boolean z_() {
        return false;
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
        ((Qw_1)this.id_volatile.id_class[20]).id_break();
        ((cq_3)this.id_volatile.id_class[19]).id_throws().id_throws();
        this.id_class.id_byte(false);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_class().id_class((Integer)rrvk_1.id_class[0], (int)((Integer)rrvk_1.id_class[1]), 0);
    }
}

