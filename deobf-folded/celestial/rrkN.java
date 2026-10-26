package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrkN implements rrXV {
   private Map<String, rrXt_1> id_class = new HashMap<>();

   @Override
   public rrXt_1 id_byte(String var1) {
      return this.id_class.get(var1);
   }

   public rrkN(Map<String, rrXt_1> var1) {
      this.id_class();

      for (String var3 : var1.keySet()) {
         rrXt_1 var4 = (rrXt_1)var1.get(var3);
         this.id_class(var3, var4);
      }
   }

   public boolean id_class(String var1) {
      return this.id_class.containsKey(var1);
   }

   public boolean id_class(String var1, rrXt_1 var2) {
      if (this.id_class.containsKey(var1)) {
         rrdJ.id_break("Expression already defined: " + var1);
         return false;
      } else {
         this.id_class.put(var1, var2);
         return true;
      }
   }

   private void id_class(Map<String, rrXt_1> var1, rrkm_1 var2) {
      String[] var3 = var2.id_byte();
      if (var3 == null) {
         var1.put(var2.id_class(), new rrkv_1(var2));
      } else {
         for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            String[] var6 = var2.id_protected();
            if (var6 == null) {
               var1.put(var2.id_class() + "." + var5, new rrkv_1(var2, var4));
            } else {
               for (int var7 = 0; var7 < var6.length; var7++) {
                  String var8 = var6[var7];
                  var1.put(var2.id_class() + "." + var5 + "." + var8, new rrkv_1(var2, var4, var7));
               }
            }
         }
      }
   }

   private void id_class() {
      rrkm_1[] var1 = rrkm_1.values();

      for (int var2 = 0; var2 < var1.length; var2++) {
         rrkm_1 var3 = var1[var2];
         this.id_class(this.id_class, var3);
      }

      rrkc_1[] var9 = rrkc_1.values();

      for (int var10 = 0; var10 < var9.length; var10++) {
         rrkc_1 var4 = var9[var10];
         this.id_class.put(var4.id_class(), var4);
      }

      for (rqO_2 var13 : rrWr_1.id_break()) {
         String var5 = var13.id_break().trim();
         var5 = "BIOME_" + var5.toUpperCase().replace(' ', '_');
         int var6 = rrWr_1.id_class(var13);
         rrXv_1 var7 = new rrXv_1((float)var6);
         this.id_class(var5, var7);
      }

      rYh_1[] var12 = rYh_1.values();

      for (int var14 = 0; var14 < var12.length; var14++) {
         rYh_1 var17 = var12[var14];
         String var19 = "CAT_" + var17.id_class().toUpperCase();
         rrXv_1 var21 = new rrXv_1((float)var14);
         this.id_class(var19, var21);
      }

      rYJ[] var15 = rYJ.values();

      for (int var18 = 0; var18 < var15.length; var18++) {
         rYJ var20 = var15[var18];
         String var22 = "PPT_" + var20.id_class().toUpperCase();
         rrXv_1 var8 = new rrXv_1((float)var18);
         this.id_class(var22, var8);
      }
   }
}
