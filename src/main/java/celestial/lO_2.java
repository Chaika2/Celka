/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ch_1;
import celestial.fj_3;
import celestial.gm_3;
import celestial.lN_2;

public abstract class lO_2
extends lN_2 {
    protected fj_3 id_instanceof;

    @Override
    protected float id_byte() {
        return this.id_instanceof.id_catch();
    }

    protected lO_2(gm_3 gm_32, double d, double d2, double d3) {
        super(gm_32, d, d2, d3);
    }

    protected lO_2(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        super(gm_32, d, d2, d3, d4, d5, d6);
    }

    protected void id_class(fj_3 fj_32) {
        this.id_instanceof = fj_32;
    }

    public void id_class(Ch_1 ch_1) {
        this.id_class(ch_1.id_class(this.id_continue));
    }

    public void id_break(Ch_1 ch_1) {
        this.id_class(ch_1.id_class(this.id_super, this.id_this));
    }

    @Override
    protected float id_break() {
        return this.id_instanceof.id_case();
    }

    @Override
    protected float id_throws() {
        return this.id_instanceof.id_implements();
    }

    @Override
    protected float id_protected() {
        return this.id_instanceof.id_private();
    }
}

