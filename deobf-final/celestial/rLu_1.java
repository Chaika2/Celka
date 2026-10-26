package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

class rLu_1 implements rLd_1<rLc_1> {
   public rLc_1 class_(rLz_1<rLc_1> var1, ruu_3 var2) {
      return new rLc_1(var2.readFloat(), var2.readFloat(), var2.readFloat(), var2.readFloat());
   }

   public rLc_1 class_(rLz_1<rLc_1> var1, StringReader var2) throws CommandSyntaxException {
      var2.expect(' ');
      float var3 = (float)var2.readDouble();
      var2.expect(' ');
      float var4 = (float)var2.readDouble();
      var2.expect(' ');
      float var5 = (float)var2.readDouble();
      var2.expect(' ');
      float var6 = (float)var2.readDouble();
      return new rLc_1(var3, var4, var5, var6);
   }
}
