package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Deque;
import java.util.List;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cI_2 extends ch_3 {
   private static final Logger class_ = LogManager.getLogger();
   private final QY throws_;
   private final List<String> case_ = Lists.newArrayList();
   private final List<cx_3<rgP_2>> catch_ = Lists.newArrayList();
   private final List<cx_3<rpl_3>> private_ = Lists.newArrayList();
   private final Deque<rgP_2> implements_ = Queues.newArrayDeque();
   private int finally_;
   private boolean extends_;
   private long native_ = 0L;
   private int volatile_ = 0;
   private String final_;
   private int package_;
   private int int_;

   private void byte_(rgP_2 var1) {
      String var2 = var1.getString();
      if (var2.equals(this.final_)) {
         if (((Qw_1)this.throws_.class_[20]).synchronized_) {
            this.package_++;
            this.final_ = var2;
            this.break_(this.int_);
            rVe_1 var3 = rrfu_3.class_().class_().class_(" (x" + this.package_ + ")").break_();
            ((rVi_1)var1).class_(var3);
         }
      } else {
         this.package_ = 1;
         this.final_ = var2;
      }

      this.int_++;
      if (this.int_ > 256) {
         this.int_ = 0;
      }

      this.class_(var1, this.int_);
   }

   public static int byte_(double var0) {
      return rfU_2.byte_(var0 * 160.0 + 20.0);
   }

   private static double byte_(int var0) {
      double var1 = (double)var0 / 200.0;
      var1 = 1.0 - var1;
      var1 *= 10.0;
      var1 = rfU_2.class_(var1, 0.0, 1.0);
      return var1 * var1;
   }

   public cI_2(QY var1) {
      this.throws_ = var1;
   }

   public void class_() {
      this.private_.clear();
      this.throws_();

      for (int var1 = this.catch_.size() - 1; var1 >= 0; var1--) {
         cx_3 var2 = this.catch_.get(var1);
         this.class_((rgP_2)var2.class_(), var2.byte_(), var2.break_(), true);
      }
   }

   public void class_(String var1) {
      if (this.case_.isEmpty() || !this.case_.get(this.case_.size() - 1).equals(var1)) {
         this.case_.add(var1);
      }
   }

   public void class_(double var1) {
      this.finally_ = (int)((double)this.finally_ + var1);
      int var3 = this.private_.size();
      if (this.finally_ > var3 - this.implements_()) {
         this.finally_ = var3 - this.implements_();
      }

      if (this.finally_ <= 0) {
         this.finally_ = 0;
         this.extends_ = false;
      }
   }

   public boolean class_(double var1, double var3) {
      if (this.extends_() && !((Qw_1)this.throws_.class_[20]).g && !this.finally_() && !this.implements_.isEmpty()) {
         double var5 = var1 - 2.0;
         double var7 = (double)this.throws_.else_().this_() - var3 - 40.0;
         if (var5 <= (double)rfU_2.byte_((double)this.case_() / this.private_()) && var7 < 0.0 && var7 > (double)rfU_2.byte_(-9.0 * this.private_())) {
            this.class_(this.implements_.remove());
            this.native_ = System.currentTimeMillis();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void class_(Ml_1 var1, int var2) {
      if (!this.private_.isEmpty()) {
         int var3 = this.case_();
         if (this.volatile_ != var3) {
            this.volatile_ = var3;
            this.class_();
         }

         if (!this.finally_()) {
            this.volatile_();
            int var4 = this.implements_();
            int var5 = this.private_.size();
            if (var5 > 0) {
               boolean var6 = this.extends_();
               double var7 = this.private_();
               int var9 = rfU_2.throws_((double)this.case_() / var7);
               RenderSystem.pushMatrix();
               RenderSystem.translatef(2.0F, 8.0F, 0.0F);
               RenderSystem.scaled(var7, var7, 1.0);
               double var10 = ((Qw_1)this.throws_.class_[20]).extends_ * 0.9F + 0.1F;
               double var12 = ((Qw_1)this.throws_.class_[20]).volatile_;
               double var14 = 9.0 * (((Qw_1)this.throws_.class_[20]).native_ + 1.0);
               double var16 = -8.0 * (((Qw_1)this.throws_.class_[20]).native_ + 1.0) + 4.0 * ((Qw_1)this.throws_.class_[20]).native_;
               int var18 = 0;

               for (int var19 = 0; var19 + this.finally_ < this.private_.size() && var19 < var4; var19++) {
                  cx_3 var20 = this.private_.get(var19 + this.finally_);
                  if (var20 != null) {
                     int var21 = var2 - var20.break_();
                     if (var21 < 200 || var6) {
                        double var22 = var6 ? 1.0 : byte_(var21);
                        int var24 = (int)(255.0 * var22 * var10);
                        int var25 = (int)(255.0 * var22 * var12);
                        var18++;
                        if (var24 > 3) {
                           boolean var26 = false;
                           double var27 = (double)(-var19) * var14;
                           var1.class_();
                           var1.class_(0.0, 0.0, 50.0);
                           if (((Qw_1)this.throws_.class_[20]).Pb == 5) {
                              var9 = ((cm_3)this.throws_.class_[15]).class_((rpl_3)var20.class_()) - 2;
                           }

                           if (((Qw_1)this.throws_.class_[20]).Pb != 3) {
                              class_(var1, -2, (int)(var27 - var14), var9 + 4, (int)var27, var25 << 24);
                           }

                           RenderSystem.enableBlend();
                           var1.class_(0.0, 0.0, 50.0);
                           if (!((Qw_1)this.throws_.class_[20]).PM) {
                              ((cm_3)this.throws_.class_[15])
                                 .break_(var1, (rpl_3)var20.class_(), 0.0F, (float)((int)(var27 + var16)), 16777215 + (var24 << 24));
                           } else {
                              ((cm_3)this.throws_.class_[15])
                                 .class_(var1, (rpl_3)var20.class_(), 0.0F, (float)((int)(var27 + var16)), 16777215 + (var24 << 24));
                           }

                           RenderSystem.disableAlphaTest();
                           RenderSystem.disableBlend();
                           var1.break_();
                        }
                     }
                  }
               }

               if (!this.implements_.isEmpty()) {
                  int var29 = (int)(128.0 * var10);
                  int var31 = (int)(255.0 * var12);
                  var1.class_();
                  var1.class_(0.0, 0.0, 50.0);
                  class_(var1, -2, 0, var9 + 4, 9, var31 << 24);
                  RenderSystem.enableBlend();
                  var1.class_(0.0, 0.0, 50.0);
                  ((cm_3)this.throws_.class_[15]).break_(var1, new rgn_3("chat.queue", this.implements_.size()), 0.0F, 1.0F, 16777215 + (var29 << 24));
                  var1.break_();
                  RenderSystem.disableAlphaTest();
                  RenderSystem.disableBlend();
               }

               if (var6) {
                  byte var30 = 9;
                  RenderSystem.translatef(-3.0F, 0.0F, 0.0F);
                  int var32 = var5 * var30 + var5;
                  int var33 = var18 * var30 + var18;
                  int var34 = this.finally_ * var33 / var5;
                  int var23 = var33 * var33 / var32;
                  if (var32 != var33) {
                     int var35 = var34 > 0 ? 170 : 96;
                     int var36 = this.extends_ ? 13382451 : 3355562;
                     class_(var1, 0, -var34, 2, -var34 - var23, var36 + (var35 << 24));
                     class_(var1, 2, -var34, 1, -var34 - var23, 13421772 + (var35 << 24));
                  }
               }

               RenderSystem.popMatrix();
            }
         }
      }
   }

   public void class_(rgP_2 var1) {
      this.class_(var1, null);
   }

   public void class_(boolean var1) {
      this.implements_.clear();
      this.private_.clear();
      this.catch_.clear();
      this.final_ = null;
      this.package_ = 0;
      OA var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_();
      if (var1 && var2 != null && !var2.class_(rrFR.class_()).byte_()) {
         this.case_.clear();
      }
   }

   public void class_(rgP_2 var1, UUID var2) {
      rrLh_1 var3 = rrLh_1.class_(var1, var2);
      if (!var3.byte_()) {
         this.byte_(var3.throws_());
         rrLO.class_(var1, var3.protected_(), var3.break_());
      }
   }

   public void class_(rgP_2 var1, int var2) {
      this.class_(var1, var2, ((cq_3)this.throws_.class_[19]).case_(), false);
      class_.info("[CHAT] {}", var1.getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n"));
   }

   private void class_(rgP_2 var1, int var2, int var3, boolean var4) {
      if (var2 != 0) {
         this.break_(var2);
      }

      int var5 = rfU_2.byte_((double)this.case_() / this.private_());
      List var6 = cf_3.class_(var1, var5, (cm_3)this.throws_.class_[15]);
      boolean var7 = this.extends_();

      for (rpl_3 var9 : var6) {
         if (var7 && this.finally_ > 0) {
            this.extends_ = true;
            this.class_(1.0);
         }

         this.private_.add(0, new cx_3<>(var3, var9, var2));
      }

      while (this.private_.size() > 100) {
         this.private_.remove(this.private_.size() - 1);
      }

      if (!var4) {
         this.catch_.add(0, new cx_3<>(var3, var1, var2));

         while (this.catch_.size() > 100) {
            this.catch_.remove(this.catch_.size() - 1);
         }
      }
   }

   public void break_(int var1) {
      this.private_.removeIf(var1x -> var1x.byte_() == var1);
      this.catch_.removeIf(var1x -> var1x.byte_() == var1);
   }

   public void break_(rgP_2 var1, UUID var2) {
      if (((Qw_1)this.throws_.class_[20]).try_ <= 0.0) {
         this.class_(var1, var2);
      } else {
         long var3 = System.currentTimeMillis();
         if (var3 - this.native_ >= this.native_()) {
            this.class_(var1, var2);
            this.native_ = var3;
         } else {
            this.implements_.add(var1);
         }
      }
   }

   public static int break_(double var0) {
      return rfU_2.byte_(var0 * 280.0 + 40.0);
   }

   public rgc_3 break_(double var1, double var3) {
      if (this.extends_() && !((Qw_1)this.throws_.class_[20]).g && !this.finally_()) {
         double var5 = var1 - 2.0;
         double var7 = (double)this.throws_.else_().this_()
            - var3
            - 40.0
            - (double)((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().w().new_();
         var5 = (double)rfU_2.byte_(var5 / this.private_());
         var7 = (double)rfU_2.byte_(var7 / (this.private_() * (((Qw_1)this.throws_.class_[20]).native_ + 1.0)));
         if (!(var5 < 0.0) && !(var7 < 0.0)) {
            int var9 = Math.min(this.implements_(), this.private_.size());
            if (var5 <= (double)rfU_2.byte_((double)this.case_() / this.private_()) && var7 < (double)(9 * var9 + var9)) {
               int var10 = (int)(var7 / 9.0 + (double)this.finally_);
               if (var10 >= 0 && var10 < this.private_.size()) {
                  cx_3 var11 = this.private_.get(var10);
                  return ((cm_3)this.throws_.class_[15]).break_().class_((rpl_3)var11.class_(), (int)var5);
               }
            }
         }
      }

      return null;
   }

   public void break_(rgP_2 var1) {
      this.byte_(var1);
   }

   public void throws_() {
      this.finally_ = 0;
      this.extends_ = false;
   }

   private boolean finally_() {
      return ((Qw_1)this.throws_.class_[20]).finally_ == rhJ_2.HIDDEN;
   }

   public int catch_() {
      return byte_(
         (this.extends_() ? ((Qw_1)this.throws_.class_[20]).while_ : ((Qw_1)this.throws_.class_[20]).goto_) / (((Qw_1)this.throws_.class_[20]).native_ + 1.0)
      );
   }

   private boolean extends_() {
      return (vm_3)this.throws_.class_[73] instanceof FP;
   }

   public int case_() {
      int var1 = break_(((Qw_1)this.throws_.class_[20]).public_);
      Qg_1 var2 = QY.instanceof_().else_();
      int var3 = (int)((double)(var2.extends_() - 3) / var2.return_());
      return rfU_2.class_(var1, 0, var3);
   }

   public int implements_() {
      return this.catch_() / 9;
   }

   public List<String> protected_() {
      return this.case_;
   }

   public double private_() {
      return ((Qw_1)this.throws_.class_[20]).return_;
   }

   private void volatile_() {
      if (!this.implements_.isEmpty()) {
         long var1 = System.currentTimeMillis();
         if (var1 - this.native_ >= this.native_()) {
            this.class_(this.implements_.remove());
            this.native_ = var1;
         }
      }
   }

   private long native_() {
      return (long)(((Qw_1)this.throws_.class_[20]).try_ * 1000.0);
   }
}
