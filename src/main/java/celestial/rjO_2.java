/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcu_3;
import celestial.rcy_3;

public class rjO_2 {
    protected final float id_class;
    protected final float id_break;
    protected final float id_byte;

    public float id_byte() {
        return this.id_break;
    }

    public rjO_2(float f, float f2, float f3) {
        this.id_class = !Float.isInfinite(f) && !Float.isNaN(f) ? f % 360.0f : 0.0f;
        this.id_break = !Float.isInfinite(f2) && !Float.isNaN(f2) ? f2 % 360.0f : 0.0f;
        this.id_byte = !Float.isInfinite(f3) && !Float.isNaN(f3) ? f3 % 360.0f : 0.0f;
    }

    public rjO_2(rcy_3 rcy_32) {
        this(rcy_32.id_private(0), rcy_32.id_private(1), rcy_32.id_private(2));
    }

    public boolean equals(Object object) {
        if (!(object instanceof rjO_2)) {
            return false;
        }
        rjO_2 rjO_22 = (rjO_2)object;
        return this.id_class == rjO_22.id_class && this.id_break == rjO_22.id_break && this.id_byte == rjO_22.id_byte;
    }

    public rcy_3 id_class() {
        rcy_3 rcy_32 = new rcy_3();
        rcy_32.add(rcu_3.id_class(this.id_class));
        rcy_32.add(rcu_3.id_class(this.id_break));
        rcy_32.add(rcu_3.id_class(this.id_byte));
        return rcy_32;
    }

    public float id_break() {
        return this.id_class;
    }

    public float id_protected() {
        return this.id_byte;
    }
}

