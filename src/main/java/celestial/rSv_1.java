/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rST;
import celestial.rSu_1;
import celestial.rSw_1;
import celestial.rYB;
import celestial.rqn_3;

public class rSv_1
extends rSw_1 {
    private int id_break;

    @Override
    public void id_byte() {
        this.id_break = 0;
    }

    public rSv_1(rSu_1 rSu_12) {
        super(rSu_12);
    }

    @Override
    public void id_class() {
        ((rYB)this.id_class.id_throws[7]).id_class(this.id_class.rx(), this.id_class.re(), this.id_class.BO(), rqn_3.BF, this.id_class.Pr(), 2.5f, 0.8f + this.id_class.Sa().nextFloat() * 0.3f, false);
    }

    @Override
    public void id_break() {
        if (this.id_break++ >= 40) {
            this.id_class.L().id_class(rST.id_case);
        }
    }

    public rST<rSv_1> id_protected() {
        return rST.id_private;
    }
}

