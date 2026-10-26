package celestial;

import java.util.Iterator;
import java.util.List;

public class rrhL_2 extends rrhu_3 {
   public rrhL_2() {
      super(aI_2.Z, "sheep_wool", 0.7F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      Object var4 = var3.id_throws().get(aI_2.Z);
      if (!(var4 instanceof qt_3)) {
         rrbb_3.id_protected("Not a RenderSheep: " + var4);
         return null;
      } else {
         if (((pV_2)var4).id_byte() == null) {
            qt_3 var5 = new qt_3(var3);
            var5.id_throws = new wc_3<>();
            var5.id_byte = 0.7F;
            var4 = var5;
         }

         qt_3 var9 = (qt_3)var4;
         List var6 = var9.id_throws();
         Iterator var7 = var6.iterator();

         while (var7.hasNext()) {
            Tf_1 var8 = (Tf_1)var7.next();
            if (var8 instanceof TD) {
               var7.remove();
            }
         }

         TD var10 = new TD(var9);
         var10.id_class = (wu_3<rOb_1>)var1;
         var9.id_class(var10);
         return var9;
      }
   }

   @Override
   public In_1 id_throws() {
      return new wu_3();
   }
}
