package celestial;

import java.util.Arrays;

public class wr_3<T extends an_3> extends wN_2<T> {
   private final Iq_1[] class_ = new Iq_1[6];

   public wr_3() {
      this.class_[0] = new Iq_1(this, 0, 10);
      this.class_[1] = new Iq_1(this, 0, 0);
      this.class_[2] = new Iq_1(this, 0, 0);
      this.class_[3] = new Iq_1(this, 0, 0);
      this.class_[4] = new Iq_1(this, 0, 0);
      this.class_[5] = new Iq_1(this, 44, 10);
      byte var1 = 20;
      byte var2 = 8;
      byte var3 = 16;
      byte var4 = 4;
      this.class_[0].class_(-10.0F, -8.0F, -1.0F, 20.0F, 16.0F, 2.0F, 0.0F);
      this.class_[0].class_(0.0F, 4.0F, 0.0F);
      this.class_[5].class_(-9.0F, -7.0F, -1.0F, 18.0F, 14.0F, 1.0F, 0.0F);
      this.class_[5].class_(0.0F, 4.0F, 0.0F);
      this.class_[1].class_(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.class_[1].class_(-9.0F, 4.0F, 0.0F);
      this.class_[2].class_(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.class_[2].class_(9.0F, 4.0F, 0.0F);
      this.class_[3].class_(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.class_[3].class_(0.0F, 4.0F, -7.0F);
      this.class_[4].class_(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.class_[4].class_(0.0F, 4.0F, 7.0F);
      this.class_[0].case_ = (float) (Math.PI / 2);
      this.class_[1].catch_ = (float) (Math.PI * 3.0 / 2.0);
      this.class_[2].catch_ = (float) (Math.PI / 2);
      this.class_[3].catch_ = (float) Math.PI;
      this.class_[5].case_ = (float) (-Math.PI / 2);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_[5].protected_ = 4.0F - var4;
   }

   @Override
   public Iterable<Iq_1> class_() {
      return Arrays.asList(this.class_);
   }
}
