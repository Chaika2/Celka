package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Random;

public class Zn_1 extends Fu_1<rJE> {
   private static final rqO_2 id_boolean = new rqO_2("textures/gui/container/enchanting_table.png");
   private static final rqO_2 id_transient = new rqO_2("textures/entity/enchanting_table_book.png");
   private static final tm_3 id_for = new tm_3();
   private final Random id_double = new Random();
   public int id_class;
   public float id_throws;
   public float id_case;
   public float id_catch;
   public float id_private;
   public float id_implements;
   public float id_finally;
   private rdn_3 id_switch = rdn_3.id_break;

   public Zn_1(rJE var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      HF.id_byte();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_boolean);
      int var5 = (this.id_package - this.id_synchronized) / 2;
      int var6 = (this.id_int - this.id_return) / 2;
      this.id_break(var1, var5, var6, 0, 0, this.id_synchronized, this.id_return);
      RenderSystem.matrixMode(5889);
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      int var7 = (int)this.id_volatile.id_else().id_return();
      RenderSystem.viewport((this.id_package - 320) / 2 * var7, (this.id_int - 240) / 2 * var7, 320 * var7, 240 * var7);
      RenderSystem.translatef(-0.34F, 0.23F, 0.0F);
      RenderSystem.multMatrix(rjV_2.id_class(90.0, 1.3333334F, 9.0F, 80.0F));
      RenderSystem.matrixMode(5888);
      var1.id_class();
      MH var8 = var1.id_byte();
      var8.id_class().id_class();
      var8.id_break().id_byte();
      var1.id_class(0.0, 3.3F, 1984.0);
      float var9 = 5.0F;
      var1.id_class(5.0F, 5.0F, 5.0F);
      var1.id_class(rje_3.id_case.id_byte(180.0F));
      var1.id_class(rje_3.id_break.id_byte(20.0F));
      float var10 = rfU_2.id_catch(var2, this.id_finally, this.id_implements);
      var1.id_class((double)((1.0F - var10) * 0.2F), (double)((1.0F - var10) * 0.1F), (double)((1.0F - var10) * 0.25F));
      float var11 = -(1.0F - var10) * 90.0F - 90.0F;
      var1.id_class(rje_3.id_protected.id_byte(var11));
      var1.id_class(rje_3.id_break.id_byte(180.0F));
      float var12 = rfU_2.id_catch(var2, this.id_case, this.id_throws) + 0.25F;
      float var13 = rfU_2.id_catch(var2, this.id_case, this.id_throws) + 0.75F;
      var12 = (var12 - (float)rfU_2.id_break((double)var12)) * 1.6F - 0.3F;
      var13 = (var13 - (float)rfU_2.id_break((double)var13)) * 1.6F - 0.3F;
      if (var12 < 0.0F) {
         var12 = 0.0F;
      }

      if (var13 < 0.0F) {
         var13 = 0.0F;
      }

      if (var12 > 1.0F) {
         var12 = 1.0F;
      }

      if (var13 > 1.0F) {
         var13 = 1.0F;
      }

      RenderSystem.enableRescaleNormal();
      id_for.id_class(0.0F, var12, var13, var10);
      Hd_1 var14 = Hx_1.id_class(yb_3.id_class().id_byte());
      Ok_1 var15 = var14.getBuffer(id_for.id_class(id_transient));
      id_for.id_class(var1, var15, 15728880, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
      var14.id_break();
      var1.id_break();
      RenderSystem.matrixMode(5889);
      RenderSystem.viewport(0, 0, this.id_volatile.id_else().id_extends(), this.id_volatile.id_else().id_native());
      RenderSystem.popMatrix();
      RenderSystem.matrixMode(5888);
      HF.id_protected();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      rph_3.id_class().id_class((long)this.id_instanceof.id_break());
      int var16 = this.id_instanceof.id_class();

      for (int var17 = 0; var17 < 3; var17++) {
         int var18 = var5 + 60;
         int var19 = var18 + 20;
         this.id_class(0);
         this.id_volatile.A().id_class(id_boolean);
         int var20 = this.id_instanceof.id_class[var17];
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         if (var20 == 0) {
            this.id_break(var1, var18, var6 + 14 + 19 * var17, 0, 185, 108, 19);
         } else {
            String var21 = var20 + "";
            int var22 = 86 - this.id_super.id_break(var21);
            rgS_2 var23 = rph_3.id_class().id_class(this.id_super, var22);
            int var24 = 6839882;
            if ((var16 < var17 + 1 || (Integer)((cb_3)this.id_volatile.id_class[57]).id_implements[19] < var20)
               && !((rhx_3)((cb_3)this.id_volatile.id_class[57]).id_implements[18]).id_protected) {
               this.id_break(var1, var18, var6 + 14 + 19 * var17, 0, 185, 108, 19);
               this.id_break(var1, var18 + 1, var6 + 15 + 19 * var17, 16 * var17, 239, 16, 16);
               this.id_super.id_class(var23, var19, var6 + 16 + 19 * var17, var22, (var24 & 16711422) >> 1);
               var24 = 4226832;
            } else {
               int var25 = var3 - (var5 + 60);
               int var26 = var4 - (var6 + 14 + 19 * var17);
               if (var25 >= 0 && var26 >= 0 && var25 < 108 && var26 < 19) {
                  this.id_break(var1, var18, var6 + 14 + 19 * var17, 0, 204, 108, 19);
                  var24 = 16777088;
               } else {
                  this.id_break(var1, var18, var6 + 14 + 19 * var17, 0, 166, 108, 19);
               }

               this.id_break(var1, var18 + 1, var6 + 15 + 19 * var17, 16 * var17, 223, 16, 16);
               this.id_super.id_class(var23, var19, var6 + 16 + 19 * var17, var22, var24);
               var24 = 8453920;
            }

            this.id_super.id_class(var1, var21, (float)(var19 + 86 - this.id_super.id_break(var21)), (float)(var6 + 16 + 19 * var17 + 7), var24);
         }
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      var4 = this.id_volatile.X();
      this.id_class(var1);
      super.id_class(var1, var2, var3, var4);
      this.id_break(var1, var2, var3);
      boolean var5 = ((rhx_3)((cb_3)this.id_volatile.id_class[57]).id_implements[18]).id_protected;
      int var6 = this.id_instanceof.id_class();

      for (int var7 = 0; var7 < 3; var7++) {
         int var8 = this.id_instanceof.id_class[var7];
         ev_3 var9 = ev_3.id_byte(this.id_instanceof.id_break[var7]);
         int var10 = this.id_instanceof.id_byte[var7];
         int var11 = var7 + 1;
         if (this.id_class(60, 14 + 19 * var7, 108, 17, (double)var2, (double)var3) && var8 > 0 && var10 >= 0 && var9 != null) {
            ArrayList var12 = Lists.newArrayList();
            var12.add(new rgn_3("container.enchant.clue", var9.id_protected(var10)).id_class(rgF_2.WHITE));
            if (!var5) {
               var12.add(rgN_2.id_byte);
               if ((Integer)((cb_3)this.id_volatile.id_class[57]).id_implements[19] < var8) {
                  var12.add(new rgn_3("container.enchant.level.requirement", this.id_instanceof.id_class[var7]).id_class(rgF_2.RED));
               } else {
                  rgn_3 var13;
                  if (var11 == 1) {
                     var13 = new rgn_3("container.enchant.lapis.one");
                  } else {
                     var13 = new rgn_3("container.enchant.lapis.many", var11);
                  }

                  var12.add(var13.id_class(var6 >= var11 ? rgF_2.GRAY : rgF_2.RED));
                  rgn_3 var14;
                  if (var11 == 1) {
                     var14 = new rgn_3("container.enchant.level.one");
                  } else {
                     var14 = new rgn_3("container.enchant.level.many", var11);
                  }

                  var12.add(var14.id_class(rgF_2.GRAY));
               }
            }

            this.id_class(var1, var12, var2, var3);
            break;
         }
      }
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      int var6 = (this.id_package - this.id_synchronized) / 2;
      int var7 = (this.id_int - this.id_return) / 2;

      for (int var8 = 0; var8 < 3; var8++) {
         double var9 = var1 - (double)(var6 + 60);
         double var11 = var3 - (double)(var7 + 14 + 19 * var8);
         if (var9 >= 0.0 && var11 >= 0.0 && var9 < 108.0 && var11 < 19.0 && this.id_instanceof.id_break((cb_3)this.id_volatile.id_class[57], var8)) {
            ((Ax_1)this.id_volatile.id_class[55]).id_class(this.id_instanceof.id_case, var8);
            return true;
         }
      }

      return super.id_break(var1, var3, var5);
   }

   @Override
   public void id_finally() {
      rdn_3 var1 = this.id_instanceof.id_class(0).id_class();
      if (!rdn_3.id_break(var1, this.id_switch)) {
         this.id_switch = var1;

         do {
            this.id_catch = this.id_catch + (float)(this.id_double.nextInt(4) - this.id_double.nextInt(4));
         } while (this.id_throws <= this.id_catch + 1.0F && this.id_throws >= this.id_catch - 1.0F);
      }

      this.id_class++;
      this.id_case = this.id_throws;
      this.id_finally = this.id_implements;
      boolean var2 = false;

      for (int var3 = 0; var3 < 3; var3++) {
         if (this.id_instanceof.id_class[var3] != 0) {
            var2 = true;
         }
      }

      if (var2) {
         this.id_implements += 0.2F;
      } else {
         this.id_implements -= 0.2F;
      }

      this.id_implements = rfU_2.id_class(this.id_implements, 0.0F, 1.0F);
      float var5 = (this.id_catch - this.id_throws) * 0.4F;
      float var4 = 0.2F;
      var5 = rfU_2.id_class(var5, -0.2F, 0.2F);
      this.id_private = this.id_private + (var5 - this.id_private) * 0.9F;
      this.id_throws = this.id_throws + this.id_private;
   }

   @Override
   public void id_private() {
      super.id_private();
      this.id_finally();
   }
}
