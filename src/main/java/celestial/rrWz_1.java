/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.awt.Dimension;

public class rrWz_1 {
    private boolean id_class = false;
    private float id_break;
    private float id_byte;

    public float id_byte() {
        return this.id_byte;
    }

    public rrWz_1(boolean bl, float f, float f2) {
        this.id_class = bl;
        this.id_break = f;
        this.id_byte = f2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof rrWz_1)) {
            return false;
        }
        rrWz_1 rrWz_12 = (rrWz_1)object;
        if (this.id_class != rrWz_12.id_class) {
            return false;
        }
        if (this.id_break != rrWz_12.id_break) {
            return false;
        }
        return this.id_byte == rrWz_12.id_byte;
    }

    public int hashCode() {
        int n = this.id_class ? 1 : 0;
        n = n * 37 + (int)this.id_break;
        return n * 37 + (int)this.id_byte;
    }

    public Dimension id_class(int n, int n2) {
        return this.id_class ? new Dimension((int)(this.id_break * (float)n), (int)(this.id_byte * (float)n2)) : new Dimension((int)this.id_break, (int)this.id_byte);
    }

    public boolean id_class() {
        return this.id_class;
    }

    public float id_break() {
        return this.id_break;
    }
}

