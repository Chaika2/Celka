/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.rlQ_2;
import celestial.ryw_3;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Predicate;

public interface RX {
    public Predicate<ryw_3> create(rlQ_2 var1) throws CommandSyntaxException;
}

