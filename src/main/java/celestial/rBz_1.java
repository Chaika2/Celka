/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rBK;
import celestial.rBN;
import celestial.rBQ;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rrWO;
import com.google.common.collect.Sets;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rBz_1 {
    private static final Logger id_class = LogManager.getLogger();
    private static final rBK id_break = new rBN(Integer.MAX_VALUE, new rBQ());
    private final Map<rBW, rBK> id_byte = new EnumMap<rBW, rBK>(rBW.class);
    private final Set<rBK> id_protected = Sets.newLinkedHashSet();
    private final EnumSet<rBW> id_throws = EnumSet.noneOf(rBW.class);

    public void id_class(int n, rBk_1 rBk_12) {
        this.id_protected.add(new rBK(n, rBk_12));
    }

    public void id_class(rBW rBW2) {
        this.id_throws.add(rBW2);
    }

    public void id_class(rBW rBW2, boolean bl) {
        if (bl) {
            this.id_break(rBW2);
        } else {
            this.id_class(rBW2);
        }
    }

    public void id_class(rBk_1 rBk_12) {
        this.id_protected.stream().filter(rBK2 -> rBK2.id_finally() == rBk_12).filter(rBK::id_catch).forEach(rBK::id_protected);
        this.id_protected.removeIf(rBK2 -> rBK2.id_finally() == rBk_12);
    }

    private static boolean id_class(rBK rBK2, EnumSet<rBW> enumSet, Map<rBW, rBK> map) {
        if (enumSet.isEmpty()) {
            return true;
        }
        for (rBW rBW2 : enumSet) {
            rBK rBK3 = map.getOrDefault((Object)rBW2, id_break);
            if (rBK3.id_class(rBK2)) continue;
            return false;
        }
        return true;
    }

    public void id_class() {
        if (this.id_protected.size() > 0) {
            for (rBK rBK3 : this.id_protected) {
                if (!rBK3.id_catch() || rBK3.id_catch() && !rrWO.id_break(rBK3.id_implements(), this.id_throws) && rBK3.id_break()) continue;
                rBK3.id_protected();
            }
        }
        if (this.id_byte.size() > 0) {
            this.id_byte.forEach((rBW2, rBK2) -> {
                if (!rBK2.id_catch()) {
                    this.id_byte.remove(rBW2);
                }
            });
        }
        if (this.id_protected.size() > 0) {
            for (rBK rBK3 : this.id_protected) {
                if (rBK3.id_catch() || !rrWO.id_class(rBK3.id_implements(), this.id_throws) || !rBz_1.id_class(rBK3, rBK3.id_implements(), this.id_byte) || !rBK3.id_class()) continue;
                rBz_1.id_break(rBK3, rBK3.id_implements(), this.id_byte);
                rBK3.id_byte();
            }
        }
        if (this.id_protected.size() > 0) {
            for (rBK rBK3 : this.id_protected) {
                if (!rBK3.id_catch()) continue;
                rBK3.id_throws();
            }
        }
    }

    public void id_break(rBW rBW2) {
        this.id_throws.remove((Object)rBW2);
    }

    public Stream<rBK> id_break() {
        return this.id_protected.stream().filter(rBK::id_catch);
    }

    private static void id_break(rBK rBK2, EnumSet<rBW> enumSet, Map<rBW, rBK> map) {
        if (!enumSet.isEmpty()) {
            for (rBW rBW2 : enumSet) {
                rBK rBK3 = map.getOrDefault((Object)rBW2, id_break);
                rBK3.id_protected();
                map.put(rBW2, rBK2);
            }
        }
    }
}

