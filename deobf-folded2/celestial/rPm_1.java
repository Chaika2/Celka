package celestial;

import java.util.Map;
import java.util.Map.Entry;

public abstract class rPm_1<E extends iB_2> {
   protected final Map<il_3<?>, iC_2> id_break;
   private rPZ id_class = rPZ.STOPPED;
   private long id_byte;
   private final int id_protected;
   private final int id_throws;

   protected void id_byte(rrEm_1 var1, E var2, long var3) {
   }

   public rPm_1(Map<il_3<?>, iC_2> var1) {
      this(var1, 60);
   }

   public rPm_1(Map<il_3<?>, iC_2> var1, int var2, int var3) {
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_break = var1;
   }

   public rPm_1(Map<il_3<?>, iC_2> var1, int var2) {
      this(var1, var2, var2);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   private boolean id_class(E var1) {
      for (Entry var3 : this.id_break.entrySet()) {
         il_3 var4 = (il_3)var3.getKey();
         iC_2 var5 = (iC_2)var3.getValue();
         if (!var1.SF().id_class(var4, var5)) {
            return false;
         }
      }

      return true;
   }

   protected boolean id_class(rrEm_1 var1, E var2, long var3) {
      return false;
   }

   protected boolean id_class(long var1) {
      return var1 > this.id_byte;
   }

   protected boolean id_class(rrEm_1 var1, E var2) {
      return true;
   }

   public rPZ id_class() {
      return this.id_class;
   }

   protected void id_break(rrEm_1 var1, E var2, long var3) {
   }

   public final boolean id_throws(rrEm_1 var1, E var2, long var3) {
      if (this.id_class((E)var2) && this.id_class(var1, (E)var2)) {
         this.id_class = rPZ.RUNNING;
         int var5 = this.id_protected + var1.id_long().nextInt(this.id_throws + 1 - this.id_protected);
         this.id_byte = var3 + (long)var5;
         this.id_protected(var1, (E)var2, var3);
         return true;
      } else {
         return false;
      }
   }

   public final void id_catch(rrEm_1 var1, E var2, long var3) {
      this.id_class = rPZ.STOPPED;
      this.id_break(var1, (E)var2, var3);
   }

   public final void id_case(rrEm_1 var1, E var2, long var3) {
      if (!this.id_class(var3) && this.id_class(var1, (E)var2, var3)) {
         this.id_byte(var1, (E)var2, var3);
      } else {
         this.id_catch(var1, (E)var2, var3);
      }
   }

   protected void id_protected(rrEm_1 var1, E var2, long var3) {
   }
}
