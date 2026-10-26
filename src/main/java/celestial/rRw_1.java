/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package celestial;

import celestial.an_3;
import celestial.ay_3;
import celestial.iB_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjw_3;
import celestial.rpJ_2;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface rRw_1 {
    default public rhd_3 id_class(ay_3 ay_32, double d, double d2, double d3) {
        return this.id_class(this.id_continue(), ay_32, null, d, d2, d3);
    }

    default public rhd_3 id_class(ay_3 ay_32, iB_2 iB_22, double d, double d2, double d3) {
        return this.id_class(this.id_continue(), ay_32, iB_22, d, d2, d3);
    }

    default public rhd_3 id_class(ay_3 ay_32, iB_2 iB_22) {
        return this.id_class(this.id_continue(), ay_32, iB_22, iB_22.rx(), iB_22.re(), iB_22.BO());
    }

    default public boolean id_class(double d, double d2, double d3, double d4) {
        for (rhd_3 rhd_32 : this.id_continue()) {
            if (!rpJ_2.id_catch.test(rhd_32) || !rpJ_2.id_break.test(rhd_32)) continue;
            double d5 = rhd_32.id_class(d, d2, d3);
            if (!(d4 < 0.0) && !(d5 < d4 * d4)) continue;
            return true;
        }
        return false;
    }

    default public rhd_3 id_class(an_3 an_32, double d) {
        return this.id_class(an_32.rx(), an_32.re(), an_32.BO(), d, false);
    }

    @Nullable
    default public rhd_3 id_class(UUID uUID) {
        for (int i = 0; i < this.id_continue().size(); ++i) {
            rhd_3 rhd_32 = this.id_continue().get(i);
            if (!uUID.equals(rhd_32.ro())) continue;
            return rhd_32;
        }
        return null;
    }

    default public <T extends iB_2> List<T> id_class(Class<? extends T> clazz, ay_3 ay_32, iB_2 iB_22, rfl_3 rfl_32) {
        List<T> list = this.id_class(clazz, rfl_32, (Predicate)null);
        ArrayList arrayList = Lists.newArrayList();
        for (iB_2 iB_23 : list) {
            if (!ay_32.id_class(iB_22, iB_23)) continue;
            arrayList.add(iB_23);
        }
        return arrayList;
    }

    default public List<rhd_3> id_class(ay_3 ay_32, iB_2 iB_22, rfl_3 rfl_32) {
        ArrayList arrayList = Lists.newArrayList();
        for (rhd_3 rhd_32 : this.id_continue()) {
            if (!rfl_32.id_throws(rhd_32.rx(), rhd_32.re(), rhd_32.BO()) || !ay_32.id_class(iB_22, rhd_32)) continue;
            arrayList.add(rhd_32);
        }
        return arrayList;
    }

    default public <T extends iB_2> T id_class(List<? extends T> list, ay_3 ay_32, iB_2 iB_22, double d, double d2, double d3) {
        double d4 = -1.0;
        iB_2 iB_23 = null;
        for (iB_2 iB_24 : list) {
            if (!ay_32.id_class(iB_22, iB_24)) continue;
            double d5 = iB_24.id_class(d, d2, d3);
            if (d4 != -1.0 && !(d5 < d4)) continue;
            d4 = d5;
            iB_23 = iB_24;
        }
        return (T)iB_23;
    }

    default public <T extends iB_2> T id_class(Class<? extends T> clazz, ay_3 ay_32, iB_2 iB_22, double d, double d2, double d3, rfl_3 rfl_32) {
        return this.id_class(this.id_class(clazz, rfl_32, (Predicate)null), ay_32, iB_22, d, d2, d3);
    }

    default public <T extends an_3> List<T> id_class(Class<? extends T> clazz, rfl_3 rfl_32) {
        return this.id_class(clazz, rfl_32, rpJ_2.id_catch);
    }

    default public boolean id_class(an_3 an_32, rjC_2 rjC_22) {
        if (rjC_22.id_break()) {
            return true;
        }
        for (an_3 an_33 : this.id_class(an_32, rjC_22.id_class())) {
            if (((Boolean)an_33.id_throws[27]).booleanValue() || !((Boolean)an_33.id_throws[2]).booleanValue() || an_32 != null && an_33.id_return(an_32) || !rjw_3.id_byte(rjC_22, rjw_3.id_class(an_33.rN()), rjN_2.id_implements)) continue;
            return false;
        }
        return true;
    }

    default public List<an_3> id_class(an_3 an_32, rfl_3 rfl_32) {
        return this.id_break(an_32, rfl_32, rpJ_2.id_catch);
    }

    default public rhd_3 id_class(double d, double d2, double d3, double d4, boolean bl) {
        Predicate<an_3> predicate = bl ? rpJ_2.id_throws : rpJ_2.id_catch;
        return this.id_class(d, d2, d3, d4, predicate);
    }

    public <T extends an_3> List<T> id_class(Class<? extends T> var1, rfl_3 var2, Predicate<? super T> var3);

    default public rhd_3 id_class(double d, double d2, double d3, double d4, Predicate<an_3> predicate) {
        double d5 = -1.0;
        rhd_3 rhd_32 = null;
        for (rhd_3 rhd_33 : this.id_continue()) {
            if (predicate != null && !predicate.test(rhd_33)) continue;
            double d6 = rhd_33.id_class(d, d2, d3);
            if (!(d4 < 0.0) && !(d6 < d4 * d4) || d5 != -1.0 && !(d6 < d5)) continue;
            d5 = d6;
            rhd_32 = rhd_33;
        }
        return rhd_32;
    }

    default public Stream<rjC_2> id_class(an_3 an_32, rfl_3 rfl_32, Predicate<an_3> predicate) {
        if (rfl_32.id_class() < 1.0E-7) {
            return Stream.empty();
        }
        rfl_3 rfl_33 = rfl_32.id_class(1.0E-7);
        return this.id_break(an_32, rfl_33, predicate.and(an_33 -> an_33.rN().id_byte(rfl_33) && (an_32 == null ? an_33.PU() : an_32.id_super((an_3)an_33)))).stream().map(an_3::rN).map(rjw_3::id_class);
    }

    default public rhd_3 id_class(an_3 an_32, double d, Predicate<an_3> predicate) {
        double d2 = -1.0;
        rhd_3 rhd_32 = null;
        for (rhd_3 rhd_33 : this.id_continue()) {
            if (predicate != null && !predicate.test(rhd_33)) continue;
            double d3 = rhd_33.id_int(an_32);
            if (!(d < 0.0) && !(d3 < d * d) || d2 != -1.0 && !(d3 < d2)) continue;
            d2 = d3;
            rhd_32 = rhd_33;
        }
        return rhd_32;
    }

    public List<an_3> id_break(an_3 var1, rfl_3 var2, Predicate<? super an_3> var3);

    @Nullable
    default public rhd_3 id_break(String string) {
        for (int i = 0; i < this.id_continue().size(); ++i) {
            rhd_3 rhd_32 = this.id_continue().get(i);
            if (!string.equals(rhd_32.id_extends())) continue;
            return rhd_32;
        }
        return null;
    }

    default public <T extends an_3> List<T> id_break(Class<? extends T> clazz, rfl_3 rfl_32) {
        return this.id_break(clazz, rfl_32, rpJ_2.id_catch);
    }

    default public <T extends iB_2> T id_break(Class<? extends T> clazz, ay_3 ay_32, iB_2 iB_22, double d, double d2, double d3, rfl_3 rfl_32) {
        return this.id_class(this.id_break(clazz, rfl_32, (Predicate)null), ay_32, iB_22, d, d2, d3);
    }

    default public <T extends an_3> List<T> id_break(Class<? extends T> clazz, rfl_3 rfl_32, Predicate<? super T> predicate) {
        return this.id_class(clazz, rfl_32, predicate);
    }

    public List<? extends rhd_3> id_continue();
}

