/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.uJ_2;

public class uh_3 {
    public final int id_class;
    public final int id_break;
    private final int id_byte;
    private final int id_protected;
    private uh_3 id_throws;
    private uh_3 id_case;
    private boolean id_catch;

    public uh_3(int n, int n2, int n3, int n4) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_protected = n4;
    }

    public uh_3 id_class(uJ_2 uJ_22) {
        if (this.id_throws != null && this.id_case != null) {
            uh_3 uh_32 = this.id_throws.id_class(uJ_22);
            if (uh_32 == null) {
                uh_32 = this.id_case.id_class(uJ_22);
            }
            return uh_32;
        }
        if (this.id_catch) {
            return null;
        }
        int n = uJ_22.id_class();
        int n2 = uJ_22.id_break();
        if (n <= this.id_byte && n2 <= this.id_protected) {
            if (n == this.id_byte && n2 == this.id_protected) {
                this.id_catch = true;
                return this;
            }
            int n3 = this.id_byte - n;
            int n4 = this.id_protected - n2;
            if (n3 > n4) {
                this.id_throws = new uh_3(this.id_class, this.id_break, n, this.id_protected);
                this.id_case = new uh_3(this.id_class + n + 1, this.id_break, this.id_byte - n - 1, this.id_protected);
            } else {
                this.id_throws = new uh_3(this.id_class, this.id_break, this.id_byte, n2);
                this.id_case = new uh_3(this.id_class, this.id_break + n2 + 1, this.id_byte, this.id_protected - n2 - 1);
            }
            return this.id_throws.id_class(uJ_22);
        }
        return null;
    }
}

