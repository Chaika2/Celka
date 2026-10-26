/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.Arrays
 *  it.unimi.dsi.fastutil.Swapper
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntComparator
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.gQ_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.Swapper;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparator;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class gz_3<T> {
    private static final boolean id_break = Boolean.parseBoolean(System.getProperty("SuffixArray.printComparisons", "false"));
    private static final boolean id_byte = Boolean.parseBoolean(System.getProperty("SuffixArray.printArray", "false"));
    private static final Logger id_protected = LogManager.getLogger();
    protected final List<T> id_class = Lists.newArrayList();
    private final IntList id_throws = new IntArrayList();
    private final IntList id_case = new IntArrayList();
    private IntList id_catch = new IntArrayList();
    private IntList id_private = new IntArrayList();
    private int id_implements;

    private int id_class(String string, int n) {
        int n2 = this.id_case.getInt(this.id_catch.getInt(n));
        int n3 = this.id_private.getInt(n);
        for (int i = 0; i < string.length(); ++i) {
            char c;
            int n4 = this.id_throws.getInt(n2 + n3 + i);
            if (n4 == -1) {
                return 1;
            }
            char c2 = string.charAt(i);
            if (c2 < (c = (char)n4)) {
                return -1;
            }
            if (c2 <= c) continue;
            return 1;
        }
        return 0;
    }

    public List<T> id_class(String string) {
        int n;
        int n2;
        int n3 = this.id_catch.size();
        int n4 = 0;
        int n5 = n3;
        while (n4 < n5) {
            n2 = n4 + (n5 - n4) / 2;
            n = this.id_class(string, n2);
            if (id_break) {
                id_protected.debug("comparing lower \"{}\" with {} \"{}\": {}", (Object)string, (Object)n2, (Object)this.id_class(n2), (Object)n);
            }
            if (n > 0) {
                n4 = n2 + 1;
                continue;
            }
            n5 = n2;
        }
        if (n4 >= 0 && n4 < n3) {
            n2 = n4;
            n5 = n3;
            while (n4 < n5) {
                n = n4 + (n5 - n4) / 2;
                int n6 = this.id_class(string, n);
                if (id_break) {
                    id_protected.debug("comparing upper \"{}\" with {} \"{}\": {}", (Object)string, (Object)n, (Object)this.id_class(n), (Object)n6);
                }
                if (n6 >= 0) {
                    n4 = n + 1;
                    continue;
                }
                n5 = n;
            }
            n = n4;
            IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
            for (int i = n2; i < n; ++i) {
                intOpenHashSet.add(this.id_catch.getInt(i));
            }
            int[] nArray = intOpenHashSet.toIntArray();
            Arrays.sort(nArray);
            LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
            for (int n7 : nArray) {
                linkedHashSet.add(this.id_class.get(n7));
            }
            return Lists.newArrayList((Iterable)linkedHashSet);
        }
        return Collections.emptyList();
    }

    private String id_class(int n) {
        int n2 = this.id_private.getInt(n);
        int n3 = this.id_case.getInt(this.id_catch.getInt(n));
        StringBuilder stringBuilder = new StringBuilder();
        int n4 = 0;
        while (n3 + n4 < this.id_throws.size()) {
            int n5;
            if (n4 == n2) {
                stringBuilder.append('^');
            }
            if ((n5 = this.id_throws.get(n3 + n4).intValue()) == -1) break;
            stringBuilder.append((char)n5);
            ++n4;
        }
        return stringBuilder.toString();
    }

    public void id_class(T t, String string) {
        this.id_implements = Math.max(this.id_implements, string.length());
        int n = this.id_class.size();
        this.id_class.add(t);
        this.id_case.add(this.id_throws.size());
        for (int i = 0; i < string.length(); ++i) {
            this.id_catch.add(n);
            this.id_private.add(i);
            this.id_throws.add((int)string.charAt(i));
        }
        this.id_catch.add(n);
        this.id_private.add(string.length());
        this.id_throws.add(-1);
    }

    public void id_class() {
        int n3;
        int n4 = this.id_throws.size();
        int[] nArray = new int[n4];
        int[] nArray2 = new int[n4];
        int[] nArray3 = new int[n4];
        int[] nArray4 = new int[n4];
        gQ_2 gQ_22 = new gQ_2(this, nArray2, nArray3);
        Swapper swapper = (n, n2) -> {
            if (n != n2) {
                int n3 = nArray2[n];
                nArray[n] = nArray2[n2];
                nArray[n2] = n3;
                n3 = nArray3[n];
                nArray2[n] = nArray3[n2];
                nArray2[n2] = n3;
                n3 = nArray4[n];
                nArray3[n] = nArray4[n2];
                nArray3[n2] = n3;
            }
        };
        for (n3 = 0; n3 < n4; ++n3) {
            nArray[n3] = this.id_throws.getInt(n3);
        }
        n3 = 1;
        int n5 = Math.min(n4, this.id_implements);
        while (n3 * 2 < n5) {
            int n6 = 0;
            while (n6 < n4) {
                nArray2[n6] = nArray[n6];
                nArray3[n6] = n6 + n3 < n4 ? nArray[n6 + n3] : -2;
                nArray4[n6] = n6++;
            }
            it.unimi.dsi.fastutil.Arrays.quickSort((int)0, (int)n4, (IntComparator)gQ_22, (Swapper)swapper);
            for (n6 = 0; n6 < n4; ++n6) {
                nArray[nArray4[n6]] = n6 > 0 && nArray2[n6] == nArray2[n6 - 1] && nArray3[n6] == nArray3[n6 - 1] ? nArray[nArray4[n6 - 1]] : n6;
            }
            n3 *= 2;
        }
        IntList intList = this.id_catch;
        IntList intList2 = this.id_private;
        this.id_catch = new IntArrayList(intList.size());
        this.id_private = new IntArrayList(intList2.size());
        for (int i = 0; i < n4; ++i) {
            int n7 = nArray4[i];
            this.id_catch.add(intList.getInt(n7));
            this.id_private.add(intList2.getInt(n7));
        }
        if (id_byte) {
            this.id_break();
        }
    }

    private void id_break() {
        for (int i = 0; i < this.id_catch.size(); ++i) {
            id_protected.debug("{} {}", (Object)i, (Object)this.id_class(i));
        }
        id_protected.debug("");
    }
}

