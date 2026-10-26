package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class um_3 implements uc_3 {
   static final Logger id_class = LogManager.getLogger();
   private final fN_2 id_break;
   private final Int2ObjectMap<uv_3> id_byte;
   boolean id_protected = false;
   float id_throws = -1.0F;

   public float id_byte() {
      return this.id_throws;
   }

   um_3(fN_2 var1, Int2ObjectMap<uv_3> var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public IntSet id_class() {
      return IntSets.unmodifiable(this.id_byte.keySet());
   }

   @Override
   public uJ_2 id_class(int var1) {
      return (uJ_2)this.id_byte.get(var1);
   }

   @Override
   public void close() {
      this.id_break.close();
   }

   public boolean id_break() {
      return this.id_protected;
   }
}
