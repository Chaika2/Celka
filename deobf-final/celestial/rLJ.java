package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

class rLJ implements rLd_1<rLX> {
   public rLX class_(rLz_1<rLX> var1, ruu_3 var2) {
      return new rLX(var1, xd_3.char_.class_(var2.case_()));
   }

   public rLX class_(rLz_1<rLX> var1, StringReader var2) throws CommandSyntaxException {
      var2.expect(' ');
      return new rLX(var1, new Rk_1(var2, false).class_(false).break_());
   }
}
