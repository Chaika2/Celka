/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ay_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rMZ;
import celestial.rYB;
import celestial.rsq_3;
import java.util.EnumSet;

public class rSE
extends rBk_1 {
    private static final ay_3 id_class = new ay_3().id_class(6.0).id_break().id_class();
    private final rMZ id_break;
    private rsq_3 id_byte;
    private int id_protected;

    @Override
    public void id_byte() {
        this.id_protected = 400;
        this.id_break.id_this(true);
    }

    public rSE(rMZ rMZ2) {
        this.id_break = rMZ2;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        if (!((rYB)this.id_break.id_throws[7]).id_strictfp()) {
            return false;
        }
        if (this.id_break.Sa().nextInt(8000) != 0) {
            return false;
        }
        this.id_byte = ((rYB)this.id_break.id_throws[7]).id_class(rsq_3.class, id_class, this.id_break, this.id_break.rx(), this.id_break.re(), this.id_break.BO(), this.id_break.rN().id_byte(6.0, 2.0, 6.0));
        return this.id_byte != null;
    }

    @Override
    public boolean id_break() {
        return this.id_protected > 0;
    }

    @Override
    public void id_throws() {
        this.id_break.id_continue().id_class(this.id_byte, 30.0f, 30.0f);
        --this.id_protected;
    }

    @Override
    public void id_protected() {
        this.id_break.id_this(false);
        this.id_byte = null;
    }
}

