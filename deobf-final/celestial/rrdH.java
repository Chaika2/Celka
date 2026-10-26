package celestial;

public class rrdH implements rrdr_1 {
   private String class_;

   public rrdH(String var1) {
      this.class_ = var1;
   }

   @Override
   public rrko_1 class_(rrdn_1 var1) {
      return (rrko_1)(var1 == rrdn_1.SPECULAR ? new rrkV() : new rrkg_1());
   }

   @Override
   public String class_() {
      return "LAB_PBR";
   }

   @Override
   public boolean break_(rrdn_1 var1) {
      return var1 != rrdn_1.SPECULAR;
   }

   @Override
   public String break_() {
      return this.class_ == null ? null : this.class_.replace('.', '_');
   }
}
