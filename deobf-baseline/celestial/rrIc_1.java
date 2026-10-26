package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIc_1 extends Setting<Boolean> implements rrtf_3<rrIk_1> {
   public Object[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;

   public rrIc_1(String var1, rrIk_1... var2) {
      super(var1, id_byte[0]);
      this.id_volatile();
      rrIu_1 var7 = (rrIu_1)rrIu_1.staticFields10847edfe142316aa094e53a68b36f7b[id_protected[0]];
      this.id_break[id_protected[1]] = var7;
      this.id_class[id_protected[2]] = var1;
      List var9 = Arrays.asList(var2);
      this.id_break[id_protected[3]] = var9;
   }

   public rrIc_1(String var1, List<rrIk_1> var2) {
      super(var1, id_byte[1]);
      this.id_volatile();
      rrIu_1 var7 = (rrIu_1)rrIu_1.staticFields10847edfe142316aa094e53a68b36f7b[id_protected[4]];
      this.id_break[id_protected[5]] = var7;
      this.id_class[id_protected[6]] = var1;
      this.id_break[id_protected[7]] = var2;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -632115390;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8352234045539757421L;
   }

   @Override
   public List<rrIk_1> id_class() {
      this.id_volatile();
      return (List<rrIk_1>)this.id_break[id_protected[9]];
   }

   public rrIc_1 id_class(rrIu_1 var1) {
      this.id_volatile();
      this.id_break[id_protected[11]] = var1;
      return this;
   }

   @Override
   public Setting<?> id_break() {
      return this;
   }

   public boolean id_finally() {
      this.id_volatile();
      return ((List)this.id_break[id_protected[8]]).stream().anyMatch(rrIk_1::id_class);
   }

   public rrIu_1 id_extends() {
      this.id_volatile();
      return (rrIu_1)this.id_break[id_protected[10]];
   }

   private static void id_package() {
      id_byte = new boolean[2];
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-97, -84, -95, -57, -19, 123, -88, -25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_final() {
      id_throws = new byte[]{2};
   }

   private void id_volatile() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[0]];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_native() {
      id_protected = new short[]{0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1};
   }
}
