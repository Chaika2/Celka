/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 */
package celestial;

import celestial.QJ;
import celestial.QX;
import celestial.rRR;
import celestial.rfH_2;
import celestial.rja_3;
import celestial.rpr_3;
import celestial.ryw_3;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;

public class Qh_1 {
    private final Predicate<ryw_3>[][][] id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;

    public int id_byte() {
        return this.id_protected;
    }

    public Qh_1(Predicate<ryw_3>[][][] predicateArray) {
        this.id_class = predicateArray;
        this.id_break = predicateArray.length;
        if (this.id_break > 0) {
            this.id_byte = predicateArray[0].length;
            this.id_protected = this.id_byte > 0 ? predicateArray[0][0].length : 0;
        } else {
            this.id_byte = 0;
            this.id_protected = 0;
        }
    }

    public QJ id_class(rRR rRR2, rfH_2 rfH_22) {
        LoadingCache<rfH_2, ryw_3> loadingCache = Qh_1.id_class(rRR2, false);
        int n = Math.max(Math.max(this.id_protected, this.id_byte), this.id_break);
        for (rfH_2 rfH_23 : rfH_2.id_class(rfH_22, rfH_22.id_break(n - 1, n - 1, n - 1))) {
            for (rpr_3 rpr_32 : rpr_3.values()) {
                for (rpr_3 rpr_33 : rpr_3.values()) {
                    QJ qJ;
                    if (rpr_33 == rpr_32 || rpr_33 == rpr_32.id_case() || (qJ = this.id_class(rfH_23, rpr_32, rpr_33, loadingCache)) == null) continue;
                    return qJ;
                }
            }
        }
        return null;
    }

    public static LoadingCache<rfH_2, ryw_3> id_class(rRR rRR2, boolean bl) {
        return CacheBuilder.newBuilder().build((CacheLoader)new QX(rRR2, bl));
    }

    protected static rfH_2 id_class(rfH_2 rfH_22, rpr_3 rpr_32, rpr_3 rpr_33, int n, int n2, int n3) {
        if (rpr_32 != rpr_33 && rpr_32 != rpr_33.id_case()) {
            rja_3 rja_32 = new rja_3(rpr_32.id_implements(), rpr_32.id_finally(), rpr_32.id_extends());
            rja_3 rja_33 = new rja_3(rpr_33.id_implements(), rpr_33.id_finally(), rpr_33.id_extends());
            rja_3 rja_34 = rja_32.id_throws(rja_33);
            return rfH_22.id_break(rja_33.b_() * -n2 + rja_34.b_() * n + rja_32.b_() * n3, rja_33.c_() * -n2 + rja_34.c_() * n + rja_32.c_() * n3, rja_33.d_() * -n2 + rja_34.d_() * n + rja_32.d_() * n3);
        }
        throw new IllegalArgumentException("Invalid forwards & up combination");
    }

    private QJ id_class(rfH_2 rfH_22, rpr_3 rpr_32, rpr_3 rpr_33, LoadingCache<rfH_2, ryw_3> loadingCache) {
        for (int i = 0; i < this.id_protected; ++i) {
            for (int j = 0; j < this.id_byte; ++j) {
                for (int k = 0; k < this.id_break; ++k) {
                    if (this.id_class[k][j][i].test((ryw_3)loadingCache.getUnchecked((Object)Qh_1.id_class(rfH_22, rpr_32, rpr_33, i, j, k)))) continue;
                    return null;
                }
            }
        }
        return new QJ(rfH_22, rpr_32, rpr_33, loadingCache, this.id_protected, this.id_byte, this.id_break);
    }

    public int id_class() {
        return this.id_break;
    }

    public int id_break() {
        return this.id_byte;
    }
}

