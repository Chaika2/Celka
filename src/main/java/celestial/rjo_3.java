/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  org.apache.commons.lang3.tuple.Triple
 */
package celestial;

import celestial.rjV_2;
import celestial.rjY_2;
import celestial.rje_3;
import celestial.rjj_3;
import celestial.rqR_2;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import org.apache.commons.lang3.tuple.Triple;

public final class rjo_3 {
    private final rjV_2 id_class;
    private boolean id_break;
    private rje_3 id_byte;
    private rjY_2 id_protected;
    private rje_3 id_throws;
    private rjY_2 id_case;
    private static final rjo_3 id_catch = rqR_2.id_class(() -> {
        rjV_2 rjV_22 = new rjV_2();
        rjV_22.id_class();
        rjo_3 rjo_32 = new rjo_3(rjV_22);
        rjo_32.id_protected();
        return rjo_32;
    });

    public rjV_2 id_byte() {
        return this.id_class.id_case();
    }

    public rjo_3(rjV_2 rjV_22) {
        this.id_class = rjV_22 == null ? rjo_3.id_catch.id_class : rjV_22;
    }

    public rjo_3(rje_3 rje_32, rjY_2 rjY_22, rje_3 rje_33, rjY_2 rjY_23) {
        this.id_class = rjo_3.id_class(rje_32, rjY_22, rje_33, rjY_23);
        this.id_byte = rje_32 != null ? rje_32 : new rje_3();
        this.id_protected = rjY_22 != null ? rjY_22 : rjY_2.id_class.id_catch();
        this.id_throws = rje_33 != null ? rje_33 : new rje_3(1.0f, 1.0f, 1.0f);
        this.id_case = rjY_23 != null ? rjY_23 : rjY_2.id_class.id_catch();
        this.id_break = true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rjo_3 rjo_32 = (rjo_3)object;
            return Objects.equals(this.id_class, rjo_32.id_class);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.id_class);
    }

    public static rjo_3 id_class() {
        return id_catch;
    }

    public static Pair<rjj_3, rje_3> id_class(rjV_2 rjV_22) {
        rjV_22.id_class(1.0f / rjV_22.id_int);
        rje_3 rje_32 = new rje_3(rjV_22.id_protected, rjV_22.id_private, rjV_22.id_native);
        rjj_3 rjj_32 = new rjj_3(rjV_22);
        return Pair.of((Object)rjj_32, (Object)rje_32);
    }

    public rjo_3 id_class(rjo_3 rjo_32) {
        rjV_2 rjV_22 = this.id_byte();
        rjV_22.id_class(rjo_32.id_byte());
        return new rjo_3(rjV_22);
    }

    private static rjV_2 id_class(rje_3 rje_32, rjY_2 rjY_22, rje_3 rje_33, rjY_2 rjY_23) {
        rjV_2 rjV_22 = new rjV_2();
        rjV_22.id_class();
        if (rjY_22 != null) {
            rjV_22.id_class(new rjV_2(rjY_22));
        }
        if (rje_33 != null) {
            rjV_22.id_class(rjV_2.id_throws(rje_33.id_class(), rje_33.id_break(), rje_33.id_byte()));
        }
        if (rjY_23 != null) {
            rjV_22.id_class(new rjV_2(rjY_23));
        }
        if (rje_32 != null) {
            rjV_22.id_protected = rje_32.id_class();
            rjV_22.id_private = rje_32.id_break();
            rjV_22.id_native = rje_32.id_byte();
        }
        return rjV_22;
    }

    public rjo_3 id_break() {
        if (this == id_catch) {
            return this;
        }
        rjV_2 rjV_22 = this.id_byte();
        return rjV_22.id_throws() ? new rjo_3(rjV_22) : null;
    }

    private void id_throws() {
        if (!this.id_break) {
            Pair<rjj_3, rje_3> pair = rjo_3.id_class(this.id_class);
            Triple<rjY_2, rje_3, rjY_2> triple = ((rjj_3)pair.getFirst()).id_break();
            this.id_byte = (rje_3)pair.getSecond();
            this.id_protected = (rjY_2)triple.getLeft();
            this.id_throws = (rje_3)triple.getMiddle();
            this.id_case = (rjY_2)triple.getRight();
            this.id_break = true;
        }
    }

    public rjY_2 id_protected() {
        this.id_throws();
        return this.id_protected.id_catch();
    }
}

