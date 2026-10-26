/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.rSO;
import celestial.rbf_3;
import celestial.rhd_3;
import celestial.rkg_3;

public class rbg_3
extends rSO {
    private rhd_3 id_byte;
    private final rbf_3 id_protected;

    public rbg_3(rbf_3 rbf_32, double d, rkg_3 rkg_32, boolean bl) {
        super((aA_2)rbf_32, d, rkg_32, bl);
        this.id_protected = rbf_32;
    }

    @Override
    public boolean id_class() {
        return super.id_class() && !this.id_protected.sZ();
    }

    @Override
    public void id_throws() {
        super.id_throws();
        if (this.id_byte == null && this.id_class.Sa().nextInt(600) == 0) {
            this.id_byte = this.id_break;
        } else if (this.id_class.Sa().nextInt(500) == 0) {
            this.id_byte = null;
        }
    }

    @Override
    protected boolean id_catch() {
        return this.id_byte != null && this.id_byte.equals(this.id_break) ? false : super.id_catch();
    }
}

