package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface Xv_1<T extends Number, R extends Xu_1<T>> {
   R create(StringReader var1, T var2, T var3) throws CommandSyntaxException;
}
