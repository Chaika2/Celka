/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.WT;
import celestial.rBU;
import celestial.rBW;
import celestial.rGZ;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.xc_3;
import java.util.EnumSet;
import java.util.Random;

public class rGv_1
extends rBU {
    private rpr_3 id_private;
    private boolean id_implements;

    @Override
    public void id_byte() {
        if (!this.id_implements) {
            super.id_byte();
        } else {
            rYB rYB2 = (rYB)this.id_class.id_throws[7];
            rfH_2 rfH_22 = new rfH_2(this.id_class.rx(), this.id_class.re() + 0.5, this.id_class.BO()).id_break(this.id_private);
            xc_3 xc_32 = rYB2.id_byte(rfH_22);
            if (WT.id_private(xc_32)) {
                rYB2.id_class(rfH_22, WT.id_class(xc_32.id_break()), 3);
                this.id_class.id_float();
                this.id_class.PD();
            }
        }
    }

    public rGv_1(rGZ rGZ2) {
        super(rGZ2, 1.0, 10);
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        if (this.id_class.I_() != null) {
            return false;
        }
        if (!this.id_class.id_public().id_native()) {
            return false;
        }
        Random random = this.id_class.Sa();
        if (((rYB)this.id_class.id_throws[7]).B().id_break(rRu_1.id_break) && random.nextInt(10) == 0) {
            this.id_private = rpr_3.id_class(random);
            rfH_2 rfH_22 = new rfH_2(this.id_class.rx(), this.id_class.re() + 0.5, this.id_class.BO()).id_break(this.id_private);
            xc_3 xc_32 = ((rYB)this.id_class.id_throws[7]).id_byte(rfH_22);
            if (WT.id_private(xc_32)) {
                this.id_implements = true;
                return true;
            }
        }
        this.id_implements = false;
        return super.id_class();
    }

    @Override
    public boolean id_break() {
        return this.id_implements ? false : super.id_break();
    }
}

