/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rMl_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rsE_2;
import java.util.EnumSet;
import java.util.List;

public class rMV
extends rBk_1 {
    private int id_break;
    public final /* synthetic */ rMl_1 id_class;

    @Override
    public void id_byte() {
        List<rsE_2> list = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rMl_1.id_import);
        if (!list.isEmpty() && this.id_class.id_class(rXQ.MAINHAND).id_class()) {
            this.id_class.id_public().id_class((an_3)list.get(0), (double)1.2f);
        } else if (!this.id_class.id_class(rXQ.MAINHAND).id_class()) {
            this.id_class.sg();
        }
        this.id_break = 0;
    }

    public rMV(rMl_1 rMl_12) {
        this.id_class = rMl_12;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        if (this.id_break <= (Integer)this.id_class.id_throws[41] && !this.id_class.n_() && !this.id_class.rT() && this.id_class.sy() && this.id_class.L() <= 0) {
            List<rsE_2> list = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(6.0, 6.0, 6.0), rMl_1.id_import);
            return !list.isEmpty() || !this.id_class.id_class(rXQ.MAINHAND).id_class();
        }
        return false;
    }

    @Override
    public boolean id_break() {
        if (!this.id_class.rT() && (this.id_class.sL() || rMl_1.id_implements(this.id_class).nextInt(600) != 1)) {
            return rMl_1.id_finally(this.id_class).nextInt(2000) != 1;
        }
        return false;
    }

    @Override
    public void id_throws() {
        if (!this.id_class.sJ() && !this.id_class.id_class(rXQ.MAINHAND).id_class()) {
            this.id_class.sg();
        }
    }

    @Override
    public void id_protected() {
        rdn_3 rdn_32 = this.id_class.id_class(rXQ.MAINHAND);
        if (!rdn_32.id_class()) {
            this.id_class.a_(rdn_32);
            this.id_class.id_class(rXQ.MAINHAND, rdn_3.id_break);
            int n = this.id_class.sL() ? rMl_1.id_extends(this.id_class).nextInt(50) + 10 : rMl_1.id_native(this.id_class).nextInt(150) + 10;
            this.id_break = (Integer)this.id_class.id_throws[41] + n * 20;
        }
        this.id_class.id_this(false);
    }
}

