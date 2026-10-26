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
   private static String[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   public void id_byte() {
      try {
         JsonObject var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[10]]).id_break().id_break(this.id_throws()).getAsJsonObject();
         if (var1 == null) {
            return;
         }

         if (var1.has(id_break[4])) {
            this.id_byte(var1.get(id_break[5]).getAsString());
         }

         if (var1.has(id_break[6])) {
            this.id_break(var1.get(id_break[7]).getAsString());
         }
      } catch (Exception var2) {
      }
   }

   public void id_byte(String var1) {
      this.id_class[1] = var1;
   }

   public rrIX(String var1) {
      this.id_case();
      this.id_class[0] = var1;
      String var8 = ((rrZr_1)rrQJ.id_class[5]).id_break();
      this.id_class[1] = var8;
      String var9 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
      this.id_class[2] = var9;
      File var10 = new File(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_break().id_class("configs"), var1 + ".celka");
      this.id_class[3] = var10;
      if (!((File)this.id_class[3]).exists()) {
         try {
            ((File)this.id_class[id_protected[7]]).createNewFile();
         } catch (IOException var11) {
            var11.printStackTrace();
         }
      }
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7420641369065308314L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, 41, -123, -68, 69, -5, -35, 83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -908009999;
   }

   public String id_class() {
      return (String)this.id_class[0];
   }

   @Override
   public void id_class(JsonObject var1) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_catch().id_byte().forEach(var1x -> var1x.id_class(var1));
   }

   @Override
   public void id_break(JsonObject var1) {
      var1.addProperty("author", this.id_protected());
      var1.addProperty("created", this.id_break());
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_catch().id_byte().forEach(var1x -> var1x.id_break(var1));
   }

   public String id_break() {
      return (String)this.id_class[2];
   }

   public void id_break(String var1) {
      this.id_class[2] = var1;
   }

   public File id_throws() {
      return (File)this.id_class[3];
   }

   private static void id_catch() {
      id_protected = new short[]{0, 5, 1, 2, 0, 3, 3, 3, 0, 0, 0, 0, 1, 2, 3, 0, 0, 0, 3, 1, 2};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_implements() {
      id_byte = new byte[]{4};
   }

   public void id_protected(String var1) {
      File var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_break().id_class("configs");
      File var3 = new File(var2, (String)this.id_class[0] + ".celka");
      File var4 = new File(var2, var1 + ".celka");
      if (var3.exists() && var3.renameTo(var4)) {
         this.id_class[0] = var1;
      }

      this.id_class[3] = var4;
   }

   public String id_protected() {
      return (String)this.id_class[1];
   }

   private static void id_private() {
      id_break = new String[]{
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
