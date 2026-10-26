package celestial;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class rrrL extends rrGc_1 {
   private LongSet id_class = new LongOpenHashSet();
   private LongSet id_break = new LongOpenHashSet();

   @Override
   public rcd_3 id_byte(rcd_3 var1) {
      var1.id_class("All", this.id_class.toLongArray());
      var1.id_class("Remaining", this.id_break.toLongArray());
      return var1;
   }

   public boolean id_byte(long var1) {
      return this.id_break.contains(var1);
   }

   public rrrL(String var1) {
      super(var1);
   }

   public LongSet id_class() {
      return this.id_class;
   }

   public void id_class(long var1) {
      this.id_class.add(var1);
      this.id_break.add(var1);
   }

   @Override
   public void id_class(rcd_3 var1) {
      this.id_class = new LongOpenHashSet(var1.id_package("All"));
      this.id_break = new LongOpenHashSet(var1.id_package("Remaining"));
   }

   public boolean id_break(long var1) {
      return this.id_class.contains(var1);
   }

   public void id_protected(long var1) {
      this.id_break.remove(var1);
   }
}
