package celestial;

import java.util.Map;

public class rrJz_1 extends Thread {
   private String class_;
   private Map break_;
   private byte[] byte_;
   private rrJC protected_;

   public rrJC byte_() {
      return this.protected_;
   }

   public rrJz_1(String var1, Map var2, byte[] var3, rrJC var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public void run() {
      try {
         rrJA.class_(this.class_, this.break_, this.byte_);
         this.protected_.class_(this.class_, this.byte_, (Throwable)null);
      } catch (Exception var2) {
         this.protected_.class_(this.class_, this.byte_, var2);
      }
   }

   public String class_() {
      return this.class_;
   }

   public byte[] break_() {
      return this.byte_;
   }
}
