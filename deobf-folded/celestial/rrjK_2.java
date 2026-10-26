package celestial;

import com.viaversion.viaversion.api.platform.PlatformTask;
import com.viaversion.viaversion.api.scheduler.Task;
import com.viaversion.viaversion.api.scheduler.TaskStatus;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjK_2 implements PlatformTask<Task> {
   public Object[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   public rrjK_2(Task var1) {
      this.id_byte();
      this.id_class[id_break[0]] = var1;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{7, -110, -98, -83, -112, 59, -116, -88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1141806813;
   }

   public Task id_class() {
      return (Task)this.id_class[id_break[1]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3127860476658874101L;
   }

   public void cancel() {
      ((Task)this.id_class[id_break[2]]).cancel();
   }

   public TaskStatus id_break() {
      return this.id_class().status();
   }

   private static void id_throws() {
      id_break = new short[3];
   }

   private static void id_protected() {
      id_byte = new boolean[]{true};
   }
}
