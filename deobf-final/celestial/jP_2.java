package celestial;

public class jP_2 extends jW_2<rHA> {
   public static final Ig_1 class_ = new Ig_1(fJ_2.class_, new rqO_2("entity/conduit/base"));
   public static final Ig_1 break_ = new Ig_1(fJ_2.class_, new rqO_2("entity/conduit/cage"));
   public static final Ig_1 byte_ = new Ig_1(fJ_2.class_, new rqO_2("entity/conduit/wind"));
   public static final Ig_1 protected_ = new Ig_1(fJ_2.class_, new rqO_2("entity/conduit/wind_vertical"));
   public static final Ig_1 throws_ = new Ig_1(fJ_2.class_, new rqO_2("entity/conduit/open_eye"));
   public static final Ig_1 case_ = new Ig_1(fJ_2.class_, new rqO_2("entity/conduit/closed_eye"));
   private final Iq_1 private_ = new Iq_1(16, 16, 0, 0);
   private final Iq_1 implements_;
   private final Iq_1 finally_;
   private final Iq_1 extends_;

   public jP_2(jz_3 var1) {
      super(var1);
      this.private_.class_(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, 0.01F);
      this.implements_ = new Iq_1(64, 32, 0, 0);
      this.implements_.class_(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F);
      this.finally_ = new Iq_1(32, 16, 0, 0);
      this.finally_.class_(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F);
      this.extends_ = new Iq_1(32, 16, 0, 0);
      this.extends_.class_(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
   }

   public void class_(rHA var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      float var7 = (float)var1.class_ + var2;
      if (!var1.catch_()) {
         float var8 = var1.class_(0.0F);
         Ok_1 var9 = class_.class_(var4, HU::break_);
         var3.class_();
         var3.class_(0.5, 0.5, 0.5);
         var3.class_(rje_3.protected_.byte_(var8));
         this.finally_.class_(var3, var9, var5, var6);
         var3.break_();
      } else {
         float var16 = var1.class_(var2) * (180.0F / (float)Math.PI);
         float var17 = rfU_2.class_(var7 * 0.1F) / 2.0F + 0.5F;
         var17 = var17 * var17 + var17;
         var3.class_();
         var3.class_(0.5, (double)(0.3F + var17 * 0.2F), 0.5);
         rje_3 var10 = new rje_3(0.5F, 1.0F, 0.5F);
         var10.protected_();
         var3.class_(new rjY_2(var10, var16, true));
         this.extends_.class_(var3, break_.class_(var4, HU::protected_), var5, var6);
         var3.break_();
         int var11 = var1.class_ / 66 % 3;
         var3.class_();
         var3.class_(0.5, 0.5, 0.5);
         if (var11 == 1) {
            var3.class_(rje_3.break_.byte_(90.0F));
         } else if (var11 == 2) {
            var3.class_(rje_3.case_.byte_(90.0F));
         }

         Ok_1 var12 = (var11 == 1 ? protected_ : byte_).class_(var4, HU::protected_);
         this.implements_.class_(var3, var12, var5, var6);
         var3.break_();
         var3.class_();
         var3.class_(0.5, 0.5, 0.5);
         var3.class_(0.875F, 0.875F, 0.875F);
         var3.class_(rje_3.break_.byte_(180.0F));
         var3.class_(rje_3.case_.byte_(180.0F));
         this.implements_.class_(var3, var12, var5, var6);
         var3.break_();
         ly_3 var13 = this.catch_.throws_;
         var3.class_();
         var3.class_(0.5, (double)(0.3F + var17 * 0.2F), 0.5);
         var3.class_(0.5F, 0.5F, 0.5F);
         float var14 = -var13.throws_();
         var3.class_(rje_3.protected_.byte_(var14));
         var3.class_(rje_3.break_.byte_(var13.protected_()));
         var3.class_(rje_3.case_.byte_(180.0F));
         float var15 = 1.3333334F;
         var3.class_(1.3333334F, 1.3333334F, 1.3333334F);
         this.private_.class_(var3, (var1.private_() ? throws_ : case_).class_(var4, HU::protected_), var5, var6);
         var3.break_();
      }
   }
}
