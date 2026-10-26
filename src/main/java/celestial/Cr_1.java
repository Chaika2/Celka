/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CK;
import celestial.Ch_1;
import celestial.Cy_1;
import celestial.Ok_1;
import celestial.gm_3;
import celestial.ly_3;

public class Cr_1
extends CK {
    private boolean id_break;
    private boolean id_interface;
    private final Cy_1 id_char;
    private float id_abstract;
    private float id_long;
    private float id_float;
    private boolean id_void;

    public Cr_1(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, Cy_1 cy_1, Ch_1 ch_1) {
        super(gm_32, d, d2, d3, ch_1, -0.004f);
        this.id_finally = d4;
        this.id_extends = d5;
        this.id_native = d6;
        this.id_char = cy_1;
        this.id_throw *= 0.75f;
        this.id_this = 48 + this.id_continue.nextInt(12);
        this.id_break(ch_1);
    }

    public void id_class(boolean bl) {
        this.id_break = bl;
    }

    @Override
    public void id_class(Ok_1 ok_1, ly_3 ly_32, float f) {
        if (!this.id_interface || this.id_super < this.id_this / 3 || (this.id_super + this.id_this) / 3 % 2 == 0) {
            super.id_class(ok_1, ly_32, f);
        }
    }

    public void id_break(boolean bl) {
        this.id_interface = bl;
    }

    @Override
    public void id_case() {
        super.id_case();
        if (this.id_break && this.id_super < this.id_this / 2 && (this.id_super + this.id_this) % 2 == 0) {
            Cr_1 cr_1 = new Cr_1(this.id_byte, this.id_catch, this.id_private, this.id_implements, 0.0, 0.0, 0.0, this.id_char, this.id_class);
            cr_1.id_throws(0.99f);
            cr_1.id_class(this.id_synchronized, this.id_return, this.id_public);
            cr_1.id_super = cr_1.id_this / 2;
            if (this.id_void) {
                cr_1.id_void = true;
                cr_1.id_abstract = this.id_abstract;
                cr_1.id_long = this.id_long;
                cr_1.id_float = this.id_float;
            }
            cr_1.id_interface = this.id_interface;
            this.id_char.id_class(cr_1);
        }
    }
}

