package celestial;

import com.google.common.collect.ImmutableList;

public class td_3 extends wN_2<rbv_3> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;

   public td_3() {
      this.return_ = 64;
      this.public_ = 64;
      this.class_ = new Iq_1(this, 0, 0);
      this.class_.class_(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F);
      Iq_1 var1 = new Iq_1(this, 24, 0);
      var1.class_(-4.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
      this.class_.break_(var1);
      Iq_1 var2 = new Iq_1(this, 24, 0);
      var2.implements_ = true;
      var2.class_(1.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
      this.class_.break_(var2);
      this.break_ = new Iq_1(this, 0, 16);
      this.break_.class_(-3.0F, 4.0F, -3.0F, 6.0F, 12.0F, 6.0F);
      this.break_.class_(0, 34).class_(-5.0F, 16.0F, 0.0F, 10.0F, 6.0F, 1.0F);
      this.byte_ = new Iq_1(this, 42, 0);
      this.byte_.class_(-12.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
      this.throws_ = new Iq_1(this, 24, 16);
      this.throws_.class_(-12.0F, 1.0F, 1.5F);
      this.throws_.class_(-8.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
      this.protected_ = new Iq_1(this, 42, 0);
      this.protected_.implements_ = true;
      this.protected_.class_(2.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
      this.case_ = new Iq_1(this, 24, 16);
      this.case_.implements_ = true;
      this.case_.class_(12.0F, 1.0F, 1.5F);
      this.case_.class_(0.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
      this.break_.break_(this.byte_);
      this.break_.break_(this.protected_);
      this.byte_.break_(this.throws_);
      this.protected_.break_(this.case_);
   }

   public void class_(rbv_3 var1, float var2, float var3, float var4, float var5, float var6) {
      if (var1.catch_()) {
         this.class_.case_ = var6 * (float) (Math.PI / 180.0);
         this.class_.catch_ = (float) Math.PI - var5 * (float) (Math.PI / 180.0);
         this.class_.private_ = (float) Math.PI;
         this.class_.class_(0.0F, -2.0F, 0.0F);
         this.byte_.class_(-3.0F, 0.0F, 3.0F);
         this.protected_.class_(3.0F, 0.0F, 3.0F);
         this.break_.case_ = (float) Math.PI;
         this.byte_.case_ = (float) (-Math.PI / 20);
         this.byte_.catch_ = (float) (-Math.PI * 2.0 / 5.0);
         this.throws_.catch_ = -1.7278761F;
         this.protected_.case_ = this.byte_.case_;
         this.protected_.catch_ = -this.byte_.catch_;
         this.case_.catch_ = -this.throws_.catch_;
      } else {
         this.class_.case_ = var6 * (float) (Math.PI / 180.0);
         this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
         this.class_.private_ = 0.0F;
         this.class_.class_(0.0F, 0.0F, 0.0F);
         this.byte_.class_(0.0F, 0.0F, 0.0F);
         this.protected_.class_(0.0F, 0.0F, 0.0F);
         this.break_.case_ = (float) (Math.PI / 4) + rfU_2.break_(var4 * 0.1F) * 0.15F;
         this.break_.catch_ = 0.0F;
         this.byte_.catch_ = rfU_2.break_(var4 * 1.3F) * (float) Math.PI * 0.25F;
         this.protected_.catch_ = -this.byte_.catch_;
         this.throws_.catch_ = this.byte_.catch_ * 0.5F;
         this.case_.catch_ = -this.byte_.catch_ * 0.5F;
      }
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.break_);
   }
}
