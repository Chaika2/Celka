/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ix_1;
import celestial.rjo_3;
import celestial.rqO_2;
import java.util.Objects;

public class IK
implements Ix_1 {
    private final rqO_2 id_class;
    private final rjo_3 id_break;
    private final boolean id_byte;
    private final int id_protected;

    public rqO_2 id_byte() {
        return this.id_class;
    }

    public IK(rqO_2 rqO_22, rjo_3 rjo_32, boolean bl, int n) {
        this.id_class = rqO_22;
        this.id_break = rjo_32;
        this.id_byte = bl;
        this.id_protected = n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof IK)) {
            return false;
        }
        IK iK = (IK)object;
        return this.id_class.equals(iK.id_class) && Objects.equals(this.id_break, iK.id_break) && this.id_byte == iK.id_byte && this.id_protected == iK.id_protected;
    }

    public String toString() {
        return "Variant{modelLocation=" + this.id_class + ", rotation=" + this.id_break + ", uvLock=" + this.id_byte + ", weight=" + this.id_protected + "}";
    }

    public int hashCode() {
        int n = this.id_class.hashCode();
        n = 31 * n + this.id_break.hashCode();
        n = 31 * n + Boolean.valueOf(this.id_byte).hashCode();
        return 31 * n + this.id_protected;
    }

    @Override
    public rjo_3 id_class() {
        return this.id_break;
    }

    @Override
    public boolean id_break() {
        return this.id_byte;
    }

    public int id_protected() {
        return this.id_protected;
    }
}

