package celestial;

import com.google.common.collect.ImmutableList;

public class wT_2<T extends an_3> extends tO_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;

   public wT_2(float var1) {
      this.return_ = 32;
      this.public_ = 32;
      byte var2 = 19;
      this.class_ = new Iq_1(this, 0, 20);
      this.class_.class_(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 6.0F, var1);
      this.class_.class_(0.0F, 19.0F, 0.0F);
      this.break_ = new Iq_1(this, 21, 16);
      this.break_.class_(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, var1);
      this.break_.class_(0.0F, 19.0F, 3.0F);
      this.byte_ = new Iq_1(this, 2, 16);
      this.byte_.class_(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.byte_.class_(-1.0F, 20.0F, 0.0F);
      this.byte_.catch_ = (float) (Math.PI / 4);
      this.protected_ = new Iq_1(this, 2, 12);
      this.protected_.class_(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.protected_.class_(1.0F, 20.0F, 0.0F);
      this.protected_.catch_ = (float) (-Math.PI / 4);
      this.throws_ = new Iq_1(this, 20, 11);
      this.throws_.class_(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 6.0F, var1);
      this.throws_.class_(0.0F, 16.0F, -3.0F);
      this.case_ = new Iq_1(this, 20, 21);
      this.case_.class_(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 6.0F, var1);
      this.case_.class_(0.0F, 22.0F, -3.0F);
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.break_, this.byte_, this.protected_, this.throws_, this.case_);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = 1.0F;
      if (!var1.rT()) {
         var7 = 1.5F;
      }

      this.break_.catch_ = -var7 * 0.45F * rfU_2.class_(0.6F * var4);
   }
}
