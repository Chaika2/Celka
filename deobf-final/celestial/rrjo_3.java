package celestial;

import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjo_3 extends Logger {
   private static short[] break_;
   public Object[] class_;
   private static String[] byte_;
   private static boolean[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public rrjo_3(org.apache.logging.log4j.Logger var1) {
      super("logger", null);
      this.byte_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public void log(Level var1, String var2, Object[] var3) {
      this.log(var1, MessageFormat.format(var2, var3));
   }

   @Override
   public void log(Level var1, String var2) {
      if (var1 == Level.FINE) {
         ((org.apache.logging.log4j.Logger)this.class_[0]).debug(var2);
      } else if (var1 == Level.WARNING) {
         ((org.apache.logging.log4j.Logger)this.class_[0]).warn(var2);
      } else if (var1 == Level.SEVERE) {
         ((org.apache.logging.log4j.Logger)this.class_[0]).error(var2);
      } else if (var1 == Level.INFO) {
         ((org.apache.logging.log4j.Logger)this.class_[0]).info(var2);
      } else {
         ((org.apache.logging.log4j.Logger)this.class_[0]).trace(var2);
      }
   }

   @Override
   public void log(LogRecord var1) {
      this.log(var1.getLevel(), var1.getMessage());
   }

   @Override
   public void log(Level var1, String var2, Object var3) {
      if (var1 == Level.FINE) {
         ((org.apache.logging.log4j.Logger)this.class_[0]).debug(var2, var3);
      } else if (var1 == Level.WARNING) {
         ((org.apache.logging.log4j.Logger)this.class_[0]).warn(var2, var3);
      } else if (var1 == Level.SEVERE) {
         ((org.apache.logging.log4j.Logger)this.class_[0]).error(var2, var3);
      } else if (var1 == Level.INFO) {
         ((org.apache.logging.log4j.Logger)this.class_[0]).info(var2, var3);
      } else {
         ((org.apache.logging.log4j.Logger)this.class_[0]).trace(var2, var3);
      }
   }

   @Override
   public void log(Level var1, String var2, Throwable var3) {
      if (var1 == Level.FINE) {
         ((org.apache.logging.log4j.Logger)this.class_[0]).debug(var2, var3);
      } else if (var1 == Level.WARNING) {
         ((org.apache.logging.log4j.Logger)this.class_[0]).warn(var2, var3);
      } else if (var1 == Level.SEVERE) {
         ((org.apache.logging.log4j.Logger)this.class_[0]).error(var2, var3);
      } else if (var1 == Level.INFO) {
         ((org.apache.logging.log4j.Logger)this.class_[0]).info(var2, var3);
      } else {
         ((org.apache.logging.log4j.Logger)this.class_[0]).trace(var2, var3);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -110, 82, -49, -61, -53, 121, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1360812226;
   }

   private static void class_() {
      break_ = new short[16];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6316665583617706706L;
   }

   private static void break_() {
      byte_ = new String[]{new String("logger")};
   }

   private static void protected_() {
      protected_ = new boolean[]{true};
   }
}
