/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rje_3;

public class It_1 {
    public final rje_3 id_class;
    public final float id_break;
    public final float id_byte;

    public It_1(float f, float f2, float f3, float f4, float f5) {
        this(new rje_3(f, f2, f3), f4, f5);
    }

    public It_1(rje_3 rje_32, float f, float f2) {
        this.id_class = rje_32;
        this.id_break = f;
        this.id_byte = f2;
    }

    public It_1 id_class(float f, float f2) {
        return new It_1(this.id_class, f, f2);
    }
}

