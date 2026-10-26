/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rrdj_1 {
    private float id_class = 1.0f;
    private float id_break = 0.0f;
    private float id_byte = 0.0f;

    public float id_byte() {
        return this.id_byte;
    }

    public rrdj_1(float f, float f2, float f3) {
        this.id_class = f;
        this.id_break = f2;
        this.id_byte = f3;
    }

    public String toString() {
        return this.id_class + ", " + this.id_break + ", " + this.id_byte;
    }

    public float id_class() {
        return this.id_class;
    }

    public float id_break() {
        return this.id_break;
    }
}

