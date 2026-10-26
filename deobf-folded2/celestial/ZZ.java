package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.stream.IntStream;

public class ZZ extends vm_3 implements rrvs_1 {
   private final jJ_2 id_class = new jJ_2();
   private final ryS_2 id_throws;
   private int id_case;
   private int id_catch;
   private ux_3 id_private;
   private final String[] id_implements;

   public ZZ(ryS_2 var1) {
      super(new rgn_3("sign.edit"));
      this.id_implements = IntStream.range(0, 4).mapToObj(var1::id_class).map(rgP_2::getString).toArray(String[]::new);
      this.id_throws = var1;
      vs_3.INSTANCE.id_class(this);
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (var1 == 265) {
         this.id_catch = this.id_catch - 1 & 3;
         this.id_private.id_throws();
         return true;
      } else if (var1 != 264 && var1 != 257 && var1 != 335) {
         return this.id_private.id_class(var1) ? true : super.id_class(var1, var2, var3);
      } else {
         this.id_catch = this.id_catch + 1 & 3;
         this.id_private.id_throws();
         return true;
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      HF.id_byte();
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 40, 16777215);
      var1.id_class();
      var1.id_class((double)(this.id_package / 2), 0.0, 50.0);
      float var5 = 93.75F;
      var1.id_class(93.75F, -93.75F, 93.75F);
      var1.id_class(0.0, -1.3125, 0.0);
      xc_3 var6 = this.id_throws.id_abstract();
      boolean var7 = var6.id_break() instanceof zM_2;
      if (!var7) {
         var1.id_class(0.0, -0.3125, 0.0);
      }

      boolean var8 = this.id_case / 6 % 2 == 0;
      float var9 = 0.6666667F;
      var1.id_class();
      var1.id_class(0.6666667F, -0.6666667F, -0.6666667F);
      Hd_1 var10 = this.id_volatile.id_interface().id_break();
      Ig_1 var11 = jX_2.id_class(var6.id_break());
      Ok_1 var12 = var11.id_class(var10, this.id_class::id_class);
      this.id_class.id_class.id_class(var1, var12, 15728880, fZ_2.id_class);
      if (var7) {
         this.id_class.id_break.id_class(var1, var12, 15728880, fZ_2.id_class);
      }

      var1.id_break();
      float var13 = 0.010416667F;
      var1.id_class(0.0, 0.33333334F, 0.046666667F);
      var1.id_class(0.010416667F, -0.010416667F, 0.010416667F);
      int var14 = this.id_throws.id_private().id_catch();
      int var15 = this.id_private.id_case();
      int var16 = this.id_private.id_catch();
      int var17 = this.id_catch * 10 - this.id_implements.length * 5;
      rjV_2 var18 = var1.id_byte().id_class();

      for (int var19 = 0; var19 < this.id_implements.length; var19++) {
         String var20 = this.id_implements[var19];
         if (var20 != null) {
            if (this.id_super.id_class()) {
               var20 = this.id_super.id_class(var20);
            }

            float var21 = (float)(-((cm_3)this.id_volatile.id_class[15]).id_break(var20) / 2);
            ((cm_3)this.id_volatile.id_class[15])
               .id_class(var20, var21, (float)(var19 * 10 - this.id_implements.length * 5), var14, false, var18, var10, false, 0, 15728880, false);
            if (var19 == this.id_catch && var15 >= 0 && var8) {
               int var22 = ((cm_3)this.id_volatile.id_class[15]).id_break(var20.substring(0, Math.max(Math.min(var15, var20.length()), 0)));
               int var23 = var22 - ((cm_3)this.id_volatile.id_class[15]).id_break(var20) / 2;
               if (var15 >= var20.length()) {
                  ((cm_3)this.id_volatile.id_class[15]).id_class("_", (float)var23, (float)var17, var14, false, var18, var10, false, 0, 15728880, false);
               }
            }
         }
      }

      var10.id_break();

      for (int var31 = 0; var31 < this.id_implements.length; var31++) {
         String var32 = this.id_implements[var31];
         if (var32 != null && var31 == this.id_catch && var15 >= 0) {
            int var33 = ((cm_3)this.id_volatile.id_class[15]).id_break(var32.substring(0, Math.max(Math.min(var15, var32.length()), 0)));
            int var34 = var33 - ((cm_3)this.id_volatile.id_class[15]).id_break(var32) / 2;
            if (var8 && var15 < var32.length()) {
               id_class(var1, var34, var17 - 1, var34 + 1, var17 + 9, 0xFF000000 | var14);
            }

            if (var16 != var15) {
               int var35 = Math.min(var15, var16);
               int var24 = Math.max(var15, var16);
               int var25 = ((cm_3)this.id_volatile.id_class[15]).id_break(var32.substring(0, var35))
                  - ((cm_3)this.id_volatile.id_class[15]).id_break(var32) / 2;
               int var26 = ((cm_3)this.id_volatile.id_class[15]).id_break(var32.substring(0, var24))
                  - ((cm_3)this.id_volatile.id_class[15]).id_break(var32) / 2;
               int var27 = Math.min(var25, var26);
               int var28 = Math.max(var25, var26);
               yb_3 var29 = yb_3.id_class();
               lD_2 var30 = var29.id_byte();
               RenderSystem.disableTexture();
               RenderSystem.enableColorLogicOp();
               RenderSystem.logicOp(Ma_1.OR_REVERSE);
               var30.id_class(7, ju_3.id_this);
               var30.id_class(var18, (float)var27, (float)(var17 + 9), 0.0F).id_break(0, 0, 255, 255).id_class();
               var30.id_class(var18, (float)var28, (float)(var17 + 9), 0.0F).id_break(0, 0, 255, 255).id_class();
               var30.id_class(var18, (float)var28, (float)var17, 0.0F).id_break(0, 0, 255, 255).id_class();
               var30.id_class(var18, (float)var27, (float)var17, 0.0F).id_break(0, 0, 255, 255).id_class();
               var30.id_finally();
               yk_3.id_class(var30);
               RenderSystem.disableColorLogicOp();
               RenderSystem.enableTexture();
            }
         }
      }

      var1.id_break();
      HF.id_protected();
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean id_class(char var1, int var2) {
      this.id_private.id_class(var1);
      return true;
   }

   @Override
   public void id_private() {
      this.id_case++;
      if (!this.id_throws.id_void().id_class(this.id_throws.id_abstract().id_break())) {
         this.id_native();
      }
   }

   @Override
   public void id_volatile() {
      this.id_native();
   }

   private void id_native() {
      this.id_throws.id_break();
      this.id_volatile.id_break((vm_3)null);
   }

   @Override
   public boolean aO_() {
      return true;
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      this.id_class((LF)(new LF(this.id_package / 2 - 100, this.id_int / 4 + 120, 200, 20, cN_2.id_byte, var1 -> this.id_native())));
      this.id_throws.id_class(false);
      this.id_private = new ux_3(() -> this.id_implements[this.id_catch], var1 -> {
         this.id_implements[this.id_catch] = var1;
         this.id_throws.id_class(this.id_catch, new rgN_2(var1));
      }, ux_3.id_class(this.id_volatile), ux_3.id_byte(this.id_volatile), var1 -> ((cm_3)this.id_volatile.id_class[15]).id_break(var1) <= 90);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
      Aq_1 var1 = this.id_volatile.id_void();
      if (var1 != null) {
         var1.id_class(new rZy_1(this.id_throws.id_char(), this.id_implements[0], this.id_implements[1], this.id_implements[2], this.id_implements[3]));
      }

      this.id_throws.id_class(true);
   }
}
