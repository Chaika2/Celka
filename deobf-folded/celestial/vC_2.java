package celestial;

import com.google.common.hash.Hashing;
import com.mojang.blaze3d.systems.RenderSystem;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.Validate;

public class vC_2 extends vL_2 {
   private final vG_2 id_break;
   private final QY id_byte;
   private final Ak_1 id_protected;
   private final rqO_2 id_throws;
   private String id_case;
   private fk_3 id_catch;
   private long id_private;

   private boolean id_byte() {
      return true;
   }

   protected vC_2(vF_2 var1, vG_2 var2, Ak_1 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_protected = var3;
      this.id_byte = QY.id_instanceof();
      this.id_throws = new rqO_2("servers/" + Hashing.sha1().hashUnencodedChars(var3.id_break) + "/icon");
      this.id_catch = (fk_3)this.id_byte.A().id_break(this.id_throws);
   }

   private void id_class(int var1, int var2) {
      this.id_break.id_package().id_class(var1, var2);
      this.id_break.id_class.id_class(this.id_break.id_package());
      vL_2 var3 = this.id_break.id_class.x_().get(var2);
      this.id_break.id_class.id_class(var3);
      vF_2.id_class(this.id_class, var3);
   }

   private boolean id_class(String var1) {
      if (var1 == null) {
         this.id_byte.A().id_byte(this.id_throws);
         if (this.id_catch != null && this.id_catch.id_break() != null) {
            this.id_catch.id_break().close();
         }

         this.id_catch = null;
      } else {
         try {
            fN_2 var2 = fN_2.id_class(var1);
            Validate.validState(var2.id_class() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState(var2.id_break() == 64, "Must be 64 pixels high", new Object[0]);
            if (this.id_catch == null) {
               this.id_catch = new fk_3(var2);
            } else {
               this.id_catch.id_class(var2);
               this.id_catch.id_class();
            }

            this.id_byte.A().id_class(this.id_throws, this.id_catch);
         } catch (Throwable var3) {
            vF_2.id_implements.error("Invalid icon for server {} ({})", this.id_protected.id_class, this.id_protected.id_break, var3);
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (vm_3.id_synchronized()) {
         vF_2 var4 = this.id_break.id_class;
         int var5 = var4.x_().indexOf(this);
         if (var1 == 264 && var5 < this.id_break.id_package().id_byte() - 1 || var1 == 265 && var5 > 0) {
            this.id_class(var5, var1 == 264 ? var5 + 1 : var5 - 1);
            return true;
         }
      }

      return super.id_class(var1, var2, var3);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      if (!this.id_protected.id_private) {
         this.id_protected.id_private = true;
         this.id_protected.id_throws = -2L;
         this.id_protected.id_protected = rgN_2.id_byte;
         this.id_protected.id_byte = rgN_2.id_byte;
         vF_2.id_class.submit(() -> {
            try {
               this.id_break.id_final().id_class(this.id_protected, () -> this.id_byte.execute(this::id_class));
            } catch (UnknownHostException var2x) {
               this.id_protected.id_throws = -1L;
               this.id_protected.id_protected = vF_2.id_catch;
            } catch (Exception var3x) {
               this.id_protected.id_throws = -1L;
               this.id_protected.id_protected = vF_2.id_private;
            }
         });
      }

      boolean var11 = this.id_protected.id_case != rqu_3.id_class().getProtocolVersion();
      if (this.id_protected instanceof rrwp_3 var12) {
         int var28 = var12.id_private();
         if (var28 != -1) {
            rrfD_2.id_byte(var1, (float)var4, (float)var3, (float)(var5 - 5), (float)var6, ColorHelper.id_class(var28, 0.1F), var28);
         }
      }

      String var27 = this.id_protected.id_class;
      boolean var29 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_super();
      boolean var14 = false;
      String var15 = null;
      if (var29 && this.id_protected instanceof rrwA_2) {
         var27 = "FT";
         var14 = true;
         var15 = "celestial.su";
      }

      ((cm_3)this.id_byte.id_class[15]).id_break(var1, var27, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
      if (var15 != null) {
         ((cm_3)this.id_byte.id_class[15]).id_break(var1, var15, (float)(var4 + 32 + 3), (float)(var3 + 12), 8421504);
      } else {
         List var16 = ((cm_3)this.id_byte.id_class[15]).id_break(this.id_protected.id_protected, var5 - 32 - 2);

         for (int var17 = 0; var17 < Math.min(var16.size(), 2); var17++) {
            ((cm_3)this.id_byte.id_class[15]).id_break(var1, (rpl_3)var16.get(var17), (float)(var4 + 32 + 3), (float)(var3 + 12 + 9 * var17), 8421504);
         }
      }

      Object var30 = var11 ? this.id_protected.id_catch.id_case().id_class(rgF_2.RED) : this.id_protected.id_byte;
      int var31 = ((cm_3)this.id_byte.id_class[15]).id_class((rgS_2)var30);
      ((cm_3)this.id_byte.id_class[15]).id_byte(var1, (rgP_2)var30, (float)(var4 + var5 - var31 - 15 - 2), (float)(var3 + 1), 8421504);
      byte var18 = 0;
      int var19;
      List var20;
      Object var21;
      if (var11) {
         var19 = 5;
         var21 = vF_2.id_extends;
         var20 = this.id_protected.id_implements;
      } else if (this.id_protected.id_private && this.id_protected.id_throws != -2L) {
         if (this.id_protected.id_throws < 0L) {
            var19 = 5;
         } else if (this.id_protected.id_throws < 150L) {
            var19 = 0;
         } else if (this.id_protected.id_throws < 300L) {
            var19 = 1;
         } else if (this.id_protected.id_throws < 600L) {
            var19 = 2;
         } else if (this.id_protected.id_throws < 1000L) {
            var19 = 3;
         } else {
            var19 = 4;
         }

         if (this.id_protected.id_throws < 0L) {
            var21 = vF_2.id_return;
            var20 = Collections.emptyList();
         } else {
            var21 = new rgn_3("multiplayer.status.ping", this.id_protected.id_throws);
            var20 = this.id_protected.id_implements;
         }
      } else {
         var18 = 1;
         var19 = (int)(rqR_2.id_break() / 100L + (long)(var2 * 2) & 7L);
         if (var19 > 4) {
            var19 = 8 - var19;
         }

         var21 = vF_2.id_public;
         var20 = Collections.emptyList();
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_byte.A().id_class(ch_3.id_protected);
      ch_3.id_class(var1, var4 + var5 - 15, var3, (float)(var18 * 10), (float)(176 + var19 * 8), 10, 8, 256, 256);
      String var22 = this.id_protected.id_byte();
      if (!Objects.equals(var22, this.id_case)) {
         if (this.id_class(var22)) {
            this.id_case = var22;
         } else {
            this.id_protected.id_class((String)null);
            this.id_class();
         }
      }

      if (var14) {
         this.id_class(var1, var4, var3, vF_2.id_throws);
      } else if (this.id_catch != null) {
         this.id_class(var1, var4, var3, this.id_throws);
      } else {
         this.id_class(var1, var4, var3, vF_2.id_throws);
      }

      int var23 = var7 - var4;
      int var24 = var8 - var3;
      if (var23 >= var5 - 15 && var23 <= var5 - 5 && var24 >= 0 && var24 <= 8) {
         this.id_break.id_class(Collections.singletonList((rgP_2)var21));
      } else if (var23 >= var5 - var31 - 15 - 2 && var23 <= var5 - 15 - 2 && var24 >= 0 && var24 <= 8) {
         this.id_break.id_class(var20);
      }

      if (((Qw_1)this.id_byte.id_class[20]).S || var9) {
         this.id_byte.A().id_class(vF_2.id_case);
         ch_3.id_class(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var25 = var7 - var4;
         int var26 = var8 - var3;
         if (this.id_byte()) {
            if (var25 < 32 && var25 > 16) {
               ch_3.id_class(var1, var4, var3, 0.0F, 32.0F, 32, 32, 256, 256);
            } else {
               ch_3.id_class(var1, var4, var3, 0.0F, 0.0F, 32, 32, 256, 256);
            }
         }

         if (var2 > 0) {
            if (var25 < 16 && var26 < 16) {
               ch_3.id_class(var1, var4, var3, 96.0F, 32.0F, 32, 32, 256, 256);
            } else {
               ch_3.id_class(var1, var4, var3, 96.0F, 0.0F, 32, 32, 256, 256);
            }
         }

         if (var2 < this.id_break.id_package().id_byte() - 1) {
            if (var25 < 16 && var26 > 16) {
               ch_3.id_class(var1, var4, var3, 64.0F, 32.0F, 32, 32, 256, 256);
            } else {
               ch_3.id_class(var1, var4, var3, 64.0F, 0.0F, 32, 32, 256, 256);
            }
         }
      }
   }

   public void id_class() {
      this.id_break.id_package().id_break();
   }

   protected void id_class(Ml_1 var1, int var2, int var3, rqO_2 var4) {
      this.id_byte.A().id_class(var4);
      RenderSystem.enableBlend();
      ch_3.id_class(var1, var2, var3, 0.0F, 0.0F, 32, 32, 32, 32);
      RenderSystem.disableBlend();
   }

   public Ak_1 id_break() {
      return this.id_protected;
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      double var6 = var1 - (double)this.id_class.id_continue();
      double var8 = var3 - (double)vF_2.id_class(this.id_class, this.id_class.x_().indexOf(this));
      if (var6 <= 32.0) {
         if (var6 < 32.0 && var6 > 16.0 && this.id_byte()) {
            this.id_break.id_class(this);
            this.id_break.id_finally();
            return true;
         }

         int var10 = this.id_break.id_class.x_().indexOf(this);
         if (var6 < 16.0 && var8 < 16.0 && var10 > 0) {
            this.id_class(var10, var10 - 1);
            return true;
         }

         if (var6 < 16.0 && var8 > 16.0 && var10 < this.id_break.id_package().id_byte() - 1) {
            this.id_class(var10, var10 + 1);
            return true;
         }
      }

      this.id_break.id_class(this);
      if (rqR_2.id_break() - this.id_private < 250L) {
         this.id_break.id_finally();
      }

      this.id_private = rqR_2.id_break();
      return false;
   }
}
