package celestial;

import com.google.common.collect.Lists;
import com.ibm.icu.lang.UCharacter;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.BidiRun;
import java.util.ArrayList;

public class Vg_1 {
   public static rpl_3 id_class(rgS_2 var0, boolean var1) {
      VV var2 = VV.id_class(var0, UCharacter::getMirror, Vg_1::id_class);
      Bidi var3 = new Bidi(var2.id_class(), var1 ? 127 : 126);
      var3.setReorderingMode(0);
      ArrayList var4 = Lists.newArrayList();
      int var5 = var3.countRuns();

      for (int var6 = 0; var6 < var5; var6++) {
         BidiRun var7 = var3.getVisualRun(var6);
         var4.addAll(var2.id_class(var7.getStart(), var7.getLength(), var7.isOddRun()));
      }

      return rpl_3.id_class(var4);
   }

   private static String id_class(String var0) {
      try {
         return new ArabicShaping(8).shape(var0);
      } catch (Exception var2) {
         return var0;
      }
   }
}
