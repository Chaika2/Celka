package celestial;

public class rPh_1<E extends iB_2> extends rPm_1<E> {
   private boolean id_class;
   private boolean id_byte;
   private final rqb_3 id_protected;
   private final rPm_1<? super E> id_throws;
   private int id_case;

   @Override
   protected void id_byte(rrEm_1 var1, E var2, long var3) {
      this.id_throws.id_byte(var1, (E)var2, var3);
      this.id_byte = this.id_throws.id_class() == rPZ.RUNNING;
   }

   public rPh_1(rPm_1<? super E> var1, rqb_3 var2) {
      this(var1, false, var2);
   }

   public rPh_1(rPm_1<? super E> var1, boolean var2, rqb_3 var3) {
      super(var1.id_break);
      this.id_throws = var1;
      this.id_class = !var2;
      this.id_protected = var3;
   }

   @Override
   public String toString() {
      return "RunSometimes: " + this.id_throws;
   }

   @Override
   protected boolean id_class(rrEm_1 var1, E var2) {
      if (!this.id_throws.id_class(var1, (E)var2)) {
         return false;
      } else {
         if (this.id_class) {
            this.id_class(var1);
            this.id_class = false;
         }

         if (this.id_case > 0) {
            this.id_case--;
         }

         return !this.id_byte && this.id_case == 0;
      }
   }

   private void id_class(rrEm_1 var1) {
      this.id_case = this.id_protected.id_class(var1.id_int);
   }

   @Override
   protected boolean id_class(long var1) {
      return false;
   }

   @Override
   protected boolean id_class(rrEm_1 var1, E var2, long var3) {
      return this.id_throws.id_class(var1, (E)var2, var3);
   }

   @Override
   protected void id_break(rrEm_1 var1, E var2, long var3) {
      this.id_class(var1);
      this.id_throws.id_break(var1, (E)var2, var3);
   }

   @Override
   protected void id_protected(rrEm_1 var1, E var2, long var3) {
      this.id_throws.id_protected(var1, (E)var2, var3);
   }
}
