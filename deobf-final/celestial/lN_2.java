package celestial;

public abstract class lN_2 extends CH {
   protected float throw_ = 0.1F * (this.continue_.nextFloat() * 0.5F + 0.5F) * 2.0F;

   protected abstract float byte_();

   protected lN_2(gm_3 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected lN_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
   }

   public float class_(float var1) {
      return this.throw_;
   }

   @Override
   public void class_(Ok_1 var1, ly_3 var2, float var3) {
      rjU_2 var4 = var2.break_();
      float var5 = (float)(rfU_2.protected_((double)var3, this.protected_, this.catch_) - var4.class_());
      float var6 = (float)(rfU_2.protected_((double)var3, this.throws_, this.private_) - var4.break_());
      float var7 = (float)(rfU_2.protected_((double)var3, this.case_, this.implements_) - var4.byte_());
      rjY_2 var8;
      if (this.while_ == 0.0F) {
         var8 = var2.case_();
      } else {
         var8 = new rjY_2(var2.case_());
         float var9 = rfU_2.catch_(var3, this.try_, this.while_);
         var8.class_(rje_3.case_.break_(var9));
      }

      rje_3 var17 = new rje_3(-1.0F, -1.0F, 0.0F);
      var17.class_(var8);
      rje_3[] var10 = new rje_3[]{new rje_3(-1.0F, -1.0F, 0.0F), new rje_3(-1.0F, 1.0F, 0.0F), new rje_3(1.0F, 1.0F, 0.0F), new rje_3(1.0F, -1.0F, 0.0F)};
      float var11 = this.class_(var3);

      for (int var12 = 0; var12 < 4; var12++) {
         rje_3 var13 = var10[var12];
         var13.class_(var8);
         var13.class_(var11);
         var13.byte_(var5, var6, var7);
      }

      float var18 = this.break_();
      float var19 = this.byte_();
      float var14 = this.protected_();
      float var15 = this.throws_();
      int var16 = this.break_(var3);
      var1.class_((double)var10[0].class_(), (double)var10[0].break_(), (double)var10[0].byte_())
         .class_(var19, var15)
         .class_(this.synchronized_, this.return_, this.public_, this.goto_)
         .break_(var16)
         .class_();
      var1.class_((double)var10[1].class_(), (double)var10[1].break_(), (double)var10[1].byte_())
         .class_(var19, var14)
         .class_(this.synchronized_, this.return_, this.public_, this.goto_)
         .break_(var16)
         .class_();
      var1.class_((double)var10[2].class_(), (double)var10[2].break_(), (double)var10[2].byte_())
         .class_(var18, var14)
         .class_(this.synchronized_, this.return_, this.public_, this.goto_)
         .break_(var16)
         .class_();
      var1.class_((double)var10[3].class_(), (double)var10[3].break_(), (double)var10[3].byte_())
         .class_(var18, var15)
         .class_(this.synchronized_, this.return_, this.public_, this.goto_)
         .break_(var16)
         .class_();
   }

   protected abstract float break_();

   protected abstract float throws_();

   protected abstract float protected_();

   @Override
   public CH protected_(float var1) {
      this.throw_ *= var1;
      return super.protected_(var1);
   }
}
