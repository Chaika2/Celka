package celestial;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

enum rNG {
   rNG(String var3) {
   }

   @Override
   public void class_(rcZ_2 var1, YJ var2, List<rcZ_2> var3) throws CommandSyntaxException {
      var2.break_(var1, ((rcZ_2)Iterables.getLast(var3))::byte_);
   }
}
