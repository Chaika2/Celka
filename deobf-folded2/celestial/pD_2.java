package celestial;

import java.util.Random;

public class pD_2 extends pV_2<rsB_2> {
   public pD_2(pg_3 var1) {
      super(var1);
      this.id_byte = 0.5F;
   }

   public rqO_2 id_class(rsB_2 var1) {
      return fJ_2.id_class;
   }

   public void id_class(rsB_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      xc_3 var7 = var1.id_case();
      if (var7.id_private() == xN_2.MODEL) {
         rYB var8 = var1.id_throws();
         if (var7 != var8.id_byte(var1.Bs()) && var7.id_private() != xN_2.INVISIBLE) {
            var4.id_class();
            rfH_2 var9 = new rfH_2(var1.rx(), var1.rN().id_throws, var1.BO());
            var4.id_class(-0.5, 0.0, -0.5);
            lo_3 var10 = QY.id_instanceof().id_synchronized();
            var10.id_byte()
               .id_class(
                  var8,
                  var10.id_class(var7),
                  var7,
                  var9,
                  var4,
                  var5.getBuffer(yS_2.id_break(var7)),
                  false,
                  new Random(),
                  var7.id_break(var1.id_protected()),
                  fZ_2.id_class
               );
            var4.id_break();
            super.id_class(var1, var2, var3, var4, var5, var6);
         }
      }
   }
}
