package celestial;

import java.util.List;

public class rxg_3 extends rdb_3 {
   public rxg_3(rdO_2 var1) {
      super(var1);
   }

   private static rgP_2 class_(int var0) {
      rxL_2 var1 = rxL_2.break_(var0);
      return var1 == null ? new rgn_3("item.minecraft.firework_star.custom_color") : new rgn_3("item.minecraft.firework_star." + var1.byte_());
   }

   private static rgP_2 class_(rVi_1 var0, int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var2 > 0) {
            var0.break_(", ");
         }

         var0.class_(class_(var1[var2]));
      }

      return var0;
   }

   public static void class_(rcd_3 var0, List<rgP_2> var1) {
      rxV_2 var2 = rxV_2.class_(var0.case_("Type"));
      var1.add(new rgn_3("item.minecraft.firework_star.shape." + var2.break_()).class_(rgF_2.GRAY));
      int[] var3 = var0.final_("Colors");
      if (var3.length > 0) {
         var1.add(class_(new rgN_2("").class_(rgF_2.GRAY), var3));
      }

      int[] var4 = var0.final_("FadeColors");
      if (var4.length > 0) {
         var1.add(class_(new rgn_3("item.minecraft.firework_star.fade_to").break_(" ").class_(rgF_2.GRAY), var4));
      }

      if (var0.new_("Trail")) {
         var1.add(new rgn_3("item.minecraft.firework_star.trail").class_(rgF_2.GRAY));
      }

      if (var0.new_("Flicker")) {
         var1.add(new rgn_3("item.minecraft.firework_star.flicker").class_(rgF_2.GRAY));
      }
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      rcd_3 var5 = var1.break_("Explosion");
      if (var5 != null) {
         class_(var5, var3);
      }
   }
}
