/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eX_2;
import celestial.is_3;
import celestial.rBu_1;
import celestial.rRO;
import celestial.rRu_1;
import celestial.rYB;
import celestial.xd_3;
import java.util.function.Predicate;

public class rPi_1
extends rBu_1 {
    private final Predicate<rRO> id_catch;
    protected int id_class;
    protected int id_break = -1;
    protected int id_byte = -1;

    @Override
    public void id_byte() {
        super.id_byte();
        this.id_class = 0;
    }

    public rPi_1(is_3 is_32, Predicate<rRO> predicate) {
        super(is_32);
        this.id_catch = predicate;
    }

    public rPi_1(is_3 is_32, int n, Predicate<rRO> predicate) {
        this(is_32, predicate);
        this.id_byte = n;
    }

    private boolean id_class(rRO rRO2) {
        return this.id_catch.test(rRO2);
    }

    @Override
    public boolean id_class() {
        if (!super.id_class()) {
            return false;
        }
        if (!((rYB)this.id_protected.id_throws[7]).B().id_break(rRu_1.id_break)) {
            return false;
        }
        return this.id_class(((rYB)this.id_protected.id_throws[7]).id_abstract()) && !this.id_catch();
    }

    @Override
    public boolean id_break() {
        return this.id_class <= this.id_case() && !this.id_catch() && this.id_throws.id_class((eX_2)this.id_protected.Ps(), 2.0) && this.id_class(((rYB)this.id_protected.id_throws[7]).id_abstract());
    }

    @Override
    public void id_throws() {
        super.id_throws();
        if (this.id_protected.Sa().nextInt(20) == 0) {
            ((rYB)this.id_protected.id_throws[7]).id_byte(1019, this.id_throws, 0);
            if (!((Boolean)this.id_protected.id_private[5]).booleanValue()) {
                this.id_protected.id_class(this.id_protected.P());
            }
        }
        ++this.id_class;
        int n = (int)((float)this.id_class / (float)this.id_case() * 10.0f);
        if (n != this.id_break) {
            ((rYB)this.id_protected.id_throws[7]).id_class(this.id_protected.V(), this.id_throws, n);
            this.id_break = n;
        }
        if (this.id_class == this.id_case() && this.id_class(((rYB)this.id_protected.id_throws[7]).id_abstract())) {
            ((rYB)this.id_protected.id_throws[7]).id_class(this.id_throws, false);
            ((rYB)this.id_protected.id_throws[7]).id_byte(1021, this.id_throws, 0);
            ((rYB)this.id_protected.id_throws[7]).id_byte(2001, this.id_throws, xd_3.id_finally(((rYB)this.id_protected.id_throws[7]).id_byte(this.id_throws)));
        }
    }

    protected int id_case() {
        return Math.max(240, this.id_byte);
    }

    @Override
    public void id_protected() {
        super.id_protected();
        ((rYB)this.id_protected.id_throws[7]).id_class(this.id_protected.V(), this.id_throws, -1);
    }
}

