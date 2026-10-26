/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.OT;
import celestial.hr_3;
import celestial.hs_3;

public class hB_2<T extends hr_3> {
    private final T id_class;
    private final OT id_break;
    private final String id_byte;

    public hB_2(T t, OT oT, String string) {
        this.id_class = t;
        this.id_break = oT;
        this.id_byte = string;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            hB_2 hB_22 = (hB_2)object;
            if (!this.id_class.equals(hB_22.id_class)) {
                return false;
            }
            return !this.id_break.equals(hB_22.id_break) ? false : this.id_byte.equals(hB_22.id_byte);
        }
        return false;
    }

    public int hashCode() {
        int n = this.id_class.hashCode();
        n = 31 * n + this.id_break.hashCode();
        return 31 * n + this.id_byte.hashCode();
    }

    public T id_class() {
        return this.id_class;
    }

    public void id_class(hs_3 hs_32) {
        hs_32.id_class(this.id_break, this.id_byte);
    }
}

