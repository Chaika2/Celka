package celestial;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class rRU implements rRT, rRq_1 {
   protected final int class_;
   protected final int break_;
   protected final roC_2[][] byte_;
   protected boolean protected_;
   protected final rYB throws_;

   @Override
   public rRq_1 byte_(int var1, int var2) {
      return this.class_(var1, var2);
   }

   @Override
   public Stream<rjC_2> byte_(an_3 var1, rfl_3 var2, Predicate<an_3> var3) {
      return this.byte_(var1, var2);
   }

   @Override
   public xc_3 byte_(rfH_2 var1) {
      if (rYB.super_(var1)) {
         return xu_3.class_.continue_();
      } else {
         roC_2 var2 = this.protected_(var1);
         return var2.byte_(var1);
      }
   }

   public rRU(rYB var1, rfH_2 var2, rfH_2 var3) {
      this.throws_ = var1;
      this.class_ = var2.b_() >> 4;
      this.break_ = var2.d_() >> 4;
      int var4 = var3.b_() >> 4;
      int var5 = var3.d_() >> 4;
      this.byte_ = new roC_2[var4 - this.class_ + 1][var5 - this.break_ + 1];
      roX_2 var6 = var1.goto_();
      this.protected_ = true;

      for (int var7 = this.class_; var7 <= var4; var7++) {
         for (int var8 = this.break_; var8 <= var5; var8++) {
            this.byte_[var7 - this.class_][var8 - this.break_] = var6.protected_(var7, var8);
         }
      }

      for (int var10 = var2.b_() >> 4; var10 <= var3.b_() >> 4; var10++) {
         for (int var11 = var2.d_() >> 4; var11 <= var3.d_() >> 4; var11++) {
            roC_2 var9 = this.byte_[var10 - this.class_][var11 - this.break_];
            if (var9 != null && !var9.class_(var2.c_(), var3.c_())) {
               this.protected_ = false;
               return;
            }
         }
      }
   }

   @Override
   public Stream<rjC_2> class_(an_3 var1, rfl_3 var2, Predicate<an_3> var3) {
      return Stream.empty();
   }

   @Override
   public ryO_2 class_(rfH_2 var1) {
      roC_2 var2 = this.protected_(var1);
      return var2.class_(var1);
   }

   private roC_2 class_(int var1, int var2) {
      int var3 = var1 - this.class_;
      int var4 = var2 - this.break_;
      if (var3 >= 0 && var3 < this.byte_.length && var4 >= 0 && var4 < this.byte_[var3].length) {
         roC_2 var5 = this.byte_[var3][var4];
         return (roC_2)(var5 != null ? var5 : new ron_3(this.throws_, new rfj_3(var1, var2)));
      } else {
         return new ron_3(this.throws_, new rfj_3(var1, var2));
      }
   }

   @Override
   public rXE break_(rfH_2 var1) {
      if (rYB.super_(var1)) {
         return rXG.class_.private_();
      } else {
         roC_2 var2 = this.protected_(var1);
         return var2.break_(var1);
      }
   }

   @Override
   public roE_2 instanceof_() {
      return this.throws_.instanceof_();
   }

   private roC_2 protected_(rfH_2 var1) {
      return this.class_(var1.b_() >> 4, var1.d_() >> 4);
   }
}
