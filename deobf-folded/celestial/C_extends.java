package celestial;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_extends<T> {
   public Object[] id_class;
   private static String[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;

   public Class<T> id_byte() {
      return (Class<T>)Pc_1.id_class(this.id_throws());
   }

   C_extends(T var1, Object var2) {
      this.id_case();
      this.id_class[3] = var1;
      if (var2 == null) {
         throw new IllegalArgumentException(id_break[0]);
      } else {
         this.id_class[id_protected[1]] = var2;
         this.id_class[1] = var2;
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return Pd_1.id_byte(this);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5238987723454656838L;
   }

   @Deprecated
   public T id_class() {
      return (T)this.id_class[id_protected[3]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1181783720;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{5, -20, -66, -87, -59, 24, 113, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_break() {
      Object var5 = this.id_class[1];
      this.id_class[id_protected[6]] = var5;
   }

   public Type id_throws() {
      return (Type)((Map)((C_private)this.id_class[3]).Pj[2]).get(this);
   }

   private static void id_catch() {
      id_protected = new short[]{3, 0, 1, 0, 2, 1, 0, 3, 2};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_implements() {
      id_break = new String[]{new String("Cannot determine value type class from null")};
   }

   public String id_protected() {
      return (String)this.id_class[2];
   }

   private static void id_private() {
      id_byte = new byte[]{4};
   }
}
