/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rba_3;
import celestial.rdn_3;
import celestial.rsE_2;
import java.util.EnumSet;
import java.util.List;

public class rMS
extends rBk_1 {
    public final /* synthetic */ rba_3 id_class;

    @Override
    public void id_byte() {
        List<rsE_2> list = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rba_3.id_return);
        if (!list.isEmpty()) {
            this.id_class.id_public().id_class((an_3)list.get(0), (double)1.2f);
        }
    }

    public rMS(rba_3 rba_32) {
        this.id_class = rba_32;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        if (!this.id_class.id_class(rXQ.MAINHAND).id_class()) {
            return false;
        }
        if (this.id_class.I_() == null && this.id_class.Sr() == null) {
            if (!this.id_class.sA()) {
                return false;
            }
            if (this.id_class.Sa().nextInt(10) != 0) {
                return false;
            }
            List<rsE_2> list = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rba_3.id_return);
            return !list.isEmpty() && this.id_class.id_class(rXQ.MAINHAND).id_class();
        }
        return false;
    }

    @Override
    public void id_throws() {
        List<rsE_2> list = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rba_3.id_return);
        rdn_3 rdn_32 = this.id_class.id_class(rXQ.MAINHAND);
        if (rdn_32.id_class() && !list.isEmpty()) {
            this.id_class.id_public().id_class((an_3)list.get(0), (double)1.2f);
        }
    }
}

