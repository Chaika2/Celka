package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;

public class rrbR_2 {
   private Int2ObjectMap<rrbV_2> id_class = new Int2ObjectOpenHashMap();
   private List<rrbV_2> id_break = new ArrayList<>();
   private boolean id_byte = false;

   public List<rrbV_2> id_byte() {
      if (this.id_byte) {
         this.id_break.clear();
         this.id_break.addAll(this.id_class.values());
         this.id_byte = false;
      }

      return this.id_break;
   }

   public rrbV_2 id_class(int var1, rrbV_2 var2) {
      rrbV_2 var3 = (rrbV_2)this.id_class.put(var1, var2);
      this.id_protected();
      return var3;
   }

   public int id_class() {
      return this.id_class.size();
   }

   public rrbV_2 id_class(int var1) {
      return (rrbV_2)this.id_class.get(var1);
   }

   public rrbV_2 id_break(int var1) {
      rrbV_2 var2 = (rrbV_2)this.id_class.remove(var1);
      if (var2 != null) {
         this.id_protected();
      }

      return var2;
   }

   public void id_break() {
      this.id_class.clear();
      this.id_break.clear();
      this.id_protected();
   }

   private void id_protected() {
      this.id_byte = true;
   }
}
