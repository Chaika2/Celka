/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.QY;
import celestial.Va_1;
import celestial.Ve_1;
import celestial.Vi_1;
import celestial.jI_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqR_2;
import celestial.rrfC_2;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class Vu_1
implements Comparable<Vu_1> {
    private static final Map<String, Vu_1> id_class = Maps.newHashMap();
    private static final Map<Va_1, List<Vu_1>> id_break = Maps.newHashMap();
    private static final Set<String> id_byte = Sets.newHashSet();
    private static final Map<String, Integer> id_protected = rqR_2.id_class(Maps.newHashMap(), (T hashMap) -> {
        hashMap.put("key.categories.movement", 1);
        hashMap.put("key.categories.gameplay", 2);
        hashMap.put("key.categories.inventory", 3);
        hashMap.put("key.categories.creative", 4);
        hashMap.put("key.categories.multiplayer", 5);
        hashMap.put("key.categories.ui", 6);
        hashMap.put("key.categories.misc", 7);
    });
    private final String id_throws;
    private final Va_1 id_case;
    private final String id_catch;
    private List<Va_1> id_private = new ArrayList<Va_1>();
    private List<Va_1> id_implements = new ArrayList<Va_1>();
    private Va_1 id_finally;
    private boolean id_extends;
    private int id_native;

    public boolean id_byte(Vu_1 vu_1) {
        return this.id_finally.equals(vu_1.id_finally) && this.id_implements.equals(vu_1.id_implements);
    }

    public static void id_byte() {
        id_break.clear();
        for (Vu_1 vu_1 : id_class.values()) {
            id_break.computeIfAbsent(vu_1.id_finally, va_1 -> new ArrayList()).add(vu_1);
        }
    }

    public Va_1 id_int() {
        return this.id_finally;
    }

    public Vu_1(String string, int n, String string2, List<Va_1> list) {
        this(string, Vi_1.KEYSYM, n, string2);
        this.id_implements = new ArrayList<Va_1>(list);
        this.id_private = list;
    }

    public Vu_1(String string, int n, String string2) {
        this(string, Vi_1.KEYSYM, n, string2);
    }

    public Vu_1(String string, Vi_1 vi_1, int n, String string2) {
        this.id_throws = string;
        this.id_case = this.id_finally = vi_1.id_class(n);
        this.id_catch = string2;
        id_class.put(string, this);
        id_break.computeIfAbsent(this.id_finally, va_1 -> new ArrayList()).add(this);
        id_byte.add(string2);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.id_break((Vu_1)object);
    }

    public static Supplier<rgP_2> id_class(String string) {
        Vu_1 vu_1 = id_class.get(string);
        return vu_1 == null ? () -> new rgn_3(string) : vu_1::id_native;
    }

    public static void id_class(Va_1 va_1) {
        List<Vu_1> list = id_break.get(va_1);
        if (list != null) {
            for (Vu_1 vu_1 : list) {
                ++vu_1.id_native;
            }
        }
    }

    public void id_class(Va_1 va_1, Collection<Va_1> collection) {
        this.id_finally = va_1;
        this.id_implements.clear();
        if (!collection.isEmpty()) {
            for (Va_1 va_12 : collection) {
                if (va_12.equals(this.id_finally)) continue;
                this.id_implements.add(va_12);
            }
        }
    }

    public void id_class(boolean bl) {
        this.id_extends = bl;
    }

    public boolean id_class(int n) {
        if (Vu_1.id_class(this)) {
            return this.id_finally.id_class() == Vi_1.MOUSE && this.id_finally.id_break() == n;
        }
        return false;
    }

    public boolean id_class(int n, int n2) {
        if (Vu_1.id_class(this)) {
            if (n == Ve_1.id_class.id_break()) {
                return this.id_finally.id_class() == Vi_1.SCANCODE && this.id_finally.id_break() == n2;
            }
            return this.id_finally.id_class() == Vi_1.KEYSYM && this.id_finally.id_break() == n;
        }
        return false;
    }

    public static void id_class(Va_1 va_1, boolean bl) {
        List<Vu_1> list = id_break.get(va_1);
        if (list != null) {
            for (Vu_1 vu_1 : list) {
                vu_1.id_class(bl);
            }
        }
    }

    public static boolean id_class(Vu_1 vu_1) {
        if (vu_1.id_implements.isEmpty()) {
            return true;
        }
        for (Va_1 va_1 : vu_1.id_implements) {
            if (rrfC_2.id_break(va_1.id_break())) continue;
            return false;
        }
        return true;
    }

    public static void id_class() {
        for (Vu_1 vu_1 : id_class.values()) {
            if (vu_1.id_finally.id_class() != Vi_1.KEYSYM || vu_1.id_finally.id_break() == Ve_1.id_class.id_break()) continue;
            vu_1.id_class(Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), vu_1.id_finally.id_break()));
        }
    }

    public int id_break(Vu_1 vu_1) {
        return this.id_catch.equals(vu_1.id_catch) ? jI_2.id_class(this.id_throws, new Object[0]).compareTo(jI_2.id_class(vu_1.id_throws, new Object[0])) : id_protected.get(this.id_catch).compareTo(id_protected.get(vu_1.id_catch));
    }

    public static void id_break() {
        for (Vu_1 vu_1 : id_class.values()) {
            vu_1.id_new();
        }
    }

    public void id_break(Va_1 va_1, boolean bl) {
        this.id_finally = va_1;
        if (bl) {
            this.id_implements.clear();
        }
    }

    public String id_throws() {
        return this.id_catch;
    }

    public List<Va_1> id_finally() {
        return this.id_private;
    }

    public String id_catch() {
        return this.id_throws;
    }

    public boolean id_extends() {
        return this.id_finally.equals(Ve_1.id_class);
    }

    public boolean id_case() {
        if (Vu_1.id_class(this)) {
            if (this.id_native == 0) {
                return false;
            }
            --this.id_native;
            return true;
        }
        return false;
    }

    public List<Va_1> id_implements() {
        return this.id_implements;
    }

    private void id_new() {
        this.id_native = 0;
        this.id_class(false);
    }

    public String id_package() {
        return this.id_implements.stream().map(Va_1::id_byte).reduce((string, string2) -> string + ":" + string2).orElse("");
    }

    public boolean id_protected() {
        if (Vu_1.id_class(this)) {
            return this.id_extends;
        }
        return false;
    }

    public Va_1 id_private() {
        return this.id_case;
    }

    public String id_final() {
        return this.id_finally.id_byte();
    }

    public boolean id_volatile() {
        return this.id_finally.equals(this.id_case) && this.id_implements.equals(this.id_private);
    }

    public rgP_2 id_native() {
        rgN_2 rgN_22 = new rgN_2("");
        for (Va_1 va_1 : this.id_implements) {
            rgN_22.id_class(va_1.id_protected());
            rgN_22.id_break(" + ");
        }
        rgN_22.id_class(this.id_finally.id_protected());
        return rgN_22;
    }
}

