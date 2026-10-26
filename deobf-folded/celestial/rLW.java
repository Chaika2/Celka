package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

class rLW implements rLd_1<rLk_1> {
   public rLk_1 id_class(rLz_1<rLk_1> var1, ruu_3 var2) {
      return new rLk_1(var1, var2.id_extends());
   }

   public rLk_1 id_class(rLz_1<rLk_1> var1, StringReader var2) throws CommandSyntaxException {
      var2.expect(' ');
      Ro_1 var3 = new Ro_1(var2, false).id_catch();
      rdn_3 var4 = new RY(var3.id_class(), var3.id_break()).id_class(1, false);
      return new rLk_1(var1, var4);
   }
}
