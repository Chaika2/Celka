/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rjY_2;
import celestial.rje_3;

public class IL {
    public static final IL id_class = new IL(new rje_3(), new rje_3(), new rje_3(1.0f, 1.0f, 1.0f));
    public final rje_3 id_break;
    public final rje_3 id_byte;
    public final rje_3 id_protected;

    public IL(rje_3 rje_32, rje_3 rje_33, rje_3 rje_34) {
        this.id_break = rje_32.id_throws();
        this.id_byte = rje_33.id_throws();
        this.id_protected = rje_34.id_throws();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        IL iL = (IL)object;
        return this.id_break.equals(iL.id_break) && this.id_protected.equals(iL.id_protected) && this.id_byte.equals(iL.id_byte);
    }

    public int hashCode() {
        int n = this.id_break.hashCode();
        n = 31 * n + this.id_byte.hashCode();
        return 31 * n + this.id_protected.hashCode();
    }

    public void id_class(boolean bl, Ml_1 ml_1) {
        if (this != id_class) {
            float f = this.id_break.id_class();
            float f2 = this.id_break.id_break();
            float f3 = this.id_break.id_byte();
            if (bl) {
                f2 = -f2;
                f3 = -f3;
            }
            int n = bl ? -1 : 1;
            ml_1.id_class((double)((float)n * this.id_byte.id_class()), (double)this.id_byte.id_break(), (double)this.id_byte.id_byte());
            ml_1.id_class(new rjY_2(f, f2, f3, true));
            ml_1.id_class(this.id_protected.id_class(), this.id_protected.id_break(), this.id_protected.id_byte());
        }
    }
}

