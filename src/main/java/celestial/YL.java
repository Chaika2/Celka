/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.RZ;
import celestial.Rn_1;
import celestial.YF;
import celestial.an_3;
import celestial.gy_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class YL
implements YF {
    private final Rn_1 id_class;

    public YL(Rn_1 rn_1) {
        this.id_class = rn_1;
    }

    @Override
    public Collection<String> getNames(gy_3 gy_32, Supplier<Collection<String>> supplier) throws CommandSyntaxException {
        List<? extends an_3> list = this.id_class.id_break(gy_32);
        if (list.isEmpty()) {
            throw RZ.id_protected.create();
        }
        ArrayList arrayList = Lists.newArrayList();
        for (an_3 an_32 : list) {
            arrayList.add(an_32.i());
        }
        return arrayList;
    }
}

