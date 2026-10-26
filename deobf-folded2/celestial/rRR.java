package celestial;

import java.util.stream.Stream;

public interface rRR extends rRT, rRp_1, rYn_1 {
   default Stream<xc_3> id_byte(rfl_3 var1) {
      int var2 = rfU_2.id_byte(var1.id_class);
      int var3 = rfU_2.id_byte(var1.id_protected);
      int var4 = rfU_2.id_byte(var1.id_break);
      int var5 = rfU_2.id_byte(var1.id_throws);
      int var6 = rfU_2.id_byte(var1.id_byte);
      int var7 = rfU_2.id_byte(var1.id_case);
      return this.id_class(var2, var4, var6, var3, var5, var7) ? this.id_class(var1) : Stream.empty();
   }

   @Override
   default rRq_1 id_byte(int var1, int var2) {
      return this.id_class(var1, var2, roN_2.id_class, false);
   }

   rYG id_byte(int var1, int var2, int var3);

   @Deprecated
   default boolean id_int(rfH_2 var1) {
      return this.id_break(var1.b_() >> 4, var1.d_() >> 4);
   }

   @Deprecated
   default boolean id_class(rfH_2 var1, rfH_2 var2) {
      return this.id_class(var1.b_(), var1.c_(), var1.d_(), var2.b_(), var2.c_(), var2.d_());
   }

   default rfH_2 id_class(rKv_1 var1, rfH_2 var2) {
      return new rfH_2(var2.b_(), this.id_class(var1, var2.b_(), var2.d_()), var2.d_());
   }

   @Deprecated
   default boolean id_class(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 >= 0 && var2 < 256) {
         var1 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var6 >>= 4;

         for (int var7 = var1; var7 <= var4; var7++) {
            for (int var8 = var3; var8 <= var6; var8++) {
               if (!this.id_break(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   default int id_class(rfH_2 var1, rpr_3 var2) {
      return this.id_byte(var1).id_byte(this, var1, var2);
   }

   default roC_2 id_class(int var1, int var2, roN_2 var3) {
      return this.id_class(var1, var2, var3, true);
   }

   roC_2 id_class(int var1, int var2, roN_2 var3, boolean var4);

   int id_class(rKv_1 var1, int var2, int var3);

   @Override
   default int id_class(rfH_2 var1, rrsC_2 var2) {
      return var2.getColor(this.id_implements(var1), (double)var1.b_(), (double)var1.d_());
   }

   rRJ id_default();

   @Deprecated
   int id_short();

   int id_void();

   @Deprecated
   boolean id_break(int var1, int var2);

   default int id_break(rfH_2 var1, int var2) {
      return var1.b_() >= -30000000 && var1.d_() >= -30000000 && var1.b_() < 30000000 && var1.d_() < 30000000 ? this.id_class(var1, var2) : 15;
   }

   default boolean id_finally(rfH_2 var1) {
      return this.id_byte(var1).id_catch();
   }

   default boolean id_extends(rfH_2 var1) {
      if (var1.c_() >= this.id_short()) {
         return this.id_case(var1);
      } else {
         rfH_2 var2 = new rfH_2(var1.b_(), this.id_short(), var1.d_());
         if (!this.id_case(var2)) {
            return false;
         } else {
            for (rfH_2 var3 = var2.id_break(); var3.c_() > var1.c_(); var3 = var3.id_break()) {
               xc_3 var4 = this.id_byte(var3);
               if (var4.id_break(this, var3) > 0 && !var4.id_byte().id_class()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default rYG id_implements(rfH_2 var1) {
      return this.id_static().id_class(var1);
   }

   boolean id_import();

   default int id_package(rfH_2 var1) {
      return this.id_break(var1, this.id_void());
   }

   rYA id_static();

   @Override
   default rYG id_protected(int var1, int var2, int var3) {
      roC_2 var4 = this.id_class(var1 >> 2, var3 >> 2, roN_2.id_protected, false);
      return var4 != null && var4.id_implements() != null ? var4.id_implements().id_protected(var1, var2, var3) : this.id_byte(var1, var2, var3);
   }

   default roC_2 id_protected(int var1, int var2) {
      return this.id_class(var1, var2, roN_2.id_volatile, true);
   }

   default boolean id_protected(rfl_3 var1) {
      int var2 = rfU_2.id_byte(var1.id_class);
      int var3 = rfU_2.id_throws(var1.id_protected);
      int var4 = rfU_2.id_byte(var1.id_break);
      int var5 = rfU_2.id_throws(var1.id_throws);
      int var6 = rfU_2.id_byte(var1.id_byte);
      int var7 = rfU_2.id_throws(var1.id_case);
      rfw_3 var8 = new rfw_3();

      for (int var9 = var2; var9 < var3; var9++) {
         for (int var10 = var4; var10 < var5; var10++) {
            for (int var11 = var6; var11 < var7; var11++) {
               xc_3 var12 = this.id_byte(var8.id_class(var9, var10, var11));
               if (!var12.id_volatile().id_byte()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default boolean id_final(rfH_2 var1) {
      return this.id_break(var1).id_class(rlG_2.id_break);
   }

   default roC_2 id_volatile(rfH_2 var1) {
      return this.id_protected(var1.b_() >> 4, var1.d_() >> 4);
   }

   @Deprecated
   default float id_native(rfH_2 var1) {
      return this.id_default().id_class(this.id_package(var1));
   }
}
