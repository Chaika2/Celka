/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ay_3;
import celestial.iB_2;
import celestial.rBW;
import celestial.rOQ;
import celestial.rSM;
import java.util.EnumSet;

public class rBR
extends rSM {
    private final rOQ id_class;
    private iB_2 id_break;
    private int id_byte;

    @Override
    public void id_byte() {
        this.id_throws.id_byte(this.id_break);
        iB_2 iB_22 = this.id_class.sF();
        if (iB_22 != null) {
            this.id_byte = iB_22.SE();
        }
        super.id_byte();
    }

    public rBR(rOQ rOQ2) {
        super(rOQ2, false);
        this.id_class = rOQ2;
        this.id_class(EnumSet.of(rBW.TARGET));
    }

    @Override
    public boolean id_class() {
        if (this.id_class.sZ() && !this.id_class.sL()) {
            iB_2 iB_22 = this.id_class.sF();
            if (iB_22 == null) {
                return false;
            }
            this.id_break = iB_22.SZ();
            int n = iB_22.SE();
            return n != this.id_byte && this.id_class(this.id_break, ay_3.id_class) && this.id_class.id_class(this.id_break, iB_22);
        }
        return false;
    }
}

