package celestial;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class cD_2 extends ch_3 {
   private final QY id_class;
   private final ca_3 id_throws;
   private final cU_2 id_case;
   private final int id_catch;
   private final OT id_private;
   private final OU id_implements;
   private final rdn_3 id_finally;
   private final rgP_2 id_extends;
   private final co_3 id_native;
   private final Map<OT, co_3> id_volatile = Maps.newLinkedHashMap();
   private double id_final;
   private double id_package;
   private int id_int = Integer.MAX_VALUE;
   private int id_new = Integer.MAX_VALUE;
   private int id_continue = Integer.MIN_VALUE;
   private int id_super = Integer.MIN_VALUE;
   private float id_this;
   private boolean id_else;

   public void id_byte(Ml_1 var1, int var2, int var3, int var4, int var5) {
      RenderSystem.pushMatrix();
      RenderSystem.translatef(0.0F, 0.0F, 200.0F);
      id_class(var1, 0, 0, 234, 113, rfU_2.id_protected(this.id_this * 255.0F) << 24);
      boolean var6 = false;
      int var7 = rfU_2.id_byte(this.id_final);
      int var8 = rfU_2.id_byte(this.id_package);
      if (var2 > 0 && var2 < 234 && var3 > 0 && var3 < 113) {
         for (co_3 var10 : this.id_volatile.values()) {
            if (var10.id_break(var7, var8, var2, var3)) {
               var6 = true;
               var10.id_class(var1, var7, var8, this.id_this, var4, var5);
               break;
            }
         }
      }

      RenderSystem.popMatrix();
      if (var6) {
         this.id_this = rfU_2.id_class(this.id_this + 0.02F, 0.0F, 0.3F);
      } else {
         this.id_this = rfU_2.id_class(this.id_this - 0.04F, 0.0F, 1.0F);
      }
   }

   public cD_2(QY var1, ca_3 var2, cU_2 var3, int var4, OT var5, OU var6) {
      this.id_class = var1;
      this.id_throws = var2;
      this.id_case = var3;
      this.id_catch = var4;
      this.id_private = var5;
      this.id_implements = var6;
      this.id_finally = var6.id_byte();
      this.id_extends = var6.id_class();
      this.id_native = new co_3(this, var1, var5, var6);
      this.id_class(this.id_native, var5);
   }

   public void id_class(double var1, double var3) {
      if (this.id_continue - this.id_int > 234) {
         this.id_final = rfU_2.id_class(this.id_final + var1, (double)(-(this.id_continue - 234)), 0.0);
      }

      if (this.id_super - this.id_new > 113) {
         this.id_package = rfU_2.id_class(this.id_package + var3, (double)(-(this.id_super - 113)), 0.0);
      }
   }

   public boolean id_class(int var1, int var2, double var3, double var5) {
      return this.id_case.id_class(var1, var2, this.id_catch, var3, var5);
   }

   public static cD_2 id_class(QY var0, ca_3 var1, int var2, OT var3) {
      if (var3.id_byte() == null) {
         return null;
      } else {
         for (cU_2 var7 : cU_2.values()) {
            if (var2 < var7.id_class()) {
               return new cD_2(var0, var1, var7, var2, var3, var3.id_byte());
            }

            var2 -= var7.id_class();
         }

         return null;
      }
   }

   private void id_class(co_3 var1, OT var2) {
      this.id_volatile.put(var2, var1);
      int var3 = var1.id_throws();
      int var4 = var3 + 28;
      int var5 = var1.id_protected();
      int var6 = var5 + 27;
      this.id_int = Math.min(this.id_int, var3);
      this.id_continue = Math.max(this.id_continue, var4);
      this.id_new = Math.min(this.id_new, var5);
      this.id_super = Math.max(this.id_super, var6);

      for (co_3 var8 : this.id_volatile.values()) {
         var8.id_class();
      }
   }

   public void id_class(OT var1) {
      if (var1.id_byte() != null) {
         co_3 var2 = new co_3(this, this.id_class, var1, var1.id_byte());
         this.id_class(var2, var1);
      }
   }

   public OT id_class() {
      return this.id_private;
   }

   public void id_class(Ml_1 var1, int var2, int var3, boolean var4) {
      this.id_case.id_class(var1, this, var2, var3, var4, this.id_catch);
   }

   public void id_class(int var1, int var2, Hz_1 var3) {
      this.id_case.id_class(var1, var2, this.id_catch, var3, this.id_finally);
   }

   public void id_class(Ml_1 var1) {
      if (!this.id_else) {
         this.id_final = (double)(117 - (this.id_continue + this.id_int) / 2);
         this.id_package = (double)(56 - (this.id_super + this.id_new) / 2);
         this.id_else = true;
      }

      RenderSystem.pushMatrix();
      RenderSystem.enableDepthTest();
      RenderSystem.translatef(0.0F, 0.0F, 950.0F);
      RenderSystem.colorMask(false, false, false, false);
      id_class(var1, 4680, 2260, -4680, -2260, -16777216);
      RenderSystem.colorMask(true, true, true, true);
      RenderSystem.translatef(0.0F, 0.0F, -950.0F);
      RenderSystem.depthFunc(518);
      id_class(var1, 234, 113, 0, 0, -16777216);
      RenderSystem.depthFunc(515);
      rqO_2 var2 = this.id_implements.id_protected();
      if (var2 != null) {
         this.id_class.A().id_class(var2);
      } else {
         this.id_class.A().id_class(fY_2.id_class);
      }

      int var3 = rfU_2.id_byte(this.id_final);
      int var4 = rfU_2.id_byte(this.id_package);
      int var5 = var3 % 16;
      int var6 = var4 % 16;

      for (int var7 = -1; var7 <= 15; var7++) {
         for (int var8 = -1; var8 <= 8; var8++) {
            id_class(var1, var5 + 16 * var7, var6 + 16 * var8, 0.0F, 0.0F, 16, 16, 16, 16);
         }
      }

      this.id_native.id_class(var1, var3, var4, true);
      this.id_native.id_class(var1, var3, var4, false);
      this.id_native.id_class(var1, var3, var4);
      RenderSystem.depthFunc(518);
      RenderSystem.translatef(0.0F, 0.0F, -950.0F);
      RenderSystem.colorMask(false, false, false, false);
      id_class(var1, 4680, 2260, -4680, -2260, -16777216);
      RenderSystem.colorMask(true, true, true, true);
      RenderSystem.translatef(0.0F, 0.0F, 950.0F);
      RenderSystem.depthFunc(515);
      RenderSystem.popMatrix();
   }

   public co_3 id_break(OT var1) {
      return this.id_volatile.get(var1);
   }

   public ca_3 id_throws() {
      return this.id_throws;
   }

   public rgP_2 id_protected() {
      return this.id_extends;
   }
}
