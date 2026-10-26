/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJP;
import celestial.rJY;
import celestial.rWW;
import celestial.rXy_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rkj_3;
import celestial.rpq_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.List;

public class rJo_1
extends rXy_1 {
    private final rYB id_catch;
    private rWW id_private;
    private final List<rWW> id_implements;

    public rJo_1(int n, rhz_3 rhz_32) {
        this(n, rhz_32, rpq_3.id_class);
    }

    public rJo_1(int n, rhz_3 rhz_32, rpq_3 rpq_32) {
        super(rJP.id_else, n, rhz_32, rpq_32);
        this.id_catch = (rYB)rhz_32.id_throws.id_throws[7];
        this.id_implements = this.id_catch.id_implements().id_class(rkj_3.id_catch);
    }

    @Override
    protected boolean id_class(rdn_3 rdn_32) {
        return this.id_implements.stream().anyMatch(rWW2 -> rWW2.id_class(rdn_32));
    }

    @Override
    public void id_class() {
        List<rWW> list = this.id_catch.id_implements().id_break(rkj_3.id_catch, this.id_break, this.id_catch);
        if (list.isEmpty()) {
            this.id_class.id_break(0, rdn_3.id_break);
        } else {
            this.id_private = list.get(0);
            rdn_3 rdn_32 = this.id_private.id_class(this.id_break);
            this.id_class.id_class(this.id_private);
            this.id_class.id_break(0, rdn_32);
        }
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rJY rJY2) {
        return rJY2.id_byte != this.id_class && super.id_class(rdn_32, rJY2);
    }

    @Override
    protected boolean id_class(xc_3 xc_32) {
        return xc_32.id_class(xu_3.XE);
    }

    @Override
    protected boolean id_class(rhd_3 rhd_32, boolean bl) {
        return this.id_private != null && this.id_private.id_class(this.id_break, this.id_catch);
    }

    @Override
    protected rdn_3 id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        rdn_32.id_class((rYB)rhd_32.id_throws[7], rhd_32, rdn_32.id_char());
        this.id_class.id_class(rhd_32);
        this.id_protected(0);
        this.id_protected(1);
        this.id_byte.id_class((rYB rYB2, rfH_2 rfH_22) -> rYB2.id_byte(1044, (rfH_2)rfH_22, 0));
        return rdn_32;
    }

    private void id_protected(int n) {
        rdn_3 rdn_32 = this.id_break.id_extends(n);
        rdn_32.id_catch(1);
        this.id_break.id_break(n, rdn_32);
    }
}

