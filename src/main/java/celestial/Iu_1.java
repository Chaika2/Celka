/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Im_1;

public class Iu_1 {
    private final Im_1 id_class;
    private int id_break;
    private int id_byte;
    private final int id_protected;

    public int id_byte() {
        return this.id_byte;
    }

    public Iu_1(Im_1 im_1, int n, int n2) {
        this.id_class = im_1;
        this.id_break = n;
        this.id_byte = n;
        this.id_protected = n2;
    }

    public void id_class(int n) {
        if (n < this.id_break) {
            this.id_break = n;
        } else if (n > this.id_byte) {
            this.id_byte = n;
        }
    }

    public Im_1 id_class() {
        return this.id_class;
    }

    public int id_break() {
        return this.id_break;
    }

    public int id_protected() {
        return this.id_protected;
    }
}

