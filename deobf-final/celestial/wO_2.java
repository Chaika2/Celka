package celestial;

public class wO_2<T extends is_3> extends wh_3<T> {
   public final Iq_1 native_;
   public final Iq_1 volatile_;
   private final Iq_1 goto_;
   private final Iq_1 while_;
   private final Iq_1 try_;
   private final Iq_1 instanceof_;

   public wO_2(float var1, int var2, int var3) {
      super(var1, false);
      this.return_ = var2;
      this.public_ = var3;
      this.byte_ = new Iq_1(this, 16, 16);
      this.byte_.class_(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.class_ = new Iq_1(this);
      this.class_.class_(0, 0).class_(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, var1);
      this.class_.class_(31, 1).class_(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, var1);
      this.class_.class_(2, 4).class_(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, var1);
      this.class_.class_(2, 0).class_(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, var1);
      this.native_ = new Iq_1(this);
      this.native_.class_(4.5F, -6.0F, 0.0F);
      this.native_.class_(51, 6).class_(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, var1);
      this.class_.break_(this.native_);
      this.volatile_ = new Iq_1(this);
      this.volatile_.class_(-4.5F, -6.0F, 0.0F);
      this.volatile_.class_(39, 6).class_(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, var1);
      this.class_.break_(this.volatile_);
      this.break_ = new Iq_1(this);
      this.goto_ = this.byte_.class_();
      this.while_ = this.class_.class_();
      this.try_ = this.throws_.class_();
      this.instanceof_ = this.throws_.class_();
   }

   private void class_(T var1) {
      if (var1.Z()) {
         this.throws_.case_ = -1.8F;
      } else {
         this.protected_.case_ = -1.8F;
      }
   }

   protected void class_(T var1, float var2) {
      if (this.final_ > 0.0F && var1 instanceof rbk_3 && ((rbk_3)var1).sd() == rbJ_2.ATTACKING_WITH_MELEE_WEAPON) {
         Iy_1.class_(this.protected_, this.throws_, var1, this.final_, var2);
      } else {
         super.class_((T)var1, var2);
      }
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.byte_.class_(this.goto_);
      this.class_.class_(this.while_);
      this.throws_.class_(this.try_);
      this.protected_.class_(this.instanceof_);
      super.class_((T)var1, var2, var3, var4, var5, var6);
      float var7 = (float) (Math.PI / 6);
      float var8 = var4 * 0.1F + var2 * 0.5F;
      float var9 = 0.08F + var3 * 0.4F;
      this.native_.private_ = (float) (-Math.PI / 6) - rfU_2.break_(var8 * 1.2F) * var9;
      this.volatile_.private_ = (float) (Math.PI / 6) + rfU_2.break_(var8) * var9;
      if (var1 instanceof rbM_2 var10) {
         rbJ_2 var11 = var10.sd();
         if (var11 == rbJ_2.DANCING) {
            float var12 = var4 / 60.0F;
            this.volatile_.private_ = (float) (Math.PI / 6) + (float) (Math.PI / 180.0) * rfU_2.class_(var12 * 30.0F) * 10.0F;
            this.native_.private_ = (float) (-Math.PI / 6) - (float) (Math.PI / 180.0) * rfU_2.break_(var12 * 30.0F) * 10.0F;
            this.class_.byte_ = rfU_2.class_(var12 * 10.0F);
            this.class_.protected_ = rfU_2.class_(var12 * 40.0F) + 0.4F;
            this.protected_.private_ = (float) (Math.PI / 180.0) * (70.0F + rfU_2.break_(var12 * 40.0F) * 10.0F);
            this.throws_.private_ = this.protected_.private_ * -1.0F;
            this.protected_.protected_ = rfU_2.class_(var12 * 40.0F) * 0.5F + 1.5F;
            this.throws_.protected_ = rfU_2.class_(var12 * 40.0F) * 0.5F + 1.5F;
            this.byte_.protected_ = rfU_2.class_(var12 * 40.0F) * 0.35F;
         } else if (var11 == rbJ_2.ATTACKING_WITH_MELEE_WEAPON && this.final_ == 0.0F) {
            this.class_((T)var1);
         } else if (var11 == rbJ_2.CROSSBOW_HOLD) {
            Iy_1.class_(this.protected_, this.throws_, this.class_, !var1.Z());
         } else if (var11 == rbJ_2.CROSSBOW_CHARGE) {
            Iy_1.class_(this.protected_, this.throws_, var1, !var1.Z());
         } else if (var11 == rbJ_2.ADMIRING_ITEM) {
            this.class_.case_ = 0.5F;
            this.class_.catch_ = 0.0F;
            if (var1.Z()) {
               this.protected_.catch_ = -0.5F;
               this.protected_.case_ = -0.9F;
            } else {
               this.throws_.catch_ = 0.5F;
               this.throws_.case_ = -0.9F;
            }
         }
      } else if (var1.BC() == aI_2.rb) {
         Iy_1.class_(this.throws_, this.protected_, var1.v(), this.final_, var4);
      }

      this.super_.class_(this.catch_);
      this.this_.class_(this.case_);
      this.new_.class_(this.throws_);
      this.continue_.class_(this.protected_);
      this.else_.class_(this.byte_);
      this.break_.class_(this.class_);
   }
}
