package celestial;

public class rrJW extends Thread {
   private String id_class = null;
   private rrJn_1 id_break = null;

   public rrJW(String var1, rrJn_1 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public void run() {
      try {
         byte[] var1 = rrJN.id_break(this.id_class, QY.id_instanceof().W());
         this.id_break.id_class(this.id_class, var1, (Throwable)null);
      } catch (Exception var2) {
         this.id_break.id_class(this.id_class, (byte[])null, var2);
      }
   }

   public String id_class() {
      return this.id_class;
   }

   public rrJn_1 id_break() {
      return this.id_break;
   }
}
