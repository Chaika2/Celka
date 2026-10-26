package celestial;

public class rSJ extends rBk_1 {
   private final rhG_2 class_;

   public rSJ(rhG_2 var1) {
      this.class_ = var1;
   }

   private rOD class_(rRh_1 var1) {
      rhG_2 var2 = aI_2.n.class_((rYB)this.class_.throws_[7]);
      var2.class_((rrEm_1)((rYB)this.class_.throws_[7]), var1, iO_2.TRIGGERED, (aU_2)null, (rcd_3)null);
      var2.new_(this.class_.rx(), this.class_.re(), this.class_.BO());
      Integer var7 = 60;
      var2.throws_[47] = var7;
      var2.b();
      var2.else_(true);
      var2.e_(0);
      return var2;
   }

   private rGL class_(rRh_1 var1, rOD var2) {
      rGL var3 = aI_2.A.class_((rYB)var2.throws_[7]);
      var3.class_((rrEm_1)((rYB)var2.throws_[7]), var1, iO_2.TRIGGERED, (aU_2)null, (rcd_3)null);
      var3.new_(var2.rx(), var2.re(), var2.BO());
      Integer var8 = 60;
      var3.throws_[47] = var8;
      var3.b();
      if (var3.class_(rXQ.HEAD).class_()) {
         var3.class_(rXQ.HEAD, new rdn_3(rdy_3.hJ));
      }

      var3.class_(rXQ.MAINHAND, eA_2.class_(var3.Sa(), this.class_(var3.ss()), (int)(5.0F + var1.byte_() * (float)var3.Sa().nextInt(18)), false));
      var3.class_(rXQ.HEAD, eA_2.class_(var3.Sa(), this.class_(var3.class_(rXQ.HEAD)), (int)(5.0F + var1.byte_() * (float)var3.Sa().nextInt(18)), false));
      return var3;
   }

   private rdn_3 class_(rdn_3 var1) {
      var1.byte_("Enchantments");
      return var1;
   }

   @Override
   public boolean class_() {
      return ((rYB)this.class_.throws_[7]).class_(this.class_.rx(), this.class_.re(), this.class_.BO(), 10.0);
   }

   @Override
   public void throws_() {
      rrEm_1 var1 = (rrEm_1)((rYB)this.class_.throws_[7]);
      rRh_1 var2 = var1.throws_(this.class_.Bs());
      this.class_.this_(false);
      this.class_.else_(true);
      this.class_.e_(0);
      rSg_1 var3 = aI_2.boolean_.class_(var1);
      var3.private_(this.class_.rx(), this.class_.re(), this.class_.BO());
      var3.class_(true);
      var1.a_(var3);
      rGL var4 = this.class_(var2, this.class_);
      var4.this_(this.class_);
      var1.class_(var4);

      for (int var5 = 0; var5 < 3; var5++) {
         rOD var6 = this.class_(var2);
         rGL var7 = this.class_(var2, var6);
         var7.this_(var6);
         var6.implements_(this.class_.Sa().nextGaussian() * 0.5, 0.0, this.class_.Sa().nextGaussian() * 0.5);
         var1.class_(var6);
      }
   }
}
