package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqA_2 {
   private static boolean[] id_break;
   private static float[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;
   public Object[] id_class;

   public float id_byte() {
      return ((AnimValue)this.id_class[id_throws[4]]).id_byte();
   }

   public rrqA_2(ArrayListHud var1, Module var2) {
      this.id_finally();
      AnimValue var7 = new AnimValue(id_byte[0], id_break[0]);
      this.id_class[id_throws[0]] = var7;
      this.id_class[id_throws[1]] = var2;
      this.id_break(((rrIk_1)var1.id_byte[id_throws[2]]).id_class());
   }

   static {
      ntfClinit();
   }

   public void id_class(boolean var1) {
      ((AnimValue)this.id_class[id_throws[3]]).id_class(var1);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-111, 29, 104, 126, 56, 61, -46, -7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8050041298561751338L;
   }

   public AnimValue id_class() {
      return (AnimValue)this.id_class[id_throws[12]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 464604593;
   }

   public Module id_break() {
      return (Module)this.id_class[id_throws[11]];
   }

   public void id_break(boolean var1) {
      String var6 = var1 ? ((Module)this.id_class[id_throws[5]]).aH_() : ((Module)this.id_class[id_throws[6]]).id_extends();
      this.id_class[id_throws[7]] = var6;
      Float var7 = (float)((int)Math.ceil((double)((rrZO)ArrayListHud.id_break[id_throws[8]]).id_break((String)this.id_class[id_throws[9]])));
      this.id_class[id_throws[10]] = var7;
   }

   public String id_throws() {
      return (String)this.id_class[id_throws[13]];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         this.id_class[3] = 0.0F;
      }
   }

   private static void id_catch() {
      id_protected = new byte[]{4, 3};
   }

   private static void id_case() {
      id_break = new boolean[1];
   }

   private static void id_implements() {
      id_byte = new float[]{0.4F, 0.0F};
   }

   public float id_protected() {
      return (Float)this.id_class[id_throws[14]];
   }

   private static void id_private() {
      id_throws = new short[]{1, 0, 7, 1, 1, 0, 0, 2, 1, 2, 3, 0, 1, 2, 3};
   }
}
