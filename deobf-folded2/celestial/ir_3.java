package celestial;

public interface ir_3 {
   default boolean id_class(is_3 var1, av_3 var2, rjU_2 var3) {
      if (!var1.BM()) {
         return false;
      } else if (var1.BP() && var1.G() && (var1.Bh().isEmpty() ? null : var1.Bh().get(0)) instanceof rhd_3 var5) {
         Float var11 = var5.sO();
         var1.id_throws[15] = var11;
         Float var12 = (Float)var1.id_throws[15];
         var1.id_throws[17] = var12;
         Float var13 = var5.Bo() * 0.5F;
         var1.id_throws[16] = var13;
         var1.id_case((Float)var1.id_throws[15], (Float)var1.id_throws[16]);
         Float var14 = (Float)var1.id_throws[15];
         var1.id_private[23] = var14;
         Float var15 = (Float)var1.id_throws[15];
         var1.id_private[25] = var15;
         Float var16 = 1.0F;
         var1.id_throws[37] = var16;
         Float var17 = var1.sB() * 0.1F;
         var1.id_private[29] = var17;
         if (var2.id_class && var2.id_break++ > var2.id_byte) {
            var2.id_class = false;
         }

         if (var1.Po()) {
            float var6 = this.id_throws();
            if (var2.id_class) {
               var6 += var6 * 1.15F * rfU_2.id_class((float)var2.id_break / (float)var2.id_byte * (float) Math.PI);
            }

            var1.id_super(var6);
            this.id_class(new rjU_2(0.0, 0.0, 1.0));
            Integer var18 = 0;
            var1.id_private[45] = var18;
         } else {
            var1.id_class(var1, false);
            var1.id_byte(rjU_2.id_class);
         }

         return true;
      } else {
         Float var19 = 0.5F;
         var1.id_throws[37] = var19;
         Float var20 = 0.02F;
         var1.id_private[29] = var20;
         this.id_class(var3);
         return false;
      }
   }

   void id_class(rjU_2 var1);

   float id_throws();

   boolean id_protected();
}
