package celestial;

import com.google.common.collect.ImmutableList;

public class wb_3<T extends an_3> extends wN_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_;

   public wb_3() {
      this.return_ = 64;
      this.public_ = 64;
      this.class_ = new Iq_1(this, 0, 8);
      this.class_.class_(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F);
      this.case_ = new Iq_1(this, 3, 20);
      this.case_.class_(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F);
      this.case_.class_(0.0F, -2.0F, 1.0F);
      this.class_.break_(this.case_);
      this.catch_ = new Iq_1(this, 4, 29);
      this.catch_.class_(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F);
      this.catch_.class_(0.0F, 0.5F, 6.0F);
      this.case_.break_(this.catch_);
      this.break_ = new Iq_1(this, 23, 12);
      this.break_.class_(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F);
      this.break_.class_(2.0F, -2.0F, -8.0F);
      this.byte_ = new Iq_1(this, 16, 24);
      this.byte_.class_(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F);
      this.byte_.class_(6.0F, 0.0F, 0.0F);
      this.break_.break_(this.byte_);
      this.protected_ = new Iq_1(this, 23, 12);
      this.protected_.implements_ = true;
      this.protected_.class_(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F);
      this.protected_.class_(-3.0F, -2.0F, -8.0F);
      this.throws_ = new Iq_1(this, 16, 24);
      this.throws_.implements_ = true;
      this.throws_.class_(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F);
      this.throws_.class_(-6.0F, 0.0F, 0.0F);
      this.protected_.break_(this.throws_);
      this.break_.private_ = 0.1F;
      this.byte_.private_ = 0.1F;
      this.protected_.private_ = -0.1F;
      this.throws_.private_ = -0.1F;
      this.class_.case_ = -0.1F;
      Iq_1 var1 = new Iq_1(this, 0, 0);
      var1.class_(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F);
      var1.class_(0.0F, 1.0F, -7.0F);
      var1.case_ = 0.2F;
      this.class_.break_(var1);
      this.class_.break_(this.break_);
      this.class_.break_(this.protected_);
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = ((float)(var1.V() * 3) + var4) * 0.13F;
      float var8 = 16.0F;
      this.break_.private_ = rfU_2.break_(var7) * 16.0F * (float) (Math.PI / 180.0);
      this.byte_.private_ = rfU_2.break_(var7) * 16.0F * (float) (Math.PI / 180.0);
      this.protected_.private_ = -this.break_.private_;
      this.throws_.private_ = -this.byte_.private_;
      this.case_.case_ = -(5.0F + rfU_2.break_(var7 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.catch_.case_ = -(5.0F + rfU_2.break_(var7 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}
