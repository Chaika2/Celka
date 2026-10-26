/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package celestial;

import celestial.Vo_1;
import celestial.gk_3;
import celestial.gz_3;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class gd_3<T>
implements Vo_1<T> {
    protected gz_3<T> id_break = new gz_3();
    protected gz_3<T> id_byte = new gz_3();
    private final Function<T, Stream<rqO_2>> id_class;
    private final List<T> id_protected = Lists.newArrayList();
    private final Object2IntMap<T> id_throws = new Object2IntOpenHashMap();

    public gd_3(Function<T, Stream<rqO_2>> function) {
        this.id_class = function;
    }

    protected int id_class(T t, T t2) {
        return Integer.compare(this.id_throws.getInt(t), this.id_throws.getInt(t2));
    }

    @Override
    public List<T> id_class(String string) {
        int n = string.indexOf(58);
        if (n == -1) {
            return this.id_byte.id_class(string);
        }
        List<T> list = this.id_break.id_class(string.substring(0, n).trim());
        String string2 = string.substring(n + 1).trim();
        List<T> list2 = this.id_byte.id_class(string2);
        return Lists.newArrayList(new gk_3<T>(list.iterator(), list2.iterator(), this::id_class));
    }

    @Override
    public void id_class() {
        this.id_protected.clear();
        this.id_throws.clear();
    }

    @Override
    public void id_class(T t) {
        this.id_throws.put(t, this.id_protected.size());
        this.id_protected.add(t);
        this.id_break(t);
    }

    protected void id_break(T t) {
        this.id_class.apply(t).forEach(rqO_22 -> {
            this.id_break.id_class(t, rqO_22.id_byte().toLowerCase(Locale.ROOT));
            this.id_byte.id_class(t, rqO_22.id_break().toLowerCase(Locale.ROOT));
        });
    }

    @Override
    public void id_break() {
        this.id_break = new gz_3();
        this.id_byte = new gz_3();
        for (T t : this.id_protected) {
            this.id_break(t);
        }
        this.id_break.id_class();
        this.id_byte.id_class();
    }
}

