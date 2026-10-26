/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rMi_1;
import celestial.rPg_1;

public class rOB
extends rPg_1 {
    private final rMi_1 id_break;
    private boolean id_byte;

    public boolean id_byte() {
        return this.id_class;
    }

    public rOB(rMi_1 rMi_12, rMi_1 rMi_13) {
        super(rMi_13);
        this.id_break = rMi_13;
    }

    public void id_class(boolean bl) {
        this.id_byte = bl;
    }

    @Override
    public void id_break() {
        if (this.id_class) {
            this.id_break.L();
            this.id_class = false;
        }
    }

    public boolean id_protected() {
        return this.id_byte;
    }
}

