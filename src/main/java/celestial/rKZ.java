/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 */
package celestial;

import celestial.rKv_1;
import celestial.rfw_3;
import celestial.roC_2;
import celestial.ryl_3;
import celestial.xc_3;
import celestial.xu_3;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;
import java.util.function.Predicate;

public class rKZ {
    public static final Predicate<xc_3> id_class = xc_32 -> !xc_32.id_catch();
    public static final Predicate<xc_3> id_break = xc_32 -> xc_32.id_byte().id_byte();
    private final ryl_3 id_byte = new ryl_3(9, 256);
    private final Predicate<xc_3> id_protected;
    private final roC_2 id_throws;

    public rKZ(roC_2 roC_22, rKv_1 rKv_12) {
        this.id_protected = rKv_12.id_throws();
        this.id_throws = roC_22;
    }

    public static void id_class(roC_2 roC_22, Set<rKv_1> set) {
        int n = set.size();
        ObjectArrayList objectArrayList = new ObjectArrayList(n);
        ObjectListIterator objectListIterator = objectArrayList.iterator();
        int n2 = roC_22.id_char() + 16;
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i < 16; ++i) {
            block1: for (int j = 0; j < 16; ++j) {
                for (rKv_1 rKv_12 : set) {
                    objectArrayList.add((Object)roC_22.id_class(rKv_12));
                }
                for (int k = n2 - 1; k >= 0; --k) {
                    rfw_32.id_class(i, k, j);
                    xc_3 xc_32 = roC_22.id_byte(rfw_32);
                    if (xc_32.id_class(xu_3.id_class)) continue;
                    while (objectListIterator.hasNext()) {
                        rKZ rKZ2 = (rKZ)objectListIterator.next();
                        if (!rKZ2.id_protected.test(xc_32)) continue;
                        rKZ2.id_class(i, j, k + 1);
                        objectListIterator.remove();
                    }
                    if (objectArrayList.isEmpty()) continue block1;
                    objectListIterator.back(n);
                }
            }
        }
    }

    public long[] id_class() {
        return this.id_byte.id_class();
    }

    public void id_class(long[] lArray) {
        System.arraycopy(lArray, 0, this.id_byte.id_class(), 0, lArray.length);
    }

    public boolean id_class(int n, int n2, int n3, xc_3 xc_32) {
        int n4 = this.id_class(n, n3);
        if (n2 <= n4 - 2) {
            return false;
        }
        if (this.id_protected.test(xc_32)) {
            if (n2 >= n4) {
                this.id_class(n, n3, n2 + 1);
                return true;
            }
        } else if (n4 - 1 == n2) {
            rfw_3 rfw_32 = new rfw_3();
            for (int i = n2 - 1; i >= 0; --i) {
                rfw_32.id_class(n, i, n3);
                if (!this.id_protected.test(this.id_throws.id_byte(rfw_32))) continue;
                this.id_class(n, n3, i + 1);
                return true;
            }
            this.id_class(n, n3, 0);
            return true;
        }
        return false;
    }

    public int id_class(int n, int n2) {
        return this.id_class(rKZ.id_break(n, n2));
    }

    private void id_class(int n, int n2, int n3) {
        this.id_byte.id_break(rKZ.id_break(n, n2), n3);
    }

    private int id_class(int n) {
        return this.id_byte.id_class(n);
    }

    private static int id_break(int n, int n2) {
        return n + n2 * 16;
    }
}

