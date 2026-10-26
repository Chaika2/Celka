package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class tN_2<T extends an_3> extends wN_2<T> {
   private final Iq_1[] class_;
   private final Iq_1 break_ = new Iq_1(this, 0, 0);
   private final ImmutableList<Iq_1> byte_;

   public tN_2() {
      this.break_.class_(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.class_ = new Iq_1[12];

      for (int var1 = 0; var1 < this.class_.length; var1++) {
         this.class_[var1] = new Iq_1(this, 0, 16);
         this.class_[var1].class_(0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F);
      }

      Builder var2 = ImmutableList.builder();
      var2.add(this.break_);
      var2.addAll(Arrays.asList(this.class_));
      this.byte_ = var2.build();
   }

   @Override
   public Iterable<Iq_1> class_() {
      return this.byte_;
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var4 * (float) Math.PI * -0.1F;

      for (int var8 = 0; var8 < 4; var8++) {
         this.class_[var8].protected_ = -2.0F + rfU_2.break_(((float)(var8 * 2) + var4) * 0.25F);
         this.class_[var8].byte_ = rfU_2.break_(var7) * 9.0F;
         this.class_[var8].throws_ = rfU_2.class_(var7) * 9.0F;
         var7++;
      }

      var7 = (float) (Math.PI / 4) + var4 * (float) Math.PI * 0.03F;

      for (int var11 = 4; var11 < 8; var11++) {
         this.class_[var11].protected_ = 2.0F + rfU_2.break_(((float)(var11 * 2) + var4) * 0.25F);
         this.class_[var11].byte_ = rfU_2.break_(var7) * 7.0F;
         this.class_[var11].throws_ = rfU_2.class_(var7) * 7.0F;
         var7++;
      }

      var7 = 0.47123894F + var4 * (float) Math.PI * -0.05F;

      for (int var12 = 8; var12 < 12; var12++) {
         this.class_[var12].protected_ = 11.0F + rfU_2.break_(((float)var12 * 1.5F + var4) * 0.5F);
         this.class_[var12].byte_ = rfU_2.break_(var7) * 5.0F;
         this.class_[var12].throws_ = rfU_2.class_(var7) * 5.0F;
         var7++;
      }

      this.break_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.break_.case_ = var6 * (float) (Math.PI / 180.0);
   }
}
