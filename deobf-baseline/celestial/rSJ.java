package celestial;

public class rSJ extends rBk_1 {
   private final rhG_2 id_class;

   public rSJ(rhG_2 var1) {
      this.id_class = var1;
   }

   private rOD id_class(rRh_1 var1) {
      rhG_2 var2 = aI_2.n.id_class((rYB)this.id_class.id_throws[7]);
      var2.id_class((rrEm_1)((rYB)this.id_class.id_throws[7]), var1, iO_2.TRIGGERED, (aU_2)null, (rcd_3)null);
      var2.id_new(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
      Integer var7 = 60;
      var2.id_throws[47] = var7;
      var2.b();
      var2.id_else(true);
      var2.e_(0);
      return var2;
   }

   private rGL id_class(rRh_1 var1, rOD var2) {
      rGL var3 = aI_2.A.id_class((rYB)var2.id_throws[7]);
      var3.id_class((rrEm_1)((rYB)var2.id_throws[7]), var1, iO_2.TRIGGERED, (aU_2)null, (rcd_3)null);
      var3.id_new(var2.rx(), var2.re(), var2.BO());
      Integer var8 = 60;
      var3.id_throws[47] = var8;
      var3.b();
      if (var3.id_class(rXQ.HEAD).id_class()) {
         var3.id_class(rXQ.HEAD, new rdn_3(rdy_3.hJ));
      }

      var3.id_class(rXQ.MAINHAND, eA_2.id_class(var3.Sa(), this.id_class(var3.ss()), (int)(5.0F + var1.id_byte() * (float)var3.Sa().nextInt(18)), false));
      var3.id_class(
         rXQ.HEAD, eA_2.id_class(var3.Sa(), this.id_class(var3.id_class(rXQ.HEAD)), (int)(5.0F + var1.id_byte() * (float)var3.Sa().nextInt(18)), false)
      );
      return var3;
   }

   private rdn_3 id_class(rdn_3 var1) {
      var1.id_byte("Enchantments");
      return var1;
   }

   @Override
   public boolean id_class() {
      return ((rYB)this.id_class.id_throws[7]).id_class(this.id_class.rx(), this.id_class.re(), this.id_class.BO(), 10.0);
   }

   @Override
   public void id_throws() {
      rrEm_1 var1 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
      rRh_1 var2 = var1.id_throws(this.id_class.Bs());
      this.id_class.id_this(false);
      this.id_class.id_else(true);
      this.id_class.e_(0);
      rSg_1 var3 = aI_2.id_boolean.id_class(var1);
      var3.id_private(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
      var3.id_class(true);
      var1.a_(var3);
      rGL var4 = this.id_class(var2, this.id_class);
      var4.id_this(this.id_class);
      var1.id_class(var4);

      for (int var5 = 0; var5 < 3; var5++) {
         rOD var6 = this.id_class(var2);
         rGL var7 = this.id_class(var2, var6);
         var7.id_this(var6);
         var6.id_implements(this.id_class.Sa().nextGaussian() * 0.5, 0.0, this.id_class.Sa().nextGaussian() * 0.5);
         var1.id_class(var6);
      }
   }
}
