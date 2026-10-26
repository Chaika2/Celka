package celestial;

import com.google.common.collect.ImmutableList;

public class wk_3<T extends an_3> extends tX_2<T> {
   protected Iq_1 class_ = new Iq_1(this, 0, 0);
   protected Iq_1 break_;
   protected Iq_1 byte_;
   protected Iq_1 protected_;
   protected Iq_1 throws_;
   protected Iq_1 case_;

   public wk_3(int var1, float var2, boolean var3, float var4, float var5, float var6, float var7, int var8) {
      super(var3, var4, var5, var6, var7, (float)var8);
      this.class_.class_(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, var2);
      this.class_.class_(0.0F, (float)(18 - var1), -6.0F);
      this.break_ = new Iq_1(this, 28, 8);
      this.break_.class_(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, var2);
      this.break_.class_(0.0F, (float)(17 - var1), 2.0F);
      this.byte_ = new Iq_1(this, 0, 16);
      this.byte_.class_(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.byte_.class_(-3.0F, (float)(24 - var1), 7.0F);
      this.protected_ = new Iq_1(this, 0, 16);
      this.protected_.class_(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.protected_.class_(3.0F, (float)(24 - var1), 7.0F);
      this.throws_ = new Iq_1(this, 0, 16);
      this.throws_.class_(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.throws_.class_(-3.0F, (float)(24 - var1), -5.0F);
      this.case_ = new Iq_1(this, 0, 16);
      this.case_.class_(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.case_.class_(3.0F, (float)(24 - var1), -5.0F);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_.case_ = var6 * (float) (Math.PI / 180.0);
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.break_.case_ = (float) (Math.PI / 2);
      this.byte_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3;
      this.protected_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.throws_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.case_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3;
   }

   @Override
   protected Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_);
   }

   @Override
   protected Iterable<Iq_1> break_() {
      return ImmutableList.of(this.break_, this.byte_, this.protected_, this.throws_, this.case_);
   }
}
