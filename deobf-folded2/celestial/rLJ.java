package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

class rLJ implements rLd_1<rLX> {
   public rLX id_class(rLz_1<rLX> var1, ruu_3 var2) {
      return new rLX(var1, xd_3.id_char.id_class(var2.id_case()));
   }

   public rLX id_class(rLz_1<rLX> var1, StringReader var2) throws CommandSyntaxException {
      var2.expect(' ');
      return new rLX(var1, new Rk_1(var2, false).id_class(false).id_break());
   }
}
