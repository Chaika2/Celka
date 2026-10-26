/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.apache.logging.log4j.LogManager
 */
package celestial;

import celestial.rqR_2;
import celestial.ruB_2;
import celestial.ruS_2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;

public class ruF_2<T extends ruB_2> {
    private final Object2IntMap<Class<? extends ruS_2<T>>> id_class = (Object2IntMap)rqR_2.id_class(new Object2IntOpenHashMap(), object2IntOpenHashMap -> object2IntOpenHashMap.defaultReturnValue(-1));
    private final List<Supplier<? extends ruS_2<T>>> id_break = Lists.newArrayList();

    public ruS_2<?> id_class(int n) {
        Supplier<ruS_2<T>> supplier = this.id_break.get(n);
        return supplier != null ? supplier.get() : null;
    }

    public Iterable<Class<? extends ruS_2<?>>> id_class() {
        return Iterables.unmodifiableIterable((Iterable)this.id_class.keySet());
    }

    public Integer id_class(Class<?> clazz) {
        int n = this.id_class.getInt(clazz);
        return n == -1 ? null : Integer.valueOf(n);
    }

    public <P extends ruS_2<T>> ruF_2<T> id_class(Class<P> clazz, Supplier<P> supplier) {
        int n = this.id_break.size();
        int n2 = this.id_class.put(clazz, n);
        if (n2 != -1) {
            String string = "Packet " + clazz + " is already registered to ID " + n2;
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        this.id_break.add(supplier);
        return this;
    }
}

