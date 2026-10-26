package celestial;

public class TY<T extends rhd_3> extends Tf_1<T, wh_3<T>> {
   private final ws_3 id_class = new ws_3();

   public TY(qE_2<T, wh_3<T>> var1) {
      super(var1);
   }

   private void id_class(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, boolean var9) {
      rcd_3 var10 = var9 ? var4.sQ() : var4.sJ();
      aI_2.id_class(var10.id_native("id")).filter(var0 -> var0 == aI_2.X).ifPresent(var11 -> {
         an_3 var12 = rrbb_3.z().id_break;
         if (var4 instanceof cG_2 var13) {
            rOh_1 var14 = var9 ? (rOh_1)var13.id_class[9] : (rOh_1)var13.id_class[10];
            if (var14 != null) {
               rrbb_3.z().id_break = var14;
               if (rrbb_3.rs()) {
                  rrdZ.id_class(var14);
               }
            }
         }

         var1.id_class();
         var1.id_class(var9 ? 0.4F : -0.4F, var4.x() ? -1.3F : -1.5, 0.0);
         Ok_1 var15 = var2.getBuffer(this.id_class.id_class(qF_2.id_class[var10.id_private("Variant")]));
         this.id_class.id_class(var1, var15, var3, fZ_2.id_class, var5, var6, var7, var8, (Integer)var4.id_throws[41]);
         var1.id_break();
         rrbb_3.z().id_break = var12;
         if (rrbb_3.rs()) {
            rrdZ.id_class(var12);
         }
      });
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.id_class(var1, var2, var3, (T)var4, var5, var6, var9, var10, true);
      this.id_class(var1, var2, var3, (T)var4, var5, var6, var9, var10, false);
   }
}
