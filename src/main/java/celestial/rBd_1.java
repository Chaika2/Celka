/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBk_1;
import celestial.rOt_1;
import celestial.rYB;
import java.util.List;
import java.util.function.Predicate;

public class rBd_1
extends rBk_1 {
    private final rOt_1 id_class;
    private int id_break;
    private int id_byte;

    @Override
    public void id_byte() {
        this.id_break = 0;
    }

    public rBd_1(rOt_1 rOt_12) {
        this.id_class = rOt_12;
        this.id_byte = this.id_class(rOt_12);
    }

    protected int id_class(rOt_1 rOt_12) {
        return 200 + rOt_12.Sa().nextInt(200) % 20;
    }

    @Override
    public boolean id_class() {
        if (this.id_class.sz()) {
            return false;
        }
        if (this.id_class.sd()) {
            return true;
        }
        if (this.id_byte > 0) {
            --this.id_byte;
            return false;
        }
        this.id_byte = this.id_class(this.id_class);
        Predicate<rOt_1> predicate = rOt_12 -> rOt_12.sW() || !rOt_12.sd();
        List<rOt_1> list = ((rYB)this.id_class.id_throws[7]).id_class(this.id_class.getClass(), this.id_class.rN().id_byte(8.0, 8.0, 8.0), predicate);
        rOt_1 rOt_13 = list.stream().filter(rOt_1::sW).findAny().orElse(this.id_class);
        rOt_13.id_class(list.stream().filter(rOt_12 -> !rOt_12.sd()));
        return this.id_class.sd();
    }

    @Override
    public boolean id_break() {
        return this.id_class.sd() && this.id_class.sQ();
    }

    @Override
    public void id_throws() {
        if (--this.id_break <= 0) {
            this.id_break = 10;
            this.id_class.sN();
        }
    }

    @Override
    public void id_protected() {
        this.id_class.sk();
    }
}

