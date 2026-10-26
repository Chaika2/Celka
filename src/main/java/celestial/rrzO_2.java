/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzP_2;

public class rrzO_2 {
    private float id_class;
    private float id_break;
    private float id_byte;
    private long id_protected;

    public float id_byte() {
        return this.id_byte;
    }

    public rrzO_2(float f, float f2) {
        this(f, f2, f2);
    }

    public rrzO_2(float f, float f2, float f3) {
        this.id_class = f;
        this.id_break = f2;
        this.id_byte = f3;
        this.id_protected = System.currentTimeMillis();
    }

    public static float id_class(float f, float f2, float f3, float f4) {
        float f5;
        if (f3 <= 0.0f) {
            return f;
        }
        float f6 = f2 - f;
        if (f4 > 0.0f && f3 < f4 && Math.abs(f6) > 1.0E-6f) {
            float f7 = f4 / f3;
            float f8 = 4.61f;
            float f9 = 0.13f;
            float f10 = 10.0f;
            float f11 = f8 - 1.0f / (f9 + f7 / f10);
            float f12 = f3 / f4 * f11;
            f12 = rrzP_2.id_class(f12, 0.0f, 1.0f);
            f5 = f + f6 * f12;
        } else {
            f5 = f2;
        }
        return f5;
    }

    public float id_class(float f) {
        float f2;
        long l = System.currentTimeMillis();
        float f3 = this.id_class;
        long l2 = this.id_protected;
        float f4 = (float)(l - l2) / 1000.0f;
        float f5 = f >= f3 ? this.id_break : this.id_byte;
        this.id_class = f2 = rrzO_2.id_class(f3, f, f4, f5);
        this.id_protected = l;
        return f2;
    }

    public float id_class(float f, float f2, float f3) {
        this.id_break = f2;
        this.id_byte = f3;
        return this.id_class(f);
    }

    public float id_class() {
        return this.id_class;
    }

    public float id_break() {
        return this.id_break;
    }

    public long id_protected() {
        return this.id_protected;
    }
}

