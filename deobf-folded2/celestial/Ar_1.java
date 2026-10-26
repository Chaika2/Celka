package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Ar_1 extends Lg_1<Ar_1> {
   private Li_1 id_byte;
   protected final QY id_class;
   protected final vm_3 id_break;
   private final vd_3 id_protected;
   private final rpl_3 id_throws;
   private final cv_3 id_case;
   private final rpl_3 id_catch;
   private final cv_3 id_private;

   public Ar_1(QY var1, Li_1 var2, vm_3 var3, vd_3 var4) {
      this.id_class = var1;
      this.id_break = var3;
      this.id_protected = var4;
      this.id_byte = var2;
      this.id_throws = id_class(var1, var4.id_throws());
      this.id_case = id_break(var1, var4.id_continue());
      this.id_catch = id_class(var1, Li_1.id_case);
      this.id_private = id_break(var1, var4.id_protected().id_break());
   }

   public vd_3 id_class() {
      return this.id_protected;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      rAl_1 var11 = this.id_protected.id_protected();
      if (!var11.id_class()) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         ch_3.id_class(var1, var4 - 1, var3 - 1, var4 + var5 - 9, var3 + var6 + 1, -8978432);
      }

      this.id_class.A().id_class(this.id_protected.id_byte());
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      ch_3.id_class(var1, var4, var3, 0.0F, 0.0F, 32, 32, 32, 32);
      rpl_3 var12 = this.id_throws;
      cv_3 var13 = this.id_case;
      if (this.id_break() && (((Qw_1)this.id_class.id_class[20]).S || var9)) {
         this.id_class.A().id_class(Li_1.id_throws);
         ch_3.id_class(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var14 = var7 - var4;
         int var15 = var8 - var3;
         if (!this.id_protected.id_protected().id_class()) {
            var12 = this.id_catch;
            var13 = this.id_private;
         }

         if (this.id_protected.id_super()) {
            if (var14 < 32) {
               ch_3.id_class(var1, var4, var3, 0.0F, 32.0F, 32, 32, 256, 256);
            } else {
               ch_3.id_class(var1, var4, var3, 0.0F, 0.0F, 32, 32, 256, 256);
            }
         } else {
            if (this.id_protected.id_this()) {
               if (var14 < 16) {
                  ch_3.id_class(var1, var4, var3, 32.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  ch_3.id_class(var1, var4, var3, 32.0F, 0.0F, 32, 32, 256, 256);
               }
            }

            if (this.id_protected.id_extends()) {
               if (var14 < 32 && var14 > 16 && var15 < 16) {
                  ch_3.id_class(var1, var4, var3, 96.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  ch_3.id_class(var1, var4, var3, 96.0F, 0.0F, 32, 32, 256, 256);
               }
            }

            if (this.id_protected.id_volatile()) {
               if (var14 < 32 && var14 > 16 && var15 > 16) {
                  ch_3.id_class(var1, var4, var3, 64.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  ch_3.id_class(var1, var4, var3, 64.0F, 0.0F, 32, 32, 256, 256);
               }
            }
         }
      }

      ((cm_3)this.id_class.id_class[15]).id_class(var1, var12, (float)(var4 + 32 + 2), (float)(var3 + 1), 16777215);
      var13.id_break(var1, var4 + 32 + 2, var3 + 12, 10, 8421504);
   }

   private static rpl_3 id_class(QY var0, rgP_2 var1) {
      int var2 = ((cm_3)var0.id_class[15]).id_class(var1);
      if (var2 > 157) {
         rgS_2 var3 = rgS_2.id_class(((cm_3)var0.id_class[15]).id_class(var1, 157 - ((cm_3)var0.id_class[15]).id_break("...")), rgS_2.id_protected("..."));
         return rgX_2.id_byte().id_class(var3);
      } else {
         return var1.id_catch();
      }
   }

   private static cv_3 id_break(QY var0, rgP_2 var1) {
      return cv_3.id_class((cm_3)var0.id_class[15], var1, 157, 2);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      double var6 = var1 - (double)this.id_byte.id_continue();
      double var8 = var3 - (double)this.id_byte.id_case(this.id_byte.x_().indexOf(this));
      if (this.id_break() && var6 <= 32.0) {
         if (this.id_protected.id_super()) {
            this.id_protected.id_int();
            return true;
         }

         if (var6 < 16.0 && this.id_protected.id_this()) {
            this.id_protected.id_new();
            return true;
         }

         if (var6 > 16.0 && var8 < 16.0 && this.id_protected.id_extends()) {
            this.id_protected.id_native();
            return true;
         }

         if (var6 > 16.0 && var8 > 16.0 && this.id_protected.id_volatile()) {
            this.id_protected.id_final();
            return true;
         }
      }

      return false;
   }

   private boolean id_break() {
      return !this.id_protected.id_private() || !this.id_protected.id_implements();
   }
}
