package celestial;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class rRc_1 extends rrGc_1 {
   private LongSet id_class = new LongOpenHashSet();

   @Override
   public rcd_3 id_byte(rcd_3 var1) {
      var1.id_class("Forced", this.id_class.toLongArray());
      return var1;
   }

   public rRc_1() {
      super("chunks");
   }

   @Override
   public void id_class(rcd_3 var1) {
      this.id_class = new LongOpenHashSet(var1.id_package("Forced"));
   }

   public LongSet id_class() {
      return this.id_class;
   }
}
