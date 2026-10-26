package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.List;

public class vz_3 extends vm_3 {
   public static final vN_2 class_ = new vQ_2();
   public static final rqO_2 throws_ = new rqO_2("textures/gui/book.png");
   private vN_2 case_;
   private int catch_;
   private List<rpl_3> private_ = Collections.emptyList();
   private int implements_ = -1;
   private rgP_2 finally_ = rgN_2.byte_;
   private Ln_1 else_;
   private Ln_1 synchronized_;
   private final boolean return_;

   public boolean byte_(int var1) {
      int var2 = rfU_2.class_(var1, 0, this.case_.class_() - 1);
      if (var2 != this.catch_) {
         this.catch_ = var2;
         this.interface_();
         this.implements_ = -1;
         return true;
      } else {
         return false;
      }
   }

   protected void int_() {
      int var1 = (this.package_ - 192) / 2;
      byte var2 = 2;
      this.else_ = this.class_(new Ln_1(var1 + 116, 159, true, var1x -> this.package_(), this.return_));
      this.synchronized_ = this.class_(new Ln_1(var1 + 43, 159, false, var1x -> this.final_(), this.return_));
      this.interface_();
   }

   public vz_3(vN_2 var1) {
      this(var1, true);
   }

   public vz_3() {
      this(class_, false);
   }

   private vz_3(vN_2 var1, boolean var2) {
      super(rgN_2.byte_);
      this.case_ = var1;
      this.return_ = var2;
   }

   private void interface_() {
      this.else_.new_ = this.catch_ < this.finally_() - 1;
      this.synchronized_.new_ = this.catch_ > 0;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(throws_);
      int var5 = (this.package_ - 192) / 2;
      byte var6 = 2;
      this.break_(var1, var5, 2, 0, 0, 192, 192);
      if (this.implements_ != this.catch_) {
         rgS_2 var7 = this.case_.break_(this.catch_);
         this.private_ = this.super_.break_(var7, 114);
         this.finally_ = new rgn_3("book.pageIndicator", this.catch_ + 1, Math.max(this.finally_(), 1));
      }

      this.implements_ = this.catch_;
      int var11 = this.super_.class_(this.finally_);
      this.super_.byte_(var1, this.finally_, (float)(var5 - var11 + 192 - 44), 18.0F, 0);
      int var8 = Math.min(14, this.private_.size());

      for (int var9 = 0; var9 < var8; var9++) {
         rpl_3 var10 = this.private_.get(var9);
         this.super_.break_(var1, var10, (float)(var5 + 36), (float)(32 + var9 * 9), 0);
      }

      rgc_3 var12 = this.protected_((double)var2, (double)var3);
      if (var12 != null) {
         this.class_(var1, var12, var2, var3);
      }

      super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (super.class_(var1, var2, var3)) {
         return true;
      } else {
         switch (var1) {
            case 266:
               this.synchronized_.catch_();
               return true;
            case 267:
               this.else_.catch_();
               return true;
            default:
               return false;
         }
      }
   }

   public static List<String> class_(rcd_3 var0) {
      rcy_3 var1 = var0.protected_("pages", 8).protected_();
      Builder var2 = ImmutableList.builder();

      for (int var3 = 0; var3 < var1.size(); var3++) {
         var2.add(var1.implements_(var3));
      }

      return var2.build();
   }

   @Override
   public boolean class_(rgc_3 var1) {
      rgl_3 var2 = var1.private_();
      if (var2 == null) {
         return false;
      } else if (var2.class_() == rgH_2.CHANGE_PAGE) {
         String var6 = var2.break_();

         try {
            int var4 = Integer.parseInt(var6) - 1;
            return this.break_(var4);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean var3 = super.class_(var1);
         if (var3 && var2.class_() == rgH_2.RUN_COMMAND) {
            this.volatile_.break_((vm_3)null);
         }

         return var3;
      }
   }

   public void class_(vN_2 var1) {
      this.case_ = var1;
      this.catch_ = rfU_2.class_(this.catch_, 0, var1.class_());
      this.interface_();
      this.implements_ = -1;
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (var5 == 0) {
         rgc_3 var6 = this.protected_(var1, var3);
         if (var6 != null && this.class_(var6)) {
            return true;
         }
      }

      return super.break_(var1, var3, var5);
   }

   protected boolean break_(int var1) {
      return this.byte_(var1);
   }

   private int finally_() {
      return this.case_.class_();
   }

   protected void package_() {
      if (this.catch_ < this.finally_() - 1) {
         this.catch_++;
      }

      this.interface_();
   }

   public rgc_3 protected_(double var1, double var3) {
      if (this.private_.isEmpty()) {
         return null;
      } else {
         int var5 = rfU_2.byte_(var1 - (double)((this.package_ - 192) / 2) - 36.0);
         int var6 = rfU_2.byte_(var3 - 2.0 - 30.0);
         if (var5 >= 0 && var6 >= 0) {
            int var7 = Math.min(14, this.private_.size());
            if (var5 <= 114 && var6 < 9 * var7 + var7) {
               int var8 = var6 / 9;
               if (var8 >= 0 && var8 < this.private_.size()) {
                  rpl_3 var9 = this.private_.get(var8);
                  return ((cm_3)this.volatile_.class_[15]).break_().class_(var9, var5);
               } else {
                  return null;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   protected void final_() {
      if (this.catch_ > 0) {
         this.catch_--;
      }

      this.interface_();
   }

   protected void native_() {
      this.class_((LF)(new LF(this.package_ / 2 - 100, 196, 200, 20, cN_2.byte_, var1 -> this.volatile_.break_((vm_3)null))));
   }

   @Override
   protected void v_() {
      this.native_();
      this.int_();
   }
}
