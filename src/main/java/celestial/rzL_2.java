/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rNL;
import celestial.rNl_1;
import celestial.rQs_1;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rzA_2;
import celestial.rzN_2;
import celestial.rzk_3;
import celestial.rzr_3;
import celestial.rzz_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rzL_2 {
    public static final Logger id_byte = LogManager.getLogger();
    public static final rzL_2 id_class = new rzL_2(rzz_3.id_class, new rzN_2[0], new rNL[0]);
    public static final rzk_3 id_break = rzz_3.id_extends;
    public final rzk_3 id_protected;
    public final rzN_2[] id_throws;
    public final rNL[] id_case;
    private final BiFunction<rdn_3, rzr_3, rdn_3> id_catch;

    public rzL_2(rzk_3 rzk_32, rzN_2[] rzN_2Array, rNL[] rNLArray) {
        this.id_protected = rzk_32;
        this.id_throws = rzN_2Array;
        this.id_case = rNLArray;
        this.id_catch = rNl_1.id_class(rNLArray);
    }

    public void id_class(rXu_1 rXu_12, rzr_3 rzr_32) {
        List<rdn_3> list = this.id_class(rzr_32);
        Random random = rzr_32.id_class();
        List<Integer> list2 = this.id_class(rXu_12, random);
        this.id_class(list, list2.size(), random);
        for (rdn_3 rdn_32 : list) {
            if (list2.isEmpty()) {
                id_byte.warn("Tried to over-fill a container");
                return;
            }
            if (rdn_32.id_class()) {
                rXu_12.id_break(list2.remove(list2.size() - 1), rdn_3.id_break);
                continue;
            }
            rXu_12.id_break(list2.remove(list2.size() - 1), rdn_32);
        }
    }

    private void id_class(List<rdn_3> list, int n, Random random) {
        rdn_3 rdn_32;
        ArrayList arrayList = Lists.newArrayList();
        Iterator<rdn_3> iterator = list.iterator();
        while (iterator.hasNext()) {
            rdn_32 = iterator.next();
            if (rdn_32.id_class()) {
                iterator.remove();
                continue;
            }
            if (rdn_32.id_char() <= 1) continue;
            arrayList.add(rdn_32);
            iterator.remove();
        }
        while (n - list.size() - arrayList.size() > 0 && !arrayList.isEmpty()) {
            rdn_32 = (rdn_3)arrayList.remove(rfU_2.id_class(random, 0, arrayList.size() - 1));
            int n2 = rfU_2.id_class(random, 1, rdn_32.id_char() / 2);
            rdn_3 rdn_33 = rdn_32.id_class(n2);
            if (rdn_32.id_char() > 1 && random.nextBoolean()) {
                arrayList.add(rdn_32);
            } else {
                list.add(rdn_32);
            }
            if (rdn_33.id_char() > 1 && random.nextBoolean()) {
                arrayList.add(rdn_33);
                continue;
            }
            list.add(rdn_33);
        }
        list.addAll(arrayList);
        Collections.shuffle(list, random);
    }

    private List<Integer> id_class(rXu_1 rXu_12, Random random) {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < rXu_12.id_else(); ++i) {
            if (!rXu_12.id_extends(i).id_class()) continue;
            arrayList.add(i);
        }
        Collections.shuffle(arrayList, random);
        return arrayList;
    }

    public void id_class(rQs_1 rQs_12) {
        int n;
        for (n = 0; n < this.id_throws.length; ++n) {
            this.id_throws[n].id_class(rQs_12.id_break(".pools[" + n + "]"));
        }
        for (n = 0; n < this.id_case.length; ++n) {
            this.id_case[n].id_class(rQs_12.id_break(".functions[" + n + "]"));
        }
    }

    public void id_class(rzr_3 rzr_32, Consumer<rdn_3> consumer) {
        if (rzr_32.id_class(this)) {
            Consumer<rdn_3> consumer2 = rNL.id_class(this.id_catch, consumer, rzr_32);
            for (rzN_2 rzN_22 : this.id_throws) {
                rzN_22.id_class(consumer2, rzr_32);
            }
            rzr_32.id_break(this);
        } else {
            id_byte.warn("Detected infinite loop in loot tables");
        }
    }

    public List<rdn_3> id_class(rzr_3 rzr_32) {
        ArrayList arrayList = Lists.newArrayList();
        this.id_break(rzr_32, arrayList::add);
        return arrayList;
    }

    public rzk_3 id_class() {
        return this.id_protected;
    }

    public static Consumer<rdn_3> id_class(Consumer<rdn_3> consumer) {
        return rdn_32 -> {
            if (rdn_32.id_char() < rdn_32.id_byte()) {
                consumer.accept((rdn_3)rdn_32);
            } else {
                rdn_3 rdn_33;
                for (int i = rdn_32.id_char(); i > 0; i -= rdn_33.id_char()) {
                    rdn_33 = rdn_32.id_implements();
                    rdn_33.id_throws(Math.min(rdn_32.id_byte(), i));
                    consumer.accept(rdn_33);
                }
            }
        };
    }

    public static rzA_2 id_break() {
        return new rzA_2();
    }

    public void id_break(rzr_3 rzr_32, Consumer<rdn_3> consumer) {
        this.id_class(rzr_32, rzL_2.id_class(consumer));
    }
}

