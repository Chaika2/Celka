/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.YJ;
import celestial.rNE;
import celestial.rcZ_2;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

public final class rNG
extends rNE {
    public rNG(String string2) {
    }

    @Override
    public void id_class(rcZ_2 rcZ_22, YJ yJ, List<rcZ_2> list) throws CommandSyntaxException {
        yJ.id_break(rcZ_22, ((rcZ_2)Iterables.getLast(list))::id_byte);
    }
}

