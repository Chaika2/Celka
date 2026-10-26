package celestial;

import com.google.common.collect.ImmutableList;

public class wd_3<T extends an_3> extends wN_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;

   public wd_3() {
      this.return_ = 32;
      this.public_ = 32;
      byte var1 = 23;
      this.class_ = new Iq_1(this, 0, 27);
      this.class_.class_(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F);
      this.class_.class_(0.0F, 23.0F, 0.0F);
      this.break_ = new Iq_1(this, 24, 6);
      this.break_.class_(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
      this.break_.class_(0.0F, 20.0F, 0.0F);
      this.byte_ = new Iq_1(this, 28, 6);
      this.byte_.class_(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
      this.byte_.class_(0.0F, 20.0F, 0.0F);
      this.case_ = new Iq_1(this, -3, 0);
      this.case_.class_(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F);
      this.case_.class_(0.0F, 22.0F, 1.5F);
      this.protected_ = new Iq_1(this, 25, 0);
      this.protected_.class_(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
      this.protected_.class_(-1.5F, 22.0F, -1.5F);
      this.throws_ = new Iq_1(this, 25, 0);
      this.throws_.class_(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
      this.throws_.class_(1.5F, 22.0F, -1.5F);
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.break_, this.byte_, this.case_, this.protected_, this.throws_);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.protected_.private_ = -0.2F + 0.4F * rfU_2.class_(var4 * 0.2F);
      this.throws_.private_ = 0.2F - 0.4F * rfU_2.class_(var4 * 0.2F);
   }
}
