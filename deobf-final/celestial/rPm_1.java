package celestial;

import java.util.Map;
import java.util.Map.Entry;

public abstract class rPm_1<E extends iB_2> {
   protected final Map<il_3<?>, iC_2> break_;
   private rPZ class_ = rPZ.STOPPED;
   private long byte_;
   private final int protected_;
   private final int throws_;

   protected void byte_(rrEm_1 var1, E var2, long var3) {
   }

   public rPm_1(Map<il_3<?>, iC_2> var1) {
      this(var1, 60);
   }

   public rPm_1(Map<il_3<?>, iC_2> var1, int var2, int var3) {
      this.protected_ = var2;
      this.throws_ = var3;
      this.break_ = var1;
   }

   public rPm_1(Map<il_3<?>, iC_2> var1, int var2) {
      this(var1, var2, var2);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   private boolean class_(E var1) {
      for (Entry var3 : this.break_.entrySet()) {
         il_3 var4 = (il_3)var3.getKey();
         iC_2 var5 = (iC_2)var3.getValue();
         if (!var1.SF().class_(var4, var5)) {
            return false;
         }
      }

      return true;
   }

   protected boolean class_(rrEm_1 var1, E var2, long var3) {
      return false;
   }

   protected boolean class_(long var1) {
      return var1 > this.byte_;
   }

   protected boolean class_(rrEm_1 var1, E var2) {
      return true;
   }

   public rPZ class_() {
      return this.class_;
   }

   protected void break_(rrEm_1 var1, E var2, long var3) {
   }

   public final boolean throws_(rrEm_1 var1, E var2, long var3) {
      if (this.class_((E)var2) && this.class_(var1, (E)var2)) {
         this.class_ = rPZ.RUNNING;
         int var5 = this.protected_ + var1.long_().nextInt(this.throws_ + 1 - this.protected_);
         this.byte_ = var3 + (long)var5;
         this.protected_(var1, (E)var2, var3);
         return true;
      } else {
         return false;
      }
   }

   public final void catch_(rrEm_1 var1, E var2, long var3) {
      this.class_ = rPZ.STOPPED;
      this.break_(var1, (E)var2, var3);
   }

   public final void case_(rrEm_1 var1, E var2, long var3) {
      if (!this.class_(var3) && this.class_(var1, (E)var2, var3)) {
         this.byte_(var1, (E)var2, var3);
      } else {
         this.catch_(var1, (E)var2, var3);
      }
   }

   protected void protected_(rrEm_1 var1, E var2, long var3) {
   }
}
