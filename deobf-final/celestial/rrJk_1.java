package celestial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rrJk_1 extends rrJd_1 {
   private String[] class_(int var1, List<String> var2) {
      cm_3 var3 = (cm_3)rrbb_3.X().class_[15];
      ArrayList var4 = new ArrayList();

      for (int var5 = 0; var5 < var2.size(); var5++) {
         String var6 = (String)var2.get(var5);
         if (var6 != null && var6.length() > 0) {
            rgN_2 var7 = new rgN_2(var6);

            for (rgS_2 var9 : var3.break_().break_(var7, var1, rgc_3.class_)) {
               var4.add(var9.getString());
            }
         }
      }

      return var4.toArray(new String[var4.size()]);
   }

   private String[] class_(rrdD var1, int var2) {
      String var3 = var1.volatile_();
      String var4 = rrbb_3.private_(var1.byte_()).trim();
      String[] var5 = this.break_(var4);
      Qw_1 var6 = rrbb_3.rE();
      String var7 = null;
      if (!var3.equals(var1.class_()) && var6.int_) {
         var7 = "§8" + rrba_3.class_("of.general.id") + ": " + var1.class_();
      }

      String var8 = null;
      if (var1.implements_() != null && var6.int_) {
         var8 = "§8" + rrba_3.class_("of.general.from") + ": " + rrbb_3.class_(var1.implements_());
      }

      String var9 = null;
      if (var1.throws_() != null && var6.int_) {
         String var10 = var1.finally_() ? var1.protected_(var1.throws_()) : rrba_3.class_("of.general.ambiguous");
         var9 = "§8" + rrba_3.case_() + ": " + var10;
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

      return this.class_(var2, var11);
   }

   @Override
   public String[] class_(LZ var1, int var2) {
      if (!(var1 instanceof rrkX var3)) {
         return null;
      } else {
         rrdD var4 = var3.private_();
         return this.class_(var4, var2);
      }
   }

   private String[] break_(String var1) {
      if (var1.length() <= 0) {
         return new String[0];
      } else {
         var1 = rrzX_2.protected_(var1, "//");
         String[] var2 = var1.split("\\. ");

         for (int var3 = 0; var3 < var2.length; var3++) {
            var2[var3] = "- " + var2[var3].trim();
            var2[var3] = rrzX_2.throws_(var2[var3], ".");
         }

         return var2;
      }
   }
}
