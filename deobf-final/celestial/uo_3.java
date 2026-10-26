package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.List;

public class uo_3 extends ch_3 implements Nu_1 {
   private final QY class_;
   private final List<uK_2> throws_ = Lists.newArrayList();
   private boolean case_;

   public uo_3(QY var1) {
      this.class_ = var1;
   }

   public void class_(Ml_1 var1) {
      if (!this.case_ && ((Qw_1)this.class_.class_[20]).P) {
         this.class_.c().class_(this);
         this.case_ = true;
      } else if (this.case_ && !((Qw_1)this.class_.class_[20]).P) {
         this.class_.c().break_(this);
         this.case_ = false;
      }

      if (this.case_ && !this.throws_.isEmpty()) {
         RenderSystem.pushMatrix();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         rjU_2 var2 = new rjU_2(((cb_3)this.class_.class_[57]).rx(), ((cb_3)this.class_.class_[57]).rH(), ((cb_3)this.class_.class_[57]).BO());
         rjU_2 var3 = new rjU_2(0.0, 0.0, -1.0)
            .class_(-(Float)((cb_3)this.class_.class_[57]).throws_[16] * (float) (Math.PI / 180.0))
            .break_(-(Float)((cb_3)this.class_.class_[57]).throws_[15] * (float) (Math.PI / 180.0));
         rjU_2 var4 = new rjU_2(0.0, 1.0, 0.0)
            .class_(-(Float)((cb_3)this.class_.class_[57]).throws_[16] * (float) (Math.PI / 180.0))
            .break_(-(Float)((cb_3)this.class_.class_[57]).throws_[15] * (float) (Math.PI / 180.0));
         rjU_2 var5 = var3.byte_(var4);
         int var6 = 0;
         int var7 = 0;
         Iterator var8 = this.throws_.iterator();

         while (var8.hasNext()) {
            uK_2 var9 = (uK_2)var8.next();
            if (var9.break_() + 3000L <= rqR_2.break_()) {
               var8.remove();
            } else {
               var7 = Math.max(var7, ((cm_3)this.class_.class_[15]).class_(var9.class_()));
            }
         }

         var7 = var7
            + ((cm_3)this.class_.class_[15]).break_("<")
            + ((cm_3)this.class_.class_[15]).break_(" ")
            + ((cm_3)this.class_.class_[15]).break_(">")
            + ((cm_3)this.class_.class_[15]).break_(" ");

         for (uK_2 var10 : this.throws_) {
            short var11 = 255;
            rgP_2 var12 = var10.class_();
            rjU_2 var13 = var10.byte_().protected_(var2).protected_();
            double var14 = -var5.break_(var13);
            double var16 = -var3.break_(var13);
            boolean var18 = var16 > 0.5;
            int var19 = var7 / 2;
            byte var20 = 9;
            int var21 = var20 / 2;
            float var22 = 1.0F;
            int var23 = ((cm_3)this.class_.class_[15]).class_(var12);
            int var24 = rfU_2.byte_(rfU_2.break_(255.0, 75.0, (double)((float)(rqR_2.break_() - var10.break_()) / 3000.0F)));
            int var25 = var24 << 16 | var24 << 8 | var24;
            RenderSystem.pushMatrix();
            RenderSystem.translatef(
               (float)this.class_.else_().super_() - (float)var19 * 1.0F - 2.0F,
               (float)(this.class_.else_().this_() - 30) - (float)(var6 * (var20 + 1)) * 1.0F,
               0.0F
            );
            RenderSystem.scalef(1.0F, 1.0F, 1.0F);
            class_(var1, -var19 - 1, -var21 - 1, var19 + 1, var21 + 1, ((Qw_1)this.class_.class_[20]).break_(0.8F));
            RenderSystem.enableBlend();
            if (!var18) {
               if (var14 > 0.0) {
                  ((cm_3)this.class_.class_[15])
                     .break_(var1, ">", (float)(var19 - ((cm_3)this.class_.class_[15]).break_(">")), (float)(-var21), var25 + -16777216);
               } else if (var14 < 0.0) {
                  ((cm_3)this.class_.class_[15]).break_(var1, "<", (float)(-var19), (float)(-var21), var25 + -16777216);
               }
            }

            ((cm_3)this.class_.class_[15]).byte_(var1, var12, (float)(-var23 / 2), (float)(-var21), var25 + -16777216);
            RenderSystem.popMatrix();
            var6++;
         }

         RenderSystem.disableBlend();
         RenderSystem.popMatrix();
      }
   }

   @Override
   public void class_(NQ var1, NI var2) {
      if (var2.protected_() != null) {
         rgP_2 var3 = var2.protected_();
         if (!this.throws_.isEmpty()) {
            for (uK_2 var5 : this.throws_) {
               if (var5.class_().equals(var3)) {
                  var5.class_(new rjU_2(var1.final_(), var1.package_(), var1.int_()));
                  return;
               }
            }
         }

         this.throws_.add(new uK_2(this, var3, new rjU_2(var1.final_(), var1.package_(), var1.int_())));
      }
   }
}
