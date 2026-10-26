package celestial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rrJk_1 extends rrJd_1 {
   private String[] id_class(int var1, List<String> var2) {
      cm_3 var3 = (cm_3)rrbb_3.X().id_class[15];
      ArrayList var4 = new ArrayList();

      for (int var5 = 0; var5 < var2.size(); var5++) {
         String var6 = (String)var2.get(var5);
         if (var6 != null && var6.length() > 0) {
            rgN_2 var7 = new rgN_2(var6);

            for (rgS_2 var9 : var3.id_break().id_break(var7, var1, rgc_3.id_class)) {
               var4.add(var9.getString());
            }
         }
      }

      return var4.toArray(new String[var4.size()]);
   }

   private String[] id_class(rrdD var1, int var2) {
      String var3 = var1.id_volatile();
      String var4 = rrbb_3.id_private(var1.id_byte()).trim();
      String[] var5 = this.id_break(var4);
      Qw_1 var6 = rrbb_3.rE();
      String var7 = null;
      if (!var3.equals(var1.id_class()) && var6.id_int) {
         var7 = "§8" + rrba_3.id_class("of.general.id") + ": " + var1.id_class();
      }

      String var8 = null;
      if (var1.id_implements() != null && var6.id_int) {
         var8 = "§8" + rrba_3.id_class("of.general.from") + ": " + rrbb_3.id_class(var1.id_implements());
      }

      String var9 = null;
      if (var1.id_throws() != null && var6.id_int) {
         String var10 = var1.id_finally() ? var1.id_protected(var1.id_throws()) : rrba_3.id_class("of.general.ambiguous");
         var9 = "§8" + rrba_3.id_case() + ": " + var10;
      }

      ArrayList var11 = new ArrayList();
      var11.add(var3);
      var11.addAll(Arrays.asList(var5));
      if (var7 != null) {
         var11.add(var7);
      }

      if (var8 != null) {
         var11.add(var8);
      }

      if (var9 != null) {
         var11.add(var9);
      }

      return this.id_class(var2, var11);
   }

   @Override
   public String[] id_class(LZ var1, int var2) {
      if (!(var1 instanceof rrkX var3)) {
         return null;
      } else {
         rrdD var4 = var3.id_private();
         return this.id_class(var4, var2);
      }
   }

   private String[] id_break(String var1) {
      if (var1.length() <= 0) {
         return new String[0];
      } else {
         var1 = rrzX_2.id_protected(var1, "//");
         String[] var2 = var1.split("\\. ");

         for (int var3 = 0; var3 < var2.length; var3++) {
            var2[var3] = "- " + var2[var3].trim();
            var2[var3] = rrzX_2.id_throws(var2[var3], ".");
         }

         return var2;
      }
   }
}
