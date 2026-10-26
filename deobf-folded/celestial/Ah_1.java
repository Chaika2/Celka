package celestial;

import java.util.concurrent.atomic.AtomicReferenceArray;

final class Ah_1 {
   final AtomicReferenceArray<roJ_2> id_break;
   final int id_byte;
   private final int id_protected;
   volatile int id_throws;
   volatile int id_case;
   int id_catch;

   public int id_byte() {
      return this.id_byte;
   }

   Ah_1(AO var1, int var2) {
      this.id_class = var1;
      this.id_byte = var2;
      this.id_protected = var2 * 2 + 1;
      this.id_break = new AtomicReferenceArray<>(this.id_protected * this.id_protected);
   }

   public void id_class(Ah_1 var1) {
      this.id_throws = var1.id_class();
      this.id_case = var1.id_break();
      AtomicReferenceArray var2 = var1.id_protected();

      for (int var3 = 0; var3 < var2.length(); var3++) {
         roJ_2 var4 = (roJ_2)var2.get(var3);
         if (var4 != null) {
            rfj_3 var5 = var4.id_private();
            if (this.id_break(var5.id_break, var5.id_byte)) {
               int var6 = this.id_class(var5.id_break, var5.id_byte);
               if (this.id_break.get(var6) != null) {
                  throw new IllegalStateException("Doing this would mutate the client's REAL loaded chunks?!");
               }

               this.id_class(var6, var4);
            }
         }
      }
   }

   public int id_class() {
      return this.id_throws;
   }

   protected roJ_2 id_class(int var1) {
      return this.id_break.get(var1);
   }

   int id_class(int var1, int var2) {
      return Math.floorMod(var2, this.id_protected) * this.id_protected + Math.floorMod(var1, this.id_protected);
   }

   protected roJ_2 id_class(int var1, roJ_2 var2, roJ_2 var3) {
      if (this.id_break.compareAndSet(var1, var2, var3) && var3 == null) {
         this.id_catch--;
      }

      this.id_class.id_throws.id_class(var2);
      return var2;
   }

   protected void id_class(int var1, roJ_2 var2) {
      roJ_2 var3 = this.id_break.getAndSet(var1, var2);
      if (var3 != null) {
         this.id_catch--;
         this.id_class.id_throws.id_class(var3);
      }

      if (var2 != null) {
         this.id_catch++;
      }
   }

   boolean id_break(int var1, int var2) {
      return Math.abs(var1 - this.id_throws) <= this.id_byte && Math.abs(var2 - this.id_case) <= this.id_byte;
   }

   public int id_break() {
      return this.id_case;
   }

   public AtomicReferenceArray<roJ_2> id_protected() {
      return this.id_break;
   }
}
