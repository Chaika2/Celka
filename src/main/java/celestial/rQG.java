/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rQE;
import celestial.rQQ;
import celestial.rQz_1;
import com.google.common.collect.Lists;
import java.util.List;

public class rQG
implements rQQ {
    private final List<rQz_1> id_class = Lists.newArrayList();

    public rQG(rQQ ... rQQArray) {
        for (rQQ rQQ2 : rQQArray) {
            this.id_class.add(rQQ2.build());
        }
    }

    @Override
    public rQG id_class(rQQ rQQ2) {
        this.id_class.add(rQQ2.build());
        return this;
    }

    @Override
    public rQz_1 build() {
        return new rQE(this.id_class.toArray(new rQz_1[0]));
    }
}

