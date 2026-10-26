package celestial;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class yo_3 implements yD_2 {
   private final QY id_class;
   private double id_break = Double.MIN_VALUE;
   private List<rjC_2> id_byte = Collections.emptyList();

   public yo_3(QY var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      double var9 = (double)rqR_2.id_byte();
      if (var9 - this.id_break > 1.0E8) {
         this.id_break = var9;
         an_3 var11 = ((Hh_1)this.id_class.id_class[16]).id_finally().id_catch();
         this.id_byte = ((rYB)var11.id_throws[7]).id_byte(var11, var11.rN().id_class(6.0), var0 -> true).collect(Collectors.toList());
      }

      Ok_1 var14 = var2.getBuffer(HU.id_return());

      for (rjC_2 var13 : this.id_byte) {
         yX_2.id_class(var1, var14, var13, -var3, -var5, -var7, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
