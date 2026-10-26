package celestial;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import org.apache.commons.lang3.tuple.Pair;

public class Ij_1 implements IJ {
   private final List<Pair<Predicate<xc_3>, IJ>> id_catch;
   protected final boolean id_class;
   protected final boolean id_break;
   protected final boolean id_byte;
   protected final fj_3 id_protected;
   protected final Ik_1 id_throws;
   protected final IF id_case;
   private final Map<xc_3, List<IJ>> id_private = new Reference2ReferenceOpenHashMap();

   @Override
   public boolean id_byte() {
      return this.id_byte;
   }

   public Ij_1(List<Pair<Predicate<xc_3>, IJ>> var1) {
      this.id_catch = var1;
      IJ var2 = (IJ)((Pair)var1.iterator().next()).getRight();
      this.id_class = var2.id_class();
      this.id_break = var2.id_break();
      this.id_byte = var2.id_byte();
      this.id_protected = var2.id_throws();
      this.id_throws = var2.id_case();
      this.id_case = var2.id_catch();
   }

   @Override
   public List<wK_2> id_class(xc_3 var1, rpr_3 var2, Random var3) {
      if (var1 == null) {
         return Collections.emptyList();
      } else {
         Object var4;
         synchronized (this.id_private) {
            var4 = this.id_private.get(var1);
            if (var4 == null) {
               var4 = new ArrayList(this.id_catch.size());

               for (Pair var7 : this.id_catch) {
                  if (((Predicate)var7.getLeft()).test(var1)) {
                     var4.add((IJ)var7.getRight());
                  }
               }

               this.id_private.put(var1, (List<IJ>)var4);
            }
         }

         ArrayList var11 = new ArrayList();
         long var12 = var3.nextLong();

         for (IJ var9 : var4) {
            var3.setSeed(var12);
            var11.addAll(var9.id_class(var1, var2, var3));
         }

         return var11;
      }
   }

   @Override
   public boolean id_class() {
      return this.id_class;
   }

   @Override
   public boolean id_break() {
      return this.id_break;
   }

   @Override
   public fj_3 id_throws() {
      return this.id_protected;
   }

   @Override
   public IF id_catch() {
      return this.id_case;
   }

   @Override
   public Ik_1 id_case() {
      return this.id_throws;
   }

   @Override
   public boolean id_protected() {
      return false;
   }
}
