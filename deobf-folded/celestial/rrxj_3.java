package celestial;

public class rrxj_3 implements rrxa_3 {
   private int id_class = -1;
   private String id_break = null;
   private ff_3 id_byte = null;

   public ff_3 id_byte() {
      return this.id_byte;
   }

   public rrxj_3(int var1, String var2, ff_3 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public String toString() {
      return "textureUnit: " + this.id_class + ", path: " + this.id_break + ", glTextureId: " + this.id_protected();
   }

   @Override
   public int id_class() {
      return this.id_class;
   }

   public String id_break() {
      return this.id_break;
   }

   @Override
   public void id_throws() {
      fo_3.id_class(this.id_byte.id_new());
   }

   @Override
   public int id_protected() {
      return this.id_byte.id_new();
   }
}
