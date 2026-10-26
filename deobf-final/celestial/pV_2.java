package celestial;

public abstract class pV_2<T extends an_3> implements rrMa_1 {
   protected final pg_3 break_;
   public float byte_;
   protected float protected_ = 1.0F;
   private aI_2 class_ = null;
   private rqO_2 throws_ = null;

   @Override
   public rrWQ<aI_2, ryW_2> byte_() {
      return this.class_ == null ? null : rrWQ.class_(this.class_);
   }

   protected pV_2(pg_3 var1) {
      this.break_ = var1;
   }

   public void class_(T var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      if (this.break_((T)var1) && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().double_().class_(var1)) {
         this.class_((T)var1, var1.L_(), var4, var5, var6);
      }
   }

   public abstract rqO_2 class_(T var1);

   protected void class_(T var1, rgP_2 var2, Ml_1 var3, Hx_1 var4, int var5) {
      double var6 = this.break_.break_(var1);
      boolean var8 = !(var6 > 4096.0);
      if (var8) {
         boolean var9 = !var1.Pw();
         float var10 = var1.Bm() + 0.5F;
         var3.class_();
         var3.class_(0.0, (double)var10, 0.0);
         var3.class_(this.break_.byte_());
         var3.class_(-0.025F, -0.025F, 0.025F);
         rjV_2 var11 = var3.byte_().class_();
         cm_3 var12 = this.H_();
         float var13 = (float)(-var12.class_(var2) / 2);
         float var14 = ((Qw_1)QY.instanceof_().class_[20]).class_(0.25F);
         int var15 = (int)(var14 * 255.0F) << 24;
         var12.class_(var2, var13, 0.0F, 553648127, false, var11, var4, var9, var15, var5);
         if (var9) {
            var12.class_(var2, var13, 0.0F, -1, false, var11, var4, false, 0, var5);
         }

         var3.break_();
      }
   }

   @Override
   public void class_(rqO_2 var1) {
      this.throws_ = var1;
   }

   @Override
   public void class_(rrWQ<aI_2, ryW_2> var1) {
      this.class_ = (aI_2)var1.class_().get();
   }

   public boolean class_(T var1, yt_3 var2, double var3, double var5, double var7) {
      if ((Boolean)var1.throws_[56]) {
         return true;
      } else if (!var1.final_(var3, var5, var7)) {
         return false;
      } else {
         rfl_3 var9 = var1.PE().class_(0.5);
         if (var9.throws_() || var9.class_() == 0.0) {
            var9 = new rfl_3(var1.rx() - 2.0, var1.re() - 2.0, var1.BO() - 2.0, var1.rx() + 2.0, var1.re() + 2.0, var1.BO() + 2.0);
         }

         return var2.class_(var9);
      }
   }

   public rjU_2 class_(T var1, float var2) {
      return rjU_2.class_;
   }

   protected int class_(T var1, rfH_2 var2) {
      return var1.Pz() ? 15 : ((rYB)var1.throws_[7]).class_(rRo_1.BLOCK, var2);
   }

   public final int break_(T var1, float var2) {
      rfH_2 var3 = new rfH_2(var1.volatile_(var2));
      return HQ.class_(this.class_((T)var1, var3), this.break_((T)var1, var3));
   }

   protected int break_(T var1, rfH_2 var2) {
      return ((rYB)var1.throws_[7]).class_(rRo_1.SKY, var2);
   }

   protected boolean break_(T var1) {
      return var1.rJ() && var1.Bk();
   }

   public pg_3 break_() {
      return this.break_;
   }

   @Override
   public rqO_2 protected_() {
      return this.throws_;
   }

   public cm_3 H_() {
      return this.break_.protected_();
   }
}
