/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBl_1;
import celestial.rbB_2;

public class rSW
extends rBl_1 {
    private final rbB_2 id_break;
    private int id_byte;

    @Override
    public void id_byte() {
        super.id_byte();
        this.id_byte = 0;
    }

    public rSW(rbB_2 rbB_22, double d, boolean bl) {
        super(rbB_22, d, bl);
        this.id_break = rbB_22;
    }

    @Override
    public void id_throws() {
        super.id_throws();
        ++this.id_byte;
        if (this.id_byte >= 5 && this.id_finally() < this.id_extends() / 2) {
            this.id_break.id_case(true);
        } else {
            this.id_break.id_case(false);
        }
    }

    @Override
    public void id_protected() {
        super.id_protected();
        this.id_break.id_case(false);
    }
}

