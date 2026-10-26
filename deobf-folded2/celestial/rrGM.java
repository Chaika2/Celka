package celestial;

public class rrGM {
   public final rhd_3 id_class;
   private boolean id_protected;
   private int id_throws;
   private int id_case;
   private int id_catch;
   private int id_private;
   private int id_implements;
   public int id_break;

   public rrGM(rrGb_1 var1, rhd_3 var2) {
      this.id_byte = var1;
      this.id_protected = true;
      this.id_catch = 127;
      this.id_private = 127;
      this.id_class = var2;
   }

   public ruS_2<?> id_class(rdn_3 var1) {
      if (this.id_protected) {
         this.id_protected = false;
         return new rvF_2(
            rxI_2.id_protected(var1),
            this.id_byte.id_case,
            this.id_byte.id_protected,
            this.id_byte.id_private,
            this.id_byte.id_finally.values(),
            this.id_byte.id_catch,
            this.id_throws,
            this.id_case,
            this.id_catch + 1 - this.id_throws,
            this.id_private + 1 - this.id_case
         );
      } else {
         return this.id_implements++ % 5 == 0
            ? new rvF_2(
               rxI_2.id_protected(var1),
               this.id_byte.id_case,
               this.id_byte.id_protected,
               this.id_byte.id_private,
               this.id_byte.id_finally.values(),
               this.id_byte.id_catch,
               0,
               0,
               0,
               0
            )
            : null;
      }
   }

   public void id_class(int var1, int var2) {
      if (this.id_protected) {
         this.id_throws = Math.min(this.id_throws, var1);
         this.id_case = Math.min(this.id_case, var2);
         this.id_catch = Math.max(this.id_catch, var1);
         this.id_private = Math.max(this.id_private, var2);
      } else {
         this.id_protected = true;
         this.id_throws = var1;
         this.id_case = var2;
         this.id_catch = var1;
         this.id_private = var2;
      }
   }
}
