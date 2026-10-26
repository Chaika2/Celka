package celestial;

public class qo_3<T extends an_3 & ai_3> extends pV_2<T> {
   private final Hz_1 class_;
   private final float throws_;
   private final boolean case_;

   public qo_3(pg_3 var1, Hz_1 var2, float var3, boolean var4) {
      super(var1);
      this.class_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
   }

   public qo_3(pg_3 var1, Hz_1 var2) {
      this(var1, var2, 1.0F, false);
   }

   @Override
   public void class_(T var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      if ((Integer)var1.throws_[41] >= 2 || !(this.break_.break_.catch_().int_(var1) < 12.25)) {
         var4.class_();
         var4.class_(this.throws_, this.throws_, this.throws_);
         var4.class_(this.break_.byte_());
         var4.class_(rje_3.protected_.byte_(180.0F));
         this.class_.class_(((ai_3)var1).class_(), IQ.GROUND, var6, fZ_2.class_, var4, var5);
         var4.break_();
         super.class_((T)var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public rqO_2 class_(an_3 var1) {
      return fJ_2.class_;
   }

   @Override
   protected int class_(T var1, rfH_2 var2) {
      return this.case_ ? 15 : super.class_((T)var1, var2);
   }
}
