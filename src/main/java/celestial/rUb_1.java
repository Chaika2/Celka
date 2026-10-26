/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rUG;
import celestial.rfU_2;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class rUb_1
extends CacheLoader<Long, List<rUG>> {
    public /* synthetic */ Object load(Object object) throws Exception {
        return this.id_class((Long)object);
    }

    public List<rUG> id_class(Long l) {
        List list = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        Collections.shuffle(list, new Random(l));
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < 10; ++i) {
            int n = rfU_2.id_byte(42.0 * Math.cos(2.0 * (-Math.PI + 0.3141592653589793 * (double)i)));
            int n2 = rfU_2.id_byte(42.0 * Math.sin(2.0 * (-Math.PI + 0.3141592653589793 * (double)i)));
            int n3 = (Integer)list.get(i);
            int n4 = 2 + n3 / 3;
            int n5 = 76 + n3 * 3;
            boolean bl = n3 == 1 || n3 == 2;
            arrayList.add(new rUG(n, n2, n4, n5, bl));
        }
        return arrayList;
    }
}

