/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ay_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.rBW;
import celestial.rSM;
import celestial.rYB;
import celestial.rfl_3;
import celestial.rhN_2;
import celestial.rhd_3;
import java.util.EnumSet;
import java.util.function.Predicate;

public class rBI<T extends iB_2>
extends rSM {
    protected final Class<T> id_class;
    protected final int id_break;
    protected iB_2 id_byte;
    protected ay_3 id_protected;

    @Override
    public void id_byte() {
        this.id_throws.id_byte(this.id_byte);
        super.id_byte();
    }

    public rBI(is_3 is_32, Class<T> clazz, boolean bl) {
        this(is_32, clazz, bl, false);
    }

    public rBI(is_3 is_32, Class<T> clazz, int n, boolean bl, boolean bl2, Predicate<iB_2> predicate) {
        super(is_32, bl, bl2);
        this.id_class = clazz;
        this.id_break = n;
        this.id_class(EnumSet.of(rBW.TARGET));
        this.id_protected = new ay_3().id_class(this.id_extends()).id_class(predicate);
    }

    public rBI(is_3 is_32, Class<T> clazz, boolean bl, boolean bl2) {
        this(is_32, clazz, 10, bl, bl2, null);
    }

    public void id_class(iB_2 iB_22) {
        this.id_byte = iB_22;
    }

    protected rfl_3 id_class(double d) {
        return this.id_throws.rN().id_byte(d, 4.0, d);
    }

    @Override
    public boolean id_class() {
        if (this.id_break > 0 && this.id_throws.Sa().nextInt(this.id_break) != 0) {
            return false;
        }
        this.id_finally();
        return this.id_byte != null;
    }

    protected void id_finally() {
        this.id_byte = this.id_class != rhd_3.class && this.id_class != rhN_2.class ? ((rYB)this.id_throws.id_throws[7]).id_break(this.id_class, this.id_protected, this.id_throws, this.id_throws.rx(), this.id_throws.rH(), this.id_throws.BO(), this.id_class(this.id_extends())) : ((rYB)this.id_throws.id_throws[7]).id_class(this.id_protected, this.id_throws, this.id_throws.rx(), this.id_throws.rH(), this.id_throws.BO());
    }
}

