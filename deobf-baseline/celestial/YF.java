package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Supplier;

@FunctionalInterface
public interface YF {
   Collection<String> getNames(gy_3 var1, Supplier<Collection<String>> var2) throws CommandSyntaxException;
}
