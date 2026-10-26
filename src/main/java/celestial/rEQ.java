/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iX_2;
import celestial.rBk_1;
import celestial.rEx_1;
import celestial.rYB;
import celestial.rjU_2;

public class rEQ
extends rBk_1 {
    private final rEx_1 id_class;
    private final double id_break;
    private final int id_byte;
    private boolean id_protected;

    @Override
    public void id_byte() {
        this.id_class.id_this(true);
        this.id_protected = false;
    }

    public rEQ(rEx_1 rEx_12, double d, int n) {
        this.id_class = rEx_12;
        this.id_break = d;
        this.id_byte = n;
    }

    @Override
    public boolean id_class() {
        return !((rYB)this.id_class.id_throws[7]).id_strictfp() && this.id_class.rT() && this.id_class.re() < (double)(this.id_byte - 2);
    }

    @Override
    public boolean id_break() {
        return this.id_class() && !this.id_protected;
    }

    @Override
    public void id_throws() {
        if (this.id_class.re() < (double)(this.id_byte - 1) && (this.id_class.id_public().id_native() || this.id_class.sk())) {
            rjU_2 rjU_22 = iX_2.id_break(this.id_class, 4, 8, new rjU_2(this.id_class.rx(), this.id_byte - 1, this.id_class.BO()));
            if (rjU_22 == null) {
                this.id_protected = true;
                return;
            }
            this.id_class.id_public().id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, this.id_break);
        }
    }

    @Override
    public void id_protected() {
        this.id_class.id_this(false);
    }
}

