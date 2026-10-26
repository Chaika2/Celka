package celestial;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class rrrL extends rrGc_1 {
   private LongSet class_ = new LongOpenHashSet();
   private LongSet break_ = new LongOpenHashSet();

   @Override
   public rcd_3 byte_(rcd_3 var1) {
      var1.class_("All", this.class_.toLongArray());
      var1.class_("Remaining", this.break_.toLongArray());
      return var1;
   }

   public boolean byte_(long var1) {
      return this.break_.contains(var1);
   }

   public rrrL(String var1) {
      super(var1);
   }

   public LongSet class_() {
      return this.class_;
   }

   public void class_(long var1) {
      this.class_.add(var1);
      this.break_.add(var1);
   }

   @Override
   public void class_(rcd_3 var1) {
      this.class_ = new LongOpenHashSet(var1.package_("All"));
      this.break_ = new LongOpenHashSet(var1.package_("Remaining"));
   }

   public boolean break_(long var1) {
      return this.class_.contains(var1);
   }

   public void protected_(long var1) {
      this.break_.remove(var1);
   }
}
