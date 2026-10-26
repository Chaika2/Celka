/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HC;
import celestial.HH;
import celestial.HK;
import celestial.HR;
import celestial.HT;
import celestial.HV;
import celestial.HY;
import celestial.Ha_1;
import celestial.He_1;
import celestial.Hf_1;
import celestial.Hg_1;
import celestial.Hn_1;
import celestial.Ho_1;
import celestial.Hp_1;
import celestial.Hq_1;
import celestial.Ht_1;
import celestial.Hw_1;
import celestial.Hy_1;

public class Hi_1 {
    private HR id_class = Hn_1.id_new;
    private Ho_1 id_break = Hn_1.id_byte;
    private Hp_1 id_byte = Hn_1.id_try;
    private HV id_protected = Hn_1.id_volatile;
    private HC id_throws = Hn_1.id_implements;
    private Hy_1 id_case = Hn_1.id_abstract;
    private HH id_catch = Hn_1.id_instanceof;
    private Ht_1 id_private = Hn_1.id_return;
    private Hf_1 id_implements = Hn_1.id_goto;
    private Hq_1 id_finally = Hn_1.id_const;
    private HT id_extends = Hn_1.id_static;
    private Hg_1 id_native = Hn_1.id_boolean;
    private HY id_volatile = Hn_1.id_continue;
    private HK id_final = Hn_1.id_long;
    private Hw_1 id_package = Hn_1.B;

    public Hi_1 id_class(HT hT) {
        this.id_extends = hT;
        return this;
    }

    public Hi_1 id_class(Hg_1 hg_1) {
        this.id_native = hg_1;
        return this;
    }

    public Hi_1 id_class(HY hY) {
        this.id_volatile = hY;
        return this;
    }

    public Hi_1 id_class(Hq_1 hq_1) {
        this.id_finally = hq_1;
        return this;
    }

    public Hi_1 id_class(Hf_1 hf_1) {
        this.id_implements = hf_1;
        return this;
    }

    public Ha_1 id_class(He_1 he_1) {
        return new Ha_1(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_native, this.id_volatile, this.id_final, this.id_package, he_1);
    }

    public Ha_1 id_class(boolean bl) {
        return this.id_class(bl ? He_1.AFFECTS_OUTLINE : He_1.NONE);
    }

    public Hi_1 id_class(Hw_1 hw_1) {
        this.id_package = hw_1;
        return this;
    }

    public Hi_1 id_class(HK hK) {
        this.id_final = hK;
        return this;
    }

    public Hi_1 id_class(HV hV) {
        this.id_protected = hV;
        return this;
    }

    public Hi_1 id_class(Hp_1 hp_1) {
        this.id_byte = hp_1;
        return this;
    }

    public Hi_1 id_class(Ho_1 ho_1) {
        this.id_break = ho_1;
        return this;
    }

    public Hi_1 id_class(HR hR) {
        this.id_class = hR;
        return this;
    }

    public Hi_1 id_class(Ht_1 ht_1) {
        this.id_private = ht_1;
        return this;
    }

    public Hi_1 id_class(HH hH) {
        this.id_catch = hH;
        return this;
    }

    public Hi_1 id_class(Hy_1 hy_1) {
        this.id_case = hy_1;
        return this;
    }

    public Hi_1 id_class(HC hC) {
        this.id_throws = hC;
        return this;
    }
}

