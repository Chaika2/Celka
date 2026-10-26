package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_byte implements C_catch {
   public Object[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;

   @Override
   public C_char id_byte() {
      return (SK)SK.staticFields84fbf20de4d13027acc13a6866788039[id_byte[7]];
   }

   public C_byte() {
      this.id_finally();
      C_class var5 = new C_class();
      this.id_class[id_byte[0]] = var5;
      List var6 = Collections.singletonList((C_class)this.id_class[id_byte[1]]);
      this.id_class[id_byte[2]] = var6;
      new SD((C_class)this.id_class[id_byte[3]]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3369204341062574843L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -91, 43, -77, 114, 122, -2, 81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1145238131;
   }

   @Override
   public rt_3 id_class() {
      return (MG)MG.staticFields4592673f607b3ff2b69d116fa51286d2[id_byte[8]];
   }

   @Override
   public C_case id_break() {
      return (C_class)this.id_class[id_byte[4]];
   }

   @Override
   public C_goto id_throws() {
      return (So_1)So_1.staticFields4d15df505e473c14b11aa564ea558cfe[id_byte[6]];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_extends() {
      id_byte = new short[]{0, 0, 1, 0, 0, 1, 0, 0, 0, 0};
   }

   @Override
   public List<C_case> id_case() {
      return (List<C_case>)this.id_class[id_byte[5]];
   }

   private static void id_implements() {
      id_break = new byte[]{2};
   }

   public C_class id_protected() {
      return (C_class)this.id_class[id_byte[9]];
   }
}
