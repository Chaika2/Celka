package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQm_1 {
   public Object[] id_class;
   private static String[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;

   private static void id_byte() {
      id_break = new String[]{
         new String("e16699bb-2aa8-46da-b5e3-45cbcce29091"),
         new String("https://login.live.com/oauth20_authorize.srf"),
         new String("https://login.live.com/oauth20_token.srf"),
         new String("https://user.auth.xboxlive.com/user/authenticate"),
         new String("https://xsts.auth.xboxlive.com/xsts/authorize"),
         new String("https://api.minecraftservices.com/authentication/login_with_xbox"),
         new String("https://api.minecraftservices.com/minecraft/profile")
      };
   }

   public rrQm_1() {
      this.id_class();
      Integer var5 = 25585;
      this.id_class[id_protected[1]] = var5;
      String var6 = id_break[0];
      this.id_class[1] = var6;
      String var7 = id_break[1];
      this.id_class[2] = var7;
      String var8 = id_break[2];
      this.id_class[3] = var8;
      String var9 = id_break[3];
      this.id_class[4] = var9;
      String var10 = id_break[4];
      this.id_class[5] = var10;
      String var11 = id_break[5];
      this.id_class[6] = var11;
      String var12 = id_break[6];
      this.id_class[7] = var12;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5584003845241526222L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, -88, -74, 0, 26, 106, 87, 32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -429260268;
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[8];
         Object[] var1 = this.id_class;
         var1[id_byte[0]] = Integer.valueOf(id_byte[1]);
      }
   }

   private static void id_break() {
      id_byte = new boolean[2];
   }

   private static void id_throws() {
      id_protected = new short[]{25585, 0, 1, 2, 3, 4, 5, 6, 7};
   }

   private static void id_protected() {
      id_throws = new byte[]{8};
   }
}
