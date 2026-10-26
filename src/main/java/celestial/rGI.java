/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBl_1;
import celestial.rGw_1;

public class rGI
extends rBl_1 {
    public rGI(rGw_1 rGw_12) {
        super(rGw_12, 1.0, true);
    }

    @Override
    protected double id_class(iB_2 iB_22) {
        return 4.0f + iB_22.PN();
    }

    @Override
    public boolean id_class() {
        return super.id_class() && !this.id_class.BP();
    }

    @Override
    public boolean id_break() {
        float f = this.id_class.rX();
        if (f >= 0.5f && this.id_class.Sa().nextInt(100) == 0) {
            this.id_class.id_byte((iB_2)null);
            return false;
        }
        return super.id_break();
    }
}

