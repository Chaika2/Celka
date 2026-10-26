package celestial;

import com.google.common.collect.ImmutableList;

public class tn_3<T extends an_3> extends wN_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;

   public tn_3() {
      this.return_ = 64;
      this.public_ = 64;
      float var1 = 18.0F;
      float var2 = -8.0F;
      this.class_ = new Iq_1(this, 22, 0);
      this.class_.class_(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F);
      this.class_.class_(0.0F, 22.0F, -5.0F);
      Iq_1 var3 = new Iq_1(this, 51, 0);
      var3.class_(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F);
      var3.case_ = (float) (Math.PI / 3);
      this.class_.break_(var3);
      Iq_1 var4 = new Iq_1(this, 48, 20);
      var4.implements_ = true;
      var4.class_(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F);
      var4.class_(2.0F, -2.0F, 4.0F);
      var4.case_ = (float) (Math.PI / 3);
      var4.private_ = (float) (Math.PI * 2.0 / 3.0);
      this.class_.break_(var4);
      Iq_1 var5 = new Iq_1(this, 48, 20);
      var5.class_(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F);
      var5.class_(-2.0F, -2.0F, 4.0F);
      var5.case_ = (float) (Math.PI / 3);
      var5.private_ = (float) (-Math.PI * 2.0 / 3.0);
      this.class_.break_(var5);
      this.break_ = new Iq_1(this, 0, 19);
      this.break_.class_(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F);
      this.break_.class_(0.0F, -2.5F, 11.0F);
      this.break_.case_ = -0.10471976F;
      this.class_.break_(this.break_);
      this.byte_ = new Iq_1(this, 19, 20);
      this.byte_.class_(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F);
      this.byte_.class_(0.0F, 0.0F, 9.0F);
      this.byte_.case_ = 0.0F;
      this.break_.break_(this.byte_);
      Iq_1 var6 = new Iq_1(this, 0, 0);
      var6.class_(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F);
      var6.class_(0.0F, -4.0F, -3.0F);
      Iq_1 var7 = new Iq_1(this, 0, 13);
      var7.class_(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F);
      var6.break_(var7);
      this.class_.break_(var6);
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_.case_ = var6 * (float) (Math.PI / 180.0);
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      if (an_3.case_(var1.rv()) > 1.0E-7) {
         this.class_.case_ = this.class_.case_ + -0.05F + -0.05F * rfU_2.break_(var4 * 0.3F);
         this.break_.case_ = -0.1F * rfU_2.break_(var4 * 0.3F);
         this.byte_.case_ = -0.2F * rfU_2.break_(var4 * 0.3F);
      }
   }
}
