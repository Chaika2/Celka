/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.ay_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rYB;
import celestial.rhd_3;
import celestial.rpJ_2;
import java.util.EnumSet;

public class rBA
extends rBk_1 {
    protected final is_3 id_class;
    protected an_3 id_break;
    protected final float id_byte;
    private int id_catch;
    protected final float id_protected;
    protected final Class<? extends iB_2> id_throws;
    protected final ay_3 id_case;

    @Override
    public void id_byte() {
        this.id_catch = 40 + this.id_class.Sa().nextInt(40);
    }

    public rBA(is_3 is_32, Class<? extends iB_2> clazz, float f) {
        this(is_32, clazz, f, 0.02f);
    }

    public rBA(is_3 is_32, Class<? extends iB_2> clazz, float f, float f2) {
        this.id_class = is_32;
        this.id_throws = clazz;
        this.id_byte = f;
        this.id_protected = f2;
        this.id_class(EnumSet.of(rBW.LOOK));
        this.id_case = clazz == rhd_3.class ? new ay_3().id_class(f).id_break().id_class().id_protected().id_class((iB_2 iB_22) -> rpJ_2.id_break(is_32).test((an_3)iB_22)) : new ay_3().id_class(f).id_break().id_class().id_protected();
    }

    @Override
    public boolean id_class() {
        if (this.id_class.Sa().nextFloat() >= this.id_protected) {
            return false;
        }
        if (this.id_class.I_() != null) {
            this.id_break = this.id_class.I_();
        }
        this.id_break = this.id_throws == rhd_3.class ? ((rYB)this.id_class.id_throws[7]).id_class(this.id_case, this.id_class, this.id_class.rx(), this.id_class.rH(), this.id_class.BO()) : ((rYB)this.id_class.id_throws[7]).id_break(this.id_throws, this.id_case, this.id_class, this.id_class.rx(), this.id_class.rH(), this.id_class.BO(), this.id_class.rN().id_byte(this.id_byte, 3.0, this.id_byte));
        return this.id_break != null;
    }

    @Override
    public boolean id_break() {
        if (!this.id_break.BM()) {
            return false;
        }
        if (this.id_class.id_int(this.id_break) > (double)(this.id_byte * this.id_byte)) {
            return false;
        }
        return this.id_catch > 0;
    }

    @Override
    public void id_throws() {
        this.id_class.id_continue().id_class(this.id_break.rx(), this.id_break.rH(), this.id_break.BO());
        --this.id_catch;
    }

    @Override
    public void id_protected() {
        this.id_break = null;
    }
}

