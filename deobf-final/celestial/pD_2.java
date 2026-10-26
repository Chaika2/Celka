package celestial;

import java.util.Random;

public class pD_2 extends pV_2<rsB_2> {
   public pD_2(pg_3 var1) {
      super(var1);
      this.byte_ = 0.5F;
   }

   public rqO_2 class_(rsB_2 var1) {
      return fJ_2.class_;
   }

   public void class_(rsB_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      xc_3 var7 = var1.case_();
      if (var7.private_() == xN_2.MODEL) {
         rYB var8 = var1.throws_();
         if (var7 != var8.byte_(var1.Bs()) && var7.private_() != xN_2.INVISIBLE) {
            var4.class_();
            rfH_2 var9 = new rfH_2(var1.rx(), var1.rN().throws_, var1.BO());
            var4.class_(-0.5, 0.0, -0.5);
            lo_3 var10 = QY.instanceof_().synchronized_();
            var10.byte_()
               .class_(
                  var8,
                  var10.class_(var7),
                  var7,
                  var9,
                  var4,
                  var5.getBuffer(yS_2.break_(var7)),
                  false,
                  new Random(),
                  var7.break_(var1.protected_()),
                  fZ_2.class_
               );
            var4.break_();
            super.class_(var1, var2, var3, var4, var5, var6);
         }
      }
   }
}
