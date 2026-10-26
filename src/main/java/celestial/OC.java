/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.OA;
import celestial.Ol_1;
import celestial.Om_1;
import celestial.On_1;
import celestial.Op_1;
import celestial.Oq_1;
import celestial.Oy_1;
import celestial.event.EventTarget;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

public class OC
implements OA {
    private final Map<Object, List<Oy_1>> id_class = new ConcurrentHashMap<Object, List<Oy_1>>();
    private final Map<Class<?>, List<Oy_1>> id_break = new ConcurrentHashMap();
    private final Map<Class<?>, List<Oy_1>> id_byte = new ConcurrentHashMap();
    private final List<Ol_1> id_protected = new ArrayList<Ol_1>();

    @Override
    public void id_byte(Object object) {
        this.id_break(this.id_class(object.getClass(), object), false);
    }

    @Override
    public void id_byte(Class<?> clazz) {
        this.id_break(this.id_class(clazz, null), true);
    }

    private void id_class(Oy_1 oy_1, boolean bl) {
        if (bl) {
            if (oy_1.id_protected()) {
                this.id_class((List<Oy_1>)this.id_byte.computeIfAbsent(oy_1.id_class(), clazz -> new CopyOnWriteArrayList()), oy_1);
            }
        } else {
            this.id_class((List<Oy_1>)this.id_byte.computeIfAbsent(oy_1.id_class(), clazz -> new CopyOnWriteArrayList()), oy_1);
        }
    }

    private void id_class(List<Oy_1> list, Oy_1 oy_1) {
        int n;
        for (n = 0; n < list.size() && oy_1.id_byte() <= list.get(n).id_byte(); ++n) {
        }
        list.add(n, oy_1);
    }

    @Override
    public boolean id_class(Class<?> clazz) {
        List<Oy_1> list = this.id_byte.get(clazz);
        return list != null && !list.isEmpty();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void id_class(String string, Oq_1 oq_1) {
        List<Ol_1> list = this.id_protected;
        synchronized (list) {
            this.id_protected.add(new Ol_1(string, oq_1));
        }
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

    private List<Oy_1> id_class(Class<?> clazz, Object object) {
        Function<Object, List> function = object2 -> {
            CopyOnWriteArrayList<Oy_1> copyOnWriteArrayList = new CopyOnWriteArrayList<Oy_1>();
            this.id_class(copyOnWriteArrayList, clazz, object);
            return copyOnWriteArrayList;
        };
        if (object == null) {
            return this.id_break.computeIfAbsent(clazz, function);
        }
        for (Object object3 : this.id_class.keySet()) {
            if (object3 != object) continue;
            return this.id_class.get(object);
        }
        List list = function.apply(object);
        this.id_class.put(object, list);
        return list;
    }

    @Override
    public <T> T id_class(T t) {
        List<Oy_1> list = this.id_byte.get(t.getClass());
        if (list != null) {
            for (Oy_1 oy_1 : list) {
                oy_1.id_class(t);
            }
        }
        return t;
    }

    @Override
    public <T extends Om_1> T id_class(T t) {
        List<Oy_1> list = this.id_byte.get(t.getClass());
        if (list != null) {
            t.id_class(false);
            for (Oy_1 oy_1 : list) {
                oy_1.id_class(t);
                if (!t.id_byte()) continue;
                break;
            }
        }
        return t;
    }

    private void id_class(List<Oy_1> list, boolean bl) {
        for (Oy_1 oy_1 : list) {
            this.id_class(oy_1, bl);
        }
    }

    @Override
    public void id_class(Oy_1 oy_1) {
        this.id_class(oy_1, false);
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

    private void id_break(Oy_1 oy_1, boolean bl) {
        List<Oy_1> list = this.id_byte.get(oy_1.id_class());
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
    public void id_break(Object object) {
        this.id_class(this.id_class(object.getClass(), object), false);
    }

    @Override
    public void id_break(Class<?> clazz) {
        this.id_class(this.id_class(clazz, null), true);
    }

    @Override
    public void id_break(Oy_1 oy_1) {
        this.id_break(oy_1, false);
    }

    private void id_break(List<Oy_1> list, boolean bl) {
        for (Oy_1 oy_1 : list) {
            this.id_break(oy_1, bl);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Oq_1 id_protected(Class<?> clazz) {
        List<Ol_1> list = this.id_protected;
        synchronized (list) {
            for (Ol_1 ol_1 : this.id_protected) {
                if (!clazz.getName().startsWith(ol_1.id_class)) continue;
                return ol_1.id_break;
            }
        }
        throw new On_1(clazz);
    }
}

