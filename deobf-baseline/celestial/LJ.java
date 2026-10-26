package celestial;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;

public class LJ implements LE, LS {
   private static final Ordering<Aw_1> id_class = Ordering.from(
      (var0, var1) -> ComparisonChain.start().compare(var0.id_class().getId(), var1.id_class().getId()).result()
   );
   private static final rgP_2 id_break = new rgn_3("spectatorMenu.teleport");
   private static final rgP_2 id_byte = new rgn_3("spectatorMenu.teleport.prompt");
   private final List<LS> id_protected = Lists.newArrayList();

   @Override
   public rgP_2 id_byte() {
      return id_break;
   }

   public LJ() {
      this(id_class.sortedCopy(QY.id_instanceof().id_void().id_throws()));
   }

   public LJ(Collection<Aw_1> var1) {
      for (Aw_1 var3 : id_class.sortedCopy(var1)) {
         if (var3.id_break() != rRl_1.SPECTATOR) {
            this.id_protected.add(new LG(var3.id_class()));
         }
      }
   }

   @Override
   public void id_class(Ml_1 var1, float var2, int var3) {
      QY.id_instanceof().A().id_class(cY_2.id_class);
      ch_3.id_class(var1, 0, 0, 0.0F, 0.0F, 16, 16, 256, 256);
   }

   @Override
   public List<LS> id_class() {
      return this.id_protected;
   }

   @Override
   public void id_class(Lb_1 var1) {
      var1.id_class(this);
   }

   @Override
   public rgP_2 id_break() {
      return id_byte;
   }

   @Override
   public boolean id_protected() {
      return !this.id_protected.isEmpty();
   }
}
