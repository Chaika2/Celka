package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bj_1 extends Bn_1 implements By_1 {
   private static String[] id_protected;
   public Object[] id_byte;
   private static short[] id_throws;
   private static boolean[] id_case;

   public Bj_1() {
      super(id_protected[0], (Pattern[])Bl_1.id_class[20]);
      this.id_finally();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5374855508433179389L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 490764782;
   }

   @Override
   public String id_class() {
      this.id_finally();
      return (BV)this.id_byte[id_throws[4]] == null ? null : ((BV)this.id_byte[id_throws[5]]).id_class();
   }

   @Override
   public void id_throws(String var1) {
      this.id_finally();
      super.id_throws(var1);
      BV var6 = BV.id_break(var1);
      this.id_byte[id_throws[1]] = var6;
      if ((BV)this.id_byte[id_throws[2]] != null) {
         this.id_protected(((BV)this.id_byte[id_throws[3]]).id_class() + " " + this.id_throws().toLowerCase());
      }
   }

   private void id_finally() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
         Object[] var1 = this.id_byte;
      }
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{66, 50, -67, 87, -42, 3, 12, 66}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_catch() {
      id_case = new boolean[]{true};
   }

   private static void id_implements() {
      id_throws = new short[]{20, 0, 0, 0, 0, 0};
   }

   private static void id_private() {
      id_protected = new String[]{new String("Алтарь")};
   }
}
