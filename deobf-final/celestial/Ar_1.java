package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Ar_1 extends Lg_1<Ar_1> {
   private Li_1 byte_;
   protected final QY class_;
   protected final vm_3 break_;
   private final vd_3 protected_;
   private final rpl_3 throws_;
   private final cv_3 case_;
   private final rpl_3 catch_;
   private final cv_3 private_;

   public Ar_1(QY var1, Li_1 var2, vm_3 var3, vd_3 var4) {
      this.class_ = var1;
      this.break_ = var3;
      this.protected_ = var4;
      this.byte_ = var2;
      this.throws_ = class_(var1, var4.throws_());
      this.case_ = break_(var1, var4.continue_());
      this.catch_ = class_(var1, Li_1.case_);
      this.private_ = break_(var1, var4.protected_().break_());
   }

   public vd_3 class_() {
      return this.protected_;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      rAl_1 var11 = this.protected_.protected_();
      if (!var11.class_()) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         ch_3.class_(var1, var4 - 1, var3 - 1, var4 + var5 - 9, var3 + var6 + 1, -8978432);
      }

      this.class_.A().class_(this.protected_.byte_());
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      ch_3.class_(var1, var4, var3, 0.0F, 0.0F, 32, 32, 32, 32);
      rpl_3 var12 = this.throws_;
      cv_3 var13 = this.case_;
      if (this.break_() && (((Qw_1)this.class_.class_[20]).S || var9)) {
         this.class_.A().class_(Li_1.throws_);
         ch_3.class_(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var14 = var7 - var4;
         int var15 = var8 - var3;
         if (!this.protected_.protected_().class_()) {
            var12 = this.catch_;
            var13 = this.private_;
         }

         if (this.protected_.super_()) {
            if (var14 < 32) {
               ch_3.class_(var1, var4, var3, 0.0F, 32.0F, 32, 32, 256, 256);
            } else {
               ch_3.class_(var1, var4, var3, 0.0F, 0.0F, 32, 32, 256, 256);
            }
         } else {
            if (this.protected_.this_()) {
               if (var14 < 16) {
                  ch_3.class_(var1, var4, var3, 32.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  ch_3.class_(var1, var4, var3, 32.0F, 0.0F, 32, 32, 256, 256);
               }
            }

            if (this.protected_.extends_()) {
               if (var14 < 32 && var14 > 16 && var15 < 16) {
                  ch_3.class_(var1, var4, var3, 96.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  ch_3.class_(var1, var4, var3, 96.0F, 0.0F, 32, 32, 256, 256);
               }
            }

            if (this.protected_.volatile_()) {
               if (var14 < 32 && var14 > 16 && var15 > 16) {
                  ch_3.class_(var1, var4, var3, 64.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  ch_3.class_(var1, var4, var3, 64.0F, 0.0F, 32, 32, 256, 256);
               }
            }
         }
      }

      ((cm_3)this.class_.class_[15]).class_(var1, var12, (float)(var4 + 32 + 2), (float)(var3 + 1), 16777215);
      var13.break_(var1, var4 + 32 + 2, var3 + 12, 10, 8421504);
   }

   private static rpl_3 class_(QY var0, rgP_2 var1) {
      int var2 = ((cm_3)var0.class_[15]).class_(var1);
      if (var2 > 157) {
         rgS_2 var3 = rgS_2.class_(((cm_3)var0.class_[15]).class_(var1, 157 - ((cm_3)var0.class_[15]).break_("...")), rgS_2.protected_("..."));
         return rgX_2.byte_().class_(var3);
      } else {
         return var1.catch_();
      }
   }

   private static cv_3 break_(QY var0, rgP_2 var1) {
      return cv_3.class_((cm_3)var0.class_[15], var1, 157, 2);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      double var6 = var1 - (double)this.byte_.continue_();
      double var8 = var3 - (double)this.byte_.case_(this.byte_.x_().indexOf(this));
      if (this.break_() && var6 <= 32.0) {
         if (this.protected_.super_()) {
            this.protected_.int_();
            return true;
         }

         if (var6 < 16.0 && this.protected_.this_()) {
            this.protected_.new_();
            return true;
         }

         if (var6 > 16.0 && var8 < 16.0 && this.protected_.extends_()) {
            this.protected_.native_();
            return true;
         }

         if (var6 > 16.0 && var8 > 16.0 && this.protected_.volatile_()) {
            this.protected_.final_();
            return true;
         }
      }

      return false;
   }

   private boolean break_() {
      return !this.protected_.private_() || !this.protected_.implements_();
   }
}
