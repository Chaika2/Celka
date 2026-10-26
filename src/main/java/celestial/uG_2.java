/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 */
package celestial;

import celestial.fY_2;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.uE_2;
import celestial.uJ_2;
import celestial.uO_2;
import celestial.uW_2;
import celestial.uX_2;
import celestial.uc_3;
import celestial.ud_3;
import celestial.us_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class uG_2
implements AutoCloseable {
    private static final uE_2 id_class = new uE_2();
    private static final uX_2 id_break = () -> 4.0f;
    private static final Random id_byte = new Random();
    private final fY_2 id_protected;
    private final rqO_2 id_throws;
    private ud_3 id_case;
    private ud_3 id_catch;
    private final List<uc_3> id_private = Lists.newArrayList();
    private final Int2ObjectMap<ud_3> id_implements = new Int2ObjectOpenHashMap();
    private final Int2ObjectMap<uX_2> id_finally = new Int2ObjectOpenHashMap();
    private final Int2ObjectMap<IntList> id_extends = new Int2ObjectOpenHashMap();
    private final List<uO_2> id_native = Lists.newArrayList();

    private void id_byte() {
        for (uO_2 uO_22 : this.id_native) {
            uO_22.close();
        }
        this.id_native.clear();
    }

    private uJ_2 id_byte(int n) {
        for (uc_3 uc_32 : this.id_private) {
            uJ_2 uJ_22 = uc_32.id_class(n);
            if (uJ_22 == null) continue;
            return uJ_22;
        }
        return us_3.INSTANCE;
    }

    public uG_2(fY_2 fY_22, rqO_2 rqO_22) {
        this.id_protected = fY_22;
        this.id_throws = rqO_22;
    }

    public void id_class(List<uc_3> list) {
        this.id_break();
        this.id_byte();
        this.id_implements.clear();
        this.id_finally.clear();
        this.id_extends.clear();
        this.id_case = this.id_class(us_3.INSTANCE);
        this.id_catch = this.id_class(uW_2.INSTANCE);
        IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
        for (uc_3 uc_32 : list) {
            intOpenHashSet.addAll((IntCollection)uc_32.id_class());
        }
        HashSet hashSet = Sets.newHashSet();
        intOpenHashSet.forEach(n2 -> {
            for (uc_3 uc_32 : list) {
                uX_2 uX_22 = n2 == 32 ? id_break : uc_32.id_class(n2);
                if (uX_22 == null) continue;
                hashSet.add(uc_32);
                if (uX_22 == us_3.INSTANCE) break;
                ((IntList)this.id_extends.computeIfAbsent(rfU_2.id_case(uX_22.id_class(false)), n -> new IntArrayList())).add(n2);
                break;
            }
        });
        list.stream().filter(hashSet::contains).forEach(this.id_private::add);
    }

    private ud_3 id_class(uJ_2 uJ_22) {
        for (uO_2 object2 : this.id_native) {
            ud_3 ud_32 = object2.id_class(uJ_22);
            if (ud_32 == null) continue;
            return ud_32;
        }
        uO_2 uO_22 = new uO_2(new rqO_2(this.id_throws.id_byte(), this.id_throws.id_break() + "/" + this.id_native.size()), uJ_22.id_protected());
        this.id_native.add(uO_22);
        this.id_protected.id_class(uO_22.id_class(), uO_22);
        ud_3 ud_33 = uO_22.id_class(uJ_22);
        return ud_33 == null ? this.id_case : ud_33;
    }

    public ud_3 id_class() {
        return this.id_catch;
    }

    public ud_3 id_class(uX_2 uX_22) {
        IntList intList = (IntList)this.id_extends.get(rfU_2.id_case(uX_22.id_class(false)));
        return intList != null && !intList.isEmpty() ? this.id_break(intList.getInt(id_byte.nextInt(intList.size()))) : this.id_case;
    }

    public uX_2 id_class(int n) {
        uX_2 uX_22 = (uX_2)this.id_finally.get(n);
        if (uX_22 == null) {
            uX_22 = n == 32 ? id_break : this.id_byte(n);
            this.id_finally.put(n, (Object)uX_22);
        }
        return uX_22;
    }

    @Override
    public void close() {
        this.id_break();
        this.id_byte();
    }

    public ud_3 id_break(int n) {
        ud_3 ud_32 = (ud_3)this.id_implements.get(n);
        if (ud_32 == null) {
            ud_32 = n == 32 ? id_class : this.id_class(this.id_byte(n));
            this.id_implements.put(n, (Object)ud_32);
        }
        return ud_32;
    }

    private void id_break() {
        for (uc_3 uc_32 : this.id_private) {
            uc_32.close();
        }
        this.id_private.clear();
    }
}

