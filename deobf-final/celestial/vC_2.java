package celestial;

import com.google.common.hash.Hashing;
import com.mojang.blaze3d.systems.RenderSystem;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.Validate;

public class vC_2 extends vL_2 {
   private final vG_2 break_;
   private final QY byte_;
   private final Ak_1 protected_;
   private final rqO_2 throws_;
   private String case_;
   private fk_3 catch_;
   private long private_;

   private boolean byte_() {
      return true;
   }

   protected vC_2(vF_2 var1, vG_2 var2, Ak_1 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.protected_ = var3;
      this.byte_ = QY.instanceof_();
      this.throws_ = new rqO_2("servers/" + Hashing.sha1().hashUnencodedChars(var3.break_) + "/icon");
      this.catch_ = (fk_3)this.byte_.A().break_(this.throws_);
   }

   private void class_(int var1, int var2) {
      this.break_.package_().class_(var1, var2);
      this.break_.class_.class_(this.break_.package_());
      vL_2 var3 = this.break_.class_.x_().get(var2);
      this.break_.class_.class_(var3);
      vF_2.class_(this.class_, var3);
   }

   private boolean class_(String var1) {
      if (var1 == null) {
         this.byte_.A().byte_(this.throws_);
         if (this.catch_ != null && this.catch_.break_() != null) {
            this.catch_.break_().close();
         }

         this.catch_ = null;
      } else {
         try {
            fN_2 var2 = fN_2.class_(var1);
            Validate.validState(var2.class_() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState(var2.break_() == 64, "Must be 64 pixels high", new Object[0]);
            if (this.catch_ == null) {
               this.catch_ = new fk_3(var2);
            } else {
               this.catch_.class_(var2);
               this.catch_.class_();
            }

            this.byte_.A().class_(this.throws_, this.catch_);
         } catch (Throwable var3) {
            vF_2.implements_.error("Invalid icon for server {} ({})", this.protected_.class_, this.protected_.break_, var3);
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (vm_3.synchronized_()) {
         vF_2 var4 = this.break_.class_;
         int var5 = var4.x_().indexOf(this);
         if (var1 == 264 && var5 < this.break_.package_().byte_() - 1 || var1 == 265 && var5 > 0) {
            this.class_(var5, var1 == 264 ? var5 + 1 : var5 - 1);
            return true;
         }
      }

      return super.class_(var1, var2, var3);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      if (!this.protected_.private_) {
         this.protected_.private_ = true;
         this.protected_.throws_ = -2L;
         this.protected_.protected_ = rgN_2.byte_;
         this.protected_.byte_ = rgN_2.byte_;
         vF_2.class_.submit(() -> {
            try {
               this.break_.final_().class_(this.protected_, () -> this.byte_.execute(this::class_));
            } catch (UnknownHostException var2x) {
               this.protected_.throws_ = -1L;
               this.protected_.protected_ = vF_2.catch_;
            } catch (Exception var3x) {
               this.protected_.throws_ = -1L;
               this.protected_.protected_ = vF_2.private_;
            }
         });
      }

      boolean var11 = this.protected_.case_ != rqu_3.class_().getProtocolVersion();
      if (this.protected_ instanceof rrwp_3 var12) {
         int var28 = var12.private_();
         if (var28 != -1) {
            rrfD_2.byte_(var1, (float)var4, (float)var3, (float)(var5 - 5), (float)var6, ColorHelper.class_(var28, 0.1F), var28);
         }
      }

      String var27 = this.protected_.class_;
      boolean var29 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().super_();
      boolean var14 = false;
      String var15 = null;
      if (var29 && this.protected_ instanceof rrwA_2) {
         var27 = "FT";
         var14 = true;
         var15 = "celestial.su";
      }

      ((cm_3)this.byte_.class_[15]).break_(var1, var27, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
      if (var15 != null) {
         ((cm_3)this.byte_.class_[15]).break_(var1, var15, (float)(var4 + 32 + 3), (float)(var3 + 12), 8421504);
      } else {
         List var16 = ((cm_3)this.byte_.class_[15]).break_(this.protected_.protected_, var5 - 32 - 2);

         for (int var17 = 0; var17 < Math.min(var16.size(), 2); var17++) {
            ((cm_3)this.byte_.class_[15]).break_(var1, (rpl_3)var16.get(var17), (float)(var4 + 32 + 3), (float)(var3 + 12 + 9 * var17), 8421504);
         }
      }

      Object var30 = var11 ? this.protected_.catch_.case_().class_(rgF_2.RED) : this.protected_.byte_;
      int var31 = ((cm_3)this.byte_.class_[15]).class_((rgS_2)var30);
      ((cm_3)this.byte_.class_[15]).byte_(var1, (rgP_2)var30, (float)(var4 + var5 - var31 - 15 - 2), (float)(var3 + 1), 8421504);
      byte var18 = 0;
      int var19;
      List var20;
      Object var21;
      if (var11) {
         var19 = 5;
         var21 = vF_2.extends_;
         var20 = this.protected_.implements_;
      } else if (this.protected_.private_ && this.protected_.throws_ != -2L) {
         if (this.protected_.throws_ < 0L) {
            var19 = 5;
         } else if (this.protected_.throws_ < 150L) {
            var19 = 0;
         } else if (this.protected_.throws_ < 300L) {
            var19 = 1;
         } else if (this.protected_.throws_ < 600L) {
            var19 = 2;
         } else if (this.protected_.throws_ < 1000L) {
            var19 = 3;
         } else {
            var19 = 4;
         }

         if (this.protected_.throws_ < 0L) {
            var21 = vF_2.return_;
            var20 = Collections.emptyList();
         } else {
            var21 = new rgn_3("multiplayer.status.ping", this.protected_.throws_);
            var20 = this.protected_.implements_;
         }
      } else {
         var18 = 1;
         var19 = (int)(rqR_2.break_() / 100L + (long)(var2 * 2) & 7L);
         if (var19 > 4) {
            var19 = 8 - var19;
         }

         var21 = vF_2.public_;
         var20 = Collections.emptyList();
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.byte_.A().class_(ch_3.protected_);
      ch_3.class_(var1, var4 + var5 - 15, var3, (float)(var18 * 10), (float)(176 + var19 * 8), 10, 8, 256, 256);
      String var22 = this.protected_.byte_();
      if (!Objects.equals(var22, this.case_)) {
         if (this.class_(var22)) {
            this.case_ = var22;
         } else {
            this.protected_.class_((String)null);
            this.class_();
         }
      }

      if (var14) {
         this.class_(var1, var4, var3, vF_2.throws_);
      } else if (this.catch_ != null) {
         this.class_(var1, var4, var3, this.throws_);
      } else {
         this.class_(var1, var4, var3, vF_2.throws_);
      }

      int var23 = var7 - var4;
      int var24 = var8 - var3;
      if (var23 >= var5 - 15 && var23 <= var5 - 5 && var24 >= 0 && var24 <= 8) {
         this.break_.class_(Collections.singletonList((rgP_2)var21));
      } else if (var23 >= var5 - var31 - 15 - 2 && var23 <= var5 - 15 - 2 && var24 >= 0 && var24 <= 8) {
         this.break_.class_(var20);
      }

      if (((Qw_1)this.byte_.class_[20]).S || var9) {
         this.byte_.A().class_(vF_2.case_);
         ch_3.class_(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var25 = var7 - var4;
         int var26 = var8 - var3;
         if (this.byte_()) {
            if (var25 < 32 && var25 > 16) {
               ch_3.class_(var1, var4, var3, 0.0F, 32.0F, 32, 32, 256, 256);
            } else {
               ch_3.class_(var1, var4, var3, 0.0F, 0.0F, 32, 32, 256, 256);
            }
         }

         if (var2 > 0) {
            if (var25 < 16 && var26 < 16) {
               ch_3.class_(var1, var4, var3, 96.0F, 32.0F, 32, 32, 256, 256);
            } else {
               ch_3.class_(var1, var4, var3, 96.0F, 0.0F, 32, 32, 256, 256);
            }
         }

         if (var2 < this.break_.package_().byte_() - 1) {
            if (var25 < 16 && var26 > 16) {
               ch_3.class_(var1, var4, var3, 64.0F, 32.0F, 32, 32, 256, 256);
            } else {
               ch_3.class_(var1, var4, var3, 64.0F, 0.0F, 32, 32, 256, 256);
            }
         }
      }
   }

   public void class_() {
      this.break_.package_().break_();
   }

   protected void class_(Ml_1 var1, int var2, int var3, rqO_2 var4) {
      this.byte_.A().class_(var4);
      RenderSystem.enableBlend();
      ch_3.class_(var1, var2, var3, 0.0F, 0.0F, 32, 32, 32, 32);
      RenderSystem.disableBlend();
   }

   public Ak_1 break_() {
      return this.protected_;
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      double var6 = var1 - (double)this.class_.continue_();
      double var8 = var3 - (double)vF_2.class_(this.class_, this.class_.x_().indexOf(this));
      if (var6 <= 32.0) {
         if (var6 < 32.0 && var6 > 16.0 && this.byte_()) {
            this.break_.class_(this);
            this.break_.finally_();
            return true;
         }

         int var10 = this.break_.class_.x_().indexOf(this);
         if (var6 < 16.0 && var8 < 16.0 && var10 > 0) {
            this.class_(var10, var10 - 1);
            return true;
         }

         if (var6 < 16.0 && var8 > 16.0 && var10 < this.break_.package_().byte_() - 1) {
            this.class_(var10, var10 + 1);
            return true;
         }
      }

      this.break_.class_(this);
      if (rqR_2.break_() - this.private_ < 250L) {
         this.break_.finally_();
      }

      this.private_ = rqR_2.break_();
      return false;
   }
}
