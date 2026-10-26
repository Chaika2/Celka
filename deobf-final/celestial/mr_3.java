package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class mr_3 {
   private rkw_3<?> class_;
   private final List<mP_2> break_ = Lists.newArrayList();
   float byte_;

   public rkw_3<?> byte_() {
      return this.class_;
   }

   public void class_(rkw_3<?> var1) {
      this.class_ = var1;
   }

   public void class_(Ml_1 var1, QY var2, int var3, int var4, boolean var5, float var6) {
      if (!vm_3.else_()) {
         this.byte_ += var6;
      }

      for (int var7 = 0; var7 < this.break_.size(); var7++) {
         mP_2 var8 = this.break_.get(var7);
         int var9 = var8.class_() + var3;
         int var10 = var8.break_() + var4;
         if (var7 == 0 && var5) {
            ch_3.class_(var1, var9 - 4, var10 - 4, var9 + 20, var10 + 20, 822018048);
         } else {
            ch_3.class_(var1, var9, var10, var9 + 16, var10 + 16, 822018048);
         }

         rdn_3 var11 = var8.byte_();
         Hz_1 var12 = var2.float_();
         var12.break_(var11, var9, var10);
         RenderSystem.depthFunc(516);
         ch_3.class_(var1, var9, var10, var9 + 16, var10 + 16, 822083583);
         RenderSystem.depthFunc(515);
         if (var7 == 0) {
            var12.class_((cm_3)var2.class_[15], var11, (float)var9, (float)var10);
         }
      }
   }

   public void class_() {
      this.class_ = null;
      this.break_.clear();
      this.byte_ = 0.0F;
   }

   public void class_(rkg_3 var1, int var2, int var3) {
      this.break_.add(new mP_2(this, var1, var2, var3));
   }

   public mP_2 class_(int var1) {
      return this.break_.get(var1);
   }

   public int break_() {
      return this.break_.size();
   }
}
