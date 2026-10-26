/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjY_2;
import celestial.rje_3;
import celestial.rpr_3;

public interface rfe_3 {
    default public float id_byte(rje_3 rje_32) {
        return this.id_byte(rje_32.id_class(), rje_32.id_break(), rje_32.id_byte());
    }

    public float id_byte(float var1, float var2, float var3);

    public int id_class(rpr_3 var1);

    default public float id_class(rje_3 rje_32) {
        return this.id_class(rje_32.id_class(), rje_32.id_break(), rje_32.id_byte());
    }

    public void id_class(rjY_2 var1);

    public float id_class(float var1, float var2, float var3);

    default public float id_break(rje_3 rje_32) {
        return this.id_break(rje_32.id_class(), rje_32.id_break(), rje_32.id_byte());
    }

    public float id_break(float var1, float var2, float var3);
}

