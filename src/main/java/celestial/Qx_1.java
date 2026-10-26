/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.Qh_1;
import celestial.ryw_3;
import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class Qx_1 {
    private static final Joiner id_class = Joiner.on((String)",");
    private final List<String[]> id_break = Lists.newArrayList();
    private final Map<Character, Predicate<ryw_3>> id_byte = Maps.newHashMap();
    private int id_protected;
    private int id_throws;

    private Predicate<ryw_3>[][][] id_byte() {
        this.id_protected();
        Predicate[][][] predicateArray = (Predicate[][][])Array.newInstance(Predicate.class, this.id_break.size(), this.id_protected, this.id_throws);
        for (int i = 0; i < this.id_break.size(); ++i) {
            for (int j = 0; j < this.id_protected; ++j) {
                for (int k = 0; k < this.id_throws; ++k) {
                    predicateArray[i][j][k] = this.id_byte.get(Character.valueOf(this.id_break.get(i)[j].charAt(k)));
                }
            }
        }
        return predicateArray;
    }

    private Qx_1() {
        this.id_byte.put(Character.valueOf(' '), (Predicate<ryw_3>)Predicates.alwaysTrue());
    }

    public Qx_1 id_class(String ... stringArray) {
        if (!ArrayUtils.isEmpty((Object[])stringArray) && !StringUtils.isEmpty((CharSequence)stringArray[0])) {
            if (this.id_break.isEmpty()) {
                this.id_protected = stringArray.length;
                this.id_throws = stringArray[0].length();
            }
            if (stringArray.length != this.id_protected) {
                throw new IllegalArgumentException("Expected aisle with height of " + this.id_protected + ", but was given one with a height of " + stringArray.length + ")");
            }
            for (String string : stringArray) {
                if (string.length() != this.id_throws) {
                    throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.id_throws + ", found one with " + string.length() + ")");
                }
                for (char c : string.toCharArray()) {
                    if (this.id_byte.containsKey(Character.valueOf(c))) continue;
                    this.id_byte.put(Character.valueOf(c), null);
                }
            }
            this.id_break.add(stringArray);
            return this;
        }
        throw new IllegalArgumentException("Empty pattern for aisle");
    }

    public static Qx_1 id_class() {
        return new Qx_1();
    }

    public Qx_1 id_class(char c, Predicate<ryw_3> predicate) {
        this.id_byte.put(Character.valueOf(c), predicate);
        return this;
    }

    public Qh_1 id_break() {
        return new Qh_1(this.id_byte());
    }

    private void id_protected() {
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry<Character, Predicate<ryw_3>> entry : this.id_byte.entrySet()) {
            if (entry.getValue() != null) continue;
            arrayList.add(entry.getKey());
        }
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("Predicates for character(s) " + id_class.join((Iterable)arrayList) + " are missing");
        }
    }
}

