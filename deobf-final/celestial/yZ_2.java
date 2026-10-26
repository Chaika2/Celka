package celestial;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.BitSet;
import java.util.List;
import java.util.Set;

public class yZ_2 {
   public static final yZ_2 class_ = new yv_3();
   final rrxx_3 break_ = new rrxx_3();
   final Set<HU> byte_ = new ObjectArraySet();
   boolean protected_ = true;
   final List<ryO_2> throws_ = Lists.newArrayList();
   yF_2 case_ = new yF_2();
   le_3 catch_;
   private final BitSet[] private_ = new BitSet[HU.s.length];

   public boolean byte_(HU var1) {
      return this.byte_.contains(var1);
   }

   public void class_(HU var1, BitSet var2) {
      this.private_[var1.protected_()] = var2;
   }

   public boolean class_(HU var1) {
      return !this.break_.break_(var1);
   }

   public boolean class_(rpr_3 var1, rpr_3 var2) {
      return this.case_.class_(var1, var2);
   }

   public boolean class_() {
      return this.protected_;
   }

   public BitSet break_(HU var1) {
      return this.private_[var1.protected_()];
   }

   public List<ryO_2> break_() {
      return this.throws_;
   }

   public void throws_(HU var1) {
      this.break_.class_(var1);
   }

   public void protected_(HU var1) {
      this.byte_.add(var1);
   }
}
