/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rLC;
import celestial.rYB;
import celestial.rhd_3;
import celestial.rpJ_2;
import celestial.rpm_3;
import java.util.EnumSet;

public class rBl_1
extends rBk_1 {
    protected final aA_2 id_class;
    private final double id_break;
    private final boolean id_byte;
    private rLC id_protected;
    private double id_throws;
    private double id_case;
    private double id_catch;
    private int id_private;
    private int id_implements;
    private final int id_finally;
    private long id_extends;

    @Override
    public void id_byte() {
        this.id_class.id_public().id_class(this.id_protected, this.id_break);
        this.id_class.id_case(true);
        this.id_private = 0;
        this.id_implements = 0;
    }

    public rBl_1(aA_2 aA_22, double d, boolean bl) {
        this.id_finally = 20;
        this.id_class = aA_22;
        this.id_break = d;
        this.id_byte = bl;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    protected double id_class(iB_2 iB_22) {
        return this.id_class.PN() * 2.0f * this.id_class.PN() * 2.0f + iB_22.PN();
    }

    protected void id_class(iB_2 iB_22, double d) {
        double d2 = this.id_class(iB_22);
        if (d <= d2 && this.id_implements <= 0) {
            this.id_catch();
            this.id_class.id_class(rpm_3.MAIN_HAND);
            this.id_class.id_public(iB_22);
        }
    }

    @Override
    public boolean id_class() {
        long l = ((rYB)this.id_class.id_throws[7]).r();
        if (l - this.id_extends < 20L) {
            return false;
        }
        this.id_extends = l;
        iB_2 iB_22 = this.id_class.I_();
        if (iB_22 == null) {
            return false;
        }
        if (!iB_22.BM()) {
            return false;
        }
        this.id_protected = this.id_class.id_public().id_class((an_3)iB_22, 0);
        if (this.id_protected != null) {
            return true;
        }
        return this.id_class(iB_22) >= this.id_class.id_class(iB_22.rx(), iB_22.re(), iB_22.BO());
    }

    @Override
    public boolean id_break() {
        iB_2 iB_22 = this.id_class.I_();
        if (iB_22 == null) {
            return false;
        }
        if (!iB_22.BM()) {
            return false;
        }
        if (!this.id_byte) {
            return !this.id_class.id_public().id_native();
        }
        if (!this.id_class.id_private(iB_22.Bs())) {
            return false;
        }
        return !(iB_22 instanceof rhd_3) || !iB_22.id_native() && !((rhd_3)iB_22).id_implements();
    }

    @Override
    public void id_throws() {
        iB_2 iB_22 = this.id_class.I_();
        this.id_class.id_continue().id_class(iB_22, 30.0f, 30.0f);
        double d = this.id_class.id_class(iB_22.rx(), iB_22.re(), iB_22.BO());
        this.id_private = Math.max(this.id_private - 1, 0);
        if ((this.id_byte || this.id_class.id_goto().id_class(iB_22)) && this.id_private <= 0 && (this.id_throws == 0.0 && this.id_case == 0.0 && this.id_catch == 0.0 || iB_22.id_class(this.id_throws, this.id_case, this.id_catch) >= 1.0 || this.id_class.Sa().nextFloat() < 0.05f)) {
            this.id_throws = iB_22.rx();
            this.id_case = iB_22.re();
            this.id_catch = iB_22.BO();
            this.id_private = 4 + this.id_class.Sa().nextInt(7);
            if (d > 1024.0) {
                this.id_private += 10;
            } else if (d > 256.0) {
                this.id_private += 5;
            }
            if (!this.id_class.id_public().id_class((an_3)iB_22, this.id_break)) {
                this.id_private += 15;
            }
        }
        this.id_implements = Math.max(this.id_implements - 1, 0);
        this.id_class(iB_22, d);
    }

    protected int id_finally() {
        return this.id_implements;
    }

    protected void id_catch() {
        this.id_implements = 20;
    }

    protected int id_extends() {
        return 20;
    }

    @Override
    public void id_protected() {
        iB_2 iB_22 = this.id_class.I_();
        if (!rpJ_2.id_throws.test(iB_22)) {
            this.id_class.id_byte((iB_2)null);
        }
        this.id_class.id_case(false);
        this.id_class.id_public().id_final();
    }

    protected boolean id_private() {
        return this.id_implements <= 0;
    }
}

