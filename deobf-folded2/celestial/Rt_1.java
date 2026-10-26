package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

@FunctionalInterface
public interface Rt_1 {
   Collection<GameProfile> getNames(gy_3 var1) throws CommandSyntaxException;
}
