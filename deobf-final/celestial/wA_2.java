package celestial;

import com.google.common.collect.ImmutableList;

public class wA_2<T extends an_3> extends wN_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;

   public wA_2(int var1) {
      this.class_ = new Iq_1(this, 0, var1);
      this.break_ = new Iq_1(this, 32, 0);
      this.byte_ = new Iq_1(this, 32, 4);
      this.protected_ = new Iq_1(this, 32, 8);
      if (var1 > 0) {
         this.class_.class_(-3.0F, 17.0F, -3.0F, 6.0F, 6.0F, 6.0F);
         this.break_.class_(-3.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F);
         this.byte_.class_(1.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F);
         this.protected_.class_(0.0F, 21.0F, -3.5F, 1.0F, 1.0F, 1.0F);
      } else {
         this.class_.class_(-4.0F, 16.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      }
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.break_, this.byte_, this.protected_);
   }
}
