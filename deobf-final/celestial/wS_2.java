package celestial;

public class wS_2<T extends rMl_1> extends wk_3<T> {
   private float catch_;
   private float private_;
   private float implements_;

   public wS_2(int var1, float var2) {
      super(var1, var2, true, 23.0F, 4.8F, 2.7F, 3.0F, 49);
      this.return_ = 64;
      this.public_ = 64;
      this.class_ = new Iq_1(this, 0, 6);
      this.class_.class_(-6.5F, -5.0F, -4.0F, 13.0F, 10.0F, 9.0F);
      this.class_.class_(0.0F, 11.5F, -17.0F);
      this.class_.class_(45, 16).class_(-3.5F, 0.0F, -6.0F, 7.0F, 5.0F, 2.0F);
      this.class_.class_(52, 25).class_(-8.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F);
      this.class_.class_(52, 25).class_(3.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F);
      this.break_ = new Iq_1(this, 0, 25);
      this.break_.class_(-9.5F, -13.0F, -6.5F, 19.0F, 26.0F, 13.0F);
      this.break_.class_(0.0F, 10.0F, 0.0F);
      byte var3 = 9;
      byte var4 = 6;
      this.byte_ = new Iq_1(this, 40, 0);
      this.byte_.class_(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.byte_.class_(-5.5F, 15.0F, 9.0F);
      this.protected_ = new Iq_1(this, 40, 0);
      this.protected_.class_(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.protected_.class_(5.5F, 15.0F, 9.0F);
      this.throws_ = new Iq_1(this, 40, 0);
      this.throws_.class_(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.throws_.class_(-5.5F, 15.0F, -9.0F);
      this.case_ = new Iq_1(this, 40, 0);
      this.case_.class_(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.case_.class_(5.5F, 15.0F, -9.0F);
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.class_((T)var1, var2, var3, var4, var5, var6);
      boolean var7 = var1.L() > 0;
      boolean var8 = var1.n();
      int var9 = var1.sc();
      boolean var10 = var1.sd();
      boolean var11 = var1.sl();
      if (var7) {
         this.class_.catch_ = 0.35F * rfU_2.class_(0.6F * var4);
         this.class_.private_ = 0.35F * rfU_2.class_(0.6F * var4);
         this.throws_.case_ = -0.75F * rfU_2.class_(0.3F * var4);
         this.case_.case_ = 0.75F * rfU_2.class_(0.3F * var4);
      } else {
         this.class_.private_ = 0.0F;
      }

      if (var8) {
         if (var9 < 15) {
            this.class_.case_ = (float) (-Math.PI / 4) * (float)var9 / 14.0F;
         } else if (var9 < 20) {
            float var12 = (float)((var9 - 15) / 5);
            this.class_.case_ = (float) (-Math.PI / 4) + (float) (Math.PI / 4) * var12;
         }
      }

      if (this.catch_ > 0.0F) {
         this.break_.case_ = wP_2.class_(this.break_.case_, 1.7407963F, this.catch_);
         this.class_.case_ = wP_2.class_(this.class_.case_, (float) (Math.PI / 2), this.catch_);
         this.throws_.private_ = -0.27079642F;
         this.case_.private_ = 0.27079642F;
         this.byte_.private_ = 0.5707964F;
         this.protected_.private_ = -0.5707964F;
         if (var10) {
            this.class_.case_ = (float) (Math.PI / 2) + 0.2F * rfU_2.class_(var4 * 0.6F);
            this.throws_.case_ = -0.4F - 0.2F * rfU_2.class_(var4 * 0.6F);
            this.case_.case_ = -0.4F - 0.2F * rfU_2.class_(var4 * 0.6F);
         }

         if (var11) {
            this.class_.case_ = 2.1707964F;
            this.throws_.case_ = -0.9F;
            this.case_.case_ = -0.9F;
         }
      } else {
         this.byte_.private_ = 0.0F;
         this.protected_.private_ = 0.0F;
         this.throws_.private_ = 0.0F;
         this.case_.private_ = 0.0F;
      }

      if (this.private_ > 0.0F) {
         this.byte_.case_ = -0.6F * rfU_2.class_(var4 * 0.15F);
         this.protected_.case_ = 0.6F * rfU_2.class_(var4 * 0.15F);
         this.throws_.case_ = 0.3F * rfU_2.class_(var4 * 0.25F);
         this.case_.case_ = -0.3F * rfU_2.class_(var4 * 0.25F);
         this.class_.case_ = wP_2.class_(this.class_.case_, (float) (Math.PI / 2), this.private_);
      }

      if (this.implements_ > 0.0F) {
         this.class_.case_ = wP_2.class_(this.class_.case_, 2.0561945F, this.implements_);
         this.byte_.case_ = -0.5F * rfU_2.class_(var4 * 0.5F);
         this.protected_.case_ = 0.5F * rfU_2.class_(var4 * 0.5F);
         this.throws_.case_ = 0.5F * rfU_2.class_(var4 * 0.5F);
         this.case_.case_ = -0.5F * rfU_2.class_(var4 * 0.5F);
      }
   }

   public void class_(T var1, float var2, float var3, float var4) {
      super.class_((T)var1, var2, var3, var4);
      this.catch_ = var1.throw_(var4);
      this.private_ = var1.interface_(var4);
      this.implements_ = var1.n_() ? 0.0F : var1.char_(var4);
   }
}
