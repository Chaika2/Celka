package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class YL implements YF {
   private final Rn_1 id_class;

   public YL(Rn_1 var1) {
      this.id_class = var1;
   }

   @Override
   public Collection<String> getNames(gy_3 var1, Supplier<Collection<String>> var2) throws CommandSyntaxException {
      List var3 = this.id_class.id_break(var1);
      if (var3.isEmpty()) {
         throw RZ.id_protected.create();
      } else {
         ArrayList var4 = Lists.newArrayList();

         for (an_3 var6 : var3) {
            var4.add(var6.i());
         }

         return var4;
      }
   }
}
