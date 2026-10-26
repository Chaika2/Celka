/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iX_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rOD;
import celestial.rYB;
import celestial.rhd_3;
import celestial.rjU_2;
import java.util.EnumSet;

public class rSs_1
extends rBk_1 {
    private final rOD id_class;
    private final double id_break;
    private double id_byte;
    private double id_protected;
    private double id_throws;

    @Override
    public void id_byte() {
        this.id_class.id_public().id_class(this.id_byte, this.id_protected, this.id_throws, this.id_break);
    }

    public rSs_1(rOD rOD2, double d) {
        this.id_class = rOD2;
        this.id_break = d;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        if (!this.id_class.sm() && this.id_class.BP()) {
            rjU_2 rjU_22 = iX_2.id_class(this.id_class, 5, 4);
            if (rjU_22 == null) {
                return false;
            }
            this.id_byte = rjU_22.id_break;
            this.id_protected = rjU_22.id_byte;
            this.id_throws = rjU_22.id_protected;
            return true;
        }
        return false;
    }

    @Override
    public boolean id_break() {
        return !this.id_class.sm() && !this.id_class.id_public().id_native() && this.id_class.BP();
    }

    @Override
    public void id_throws() {
        if (!this.id_class.sm() && this.id_class.Sa().nextInt(50) == 0) {
            an_3 an_32 = this.id_class.Bh().get(0);
            if (an_32 == null) {
                return;
            }
            if (an_32 instanceof rhd_3) {
                int n = this.id_class.sn();
                int n2 = this.id_class.sT();
                if (n2 > 0 && this.id_class.Sa().nextInt(n2) < n) {
                    this.id_class.id_private((rhd_3)an_32);
                    return;
                }
                this.id_class.id_return(5);
            }
            this.id_class.Bn();
            this.id_class.sI();
            ((rYB)this.id_class.id_throws[7]).id_class((an_3)this.id_class, (byte)6);
        }
    }
}

