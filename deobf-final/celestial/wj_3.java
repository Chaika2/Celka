package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class wj_3<T extends rSN> extends wN_2<T> {
   private final Iq_1[] class_;
   private final Iq_1[] break_;
   private final ImmutableList<Iq_1> byte_;

   public wj_3(float var1) {
      this.return_ = 64;
      this.public_ = 64;
      this.class_ = new Iq_1[3];
      this.class_[0] = new Iq_1(this, 0, 16);
      this.class_[0].class_(-10.0F, 3.9F, -0.5F, 20.0F, 3.0F, 3.0F, var1);
      this.class_[1] = new Iq_1(this).break_(this.return_, this.public_);
      this.class_[1].class_(-2.0F, 6.9F, -0.5F);
      this.class_[1].class_(0, 22).class_(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, var1);
      this.class_[1].class_(24, 22).class_(-4.0F, 1.5F, 0.5F, 11.0F, 2.0F, 2.0F, var1);
      this.class_[1].class_(24, 22).class_(-4.0F, 4.0F, 0.5F, 11.0F, 2.0F, 2.0F, var1);
      this.class_[1].class_(24, 22).class_(-4.0F, 6.5F, 0.5F, 11.0F, 2.0F, 2.0F, var1);
      this.class_[2] = new Iq_1(this, 12, 22);
      this.class_[2].class_(0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, var1);
      this.break_ = new Iq_1[3];
      this.break_[0] = new Iq_1(this, 0, 0);
      this.break_[0].class_(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
      this.break_[1] = new Iq_1(this, 32, 0);
      this.break_[1].class_(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, var1);
      this.break_[1].byte_ = -8.0F;
      this.break_[1].protected_ = 4.0F;
      this.break_[2] = new Iq_1(this, 32, 0);
      this.break_[2].class_(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, var1);
      this.break_[2].byte_ = 10.0F;
      this.break_[2].protected_ = 4.0F;
      Builder var2 = ImmutableList.builder();
      var2.addAll(Arrays.asList(this.break_));
      var2.addAll(Arrays.asList(this.class_));
      this.byte_ = var2.build();
   }

   public void class_(T var1, float var2, float var3, float var4) {
      for (int var5 = 1; var5 < 3; var5++) {
         this.break_[var5].catch_ = (var1.class_(var5 - 1) - (Float)var1.private_[23]) * (float) (Math.PI / 180.0);
         this.break_[var5].case_ = var1.break_(var5 - 1) * (float) (Math.PI / 180.0);
      }
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = rfU_2.break_(var4 * 0.1F);
      this.class_[1].case_ = (0.065F + 0.05F * var7) * (float) Math.PI;
      this.class_[2].class_(-2.0F, 6.9F + rfU_2.break_(this.class_[1].case_) * 10.0F, -0.5F + rfU_2.class_(this.class_[1].case_) * 10.0F);
      this.class_[2].case_ = (0.265F + 0.1F * var7) * (float) Math.PI;
      this.break_[0].catch_ = var5 * (float) (Math.PI / 180.0);
      this.break_[0].case_ = var6 * (float) (Math.PI / 180.0);
   }

   public ImmutableList<Iq_1> break_() {
      return this.byte_;
   }
}
