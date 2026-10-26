/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.gy_3;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

@FunctionalInterface
public interface Rt_1 {
    public Collection<GameProfile> getNames(gy_3 var1) throws CommandSyntaxException;
}

