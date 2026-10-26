/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBW;
import celestial.rMr_1;
import celestial.rYB;
import celestial.rba_3;
import java.util.EnumSet;

public class rMW
extends rMr_1 {
    private int id_byte;
    public final /* synthetic */ rba_3 id_break;

    @Override
    public void id_byte() {
        this.id_break.id_this(false);
        this.id_break.id_synchronized(false);
        this.id_break.id_return(false);
        this.id_break.id_super(false);
        this.id_break.id_while(true);
        this.id_break.id_public().id_final();
        this.id_break.id_super().id_class(this.id_break.rx(), this.id_break.re(), this.id_break.BO(), 0.0);
    }

    public rMW(rba_3 rba_32) {
        this.id_break = rba_32;
        super(rba_32);
        this.id_byte = rba_3.id_throws(this.id_break).nextInt(140);
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK, rBW.JUMP));
    }

    @Override
    public boolean id_class() {
        if (((Float)this.id_break.id_private[42]).floatValue() == 0.0f && ((Float)this.id_break.id_private[43]).floatValue() == 0.0f && ((Float)this.id_break.id_private[44]).floatValue() == 0.0f) {
            return this.id_finally() || this.id_break.Sc();
        }
        return false;
    }

    @Override
    public boolean id_break() {
        return this.id_finally();
    }

    private boolean id_finally() {
        if (this.id_byte > 0) {
            --this.id_byte;
            return false;
        }
        return ((rYB)this.id_break.id_throws[7]).id_strictfp() && this.id_catch() && !this.id_private();
    }

    @Override
    public void id_protected() {
        this.id_byte = rba_3.id_case(this.id_break).nextInt(140);
        this.id_break.sL();
    }
}

