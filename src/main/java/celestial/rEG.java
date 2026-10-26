/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.eX_2;
import celestial.is_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rEB;
import celestial.rGr_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rrEr_1;
import celestial.rsE_2;
import java.util.EnumSet;
import java.util.List;

public class rEG<T extends rEB>
extends rBk_1 {
    private final T id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rEG(rEB rEB2, rEB rEB3) {
        this.id_class = rEB3;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        rrEr_1 rrEr_12 = ((rEB)this.id_class).sx();
        if (((rEB)this.id_class).sd() && !((rEB)this.id_class).sx().id_class() && ((rGr_1)this.id_class).su() && !rdn_3.id_break(((is_3)this.id_class).id_class(rXQ.HEAD), rrEr_1.id_new())) {
            List<rsE_2> list;
            rEB rEB2 = rrEr_12.id_class(((rEB)this.id_class).sk());
            if (!(rEB2 != null && rEB2.BM() || (list = ((rYB)((rEB)this.id_class).id_throws[7]).id_class(rsE_2.class, ((an_3)this.id_class).rN().id_byte(16.0, 8.0, 16.0), rEB.id_protected)).isEmpty())) {
                return ((is_3)this.id_class).id_public().id_class((an_3)list.get(0), (double)1.15f);
            }
            return false;
        }
        return false;
    }

    @Override
    public void id_throws() {
        List<rsE_2> list;
        if (((is_3)this.id_class).id_public().id_catch().id_class((eX_2)((an_3)this.id_class).Ps(), 1.414) && !(list = ((rYB)((rEB)this.id_class).id_throws[7]).id_class(rsE_2.class, ((an_3)this.id_class).rN().id_byte(4.0, 4.0, 4.0), rEB.id_protected)).isEmpty()) {
            ((rEB)this.id_class).id_break(list.get(0));
        }
    }
}

