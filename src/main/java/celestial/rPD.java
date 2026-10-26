/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.an_3;
import celestial.ay_3;
import celestial.iB_2;
import celestial.iX_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rLC;
import celestial.rLy_1;
import celestial.rYB;
import celestial.rjU_2;
import celestial.rpJ_2;
import java.util.EnumSet;
import java.util.function.Predicate;

public class rPD<T extends iB_2>
extends rBk_1 {
    protected final aA_2 id_class;
    private final double id_implements;
    private final double id_finally;
    protected T id_break;
    protected final float id_byte;
    protected rLC id_protected;
    protected final rLy_1 id_throws;
    protected final Class<T> id_case;
    protected final Predicate<iB_2> id_catch;
    protected final Predicate<iB_2> id_private;
    private final ay_3 id_extends;

    @Override
    public void id_byte() {
        this.id_throws.id_class(this.id_protected, this.id_implements);
    }

    public rPD(aA_2 aA_22, Class<T> clazz, float f, double d, double d2) {
        this(aA_22, clazz, iB_22 -> true, f, d, d2, rpJ_2.id_throws::test);
    }

    public rPD(aA_2 aA_22, Class<T> clazz, float f, double d, double d2, Predicate<iB_2> predicate) {
        this(aA_22, clazz, iB_22 -> true, f, d, d2, predicate);
    }

    public rPD(aA_2 aA_22, Class<T> clazz, Predicate<iB_2> predicate, float f, double d, double d2, Predicate<iB_2> predicate2) {
        this.id_class = aA_22;
        this.id_case = clazz;
        this.id_catch = predicate;
        this.id_byte = f;
        this.id_implements = d;
        this.id_finally = d2;
        this.id_private = predicate2;
        this.id_throws = aA_22.id_public();
        this.id_class(EnumSet.of(rBW.MOVE));
        this.id_extends = new ay_3().id_class(f).id_class(predicate2.and(predicate));
    }

    @Override
    public boolean id_class() {
        this.id_break = ((rYB)this.id_class.id_throws[7]).id_break(this.id_case, this.id_extends, this.id_class, this.id_class.rx(), this.id_class.re(), this.id_class.BO(), this.id_class.rN().id_byte(this.id_byte, 3.0, this.id_byte));
        if (this.id_break == null) {
            return false;
        }
        rjU_2 rjU_22 = iX_2.id_byte(this.id_class, 16, 7, ((an_3)this.id_break).Ps());
        if (rjU_22 == null) {
            return false;
        }
        if (((an_3)this.id_break).id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected) < ((an_3)this.id_break).id_int(this.id_class)) {
            return false;
        }
        this.id_protected = this.id_throws.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, 0);
        return this.id_protected != null;
    }

    @Override
    public boolean id_break() {
        return !this.id_throws.id_native();
    }

    @Override
    public void id_throws() {
        if (this.id_class.id_int((an_3)this.id_break) < 49.0) {
            this.id_class.id_public().id_class(this.id_finally);
        } else {
            this.id_class.id_public().id_class(this.id_implements);
        }
    }

    @Override
    public void id_protected() {
        this.id_break = null;
    }
}

