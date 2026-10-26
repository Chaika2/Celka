package celestial;

import java.util.function.Predicate;

public class QM implements Predicate<xc_3> {
   private static final QM id_class = new QO(QP.id_class);
   private final QP id_break;

   QM(QP var1) {
      this.id_break = var1;
   }

   public static QM id_class(QP var0) {
      return var0 == QP.id_class ? id_class : new QM(var0);
   }

   public boolean id_class(xc_3 var1) {
      return var1 != null && var1.id_byte() == this.id_break;
   }
}
