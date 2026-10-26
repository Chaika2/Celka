package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

enum rNM {
   rNM(String var3) {
   }

   @Override
   public void id_class(rcZ_2 var1, YJ var2, List<rcZ_2> var3) throws CommandSyntaxException {
      List var4 = var2.id_class(var1, rcd_3::new);
      var4.forEach(var1x -> {
         if (var1x instanceof rcd_3) {
            var3.forEach(var1xx -> {
               if (var1xx instanceof rcd_3) {
                  ((rcd_3)var1x).id_class((rcd_3)var1xx);
               }
            });
         }
      });
   }
}
