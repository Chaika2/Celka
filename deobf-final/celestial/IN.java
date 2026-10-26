package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class IN {
   public static final List<String> class_ = Lists.newArrayList(new String[]{"layer0", "layer1", "layer2", "layer3", "layer4"});

   private void class_(Im_1 var1, List<Iu_1> var2, fj_3 var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      boolean var10 = this.class_(var3, var4, var5 + var1.break_(), var6 + var1.byte_(), var7, var8) && var9;
      if (var10) {
         this.class_(var2, var1, var5, var6);
      }
   }

   private void class_(List<Iu_1> var1, Im_1 var2, int var3, int var4) {
      Iu_1 var5 = null;

      for (Iu_1 var7 : var1) {
         if (var7.class_() == var2) {
            int var8 = var2.protected_() ? var4 : var3;
            if (var7.protected_() == var8) {
               var5 = var7;
               break;
            }
         }
      }

      int var9 = var2.protected_() ? var4 : var3;
      int var10 = var2.protected_() ? var3 : var4;
      if (var5 == null) {
         var1.add(new Iu_1(var2, var10, var9));
      } else {
         var5.class_(var10);
      }
   }

   private boolean class_(fj_3 var1, int var2, int var3, int var4, int var5, int var6) {
      return var3 >= 0 && var4 >= 0 && var3 < var5 && var4 < var6 ? var1.class_(var2, var3, var4) : true;
   }

   private List<Iu_1> class_(fj_3 var1) {
      int var2 = var1.protected_();
      int var3 = var1.throws_();
      ArrayList var4 = Lists.newArrayList();

      for (int var5 = 0; var5 < var1.native_(); var5++) {
         for (int var6 = 0; var6 < var3; var6++) {
            for (int var7 = 0; var7 < var2; var7++) {
               boolean var8 = !this.class_(var1, var5, var7, var6, var2, var3);
               this.class_(Im_1.UP, var4, var1, var5, var7, var6, var2, var3, var8);
               this.class_(Im_1.DOWN, var4, var1, var5, var7, var6, var2, var3, var8);
               this.class_(Im_1.LEFT, var4, var1, var5, var7, var6, var2, var3, var8);
               this.class_(Im_1.RIGHT, var4, var1, var5, var7, var6, var2, var3, var8);
            }
         }
      }

      return var4;
   }

   public we_3 class_(Function<Ig_1, fj_3> var1, we_3 var2) {
      HashMap var3 = Maps.newHashMap();
      ArrayList var4 = Lists.newArrayList();

      for (int var5 = 0; var5 < class_.size(); var5++) {
         String var6 = class_.get(var5);
         if (!var2.break_(var6)) {
            break;
         }

         Ig_1 var7 = var2.byte_(var6);
         var3.put(var6, Either.left(var7));
         fj_3 var8 = (fj_3)var1.apply(var7);
         var4.addAll(this.class_(var5, var6, var8));
      }

      var3.put("particle", var2.break_("particle") ? Either.left(var2.byte_("particle")) : (Either)var3.get("layer0"));
      we_3 var9 = new we_3((rqO_2)null, var4, var3, false, var2.byte_(), var2.catch_(), var2.protected_());
      var9.break_ = var2.break_;
      return var9;
   }

   private List<IS> class_(fj_3 var1, String var2, int var3) {
      float var4 = (float)var1.protected_();
      float var5 = (float)var1.throws_();
      ArrayList var6 = Lists.newArrayList();

      for (Iu_1 var8 : this.class_(var1)) {
         float var9 = 0.0F;
         float var10 = 0.0F;
         float var11 = 0.0F;
         float var12 = 0.0F;
         float var13 = 0.0F;
         float var14 = 0.0F;
         float var15 = 0.0F;
         float var16 = 0.0F;
         float var17 = 16.0F / var4;
         float var18 = 16.0F / var5;
         float var19 = (float)var8.break_();
         float var20 = (float)var8.byte_();
         float var21 = (float)var8.protected_();
         Im_1 var22 = var8.class_();
         switch (var22) {
            case UP:
               var13 = var19;
               var9 = var19;
               var11 = var14 = var20 + 1.0F;
               var15 = var21;
               var10 = var21;
               var12 = var21;
               var16 = var21 + 1.0F;
               break;
            case DOWN:
               var15 = var21;
               var16 = var21 + 1.0F;
               var13 = var19;
               var9 = var19;
               var11 = var14 = var20 + 1.0F;
               var10 = var21 + 1.0F;
               var12 = var21 + 1.0F;
               break;
            case LEFT:
               var13 = var21;
               var9 = var21;
               var11 = var21;
               var14 = var21 + 1.0F;
               var16 = var19;
               var10 = var19;
               var12 = var15 = var20 + 1.0F;
               break;
            case RIGHT:
               var13 = var21;
               var14 = var21 + 1.0F;
               var9 = var21 + 1.0F;
               var11 = var21 + 1.0F;
               var16 = var19;
               var10 = var19;
               var12 = var15 = var20 + 1.0F;
         }

         var9 *= var17;
         var11 *= var17;
         var10 *= var18;
         var12 *= var18;
         var10 = 16.0F - var10;
         var12 = 16.0F - var12;
         var13 *= var17;
         var14 *= var17;
         var15 *= var18;
         var16 *= var18;
         HashMap var23 = Maps.newHashMap();
         var23.put(var22.class_(), new IG((rpr_3)null, var3, var2, new wD_2(new float[]{var13, var15, var14, var16}, 0)));
         switch (var22) {
            case UP:
               var6.add(new IS(new rje_3(var9, var10, 7.5F), new rje_3(var11, var10, 8.5F), var23, (IM)null, true));
               break;
            case DOWN:
               var6.add(new IS(new rje_3(var9, var12, 7.5F), new rje_3(var11, var12, 8.5F), var23, (IM)null, true));
               break;
            case LEFT:
               var6.add(new IS(new rje_3(var9, var10, 7.5F), new rje_3(var9, var12, 8.5F), var23, (IM)null, true));
               break;
            case RIGHT:
               var6.add(new IS(new rje_3(var11, var10, 7.5F), new rje_3(var11, var12, 8.5F), var23, (IM)null, true));
         }
      }

      return var6;
   }

   private List<IS> class_(int var1, String var2, fj_3 var3) {
      HashMap var4 = Maps.newHashMap();
      var4.put(rpr_3.SOUTH, new IG((rpr_3)null, var1, var2, new wD_2(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0)));
      var4.put(rpr_3.NORTH, new IG((rpr_3)null, var1, var2, new wD_2(new float[]{16.0F, 0.0F, 0.0F, 16.0F}, 0)));
      ArrayList var5 = Lists.newArrayList();
      var5.add(new IS(new rje_3(0.0F, 0.0F, 7.5F), new rje_3(16.0F, 16.0F, 8.5F), var4, (IM)null, true));
      var5.addAll(this.class_(var3, var2, var1));
      return var5;
   }
}
