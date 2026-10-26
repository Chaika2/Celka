package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class Fo_1 extends Lj_1<Fo_1> {
   private final QY case_;
   private final List<cC_2> catch_;
   private final UUID private_;
   private final String implements_;
   private final Supplier<rqO_2> finally_;
   private boolean extends_;
   private LF native_;
   private LF volatile_;
   private final List<rpl_3> final_;
   private final List<rpl_3> package_;
   private float int_;
   private static final rgP_2 new_ = new rgn_3("gui.socialInteractions.status_hidden").class_(rgF_2.ITALIC);
   private static final rgP_2 continue_ = new rgn_3("gui.socialInteractions.status_blocked").class_(rgF_2.ITALIC);
   private static final rgP_2 super_ = new rgn_3("gui.socialInteractions.status_offline").class_(rgF_2.ITALIC);
   private static final rgP_2 this_ = new rgn_3("gui.socialInteractions.status_hidden_offline").class_(rgF_2.ITALIC);
   private static final rgP_2 else_ = new rgn_3("gui.socialInteractions.status_blocked_offline").class_(rgF_2.ITALIC);
   public static final int class_ = ryj_3.class_(190, 0, 0, 0);
   public static final int break_ = ryj_3.class_(255, 74, 74, 74);
   public static final int byte_ = ryj_3.class_(255, 48, 48, 48);
   public static final int protected_ = ryj_3.class_(255, 255, 255, 255);
   public static final int throws_ = ryj_3.class_(140, 255, 255, 255);

   public void byte_(boolean var1) {
      this.extends_ = var1;
   }

   public Fo_1(QY var1, Fe_1 var2, UUID var3, String var4, Supplier<rqO_2> var5) {
      this.case_ = var1;
      this.private_ = var3;
      this.implements_ = var4;
      this.finally_ = var5;
      this.final_ = ((cm_3)var1.class_[15]).break_(new rgn_3("gui.socialInteractions.tooltip.hide", var4), 150);
      this.package_ = ((cm_3)var1.class_[15]).break_(new rgn_3("gui.socialInteractions.tooltip.show", var4), 150);
      FU var6 = var1.volatile_();
      if (!((cb_3)var1.class_[57]).sv().getId().equals(var3) && !var6.throws_(var3)) {
         this.native_ = new FK(this, 0, 0, 20, 20, 0, 38, 20, Fe_1.class_, 256, 256, var4x -> {
            var6.class_(var3);
            this.class_(true, new rgn_3("gui.socialInteractions.hidden_in_chat", var4));
         }, (var3x, var4x, var5x, var6x) -> {
            this.int_ = this.int_ + var1.default_();
            if (this.int_ >= 10.0F) {
               var2.class_(() -> class_(var2, var4x, this.final_, var5x, var6x));
            }
         }, new rgn_3("gui.socialInteractions.hide"));
         this.volatile_ = new FD(this, 0, 0, 20, 20, 20, 38, 20, Fe_1.class_, 256, 256, var4x -> {
            var6.break_(var3);
            this.class_(false, new rgn_3("gui.socialInteractions.shown_in_chat", var4));
         }, (var3x, var4x, var5x, var6x) -> {
            this.int_ = this.int_ + var1.default_();
            if (this.int_ >= 10.0F) {
               var2.class_(() -> class_(var2, var4x, this.package_, var5x, var6x));
            }
         }, new rgn_3("gui.socialInteractions.show"));
         this.volatile_.new_ = var6.protected_(var3);
         this.native_.new_ = !this.volatile_.new_;
         this.catch_ = ImmutableList.of(this.native_, this.volatile_);
      } else {
         this.catch_ = ImmutableList.of();
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      int var11 = var4 + 4;
      int var12 = var3 + (var6 - 24) / 2;
      int var13 = var11 + 24 + 4;
      rgP_2 var14 = this.protected_();
      int var15;
      if (var14 == rgN_2.byte_) {
         ch_3.class_(var1, var4, var3, var4 + var5, var3 + var6, break_);
         var15 = var3 + (var6 - 9) / 2;
      } else {
         ch_3.class_(var1, var4, var3, var4 + var5, var3 + var6, byte_);
         var15 = var3 + (var6 - 18) / 2;
         ((cm_3)this.case_.class_[15]).byte_(var1, var14, (float)var13, (float)(var15 + 12), throws_);
      }

      this.case_.A().class_(this.finally_.get());
      ch_3.class_(var1, var11, var12, 24, 24, 8.0F, 8.0F, 8, 8, 64, 64);
      RenderSystem.enableBlend();
      ch_3.class_(var1, var11, var12, 24, 24, 40.0F, 8.0F, 8, 8, 64, 64);
      RenderSystem.disableBlend();
      ((cm_3)this.case_.class_[15]).break_(var1, this.implements_, (float)var13, (float)var15, protected_);
      if (this.extends_) {
         ch_3.class_(var1, var11, var12, var11 + 24, var12 + 24, class_);
      }

      if (this.native_ != null && this.volatile_ != null) {
         float var16 = this.int_;
         this.native_.volatile_ = var4 + (var5 - this.native_.case_() - 4);
         this.native_.final_ = var3 + (var6 - this.native_.else_()) / 2;
         this.native_.class_(var1, var7, var8, var10);
         this.volatile_.volatile_ = var4 + (var5 - this.volatile_.case_() - 4);
         this.volatile_.final_ = var3 + (var6 - this.volatile_.else_()) / 2;
         this.volatile_.class_(var1, var7, var8, var10);
         if (var16 == this.int_) {
            this.int_ = 0.0F;
         }
      }
   }

   private static void class_(Fe_1 var0, Ml_1 var1, List<rpl_3> var2, int var3, int var4) {
      var0.break_(var1, var2, var3, var4);
      var0.class_(null);
   }

   public String class_() {
      return this.implements_;
   }

   private void class_(boolean var1, rgP_2 var2) {
      this.volatile_.new_ = var1;
      this.native_.new_ = !var1;
      ((cq_3)this.case_.class_[19]).throws_().class_(var2);
   }

   rVi_1 class_(rVi_1 var1) {
      rgP_2 var2 = this.protected_();
      return var2 == rgN_2.byte_
         ? new rgN_2(this.implements_).break_(", ").class_(var1)
         : new rgN_2(this.implements_).break_(", ").class_(var2).break_(", ").class_(var1);
   }

   public UUID break_() {
      return this.private_;
   }

   private rgP_2 protected_() {
      boolean var1 = this.case_.volatile_().protected_(this.private_);
      boolean var2 = this.case_.volatile_().throws_(this.private_);
      if (var2 && this.extends_) {
         return else_;
      } else if (var1 && this.extends_) {
         return this_;
      } else if (var2) {
         return continue_;
      } else if (var1) {
         return new_;
      } else {
         return this.extends_ ? super_ : rgN_2.byte_;
      }
   }

   @Override
   public List<? extends cC_2> x_() {
      return this.catch_;
   }
}
