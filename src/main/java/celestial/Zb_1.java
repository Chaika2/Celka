/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rrbT_2;
import celestial.rrbt_3;
import celestial.vm_3;

public class Zb_1
extends vm_3 {
    private static final rgP_2 id_class = new rgn_3("multiplayer.downloadingTerrain");
    private rrbT_2 id_throws = rrbt_3.id_class();

    public Zb_1() {
        super(rgN_2.id_byte);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        if (this.id_throws != null) {
            this.id_throws.id_class(this.id_package, this.id_int);
        } else {
            this.id_protected(0);
        }
        Zb_1.id_class(ml_1, this.id_super, id_class, this.id_package / 2, this.id_int / 2 - 50, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public boolean E_() {
        return false;
    }

    @Override
    public boolean z_() {
        return false;
    }
}

