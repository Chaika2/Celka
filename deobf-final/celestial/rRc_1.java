package celestial;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class rRc_1 extends rrGc_1 {
   private LongSet class_ = new LongOpenHashSet();

   @Override
   public rcd_3 byte_(rcd_3 var1) {
      var1.class_("Forced", this.class_.toLongArray());
      return var1;
   }

   public rRc_1() {
      super("chunks");
   }

   @Override
   public void class_(rcd_3 var1) {
      this.class_ = new LongOpenHashSet(var1.package_("Forced"));
   }

   public LongSet class_() {
      return this.class_;
   }
}
