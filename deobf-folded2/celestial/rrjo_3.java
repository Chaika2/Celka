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
   private static short[] id_break;
   public Object[] id_class;
   private static String[] id_byte;
   private static boolean[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   public rrjo_3(org.apache.logging.log4j.Logger var1) {
      super("logger", null);
      this.id_byte();
      this.id_class[0] = var1;
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
         ((org.apache.logging.log4j.Logger)this.id_class[0]).debug(var2);
      } else if (var1 == Level.WARNING) {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).warn(var2);
      } else if (var1 == Level.SEVERE) {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).error(var2);
      } else if (var1 == Level.INFO) {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).info(var2);
      } else {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).trace(var2);
      }
   }

   @Override
   public void log(LogRecord var1) {
      this.log(var1.getLevel(), var1.getMessage());
   }

   @Override
   public void log(Level var1, String var2, Object var3) {
      if (var1 == Level.FINE) {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).debug(var2, var3);
      } else if (var1 == Level.WARNING) {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).warn(var2, var3);
      } else if (var1 == Level.SEVERE) {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).error(var2, var3);
      } else if (var1 == Level.INFO) {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).info(var2, var3);
      } else {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).trace(var2, var3);
      }
   }

   @Override
   public void log(Level var1, String var2, Throwable var3) {
      if (var1 == Level.FINE) {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).debug(var2, var3);
      } else if (var1 == Level.WARNING) {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).warn(var2, var3);
      } else if (var1 == Level.SEVERE) {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).error(var2, var3);
      } else if (var1 == Level.INFO) {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).info(var2, var3);
      } else {
         ((org.apache.logging.log4j.Logger)this.id_class[0]).trace(var2, var3);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -110, 82, -49, -61, -53, 121, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1360812226;
   }

   private static void id_class() {
      id_break = new short[16];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6316665583617706706L;
   }

   private static void id_break() {
      id_byte = new String[]{new String("logger")};
   }

   private static void id_protected() {
      id_protected = new boolean[]{true};
   }
}
