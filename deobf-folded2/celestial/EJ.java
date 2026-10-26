package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EJ implements F {
   public Object[] id_class;
   private static String[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;

   @Override
   public Stream<String> id_byte(String var1) {
      rqj_3 var2 = id_class(var1, true);
      String var3 = (String)var2.id_class();
      List var4 = (List)var2.id_break();
      return var4.isEmpty() ? new v_1().id_class(((C_class)this.id_class[1]).S()).id_class(var3).id_protected() : this.id_class(var2);
   }

   private static void id_byte() {
      id_byte = new boolean[]{true, false, true, false, false};
   }

   private Ex_1 id_byte(rqj_3<String, List<C_import>> var1) {
      String var2 = (String)var1.id_class();
      sS_2 var3 = new sS_2(this, (List<C_import>)var1.id_break());
      C_interface var4 = this.id_break(var2);
      return var4 == null ? null : new Ex_1(var4, var2, var3);
   }

   public EJ(C_class var1) {
      this.id_protected();
      L var6 = new L();
      this.id_class[0] = var6;
      this.id_class[1] = var1;
      sz_3.id_class(var1).forEach(((L)this.id_class[0])::id_break);
   }

   static {
      ntfClinit();
   }

   @Override
   public L<C_interface> id_class() {
      return (L<C_interface>)this.id_class[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7227880040710539243L;
   }

   private static rqj_3<String, List<C_import>> id_class(String var0, boolean var1) {
      String var2 = var0.split("\\s", 2)[0];
      List var3 = sG_2.id_class(var0.substring(var2.length()), var1);
      return new rqj_3<>(var2, var3);
   }

   @Override
   public Stream<String> id_class(rqj_3<String, List<C_import>> var1) {
      Ex_1 var2 = this.id_byte(var1);
      return var2 == null ? Stream.empty() : var2.id_protected();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1858070598;
   }

   @Override
   public boolean id_class(String var1) {
      return this.id_break(id_throws(var1));
   }

   @Override
   public C_interface id_break(String var1) {
      for (C_interface var3 : (Collection)((L)this.id_class[0]).id_class[2]) {
         if (var3.id_break().contains(var1.toLowerCase(Locale.US))) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public C_case id_break() {
      return (C_class)this.id_class[1];
   }

   @Override
   public boolean id_break(rqj_3<String, List<C_import>> var1) {
      Ex_1 var2 = this.id_byte(var1);
      if (var2 != null) {
         var2.id_case();
      }

      return var2 != null ? true : id_byte[1];
   }

   public static rqj_3<String, List<C_import>> id_throws(String var0) {
      return id_class(var0, false);
   }

   private static void id_throws() {
      id_throws = new byte[]{2, 2};
   }

   private static void id_catch() {
      id_protected = new short[]{0, 1, 0, 1, 0, 0, 2, 1};
   }

   private static void id_case() {
      id_break = new String[]{new String("\\s")};
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-49, 42, 38, -83, 100, -78, 126, -13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }
}
