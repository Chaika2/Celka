package celestial;

public class rrJW extends Thread {
   private String class_ = null;
   private rrJn_1 break_ = null;

   public rrJW(String var1, rrJn_1 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public void run() {
      try {
         byte[] var1 = rrJN.break_(this.class_, QY.instanceof_().W());
         this.break_.class_(this.class_, var1, (Throwable)null);
      } catch (Exception var2) {
         this.break_.class_(this.class_, (byte[])null, var2);
      }
   }

   public String class_() {
      return this.class_;
   }

   public rrJn_1 break_() {
      return this.break_;
   }
}
