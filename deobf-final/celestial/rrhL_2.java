package celestial;

import java.util.Iterator;
import java.util.List;

public class rrhL_2 extends rrhu_3 {
   public rrhL_2() {
      super(aI_2.Z, "sheep_wool", 0.7F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      Object var4 = var3.throws_().get(aI_2.Z);
      if (!(var4 instanceof qt_3)) {
         rrbb_3.protected_("Not a RenderSheep: " + var4);
         return null;
      } else {
         if (((pV_2)var4).byte_() == null) {
            qt_3 var5 = new qt_3(var3);
            var5.throws_ = new wc_3<>();
            var5.byte_ = 0.7F;
            var4 = var5;
         }

         qt_3 var9 = (qt_3)var4;
         List var6 = var9.throws_();
         Iterator var7 = var6.iterator();

         while (var7.hasNext()) {
            Tf_1 var8 = (Tf_1)var7.next();
            if (var8 instanceof TD) {
               var7.remove();
            }
         }

         TD var10 = new TD(var9);
         var10.class_ = (wu_3<rOb_1>)var1;
         var9.class_(var10);
         return var9;
      }
   }

   @Override
   public In_1 throws_() {
      return new wu_3();
   }
}
