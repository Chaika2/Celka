package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

class rLW implements rLd_1<rLk_1> {
   public rLk_1 class_(rLz_1<rLk_1> var1, ruu_3 var2) {
      return new rLk_1(var1, var2.extends_());
   }

   public rLk_1 class_(rLz_1<rLk_1> var1, StringReader var2) throws CommandSyntaxException {
      var2.expect(' ');
      Ro_1 var3 = new Ro_1(var2, false).catch_();
      rdn_3 var4 = new RY(var3.class_(), var3.break_()).class_(1, false);
      return new rLk_1(var1, var4);
   }
}
