/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.iI_2;
import celestial.iq_3;
import celestial.it_3;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class iw_3 {
    private final it_3 id_class;
    private final List<iI_2> id_break = Lists.newArrayList();

    public iw_3(it_3 it_32) {
        this.id_class = it_32;
    }

    public it_3 id_class() {
        this.id_break.stream().map(iI_2::id_break).collect(Collectors.toSet()).forEach(this.id_class::id_class);
        this.id_break.forEach(iI_22 -> {
            iq_3 iq_32 = iI_22.id_break();
            this.id_class.id_byte(iq_32).forEach(c_if -> c_if.id_class(iI_22.id_class(), 0.0f));
            this.id_class.id_break(iq_32).id_class(iI_22.id_class(), 1.0f);
        });
        return this.id_class;
    }

    public iw_3 id_class(int n, iq_3 iq_32) {
        this.id_break.add(new iI_2(n, iq_32));
        return this;
    }
}

