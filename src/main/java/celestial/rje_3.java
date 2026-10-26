/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.Float2FloatFunction
 */
package celestial;

import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rjY_2;
import celestial.rjj_3;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

public final class rje_3 {
    public static rje_3 id_class = new rje_3(-1.0f, 0.0f, 0.0f);
    public static rje_3 id_break = new rje_3(1.0f, 0.0f, 0.0f);
    public static rje_3 id_byte = new rje_3(0.0f, -1.0f, 0.0f);
    public static rje_3 id_protected = new rje_3(0.0f, 1.0f, 0.0f);
    public static rje_3 id_throws = new rje_3(0.0f, 0.0f, -1.0f);
    public static rje_3 id_case = new rje_3(0.0f, 0.0f, 1.0f);
    public float id_catch;
    public float id_private;
    public float id_implements;

    public void id_byte(float f, float f2, float f3) {
        this.id_catch += f;
        this.id_private += f2;
        this.id_implements += f3;
    }

    public float id_byte() {
        return this.id_implements;
    }

    public rjY_2 id_byte(float f) {
        return new rjY_2(this, f, true);
    }

    public float id_byte(rje_3 rje_32) {
        return this.id_catch * rje_32.id_catch + this.id_private * rje_32.id_private + this.id_implements * rje_32.id_implements;
    }

    public rje_3() {
    }

    public rje_3(float f, float f2, float f3) {
        this.id_catch = f;
        this.id_private = f2;
        this.id_implements = f3;
    }

    public rje_3(rjU_2 rjU_22) {
        this((float)rjU_22.id_break, (float)rjU_22.id_byte, (float)rjU_22.id_protected);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rje_3 rje_32 = (rje_3)object;
            if (Float.compare(rje_32.id_catch, this.id_catch) != 0) {
                return false;
            }
            if (Float.compare(rje_32.id_private, this.id_private) != 0) {
                return false;
            }
            return Float.compare(rje_32.id_implements, this.id_implements) == 0;
        }
        return false;
    }

    public String toString() {
        return "[" + this.id_catch + ", " + this.id_private + ", " + this.id_implements + "]";
    }

    public int hashCode() {
        int n = Float.floatToIntBits(this.id_catch);
        n = 31 * n + Float.floatToIntBits(this.id_private);
        return 31 * n + Float.floatToIntBits(this.id_implements);
    }

    public float id_class() {
        return this.id_catch;
    }

    public void id_class(rjY_2 rjY_22) {
        rjY_2 rjY_23 = new rjY_2(rjY_22);
        rjY_23.id_class(new rjY_2(this.id_class(), this.id_break(), this.id_byte(), 0.0f));
        rjY_2 rjY_24 = new rjY_2(rjY_22);
        rjY_24.id_throws();
        rjY_23.id_class(rjY_24);
        this.id_break(rjY_23.id_class(), rjY_23.id_break(), rjY_23.id_byte());
    }

    public void id_class(rje_3 rje_32, float f) {
        float f2 = 1.0f - f;
        this.id_catch = this.id_catch * f2 + rje_32.id_catch * f;
        this.id_private = this.id_private * f2 + rje_32.id_private * f;
        this.id_implements = this.id_implements * f2 + rje_32.id_implements * f;
    }

    public void id_class(rjj_3 rjj_32) {
        float f = this.id_catch;
        float f2 = this.id_private;
        float f3 = this.id_implements;
        this.id_catch = rjj_32.id_class * f + rjj_32.id_break * f2 + rjj_32.id_byte * f3;
        this.id_private = rjj_32.id_protected * f + rjj_32.id_throws * f2 + rjj_32.id_case * f3;
        this.id_implements = rjj_32.id_catch * f + rjj_32.id_private * f2 + rjj_32.id_implements * f3;
    }

    public void id_class(float f) {
        this.id_catch *= f;
        this.id_private *= f;
        this.id_implements *= f;
    }

    public void id_class(float f, float f2, float f3) {
        this.id_catch *= f;
        this.id_private *= f2;
        this.id_implements *= f3;
    }

    public void id_class(float f, float f2) {
        this.id_catch = rfU_2.id_class(this.id_catch, f, f2);
        this.id_private = rfU_2.id_class(this.id_private, f, f2);
        this.id_implements = rfU_2.id_class(this.id_implements, f, f2);
    }

    public void id_class(Float2FloatFunction float2FloatFunction) {
        this.id_catch = float2FloatFunction.get(this.id_catch);
        this.id_private = float2FloatFunction.get(this.id_private);
        this.id_implements = float2FloatFunction.get(this.id_implements);
    }

    public void id_class(rje_3 rje_32) {
        this.id_catch += rje_32.id_catch;
        this.id_private += rje_32.id_private;
        this.id_implements += rje_32.id_implements;
    }

    public rjY_2 id_break(float f) {
        return new rjY_2(this, f, false);
    }

    public float id_break() {
        return this.id_private;
    }

    public void id_break(float f, float f2, float f3) {
        this.id_catch = f;
        this.id_private = f2;
        this.id_implements = f3;
    }

    public void id_break(rje_3 rje_32) {
        this.id_catch -= rje_32.id_catch;
        this.id_private -= rje_32.id_private;
        this.id_implements -= rje_32.id_implements;
    }

    public rje_3 id_throws() {
        return new rje_3(this.id_catch, this.id_private, this.id_implements);
    }

    public rje_3 id_protected(float f, float f2, float f3) {
        this.id_catch -= f;
        this.id_private -= f2;
        this.id_implements -= f3;
        return this;
    }

    public boolean id_protected() {
        float f = this.id_catch * this.id_catch + this.id_private * this.id_private + this.id_implements * this.id_implements;
        if ((double)f < 1.0E-5) {
            return false;
        }
        float f2 = rfU_2.id_implements(f);
        this.id_catch *= f2;
        this.id_private *= f2;
        this.id_implements *= f2;
        return true;
    }

    public void id_protected(rje_3 rje_32) {
        float f = this.id_catch;
        float f2 = this.id_private;
        float f3 = this.id_implements;
        float f4 = rje_32.id_class();
        float f5 = rje_32.id_break();
        float f6 = rje_32.id_byte();
        this.id_catch = f2 * f6 - f3 * f5;
        this.id_private = f3 * f4 - f * f6;
        this.id_implements = f * f5 - f2 * f4;
    }
}

