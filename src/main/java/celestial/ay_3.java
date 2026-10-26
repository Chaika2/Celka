/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.is_3;
import java.util.function.Predicate;

public class ay_3 {
    public static final ay_3 id_class = new ay_3();
    private double id_break = -1.0;
    private boolean id_byte;
    private boolean id_protected;
    private boolean id_throws;
    private boolean id_case;
    private boolean id_catch = true;
    private Predicate<iB_2> id_private;

    public ay_3 id_byte() {
        this.id_throws = true;
        return this;
    }

    public boolean id_class(iB_2 iB_22, iB_2 iB_23) {
        if (iB_22 == iB_23) {
            return false;
        }
        if (iB_23.id_native()) {
            return false;
        }
        if (!iB_23.BM()) {
            return false;
        }
        if (!this.id_byte && iB_23.rg()) {
            return false;
        }
        if (this.id_private != null && !this.id_private.test(iB_23)) {
            return false;
        }
        if (iB_22 != null) {
            if (!this.id_case) {
                if (!iB_22.id_catch(iB_23)) {
                    return false;
                }
                if (!iB_22.id_class(iB_23.BC())) {
                    return false;
                }
            }
            if (!this.id_protected && iB_22.id_final(iB_23)) {
                return false;
            }
            if (this.id_break > 0.0) {
                double d = this.id_catch ? iB_23.id_goto(iB_22) : 1.0;
                double d2 = Math.max(this.id_break * d, 2.0);
                double d3 = iB_22.id_class(iB_23.rx(), iB_23.re(), iB_23.BO());
                if (d3 > d2 * d2) {
                    return false;
                }
            }
            if (!this.id_throws && iB_22 instanceof is_3 && !((is_3)iB_22).id_goto().id_class(iB_23)) {
                return false;
            }
        }
        return true;
    }

    public ay_3 id_class(Predicate<iB_2> predicate) {
        this.id_private = predicate;
        return this;
    }

    public ay_3 id_class() {
        this.id_byte = true;
        return this;
    }

    public ay_3 id_class(double d) {
        this.id_break = d;
        return this;
    }

    public ay_3 id_break() {
        this.id_protected = true;
        return this;
    }

    public ay_3 id_throws() {
        this.id_catch = false;
        return this;
    }

    public ay_3 id_protected() {
        this.id_case = true;
        return this;
    }
}

