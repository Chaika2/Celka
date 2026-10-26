/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aa_3;
import celestial.rBe_1;
import celestial.rEx_1;
import celestial.rdy_3;
import celestial.rpm_3;

public class rEN
extends rBe_1 {
    private final rEx_1 id_class;

    @Override
    public void id_byte() {
        super.id_byte();
        this.id_class.id_case(true);
        this.id_class.id_break(rpm_3.MAIN_HAND);
    }

    public rEN(aa_3 aa_32, double d, int n, float f) {
        super(aa_32, d, n, f);
        this.id_class = (rEx_1)aa_32;
    }

    @Override
    public boolean id_class() {
        return super.id_class() && this.id_class.ss().id_break() == rdy_3.kY;
    }

    @Override
    public void id_protected() {
        super.id_protected();
        this.id_class.id_throw();
        this.id_class.id_case(false);
    }
}

