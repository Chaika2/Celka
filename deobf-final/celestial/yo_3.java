package celestial;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class yo_3 implements yD_2 {
   private final QY class_;
   private double break_ = Double.MIN_VALUE;
   private List<rjC_2> byte_ = Collections.emptyList();

   public yo_3(QY var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      double var9 = (double)rqR_2.byte_();
      if (var9 - this.break_ > 1.0E8) {
         this.break_ = var9;
         an_3 var11 = ((Hh_1)this.class_.class_[16]).finally_().catch_();
         this.byte_ = ((rYB)var11.throws_[7]).byte_(var11, var11.rN().class_(6.0), var0 -> true).collect(Collectors.toList());
      }

      Ok_1 var14 = var2.getBuffer(HU.return_());

      for (rjC_2 var13 : this.byte_) {
         yX_2.class_(var1, var14, var13, -var3, -var5, -var7, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
