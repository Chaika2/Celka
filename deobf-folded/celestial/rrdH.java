package celestial;

public class rrdH implements rrdr_1 {
   private String id_class;

   public rrdH(String var1) {
      this.id_class = var1;
   }

   @Override
   public rrko_1 id_class(rrdn_1 var1) {
      return (rrko_1)(var1 == rrdn_1.SPECULAR ? new rrkV() : new rrkg_1());
   }

   @Override
   public String id_class() {
      return "LAB_PBR";
   }

   @Override
   public boolean id_break(rrdn_1 var1) {
      return var1 != rrdn_1.SPECULAR;
   }

   @Override
   public String id_break() {
      return this.id_class == null ? null : this.id_class.replace('.', '_');
   }
}
