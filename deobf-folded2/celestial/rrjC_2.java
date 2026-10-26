package celestial;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjC_2 {
   private static short[] id_byte;
   private static String[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_case;
   public static Object[] id_class;
   public Object[] id_break;

   public rrjH_2 id_byte() {
      return (rrjH_2)this.id_break[1];
   }

   public rrjC_2() {
      this.id_finally();
      rrjn_3.id_break().id_class(new File("ViaVersion")).id_class(754).id_class();
      List var1 = ProtocolVersion.getProtocols()
         .stream()
         .filter(var0 -> var0.getVersion() != 47 && var0.getVersion() < 107 ? id_case[2] : id_case[1])
         .sorted((var0, var1x) -> Integer.compare(var1x.getVersion(), var0.getVersion()))
         .toList();
      ArrayList var6 = new ArrayList(var1.size() + 1);
      this.id_break[0] = var6;
      ((List)this.id_break[0]).addAll(var1);
   }

   static {
      ntfClinit();
   }

   public void id_class(List<ProtocolVersion> var1) {
      this.id_class(var1, 5, 5, 110, 20);
   }

   public void id_class(List<ProtocolVersion> var1, int var2, int var3, int var4, int var5) {
      rrjH_2 var10 = new rrjH_2(var1, var2, var3, Math.max(var4, 110), var5);
      this.id_break[1] = var10;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8816671734484610161L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, -124, -80, -52, 71, -114, -34, 96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public List<ProtocolVersion> id_class() {
      return (List<ProtocolVersion>)this.id_break[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2103792258;
   }

   public static void id_break() {
      if ((rrjC_2)id_class[1] == null) {
         rrjC_2 var4 = new rrjC_2();
         id_class[1] = var4;
      }
   }

   private static void id_throws() {
      id_throws = new byte[]{5, 5, 110, 20, 110, 47, 107, 2, 2};
   }

   private void id_finally() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{754, null};
      id_class = var0;
   }

   private static void id_case() {
      id_case = new boolean[]{true, true, false, false};
   }

   private static void id_implements() {
      id_protected = new String[]{new String("ViaVersion")};
   }

   public static rrjC_2 id_protected() {
      return (rrjC_2)id_class[1];
   }

   private static void id_private() {
      id_byte = new short[]{754, 0, 0, 1, 1, 1, 1, 0, 1, 754};
   }
}
