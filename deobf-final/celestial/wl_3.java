package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class wl_3<T extends an_3> extends wN_2<T> {
   private final Iq_1 class_;
   private final Iq_1[] break_ = new Iq_1[8];
   private final ImmutableList<Iq_1> byte_;

   public wl_3() {
      byte var1 = -16;
      this.class_ = new Iq_1(this, 0, 0);
      this.class_.class_(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F);
      this.class_.protected_ += 8.0F;

      for (int var2 = 0; var2 < this.break_.length; var2++) {
         this.break_[var2] = new Iq_1(this, 48, 0);
         double var3 = (double)var2 * Math.PI * 2.0 / (double)this.break_.length;
         float var5 = (float)Math.cos(var3) * 5.0F;
         float var6 = (float)Math.sin(var3) * 5.0F;
         this.break_[var2].class_(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);
         this.break_[var2].byte_ = var5;
         this.break_[var2].throws_ = var6;
         this.break_[var2].protected_ = 15.0F;
         var3 = (double)var2 * Math.PI * -2.0 / (double)this.break_.length + (Math.PI / 2);
         this.break_[var2].catch_ = (float)var3;
      }

      Builder var7 = ImmutableList.builder();
      var7.add(this.class_);
      var7.addAll(Arrays.asList(this.break_));
      this.byte_ = var7.build();
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (Iq_1 var10 : this.break_) {
         var10.case_ = var4;
      }
   }

   @Override
   public Iterable<Iq_1> class_() {
      return this.byte_;
   }
}
