package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;

public class rzN_2 {
   final rzE_2[] class_;
   final rQz_1[] break_;
   private final Predicate<rzr_3> byte_;
   final rNL[] protected_;
   private final BiFunction<rdn_3, rzr_3, rdn_3> throws_;
   final rWK case_;
   final rzV_2 catch_;

   rzN_2(rzE_2[] var1, rQz_1[] var2, rNL[] var3, rWK var4, rzV_2 var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = rQF.class_(var2);
      this.protected_ = var3;
      this.throws_ = rNl_1.class_(var3);
      this.case_ = var4;
      this.catch_ = var5;
   }

   public void class_(rQs_1 var1) {
      for (int var2 = 0; var2 < this.break_.length; var2++) {
         this.break_[var2].class_(var1.break_(".condition[" + var2 + "]"));
      }

      for (int var3 = 0; var3 < this.protected_.length; var3++) {
         this.protected_[var3].class_(var1.break_(".functions[" + var3 + "]"));
      }

      for (int var4 = 0; var4 < this.class_.length; var4++) {
         this.class_[var4].class_(var1.break_(".entries[" + var4 + "]"));
      }
   }

   public static rzc_3 class_() {
      return new rzc_3();
   }

   public void class_(Consumer<rdn_3> var1, rzr_3 var2) {
      if (this.byte_.test(var2)) {
         Consumer var3 = rNL.class_(this.throws_, var1, var2);
         Random var4 = var2.class_();
         int var5 = this.case_.class_(var4) + rfU_2.protected_(this.catch_.break_(var4) * var2.break_());

         for (int var6 = 0; var6 < var5; var6++) {
            this.break_(var3, var2);
         }
      }
   }

   private void break_(Consumer<rdn_3> var1, rzr_3 var2) {
      Random var3 = var2.class_();
      ArrayList var4 = Lists.newArrayList();
      MutableInt var5 = new MutableInt();

      for (rzE_2 var9 : this.class_) {
         var9.expand(var2, var3x -> {
            int var4x = var3x.class_(var2.break_());
            if (var4x > 0) {
               var4.add(var3x);
               var5.add(var4x);
            }
         });
      }

      int var10 = var4.size();
      if (var5.intValue() != 0 && var10 != 0) {
         if (var10 == 1) {
            ((rWR)var4.get(0)).class_(var1, var2);
         } else {
            int var11 = var3.nextInt(var5.intValue());

            for (rWR var13 : var4) {
               var11 -= var13.class_(var2.break_());
               if (var11 < 0) {
                  var13.class_(var1, var2);
                  return;
               }
            }
         }
      }
   }
}
