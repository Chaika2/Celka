/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.ay_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rYB;
import celestial.rbZ_2;
import celestial.rrEm_1;
import java.util.EnumSet;
import java.util.List;

public class rBP
extends rBk_1 {
    private static final ay_3 id_protected = new ay_3().id_class(8.0).id_class().id_break().id_byte();
    protected final rbZ_2 id_class;
    private final Class<? extends rbZ_2> id_throws;
    protected final rYB id_break;
    protected rbZ_2 id_byte;
    private int id_case;
    private final double id_catch;

    public rBP(rbZ_2 rbZ_22, double d) {
        this(rbZ_22, d, rbZ_22.getClass());
    }

    public rBP(rbZ_2 rbZ_22, double d, Class<? extends rbZ_2> clazz) {
        this.id_class = rbZ_22;
        this.id_break = (rYB)rbZ_22.id_throws[7];
        this.id_throws = clazz;
        this.id_catch = d;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        if (!this.id_class.sQ()) {
            return false;
        }
        this.id_byte = this.id_private();
        return this.id_byte != null;
    }

    @Override
    public boolean id_break() {
        return this.id_byte.BM() && this.id_byte.sQ() && this.id_case < 60;
    }

    @Override
    public void id_throws() {
        this.id_class.id_continue().id_class(this.id_byte, 10.0f, (float)this.id_class.r());
        this.id_class.id_public().id_class((an_3)this.id_byte, this.id_catch);
        ++this.id_case;
        if (this.id_case >= 60 && this.id_class.id_int(this.id_byte) < 9.0) {
            this.id_catch();
        }
    }

    protected void id_catch() {
        this.id_class.id_class((rrEm_1)this.id_break, this.id_byte);
    }

    @Override
    public void id_protected() {
        this.id_byte = null;
        this.id_case = 0;
    }

    private rbZ_2 id_private() {
        List<? extends rbZ_2> list = this.id_break.id_class(this.id_throws, id_protected, this.id_class, this.id_class.rN().id_class(8.0));
        double d = Double.MAX_VALUE;
        rbZ_2 rbZ_22 = null;
        for (rbZ_2 rbZ_23 : list) {
            if (!this.id_class.id_class(rbZ_23) || !(this.id_class.id_int(rbZ_23) < d)) continue;
            rbZ_22 = rbZ_23;
            d = this.id_class.id_int(rbZ_23);
        }
        return rbZ_22;
    }
}

