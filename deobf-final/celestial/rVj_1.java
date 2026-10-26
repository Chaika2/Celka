package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableObject;

public class rVj_1 {
   final rVg_1 class_;

   public String byte_(String var1, int var2, rgc_3 var3) {
      MutableFloat var4 = new MutableFloat();
      MutableInt var5 = new MutableInt(var1.length());
      rgL_2.break_(var1, var3, (var4x, var5x, var6) -> {
         float var7 = var4.addAndGet(this.class_.getWidth(var6, var5x));
         if (var7 > (float)var2) {
            return false;
         } else {
            var5.setValue(var4x);
            return true;
         }
      });
      return var1.substring(var5.intValue());
   }

   public rVj_1(rVg_1 var1) {
      this.class_ = var1;
   }

   public void class_(rgS_2 var1, int var2, rgc_3 var3, BiConsumer<rgS_2, Boolean> var4) {
      ArrayList var5 = Lists.newArrayList();
      var1.class_((var1x, var2x) -> {
         if (!var2x.isEmpty()) {
            var5.add(new rVK(var2x, var1x));
         }

         return Optional.empty();
      }, var3);
      rVD var6 = new rVD(var5);
      boolean var7 = true;
      boolean var8 = false;
      boolean var9 = false;

      while (var7) {
         var7 = false;
         rVY var10 = new rVY(this, (float)var2);

         for (rVK var12 : var6.class_) {
            boolean var13 = rgL_2.class_(var12.byte_, 0, var12.protected_, var3, var10);
            if (!var13) {
               int var14 = var10.class_();
               rgc_3 var15 = var10.break_();
               char var16 = var6.class_(var14);
               boolean var17 = var16 == '\n';
               boolean var18 = var17 || var16 == ' ';
               var8 = var17;
               rgS_2 var19 = var6.class_(var14, var18 ? 1 : 0, var15);
               var4.accept(var19, var9);
               var9 = !var17;
               var7 = true;
               break;
            }

            var10.class_(var12.byte_.length());
         }
      }

      rgS_2 var20 = var6.class_();
      if (var20 != null) {
         var4.accept(var20, var9);
      } else if (var8) {
         var4.accept(rgS_2.break_, false);
      }
   }

   public float class_(String var1) {
      if (var1 == null) {
         return 0.0F;
      } else {
         MutableFloat var2 = new MutableFloat();
         rgL_2.byte_(var1, rgc_3.class_, (var2x, var3, var4) -> {
            var2.add(this.class_.getWidth(var4, var3));
            return true;
         });
         return var2.floatValue();
      }
   }

   public rgc_3 class_(rgS_2 var1, int var2) {
      rVo_1 var3 = new rVo_1(this, (float)var2);
      return var1.<rgc_3>class_((var1x, var2x) -> rgL_2.byte_(var2x, var1x, var3) ? Optional.empty() : Optional.of(var1x), rgc_3.class_).orElse((rgc_3)null);
   }

   public float class_(rgS_2 var1) {
      MutableFloat var2 = new MutableFloat();
      rgL_2.class_(var1, rgc_3.class_, (var2x, var3, var4) -> {
         var2.add(this.class_.getWidth(var4, var3));
         return true;
      });
      return var2.floatValue();
   }

   public int class_(String var1, int var2, rgc_3 var3) {
      rVo_1 var4 = new rVo_1(this, (float)var2);
      rgL_2.class_(var1, var3, var4);
      return var4.class_();
   }

   public float class_(rpl_3 var1) {
      MutableFloat var2 = new MutableFloat();
      var1.accept((var2x, var3, var4) -> {
         var2.add(this.class_.getWidth(var4, var3));
         return true;
      });
      return var2.floatValue();
   }

   public static int class_(String var0, int var1, int var2, boolean var3) {
      int var4 = var2;
      boolean var5 = var1 < 0;
      int var6 = Math.abs(var1);

      for (int var7 = 0; var7 < var6; var7++) {
         if (var5) {
            while (var3 && var4 > 0 && (var0.charAt(var4 - 1) == ' ' || var0.charAt(var4 - 1) == '\n')) {
               var4--;
            }

            while (var4 > 0 && var0.charAt(var4 - 1) != ' ' && var0.charAt(var4 - 1) != '\n') {
               var4--;
            }
         } else {
            int var8 = var0.length();
            int var9 = var0.indexOf(32, var4);
            int var10 = var0.indexOf(10, var4);
            if (var9 == -1 && var10 == -1) {
               var4 = -1;
            } else if (var9 != -1 && var10 != -1) {
               var4 = Math.min(var9, var10);
            } else if (var9 != -1) {
               var4 = var9;
            } else {
               var4 = var10;
            }

            if (var4 == -1) {
               var4 = var8;
            } else {
               while (var3 && var4 < var8 && (var0.charAt(var4) == ' ' || var0.charAt(var4) == '\n')) {
                  var4++;
               }
            }
         }
      }

      return var4;
   }

   public void class_(String var1, int var2, rgc_3 var3, boolean var4, rVR var5) {
      int var6 = 0;
      int var7 = var1.length();
      rgc_3 var9 = var3;

      while (var6 < var7) {
         rVY var8 = new rVY(this, (float)var2);
         boolean var10 = rgL_2.class_(var1, var6, var9, var3, var8);
         if (var10) {
            var5.accept(var9, var6, var7);
            break;
         }

         int var11 = var8.class_();
         char var12 = var1.charAt(var11);
         int var13 = var12 != '\n' && var12 != ' ' ? var11 : var11 + 1;
         var5.accept(var9, var6, var4 ? var13 : var11);
         var6 = var13;
         var9 = var8.break_();
      }
   }

   public rgS_2 class_(rgS_2 var1, int var2, rgc_3 var3) {
      rVo_1 var4 = new rVo_1(this, (float)var2);
      return var1.class_(new rVV(this, var4), var3).orElse(var1);
   }

   public rgc_3 class_(rpl_3 var1, int var2) {
      rVo_1 var3 = new rVo_1(this, (float)var2);
      MutableObject var4 = new MutableObject();
      var1.accept((var2x, var3x, var4x) -> {
         if (!var3.accept(var2x, var3x, var4x)) {
            var4.setValue(var3x);
            return false;
         } else {
            return true;
         }
      });
      return (rgc_3)var4.getValue();
   }

   public List<rgS_2> break_(rgS_2 var1, int var2, rgc_3 var3) {
      ArrayList var4 = Lists.newArrayList();
      this.class_(var1, var2, var3, (var1x, var2x) -> var4.add(var1x));
      return var4;
   }

   public String break_(String var1, int var2, rgc_3 var3) {
      return var1.substring(0, this.class_(var1, var2, var3));
   }

   public List<rgS_2> protected_(String var1, int var2, rgc_3 var3) {
      ArrayList var4 = Lists.newArrayList();
      this.class_(var1, var2, var3, false, (var2x, var3x, var4x) -> var4.add(rgS_2.class_(var1.substring(var3x, var4x), var2x)));
      return var4;
   }
}
