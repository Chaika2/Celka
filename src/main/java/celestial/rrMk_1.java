/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.gm_3;
import celestial.rVL;
import celestial.rYG;
import celestial.rqO_2;
import celestial.rrWr_1;

public class rrMk_1 {
    private final rqO_2 id_class;
    private gm_3 id_break;
    private rYG id_byte;
    private static QY id_protected = QY.id_instanceof();

    private void id_byte() {
        this.id_byte = null;
        rVL<rYG> rVL2 = rrWr_1.id_break(this.id_break);
        if (rVL2.id_byte(this.id_class)) {
            this.id_byte = rVL2.id_class(this.id_class);
        }
    }

    private rrMk_1(rqO_2 rqO_22) {
        this.id_class = rqO_22;
        this.id_break = (gm_3)rrMk_1.id_protected.id_class[56];
        this.id_byte();
    }

    public String toString() {
        return "" + this.id_class;
    }

    public static rrMk_1 id_class(rqO_2 rqO_22) {
        rrMk_1 rrMk_12 = new rrMk_1(rqO_22);
        return rrMk_12.id_byte == null ? null : rrMk_12;
    }

    public rYG id_class() {
        if (this.id_break != (gm_3)rrMk_1.id_protected.id_class[56]) {
            this.id_break = (gm_3)rrMk_1.id_protected.id_class[56];
            this.id_byte();
        }
        return this.id_byte;
    }

    public rqO_2 id_break() {
        return this.id_class;
    }
}

