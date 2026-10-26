package celestial;

import java.util.Objects;
import java.util.Spliterators.AbstractSpliterator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class rjt_3 extends AbstractSpliterator<rjC_2> {
   private final an_3 id_class;
   private final rfl_3 id_break;
   private final rjm_3 id_byte;
   private final rfR_2 id_protected;
   private final rfw_3 id_throws;
   private final rjC_2 id_case;
   private final rRT id_catch;
   private boolean id_private;
   private final BiPredicate<xc_3, rfH_2> id_implements;

   public rjt_3(rRT var1, an_3 var2, rfl_3 var3) {
      this(var1, var2, var3, (var0, var1x) -> true);
   }

   public rjt_3(rRT var1, an_3 var2, rfl_3 var3, BiPredicate<xc_3, rfH_2> var4) {
      super(Long.MAX_VALUE, 1280);
      this.id_byte = var2 == null ? rjm_3.id_break() : rjm_3.id_class(var2);
      this.id_throws = new rfw_3();
      this.id_case = rjw_3.id_class(var3);
      this.id_catch = var1;
      this.id_private = var2 != null;
      this.id_class = var2;
      this.id_break = var3;
      this.id_implements = var4;
      int var5 = rfU_2.id_byte(var3.id_class - 1.0E-7) - 1;
      int var6 = rfU_2.id_byte(var3.id_protected + 1.0E-7) + 1;
      int var7 = rfU_2.id_byte(var3.id_break - 1.0E-7) - 1;
      int var8 = rfU_2.id_byte(var3.id_throws + 1.0E-7) + 1;
      int var9 = rfU_2.id_byte(var3.id_byte - 1.0E-7) - 1;
      int var10 = rfU_2.id_byte(var3.id_case + 1.0E-7) + 1;
      this.id_protected = new rfR_2(var5, var7, var9, var6, var8, var10);
   }

   private static boolean id_class(rjC_2 var0, rfl_3 var1) {
      return rjw_3.id_byte(var0, rjw_3.id_class(var1.id_class(1.0E-7)), rjN_2.id_implements);
   }

   public static boolean id_class(roE_2 var0, rfl_3 var1) {
      double var2 = (double)rfU_2.id_byte(var0.id_throws());
      double var4 = (double)rfU_2.id_byte(var0.id_case());
      double var6 = (double)rfU_2.id_throws(var0.id_catch());
      double var8 = (double)rfU_2.id_throws(var0.id_private());
      return var1.id_class > var2
         && var1.id_class < var6
         && var1.id_byte > var4
         && var1.id_byte < var8
         && var1.id_protected > var2
         && var1.id_protected < var6
         && var1.id_case > var4
         && var1.id_case < var8;
   }

   private rRq_1 id_class(int var1, int var2) {
      int var3 = var1 >> 4;
      int var4 = var2 >> 4;
      return this.id_catch.id_byte(var3, var4);
   }

   boolean id_class(Consumer<? super rjC_2> var1) {
      while (this.id_protected.id_class()) {
         int var2 = this.id_protected.id_break();
         int var3 = this.id_protected.id_byte();
         int var4 = this.id_protected.id_protected();
         int var5 = this.id_protected.id_throws();
         if (var5 != 3) {
            rRq_1 var6 = this.id_class(var2, var4);
            if (var6 != null) {
               this.id_throws.id_class(var2, var3, var4);
               xc_3 var7 = var6.id_byte(this.id_throws);
               if (this.id_implements.test(var7, this.id_throws) && (var5 != 1 || var7.id_protected()) && (var5 != 2 || var7.id_class(xu_3.rc))) {
                  rjC_2 var8 = var7.id_break(this.id_catch, this.id_throws, this.id_byte);
                  if (var8 == rjw_3.id_break()) {
                     if (this.id_break.id_class((double)var2, (double)var3, (double)var4, (double)var2 + 1.0, (double)var3 + 1.0, (double)var4 + 1.0)) {
                        var1.accept(var8.id_class((double)var2, (double)var3, (double)var4));
                        return true;
                     }
                  } else {
                     rjC_2 var9 = var8.id_class((double)var2, (double)var3, (double)var4);
                     if (rjw_3.id_byte(var9, this.id_case, rjN_2.id_implements)) {
                        var1.accept(var9);
                        return true;
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   boolean id_break(Consumer<? super rjC_2> var1) {
      Objects.requireNonNull(this.id_class);
      this.id_private = false;
      roE_2 var2 = this.id_catch.id_instanceof();
      rfl_3 var3 = this.id_class.rN();
      if (!id_class(var2, var3)) {
         rjC_2 var4 = var2.id_byte();
         if (!id_break(var4, var3) && id_class(var4, var3)) {
            var1.accept(var4);
            return true;
         }
      }

      return false;
   }

   private static boolean id_break(rjC_2 var0, rfl_3 var1) {
      return rjw_3.id_byte(var0, rjw_3.id_class(var1.id_break(1.0E-7)), rjN_2.id_implements);
   }

   @Override
   public boolean tryAdvance(Consumer<? super rjC_2> var1) {
      return this.id_private && this.id_break(var1) || this.id_class(var1);
   }
}
