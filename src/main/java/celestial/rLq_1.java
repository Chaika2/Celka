/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLp_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.ruu_3;

public class rLq_1 {
    public final int id_class;
    public final int id_break;
    public final int id_byte;
    private final int id_volatile;
    public int id_protected = -1;
    public float id_throws;
    public float id_case;
    public float id_catch;
    public rLq_1 id_private;
    public boolean id_implements;
    public float id_finally;
    public float id_extends;
    public rLp_1 id_native = rLp_1.BLOCKED;

    public rfH_2 id_byte() {
        return new rfH_2(this.id_class, this.id_break, this.id_byte);
    }

    public float id_byte(rLq_1 rLq_12) {
        float f = Math.abs(rLq_12.id_class - this.id_class);
        float f2 = Math.abs(rLq_12.id_break - this.id_break);
        float f3 = Math.abs(rLq_12.id_byte - this.id_byte);
        return f + f2 + f3;
    }

    public rLq_1(int n, int n2, int n3) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_volatile = rLq_1.id_break(n, n2, n3);
    }

    public boolean equals(Object object) {
        if (!(object instanceof rLq_1)) {
            return false;
        }
        rLq_1 rLq_12 = (rLq_1)object;
        return this.id_volatile == rLq_12.id_volatile && this.id_class == rLq_12.id_class && this.id_break == rLq_12.id_break && this.id_byte == rLq_12.id_byte;
    }

    public String toString() {
        return "Node{x=" + this.id_class + ", y=" + this.id_break + ", z=" + this.id_byte + "}";
    }

    public int hashCode() {
        return this.id_volatile;
    }

    public float id_class(rfH_2 rfH_22) {
        float f = Math.abs(rfH_22.b_() - this.id_class);
        float f2 = Math.abs(rfH_22.c_() - this.id_break);
        float f3 = Math.abs(rfH_22.d_() - this.id_byte);
        return f + f2 + f3;
    }

    public rLq_1 id_class(int n, int n2, int n3) {
        rLq_1 rLq_12 = new rLq_1(n, n2, n3);
        rLq_12.id_protected = this.id_protected;
        rLq_12.id_throws = this.id_throws;
        rLq_12.id_case = this.id_case;
        rLq_12.id_catch = this.id_catch;
        rLq_12.id_private = this.id_private;
        rLq_12.id_implements = this.id_implements;
        rLq_12.id_finally = this.id_finally;
        rLq_12.id_extends = this.id_extends;
        rLq_12.id_native = this.id_native;
        return rLq_12;
    }

    public float id_class(rLq_1 rLq_12) {
        float f = rLq_12.id_class - this.id_class;
        float f2 = rLq_12.id_break - this.id_break;
        float f3 = rLq_12.id_byte - this.id_byte;
        return rfU_2.id_byte(f * f + f2 * f2 + f3 * f3);
    }

    public static rLq_1 id_break(ruu_3 ruu_32) {
        rLq_1 rLq_12 = new rLq_1(ruu_32.readInt(), ruu_32.readInt(), ruu_32.readInt());
        rLq_12.id_finally = ruu_32.readFloat();
        rLq_12.id_extends = ruu_32.readFloat();
        rLq_12.id_implements = ruu_32.readBoolean();
        rLq_12.id_native = rLp_1.values()[ruu_32.readInt()];
        rLq_12.id_catch = ruu_32.readFloat();
        return rLq_12;
    }

    public static int id_break(int n, int n2, int n3) {
        return n2 & 0xFF | (n & Short.MAX_VALUE) << 8 | (n3 & Short.MAX_VALUE) << 24 | (n < 0 ? Integer.MIN_VALUE : 0) | (n3 < 0 ? 32768 : 0);
    }

    public float id_break(rLq_1 rLq_12) {
        float f = rLq_12.id_class - this.id_class;
        float f2 = rLq_12.id_break - this.id_break;
        float f3 = rLq_12.id_byte - this.id_byte;
        return f * f + f2 * f2 + f3 * f3;
    }

    public boolean id_protected() {
        return this.id_protected >= 0;
    }
}

