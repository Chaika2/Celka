package celestial;

public class TC<T extends iB_2, M extends tp_3<T>> extends Tf_1<T, M> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/elytra.png");
   private final tl_3<T> id_break = new tl_3<>();

   public TC(qE_2<T, M> var1) {
      super(var1);
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      rdn_3 var11 = var4.id_class(rXQ.CHEST);
      if (this.id_class(var11, (T)var4)) {
         rqO_2 var12;
         if (var4 instanceof cG_2 var13) {
            if (var13.id_protected() && var13.id_volatile() != null) {
               var12 = var13.id_volatile();
            } else if (var13.id_package() && var13.id_super() && var13.id_case() != null && var13.id_class(rhQ_2.CAPE)) {
               var12 = var13.id_case();
            } else {
               var12 = this.id_break(var11, (T)var4);
               if (rrbb_3.rd()) {
                  var12 = rrby_3.id_class(var11, var12);
               }
            }
         } else {
            var12 = this.id_break(var11, (T)var4);
            if (rrbb_3.rd()) {
               var12 = rrby_3.id_class(var11, var12);
            }
         }

         var1.id_class();
         var1.id_class(0.0, 0.0, 0.125);
         this.id_byte().id_class(this.id_break);
         this.id_break.id_class((T)var4, var5, var6, var8, var9, var10);
         Ok_1 var14 = Hz_1.id_class(var2, HU.id_class(var12), false, var11.id_else());
         this.id_break.id_class(var1, var14, var3, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
         var1.id_break();
      }
   }

   public boolean id_class(rdn_3 var1, T var2) {
      return var1.id_break() == rdy_3.kc;
   }

   public rqO_2 id_break(rdn_3 var1, T var2) {
      return id_class;
   }
}
