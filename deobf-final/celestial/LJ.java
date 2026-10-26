package celestial;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;

public class LJ implements LE, LS {
   private static final Ordering<Aw_1> class_ = Ordering.from(
      (var0, var1) -> ComparisonChain.start().compare(var0.class_().getId(), var1.class_().getId()).result()
   );
   private static final rgP_2 break_ = new rgn_3("spectatorMenu.teleport");
   private static final rgP_2 byte_ = new rgn_3("spectatorMenu.teleport.prompt");
   private final List<LS> protected_ = Lists.newArrayList();

   @Override
   public rgP_2 byte_() {
      return break_;
   }

   public LJ() {
      this(class_.sortedCopy(QY.instanceof_().void_().throws_()));
   }

   public LJ(Collection<Aw_1> var1) {
      for (Aw_1 var3 : class_.sortedCopy(var1)) {
         if (var3.break_() != rRl_1.SPECTATOR) {
            this.protected_.add(new LG(var3.class_()));
         }
      }
   }

   @Override
   public void class_(Ml_1 var1, float var2, int var3) {
      QY.instanceof_().A().class_(cY_2.class_);
      ch_3.class_(var1, 0, 0, 0.0F, 0.0F, 16, 16, 256, 256);
   }

   @Override
   public List<LS> class_() {
      return this.protected_;
   }

   @Override
   public void class_(Lb_1 var1) {
      var1.class_(this);
   }

   @Override
   public rgP_2 break_() {
      return byte_;
   }

   @Override
   public boolean protected_() {
      return !this.protected_.isEmpty();
   }
}
