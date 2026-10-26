/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrub_1;

public interface rruG {
    public float id_byte(float var1);

    public float id_class(float var1);

    default public rrub_1 id_break(float f) {
        return new rrub_1(this.id_class(f), this.id_protected(f), this.id_byte(f));
    }

    public float id_protected(float var1);
}

