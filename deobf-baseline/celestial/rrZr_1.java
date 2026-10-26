package celestial;

import discord.DiscordUser;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZr_1 {
   public Object[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;

   public String id_byte() {
      return (String)this.id_class[id_protected[5]];
   }

   public rrZr_1(String var1, String var2) {
      this.id_private();
      this.id_class[id_protected[0]] = var1;
      this.id_class[id_protected[1]] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return id_break[0];
      } else if (!(var1 instanceof rrZr_1 var2)) {
         return id_break[1];
      } else if (!var2.id_class(this)) {
         return id_break[2];
      } else {
         String var3 = this.id_break();
         String var4 = var2.id_break();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.id_protected();
            String var6 = var2.id_protected();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               DiscordUser var7 = this.id_class();
               DiscordUser var8 = var2.id_class();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  String var9 = this.id_byte();
                  String var10 = var2.id_byte();
                  return (var9 == null ? var10 == null : var9.equals(var10)) ? id_break[7] : id_break[6];
               } else {
                  return id_break[5];
               }
            } else {
               return id_break[4];
            }
         } else {
            return id_break[3];
         }
      }
   }

   @Override
   public String toString() {
      return "UserData(username="
         + this.id_break()
         + ", id="
         + this.id_protected()
         + ", discordUser="
         + this.id_class()
         + ", avatarURL="
         + this.id_byte()
         + ")";
   }

   @Override
   public int hashCode() {
      byte var1 = id_byte[0];
      int var2 = id_break[8];
      String var3 = this.id_break();
      var2 = var2 * id_byte[1] + (var3 == null ? id_byte[2] : var3.hashCode());
      String var4 = this.id_protected();
      var2 = var2 * id_byte[3] + (var4 == null ? id_byte[4] : var4.hashCode());
      DiscordUser var5 = this.id_class();
      var2 = var2 * id_byte[5] + (var5 == null ? id_byte[6] : var5.hashCode());
      String var6 = this.id_byte();
      return var2 * id_byte[7] + (var6 == null ? id_byte[8] : var6.hashCode());
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -975374686;
   }

   public void id_class(DiscordUser var1) {
      this.id_class[id_protected[6]] = var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6472668049888989468L;
   }

   public DiscordUser id_class() {
      return (DiscordUser)this.id_class[id_protected[4]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-10, 30, 85, -100, 100, -80, -72, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_class(Object var1) {
      return var1 instanceof rrZr_1;
   }

   public String id_break() {
      return (String)this.id_class[id_protected[2]];
   }

   public void id_break(String var1) {
      this.id_class[id_protected[7]] = var1;
   }

   private static void id_throws() {
      id_byte = new byte[]{59, 59, 43, 59, 43, 59, 43, 59, 43, 4};
   }

   private static void id_catch() {
      id_protected = new short[]{0, 1, 0, 1, 2, 3, 2, 3};
   }

   private static void id_case() {
      id_break = new boolean[]{true, false, false, false, false, false, false, true, true};
   }

   public String id_protected() {
      return (String)this.id_class[id_protected[3]];
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[9]];
         Object[] var1 = this.id_class;
      }
   }
}
