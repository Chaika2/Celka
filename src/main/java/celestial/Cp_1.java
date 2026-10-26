/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Ch_1;
import celestial.Cy_1;
import celestial.fj_3;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;

public class Cp_1
implements Ch_1 {
    private List<fj_3> id_class;

    public Cp_1(Cy_1 cy_1) {
    }

    public void id_class(List<fj_3> list) {
        this.id_class = ImmutableList.copyOf(list);
    }

    @Override
    public fj_3 id_class(Random random) {
        return this.id_class.get(random.nextInt(this.id_class.size()));
    }

    @Override
    public fj_3 id_class(int n, int n2) {
        return this.id_class.get(n * (this.id_class.size() - 1) / n2);
    }
}

