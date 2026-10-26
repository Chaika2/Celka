/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rBW;
import celestial.rBk_1;
import java.util.EnumSet;

public class rBC
extends rBk_1 {
    private final is_3 id_class;
    private double id_break;
    private double id_byte;
    private int id_protected;

    @Override
    public void id_byte() {
        double d = Math.PI * 2 * this.id_class.Sa().nextDouble();
        this.id_break = Math.cos(d);
        this.id_byte = Math.sin(d);
        this.id_protected = 20 + this.id_class.Sa().nextInt(20);
    }

    public rBC(is_3 is_32) {
        this.id_class = is_32;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        return this.id_class.Sa().nextFloat() < 0.02f;
    }

    @Override
    public boolean id_break() {
        return this.id_protected >= 0;
    }

    @Override
    public void id_throws() {
        --this.id_protected;
        this.id_class.id_continue().id_class(this.id_class.rx() + this.id_break, this.id_class.rH(), this.id_class.BO() + this.id_byte);
    }
}

