/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HA;
import celestial.QY;
import celestial.rfU_2;

public class HL {
    private final QY id_class;
    private final HA id_break;
    private float id_byte;

    public HL(HA hA) {
        this.id_break = hA;
        this.id_class = QY.id_instanceof();
    }

    public void id_class(float f, float f2) {
        this.id_byte += f;
        this.id_break.id_class(this.id_class, rfU_2.id_class(this.id_byte * 0.001f) * 5.0f + 25.0f, -this.id_byte * 0.1f, f2);
    }
}

