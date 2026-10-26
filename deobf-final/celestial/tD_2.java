package celestial;

import com.google.common.collect.ImmutableList;

public class tD_2<T extends rMZ> extends wN_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;

   public tD_2() {
      short var1 = 128;
      short var2 = 128;
      this.class_ = new Iq_1(this).break_(128, 128);
      this.class_.class_(0.0F, -7.0F, -2.0F);
      this.class_.class_(0, 0).class_(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F, 0.0F);
      this.class_.class_(24, 0).class_(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F, 0.0F);
      this.break_ = new Iq_1(this).break_(128, 128);
      this.break_.class_(0.0F, -7.0F, 0.0F);
      this.break_.class_(0, 40).class_(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, 0.0F);
      this.break_.class_(0, 70).class_(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, 0.5F);
      this.byte_ = new Iq_1(this).break_(128, 128);
      this.byte_.class_(0.0F, -7.0F, 0.0F);
      this.byte_.class_(60, 21).class_(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F);
      this.protected_ = new Iq_1(this).break_(128, 128);
      this.protected_.class_(0.0F, -7.0F, 0.0F);
      this.protected_.class_(60, 58).class_(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F);
      this.throws_ = new Iq_1(this, 0, 22).break_(128, 128);
      this.throws_.class_(-4.0F, 11.0F, 0.0F);
      this.throws_.class_(37, 0).class_(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F);
      this.case_ = new Iq_1(this, 0, 22).break_(128, 128);
      this.case_.implements_ = true;
      this.case_.class_(60, 0).class_(5.0F, 11.0F, 0.0F);
      this.case_.class_(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F);
   }

   public void class_(T var1, float var2, float var3, float var4) {
      int var5 = var1.sJ();
      if (var5 > 0) {
         this.byte_.case_ = -2.0F + 1.5F * rfU_2.throws_((float)var5 - var4, 10.0F);
         this.protected_.case_ = -2.0F + 1.5F * rfU_2.throws_((float)var5 - var4, 10.0F);
      } else {
         int var6 = var1.sx();
         if (var6 > 0) {
            this.byte_.case_ = -0.8F + 0.025F * rfU_2.throws_((float)var6, 70.0F);
            this.protected_.case_ = 0.0F;
         } else {
            this.byte_.case_ = (-0.2F + 1.5F * rfU_2.throws_(var2, 13.0F)) * var3;
            this.protected_.case_ = (-0.2F - 1.5F * rfU_2.throws_(var2, 13.0F)) * var3;
         }
      }
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.class_.case_ = var6 * (float) (Math.PI / 180.0);
      this.throws_.case_ = -1.5F * rfU_2.throws_(var2, 13.0F) * var3;
      this.case_.case_ = 1.5F * rfU_2.throws_(var2, 13.0F) * var3;
      this.throws_.catch_ = 0.0F;
      this.case_.catch_ = 0.0F;
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.break_, this.throws_, this.case_, this.byte_, this.protected_);
   }

   public Iq_1 break_() {
      return this.byte_;
   }
}
