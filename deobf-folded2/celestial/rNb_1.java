package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

enum rNb_1 {
   rNb_1(String var3) {
   }

   @Override
   public void id_class(rcZ_2 var1, YJ var2, List<rcZ_2> var3) throws CommandSyntaxException {
      List var4 = var2.id_class(var1, rcy_3::new);
      var4.forEach(var1x -> {
         if (var1x instanceof rcy_3) {
            var3.forEach(var1xx -> ((rcy_3)var1x).add(var1xx.id_byte()));
         }
      });
   }
}
