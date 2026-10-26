/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.iX_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rjU_2;
import java.util.EnumSet;

public class rBU
extends rBk_1 {
    protected final aA_2 id_class;
    protected double id_break;
    protected double id_byte;
    protected double id_protected;
    protected final double id_throws;
    protected int id_case;
    protected boolean id_catch;
    private boolean id_private;

    @Override
    public void id_byte() {
        this.id_class.id_public().id_class(this.id_break, this.id_byte, this.id_protected, this.id_throws);
    }

    public rBU(aA_2 aA_22, double d, int n, boolean bl) {
        this.id_class = aA_22;
        this.id_throws = d;
        this.id_case = n;
        this.id_private = bl;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    public rBU(aA_2 aA_22, double d, int n) {
        this(aA_22, d, n, true);
    }

    public rBU(aA_2 aA_22, double d) {
        this(aA_22, d, 120);
    }

    public void id_class(int n) {
        this.id_case = n;
    }

    @Override
    public boolean id_class() {
        rjU_2 rjU_22;
        if (this.id_class.BP()) {
            return false;
        }
        if (!this.id_catch) {
            if (this.id_private && this.id_class.BI() >= 100) {
                return false;
            }
            if (this.id_class.Sa().nextInt(this.id_case) != 0) {
                return false;
            }
        }
        if ((rjU_22 = this.id_catch()) == null) {
            return false;
        }
        this.id_break = rjU_22.id_break;
        this.id_byte = rjU_22.id_byte;
        this.id_protected = rjU_22.id_protected;
        this.id_catch = false;
        return true;
    }

    @Override
    public boolean id_break() {
        return !this.id_class.id_public().id_native() && !this.id_class.BP();
    }

    protected rjU_2 id_catch() {
        return iX_2.id_class(this.id_class, 10, 7);
    }

    @Override
    public void id_protected() {
        this.id_class.id_public().id_final();
        super.id_protected();
    }

    public void id_private() {
        this.id_catch = true;
    }
}

