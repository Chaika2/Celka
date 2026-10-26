/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.RZ;
import celestial.Rn_1;
import celestial.Rt_1;
import celestial.gy_3;
import celestial.rhN_2;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Rw_1
implements Rt_1 {
    private final Rn_1 id_class;

    public Rw_1(Rn_1 rn_1) {
        this.id_class = rn_1;
    }

    @Override
    public Collection<GameProfile> getNames(gy_3 gy_32) throws CommandSyntaxException {
        List<rhN_2> list = this.id_class.id_protected(gy_32);
        if (list.isEmpty()) {
            throw RZ.id_throws.create();
        }
        ArrayList arrayList = Lists.newArrayList();
        for (rhN_2 rhN_22 : list) {
            arrayList.add(rhN_22.sv());
        }
        return arrayList;
    }
}

