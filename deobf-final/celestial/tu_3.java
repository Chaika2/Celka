package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class tu_3 extends wN_2<rSK> {
   private final Iq_1[] class_ = new Iq_1[2];
   private final Iq_1 break_;
   private final ImmutableList<Iq_1> byte_;

   public Iq_1 byte_() {
      return this.break_;
   }

   public tu_3() {
      Iq_1[] var1 = new Iq_1[]{
         new Iq_1(this, 0, 0).break_(128, 64),
         new Iq_1(this, 0, 19).break_(128, 64),
         new Iq_1(this, 0, 27).break_(128, 64),
         new Iq_1(this, 0, 35).break_(128, 64),
         new Iq_1(this, 0, 43).break_(128, 64)
      };
      byte var2 = 32;
      byte var3 = 6;
      byte var4 = 20;
      byte var5 = 4;
      byte var6 = 28;
      var1[0].class_(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F);
      var1[0].class_(0.0F, 3.0F, 1.0F);
      var1[1].class_(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F, 0.0F);
      var1[1].class_(-15.0F, 4.0F, 4.0F);
      var1[2].class_(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F);
      var1[2].class_(15.0F, 4.0F, 0.0F);
      var1[3].class_(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F);
      var1[3].class_(0.0F, 4.0F, -9.0F);
      var1[4].class_(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F);
      var1[4].class_(0.0F, 4.0F, 9.0F);
      var1[0].case_ = (float) (Math.PI / 2);
      var1[1].catch_ = (float) (Math.PI * 3.0 / 2.0);
      var1[2].catch_ = (float) (Math.PI / 2);
      var1[3].catch_ = (float) Math.PI;
      this.class_[0] = this.class_(true);
      this.class_[0].class_(3.0F, -5.0F, 9.0F);
      this.class_[1] = this.class_(false);
      this.class_[1].class_(3.0F, -5.0F, -9.0F);
      this.class_[1].catch_ = (float) Math.PI;
      this.class_[0].private_ = (float) (Math.PI / 16);
      this.class_[1].private_ = (float) (Math.PI / 16);
      this.break_ = new Iq_1(this, 0, 0).break_(128, 64);
      this.break_.class_(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F);
      this.break_.class_(0.0F, -3.0F, 1.0F);
      this.break_.case_ = (float) (Math.PI / 2);
      Builder var7 = ImmutableList.builder();
      var7.addAll(Arrays.asList(var1));
      var7.addAll(Arrays.asList(this.class_));
      this.byte_ = var7.build();
   }

   protected void class_(rSK var1, int var2, float var3) {
      float var4 = var1.class_(var2, var3);
      Iq_1 var5 = this.class_[var2];
      var5.case_ = (float)rfU_2.break_((float) (-Math.PI / 3), (float) (-Math.PI / 12), (double)((rfU_2.class_(-var4) + 1.0F) / 2.0F));
      var5.catch_ = (float)rfU_2.break_((float) (-Math.PI / 4), (float) (Math.PI / 4), (double)((rfU_2.class_(-var4 + 1.0F) + 1.0F) / 2.0F));
      if (var2 == 1) {
         var5.catch_ = (float) Math.PI - var5.catch_;
      }
   }

   protected Iq_1 class_(boolean var1) {
      Iq_1 var2 = new Iq_1(this, 62, var1 ? 0 : 20).break_(128, 64);
      byte var3 = 20;
      byte var4 = 7;
      byte var5 = 6;
      float var6 = -5.0F;
      var2.class_(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F);
      var2.class_(var1 ? -1.001F : 0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F);
      return var2;
   }

   public void class_(rSK var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_(var1, 0, var2);
      this.class_(var1, 1, var2);
   }

   public ImmutableList<Iq_1> break_() {
      return this.byte_;
   }
}
