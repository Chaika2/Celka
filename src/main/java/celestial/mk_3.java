/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.cN_2;
import celestial.cW_2;
import celestial.mW_2;
import celestial.rHm_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.vm_3;

public abstract class mk_3
extends vm_3 {
    private static final rgP_2 id_finally = new rgn_3("advMode.setCommand");
    private static final rgP_2 id_else = new rgn_3("advMode.command");
    private static final rgP_2 id_synchronized = new rgn_3("advMode.previousOutput");
    protected Lu_1 id_class;
    protected Lu_1 id_throws;
    protected LF id_case;
    protected LF id_catch;
    protected LF id_private;
    protected boolean id_implements;
    public cW_2 id_return;

    public mk_3() {
        super(rgN_2.id_byte);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        mk_3.id_class(ml_1, this.id_super, id_finally, this.id_package / 2, 20, 0xFFFFFF);
        mk_3.id_break(ml_1, this.id_super, id_else, this.id_package / 2 - 150, 40, 0xA0A0A0);
        this.id_class.id_class(ml_1, n, n2, f);
        int n3 = 75;
        if (!this.id_throws.id_private().isEmpty()) {
            mk_3.id_break(ml_1, this.id_super, id_synchronized, this.id_package / 2 - 150, (n3 += 46 + this.id_finally() - 135) + 4, 0xA0A0A0);
            this.id_throws.id_class(ml_1, n, n2, f);
        }
        super.id_class(ml_1, n, n2, f);
        this.id_return.id_class(ml_1, n, n2);
    }

    protected abstract void id_class(rHm_1 var1);

    @Override
    public boolean id_class(double d, double d2, double d3) {
        return this.id_return.id_class(d3) ? true : super.id_class(d, d2, d3);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (this.id_return.id_class(n, n2, n3)) {
            return true;
        }
        if (super.id_class(n, n2, n3)) {
            return true;
        }
        if (n != 257 && n != 335) {
            return false;
        }
        this.id_native();
        return true;
    }

    private void id_class(String string) {
        this.id_return.id_class();
    }

    @Override
    public void id_class(QY qY, int n, int n2) {
        String string = this.id_class.id_private();
        this.id_break(qY, n, n2);
        this.id_class.id_class(string);
        this.id_return.id_class();
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        return this.id_return.id_class(d, d2, n) ? true : super.id_break(d, d2, n);
    }

    public abstract int id_finally();

    protected void id_extends() {
        if (this.id_implements().id_finally()) {
            this.id_private.id_break(new rgN_2("O"));
            this.id_throws.id_class(this.id_implements().id_catch().getString());
        } else {
            this.id_private.id_break(new rgN_2("X"));
            this.id_throws.id_class("-");
        }
    }

    public abstract rHm_1 id_implements();

    @Override
    public void id_private() {
        this.id_class.id_catch();
    }

    @Override
    public void id_volatile() {
        this.id_implements().id_class(this.id_implements);
        this.id_volatile.id_break((vm_3)null);
    }

    protected void id_native() {
        rHm_1 rHm_12 = this.id_implements();
        this.id_class(rHm_12);
        if (!rHm_12.id_finally()) {
            rHm_12.id_break((rgP_2)null);
        }
        this.id_volatile.id_break((vm_3)null);
    }

    @Override
    protected void v_() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        this.id_case = this.id_class(new LF(this.id_package / 2 - 4 - 150, this.id_int / 4 + 120 + 12, 150, 20, cN_2.id_byte, lF -> this.id_native()));
        this.id_catch = this.id_class(new LF(this.id_package / 2 + 4, this.id_int / 4 + 120 + 12, 150, 20, cN_2.id_protected, lF -> this.id_volatile()));
        this.id_private = this.id_class(new LF(this.id_package / 2 + 150 - 20, this.id_finally(), 20, 20, new rgN_2("O"), lF -> {
            rHm_1 rHm_12;
            rHm_12.id_class(!(rHm_12 = this.id_implements()).id_finally());
            this.id_extends();
        }));
        this.id_class = new mW_2(this, this.id_super, this.id_package / 2 - 150, 50, 300, 20, new rgn_3("advMode.command"));
        this.id_class.id_implements(32500);
        this.id_class.id_class(this::id_class);
        this.id_native.add(this.id_class);
        this.id_throws = new Lu_1(this.id_super, this.id_package / 2 - 150, this.id_finally(), 276, 20, new rgn_3("advMode.previousOutput"));
        this.id_throws.id_implements(32500);
        this.id_throws.id_case(false);
        this.id_throws.id_class("-");
        this.id_native.add(this.id_throws);
        this.id_break(this.id_class);
        this.id_class.id_byte(true);
        this.id_return = new cW_2(this.id_volatile, this, this.id_class, this.id_super, true, true, 0, 7, false, Integer.MIN_VALUE);
        this.id_return.id_class(true);
        this.id_return.id_class();
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
    }
}

