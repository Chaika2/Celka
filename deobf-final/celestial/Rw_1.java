package celestial;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Rw_1 implements Rt_1 {
   private final Rn_1 class_;

   public Rw_1(Rn_1 var1) {
      this.class_ = var1;
   }

   @Override
   public Collection<GameProfile> getNames(gy_3 var1) throws CommandSyntaxException {
      List var2 = this.class_.protected_(var1);
      if (var2.isEmpty()) {
         throw RZ.throws_.create();
      } else {
         ArrayList var3 = Lists.newArrayList();

         for (rhN_2 var5 : var2) {
            var3.add(var5.sv());
         }

         return var3;
      }
   }
}
