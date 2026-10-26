package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class um_3 implements uc_3 {
   static final Logger class_ = LogManager.getLogger();
   private final fN_2 break_;
   private final Int2ObjectMap<uv_3> byte_;
   boolean protected_ = false;
   float throws_ = -1.0F;

   public float byte_() {
      return this.throws_;
   }

   um_3(fN_2 var1, Int2ObjectMap<uv_3> var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public IntSet class_() {
      return IntSets.unmodifiable(this.byte_.keySet());
   }

   @Override
   public uJ_2 class_(int var1) {
      return (uJ_2)this.byte_.get(var1);
   }

   @Override
   public void close() {
      this.break_.close();
   }

   public boolean break_() {
      return this.protected_;
   }
}
