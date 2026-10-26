package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;

public class HW {
   public final Int2ObjectMap<II> class_ = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<IJ> break_ = new Int2ObjectOpenHashMap(256);
   private final Ip_1 byte_;

   public HW(Ip_1 var1) {
      this.byte_ = var1;
   }

   public IJ class_(rdb_3 var1) {
      return (IJ)this.break_.get(break_(var1));
   }

   public void class_(rdb_3 var1, II var2) {
      this.class_.put(break_(var1), var2);
   }

   public Ip_1 class_() {
      return this.byte_;
   }

   public fj_3 class_(rdn_3 var1) {
      IJ var2 = this.break_(var1);
      return var2 == this.byte_.break_() && var1.break_() instanceof rxJ_2
         ? this.byte_.byte_().class_(((rxJ_2)var1.break_()).catch_().continue_())
         : var2.throws_();
   }

   public fj_3 class_(rpL_2 var1) {
      return this.class_(new rdn_3(var1));
   }

   public void break_() {
      this.break_.clear();
      ObjectIterator var1 = this.class_.entrySet().iterator();

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         this.break_.put((Integer)var2.getKey(), this.byte_.class_((II)var2.getValue()));
      }
   }

   public IJ break_(rdn_3 var1) {
      IJ var2 = this.class_(var1.break_());
      return var2 == null ? this.byte_.break_() : var2;
   }

   private static int break_(rdb_3 var0) {
      return rdb_3.class_(var0);
   }
}
