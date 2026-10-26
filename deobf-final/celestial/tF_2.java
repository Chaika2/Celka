package celestial;

import com.google.common.collect.ImmutableList;

public class tF_2<T extends an_3> extends wN_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_;

   public tF_2() {
      this.return_ = 32;
      this.public_ = 32;
      byte var1 = 22;
      this.class_ = new Iq_1(this, 0, 0);
      this.class_.class_(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F);
      this.class_.class_(0.0F, 22.0F, 0.0F);
      this.byte_ = new Iq_1(this, 11, 0);
      this.byte_.class_(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F);
      this.byte_.class_(0.0F, 22.0F, 0.0F);
      this.protected_ = new Iq_1(this, 0, 0);
      this.protected_.class_(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F);
      this.protected_.class_(0.0F, 22.0F, -3.0F);
      this.throws_ = new Iq_1(this, 22, 1);
      this.throws_.class_(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F);
      this.throws_.class_(-1.0F, 23.0F, 0.0F);
      this.throws_.private_ = (float) (-Math.PI / 4);
      this.case_ = new Iq_1(this, 22, 4);
      this.case_.class_(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F);
      this.case_.class_(1.0F, 23.0F, 0.0F);
      this.case_.private_ = (float) (Math.PI / 4);
      this.catch_ = new Iq_1(this, 22, 3);
      this.catch_.class_(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F);
      this.catch_.class_(0.0F, 22.0F, 7.0F);
      this.break_ = new Iq_1(this, 20, -6);
      this.break_.class_(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F);
      this.break_.class_(0.0F, 20.0F, 0.0F);
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.byte_, this.protected_, this.throws_, this.case_, this.catch_, this.break_);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = 1.0F;
      if (!var1.rT()) {
         var7 = 1.5F;
      }

      this.catch_.catch_ = -var7 * 0.45F * rfU_2.class_(0.6F * var4);
   }
}
