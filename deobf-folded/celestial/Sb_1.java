package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sb_1 extends Bn_1 implements By_1 {
   private static short[] id_protected;
   private static String[] id_throws;
   public Object[] id_byte;
   private static boolean[] id_case;

   public Sb_1() {
      super(id_throws[0], (Pattern[])Bl_1.id_class[19]);
      this.id_finally();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5919368048593481096L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1103593341;
   }

   @Override
   public String id_class() {
      this.id_finally();
      return (SM)this.id_byte[id_protected[4]] == null ? null : ((SM)this.id_byte[id_protected[5]]).id_class();
   }

   @Override
   public void id_throws(String var1) {
      this.id_finally();
      super.id_throws(var1);
      SM var6 = SM.id_break(var1);
      this.id_byte[id_protected[1]] = var6;
      if ((SM)this.id_byte[id_protected[2]] != null) {
         this.id_protected(((SM)this.id_byte[id_protected[3]]).id_class() + " " + this.id_throws().toLowerCase());
      }
   }

   private void id_finally() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
         Object[] var1 = this.id_byte;
      }
   }

   private static void id_catch() {
      id_protected = new short[]{19, 0, 0, 0, 0, 0};
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-123, -115, -37, 13, 124, 74, 57, 54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_implements() {
      id_case = new boolean[]{true};
   }

   private static void id_private() {
      id_throws = new String[]{new String("Вулкан")};
   }
}
