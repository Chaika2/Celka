package celestial;

import com.google.common.collect.ImmutableList;

public class tK_2<T extends rsi_3> extends wN_2<T> implements tR_2, tY_2 {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_;
   private final Iq_1 private_;

   @Override
   public Iq_1 byte_() {
      return this.class_;
   }

   public tK_2(float var1, float var2, int var3, int var4) {
      this.class_ = new Iq_1(this).break_(var3, var4);
      this.class_.class_(0.0F, 0.0F + var2, 0.0F);
      this.class_.class_(0, 0).class_(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
      this.break_ = new Iq_1(this, 32, 0).break_(var3, var4);
      this.break_.class_(-4.0F, -10.0F, -4.0F, 8.0F, 12.0F, 8.0F, var1 + 0.45F);
      this.class_.break_(this.break_);
      this.break_.finally_ = false;
      Iq_1 var5 = new Iq_1(this).break_(var3, var4);
      var5.class_(0.0F, var2 - 2.0F, 0.0F);
      var5.class_(24, 0).class_(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
      this.class_.break_(var5);
      this.byte_ = new Iq_1(this).break_(var3, var4);
      this.byte_.class_(0.0F, 0.0F + var2, 0.0F);
      this.byte_.class_(16, 20).class_(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
      this.byte_.class_(0, 38).class_(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.5F);
      this.protected_ = new Iq_1(this).break_(var3, var4);
      this.protected_.class_(0.0F, 0.0F + var2 + 2.0F, 0.0F);
      this.protected_.class_(44, 22).class_(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      Iq_1 var6 = new Iq_1(this, 44, 22).break_(var3, var4);
      var6.implements_ = true;
      var6.class_(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      this.protected_.break_(var6);
      this.protected_.class_(40, 38).class_(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, var1);
      this.throws_ = new Iq_1(this, 0, 22).break_(var3, var4);
      this.throws_.class_(-2.0F, 12.0F + var2, 0.0F);
      this.throws_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.case_ = new Iq_1(this, 0, 22).break_(var3, var4);
      this.case_.implements_ = true;
      this.case_.class_(2.0F, 12.0F + var2, 0.0F);
      this.case_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.catch_ = new Iq_1(this, 40, 46).break_(var3, var4);
      this.catch_.class_(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.catch_.class_(-5.0F, 2.0F + var2, 0.0F);
      this.private_ = new Iq_1(this, 40, 46).break_(var3, var4);
      this.private_.implements_ = true;
      this.private_.class_(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.private_.class_(5.0F, 2.0F + var2, 0.0F);
   }

   @Override
   public void class_(rpZ_2 var1, Ml_1 var2) {
      this.class_(var1).class_(var2);
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.byte_, this.throws_, this.case_, this.protected_, this.catch_, this.private_);
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.class_.case_ = var6 * (float) (Math.PI / 180.0);
      this.protected_.protected_ = 3.0F;
      this.protected_.throws_ = -1.0F;
      this.protected_.case_ = -0.75F;
      if (this.package_) {
         this.catch_.case_ = (float) (-Math.PI / 5);
         this.catch_.catch_ = 0.0F;
         this.catch_.private_ = 0.0F;
         this.private_.case_ = (float) (-Math.PI / 5);
         this.private_.catch_ = 0.0F;
         this.private_.private_ = 0.0F;
         this.throws_.case_ = -1.4137167F;
         this.throws_.catch_ = (float) (Math.PI / 10);
         this.throws_.private_ = 0.07853982F;
         this.case_.case_ = -1.4137167F;
         this.case_.catch_ = (float) (-Math.PI / 10);
         this.case_.private_ = -0.07853982F;
      } else {
         this.catch_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 2.0F * var3 * 0.5F;
         this.catch_.catch_ = 0.0F;
         this.catch_.private_ = 0.0F;
         this.private_.case_ = rfU_2.break_(var2 * 0.6662F) * 2.0F * var3 * 0.5F;
         this.private_.catch_ = 0.0F;
         this.private_.private_ = 0.0F;
         this.throws_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3 * 0.5F;
         this.throws_.catch_ = 0.0F;
         this.throws_.private_ = 0.0F;
         this.case_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 * 0.5F;
         this.case_.catch_ = 0.0F;
         this.case_.private_ = 0.0F;
      }

      rEr_1 var7 = var1.throws_();
      if (var7 == rEr_1.ATTACKING) {
         if (var1.ss().class_()) {
            Iy_1.class_(this.private_, this.catch_, true, this.final_, var4);
         } else {
            Iy_1.class_(this.catch_, this.private_, var1, this.final_, var4);
         }
      } else if (var7 == rEr_1.SPELLCASTING) {
         this.catch_.throws_ = 0.0F;
         this.catch_.byte_ = -5.0F;
         this.private_.throws_ = 0.0F;
         this.private_.byte_ = 5.0F;
         this.catch_.case_ = rfU_2.break_(var4 * 0.6662F) * 0.25F;
         this.private_.case_ = rfU_2.break_(var4 * 0.6662F) * 0.25F;
         this.catch_.private_ = (float) (Math.PI * 3.0 / 4.0);
         this.private_.private_ = (float) (-Math.PI * 3.0 / 4.0);
         this.catch_.catch_ = 0.0F;
         this.private_.catch_ = 0.0F;
      } else if (var7 == rEr_1.BOW_AND_ARROW) {
         this.catch_.catch_ = -0.1F + this.class_.catch_;
         this.catch_.case_ = (float) (-Math.PI / 2) + this.class_.case_;
         this.private_.case_ = -0.9424779F + this.class_.case_;
         this.private_.catch_ = this.class_.catch_ - 0.4F;
         this.private_.private_ = (float) (Math.PI / 2);
      } else if (var7 == rEr_1.CROSSBOW_HOLD) {
         Iy_1.class_(this.catch_, this.private_, this.class_, true);
      } else if (var7 == rEr_1.CROSSBOW_CHARGE) {
         Iy_1.class_(this.catch_, this.private_, var1, true);
      } else if (var7 == rEr_1.CELEBRATING) {
         this.catch_.throws_ = 0.0F;
         this.catch_.byte_ = -5.0F;
         this.catch_.case_ = rfU_2.break_(var4 * 0.6662F) * 0.05F;
         this.catch_.private_ = 2.670354F;
         this.catch_.catch_ = 0.0F;
         this.private_.throws_ = 0.0F;
         this.private_.byte_ = 5.0F;
         this.private_.case_ = rfU_2.break_(var4 * 0.6662F) * 0.05F;
         this.private_.private_ = (float) (-Math.PI * 3.0 / 4.0);
         this.private_.catch_ = 0.0F;
      }

      boolean var8 = var7 == rEr_1.CROSSED;
      this.protected_.finally_ = var8;
      this.private_.finally_ = !var8;
      this.catch_.finally_ = !var8;
   }

   private Iq_1 class_(rpZ_2 var1) {
      return var1 == rpZ_2.LEFT ? this.private_ : this.catch_;
   }

   public Iq_1 break_() {
      return this.break_;
   }
}
