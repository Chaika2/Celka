package celestial;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Predicate;

public interface RD {
   Predicate<rdn_3> create(CommandContext<gy_3> var1) throws CommandSyntaxException;
}
