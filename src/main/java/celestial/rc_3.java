/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rP_2;
import celestial.rz_3;

public interface rc_3
extends rz_3 {
    public void id_class(rP_2 var1);

    default public void id_break(rP_2 rP_22) {
        this.id_class(rP_22);
        this.id_implements();
    }

    public void id_implements();

    public rP_2 id_private();
}

