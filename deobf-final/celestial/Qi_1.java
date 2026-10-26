package celestial;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import org.lwjgl.glfw.GLFWDropCallback;

public class Qi_1 {
   private final QY class_;
   private boolean break_;
   private boolean byte_;
   private boolean protected_;
   private double throws_;
   private double case_;
   private int catch_;
   private int private_ = -1;
   private boolean implements_ = true;
   private int finally_;
   private double extends_;
   private double native_;
   private double volatile_;
   private double final_;
   private boolean package_;

   public double byte_() {
      return this.throws_;
   }

   public void byte_(boolean var1) {
      this.package_ = var1;
   }

   public Qi_1(QY var1) {
      this.class_ = var1;
   }

   private void class_(long var1, double var3) {
      if (var1 == QY.instanceof_().else_().implements_()) {
         double var5 = (((Qw_1)this.class_.class_[20]).double_ ? Math.signum(var3) : var3) * ((Qw_1)this.class_.class_[20]).long_;
         if ((cT_2)this.class_.class_[75] == null) {
            if ((vm_3)this.class_.class_[73] != null) {
               double var7 = this.throws_ * (double)this.class_.else_().super_() / (double)this.class_.else_().new_();
               double var9 = this.case_ * (double)this.class_.else_().this_() / (double)this.class_.else_().continue_();
               ((vm_3)this.class_.class_[73]).class_(var7, var9, var5);
            } else if ((cb_3)this.class_.class_[57] != null) {
               if (this.final_ != 0.0 && Math.signum(var5) != Math.signum(this.final_)) {
                  this.final_ = 0.0;
               }

               this.final_ += var5;
               float var11 = (float)((int)this.final_);
               if (var11 == 0.0F) {
                  return;
               }

               this.final_ -= (double)var11;
               if (((cb_3)this.class_.class_[57]).native_()) {
                  if (((cq_3)this.class_.class_[19]).private_().class_()) {
                     ((cq_3)this.class_.class_[19]).private_().class_((double)(-var11));
                  } else {
                     float var8 = rfU_2.class_(((rhx_3)((cb_3)this.class_.class_[57]).implements_[18]).class_() + var11 * 0.005F, 0.0F, 0.2F);
                     ((rhx_3)((cb_3)this.class_.class_[57]).implements_[18]).class_(var8);
                  }
               } else {
                  ((rhz_3)((cb_3)this.class_.class_[57]).implements_[1]).class_((double)var11);
               }
            }
         }
      }
   }

   private void class_(long var1, int var3, int var4, int var5) {
      if (var1 == this.class_.else_().implements_()) {
         boolean var6 = var4 == 1;
         if ((Boolean)QY.break_[2] && var3 == 0) {
            if (var6) {
               if ((var5 & 2) == 2) {
                  var3 = 1;
                  this.catch_++;
               }
            } else if (this.catch_ > 0) {
               var3 = 1;
               this.catch_--;
            }
         }

         int var7 = var3;
         Va_1 var8 = Vi_1.MOUSE.class_(var7);
         rrLs_1 var9 = rrLs_1.class_(var8, var7, var4);
         if (var9.byte_()) {
            return;
         }

         if (var6) {
            if (((Qw_1)this.class_.class_[20]).S && this.finally_++ > 0) {
               return;
            }

            this.private_ = var7;
            this.extends_ = gb_3.break_();
         } else if (this.private_ != -1) {
            if (((Qw_1)this.class_.class_[20]).S && --this.finally_ > 0) {
               return;
            }

            this.private_ = -1;
         }

         boolean[] var10 = new boolean[]{false};
         if ((cT_2)this.class_.class_[75] == null) {
            if ((vm_3)this.class_.class_[73] == null) {
               if (!this.package_ && var6) {
                  this.catch_();
               }
            } else {
               double var11 = this.throws_ * (double)this.class_.else_().super_() / (double)this.class_.else_().new_();
               double var13 = this.case_ * (double)this.class_.else_().this_() / (double)this.class_.else_().continue_();
               if (var6) {
                  vm_3.class_(
                     () -> var10[0] = ((vm_3)this.class_.class_[73]).break_(var11, var13, var7),
                     "mouseClicked event handler",
                     ((vm_3)this.class_.class_[73]).getClass().getCanonicalName()
                  );
               } else {
                  vm_3.class_(
                     () -> var10[0] = ((vm_3)this.class_.class_[73]).class_(var11, var13, var7),
                     "mouseReleased event handler",
                     ((vm_3)this.class_.class_[73]).getClass().getCanonicalName()
                  );
               }
            }
         }

         if (!var10[0] && ((vm_3)this.class_.class_[73] == null || ((vm_3)this.class_.class_[73]).continue_) && (cT_2)this.class_.class_[75] == null) {
            if (var7 == 0) {
               this.break_ = var6;
            } else if (var7 == 2) {
               this.byte_ = var6;
            } else if (var7 == 1) {
               this.protected_ = var6;
            }

            Vu_1.class_(var8, var6);
            if (var6) {
               rrLB.break_((rrLS)rrLS.staticFields5263c46d9cc33ff8a76200218759034b[0], var7, Ve_1.class_(QY.instanceof_().else_().implements_(), 292));
               if (((cb_3)this.class_.class_[57]).native_() && var7 == 2) {
                  ((cq_3)this.class_.class_[19]).private_().protected_();
               } else {
                  Vu_1.class_(var8);
               }
            }
         }
      }
   }

   public boolean class_() {
      return this.break_;
   }

   public void class_(boolean var1) {
      if (this.case_() && this.class_.static_()) {
         double var11 = ((Qw_1)this.class_.class_[20]).class_ * 0.6F + 0.2F;
         double var4 = var11 * var11 * var11 * 8.0;
         double var6 = this.native_ * var4;
         double var8 = this.volatile_ * var4;
         this.native_ = 0.0;
         this.volatile_ = 0.0;
         byte var10 = 1;
         if (((Qw_1)this.class_.class_[20]).for_) {
            var10 = -1;
         }

         if ((cb_3)this.class_.class_[57] != null) {
            ((cb_3)this.class_.class_[57]).class_(var6, var8 * (double)var10);
         }
      } else {
         if ((cb_3)this.class_.class_[57] != null) {
            aF_2 var2 = ((cb_3)this.class_.class_[57]).s();
            if (var2 != null) {
               var2.class_((Float)((cb_3)this.class_.class_[57]).throws_[15], (Float)((cb_3)this.class_.class_[57]).throws_[16]);
            }
         }

         this.native_ = 0.0;
         this.volatile_ = 0.0;
      }

      if (!var1 && (cb_3)this.class_.class_[57] != null) {
         ((cb_3)this.class_.class_[57]).class_(rrAX.class_().break_());
      }
   }

   private void class_(long var1, double var3, double var5) {
      if (var1 == QY.instanceof_().else_().implements_()) {
         if (this.implements_) {
            this.throws_ = var3;
            this.case_ = var5;
            this.implements_ = false;
         }

         vm_3 var7 = (vm_3)this.class_.class_[73];
         if (var7 != null && (cT_2)this.class_.class_[75] == null) {
            double var8 = var3 * (double)this.class_.else_().super_() / (double)this.class_.else_().new_();
            double var10 = var5 * (double)this.class_.else_().this_() / (double)this.class_.else_().continue_();
            vm_3.class_(() -> var7.class_(var8, var10), "mouseMoved event handler", var7.getClass().getCanonicalName());
            if (this.private_ != -1 && this.extends_ > 0.0) {
               double var12 = (var3 - this.throws_) * (double)this.class_.else_().super_() / (double)this.class_.else_().new_();
               double var14 = (var5 - this.case_) * (double)this.class_.else_().this_() / (double)this.class_.else_().continue_();
               vm_3.class_(() -> var7.class_(var8, var10, this.private_, var12, var14), "mouseDragged event handler", var7.getClass().getCanonicalName());
            }
         }

         if (this.case_() && this.class_.static_()) {
            this.native_ = this.native_ + (var3 - this.throws_);
            this.volatile_ = this.volatile_ + (var5 - this.case_);
         }

         this.class_(true);
         this.throws_ = var3;
         this.case_ = var5;
      }
   }

   public void class_(long var1) {
      Ve_1.class_(
         var1,
         (var1x, var3, var5) -> this.class_.execute(() -> this.class_(var1x, var3, var5)),
         (var1x, var3, var4, var5) -> this.class_.execute(() -> this.class_(var1x, var3, var4, var5)),
         (var1x, var3, var5) -> this.class_.execute(() -> this.class_(var1x, var5)),
         (var1x, var3, var4) -> {
            Path[] var6 = new Path[var3];

            for (int var7 = 0; var7 < var3; var7++) {
               var6[var7] = Paths.get(GLFWDropCallback.getName(var4, var7));
            }

            this.class_.execute(() -> this.class_(Arrays.asList(var6)));
         }
      );
   }

   private void class_(List<Path> var1) {
      if ((vm_3)this.class_.class_[73] != null) {
         ((vm_3)this.class_.class_[73]).a_(var1);
      }
   }

   public void break_(boolean var1) {
      if (this.class_.static_() && !this.package_) {
         if (!(Boolean)QY.break_[2]) {
            Vu_1.class_();
         }

         this.package_ = true;
         this.throws_ = (double)(this.class_.else_().new_() / 2);
         this.case_ = (double)(this.class_.else_().continue_() / 2);
         Ve_1.class_(this.class_.else_().implements_(), 212995, this.throws_, this.case_);
         if (var1) {
            this.class_.break_(null);
         }

         QY var10000 = this.class_;
         Integer var6 = 10000;
         var10000.class_[66] = var6;
         this.implements_ = true;
      }
   }

   public boolean break_() {
      return this.protected_;
   }

   public void throws_() {
      this.implements_ = true;
   }

   public void catch_() {
      this.break_(true);
   }

   public boolean case_() {
      return this.package_;
   }

   public void implements_() {
      this.implements_ = true;
   }

   public double protected_() {
      return this.case_;
   }

   public void private_() {
      if (this.package_) {
         this.package_ = false;
         this.throws_ = (double)(this.class_.else_().new_() / 2);
         this.case_ = (double)(this.class_.else_().continue_() / 2);
         Ve_1.class_(this.class_.else_().implements_(), 212993, this.throws_, this.case_);
      }
   }
}
