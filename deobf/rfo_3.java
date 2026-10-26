package celestial;

public class rfo_3 extends rjG_2 {
   private final an_3 id_break;
   private rpr_3 id_byte;

   public rjM_2 id_byte() {
      return rjM_2.ENTITY;
   }

   public rfo_3(an_3 var1) {
      this(var1, rpr_3.UP, var1.Ps());
   }

   public rfo_3(an_3 var1, rpr_3 var2, rjU_2 var3) {
      super(var3);
      this.id_break = var1;
      this.id_byte = var2;
   }

   public rfo_3(an_3 var1, rjU_2 var2) {
      super(var2);
      this.id_break = var1;
   }

   public an_3 id_class() {
      return this.id_break;
   }

   public rpr_3 id_break() {
      return this.id_byte;
   }

   public rrTj_1 id_protected() {
      return this.id_break;
   }
}
