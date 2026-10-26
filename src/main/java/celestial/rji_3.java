/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rjV_2;
import celestial.rjY_2;
import celestial.rje_3;

public class rji_3 {
    public static final rji_3 id_class = new rji_3(0.0f, 0.0f, 0.0f, 0.0f);
    private float id_break;
    private float id_byte;
    private float id_protected;
    private float id_throws;

    public float id_byte() {
        return this.id_protected;
    }

    public rji_3() {
    }

    public rji_3(rje_3 rje_32) {
        this(rje_32.id_class(), rje_32.id_break(), rje_32.id_byte(), 1.0f);
    }

    public rji_3(float f, float f2, float f3, float f4) {
        this.id_break = f;
        this.id_byte = f2;
        this.id_protected = f3;
        this.id_throws = f4;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rji_3 rji_32 = (rji_3)object;
            if (Float.compare(rji_32.id_break, this.id_break) != 0) {
                return false;
            }
            if (Float.compare(rji_32.id_byte, this.id_byte) != 0) {
                return false;
            }
            if (Float.compare(rji_32.id_protected, this.id_protected) != 0) {
                return false;
            }
            return Float.compare(rji_32.id_throws, this.id_throws) == 0;
        }
        return false;
    }

    public String toString() {
        return "[" + this.id_break + ", " + this.id_byte + ", " + this.id_protected + ", " + this.id_throws + "]";
    }

    public int hashCode() {
        int n = Float.floatToIntBits(this.id_break);
        n = 31 * n + Float.floatToIntBits(this.id_byte);
        n = 31 * n + Float.floatToIntBits(this.id_protected);
        return 31 * n + Float.floatToIntBits(this.id_throws);
    }

    public void id_class(rjV_2 rjV_22) {
        float f = this.id_break;
        float f2 = this.id_byte;
        float f3 = this.id_protected;
        float f4 = this.id_throws;
        this.id_break = rjV_22.id_class * f + rjV_22.id_break * f2 + rjV_22.id_byte * f3 + rjV_22.id_protected * f4;
        this.id_byte = rjV_22.id_throws * f + rjV_22.id_case * f2 + rjV_22.id_catch * f3 + rjV_22.id_private * f4;
        this.id_protected = rjV_22.id_implements * f + rjV_22.id_finally * f2 + rjV_22.id_extends * f3 + rjV_22.id_native * f4;
        this.id_throws = rjV_22.id_volatile * f + rjV_22.id_final * f2 + rjV_22.id_package * f3 + rjV_22.id_int * f4;
    }

    public float id_class(rji_3 rji_32) {
        return this.id_break * rji_32.id_break + this.id_byte * rji_32.id_byte + this.id_protected * rji_32.id_protected + this.id_throws * rji_32.id_throws;
    }

    public void id_class(rjY_2 rjY_22) {
        rjY_2 rjY_23 = new rjY_2(rjY_22);
        rjY_23.id_class(new rjY_2(this.id_class(), this.id_break(), this.id_byte(), 0.0f));
        rjY_2 rjY_24 = new rjY_2(rjY_22);
        rjY_24.id_throws();
        rjY_23.id_class(rjY_24);
        this.id_class(rjY_23.id_class(), rjY_23.id_break(), rjY_23.id_byte(), this.id_protected());
    }

    public void id_class(rje_3 rje_32) {
        this.id_break *= rje_32.id_class();
        this.id_byte *= rje_32.id_break();
        this.id_protected *= rje_32.id_byte();
    }

    public float id_class() {
        return this.id_break;
    }

    public void id_class(float f) {
        float f2 = 1.0f / f;
        this.id_break *= f2;
        this.id_byte *= f2;
        this.id_protected *= f2;
        this.id_throws *= f2;
    }

    public void id_class(float f, float f2, float f3, float f4) {
        this.id_break = f;
        this.id_byte = f2;
        this.id_protected = f3;
        this.id_throws = f4;
    }

    public float id_break() {
        return this.id_byte;
    }

    public boolean id_throws() {
        float f = this.id_break * this.id_break + this.id_byte * this.id_byte + this.id_protected * this.id_protected + this.id_throws * this.id_throws;
        if ((double)f < 1.0E-5) {
            return false;
        }
        float f2 = rfU_2.id_implements(f);
        this.id_break *= f2;
        this.id_byte *= f2;
        this.id_protected *= f2;
        this.id_throws *= f2;
        return true;
    }

    public void id_case() {
        this.id_break /= this.id_throws;
        this.id_byte /= this.id_throws;
        this.id_protected /= this.id_throws;
        this.id_throws = 1.0f;
    }

    public float id_protected() {
        return this.id_throws;
    }
}

