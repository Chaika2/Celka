package celestial;

import com.google.common.collect.ImmutableList;

public class wC_2<T extends an_3> extends wN_2<T> {
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

   public wC_2() {
      float var1 = 0.0F;
      byte var2 = 15;
      this.class_ = new Iq_1(this, 32, 4);
      this.class_.class_(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F);
      this.class_.class_(0.0F, 15.0F, -3.0F);
      this.break_ = new Iq_1(this, 0, 0);
      this.break_.class_(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F);
      this.break_.class_(0.0F, 15.0F, 0.0F);
      this.byte_ = new Iq_1(this, 0, 12);
      this.byte_.class_(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F, 0.0F);
      this.byte_.class_(0.0F, 15.0F, 9.0F);
      this.protected_ = new Iq_1(this, 18, 0);
      this.protected_.class_(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.protected_.class_(-4.0F, 15.0F, 2.0F);
      this.throws_ = new Iq_1(this, 18, 0);
      this.throws_.class_(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.throws_.class_(4.0F, 15.0F, 2.0F);
      this.case_ = new Iq_1(this, 18, 0);
      this.case_.class_(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.case_.class_(-4.0F, 15.0F, 1.0F);
      this.catch_ = new Iq_1(this, 18, 0);
      this.catch_.class_(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.catch_.class_(4.0F, 15.0F, 1.0F);
      this.private_ = new Iq_1(this, 18, 0);
      this.private_.class_(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.private_.class_(-4.0F, 15.0F, 0.0F);
      this.implements_ = new Iq_1(this, 18, 0);
      this.implements_.class_(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.implements_.class_(4.0F, 15.0F, 0.0F);
      this.finally_ = new Iq_1(this, 18, 0);
      this.finally_.class_(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.finally_.class_(-4.0F, 15.0F, -1.0F);
      this.extends_ = new Iq_1(this, 18, 0);
      this.extends_.class_(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.extends_.class_(4.0F, 15.0F, -1.0F);
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(
         this.class_,
         this.break_,
         this.byte_,
         this.protected_,
         this.throws_,
         this.case_,
         this.catch_,
         this.private_,
         this.implements_,
         this.finally_,
         this.extends_
      );
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.class_.case_ = var6 * (float) (Math.PI / 180.0);
      float var7 = (float) (Math.PI / 4);
      this.protected_.private_ = (float) (-Math.PI / 4);
      this.throws_.private_ = (float) (Math.PI / 4);
      this.case_.private_ = -0.58119464F;
      this.catch_.private_ = 0.58119464F;
      this.private_.private_ = -0.58119464F;
      this.implements_.private_ = 0.58119464F;
      this.finally_.private_ = (float) (-Math.PI / 4);
      this.extends_.private_ = (float) (Math.PI / 4);
      float var8 = -0.0F;
      float var9 = (float) (Math.PI / 8);
      this.protected_.catch_ = (float) (Math.PI / 4);
      this.throws_.catch_ = (float) (-Math.PI / 4);
      this.case_.catch_ = (float) (Math.PI / 8);
      this.catch_.catch_ = (float) (-Math.PI / 8);
      this.private_.catch_ = (float) (-Math.PI / 8);
      this.implements_.catch_ = (float) (Math.PI / 8);
      this.finally_.catch_ = (float) (-Math.PI / 4);
      this.extends_.catch_ = (float) (Math.PI / 4);
      float var10 = -(rfU_2.break_(var2 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var3;
      float var11 = -(rfU_2.break_(var2 * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * var3;
      float var12 = -(rfU_2.break_(var2 * 0.6662F * 2.0F + (float) (Math.PI / 2)) * 0.4F) * var3;
      float var13 = -(rfU_2.break_(var2 * 0.6662F * 2.0F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var3;
      float var14 = Math.abs(rfU_2.class_(var2 * 0.6662F + 0.0F) * 0.4F) * var3;
      float var15 = Math.abs(rfU_2.class_(var2 * 0.6662F + (float) Math.PI) * 0.4F) * var3;
      float var16 = Math.abs(rfU_2.class_(var2 * 0.6662F + (float) (Math.PI / 2)) * 0.4F) * var3;
      float var17 = Math.abs(rfU_2.class_(var2 * 0.6662F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var3;
      this.protected_.catch_ += var10;
      this.throws_.catch_ += -var10;
      this.case_.catch_ += var11;
      this.catch_.catch_ += -var11;
      this.private_.catch_ += var12;
      this.implements_.catch_ += -var12;
      this.finally_.catch_ += var13;
      this.extends_.catch_ += -var13;
      this.protected_.private_ += var14;
      this.throws_.private_ += -var14;
      this.case_.private_ += var15;
      this.catch_.private_ += -var15;
      this.private_.private_ += var16;
      this.implements_.private_ += -var16;
      this.finally_.private_ += var17;
      this.extends_.private_ += -var17;
   }
}
