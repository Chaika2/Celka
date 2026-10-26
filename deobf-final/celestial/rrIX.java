package celestial;

import com.google.gson.JsonObject;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIX implements rrwj_3 {
   private static String[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   public Object[] class_;

   public void byte_() {
      try {
         JsonObject var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[protected_[10]]).break_().break_(this.throws_()).getAsJsonObject();
         if (var1 == null) {
            return;
         }

         if (var1.has(break_[4])) {
            this.byte_(var1.get(break_[5]).getAsString());
         }

         if (var1.has(break_[6])) {
            this.break_(var1.get(break_[7]).getAsString());
         }
      } catch (Exception var2) {
      }
   }

   public void byte_(String var1) {
      this.class_[1] = var1;
   }

   public rrIX(String var1) {
      this.case_();
      this.class_[0] = var1;
      String var8 = ((rrZr_1)rrQJ.class_[5]).break_();
      this.class_[1] = var8;
      String var9 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
      this.class_[2] = var9;
      File var10 = new File(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_("configs"), var1 + ".celka");
      this.class_[3] = var10;
      if (!((File)this.class_[3]).exists()) {
         try {
            ((File)this.class_[protected_[7]]).createNewFile();
         } catch (IOException var11) {
            var11.printStackTrace();
         }
      }
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7420641369065308314L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, 41, -123, -68, 69, -5, -35, 83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -908009999;
   }

   public String class_() {
      return (String)this.class_[0];
   }

   @Override
   public void class_(JsonObject var1) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).catch_().byte_().forEach(var1x -> var1x.class_(var1));
   }

   @Override
   public void break_(JsonObject var1) {
      var1.addProperty("author", this.protected_());
      var1.addProperty("created", this.break_());
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).catch_().byte_().forEach(var1x -> var1x.break_(var1));
   }

   public String break_() {
      return (String)this.class_[2];
   }

   public void break_(String var1) {
      this.class_[2] = var1;
   }

   public File throws_() {
      return (File)this.class_[3];
   }

   private static void catch_() {
      protected_ = new short[]{0, 5, 1, 2, 0, 3, 3, 3, 0, 0, 0, 0, 1, 2, 3, 0, 0, 0, 3, 1, 2};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   private static void implements_() {
      byte_ = new byte[]{4};
   }

   public void protected_(String var1) {
      File var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_("configs");
      File var3 = new File(var2, (String)this.class_[0] + ".celka");
      File var4 = new File(var2, var1 + ".celka");
      if (var3.exists() && var3.renameTo(var4)) {
         this.class_[0] = var1;
      }

      this.class_[3] = var4;
   }

   public String protected_() {
      return (String)this.class_[1];
   }

   private static void private_() {
      break_ = new String[]{
         new String("dd.MM.yyyy"),
         new String("configs"),
         new String("author"),
         new String("created"),
         new String("author"),
         new String("author"),
         new String("created"),
         new String("created"),
         new String("configs")
      };
   }
}
