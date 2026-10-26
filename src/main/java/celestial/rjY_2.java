/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rje_3;

public final class rjY_2 {
    public static final rjY_2 id_class = new rjY_2(0.0f, 0.0f, 0.0f, 1.0f);
    private float id_break;
    private float id_byte;
    private float id_protected;
    private float id_throws;

    private static float id_byte(float f) {
        return (float)Math.sin(f);
    }

    public float id_byte() {
        return this.id_protected;
    }

    public rjY_2(float f, float f2, float f3, float f4) {
        this.id_break = f;
        this.id_byte = f2;
        this.id_protected = f3;
        this.id_throws = f4;
    }

    public rjY_2(rjY_2 rjY_22) {
        this.id_break = rjY_22.id_break;
        this.id_byte = rjY_22.id_byte;
        this.id_protected = rjY_22.id_protected;
        this.id_throws = rjY_22.id_throws;
    }

    public rjY_2(float f, float f2, float f3, boolean bl) {
        if (bl) {
            f *= (float)Math.PI / 180;
            f2 *= (float)Math.PI / 180;
            f3 *= (float)Math.PI / 180;
        }
        float f4 = rjY_2.id_byte(0.5f * f);
        float f5 = rjY_2.id_break(0.5f * f);
        float f6 = rjY_2.id_byte(0.5f * f2);
        float f7 = rjY_2.id_break(0.5f * f2);
        float f8 = rjY_2.id_byte(0.5f * f3);
        float f9 = rjY_2.id_break(0.5f * f3);
        this.id_break = f4 * f7 * f9 + f5 * f6 * f8;
        this.id_byte = f5 * f6 * f9 - f4 * f7 * f8;
        this.id_protected = f4 * f6 * f9 + f5 * f7 * f8;
        this.id_throws = f5 * f7 * f9 - f4 * f6 * f8;
    }

    public rjY_2(rje_3 rje_32, float f, boolean bl) {
        if (bl) {
            f *= (float)Math.PI / 180;
        }
        float f2 = rjY_2.id_byte(f / 2.0f);
        this.id_break = rje_32.id_class() * f2;
        this.id_byte = rje_32.id_break() * f2;
        this.id_protected = rje_32.id_byte() * f2;
        this.id_throws = rjY_2.id_break(f / 2.0f);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rjY_2 rjY_22 = (rjY_2)object;
            if (Float.compare(rjY_22.id_break, this.id_break) != 0) {
                return false;
            }
            if (Float.compare(rjY_22.id_byte, this.id_byte) != 0) {
                return false;
            }
            if (Float.compare(rjY_22.id_protected, this.id_protected) != 0) {
                return false;
            }
            return Float.compare(rjY_22.id_throws, this.id_throws) == 0;
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Quaternion[").append(this.id_protected()).append(" + ");
        stringBuilder.append(this.id_class()).append("i + ");
        stringBuilder.append(this.id_break()).append("j + ");
        stringBuilder.append(this.id_byte()).append("k]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        int n = Float.floatToIntBits(this.id_break);
        n = 31 * n + Float.floatToIntBits(this.id_byte);
        n = 31 * n + Float.floatToIntBits(this.id_protected);
        return 31 * n + Float.floatToIntBits(this.id_throws);
    }

    public void id_class(float f) {
        this.id_break *= f;
        this.id_byte *= f;
        this.id_protected *= f;
        this.id_throws *= f;
    }

    public void id_class(float f, float f2, float f3, float f4) {
        this.id_break = f;
        this.id_byte = f2;
        this.id_protected = f3;
        this.id_throws = f4;
    }

    public float id_class() {
        return this.id_break;
    }

    public void id_class(rjY_2 rjY_22) {
        float f = this.id_class();
        float f2 = this.id_break();
        float f3 = this.id_byte();
        float f4 = this.id_protected();
        float f5 = rjY_22.id_class();
        float f6 = rjY_22.id_break();
        float f7 = rjY_22.id_byte();
        float f8 = rjY_22.id_protected();
        this.id_break = f4 * f5 + f * f8 + f2 * f7 - f3 * f6;
        this.id_byte = f4 * f6 - f * f7 + f2 * f8 + f3 * f5;
        this.id_protected = f4 * f7 + f * f6 - f2 * f5 + f3 * f8;
        this.id_throws = f4 * f8 - f * f5 - f2 * f6 - f3 * f7;
    }

    public float id_break() {
        return this.id_byte;
    }

    private static float id_break(float f) {
        return (float)Math.cos(f);
    }

    public void id_throws() {
        this.id_break = -this.id_break;
        this.id_byte = -this.id_byte;
        this.id_protected = -this.id_protected;
    }

    public rjY_2 id_catch() {
        return new rjY_2(this);
    }

    public void id_case() {
        float f = this.id_class() * this.id_class() + this.id_break() * this.id_break() + this.id_byte() * this.id_byte() + this.id_protected() * this.id_protected();
        if (f > 1.0E-6f) {
            float f2 = rfU_2.id_implements(f);
            this.id_break *= f2;
            this.id_byte *= f2;
            this.id_protected *= f2;
            this.id_throws *= f2;
        } else {
            this.id_break = 0.0f;
            this.id_byte = 0.0f;
            this.id_protected = 0.0f;
            this.id_throws = 0.0f;
        }
    }

    public float id_protected() {
        return this.id_throws;
    }
}

