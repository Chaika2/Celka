package celestial;

public class rff_3 extends rjG_2 {
   private rpr_3 id_break;
   private rfH_2 id_byte;
   private final boolean id_protected;
   private final boolean id_throws;

   @Override
   public rjM_2 id_byte() {
      return this.id_protected ? rjM_2.MISS : rjM_2.BLOCK;
   }

   private rff_3(boolean var1, rjU_2 var2, rpr_3 var3, rfH_2 var4, boolean var5) {
      super(var2);
      this.id_protected = var1;
      this.id_break = var3;
      this.id_byte = var4;
      this.id_throws = var5;
   }

   public rff_3(rjU_2 var1, rpr_3 var2, rfH_2 var3, boolean var4) {
      this(false, var1, var2, var3, var4);
   }

   public rfH_2 id_class() {
      return this.id_byte;
   }

   public rff_3 id_class(rjU_2 var1) {
      return new rff_3(this.id_protected, var1, this.id_break, new rfH_2(var1), this.id_throws);
   }

   public static rff_3 id_class(rjU_2 var0, rpr_3 var1, rfH_2 var2) {
      return new rff_3(true, var0, var1, var2, false);
   }

   public rff_3 id_class(rpr_3 var1) {
      return new rff_3(this.id_protected, this.id_class, var1, this.id_byte, this.id_throws);
   }

   public rff_3 id_class(rfH_2 var1) {
      return new rff_3(this.id_protected, this.id_class, this.id_break, var1, this.id_throws);
   }

   public void id_break(rfH_2 var1) {
      this.id_byte = var1;
   }

   public void id_break(rpr_3 var1) {
      this.id_break = var1;
   }

   public rpr_3 id_break() {
      return this.id_break;
   }

   public boolean id_throws() {
      return this.id_throws;
   }

   @Override
   public rrTj_1 id_protected() {
      return this.id_byte;
   }
}
