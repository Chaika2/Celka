package celestial;

public class TC<T extends iB_2, M extends tp_3<T>> extends Tf_1<T, M> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/elytra.png");
   private final tl_3<T> break_ = new tl_3<>();

   public TC(qE_2<T, M> var1) {
      super(var1);
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      rdn_3 var11 = var4.class_(rXQ.CHEST);
      if (this.class_(var11, (T)var4)) {
         rqO_2 var12;
         if (var4 instanceof cG_2 var13) {
            if (var13.protected_() && var13.volatile_() != null) {
               var12 = var13.volatile_();
            } else if (var13.package_() && var13.super_() && var13.case_() != null && var13.class_(rhQ_2.CAPE)) {
               var12 = var13.case_();
            } else {
               var12 = this.break_(var11, (T)var4);
               if (rrbb_3.rd()) {
                  var12 = rrby_3.class_(var11, var12);
               }
            }
         } else {
            var12 = this.break_(var11, (T)var4);
            if (rrbb_3.rd()) {
               var12 = rrby_3.class_(var11, var12);
            }
         }

         var1.class_();
         var1.class_(0.0, 0.0, 0.125);
         this.byte_().class_(this.break_);
         this.break_.class_((T)var4, var5, var6, var8, var9, var10);
         Ok_1 var14 = Hz_1.class_(var2, HU.class_(var12), false, var11.else_());
         this.break_.class_(var1, var14, var3, fZ_2.class_, 1.0F, 1.0F, 1.0F, 1.0F);
         var1.break_();
      }
   }

   public boolean class_(rdn_3 var1, T var2) {
      return var1.break_() == rdy_3.kc;
   }

   public rqO_2 break_(rdn_3 var1, T var2) {
      return class_;
   }
}
