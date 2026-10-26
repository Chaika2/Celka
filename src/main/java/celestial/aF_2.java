/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PX;
import celestial.cb_3;
import celestial.util.MinecraftAccessor;

public class aF_2
implements MinecraftAccessor {
    private PX id_class = (PX)PX.id_class[0];

    public void id_class(float f, float f2) {
        if (this.id_class == (PX)PX.id_class[0] && (cb_3)aF_2.id_import.id_class[57] != null) {
            this.id_class = ((cb_3)aF_2.id_import.id_class[57]).rO();
        }
        this.id_class.id_class(f);
        this.id_class.id_byte(f2);
    }

    public PX id_class() {
        return this.id_class;
    }
}

