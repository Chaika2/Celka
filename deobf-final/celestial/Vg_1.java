package celestial;

import com.google.common.collect.Lists;
import com.ibm.icu.lang.UCharacter;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.BidiRun;
import java.util.ArrayList;

public class Vg_1 {
   public static rpl_3 class_(rgS_2 var0, boolean var1) {
      VV var2 = VV.class_(var0, UCharacter::getMirror, Vg_1::class_);
      Bidi var3 = new Bidi(var2.class_(), var1 ? 127 : 126);
      var3.setReorderingMode(0);
      ArrayList var4 = Lists.newArrayList();
      int var5 = var3.countRuns();

      for (int var6 = 0; var6 < var5; var6++) {
         BidiRun var7 = var3.getVisualRun(var6);
         var4.addAll(var2.class_(var7.getStart(), var7.getLength(), var7.isOddRun()));
      }

      return rpl_3.class_(var4);
   }

   private static String class_(String var0) {
      try {
         return new ArabicShaping(8).shape(var0);
      } catch (Exception var2) {
         return var0;
      }
   }
}
