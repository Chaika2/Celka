/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Ok_1;
import celestial.an_3;
import celestial.wN_2;

public abstract class tO_2<E extends an_3>
extends wN_2<E> {
    private float id_class = 1.0f;
    private float id_break = 1.0f;
    private float id_byte = 1.0f;

    public void id_class(float f, float f2, float f3) {
        this.id_class = f;
        this.id_break = f2;
        this.id_byte = f3;
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        super.id_class(ml_1, ok_1, n, n2, this.id_class * f, this.id_break * f2, this.id_byte * f3, f4);
    }
}

