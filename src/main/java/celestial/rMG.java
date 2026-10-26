/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rba_3;
import java.util.EnumSet;

public class rMG
extends rBk_1 {
    public final /* synthetic */ rba_3 id_class;

    @Override
    public void id_byte() {
        this.id_class.id_this(false);
        this.id_class.id_public(false);
    }

    public rMG(rba_3 rba_32) {
        this.id_class = rba_32;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        if (this.id_class.Sc()) {
            return false;
        }
        iB_2 iB_22 = this.id_class.I_();
        return iB_22 != null && iB_22.BM() && rba_3.id_goto.test(iB_22) && this.id_class.id_int(iB_22) > 36.0 && !this.id_class.x() && !this.id_class.su() && !rba_3.id_break(this.id_class);
    }

    @Override
    public void id_throws() {
        iB_2 iB_22 = this.id_class.I_();
        this.id_class.id_continue().id_class(iB_22, (float)this.id_class.S(), (float)this.id_class.r());
        if (this.id_class.id_int(iB_22) <= 36.0) {
            this.id_class.id_return(true);
            this.id_class.id_synchronized(true);
            this.id_class.id_public().id_final();
        } else {
            this.id_class.id_public().id_class((an_3)iB_22, 1.5);
        }
    }

    @Override
    public void id_protected() {
        iB_2 iB_22 = this.id_class.I_();
        if (iB_22 != null && rba_3.id_class(this.id_class, iB_22)) {
            this.id_class.id_return(true);
            this.id_class.id_synchronized(true);
            this.id_class.id_public().id_final();
            this.id_class.id_continue().id_class(iB_22, (float)this.id_class.S(), (float)this.id_class.r());
        } else {
            this.id_class.id_return(false);
            this.id_class.id_synchronized(false);
        }
    }
}

