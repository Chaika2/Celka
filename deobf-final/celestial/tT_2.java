package celestial;

import com.google.common.collect.ImmutableList;

public class tT_2<T extends rba_3> extends tX_2<T> {
   public final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_;
   private final Iq_1 private_;
   private final Iq_1 implements_;
   private final Iq_1 finally_;
   private float extends_;

   public tT_2() {
      super(true, 8.0F, 3.35F);
      this.return_ = 48;
      this.public_ = 32;
      this.class_ = new Iq_1(this, 1, 5);
      this.class_.class_(-3.0F, -2.0F, -5.0F, 8.0F, 6.0F, 6.0F);
      this.class_.class_(-1.0F, 16.5F, -3.0F);
      this.break_ = new Iq_1(this, 8, 1);
      this.break_.class_(-3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F);
      this.byte_ = new Iq_1(this, 15, 1);
      this.byte_.class_(3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F);
      this.protected_ = new Iq_1(this, 6, 18);
      this.protected_.class_(-1.0F, 2.01F, -8.0F, 4.0F, 2.0F, 3.0F);
      this.class_.break_(this.break_);
      this.class_.break_(this.byte_);
      this.class_.break_(this.protected_);
      this.throws_ = new Iq_1(this, 24, 15);
      this.throws_.class_(-3.0F, 3.999F, -3.5F, 6.0F, 11.0F, 6.0F);
      this.throws_.class_(0.0F, 16.0F, -6.0F);
      float var1 = 0.001F;
      this.case_ = new Iq_1(this, 13, 24);
      this.case_.class_(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.case_.class_(-5.0F, 17.5F, 7.0F);
      this.catch_ = new Iq_1(this, 4, 24);
      this.catch_.class_(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.catch_.class_(-1.0F, 17.5F, 7.0F);
      this.private_ = new Iq_1(this, 13, 24);
      this.private_.class_(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.private_.class_(-5.0F, 17.5F, 0.0F);
      this.implements_ = new Iq_1(this, 4, 24);
      this.implements_.class_(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.implements_.class_(-1.0F, 17.5F, 0.0F);
      this.finally_ = new Iq_1(this, 30, 0);
      this.finally_.class_(2.0F, 0.0F, -1.0F, 4.0F, 9.0F, 5.0F);
      this.finally_.class_(-4.0F, 15.0F, -1.0F);
      this.throws_.break_(this.finally_);
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      if (!var1.Sc() && !var1.sx() && !var1.x()) {
         this.class_.case_ = var6 * (float) (Math.PI / 180.0);
         this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      }

      if (var1.Sc()) {
         this.class_.case_ = 0.0F;
         this.class_.catch_ = (float) (-Math.PI * 2.0 / 3.0);
         this.class_.private_ = rfU_2.break_(var4 * 0.027F) / 22.0F;
      }

      if (var1.x()) {
         float var7 = rfU_2.break_(var4) * 0.01F;
         this.throws_.catch_ = var7;
         this.case_.private_ = var7;
         this.catch_.private_ = var7;
         this.private_.private_ = var7 / 2.0F;
         this.implements_.private_ = var7 / 2.0F;
      }

      if (var1.sx()) {
         float var8 = 0.1F;
         this.extends_ += 0.67F;
         this.case_.case_ = rfU_2.break_(this.extends_ * 0.4662F) * 0.1F;
         this.catch_.case_ = rfU_2.break_(this.extends_ * 0.4662F + (float) Math.PI) * 0.1F;
         this.private_.case_ = rfU_2.break_(this.extends_ * 0.4662F + (float) Math.PI) * 0.1F;
         this.implements_.case_ = rfU_2.break_(this.extends_ * 0.4662F) * 0.1F;
      }
   }

   @Override
   protected Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_);
   }

   public void class_(T var1, float var2, float var3, float var4) {
      this.throws_.case_ = (float) (Math.PI / 2);
      this.finally_.case_ = -0.05235988F;
      this.case_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3;
      this.catch_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.private_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.implements_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3;
      this.class_.class_(-1.0F, 16.5F, -3.0F);
      this.class_.catch_ = 0.0F;
      this.class_.private_ = var1.throw_(var4);
      this.case_.finally_ = true;
      this.catch_.finally_ = true;
      this.private_.finally_ = true;
      this.implements_.finally_ = true;
      this.throws_.class_(0.0F, 16.0F, -6.0F);
      this.throws_.private_ = 0.0F;
      this.case_.class_(-5.0F, 17.5F, 7.0F);
      this.catch_.class_(-1.0F, 17.5F, 7.0F);
      if (var1.x()) {
         this.throws_.case_ = 1.6755161F;
         float var5 = var1.interface_(var4);
         this.throws_.class_(0.0F, 16.0F + var1.interface_(var4), -6.0F);
         this.class_.class_(-1.0F, 16.5F + var5, -3.0F);
         this.class_.catch_ = 0.0F;
      } else if (var1.Sc()) {
         this.throws_.private_ = (float) (-Math.PI / 2);
         this.throws_.class_(0.0F, 21.0F, -6.0F);
         this.finally_.case_ = (float) (-Math.PI * 5.0 / 6.0);
         if (this.int_) {
            this.finally_.case_ = -2.1816616F;
            this.throws_.class_(0.0F, 21.0F, -2.0F);
         }

         this.class_.class_(1.0F, 19.49F, -3.0F);
         this.class_.case_ = 0.0F;
         this.class_.catch_ = (float) (-Math.PI * 2.0 / 3.0);
         this.class_.private_ = 0.0F;
         this.case_.finally_ = false;
         this.catch_.finally_ = false;
         this.private_.finally_ = false;
         this.implements_.finally_ = false;
      } else if (var1.sJ()) {
         this.throws_.case_ = (float) (Math.PI / 6);
         this.throws_.class_(0.0F, 9.0F, -3.0F);
         this.finally_.case_ = (float) (Math.PI / 4);
         this.finally_.class_(-4.0F, 15.0F, -2.0F);
         this.class_.class_(-1.0F, 10.0F, -0.25F);
         this.class_.case_ = 0.0F;
         this.class_.catch_ = 0.0F;
         if (this.int_) {
            this.class_.class_(-1.0F, 13.0F, -3.75F);
         }

         this.case_.case_ = (float) (-Math.PI * 5.0 / 12.0);
         this.case_.class_(-5.0F, 21.5F, 6.75F);
         this.catch_.case_ = (float) (-Math.PI * 5.0 / 12.0);
         this.catch_.class_(-1.0F, 21.5F, 6.75F);
         this.private_.case_ = (float) (-Math.PI / 12);
         this.implements_.case_ = (float) (-Math.PI / 12);
      }
   }

   @Override
   protected Iterable<Iq_1> break_() {
      return ImmutableList.of(this.throws_, this.case_, this.catch_, this.private_, this.implements_);
   }
}
