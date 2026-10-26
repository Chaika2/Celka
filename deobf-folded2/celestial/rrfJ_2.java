package celestial;

import com.google.gson.annotations.SerializedName;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfJ_2 {
   @SerializedName("displayName")
   private String id_break;
   private static boolean[] id_byte;
   @SerializedName("itemNBT")
   private String id_protected;
   private static byte[] id_throws;
   private static short[] id_case;
   private static String[] id_catch;
   public Object[] id_class;
   @SerializedName("itemId")
   private int id_private;

   public rgP_2 id_byte() {
      if ((rgP_2)this.id_class[2] == null) {
         rVi_1 var5 = rgB_2.id_class(this.id_break);
         this.id_class[2] = var5;
      }

      return (rgP_2)this.id_class[2];
   }

   public rrfJ_2() {
      this.id_private();
   }

   public rrfJ_2(String var1, String var2, int var3) {
      this.id_private();
      this.id_break = var1;
      this.id_private = var3;
      this.id_protected = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3935448370289113975L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -170841251;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{21, -105, 8, -42, -35, -80, -23, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrfJ_2 id_class(rdn_3 var0) {
      String var1 = rgB_2.id_class(var0.id_continue());
      rcd_3 var2 = var0.id_package();
      rcd_3 var3 = var2.id_int("display");
      if (var3.id_byte("Lore") instanceof rcy_3 var5) {
         for (int var6 = 0; var6 < var5.size(); var6++) {
            rVi_1 var7 = rgB_2.id_class(var5.id_implements(var6));
            if (var7.getString().isEmpty()) {
               var5.subList(var6, var5.size()).clear();
               break;
            }
         }
      }

      String var8 = var2.toString();
      int var9 = rVL.id_for.id_class(var0.id_break());
      return new rrfJ_2(var1, var8, var9);
   }

   public rdn_3 id_class() {
      if ((rdn_3)this.id_class[0] == null) {
         rdn_3 var1 = new rdn_3(rVL.id_for.id_class(this.id_private));

         try {
            var1.id_byte(rcH_2.id_class(this.id_protected));
         } catch (CommandSyntaxException var10) {
            var10.printStackTrace();
         }

         rdn_3 var7 = var1.id_implements();
         this.id_class[0] = var7;
         rdn_3 var8 = ((rdn_3)this.id_class[0]).id_implements();
         this.id_class[1] = var8;
      }

      if (((rdn_3)this.id_class[0]).id_class()) {
         rdn_3 var9 = ((rdn_3)this.id_class[1]).id_implements();
         this.id_class[0] = var9;
      }

      return (rdn_3)this.id_class[0];
   }

   public rcd_3 id_break() {
      if ((rcd_3)this.id_class[3] == null) {
         try {
            rcd_3 var6 = rcH_2.id_class(this.id_protected);
            this.id_class[id_case[4]] = var6;
         } catch (CommandSyntaxException var7) {
            var7.printStackTrace();
         }
      }

      return (rcd_3)this.id_class[3];
   }

   private static void id_throws() {
      id_byte = new boolean[1];
   }

   private static void id_catch() {
      id_case = new short[]{2, 2, 2, 3, 3, 3, 0, 0, 0, 1, 0, 1, 0, 0};
   }

   private static void id_case() {
      id_catch = new String[]{new String("display"), new String("Lore")};
   }

   private static void id_protected() {
      id_throws = new byte[]{4};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
      }
   }
}
