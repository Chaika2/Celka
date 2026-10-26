/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.gX_2;
import celestial.gd_3;
import celestial.gk_3;
import celestial.gz_3;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class gh_3<T>
extends gd_3<T> {
    protected gz_3<T> id_class = new gz_3();
    private final Function<T, Stream<String>> id_protected;

    public gh_3(Function<T, Stream<String>> function, Function<T, Stream<rqO_2>> function2) {
        super(function2);
        this.id_protected = function;
    }

    @Override
    public List<T> id_class(String string) {
        int n = string.indexOf(58);
        if (n < 0) {
            return this.id_class.id_class(string);
        }
        List list = this.id_break.id_class(string.substring(0, n).trim());
        String string2 = string.substring(n + 1).trim();
        List list2 = this.id_byte.id_class(string2);
        List<T> list3 = this.id_class.id_class(string2);
        return Lists.newArrayList(new gk_3(list.iterator(), new gX_2(list2.iterator(), list3.iterator(), this::id_class), this::id_class));
    }

    @Override
    public void id_break() {
        this.id_class = new gz_3();
        super.id_break();
        this.id_class.id_class();
    }

    @Override
    protected void id_break(T t) {
        super.id_break(t);
        this.id_protected.apply(t).forEach(string -> this.id_class.id_class(t, string.toLowerCase(Locale.ROOT)));
    }
}

