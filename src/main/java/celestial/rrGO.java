/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rrGh_1;
import java.util.Objects;

public class rrGO {
    private final rrGh_1 id_class;
    private byte id_break;
    private byte id_byte;
    private byte id_protected;
    private final rgP_2 id_throws;

    public byte id_byte() {
        return this.id_break;
    }

    public rrGO(rrGh_1 rrGh_12, byte by, byte by2, byte by3, rgP_2 rgP_22) {
        this.id_class = rrGh_12;
        this.id_break = by;
        this.id_byte = by2;
        this.id_protected = by3;
        this.id_throws = rgP_22;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rrGO)) {
            return false;
        }
        rrGO rrGO2 = (rrGO)object;
        if (this.id_class != rrGO2.id_class) {
            return false;
        }
        if (this.id_protected != rrGO2.id_protected) {
            return false;
        }
        if (this.id_break != rrGO2.id_break) {
            return false;
        }
        if (this.id_byte != rrGO2.id_byte) {
            return false;
        }
        return Objects.equals(this.id_throws, rrGO2.id_throws);
    }

    public int hashCode() {
        int n = this.id_class.id_class();
        n = 31 * n + this.id_break;
        n = 31 * n + this.id_byte;
        n = 31 * n + this.id_protected;
        return 31 * n + Objects.hashCode(this.id_throws);
    }

    public byte id_class() {
        return this.id_class.id_class();
    }

    public rrGh_1 id_break() {
        return this.id_class;
    }

    public byte id_throws() {
        return this.id_protected;
    }

    public rgP_2 id_catch() {
        return this.id_throws;
    }

    public boolean id_case() {
        return this.id_class.id_break();
    }

    public byte id_protected() {
        return this.id_byte;
    }
}

