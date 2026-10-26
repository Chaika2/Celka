package celestial;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;

class vq_3 extends LV<vT_2> {
   public vq_3(vp_3 var1, QY var2) {
      super(var2, var1.package_, var1.int_, 32, var1.int_ - 64, 10);
      this.class_ = var1;
      ObjectArrayList var3 = new ObjectArrayList(rlB_2.implements_.iterator());
      var3.sort(Comparator.comparing(var0 -> jI_2.class_(vp_3.class_((rCi_1<rqO_2>)var0))));
      ObjectListIterator var4 = var3.iterator();

      while (var4.hasNext()) {
         rCi_1 var5 = (rCi_1)var4.next();
         this.break_(new vT_2(this, var5));
      }
   }

   @Override
   protected void class_(Ml_1 var1) {
      this.class_.class_(var1);
   }
}
