package celestial;

public class qy_3 extends qc_3<rOf_1, tp_3<rOf_1>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/fish/pufferfish.png");
   private int package_;
   private final wd_3<rOf_1> int_ = new wd_3<>();
   private final wx_3<rOf_1> new_ = new wx_3<>();
   private final wJ_2<rOf_1> continue_ = new wJ_2<>();

   public qy_3(pg_3 var1) {
      super(var1, new wJ_2<>(), 0.2F);
      this.package_ = 3;
   }

   public void class_(rOf_1 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      int var7 = var1.sx();
      if (var7 != this.package_) {
         if (var7 == 0) {
            this.throws_ = this.int_;
         } else if (var7 == 1) {
            this.throws_ = this.new_;
         } else {
            this.throws_ = this.continue_;
         }
      }

      this.package_ = var7;
      this.byte_ = 0.1F + 0.1F * (float)var7;
      super.class_((rOf_1)var1, var2, var3, var4, var5, var6);
   }

   protected void class_(rOf_1 var1, Ml_1 var2, float var3, float var4, float var5) {
      var2.class_(0.0, (double)(rfU_2.break_(var3 * 0.05F) * 0.08F), 0.0);
      super.class_(var1, var2, var3, var4, var5);
   }

   public rqO_2 class_(rOf_1 var1) {
      return class_;
   }
}
