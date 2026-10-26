package celestial;

import com.google.gson.annotations.SerializedName;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfJ_2 {
   @SerializedName("displayName")
   private String break_;
   private static boolean[] byte_;
   @SerializedName("itemNBT")
   private String protected_;
   private static byte[] throws_;
   private static short[] case_;
   private static String[] catch_;
   public Object[] class_;
   @SerializedName("itemId")
   private int private_;

   public rgP_2 byte_() {
      if ((rgP_2)this.class_[2] == null) {
         rVi_1 var5 = rgB_2.class_(this.break_);
         this.class_[2] = var5;
      }

      return (rgP_2)this.class_[2];
   }

   public rrfJ_2() {
      this.private_();
   }

   public rrfJ_2(String var1, String var2, int var3) {
      this.private_();
      this.break_ = var1;
      this.private_ = var3;
      this.protected_ = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3935448370289113975L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -170841251;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{21, -105, 8, -42, -35, -80, -23, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrfJ_2 class_(rdn_3 var0) {
      String var1 = rgB_2.class_(var0.continue_());
      rcd_3 var2 = var0.package_();
      rcd_3 var3 = var2.int_("display");
      if (var3.byte_("Lore") instanceof rcy_3 var5) {
         for (int var6 = 0; var6 < var5.size(); var6++) {
            rVi_1 var7 = rgB_2.class_(var5.implements_(var6));
            if (var7.getString().isEmpty()) {
               var5.subList(var6, var5.size()).clear();
               break;
            }
         }
      }

      String var8 = var2.toString();
      int var9 = rVL.for_.class_(var0.break_());
      return new rrfJ_2(var1, var8, var9);
   }

   public rdn_3 class_() {
      if ((rdn_3)this.class_[0] == null) {
         rdn_3 var1 = new rdn_3(rVL.for_.class_(this.private_));

         try {
            var1.byte_(rcH_2.class_(this.protected_));
         } catch (CommandSyntaxException var10) {
            var10.printStackTrace();
         }

         rdn_3 var7 = var1.implements_();
         this.class_[0] = var7;
         rdn_3 var8 = ((rdn_3)this.class_[0]).implements_();
         this.class_[1] = var8;
      }

      if (((rdn_3)this.class_[0]).class_()) {
         rdn_3 var9 = ((rdn_3)this.class_[1]).implements_();
         this.class_[0] = var9;
      }

      return (rdn_3)this.class_[0];
   }

   public rcd_3 break_() {
      if ((rcd_3)this.class_[3] == null) {
         try {
            rcd_3 var6 = rcH_2.class_(this.protected_);
            this.class_[case_[4]] = var6;
         } catch (CommandSyntaxException var7) {
            var7.printStackTrace();
         }
      }

      return (rcd_3)this.class_[3];
   }

   private static void throws_() {
      byte_ = new boolean[1];
   }

   private static void catch_() {
      case_ = new short[]{2, 2, 2, 3, 3, 3, 0, 0, 0, 1, 0, 1, 0, 0};
   }

   private static void case_() {
      catch_ = new String[]{new String("display"), new String("Lore")};
   }

   private static void protected_() {
      throws_ = new byte[]{4};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
      }
   }
}
