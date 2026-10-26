package celestial;

import java.util.stream.Stream;

public interface rRR extends rRT, rRp_1, rYn_1 {
   default Stream<xc_3> byte_(rfl_3 var1) {
      int var2 = rfU_2.byte_(var1.class_);
      int var3 = rfU_2.byte_(var1.protected_);
      int var4 = rfU_2.byte_(var1.break_);
      int var5 = rfU_2.byte_(var1.throws_);
      int var6 = rfU_2.byte_(var1.byte_);
      int var7 = rfU_2.byte_(var1.case_);
      return this.class_(var2, var4, var6, var3, var5, var7) ? this.class_(var1) : Stream.empty();
   }

   @Override
   default rRq_1 byte_(int var1, int var2) {
      return this.class_(var1, var2, roN_2.class_, false);
   }

   rYG byte_(int var1, int var2, int var3);

   @Deprecated
   default boolean int_(rfH_2 var1) {
      return this.break_(var1.b_() >> 4, var1.d_() >> 4);
   }

   @Deprecated
   default boolean class_(rfH_2 var1, rfH_2 var2) {
      return this.class_(var1.b_(), var1.c_(), var1.d_(), var2.b_(), var2.c_(), var2.d_());
   }

   default rfH_2 class_(rKv_1 var1, rfH_2 var2) {
      return new rfH_2(var2.b_(), this.class_(var1, var2.b_(), var2.d_()), var2.d_());
   }

   @Deprecated
   default boolean class_(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 >= 0 && var2 < 256) {
         var1 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var6 >>= 4;

         for (int var7 = var1; var7 <= var4; var7++) {
            for (int var8 = var3; var8 <= var6; var8++) {
               if (!this.break_(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   default int class_(rfH_2 var1, rpr_3 var2) {
      return this.byte_(var1).byte_(this, var1, var2);
   }

   default roC_2 class_(int var1, int var2, roN_2 var3) {
      return this.class_(var1, var2, var3, true);
   }

   roC_2 class_(int var1, int var2, roN_2 var3, boolean var4);

   int class_(rKv_1 var1, int var2, int var3);

   @Override
   default int class_(rfH_2 var1, rrsC_2 var2) {
      return var2.getColor(this.implements_(var1), (double)var1.b_(), (double)var1.d_());
   }

   rRJ default_();

   @Deprecated
   int short_();

   int void_();

   @Deprecated
   boolean break_(int var1, int var2);

   default int break_(rfH_2 var1, int var2) {
      return var1.b_() >= -30000000 && var1.d_() >= -30000000 && var1.b_() < 30000000 && var1.d_() < 30000000 ? this.class_(var1, var2) : 15;
   }

   default boolean finally_(rfH_2 var1) {
      return this.byte_(var1).catch_();
   }

   default boolean extends_(rfH_2 var1) {
      if (var1.c_() >= this.short_()) {
         return this.case_(var1);
      } else {
         rfH_2 var2 = new rfH_2(var1.b_(), this.short_(), var1.d_());
         if (!this.case_(var2)) {
            return false;
         } else {
            for (rfH_2 var3 = var2.break_(); var3.c_() > var1.c_(); var3 = var3.break_()) {
               xc_3 var4 = this.byte_(var3);
               if (var4.break_(this, var3) > 0 && !var4.byte_().class_()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default rYG implements_(rfH_2 var1) {
      return this.static_().class_(var1);
   }

   boolean import_();

   default int package_(rfH_2 var1) {
      return this.break_(var1, this.void_());
   }

   rYA static_();

   @Override
   default rYG protected_(int var1, int var2, int var3) {
      roC_2 var4 = this.class_(var1 >> 2, var3 >> 2, roN_2.protected_, false);
      return var4 != null && var4.implements_() != null ? var4.implements_().protected_(var1, var2, var3) : this.byte_(var1, var2, var3);
   }

   default roC_2 protected_(int var1, int var2) {
      return this.class_(var1, var2, roN_2.volatile_, true);
   }

   default boolean protected_(rfl_3 var1) {
      int var2 = rfU_2.byte_(var1.class_);
      int var3 = rfU_2.throws_(var1.protected_);
      int var4 = rfU_2.byte_(var1.break_);
      int var5 = rfU_2.throws_(var1.throws_);
      int var6 = rfU_2.byte_(var1.byte_);
      int var7 = rfU_2.throws_(var1.case_);
      rfw_3 var8 = new rfw_3();

      for (int var9 = var2; var9 < var3; var9++) {
         for (int var10 = var4; var10 < var5; var10++) {
            for (int var11 = var6; var11 < var7; var11++) {
               xc_3 var12 = this.byte_(var8.class_(var9, var10, var11));
               if (!var12.volatile_().byte_()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default boolean final_(rfH_2 var1) {
      return this.break_(var1).class_(rlG_2.break_);
   }

   default roC_2 volatile_(rfH_2 var1) {
      return this.protected_(var1.b_() >> 4, var1.d_() >> 4);
   }

   @Deprecated
   default float native_(rfH_2 var1) {
      return this.default_().class_(this.package_(var1));
   }
}
