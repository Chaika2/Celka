package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rzL_2 {
   static final Logger byte_ = LogManager.getLogger();
   public static final rzL_2 class_ = new rzL_2(rzz_3.class_, new rzN_2[0], new rNL[0]);
   public static final rzk_3 break_ = rzz_3.extends_;
   final rzk_3 protected_;
   final rzN_2[] throws_;
   final rNL[] case_;
   private final BiFunction<rdn_3, rzr_3, rdn_3> catch_;

   rzL_2(rzk_3 var1, rzN_2[] var2, rNL[] var3) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
      this.catch_ = rNl_1.class_(var3);
   }

   public void class_(rXu_1 var1, rzr_3 var2) {
      List var3 = this.class_(var2);
      Random var4 = var2.class_();
      List var5 = this.class_(var1, var4);
      this.class_(var3, var5.size(), var4);

      for (rdn_3 var7 : var3) {
         if (var5.isEmpty()) {
            byte_.warn("Tried to over-fill a container");
            return;
         }

         if (var7.class_()) {
            var1.break_((Integer)var5.remove(var5.size() - 1), rdn_3.break_);
         } else {
            var1.break_((Integer)var5.remove(var5.size() - 1), var7);
         }
      }
   }

   private void class_(List<rdn_3> var1, int var2, Random var3) {
      ArrayList var4 = Lists.newArrayList();
      Iterator var5 = var1.iterator();

      while (var5.hasNext()) {
         rdn_3 var6 = (rdn_3)var5.next();
         if (var6.class_()) {
            var5.remove();
         } else if (var6.char_() > 1) {
            var4.add(var6);
            var5.remove();
         }
      }

      while (var2 - var1.size() - var4.size() > 0 && !var4.isEmpty()) {
         rdn_3 var9 = (rdn_3)var4.remove(rfU_2.class_(var3, 0, var4.size() - 1));
         int var7 = rfU_2.class_(var3, 1, var9.char_() / 2);
         rdn_3 var8 = var9.class_(var7);
         if (var9.char_() > 1 && var3.nextBoolean()) {
            var4.add(var9);
         } else {
            var1.add(var9);
         }

         if (var8.char_() > 1 && var3.nextBoolean()) {
            var4.add(var8);
         } else {
            var1.add(var8);
         }
      }

      var1.addAll(var4);
      Collections.shuffle(var1, var3);
   }

   private List<Integer> class_(rXu_1 var1, Random var2) {
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 < var1.else_(); var4++) {
         if (var1.extends_(var4).class_()) {
            var3.add(var4);
         }
      }

      Collections.shuffle(var3, var2);
      return var3;
   }

   public void class_(rQs_1 var1) {
      for (int var2 = 0; var2 < this.throws_.length; var2++) {
         this.throws_[var2].class_(var1.break_(".pools[" + var2 + "]"));
      }

      for (int var3 = 0; var3 < this.case_.length; var3++) {
         this.case_[var3].class_(var1.break_(".functions[" + var3 + "]"));
      }
   }

   public void class_(rzr_3 var1, Consumer<rdn_3> var2) {
      if (var1.class_(this)) {
         Consumer var3 = rNL.class_(this.catch_, var2, var1);

         for (rzN_2 var7 : this.throws_) {
            var7.class_(var3, var1);
         }

         var1.break_(this);
      } else {
         byte_.warn("Detected infinite loop in loot tables");
      }
   }

   public List<rdn_3> class_(rzr_3 var1) {
      ArrayList var2 = Lists.newArrayList();
      this.break_(var1, var2::add);
      return var2;
   }

   public rzk_3 class_() {
      return this.protected_;
   }

   public static Consumer<rdn_3> class_(Consumer<rdn_3> var0) {
      return var1 -> {
         if (var1.char_() < var1.byte_()) {
            var0.accept(var1);
         } else {
            int var2 = var1.char_();

            while (var2 > 0) {
               rdn_3 var3 = var1.implements_();
               var3.throws_(Math.min(var1.byte_(), var2));
               var2 -= var3.char_();
               var0.accept(var3);
            }
         }
      };
   }

   public static rzA_2 break_() {
      return new rzA_2();
   }

   public void break_(rzr_3 var1, Consumer<rdn_3> var2) {
      this.class_(var1, class_(var2));
   }
}
