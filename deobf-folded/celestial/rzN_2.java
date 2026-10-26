package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;

public class rzN_2 {
   final rzE_2[] id_class;
   final rQz_1[] id_break;
   private final Predicate<rzr_3> id_byte;
   final rNL[] id_protected;
   private final BiFunction<rdn_3, rzr_3, rdn_3> id_throws;
   final rWK id_case;
   final rzV_2 id_catch;

   rzN_2(rzE_2[] var1, rQz_1[] var2, rNL[] var3, rWK var4, rzV_2 var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = rQF.id_class(var2);
      this.id_protected = var3;
      this.id_throws = rNl_1.id_class(var3);
      this.id_case = var4;
      this.id_catch = var5;
   }

   public void id_class(rQs_1 var1) {
      for (int var2 = 0; var2 < this.id_break.length; var2++) {
         this.id_break[var2].id_class(var1.id_break(".condition[" + var2 + "]"));
      }

      for (int var3 = 0; var3 < this.id_protected.length; var3++) {
         this.id_protected[var3].id_class(var1.id_break(".functions[" + var3 + "]"));
      }

      for (int var4 = 0; var4 < this.id_class.length; var4++) {
         this.id_class[var4].id_class(var1.id_break(".entries[" + var4 + "]"));
      }
   }

   public static rzc_3 id_class() {
      return new rzc_3();
   }

   public void id_class(Consumer<rdn_3> var1, rzr_3 var2) {
      if (this.id_byte.test(var2)) {
         Consumer var3 = rNL.id_class(this.id_throws, var1, var2);
         Random var4 = var2.id_class();
         int var5 = this.id_case.id_class(var4) + rfU_2.id_protected(this.id_catch.id_break(var4) * var2.id_break());

         for (int var6 = 0; var6 < var5; var6++) {
            this.id_break(var3, var2);
         }
      }
   }

   private void id_break(Consumer<rdn_3> var1, rzr_3 var2) {
      Random var3 = var2.id_class();
      ArrayList var4 = Lists.newArrayList();
      MutableInt var5 = new MutableInt();

      for (rzE_2 var9 : this.id_class) {
         var9.expand(var2, var3x -> {
            int var4x = var3x.id_class(var2.id_break());
            if (var4x > 0) {
               var4.add(var3x);
               var5.add(var4x);
            }
         });
      }

      int var10 = var4.size();
      if (var5.intValue() != 0 && var10 != 0) {
         if (var10 == 1) {
            ((rWR)var4.get(0)).id_class(var1, var2);
         } else {
            int var11 = var3.nextInt(var5.intValue());

            for (rWR var13 : var4) {
               var11 -= var13.id_class(var2.id_break());
               if (var11 < 0) {
                  var13.id_class(var1, var2);
                  return;
               }
            }
         }
      }
   }
}
