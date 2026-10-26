package celestial;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class rRU implements rRT, rRq_1 {
   protected final int id_class;
   protected final int id_break;
   protected final roC_2[][] id_byte;
   protected boolean id_protected;
   protected final rYB id_throws;

   @Override
   public rRq_1 id_byte(int var1, int var2) {
      return this.id_class(var1, var2);
   }

   @Override
   public Stream<rjC_2> id_byte(an_3 var1, rfl_3 var2, Predicate<an_3> var3) {
      return this.id_byte(var1, var2);
   }

   @Override
   public xc_3 id_byte(rfH_2 var1) {
      if (rYB.id_super(var1)) {
         return xu_3.id_class.id_continue();
      } else {
         roC_2 var2 = this.id_protected(var1);
         return var2.id_byte(var1);
      }
   }

   public rRU(rYB var1, rfH_2 var2, rfH_2 var3) {
      this.id_throws = var1;
      this.id_class = var2.b_() >> 4;
      this.id_break = var2.d_() >> 4;
      int var4 = var3.b_() >> 4;
      int var5 = var3.d_() >> 4;
      this.id_byte = new roC_2[var4 - this.id_class + 1][var5 - this.id_break + 1];
      roX_2 var6 = var1.id_goto();
      this.id_protected = true;

      for (int var7 = this.id_class; var7 <= var4; var7++) {
         for (int var8 = this.id_break; var8 <= var5; var8++) {
            this.id_byte[var7 - this.id_class][var8 - this.id_break] = var6.id_protected(var7, var8);
         }
      }

      for (int var10 = var2.b_() >> 4; var10 <= var3.b_() >> 4; var10++) {
         for (int var11 = var2.d_() >> 4; var11 <= var3.d_() >> 4; var11++) {
            roC_2 var9 = this.id_byte[var10 - this.id_class][var11 - this.id_break];
            if (var9 != null && !var9.id_class(var2.c_(), var3.c_())) {
               this.id_protected = false;
               return;
            }
         }
      }
   }

   @Override
   public Stream<rjC_2> id_class(an_3 var1, rfl_3 var2, Predicate<an_3> var3) {
      return Stream.empty();
   }

   @Override
   public ryO_2 id_class(rfH_2 var1) {
      roC_2 var2 = this.id_protected(var1);
      return var2.id_class(var1);
   }

   private roC_2 id_class(int var1, int var2) {
      int var3 = var1 - this.id_class;
      int var4 = var2 - this.id_break;
      if (var3 >= 0 && var3 < this.id_byte.length && var4 >= 0 && var4 < this.id_byte[var3].length) {
         roC_2 var5 = this.id_byte[var3][var4];
         return (roC_2)(var5 != null ? var5 : new ron_3(this.id_throws, new rfj_3(var1, var2)));
      } else {
         return new ron_3(this.id_throws, new rfj_3(var1, var2));
      }
   }

   @Override
   public rXE id_break(rfH_2 var1) {
      if (rYB.id_super(var1)) {
         return rXG.id_class.id_private();
      } else {
         roC_2 var2 = this.id_protected(var1);
         return var2.id_break(var1);
      }
   }

   @Override
   public roE_2 id_instanceof() {
      return this.id_throws.id_instanceof();
   }

   private roC_2 id_protected(rfH_2 var1) {
      return this.id_class(var1.b_() >> 4, var1.d_() >> 4);
   }
}
