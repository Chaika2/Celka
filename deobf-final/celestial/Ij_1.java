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
   private final List<Pair<Predicate<xc_3>, IJ>> catch_;
   protected final boolean class_;
   protected final boolean break_;
   protected final boolean byte_;
   protected final fj_3 protected_;
   protected final Ik_1 throws_;
   protected final IF case_;
   private final Map<xc_3, List<IJ>> private_ = new Reference2ReferenceOpenHashMap();

   @Override
   public boolean byte_() {
      return this.byte_;
   }

   public Ij_1(List<Pair<Predicate<xc_3>, IJ>> var1) {
      this.catch_ = var1;
      IJ var2 = (IJ)((Pair)var1.iterator().next()).getRight();
      this.class_ = var2.class_();
      this.break_ = var2.break_();
      this.byte_ = var2.byte_();
      this.protected_ = var2.throws_();
      this.throws_ = var2.case_();
      this.case_ = var2.catch_();
   }

   @Override
   public List<wK_2> class_(xc_3 var1, rpr_3 var2, Random var3) {
      if (var1 == null) {
         return Collections.emptyList();
      } else {
         Object var4;
         synchronized (this.private_) {
            var4 = this.private_.get(var1);
            if (var4 == null) {
               var4 = new ArrayList(this.catch_.size());

               for (Pair var7 : this.catch_) {
                  if (((Predicate)var7.getLeft()).test(var1)) {
                     var4.add((IJ)var7.getRight());
                  }
               }

               this.private_.put(var1, (List<IJ>)var4);
            }
         }

         ArrayList var11 = new ArrayList();
         long var12 = var3.nextLong();

         for (IJ var9 : var4) {
            var3.setSeed(var12);
            var11.addAll(var9.class_(var1, var2, var3));
         }

         return var11;
      }
   }

   @Override
   public boolean class_() {
      return this.class_;
   }

   @Override
   public boolean break_() {
      return this.break_;
   }

   @Override
   public fj_3 throws_() {
      return this.protected_;
   }

   @Override
   public IF catch_() {
      return this.case_;
   }

   @Override
   public Ik_1 case_() {
      return this.throws_;
   }

   @Override
   public boolean protected_() {
      return false;
   }
}
