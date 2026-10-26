package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class ti_3<T extends rGA> extends wN_2<T> {
   private final Iq_1[] class_ = new Iq_1[8];
   private final Iq_1 break_;
   private final ImmutableList<Iq_1> byte_;

   public ti_3() {
      for (int var1 = 0; var1 < this.class_.length; var1++) {
         byte var2 = 0;
         int var3 = var1;
         if (var1 == 2) {
            var2 = 24;
            var3 = 10;
         } else if (var1 == 3) {
            var2 = 24;
            var3 = 19;
         }

         this.class_[var1] = new Iq_1(this, var2, var3);
         this.class_[var1].class_(-4.0F, (float)(16 + var1), -4.0F, 8.0F, 1.0F, 8.0F);
      }

      this.break_ = new Iq_1(this, 0, 16);
      this.break_.class_(-2.0F, 18.0F, -2.0F, 4.0F, 4.0F, 4.0F);
      Builder var4 = ImmutableList.builder();
      var4.add(this.break_);
      var4.addAll(Arrays.asList(this.class_));
      this.byte_ = var4.build();
   }

   public void class_(T var1, float var2, float var3, float var4) {
      float var5 = rfU_2.catch_(var4, var1.protected_, var1.break_);
      if (var5 < 0.0F) {
         var5 = 0.0F;
      }

      for (int var6 = 0; var6 < this.class_.length; var6++) {
         this.class_[var6].protected_ = (float)(-(4 - var6)) * var5 * 1.7F;
      }
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
   }

   public ImmutableList<Iq_1> break_() {
      return this.byte_;
   }
}
