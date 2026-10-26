/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.gm_3;
import celestial.nu_3;
import celestial.rXs_1;

public class nt_3
extends nu_3 {
    public nt_3(gm_3 gm_32, double d, double d2, double d3, rXs_1 rXs_12) {
        super(gm_32, d, d2, d3, rXs_12);
        this.id_this = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }
}

