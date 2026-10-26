package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;

public class HW {
   public final Int2ObjectMap<II> id_class = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<IJ> id_break = new Int2ObjectOpenHashMap(256);
   private final Ip_1 id_byte;

   public HW(Ip_1 var1) {
      this.id_byte = var1;
   }

   public IJ id_class(rdb_3 var1) {
      return (IJ)this.id_break.get(id_break(var1));
   }

   public void id_class(rdb_3 var1, II var2) {
      this.id_class.put(id_break(var1), var2);
   }

   public Ip_1 id_class() {
      return this.id_byte;
   }

   public fj_3 id_class(rdn_3 var1) {
      IJ var2 = this.id_break(var1);
      return var2 == this.id_byte.id_break() && var1.id_break() instanceof rxJ_2
         ? this.id_byte.id_byte().id_class(((rxJ_2)var1.id_break()).id_catch().id_continue())
         : var2.id_throws();
   }

   public fj_3 id_class(rpL_2 var1) {
      return this.id_class(new rdn_3(var1));
   }

   public void id_break() {
      this.id_break.clear();
      ObjectIterator var1 = this.id_class.entrySet().iterator();

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         this.id_break.put((Integer)var2.getKey(), this.id_byte.id_class((II)var2.getValue()));
      }
   }

   public IJ id_break(rdn_3 var1) {
      IJ var2 = this.id_class(var1.id_break());
      return var2 == null ? this.id_byte.id_break() : var2;
   }

   private static int id_break(rdb_3 var0) {
      return rdb_3.id_class(var0);
   }
}
