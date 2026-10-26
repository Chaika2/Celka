package celestial;

import java.util.Map;

public class rrJz_1 extends Thread {
   private String id_class;
   private Map id_break;
   private byte[] id_byte;
   private rrJC id_protected;

   public rrJC id_byte() {
      return this.id_protected;
   }

   public rrJz_1(String var1, Map var2, byte[] var3, rrJC var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public void run() {
      try {
         rrJA.id_class(this.id_class, this.id_break, this.id_byte);
         this.id_protected.id_class(this.id_class, this.id_byte, (Throwable)null);
      } catch (Exception var2) {
         this.id_protected.id_class(this.id_class, this.id_byte, var2);
      }
   }

   public String id_class() {
      return this.id_class;
   }

   public byte[] id_break() {
      return this.id_byte;
   }
}
