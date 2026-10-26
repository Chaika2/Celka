/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package celestial;

import celestial.rNL;
import celestial.rNl_1;
import celestial.rQF;
import celestial.rQs_1;
import celestial.rQz_1;
import celestial.rWK;
import celestial.rWR;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rzE_2;
import celestial.rzV_2;
import celestial.rzc_3;
import celestial.rzr_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;

public class rzN_2 {
    public final rzE_2[] id_class;
    public final rQz_1[] id_break;
    private final Predicate<rzr_3> id_byte;
    public final rNL[] id_protected;
    private final BiFunction<rdn_3, rzr_3, rdn_3> id_throws;
    public final rWK id_case;
    public final rzV_2 id_catch;

    public rzN_2(rzE_2[] rzE_2Array, rQz_1[] rQz_1Array, rNL[] rNLArray, rWK rWK2, rzV_2 rzV_22) {
        this.id_class = rzE_2Array;
        this.id_break = rQz_1Array;
        this.id_byte = rQF.id_class(rQz_1Array);
        this.id_protected = rNLArray;
        this.id_throws = rNl_1.id_class(rNLArray);
        this.id_case = rWK2;
        this.id_catch = rzV_22;
    }

    public void id_class(rQs_1 rQs_12) {
        int n;
        for (n = 0; n < this.id_break.length; ++n) {
            this.id_break[n].id_class(rQs_12.id_break(".condition[" + n + "]"));
        }
        for (n = 0; n < this.id_protected.length; ++n) {
            this.id_protected[n].id_class(rQs_12.id_break(".functions[" + n + "]"));
        }
        for (n = 0; n < this.id_class.length; ++n) {
            this.id_class[n].id_class(rQs_12.id_break(".entries[" + n + "]"));
        }
    }

    public static rzc_3 id_class() {
        return new rzc_3();
    }

    public void id_class(Consumer<rdn_3> consumer, rzr_3 rzr_32) {
        if (this.id_byte.test(rzr_32)) {
            Consumer<rdn_3> consumer2 = rNL.id_class(this.id_throws, consumer, rzr_32);
            Random random = rzr_32.id_class();
            int n = this.id_case.id_class(random) + rfU_2.id_protected(this.id_catch.id_break(random) * rzr_32.id_break());
            for (int i = 0; i < n; ++i) {
                this.id_break(consumer2, rzr_32);
            }
        }
    }

    private void id_break(Consumer<rdn_3> consumer, rzr_3 rzr_32) {
        Random random = rzr_32.id_class();
        ArrayList arrayList = Lists.newArrayList();
        MutableInt mutableInt = new MutableInt();
        for (rzE_2 object : this.id_class) {
            object.expand(rzr_32, rWR2 -> {
                int n = rWR2.id_class(rzr_32.id_break());
                if (n > 0) {
                    arrayList.add(rWR2);
                    mutableInt.add(n);
                }
            });
        }
        int n = arrayList.size();
        if (mutableInt.intValue() != 0 && n != 0) {
            if (n == 1) {
                ((rWR)arrayList.get(0)).id_class(consumer, rzr_32);
            } else {
                int n2 = random.nextInt(mutableInt.intValue());
                for (rWR rWR3 : arrayList) {
                    if ((n2 -= rWR3.id_class(rzr_32.id_break())) >= 0) continue;
                    rWR3.id_class(consumer, rzr_32);
                    return;
                }
            }
        }
    }
}

