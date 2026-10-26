package celestial;

import java.util.Calendar;

public class jr_3<T extends ryO_2 & rHw_1> extends jW_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 private_;
   private final Iq_1 implements_;
   private final Iq_1 finally_;
   private boolean extends_;

   public jr_3(jz_3 var1) {
      super(var1);
      Calendar var2 = Calendar.getInstance();
      if (var2.get(2) + 1 == 12 && var2.get(5) >= 24 && var2.get(5) <= 26) {
         this.extends_ = true;
      }

      this.break_ = new Iq_1(64, 64, 0, 19);
      this.break_.class_(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F, 0.0F);
      this.class_ = new Iq_1(64, 64, 0, 0);
      this.class_.class_(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F, 0.0F);
      this.class_.protected_ = 9.0F;
      this.class_.throws_ = 1.0F;
      this.byte_ = new Iq_1(64, 64, 0, 0);
      this.byte_.class_(7.0F, -1.0F, 15.0F, 2.0F, 4.0F, 1.0F, 0.0F);
      this.byte_.protected_ = 8.0F;
      this.throws_ = new Iq_1(64, 64, 0, 19);
      this.throws_.class_(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
      this.protected_ = new Iq_1(64, 64, 0, 0);
      this.protected_.class_(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
      this.protected_.protected_ = 9.0F;
      this.protected_.throws_ = 1.0F;
      this.case_ = new Iq_1(64, 64, 0, 0);
      this.case_.class_(15.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.case_.protected_ = 8.0F;
      this.implements_ = new Iq_1(64, 64, 0, 19);
      this.implements_.class_(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
      this.private_ = new Iq_1(64, 64, 0, 0);
      this.private_.class_(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
      this.private_.protected_ = 9.0F;
      this.private_.throws_ = 1.0F;
      this.finally_ = new Iq_1(64, 64, 0, 0);
      this.finally_.class_(0.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.finally_.protected_ = 8.0F;
   }

   @Override
   public void class_(T var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      rYB var7 = var1.while_();
      boolean var8 = var7 != null;
      xc_3 var9 = var8 ? var1.abstract_() : xu_3.re.continue_().class_(xt_3.final_, rpr_3.SOUTH);
      rCt_1 var10 = var9.break_(xt_3.package_) ? var9.byte_(xt_3.package_) : rCt_1.SINGLE;
      if (var9.break_() instanceof JI var12) {
         boolean var13 = var10 != rCt_1.SINGLE;
         var3.class_();
         float var14 = var9.byte_(xt_3.final_).package_();
         var3.class_(0.5, 0.5, 0.5);
         var3.class_(rje_3.protected_.byte_(-var14));
         var3.class_(-0.5, -0.5, -0.5);
         ryJ_2 var15;
         if (var8) {
            var15 = var12.class_(var9, var7, var1.char_(), true);
         } else {
            var15 = ryX_2::break_;
         }

         float var16 = var15.apply(xt_3.class_((rHw_1)var1)).get(var2);
         var16 = 1.0F - var16;
         var16 = 1.0F - var16 * var16 * var16;
         int var17 = var15.apply(new jB_2()).applyAsInt(var5);
         Ig_1 var18 = lp_3.class_(var1, var10, this.extends_);
         Ok_1 var19 = var18.class_(var4, HU::byte_);
         if (var13) {
            if (var10 == rCt_1.LEFT) {
               this.class_(var3, var19, this.private_, this.finally_, this.implements_, var16, var17, var6);
            } else {
               this.class_(var3, var19, this.protected_, this.case_, this.throws_, var16, var17, var6);
            }
         } else {
            this.class_(var3, var19, this.class_, this.byte_, this.break_, var16, var17, var6);
         }

         var3.break_();
      }
   }

   private void class_(Ml_1 var1, Ok_1 var2, Iq_1 var3, Iq_1 var4, Iq_1 var5, float var6, int var7, int var8) {
      var3.case_ = -(var6 * (float) (Math.PI / 2));
      var4.case_ = var3.case_;
      var3.class_(var1, var2, var7, var8);
      var4.class_(var1, var2, var7, var8);
      var5.class_(var1, var2, var7, var8);
   }
}
