/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.JE;
import celestial.JG;
import celestial.JS;
import celestial.rCZ;
import celestial.rpH_2;
import com.google.common.collect.Lists;
import java.util.List;

public class Js_1 {
    private final List<JG> id_class = Lists.newArrayList();

    private Js_1() {
    }

    public Js_1 id_class(rCZ<Integer> rCZ2, int n) {
        return this.id_class(rCZ2, Integer.toString(n));
    }

    public Js_1 id_class(rCZ<Boolean> rCZ2, boolean bl) {
        return this.id_class(rCZ2, Boolean.toString(bl));
    }

    public <T extends Comparable<T> & rpH_2> Js_1 id_class(rCZ<T> rCZ2, T t) {
        return this.id_class(rCZ2, ((rpH_2)t).id_class());
    }

    public Js_1 id_class(rCZ<?> rCZ2, String string) {
        this.id_class.add(new JE(rCZ2.id_throws(), string));
        return this;
    }

    public static Js_1 id_class() {
        return new Js_1();
    }

    public JS id_break() {
        return new JS(this.id_class);
    }
}

