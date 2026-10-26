/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class vZ_2 {
    private final float id_class;
    private final float id_break;
    private final float id_byte;
    private final float id_protected;

    public float id_byte() {
        return this.id_byte;
    }

    public vZ_2(float f, float f2, float f3, float f4) {
        this.id_class = f;
        this.id_break = f2;
        this.id_byte = f3;
        this.id_protected = f4;
    }

    public boolean id_class(float f, float f2) {
        return f >= this.id_class && f <= this.id_byte && f2 >= this.id_break && f2 <= this.id_protected;
    }

    public float id_class() {
        return this.id_class;
    }

    public float id_break() {
        return this.id_break;
    }

    public float id_protected() {
        return this.id_protected;
    }
}

