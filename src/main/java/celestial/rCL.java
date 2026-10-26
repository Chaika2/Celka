/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rCA;
import celestial.rCF;
import celestial.rCZ;
import celestial.rCn_1;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

public class rCL<O, S extends rCn_1<O, S>> {
    private final O id_class;
    private final Map<String, rCZ<?>> id_break = Maps.newHashMap();

    public rCL(O o) {
        this.id_class = o;
    }

    public rCF<O, S> id_class(Function<O, S> function, rCA<O, S> rCA2) {
        return new rCF<O, S>(function, this.id_class, rCA2, this.id_break);
    }

    private <T extends Comparable<T>> void id_class(rCZ<T> rCZ2) {
        String string = rCZ2.id_throws();
        if (!rCF.id_class.matcher(string).matches()) {
            throw new IllegalArgumentException(this.id_class + " has invalidly named property: " + string);
        }
        Collection<T> collection = rCZ2.id_class();
        if (collection.size() <= 1) {
            throw new IllegalArgumentException(this.id_class + " attempted use property " + string + " with <= 1 possible values");
        }
        for (Comparable comparable : collection) {
            String string2 = rCZ2.id_class(comparable);
            if (rCF.id_class.matcher(string2).matches()) continue;
            throw new IllegalArgumentException(this.id_class + " has property: " + string + " with invalidly named value: " + string2);
        }
        if (this.id_break.containsKey(string)) {
            throw new IllegalArgumentException(this.id_class + " has duplicate property: " + string);
        }
    }

    public rCL<O, S> id_class(rCZ<?> ... rCZArray) {
        for (rCZ<?> rCZ2 : rCZArray) {
            this.id_class((rCZ<T>)rCZ2);
            this.id_break.put(rCZ2.id_throws(), rCZ2);
        }
        return this;
    }
}

