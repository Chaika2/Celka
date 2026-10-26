/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjU_2;
import celestial.rrTR;
import celestial.rrTj_1;
import celestial.xc_3;
import java.util.function.Predicate;

public interface rrTA
extends rrTR {
    default public double id_byte() {
        return this.rr().id_byte;
    }

    public boolean id_class(rjU_2 var1, rrTj_1 var2, Predicate<xc_3> var3);

    default public double id_class() {
        return this.rr().id_protected;
    }

    default public double id_break() {
        return this.rr().id_break;
    }

    @Override
    public rjU_2 rr();
}

