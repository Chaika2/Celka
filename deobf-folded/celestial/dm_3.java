package celestial;

public class dm_3 extends dH_2 {
   protected static final rjC_2 id_volatile = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   private void id_byte(xc_3 var1, rYB var2, rfH_2 var3) {
      for (int var4 = 0; var4 < 1000; var4++) {
         rfH_2 var5 = var3.id_break(
            var2.id_int.nextInt(16) - var2.id_int.nextInt(16),
            var2.id_int.nextInt(8) - var2.id_int.nextInt(8),
            var2.id_int.nextInt(16) - var2.id_int.nextInt(16)
         );
         if (var2.id_byte(var5).id_catch()) {
            if (var2.id_continue) {
               for (int var6 = 0; var6 < 128; var6++) {
                  double var7 = var2.id_int.nextDouble();
                  float var9 = (var2.id_int.nextFloat() - 0.5F) * 0.2F;
                  float var10 = (var2.id_int.nextFloat() - 0.5F) * 0.2F;
                  float var11 = (var2.id_int.nextFloat() - 0.5F) * 0.2F;
                  double var12 = rfU_2.id_protected(var7, (double)var5.b_(), (double)var3.b_()) + (var2.id_int.nextDouble() - 0.5) + 0.5;
                  double var14 = rfU_2.id_protected(var7, (double)var5.c_(), (double)var3.c_()) + var2.id_int.nextDouble() - 0.5;
                  double var16 = rfU_2.id_protected(var7, (double)var5.d_(), (double)var3.d_()) + (var2.id_int.nextDouble() - 0.5) + 0.5;
                  var2.id_class(rLQ.id_transient, var12, var14, var16, (double)var9, (double)var10, (double)var11);
               }
            } else {
               var2.id_class(var5, var1, 2);
               var2.id_class(var3, false);
            }

            return;
         }
      }
   }

   public dm_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      this.id_byte(var1, var2, var3);
      return ryZ_2.id_class(var2.id_continue);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      this.id_byte(var1, var2, var3);
   }

   @Override
   protected int id_break() {
      return 5;
   }
}
