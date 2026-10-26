package celestial;

public class rrPp_1 {
   public final rfH_2 id_class;
   public final xc_3 id_break;
   public final rcd_3 id_byte;

   public rrPp_1(rfH_2 var1, xc_3 var2, rcd_3 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public String toString() {
      return String.format("<StructureBlockInfo | %s | %s | %s>", this.id_class, this.id_break, this.id_byte);
   }
}
