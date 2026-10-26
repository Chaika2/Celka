package celestial;

import java.util.function.Predicate;

public class QM implements Predicate<xc_3> {
   private static final QM class_ = new QO(QP.class_);
   private final QP break_;

   QM(QP var1) {
      this.break_ = var1;
   }

   public static QM class_(QP var0) {
      return var0 == QP.class_ ? class_ : new QM(var0);
   }

   public boolean class_(xc_3 var1) {
      return var1 != null && var1.byte_() == this.break_;
   }
}
