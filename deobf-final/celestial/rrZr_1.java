package celestial;

import discord.DiscordUser;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZr_1 {
   public Object[] class_;
   private static boolean[] break_;
   private static byte[] byte_;
   private static short[] protected_;

   public String byte_() {
      return (String)this.class_[3];
   }

   public rrZr_1(String var1, String var2) {
      this.private_();
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof rrZr_1 var2)) {
         return false;
      } else if (!var2.class_(this)) {
         return false;
      } else {
         String var3 = this.break_();
         String var4 = var2.break_();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.protected_();
            String var6 = var2.protected_();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               DiscordUser var7 = this.class_();
               DiscordUser var8 = var2.class_();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  String var9 = this.byte_();
                  String var10 = var2.byte_();
                  return (var9 == null ? var10 == null : var9.equals(var10)) ? break_[7] : break_[6];
               } else {
                  return break_[5];
               }
            } else {
               return break_[4];
            }
         } else {
            return break_[3];
         }
      }
   }

   @Override
   public String toString() {
      return "UserData(username=" + this.break_() + ", id=" + this.protected_() + ", discordUser=" + this.class_() + ", avatarURL=" + this.byte_() + ")";
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.break_();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.protected_();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      DiscordUser var5 = this.class_();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      String var6 = this.byte_();
      return var2 * 59 + (var6 == null ? 43 : var6.hashCode());
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -975374686;
   }

   public void class_(DiscordUser var1) {
      this.class_[2] = var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6472668049888989468L;
   }

   public DiscordUser class_() {
      return (DiscordUser)this.class_[2];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-10, 30, 85, -100, 100, -80, -72, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean class_(Object var1) {
      return var1 instanceof rrZr_1;
   }

   public String break_() {
      return (String)this.class_[0];
   }

   public void break_(String var1) {
      this.class_[3] = var1;
   }

   private static void throws_() {
      byte_ = new byte[]{59, 59, 43, 59, 43, 59, 43, 59, 43, 4};
   }

   private static void catch_() {
      protected_ = new short[]{0, 1, 0, 1, 2, 3, 2, 3};
   }

   private static void case_() {
      break_ = new boolean[]{true, false, false, false, false, false, false, true, true};
   }

   public String protected_() {
      return (String)this.class_[1];
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }
}
