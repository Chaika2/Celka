/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNL;
import celestial.rNW;
import celestial.rWK;
import celestial.rzh_3;

public class rNz_1
extends rzh_3<rNz_1> {
    private final rWK id_class;
    private boolean id_break;

    public rNz_1(rWK rWK2) {
        this.id_class = rWK2;
    }

    @Override
    protected /* synthetic */ rzh_3 id_break() {
        return this.id_throws();
    }

    protected rNz_1 id_throws() {
        return this;
    }

    public rNz_1 id_catch() {
        this.id_break = true;
        return this;
    }

    @Override
    public rNL id_case() {
        return new rNW(this.id_byte(), this.id_class, this.id_break);
    }
}

