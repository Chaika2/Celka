/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.rBP;
import celestial.rON;
import celestial.rRu_1;
import celestial.rhN_2;
import celestial.rlB_2;
import celestial.rsP_2;
import java.util.Random;

public class rOZ
extends rBP {
    private final rON id_protected;

    public rOZ(rON rON2, double d) {
        super(rON2, d);
        this.id_protected = rON2;
    }

    @Override
    public boolean id_class() {
        return super.id_class() && !this.id_protected.L();
    }

    @Override
    protected void id_catch() {
        rhN_2 rhN_22 = this.id_class.sz();
        if (rhN_22 == null && this.id_byte.sz() != null) {
            rhN_22 = this.id_byte.sz();
        }
        if (rhN_22 != null) {
            rhN_22.id_break(rlB_2.id_strictfp);
            Oo_1.id_package.id_class(rhN_22, this.id_class, this.id_byte, null);
        }
        this.id_protected.id_this(true);
        this.id_class.sN();
        this.id_byte.sN();
        Random random = this.id_class.Sa();
        if (this.id_break.B().id_break(rRu_1.id_throws)) {
            this.id_break.a_(new rsP_2(this.id_break, this.id_class.rx(), this.id_class.re(), this.id_class.BO(), random.nextInt(7) + 1));
        }
    }
}

