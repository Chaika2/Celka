package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class wF_2<T extends an_3> extends wN_2<T> {
   private final Iq_1[] class_;
   private final Iq_1[] break_;
   private final ImmutableList<Iq_1> byte_;
   private final float[] protected_ = new float[7];
   private static final int[][] throws_ = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
   private static final int[][] case_ = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

   public wF_2() {
      this.class_ = new Iq_1[7];
      float var1 = -3.5F;

      for (int var2 = 0; var2 < this.class_.length; var2++) {
         this.class_[var2] = new Iq_1(this, case_[var2][0], case_[var2][1]);
         this.class_[var2]
            .class_(
               (float)throws_[var2][0] * -0.5F,
               0.0F,
               (float)throws_[var2][2] * -0.5F,
               (float)throws_[var2][0],
               (float)throws_[var2][1],
               (float)throws_[var2][2]
            );
         this.class_[var2].class_(0.0F, (float)(24 - throws_[var2][1]), var1);
         this.protected_[var2] = var1;
         if (var2 < this.class_.length - 1) {
            var1 += (float)(throws_[var2][2] + throws_[var2 + 1][2]) * 0.5F;
         }
      }

      this.break_ = new Iq_1[3];
      this.break_[0] = new Iq_1(this, 20, 0);
      this.break_[0].class_(-5.0F, 0.0F, (float)throws_[2][2] * -0.5F, 10.0F, 8.0F, (float)throws_[2][2]);
      this.break_[0].class_(0.0F, 16.0F, this.protected_[2]);
      this.break_[1] = new Iq_1(this, 20, 11);
      this.break_[1].class_(-3.0F, 0.0F, (float)throws_[4][2] * -0.5F, 6.0F, 4.0F, (float)throws_[4][2]);
      this.break_[1].class_(0.0F, 20.0F, this.protected_[4]);
      this.break_[2] = new Iq_1(this, 20, 18);
      this.break_[2].class_(-3.0F, 0.0F, (float)throws_[4][2] * -0.5F, 6.0F, 5.0F, (float)throws_[1][2]);
      this.break_[2].class_(0.0F, 19.0F, this.protected_[1]);
      Builder var3 = ImmutableList.builder();
      var3.addAll(Arrays.asList(this.class_));
      var3.addAll(Arrays.asList(this.break_));
      this.byte_ = var3.build();
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var7 = 0; var7 < this.class_.length; var7++) {
         this.class_[var7].catch_ = rfU_2.break_(var4 * 0.9F + (float)var7 * 0.15F * (float) Math.PI)
            * (float) Math.PI
            * 0.05F
            * (float)(1 + Math.abs(var7 - 2));
         this.class_[var7].byte_ = rfU_2.class_(var4 * 0.9F + (float)var7 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.2F * (float)Math.abs(var7 - 2);
      }

      this.break_[0].catch_ = this.class_[2].catch_;
      this.break_[1].catch_ = this.class_[4].catch_;
      this.break_[1].byte_ = this.class_[4].byte_;
      this.break_[2].catch_ = this.class_[1].catch_;
      this.break_[2].byte_ = this.class_[1].byte_;
   }

   public ImmutableList<Iq_1> break_() {
      return this.byte_;
   }
}
