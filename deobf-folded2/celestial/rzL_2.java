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
   static final Logger id_byte = LogManager.getLogger();
   public static final rzL_2 id_class = new rzL_2(rzz_3.id_class, new rzN_2[0], new rNL[0]);
   public static final rzk_3 id_break = rzz_3.id_extends;
   final rzk_3 id_protected;
   final rzN_2[] id_throws;
   final rNL[] id_case;
   private final BiFunction<rdn_3, rzr_3, rdn_3> id_catch;

   rzL_2(rzk_3 var1, rzN_2[] var2, rNL[] var3) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
      this.id_catch = rNl_1.id_class(var3);
   }

   public void id_class(rXu_1 var1, rzr_3 var2) {
      List var3 = this.id_class(var2);
      Random var4 = var2.id_class();
      List var5 = this.id_class(var1, var4);
      this.id_class(var3, var5.size(), var4);

      for (rdn_3 var7 : var3) {
         if (var5.isEmpty()) {
            id_byte.warn("Tried to over-fill a container");
            return;
         }

         if (var7.id_class()) {
            var1.id_break((Integer)var5.remove(var5.size() - 1), rdn_3.id_break);
         } else {
            var1.id_break((Integer)var5.remove(var5.size() - 1), var7);
         }
      }
   }

   private void id_class(List<rdn_3> var1, int var2, Random var3) {
      ArrayList var4 = Lists.newArrayList();
      Iterator var5 = var1.iterator();

      while (var5.hasNext()) {
         rdn_3 var6 = (rdn_3)var5.next();
         if (var6.id_class()) {
            var5.remove();
         } else if (var6.id_char() > 1) {
            var4.add(var6);
            var5.remove();
         }
      }

      while (var2 - var1.size() - var4.size() > 0 && !var4.isEmpty()) {
         rdn_3 var9 = (rdn_3)var4.remove(rfU_2.id_class(var3, 0, var4.size() - 1));
         int var7 = rfU_2.id_class(var3, 1, var9.id_char() / 2);
         rdn_3 var8 = var9.id_class(var7);
         if (var9.id_char() > 1 && var3.nextBoolean()) {
            var4.add(var9);
         } else {
            var1.add(var9);
         }

         if (var8.id_char() > 1 && var3.nextBoolean()) {
            var4.add(var8);
         } else {
            var1.add(var8);
         }
      }

      var1.addAll(var4);
      Collections.shuffle(var1, var3);
   }

   private List<Integer> id_class(rXu_1 var1, Random var2) {
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 < var1.id_else(); var4++) {
         if (var1.id_extends(var4).id_class()) {
            var3.add(var4);
         }
      }

      Collections.shuffle(var3, var2);
      return var3;
   }

   public void id_class(rQs_1 var1) {
      for (int var2 = 0; var2 < this.id_throws.length; var2++) {
         this.id_throws[var2].id_class(var1.id_break(".pools[" + var2 + "]"));
      }

      for (int var3 = 0; var3 < this.id_case.length; var3++) {
         this.id_case[var3].id_class(var1.id_break(".functions[" + var3 + "]"));
      }
   }

   public void id_class(rzr_3 var1, Consumer<rdn_3> var2) {
      if (var1.id_class(this)) {
         Consumer var3 = rNL.id_class(this.id_catch, var2, var1);

         for (rzN_2 var7 : this.id_throws) {
            var7.id_class(var3, var1);
         }

         var1.id_break(this);
      } else {
         id_byte.warn("Detected infinite loop in loot tables");
      }
   }

   public List<rdn_3> id_class(rzr_3 var1) {
      ArrayList var2 = Lists.newArrayList();
      this.id_break(var1, var2::add);
      return var2;
   }

   public rzk_3 id_class() {
      return this.id_protected;
   }

   public static Consumer<rdn_3> id_class(Consumer<rdn_3> var0) {
      return var1 -> {
         if (var1.id_char() < var1.id_byte()) {
            var0.accept(var1);
         } else {
            int var2 = var1.id_char();

            while (var2 > 0) {
               rdn_3 var3 = var1.id_implements();
               var3.id_throws(Math.min(var1.id_byte(), var2));
               var2 -= var3.id_char();
               var0.accept(var3);
            }
         }
      };
   }

   public static rzA_2 id_break() {
      return new rzA_2();
   }

   public void id_break(rzr_3 var1, Consumer<rdn_3> var2) {
      this.id_class(var1, id_class(var2));
   }
}
