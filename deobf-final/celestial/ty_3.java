package celestial;

import java.util.Arrays;

public class ty_3<T extends an_3> extends wN_2<T> {
   private static final int[][] class_ = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
   private static final int[][] break_ = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
   private static final int byte_ = class_.length;
   private final Iq_1[] protected_ = new Iq_1[byte_];

   public ty_3() {
      float var1 = -3.5F;

      for (int var2 = 0; var2 < this.protected_.length; var2++) {
         this.protected_[var2] = new Iq_1(this, break_[var2][0], break_[var2][1]);
         this.protected_[var2]
            .class_(
               (float)class_[var2][0] * -0.5F, 0.0F, (float)class_[var2][2] * -0.5F, (float)class_[var2][0], (float)class_[var2][1], (float)class_[var2][2]
            );
         this.protected_[var2].class_(0.0F, (float)(24 - class_[var2][1]), var1);
         if (var2 < this.protected_.length - 1) {
            var1 += (float)(class_[var2][2] + class_[var2 + 1][2]) * 0.5F;
         }
      }
   }

   @Override
   public Iterable<Iq_1> class_() {
      return Arrays.asList(this.protected_);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var7 = 0; var7 < this.protected_.length; var7++) {
         this.protected_[var7].catch_ = rfU_2.break_(var4 * 0.9F + (float)var7 * 0.15F * (float) Math.PI)
            * (float) Math.PI
            * 0.01F
            * (float)(1 + Math.abs(var7 - 2));
         this.protected_[var7].byte_ = rfU_2.class_(var4 * 0.9F + (float)var7 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.1F * (float)Math.abs(var7 - 2);
      }
   }
}
