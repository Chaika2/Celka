/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.OA;
import celestial.Om_1;
import celestial.On_1;
import celestial.Op_1;
import celestial.Oq_1;
import celestial.Ov_1;
import celestial.Oy_1;
import celestial.event.EventTarget;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.apache.commons.lang3.tuple.Pair;

public class OZ
implements OA {
    private static final Map<Pair<Class<?>, Class<?>>, Long> id_class = new ConcurrentHashMap();
    private final Map<Object, List<Oy_1>> id_break = new ConcurrentHashMap<Object, List<Oy_1>>();
    private final Map<Class<?>, List<Oy_1>> id_byte = new ConcurrentHashMap();
    private final Map<Class<?>, List<Oy_1>> id_protected = new ConcurrentHashMap();
    private final List<Ov_1> id_throws = new ArrayList<Ov_1>();

    @Override
    public void id_byte(Object object) {
        this.id_break(this.id_class(object.getClass(), object), false);
    }

    @Override
    public void id_byte(Class<?> clazz) {
        this.id_break(this.id_class(clazz, null), true);
    }

    public OZ() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(this::id_class, 0L, 3L, TimeUnit.SECONDS);
    }

    private List<Oy_1> id_class(Class<?> clazz, Object object) {
        Function<Object, List> function = object2 -> {
            CopyOnWriteArrayList<Oy_1> copyOnWriteArrayList = new CopyOnWriteArrayList<Oy_1>();
            this.id_class(copyOnWriteArrayList, clazz, object);
            for (Oy_1 oy_1 : copyOnWriteArrayList) {
                oy_1.id_break(object2);
            }
            return copyOnWriteArrayList;
        };
        if (object == null) {
            return this.id_byte.computeIfAbsent(clazz, function);
        }
        for (Object object3 : this.id_break.keySet()) {
            if (object3 != object) continue;
            return this.id_break.get(object);
        }
        List list = function.apply(object);
        this.id_break.put(object, list);
        return list;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void id_class(String string, Oq_1 oq_1) {
        List<Ov_1> list = this.id_throws;
        synchronized (list) {
            this.id_throws.add(new Ov_1(string, oq_1));
        }
    }

    @Override
    public boolean id_class(Class<?> clazz) {
        List<Oy_1> list = this.id_protected.get(clazz);
        return list != null && !list.isEmpty();
    }

    @Override
    public <T> T id_class(T t) {
        List<Oy_1> list = this.id_protected.get(t.getClass());
        long l = System.currentTimeMillis();
        Oy_1 oy_1 = null;
        long l2 = 0L;
        if (list != null) {
            for (Oy_1 oy_12 : list) {
                long l3 = System.currentTimeMillis();
                oy_12.id_class(t);
                long l4 = System.currentTimeMillis() - l3;
                if (l4 <= l2) continue;
                l2 = l4;
                oy_1 = oy_12;
            }
        }
        long l5 = System.currentTimeMillis() - l;
        if (oy_1 != null && oy_1.id_break() != null) {
            id_class.merge(Pair.of(t.getClass(), oy_1.id_break().getClass()), l5, Long::sum);
        }
        return t;
    }

    private boolean id_class(Method method) {
        if (!method.isAnnotationPresent(EventTarget.class)) {
            return false;
        }
        if (method.getReturnType() != Void.TYPE) {
            return false;
        }
        if (method.getParameterCount() != 1) {
            return false;
        }
        return !method.getParameters()[0].getType().isPrimitive();
    }

    private void id_class(List<Oy_1> list, Class<?> clazz, Object object) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (!this.id_class(method)) continue;
            list.add(new Op_1(this.id_protected(clazz), clazz, object, method));
        }
        if (clazz.getSuperclass() != null) {
            this.id_class(list, clazz.getSuperclass(), object);
        }
    }

    private void id_class(List<Oy_1> list, boolean bl) {
        for (Oy_1 oy_1 : list) {
            this.id_class(oy_1, bl);
        }
    }

    public void id_class() {
        List list = id_class.entrySet().stream().sorted((entry, entry2) -> Long.compare((Long)entry2.getValue(), (Long)entry.getValue())).toList();
        System.out.println("Top events by execution time:");
        for (int i = 0; i < Math.min(15, list.size()); ++i) {
            Map.Entry entry3 = (Map.Entry)list.get(i);
            Class clazz = (Class)((Pair)entry3.getKey()).getLeft();
            Class clazz2 = (Class)((Pair)entry3.getKey()).getRight();
            Long l = (Long)entry3.getValue();
            System.out.println(i + 1 + ". " + clazz.getSimpleName() + ":" + clazz2.getSimpleName() + ": " + l + " ms");
        }
        id_class.clear();
    }

    @Override
    public void id_class(Oy_1 oy_1) {
        this.id_class(oy_1, false);
    }

    @Override
    public <T extends Om_1> T id_class(T t) {
        List<Oy_1> list = this.id_protected.get(t.getClass());
        long l = System.currentTimeMillis();
        Oy_1 oy_1 = null;
        long l2 = 0L;
        if (list != null) {
            t.id_class(false);
            try {
                for (Oy_1 oy_12 : list) {
                    long l3 = System.currentTimeMillis();
                    oy_12.id_class(t);
                    long l4 = System.currentTimeMillis() - l3;
                    if (l4 > l2) {
                        l2 = l4;
                        oy_1 = oy_12;
                    }
                    if (!t.id_byte()) continue;
                    break;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        long l5 = System.currentTimeMillis() - l;
        if (oy_1 != null && oy_1.id_break() != null) {
            id_class.merge(Pair.of(t.getClass(), oy_1.id_break().getClass()), l5, Long::sum);
        }
        return t;
    }

    private void id_class(List<Oy_1> list, Oy_1 oy_1) {
        int n;
        for (n = 0; n < list.size() && oy_1.id_byte() <= list.get(n).id_byte(); ++n) {
        }
        list.add(n, oy_1);
    }

    private void id_class(Oy_1 oy_1, boolean bl) {
        if (bl) {
            if (oy_1.id_protected()) {
                this.id_class((List<Oy_1>)this.id_protected.computeIfAbsent(oy_1.id_class(), clazz -> new CopyOnWriteArrayList()), oy_1);
            }
        } else {
            this.id_class((List<Oy_1>)this.id_protected.computeIfAbsent(oy_1.id_class(), clazz -> new CopyOnWriteArrayList()), oy_1);
        }
    }

    @Override
    public void id_break(Object object) {
        this.id_class(this.id_class(object.getClass(), object), false);
    }

    private void id_break(List<Oy_1> list, boolean bl) {
        for (Oy_1 oy_1 : list) {
            this.id_break(oy_1, bl);
        }
    }

    private void id_break(Oy_1 oy_1, boolean bl) {
        List<Oy_1> list = this.id_protected.get(oy_1.id_class());
        if (list != null) {
            if (bl) {
                if (oy_1.id_protected()) {
                    list.remove(oy_1);
                }
            } else {
                list.remove(oy_1);
            }
        }
    }

    @Override
    public void id_break(Class<?> clazz) {
        this.id_class(this.id_class(clazz, null), true);
    }

    @Override
    public void id_break(Oy_1 oy_1) {
        this.id_break(oy_1, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Oq_1 id_protected(Class<?> clazz) {
        List<Ov_1> list = this.id_throws;
        synchronized (list) {
            for (Ov_1 ov_1 : this.id_throws) {
                if (!clazz.getName().startsWith(ov_1.id_class)) continue;
                return ov_1.id_break;
            }
        }
        throw new On_1(clazz);
    }
}

