package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum PK {
   private static String[] strings6a264fee257833ddb403077ab7e90d84;
   private static short[] shorts6a264fee257833ddb403077ab7e90d84;
   public static Object[] staticFields6a264fee257833ddb403077ab7e90d84;
   private static byte[] bytes6a264fee257833ddb403077ab7e90d84;
   private static boolean[] booleans6a264fee257833ddb403077ab7e90d84;
   public Object[] fields6a264fee257833ddb403077ab7e90d84;

   public boolean id_byte() {
      return this == (PK)staticFields6a264fee257833ddb403077ab7e90d84[4] ? true : booleans6a264fee257833ddb403077ab7e90d84[5];
   }

   private PK(String var3) {
      this.id_extends();
      this.fields6a264fee257833ddb403077ab7e90d84[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2383672871355155011L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{21, 111, 22, 1, -4, -42, -40, -41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_class() {
      return (String)this.fields6a264fee257833ddb403077ab7e90d84[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -626818968;
   }

   public boolean id_break() {
      return this != (PK)staticFields6a264fee257833ddb403077ab7e90d84[6] ? true : booleans6a264fee257833ddb403077ab7e90d84[1];
   }

   public boolean id_throws() {
      return this == (PK)staticFields6a264fee257833ddb403077ab7e90d84[5] ? true : booleans6a264fee257833ddb403077ab7e90d84[7];
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{
         new PK("СолоЛайт"), new PK("ДуоЛайт"), new PK("ТриоЛайт"), new PK("КланЛайт"), new PK("Лайт120"), new PK("Классик"), new PK("Лобби"), null, null
      };
      var0[7] = new PK[]{(PK)var0[0], (PK)var0[1], (PK)var0[2], (PK)var0[3], (PK)var0[4], (PK)var0[5], (PK)var0[6]};
      var0[8] = new PK[]{(PK)var0[0], (PK)var0[1], (PK)var0[2], (PK)var0[3], (PK)var0[4], (PK)var0[5], (PK)var0[6]};
      staticFields6a264fee257833ddb403077ab7e90d84 = var0;
   }

   private static void id_catch() {
      shorts6a264fee257833ddb403077ab7e90d84 = new short[]{8, 6, 0, 1, 2, 3, 4, 5, 0, 0, 0, 1, 2, 3, 4, 5, 6};
   }

   private void id_extends() {
      if (this.fields6a264fee257833ddb403077ab7e90d84 == null) {
         this.fields6a264fee257833ddb403077ab7e90d84 = new Object[1];
         Object[] var1 = this.fields6a264fee257833ddb403077ab7e90d84;
      }
   }

   private static void id_implements() {
      strings6a264fee257833ddb403077ab7e90d84 = new String[]{
         new String("SOLO_LITE"),
         new String("СолоЛайт"),
         new String("DUO_LITE"),
         new String("ДуоЛайт"),
         new String("TRIO_LITE"),
         new String("ТриоЛайт"),
         new String("CLAN_LITE"),
         new String("КланЛайт"),
         new String("LITE_120"),
         new String("Лайт120"),
         new String("CLASSIC"),
         new String("Классик"),
         new String("LOBBY"),
         new String("Лобби")
      };
   }

   public boolean id_protected() {
      return this != (PK)staticFields6a264fee257833ddb403077ab7e90d84[0]
            && this != (PK)staticFields6a264fee257833ddb403077ab7e90d84[1]
            && this != (PK)staticFields6a264fee257833ddb403077ab7e90d84[2]
            && this != (PK)staticFields6a264fee257833ddb403077ab7e90d84[3]
         ? booleans6a264fee257833ddb403077ab7e90d84[3]
         : booleans6a264fee257833ddb403077ab7e90d84[2];
   }

   private static void id_private() {
      booleans6a264fee257833ddb403077ab7e90d84 = new boolean[]{true, false, true, false, true, false, true, false, false, true, false, false, true, true, true};
   }

   private static void id_native() {
      bytes6a264fee257833ddb403077ab7e90d84 = new byte[]{7, 2, 3, 4, 5, 6, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 8, 7, 9};
   }
}
