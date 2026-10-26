/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNL;
import celestial.rNN;
import celestial.rrGh_1;
import celestial.rrrZ;
import celestial.rzh_3;

public class rNc_1
extends rzh_3<rNc_1> {
    private rrrZ<?> id_class = rNN.id_break;
    private rrGh_1 id_break = rNN.id_byte;
    private byte id_byte = (byte)2;
    private int id_protected = 50;
    private boolean id_throws = true;

    public rNc_1 id_class(rrGh_1 rrGh_12) {
        this.id_break = rrGh_12;
        return this;
    }

    public rNc_1 id_class(byte by) {
        this.id_byte = by;
        return this;
    }

    public rNc_1 id_class(boolean bl) {
        this.id_throws = bl;
        return this;
    }

    public rNc_1 id_class(rrrZ<?> rrrZ2) {
        this.id_class = rrrZ2;
        return this;
    }

    @Override
    protected /* synthetic */ rzh_3 id_break() {
        return this.id_throws();
    }

    protected rNc_1 id_throws() {
        return this;
    }

    @Override
    public rNL id_case() {
        return new rNN(this.id_byte(), this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws);
    }
}

