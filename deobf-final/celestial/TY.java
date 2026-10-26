package celestial;

public class TY<T extends rhd_3> extends Tf_1<T, wh_3<T>> {
   private final ws_3 class_ = new ws_3();

   public TY(qE_2<T, wh_3<T>> var1) {
      super(var1);
   }

   private void class_(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, boolean var9) {
      rcd_3 var10 = var9 ? var4.sQ() : var4.sJ();
      aI_2.class_(var10.native_("id")).filter(var0 -> var0 == aI_2.X).ifPresent(var11 -> {
         an_3 var12 = rrbb_3.z().break_;
         if (var4 instanceof cG_2 var13) {
            rOh_1 var14 = var9 ? (rOh_1)var13.class_[9] : (rOh_1)var13.class_[10];
            if (var14 != null) {
               rrbb_3.z().break_ = var14;
               if (rrbb_3.rs()) {
                  rrdZ.class_(var14);
               }
            }
         }

         var1.class_();
         var1.class_(var9 ? 0.4F : -0.4F, var4.x() ? -1.3F : -1.5, 0.0);
         Ok_1 var15 = var2.getBuffer(this.class_.class_(qF_2.class_[var10.private_("Variant")]));
         this.class_.class_(var1, var15, var3, fZ_2.class_, var5, var6, var7, var8, (Integer)var4.throws_[41]);
         var1.break_();
         rrbb_3.z().break_ = var12;
         if (rrbb_3.rs()) {
            rrdZ.class_(var12);
         }
      });
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.class_(var1, var2, var3, (T)var4, var5, var6, var9, var10, true);
      this.class_(var1, var2, var3, (T)var4, var5, var6, var9, var10, false);
   }
}
