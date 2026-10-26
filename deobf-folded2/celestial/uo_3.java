package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.List;

public class uo_3 extends ch_3 implements Nu_1 {
   private final QY id_class;
   private final List<uK_2> id_throws = Lists.newArrayList();
   private boolean id_case;

   public uo_3(QY var1) {
      this.id_class = var1;
   }

   public void id_class(Ml_1 var1) {
      if (!this.id_case && ((Qw_1)this.id_class.id_class[20]).P) {
         this.id_class.c().id_class(this);
         this.id_case = true;
      } else if (this.id_case && !((Qw_1)this.id_class.id_class[20]).P) {
         this.id_class.c().id_break(this);
         this.id_case = false;
      }

      if (this.id_case && !this.id_throws.isEmpty()) {
         RenderSystem.pushMatrix();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         rjU_2 var2 = new rjU_2(((cb_3)this.id_class.id_class[57]).rx(), ((cb_3)this.id_class.id_class[57]).rH(), ((cb_3)this.id_class.id_class[57]).BO());
         rjU_2 var3 = new rjU_2(0.0, 0.0, -1.0)
            .id_class(-(Float)((cb_3)this.id_class.id_class[57]).id_throws[16] * (float) (Math.PI / 180.0))
            .id_break(-(Float)((cb_3)this.id_class.id_class[57]).id_throws[15] * (float) (Math.PI / 180.0));
         rjU_2 var4 = new rjU_2(0.0, 1.0, 0.0)
            .id_class(-(Float)((cb_3)this.id_class.id_class[57]).id_throws[16] * (float) (Math.PI / 180.0))
            .id_break(-(Float)((cb_3)this.id_class.id_class[57]).id_throws[15] * (float) (Math.PI / 180.0));
         rjU_2 var5 = var3.id_byte(var4);
         int var6 = 0;
         int var7 = 0;
         Iterator var8 = this.id_throws.iterator();

         while (var8.hasNext()) {
            uK_2 var9 = (uK_2)var8.next();
            if (var9.id_break() + 3000L <= rqR_2.id_break()) {
               var8.remove();
            } else {
               var7 = Math.max(var7, ((cm_3)this.id_class.id_class[15]).id_class(var9.id_class()));
            }
         }

         var7 = var7
            + ((cm_3)this.id_class.id_class[15]).id_break("<")
            + ((cm_3)this.id_class.id_class[15]).id_break(" ")
            + ((cm_3)this.id_class.id_class[15]).id_break(">")
            + ((cm_3)this.id_class.id_class[15]).id_break(" ");

         for (uK_2 var10 : this.id_throws) {
            short var11 = 255;
            rgP_2 var12 = var10.id_class();
            rjU_2 var13 = var10.id_byte().id_protected(var2).id_protected();
            double var14 = -var5.id_break(var13);
            double var16 = -var3.id_break(var13);
            boolean var18 = var16 > 0.5;
            int var19 = var7 / 2;
            byte var20 = 9;
            int var21 = var20 / 2;
            float var22 = 1.0F;
            int var23 = ((cm_3)this.id_class.id_class[15]).id_class(var12);
            int var24 = rfU_2.id_byte(rfU_2.id_break(255.0, 75.0, (double)((float)(rqR_2.id_break() - var10.id_break()) / 3000.0F)));
            int var25 = var24 << 16 | var24 << 8 | var24;
            RenderSystem.pushMatrix();
            RenderSystem.translatef(
               (float)this.id_class.id_else().id_super() - (float)var19 * 1.0F - 2.0F,
               (float)(this.id_class.id_else().id_this() - 30) - (float)(var6 * (var20 + 1)) * 1.0F,
               0.0F
            );
            RenderSystem.scalef(1.0F, 1.0F, 1.0F);
            id_class(var1, -var19 - 1, -var21 - 1, var19 + 1, var21 + 1, ((Qw_1)this.id_class.id_class[20]).id_break(0.8F));
            RenderSystem.enableBlend();
            if (!var18) {
               if (var14 > 0.0) {
                  ((cm_3)this.id_class.id_class[15])
                     .id_break(var1, ">", (float)(var19 - ((cm_3)this.id_class.id_class[15]).id_break(">")), (float)(-var21), var25 + -16777216);
               } else if (var14 < 0.0) {
                  ((cm_3)this.id_class.id_class[15]).id_break(var1, "<", (float)(-var19), (float)(-var21), var25 + -16777216);
               }
            }

            ((cm_3)this.id_class.id_class[15]).id_byte(var1, var12, (float)(-var23 / 2), (float)(-var21), var25 + -16777216);
            RenderSystem.popMatrix();
            var6++;
         }

         RenderSystem.disableBlend();
         RenderSystem.popMatrix();
      }
   }

   @Override
   public void id_class(NQ var1, NI var2) {
      if (var2.id_protected() != null) {
         rgP_2 var3 = var2.id_protected();
         if (!this.id_throws.isEmpty()) {
            for (uK_2 var5 : this.id_throws) {
               if (var5.id_class().equals(var3)) {
                  var5.id_class(new rjU_2(var1.id_final(), var1.id_package(), var1.id_int()));
                  return;
               }
            }
         }

         this.id_throws.add(new uK_2(this, var3, new rjU_2(var1.id_final(), var1.id_package(), var1.id_int())));
      }
   }
}
