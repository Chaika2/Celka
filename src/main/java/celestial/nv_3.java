/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.gm_3;
import celestial.nm_3;
import celestial.rLx_1;
import celestial.rXs_1;

public class nv_3
extends nm_3 {
    public nv_3(gm_3 gm_32, double d, double d2, double d3, rXs_1 rXs_12, rLx_1 rLx_12) {
        super(gm_32, d, d2, d3, rXs_12, rLx_12);
    }

    @Override
    protected void id_catch() {
        this.id_synchronized = 1.0f;
        this.id_return = 16.0f / (float)(40 - this.id_this + 16);
        this.id_public = 4.0f / (float)(40 - this.id_this + 8);
        super.id_catch();
    }
}

