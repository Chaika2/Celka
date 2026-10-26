/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.YJ;
import celestial.rNE;
import celestial.rcZ_2;
import celestial.rcy_3;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

public final class rNb_1
extends rNE {
    public rNb_1(String string2) {
    }

    @Override
    public void id_class(rcZ_2 rcZ_23, YJ yJ, List<rcZ_2> list) throws CommandSyntaxException {
        List<rcZ_2> list2 = yJ.id_class(rcZ_23, rcy_3::new);
        list2.forEach(rcZ_22 -> {
            if (rcZ_22 instanceof rcy_3) {
                list.forEach(rcZ_23 -> ((rcy_3)rcZ_22).add(rcZ_23.id_byte()));
            }
        });
    }
}

