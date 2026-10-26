/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.VP;
import celestial.Vr_1;
import celestial.ja_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ji_3 {
    public static final VP id_class = new VP();
    public static final ji_3 id_break = new Vr_1((List)Lists.newArrayList(), -1, -1, 1, false);
    private final List<ja_3> id_byte;
    private final int id_protected;
    private final int id_throws;
    private final int id_case;
    private final boolean id_catch;

    public boolean id_byte() {
        return this.id_catch;
    }

    public int id_byte(int n) {
        ja_3 ja_32 = this.id_throws(n);
        return ja_32.id_class() ? this.id_case : ja_32.id_break();
    }

    private Pair<Integer, Integer> id_byte(int n, int n2) {
        if (this.id_protected != -1) {
            return this.id_throws != -1 ? Pair.of((Object)this.id_protected, (Object)this.id_throws) : Pair.of((Object)this.id_protected, (Object)n2);
        }
        if (this.id_throws != -1) {
            return Pair.of((Object)n, (Object)this.id_throws);
        }
        int n3 = Math.min(n, n2);
        return Pair.of((Object)n3, (Object)n3);
    }

    public ji_3(List<ja_3> list, int n, int n2, int n3, boolean bl) {
        this.id_byte = list;
        this.id_protected = n;
        this.id_throws = n2;
        this.id_case = n3;
        this.id_catch = bl;
    }

    public Pair<Integer, Integer> id_class(int n, int n2) {
        Pair<Integer, Integer> pair = this.id_byte(n, n2);
        int n3 = (Integer)pair.getFirst();
        int n4 = (Integer)pair.getSecond();
        if (ji_3.id_break(n, n3) && ji_3.id_break(n2, n4)) {
            return pair;
        }
        throw new IllegalArgumentException(String.format("Image size %s,%s is not multiply of frame size %s,%s", n, n2, n3, n4));
    }

    public int id_class() {
        return this.id_byte.size();
    }

    public int id_class(int n) {
        return this.id_throws == -1 ? n : this.id_throws;
    }

    public int id_break() {
        return this.id_case;
    }

    private static boolean id_break(int n, int n2) {
        return n / n2 * n2 == n;
    }

    public int id_break(int n) {
        return this.id_protected == -1 ? n : this.id_protected;
    }

    private ja_3 id_throws(int n) {
        return this.id_byte.get(n);
    }

    public int id_protected(int n) {
        return this.id_byte.get(n).id_byte();
    }

    public Set<Integer> id_protected() {
        HashSet hashSet = Sets.newHashSet();
        for (ja_3 ja_32 : this.id_byte) {
            hashSet.add(ja_32.id_byte());
        }
        return hashSet;
    }
}

