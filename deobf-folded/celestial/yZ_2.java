package celestial;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.BitSet;
import java.util.List;
import java.util.Set;

public class yZ_2 {
   public static final yZ_2 id_class = new yv_3();
   final rrxx_3 id_break = new rrxx_3();
   final Set<HU> id_byte = new ObjectArraySet();
   boolean id_protected = true;
   final List<ryO_2> id_throws = Lists.newArrayList();
   yF_2 id_case = new yF_2();
   le_3 id_catch;
   private final BitSet[] id_private = new BitSet[HU.s.length];

   public boolean id_byte(HU var1) {
      return this.id_byte.contains(var1);
   }

   public void id_class(HU var1, BitSet var2) {
      this.id_private[var1.id_protected()] = var2;
   }

   public boolean id_class(HU var1) {
      return !this.id_break.id_break(var1);
   }

   public boolean id_class(rpr_3 var1, rpr_3 var2) {
      return this.id_case.id_class(var1, var2);
   }

   public boolean id_class() {
      return this.id_protected;
   }

   public BitSet id_break(HU var1) {
      return this.id_private[var1.id_protected()];
   }

   public List<ryO_2> id_break() {
      return this.id_throws;
   }

   public void id_throws(HU var1) {
      this.id_break.id_class(var1);
   }

   public void id_protected(HU var1) {
      this.id_byte.add(var1);
   }
}
