/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfl_3;
import celestial.rjU_2;

public class ap_3 {
    public final float id_class;
    public final float id_break;
    public final boolean id_byte;
    public final float id_protected;

    public static ap_3 id_byte(float f, float f2) {
        return new ap_3(f, f2, true);
    }

    public ap_3(float f, float f2, boolean bl) {
        this.id_class = f;
        this.id_break = f2;
        this.id_byte = bl;
        this.id_protected = f * 0.65f;
    }

    public String toString() {
        return "EntityDimensions w=" + this.id_class + ", h=" + this.id_break + ", fixed=" + this.id_byte;
    }

    public rfl_3 id_class(rjU_2 rjU_22) {
        return this.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    public ap_3 id_class(float f, float f2) {
        return !this.id_byte && (f != 1.0f || f2 != 1.0f) ? ap_3.id_break(this.id_class * f, this.id_break * f2) : this;
    }

    public rfl_3 id_class(double d, double d2, double d3) {
        float f = this.id_class / 2.0f;
        return new rfl_3(d - (double)f, d2, d3 - (double)f, d + (double)f, d2 + (double)this.id_break, d3 + (double)f);
    }

    public ap_3 id_class(float f) {
        return this.id_class(f, f);
    }

    public static ap_3 id_break(float f, float f2) {
        return new ap_3(f, f2, false);
    }
}

