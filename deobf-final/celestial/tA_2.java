package celestial;

import com.google.common.collect.ImmutableList;

public class tA_2<T extends an_3> extends wN_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_;

   public tA_2() {
      this(0.0F);
   }

   public tA_2(float var1) {
      byte var2 = 6;
      this.class_ = new Iq_1(this, 0, 0);
      this.class_.class_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
      this.class_.class_(0.0F, 6.0F, 0.0F);
      this.break_ = new Iq_1(this, 32, 0);
      this.break_.class_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1 + 0.5F);
      this.break_.class_(0.0F, 6.0F, 0.0F);
      this.byte_ = new Iq_1(this, 16, 16);
      this.byte_.class_(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.byte_.class_(0.0F, 6.0F, 0.0F);
      this.protected_ = new Iq_1(this, 0, 16);
      this.protected_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.protected_.class_(-2.0F, 18.0F, 4.0F);
      this.throws_ = new Iq_1(this, 0, 16);
      this.throws_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.throws_.class_(2.0F, 18.0F, 4.0F);
      this.case_ = new Iq_1(this, 0, 16);
      this.case_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.case_.class_(-2.0F, 18.0F, -4.0F);
      this.catch_ = new Iq_1(this, 0, 16);
      this.catch_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.catch_.class_(2.0F, 18.0F, -4.0F);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.class_.case_ = var6 * (float) (Math.PI / 180.0);
      this.protected_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3;
      this.throws_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.case_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.catch_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3;
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.byte_, this.protected_, this.throws_, this.case_, this.catch_);
   }
}
