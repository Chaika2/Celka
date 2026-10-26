/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;

public class rfg_3 {
    public final int id_class;
    public final int id_break;

    public rfg_3(int n, int n2) {
        this.id_class = n;
        this.id_break = n2;
    }

    public rfg_3(rfH_2 rfH_22) {
        this.id_class = rfH_22.b_();
        this.id_break = rfH_22.d_();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rfg_3)) {
            return false;
        }
        rfg_3 rfg_32 = (rfg_3)object;
        return this.id_class == rfg_32.id_class && this.id_break == rfg_32.id_break;
    }

    public String toString() {
        return "[" + this.id_class + ", " + this.id_break + "]";
    }

    public int hashCode() {
        int n = 1664525 * this.id_class + 1013904223;
        int n2 = 1664525 * (this.id_break ^ 0xDEADBEEF) + 1013904223;
        return n ^ n2;
    }
}

