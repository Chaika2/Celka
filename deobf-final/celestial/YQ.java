package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
interface YQ extends YN {
   int apply(int var1, int var2) throws CommandSyntaxException;

   @Override
   default void apply(rAa_1 var1, rAa_1 var2) throws CommandSyntaxException {
      var1.break_(this.apply(var1.break_(), var2.break_()));
   }
}
