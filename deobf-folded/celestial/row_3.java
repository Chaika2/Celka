package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class row_3 implements roq_3 {
   private final rot_3 id_class;
   private final Long2ObjectOpenHashMap<roN_2> id_break;
   private rfj_3 id_byte = new rfj_3(0, 0);
   private final int id_protected;
   private final int id_throws;
   private final int id_case;
   private boolean id_catch;

   public int id_byte() {
      return this.id_protected;
   }

   public row_3(int var1) {
      this.id_class = new rot_3(var1);
      this.id_protected = var1 * 2 + 1;
      this.id_throws = var1 + roN_2.id_break();
      this.id_case = this.id_throws * 2 + 1;
      this.id_break = new Long2ObjectOpenHashMap();
   }

   public roN_2 id_class(int var1, int var2) {
      return (roN_2)this.id_break.get(rfj_3.id_class(var1 + this.id_byte.id_break - this.id_throws, var2 + this.id_byte.id_byte - this.id_throws));
   }

   @Override
   public void id_class() {
      this.id_catch = false;
      this.id_class.id_class();
   }

   @Override
   public void id_class(rfj_3 var1) {
      if (this.id_catch) {
         this.id_class.id_class(var1);
         this.id_byte = var1;
      }
   }

   @Override
   public void id_class(rfj_3 var1, roN_2 var2) {
      if (this.id_catch) {
         this.id_class.id_class(var1, var2);
         if (var2 == null) {
            this.id_break.remove(var1.id_class());
         } else {
            this.id_break.put(var1.id_class(), var2);
         }
      }
   }

   public void id_break() {
      this.id_catch = true;
      this.id_break.clear();
   }

   public int id_throws() {
      return this.id_class.id_break();
   }

   public int id_protected() {
      return this.id_case;
   }
}
