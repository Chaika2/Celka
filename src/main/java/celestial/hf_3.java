/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Xh_1;
import celestial.hI_2;

public class hf_3 {
    private Xh_1 id_class = Xh_1.id_class;
    private Xh_1 id_break = Xh_1.id_class;
    private Xh_1 id_byte = Xh_1.id_class;
    private Xh_1 id_protected = Xh_1.id_class;
    private Xh_1 id_throws = Xh_1.id_class;
    private Xh_1 id_case = Xh_1.id_class;

    public hf_3 id_byte(Xh_1 xh_1) {
        this.id_byte = xh_1;
        return this;
    }

    public static hf_3 id_class() {
        return new hf_3();
    }

    public hf_3 id_class(Xh_1 xh_1) {
        this.id_class = xh_1;
        return this;
    }

    public hI_2 id_break() {
        return new hI_2(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case);
    }

    public hf_3 id_break(Xh_1 xh_1) {
        this.id_break = xh_1;
        return this;
    }

    public hf_3 id_protected(Xh_1 xh_1) {
        this.id_protected = xh_1;
        return this;
    }
}

