package celestial;

import com.google.common.collect.ImmutableList;

public class wQ_2<T extends an_3> extends wN_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;

   public wQ_2() {
      this.return_ = 32;
      this.public_ = 32;
      byte var1 = 20;
      this.class_ = new Iq_1(this, 0, 0);
      this.class_.class_(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
      this.class_.class_(0.0F, 20.0F, 0.0F);
      this.break_ = new Iq_1(this, 0, 13);
      this.break_.class_(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
      this.break_.class_(0.0F, 20.0F, 8.0F);
      this.byte_ = new Iq_1(this, 22, 0);
      this.byte_.class_(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F);
      this.byte_.class_(0.0F, 20.0F, 0.0F);
      Iq_1 var2 = new Iq_1(this, 20, 10);
      var2.class_(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F);
      var2.class_(0.0F, 0.0F, 8.0F);
      this.break_.break_(var2);
      Iq_1 var3 = new Iq_1(this, 2, 1);
      var3.class_(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F);
      var3.class_(0.0F, -4.5F, 5.0F);
      this.class_.break_(var3);
      Iq_1 var4 = new Iq_1(this, 0, 2);
      var4.class_(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F);
      var4.class_(0.0F, -4.5F, -1.0F);
      this.break_.break_(var4);
      this.protected_ = new Iq_1(this, -4, 0);
      this.protected_.class_(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.protected_.class_(-1.5F, 21.5F, 0.0F);
      this.protected_.private_ = (float) (-Math.PI / 4);
      this.throws_ = new Iq_1(this, 0, 0);
      this.throws_.class_(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.throws_.class_(1.5F, 21.5F, 0.0F);
      this.throws_.private_ = (float) (Math.PI / 4);
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.break_, this.byte_, this.protected_, this.throws_);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = 1.0F;
      float var8 = 1.0F;
      if (!var1.rT()) {
         var7 = 1.3F;
         var8 = 1.7F;
      }

      this.break_.catch_ = -var7 * 0.25F * rfU_2.class_(var8 * 0.6F * var4);
   }
}
