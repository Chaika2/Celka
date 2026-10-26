package celestial;

import com.google.common.collect.ImmutableList;

public class ws_3 extends wN_2<rMR> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_;
   private final Iq_1 private_;
   private final Iq_1 implements_;
   private final Iq_1 finally_;
   private final Iq_1 extends_;

   public ws_3() {
      this.return_ = 32;
      this.public_ = 32;
      this.class_ = new Iq_1(this, 2, 8);
      this.class_.class_(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F);
      this.class_.class_(0.0F, 16.5F, -3.0F);
      this.break_ = new Iq_1(this, 22, 1);
      this.break_.class_(-1.5F, -1.0F, -1.0F, 3.0F, 4.0F, 1.0F);
      this.break_.class_(0.0F, 21.07F, 1.16F);
      this.byte_ = new Iq_1(this, 19, 8);
      this.byte_.class_(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F);
      this.byte_.class_(1.5F, 16.94F, -2.76F);
      this.protected_ = new Iq_1(this, 19, 8);
      this.protected_.class_(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F);
      this.protected_.class_(-1.5F, 16.94F, -2.76F);
      this.throws_ = new Iq_1(this, 2, 2);
      this.throws_.class_(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F);
      this.throws_.class_(0.0F, 15.69F, -2.76F);
      this.case_ = new Iq_1(this, 10, 0);
      this.case_.class_(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F);
      this.case_.class_(0.0F, -2.0F, -1.0F);
      this.throws_.break_(this.case_);
      this.catch_ = new Iq_1(this, 11, 7);
      this.catch_.class_(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.catch_.class_(0.0F, -0.5F, -1.5F);
      this.throws_.break_(this.catch_);
      this.private_ = new Iq_1(this, 16, 7);
      this.private_.class_(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.private_.class_(0.0F, -1.75F, -2.45F);
      this.throws_.break_(this.private_);
      this.implements_ = new Iq_1(this, 2, 18);
      this.implements_.class_(0.0F, -4.0F, -2.0F, 0.0F, 5.0F, 4.0F);
      this.implements_.class_(0.0F, -2.15F, 0.15F);
      this.throws_.break_(this.implements_);
      this.finally_ = new Iq_1(this, 14, 18);
      this.finally_.class_(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.finally_.class_(1.0F, 22.0F, -1.05F);
      this.extends_ = new Iq_1(this, 14, 18);
      this.extends_.class_(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.extends_.class_(-1.0F, 22.0F, -1.05F);
   }

   private static wG_2 class_(rMR var0) {
      if (var0.n()) {
         return wG_2.PARTY;
      } else if (var0.Sc()) {
         return wG_2.SITTING;
      } else {
         return var0.sx() ? wG_2.FLYING : wG_2.STANDING;
      }
   }

   private void class_(wG_2 var1) {
      this.implements_.case_ = -0.2214F;
      this.class_.case_ = 0.4937F;
      this.byte_.case_ = (float) -Math.PI * 2.0F / 9.0F;
      this.byte_.catch_ = (float) -Math.PI;
      this.protected_.case_ = (float) -Math.PI * 2.0F / 9.0F;
      this.protected_.catch_ = (float) -Math.PI;
      this.finally_.case_ = -0.0299F;
      this.extends_.case_ = -0.0299F;
      this.finally_.protected_ = 22.0F;
      this.extends_.protected_ = 22.0F;
      this.finally_.private_ = 0.0F;
      this.extends_.private_ = 0.0F;
      switch (var1) {
         case SITTING:
            float var2 = 1.9F;
            this.throws_.protected_ = 17.59F;
            this.break_.case_ = 1.5388988F;
            this.break_.protected_ = 22.97F;
            this.class_.protected_ = 18.4F;
            this.byte_.private_ = -0.0873F;
            this.byte_.protected_ = 18.84F;
            this.protected_.private_ = 0.0873F;
            this.protected_.protected_ = 18.84F;
            this.finally_.protected_++;
            this.extends_.protected_++;
            this.finally_.case_++;
            this.extends_.case_++;
            break;
         case PARTY:
            this.finally_.private_ = (float) (-Math.PI / 9);
            this.extends_.private_ = (float) (Math.PI / 9);
         case STANDING:
         case ON_SHOULDER:
         default:
            break;
         case FLYING:
            this.finally_.case_ += (float) Math.PI * 2.0F / 9.0F;
            this.extends_.case_ += (float) Math.PI * 2.0F / 9.0F;
      }
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.byte_, this.protected_, this.break_, this.throws_, this.finally_, this.extends_);
   }

   public void class_(rMR var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_(class_(var1), (Integer)var1.throws_[41], var2, var3, var4, var5, var6);
   }

   public void class_(rMR var1, float var2, float var3, float var4) {
      this.class_(class_(var1));
   }

   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9) {
      this.class_(wG_2.ON_SHOULDER);
      this.class_(wG_2.ON_SHOULDER, var9, var5, var6, 0.0F, var7, var8);
      this.class_().forEach(var4x -> var4x.class_(var1, var2, var3, var4));
   }

   private void class_(wG_2 var1, int var2, float var3, float var4, float var5, float var6, float var7) {
      this.throws_.case_ = var7 * (float) (Math.PI / 180.0);
      this.throws_.catch_ = var6 * (float) (Math.PI / 180.0);
      this.throws_.private_ = 0.0F;
      this.throws_.byte_ = 0.0F;
      this.class_.byte_ = 0.0F;
      this.break_.byte_ = 0.0F;
      this.protected_.byte_ = -1.5F;
      this.byte_.byte_ = 1.5F;
      switch (var1) {
         case SITTING:
            break;
         case PARTY:
            float var8 = rfU_2.break_((float)var2);
            float var9 = rfU_2.class_((float)var2);
            this.throws_.byte_ = var8;
            this.throws_.protected_ = 15.69F + var9;
            this.throws_.case_ = 0.0F;
            this.throws_.catch_ = 0.0F;
            this.throws_.private_ = rfU_2.class_((float)var2) * 0.4F;
            this.class_.byte_ = var8;
            this.class_.protected_ = 16.5F + var9;
            this.byte_.private_ = -0.0873F - var5;
            this.byte_.byte_ = 1.5F + var8;
            this.byte_.protected_ = 16.94F + var9;
            this.protected_.private_ = 0.0873F + var5;
            this.protected_.byte_ = -1.5F + var8;
            this.protected_.protected_ = 16.94F + var9;
            this.break_.byte_ = var8;
            this.break_.protected_ = 21.07F + var9;
            break;
         case STANDING:
            this.finally_.case_ = this.finally_.case_ + rfU_2.break_(var3 * 0.6662F) * 1.4F * var4;
            this.extends_.case_ = this.extends_.case_ + rfU_2.break_(var3 * 0.6662F + (float) Math.PI) * 1.4F * var4;
         case FLYING:
         case ON_SHOULDER:
         default:
            float var10 = var5 * 0.3F;
            this.throws_.protected_ = 15.69F + var10;
            this.break_.case_ = 1.015F + rfU_2.break_(var3 * 0.6662F) * 0.3F * var4;
            this.break_.protected_ = 21.07F + var10;
            this.class_.protected_ = 16.5F + var10;
            this.byte_.private_ = -0.0873F - var5;
            this.byte_.protected_ = 16.94F + var10;
            this.protected_.private_ = 0.0873F + var5;
            this.protected_.protected_ = 16.94F + var10;
            this.finally_.protected_ = 22.0F + var10;
            this.extends_.protected_ = 22.0F + var10;
      }
   }
}
