/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.mk_3;
import celestial.rHm_1;
import celestial.rZl_1;
import celestial.rsz_3;

public class Zm_1
extends mk_3 {
    private final rHm_1 id_finally;

    public Zm_1(rHm_1 rHm_12) {
        this.id_finally = rHm_12;
    }

    @Override
    protected void id_class(rHm_1 rHm_12) {
        if (rHm_12 instanceof rsz_3) {
            rsz_3 rsz_32 = (rsz_3)rHm_12;
            this.id_volatile.id_void().id_class(new rZl_1(rsz_32.id_protected().V(), this.id_class.id_private(), rHm_12.id_finally()));
        }
    }

    @Override
    public int id_finally() {
        return 150;
    }

    @Override
    public rHm_1 id_implements() {
        return this.id_finally;
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_implements = this.id_implements().id_finally();
        this.id_extends();
        this.id_class.id_class(this.id_implements().id_private());
    }
}

