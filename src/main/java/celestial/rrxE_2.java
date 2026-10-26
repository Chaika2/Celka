/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrxB_2;
import celestial.rrxr_3;
import celestial.rrxs_3;

public class rrxE_2 {
    private rrxB_2 id_class;
    private Class id_break;
    private int id_byte;
    private rrxs_3[] id_protected;

    public int id_byte() {
        return this.id_byte;
    }

    public rrxE_2(rrxB_2 rrxB_22, Class clazz, int n) {
        this.id_class = rrxB_22;
        this.id_break = clazz;
        this.id_byte = n;
        if (rrxB_22.id_byte() && clazz != null) {
            this.id_protected = new rrxs_3[n];
            for (int i = 0; i < this.id_protected.length; ++i) {
                this.id_protected[i] = new rrxs_3(rrxB_22, clazz, i);
            }
        }
    }

    public rrxs_3 id_class(int n) {
        return n >= 0 && n < this.id_protected.length ? this.id_protected[n] : null;
    }

    public Object id_class(Object object, int n) {
        return rrxr_3.id_class(object, this, n);
    }

    public void id_class(Object object, int n, Object object2) {
        rrxr_3.id_class(object, this, n, object2);
    }

    public rrxB_2 id_class() {
        return this.id_class;
    }

    public Class id_break() {
        return this.id_break;
    }

    public boolean id_protected() {
        if (this.id_protected == null) {
            return false;
        }
        for (int i = 0; i < this.id_protected.length; ++i) {
            rrxs_3 rrxs_32 = this.id_protected[i];
            if (rrxs_32.id_protected()) continue;
            return false;
        }
        return true;
    }
}

