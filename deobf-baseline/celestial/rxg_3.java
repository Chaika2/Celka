package celestial;

import java.util.List;

public class rxg_3 extends rdb_3 {
   public rxg_3(rdO_2 var1) {
      super(var1);
   }

   private static rgP_2 id_class(int var0) {
      rxL_2 var1 = rxL_2.id_break(var0);
      return var1 == null ? new rgn_3("item.minecraft.firework_star.custom_color") : new rgn_3("item.minecraft.firework_star." + var1.id_byte());
   }

   private static rgP_2 id_class(rVi_1 var0, int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var2 > 0) {
            var0.id_break(", ");
         }

         var0.id_class(id_class(var1[var2]));
      }

      return var0;
   }

   public static void id_class(rcd_3 var0, List<rgP_2> var1) {
      rxV_2 var2 = rxV_2.id_class(var0.id_case("Type"));
      var1.add(new rgn_3("item.minecraft.firework_star.shape." + var2.id_break()).id_class(rgF_2.GRAY));
      int[] var3 = var0.id_final("Colors");
      if (var3.length > 0) {
         var1.add(id_class(new rgN_2("").id_class(rgF_2.GRAY), var3));
      }

      int[] var4 = var0.id_final("FadeColors");
      if (var4.length > 0) {
         var1.add(id_class(new rgn_3("item.minecraft.firework_star.fade_to").id_break(" ").id_class(rgF_2.GRAY), var4));
      }

      if (var0.id_new("Trail")) {
         var1.add(new rgn_3("item.minecraft.firework_star.trail").id_class(rgF_2.GRAY));
      }

      if (var0.id_new("Flicker")) {
         var1.add(new rgn_3("item.minecraft.firework_star.flicker").id_class(rgF_2.GRAY));
      }
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      rcd_3 var5 = var1.id_break("Explosion");
      if (var5 != null) {
         id_class(var5, var3);
      }
   }
}
